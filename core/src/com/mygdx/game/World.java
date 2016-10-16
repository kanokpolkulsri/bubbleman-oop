package com.mygdx.game;

public class World {
	private Bubble bubble;
    private BubbleGame bubbleGame;
    private Maze maze;
 
    World(BubbleGame bubbleGame) {
        this.bubbleGame = bubbleGame;
        bubble = new Bubble(100,100);
        maze = new Maze();
    }
 
    Bubble getBubble() {
        return bubble;
    }
    
    Maze getMaze() {
        return maze;
    }
}
