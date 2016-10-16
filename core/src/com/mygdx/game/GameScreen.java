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
	private WorldRenderer worldRenderer;
	 
    public GameScreen(BubbleGame bubbleGame) {
        this.bubbleGame = bubbleGame;
        bubbleImg = new Texture("right.png");
        //bubble = new Bubble(100,100);
        world = new World(bubbleGame);
        bubble = world.getBubble();
        worldRenderer = new WorldRenderer(bubbleGame, world);
    }
    
    @Override
    public void render(float delta) {
    	update(delta);
    	Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        worldRenderer.render(delta);
    }
    private float x=0;
    private float y=0;
    private void update(float delta) {
    	x = bubble.getPosition().x;
		y = bubble.getPosition().y;
    	if(Gdx.input.isKeyJustPressed(Keys.UP) | Gdx.input.isKeyPressed(Keys.RIGHT) | Gdx.input.isKeyPressed(Keys.LEFT))
    	{if(Gdx.input.isKeyJustPressed(Keys.UP)) {
    		if(y>150)
    			bubble.move(Bubble.DIRECTION_UP);
    	}
    	if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
    		if(x<750)
    			bubble.move(Bubble.DIRECTION_RIGHT);
    		if( (y>40 && y<120) && (x>140 && x<640)  ){
    			bubble.move(Bubble.DIRECTION_DOWNN);
    		}
    		else if( ((y>40 && y<200) && ((x>40 && x<140) || (x>640 && x<760)))  ){
    			bubble.move(Bubble.DIRECTION_DOWNN);
    		}
    		else if( (y>130 && y<280) && (x>190 && x<580)  ){
    			bubble.move(Bubble.DIRECTION_DOWNN);
    		}
    		else if( (y>210 && y<480) && ((x>40 && x<220) || (x>540 && x<760))  ){
    			bubble.move(Bubble.DIRECTION_DOWNN);
    		}
    		else if( (y>310 && y<380) && (x>190 && x<580)  ){
    			bubble.move(Bubble.DIRECTION_DOWNN);
    		}
    		else if( (y>385 && y<550) && (x>190 && x<580)  ){
    			bubble.move(Bubble.DIRECTION_DOWNN);
    		}
    	}
    	if(Gdx.input.isKeyPressed(Keys.LEFT)) {
    		if(x>50)
            bubble.move(Bubble.DIRECTION_LEFT);
    		if( (y>40 && y<120) && (x>140 && x<640)  ){
    			bubble.move(Bubble.DIRECTION_DOWNN);
    		}
    		else if( ((y>40 && y<200) && ((x>40 && x<140) || (x>640 && x<760)))  ){
    			bubble.move(Bubble.DIRECTION_DOWNN);
    		}
    		else if( (y>130 && y<280) && (x>190 && x<580)  ){
    			bubble.move(Bubble.DIRECTION_DOWNN);
    		}
    		else if( (y>210 && y<480) && ((x>40 && x<220) || (x>540 && x<760))  ){
    			bubble.move(Bubble.DIRECTION_DOWNN);
    		}
    		else if( (y>310 && y<380) && (x>190 && x<580)  ){
    			bubble.move(Bubble.DIRECTION_DOWNN);
    		}
    		else if( (y>385 && y<550) && (x>190 && x<580)  ){
    			bubble.move(Bubble.DIRECTION_DOWNN);
    		}
    	}}
    	else {
    		if( (y>40 && y<120) && (x>140 && x<640)  ){
    			bubble.move(Bubble.DIRECTION_DOWN);
    		}
    		else if( ((y>40 && y<200) && ((x>40 && x<140) || (x>640 && x<760)))  ){
    			bubble.move(Bubble.DIRECTION_DOWN);
    		}
    		else if( (y>130 && y<280) && (x>190 && x<580)  ){
    			bubble.move(Bubble.DIRECTION_DOWN);
    		}
    		else if( (y>210 && y<480) && ((x>40 && x<220) || (x>540 && x<760))  ){
    			bubble.move(Bubble.DIRECTION_DOWN);
    		}
    		else if( (y>310 && y<380) && (x>190 && x<580)  ){
    			bubble.move(Bubble.DIRECTION_DOWN);
    		}
    		else if( (y>385 && y<550) && (x>190 && x<580)  ){
    			bubble.move(Bubble.DIRECTION_DOWN);
    		}	
    	}
    }
    
}
