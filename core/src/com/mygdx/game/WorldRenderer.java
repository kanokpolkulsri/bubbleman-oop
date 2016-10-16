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
	private MazeRenderer mazeRenderer;
	private Texture bg;
	public static final int BLOCK_SIZE = 40;
	
	public WorldRenderer(BubbleGame bubbleGame, World world) {
        this.bubbleGame = bubbleGame;
        batch = bubbleGame.batch;
        this.world = world;
        bubble = world.getBubble();
        bubbleImg = new Texture("right.png");
        mazeRenderer = new MazeRenderer(bubbleGame.batch, world.getMaze());
        bg = new Texture("bg1.jpg");
    }

	public void render(float delta) {
		batch.begin();
		batch.draw(bg,0,0);
		batch.end();
		mazeRenderer.render();
		SpriteBatch batch = bubbleGame.batch;
        Vector2 pos = world.getBubble().getPosition();
        batch.begin();
        //batch.draw(bubbleImg, pos.x - 20, BubbleGame.HEIGHT - pos.y - 20);
        batch.draw(bubbleImg, pos.x - BLOCK_SIZE/2, 600 - pos.y - BLOCK_SIZE/2);
        batch.end();
    }
}
