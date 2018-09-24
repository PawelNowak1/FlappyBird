package com.pablo.gamegame.States;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class State {
    protected OrthographicCamera cam;
    protected Vector3 mouse;
    protected com.pablo.gamegame.States.GameStateManager gsm;

    protected State(com.pablo.gamegame.States.GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();
    }

    public abstract void HandleInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();

}
