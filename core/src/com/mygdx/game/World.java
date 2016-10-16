package com.mygdx.game;

public class World {
	private Bubble bubble;
    private BubbleGame bubbleGame;
    private Maze maze;
 
    World(BubbleGame bubbleGame) {
        this.bubbleGame = bubbleGame;
        bubble = new Bubble(60,60);
        maze = new Maze();
    }
 
    Bubble getBubble() {
        return bubble;
    }
    
    Maze getMaze() {
        return maze;
    }
}
