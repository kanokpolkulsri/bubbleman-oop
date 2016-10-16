package com.mygdx.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
	private BubbleGame bubbleGame;
	private Texture bubbleImg;
	 
    public GameScreen(BubbleGame bubbleGame) {
        this.bubbleGame = bubbleGame;
        bubbleImg = new Texture("right.png");
    }
    
    @Override
    public void render(float delta) {
    	SpriteBatch batch = bubbleGame.batch;
        batch.begin();
        batch.draw(bubbleImg, 100, 100);
        batch.end();
    }
}
