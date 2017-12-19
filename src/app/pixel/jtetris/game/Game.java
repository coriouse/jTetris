package app.pixel.jtetris.game;


import java.awt.Color;

import app.pixel.jtetris.arena.Arena;
import app.pixel.jtetris.graphic.Render;
import app.pixel.jtetris.object.BlocksManager;
import app.pixel.jtetris.object.Brick;
import app.pixel.jtetris.object.JBlock;
import app.pixel.jtetris.object.Piece;

/**
 * Game handler
 * 
 * @author Sergei_Ogarkov
 *
 */
public class Game {

	public static void main(String[] args) {
		Render.init();
		Arena.currentArena = new Arena();
		
		Arena.currentArena.addSprite(new Brick(0,140, Color.RED, Piece.HYPE));
		Arena.currentArena.addSprite(new Brick(20,140, Color.RED, Piece.HYPE));
		Arena.currentArena.addSprite(new Brick(40,140,Color.RED, Piece.HYPE));
		
		Arena.currentArena.addSprite(new Brick(60,140,Color.RED, Piece.HYPE));
		Arena.currentArena.addSprite(new Brick(80,140,Color.RED, Piece.HYPE));
		Arena.currentArena.addSprite(new Brick(100,140,Color.RED, Piece.HYPE));
		
		Arena.currentArena.addSprite(new Brick(120,140,Color.RED, Piece.HYPE));
		Arena.currentArena.addSprite(new Brick(140,140,Color.RED, Piece.HYPE));
//		Arena.currentArena.addSprite(new Brick(160,140,Color.RED, Piece.HYPE));
		
		Arena.currentArena.addSprite(new Brick(180,140,Color.RED, Piece.HYPE));
		Arena.currentArena.addSprite(new Brick(200,140,Color.RED, Piece.HYPE));
		Arena.currentArena.addSprite(new Brick(220,140,Color.RED, Piece.HYPE));
		Arena.currentArena.addSprite(new BlocksManager(0, 0));
		
		Arena.currentArena.addSprite(new JBlock(0,0));
				
		

	}

	public static void quit() {
		System.exit(1);
	}
}
