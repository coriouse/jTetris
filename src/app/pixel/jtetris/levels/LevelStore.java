package app.pixel.jtetris.levels;

public class LevelStore implements LevelFactory {

	@Override
	public LevelExecuter getLevel(LevelName levelName) {
		
		switch(levelName) {
		case MENU:
			return new MenuLevel();
		case LEVEL3:
			return new Level3();
			default:
				return new MenuLevel();
		}
		
	}

}
