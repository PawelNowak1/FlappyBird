package com.pablo.gamegame.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class GameStateManager {

    private Stack<State> states;

    public GameStateManager(){
        states = new Stack<State>();
    }

    public void push(State state){              // push - dodaje element na szczyt stosu
        states.push(state);
    }

    public void pop(){                          // pop - usuwa element ze szczytu stosu
        states.pop().dispose();
    }

    public void set(State state){               // jednoczesne usunięcie i dodanie elementu na stos
        states.pop().dispose();
        states.push(state);
    }

    public void update(float dt){
        states.peek().update(dt);               // peek - zwraca element na szczycie stosu
    }

    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }


}
