package com.mygdx.game;

public class World {
	private Bubble bubble;
    private BubbleGame bubbleGame;
 
    World(BubbleGame bubbleGame) {
        this.bubbleGame = bubbleGame;
        bubble = new Bubble(100,100);
    }
 
    Bubble getBubble() {
        return bubble;
    }
}
