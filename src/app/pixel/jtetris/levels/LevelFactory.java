package app.pixel.jtetris.levels;

public interface LevelFactory {
	LevelExecuter getLevel(LevelName levelName);
}
