package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter {
	private BubbleGame bubbleGame;
	private Texture bubbleImg;
	private Bubble bubble;
	World world;
	 
    public GameScreen(BubbleGame bubbleGame) {
        this.bubbleGame = bubbleGame;
        bubbleImg = new Texture("right.png");
        //bubble = new Bubble(100,100);
        world = new World(bubbleGame);
        bubble = world.getBubble();
    }
    
    @Override
    public void render(float delta) {
    	update(delta);
    	Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    	SpriteBatch batch = bubbleGame.batch;
        batch.begin();
        Vector2 pos = bubble.getPosition();
        batch.draw(bubbleImg, pos.x, pos.y);
        batch.end();
    }
    
    private void update(float delta) {
    	if(Gdx.input.isKeyPressed(Keys.UP)) {
            bubble.move(Bubble.DIRECTION_UP);
    	}
    	if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            bubble.move(Bubble.DIRECTION_RIGHT);
    	}
    	if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            bubble.move(Bubble.DIRECTION_LEFT);
    	}
    	if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            bubble.move(Bubble.DIRECTION_DOWN);
    	}
    }
    
}
