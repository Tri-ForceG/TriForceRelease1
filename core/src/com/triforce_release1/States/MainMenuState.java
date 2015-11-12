package com.triforce_release1.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.triforce_release1.TbMenu;
import com.triforce_release1.TbText;
import com.triforce_release1.TriForceRelease1;

/**
 * Created by Matthew on 11/10/2015.
 */
public class MainMenuState extends TriForceRelease1 implements Screen, InputProcessor {

    TriForceRelease1 triForceRelease1;

    TbMenu tbMenu;
    Stage stage;
    TextButton TbPlay, TbInstruct;

    public MainMenuState(TriForceRelease1 triForceRelease1){ //References the main class.
        this.triForceRelease1=triForceRelease1;
    }
public void create(){
    stage = new Stage();
    tbMenu = new TbMenu();
    Skin skin = tbMenu.getSkin();
    TbPlay = new TbText("Play", skin); // Use the initialized skin
    TbPlay.setPosition(Gdx.graphics.getWidth() / 2 - Gdx.graphics.getWidth() / 8, Gdx.graphics.getHeight() / 3 * 2);
    TbInstruct = new TbText("Instructions", skin);
    TbInstruct.setPosition(Gdx.graphics.getWidth() / 2 - Gdx.graphics.getWidth() / 8, Gdx.graphics.getHeight() / 3);
    stage.addActor(TbPlay);
    stage.addActor(TbInstruct);
    Gdx.input.setInputProcessor(stage);
}
    @Override
    public void show() { //This is called when you set the screen to this class.

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1); //Red background.
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
        if(TbPlay.isPressed()){
            triForceRelease1.setScreen(new PlayState(triForceRelease1));
        }
        //if(Gdx.input.justTouched()){ //If you touch the screen, set the current state to be the play state, which should change screens.
            //triForceRelease1.setScreen(new PlayState(triForceRelease1));
        //}
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() { //This is called when the other screen is displayed.

    }

    @Override
    public void dispose() {

    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
