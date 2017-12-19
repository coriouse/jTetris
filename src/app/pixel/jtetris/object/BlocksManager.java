package app.pixel.jtetris.object;


import java.awt.Color;
import java.awt.Graphics;

import app.pixel.jtetris.arena.Arena;



/**
 * 
 * @author Sergei_Ogarkov
 *
 */
public class BlocksManager extends Sprite {
	
	private final static int WIDTH = 80;
	private final static int HEIGHT = 20;
	

	public BlocksManager(float posX, float posY) {
		super(posX, posY);
		this.width = WIDTH;
		this.height = HEIGHT;
		
	}

	public final int BLOCK_IN_LINE = 3;
	
	public void update(float deltaTime) {
		
		//int temp = 0;
		//int count =0;
		boolean newBlock = true;
		for (Sprite sprite : Arena.currentArena.spites) {
			
			
			//looking for line
			/*if (sprite instanceof Brick) {
				if(count == 0){
					temp = (int) sprite.posY;
					count++;
				} else {
					if(temp == (int) sprite.posY) {
						count++;
					} else {
						count--;
					}
				}
			}*/
			
			//looking for inactive			
			if (sprite instanceof Block) {
				if(!((Block) sprite).isActive) {
					Arena.currentArena.removeSprite(sprite);
					Arena.currentArena.addSprite(new JBlock(0,0));
				}
			//	System.out.println("isactive="+((Block) sprite).isActive);
				
			}
			
		}
		
			
		
		
	}

	public void render(Graphics g) {
	
	}
	

}
