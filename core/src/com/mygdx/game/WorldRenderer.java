package com.mygdx.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	private BubbleGame bubbleGame;
	private World world;
	private SpriteBatch batch;
	Texture bubbleImg;
	private Bubble bubble;
	
	public WorldRenderer(BubbleGame bubbleGame, World world) {
        this.bubbleGame = bubbleGame;
        batch = bubbleGame.batch;
        this.world = world;
        bubble = world.getBubble();
        bubbleImg = new Texture("right.png");
    }
	
	public void render(float delta) {
		batch.begin();
        Vector2 pos = bubble.getPosition();
        batch.draw(bubbleImg, pos.x, pos.y);
        batch.end();
    }
}
