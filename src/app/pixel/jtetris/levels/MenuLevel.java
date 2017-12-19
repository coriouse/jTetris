package app.pixel.jtetris.levels;

import app.pixel.jtetris.arena.Arena;
import app.pixel.jtetris.game.Menu;

public class MenuLevel implements LevelExecuter {

	@Override
	public void execute() {
		Arena.currentArena = new Arena();
		Arena.currentArena.addSprite(new Menu(-130, -40));
	}
}
