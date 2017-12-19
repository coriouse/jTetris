package app.pixel.jtetris.object;

import app.pixel.jtetris.input.Direction;

/**
 * 
 * @author Sergei_Ogarkov
 *
 */
public abstract class Block extends Sprite {
	
	//direction by default
	protected Direction direction = Direction.LEFT;
	
	boolean isActive = true;


	protected float runSpeed = 60.0f;	
	public float time = 0;	

	
	public Block(float posX, float posY) {
		super(posX, posY);
	}
}
