package app.pixel.jtetris.object;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import app.pixel.jtetris.arena.Arena;
import app.pixel.jtetris.input.Direction;
import app.pixel.jtetris.input.Input;

public class JBlock extends Block {

	Color color = Color.BLUE;
	

	float myDown = 0;
	
	public static Map<Direction, List<Integer[]>> turn = new HashMap<Direction, List<Integer[]>>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{

			put(Direction.DOWN, new LinkedList() {
				{
					add(new Integer[] { 20, -20 });
					add(new Integer[] { 0, 0 });
					add(new Integer[] { -20, 20 });
					add(new Integer[] { -40, 0 });
				}
			});

			put(Direction.RIGHT, new LinkedList() {
				{
					add(new Integer[] { 20, 20 });
					add(new Integer[] { 0, 0 });
					add(new Integer[] { -20, -20 });
					add(new Integer[] { 0, -40 });
				}
			});

			put(Direction.UP, new LinkedList() {
				{
					add(new Integer[] { -20, 20 });
					add(new Integer[] { 0, 0 });
					add(new Integer[] { 20, -20 });
					add(new Integer[] { 40, 0 });
				}
			});

			put(Direction.LEFT, new LinkedList() {
				{
					add(new Integer[] { -20, -20 });
					add(new Integer[] { 0, 0 });
					add(new Integer[] { 20, 20 });
					add(new Integer[] { 0, 40 });
				}
			});

		}
	};

	public JBlock(float posX, float posY) {
		super(posX, posY);

		// init block
		Arena.currentArena.addSprite(new Brick(0, 0, color, Piece.J_BLOCK));
		Arena.currentArena.addSprite(new Brick(20, 0, color, Piece.J_BLOCK));
		Arena.currentArena.addSprite(new Brick(40, 0, color, Piece.J_BLOCK));
		Arena.currentArena.addSprite(new Brick(40, 20, color, Piece.J_BLOCK));

	}

	@Override
	public void update(float deltaTime) {

		if (Input.getKeyUp(KeyEvent.VK_UP)) {
			// change direction
			if (direction == Direction.LEFT) {
				direction = Direction.DOWN;
			} else if (direction == Direction.DOWN) {
				direction = Direction.RIGHT;
			} else if (direction == Direction.RIGHT) {
				direction = Direction.UP;
			} else if (direction == Direction.UP) {
				direction = Direction.LEFT;
			}

			int count = 0;
			for (Sprite sprite : Arena.currentArena.spites) {
				if (sprite instanceof Brick) {
					if (((Brick) sprite).piece == Piece.J_BLOCK) {
						((Brick) sprite).posX = ((Brick) sprite).posX + turn.get(direction).get(count)[0];
						((Brick) sprite).posY = ((Brick) sprite).posY + turn.get(direction).get(count)[1];
						count++;
						System.out.println(((Brick) sprite).posX + "," + ((Brick) sprite).posY);
					}
				}
			}
			System.out.println();

		}

		if (Input.getKeyUp(KeyEvent.VK_LEFT)) {
			for (Sprite sprite : Arena.currentArena.spites) {
				if (sprite instanceof Brick) {
					if (((Brick) sprite).piece == Piece.J_BLOCK) {
						((Brick) sprite).posX = ((Brick) sprite).posX - 20;
					}
				}
			}

		}
		if (Input.getKeyUp(KeyEvent.VK_RIGHT)) {
			for (Sprite sprite : Arena.currentArena.spites) {
				if (sprite instanceof Brick) {
					if (((Brick) sprite).piece == Piece.J_BLOCK) {
						((Brick) sprite).posX = ((Brick) sprite).posX + 20;
					}
				}
			}

		}

		if (Input.getKeyUp(KeyEvent.VK_DOWN)) {
			for (Sprite sprite : Arena.currentArena.spites) {
				if (sprite instanceof Brick) {
					if (((Brick) sprite).piece == Piece.J_BLOCK) {
						((Brick) sprite).posY = ((Brick) sprite).posY + 20;
					}
				}
			}
		}

				
		if(isBlockRiched()) {
			for (Sprite sprite : Arena.currentArena.spites) {
				if (sprite instanceof Brick) {				
					if (((Brick) sprite).piece == Piece.J_BLOCK) {
						((Brick) sprite).piece = Piece.HYPE;
					}
				}
			}	
			this.isActive = false;
			
		}
		
	//	System.out.println("isBlockRiched=" + isBlockRiched(posX, posY));

	}

	@Override
	public void render(Graphics g) {
		//TODO 
	}

	protected boolean isBlockRiched() {
		
		for (Sprite sprite : Arena.currentArena.spites) {
			if (sprite == this || !sprite.isSolid) {
				continue;
			}
			if (sprite instanceof Brick) {
				if (((Brick) sprite).piece == Piece.J_BLOCK) {
					myDown = ((Brick) sprite).posY + ((Brick) sprite).height;
					
				}		
				if (((Brick) sprite).piece != Piece.J_BLOCK) {
					float otherUp = ((Brick) sprite).posY - ((Brick) sprite).height / 2;
					
					if (myDown > otherUp) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
