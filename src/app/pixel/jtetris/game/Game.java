package app.pixel.jtetris.game;


import app.pixel.jtetris.arena.Arena;
import app.pixel.jtetris.graphic.Render;
import app.pixel.jtetris.object.BlocksManager;
import app.pixel.jtetris.object.Bottom;
import app.pixel.jtetris.object.JBlock;
import app.pixel.jtetris.object.WallLeft;
import app.pixel.jtetris.object.WallRight;

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
		Arena.currentArena.addSprite(new Bottom(0, 160, 220, 20));
		Arena.currentArena.addSprite(new WallLeft(-120, 30, 20, 280));
		Arena.currentArena.addSprite(new WallRight(120, 30, 20, 280));
		Arena.currentArena.addSprite(new BlocksManager(0, 0));		
		Arena.currentArena.addSprite(new JBlock(0,0));			

	}

	public static void quit() {
		System.exit(1);
	}
}
