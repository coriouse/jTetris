package app.pixel.jtetris.object;

import java.awt.Color;
import java.awt.Graphics;

import app.pixel.jtetris.graphic.Render;

public class Brick  extends Sprite {

		
	Color color;
	Piece piece;

	public Brick(float posX, float posY, Color color, Piece piece) {
		super(posX, posY);
		this.width = 20;
		this.height = 20;
		this.color = color;
		this.piece = piece;
	}
	
	@Override
	public void update(float deltaTime) {

	/*	float borderWidth = (Render.gameWidth / 2);
		float borderHeight = (Render.gameHeight / 2);

		float moveX = 0;
		float moveY = 0;

		if (Input.getKeyUp(KeyEvent.VK_LEFT) && direction != Direction.RIGHT) {
			direction = Direction.LEFT;
			startPosX = posX;
			startPosY = posY;
			addPos(startPosX, startPosY);

		}
		if (Input.getKeyUp(KeyEvent.VK_RIGHT) && direction != Direction.LEFT) {
			direction = Direction.RIGHT;
			startPosX = posX;
			startPosY = posY;
			addPos(posX, posY);

		}

		if (Input.getKeyUp(KeyEvent.VK_UP) && direction != Direction.DOWN) {
			direction = Direction.UP;
			startPosX = posX;
			startPosY = posY;
			addPos(startPosX, startPosY);

		}

		if (Input.getKeyUp(KeyEvent.VK_DOWN) && direction != Direction.UP) {
			direction = Direction.DOWN;
			startPosX = posX;
			startPosY = posY;
			addPos(startPosX, startPosY);
		}
		
		Sprite[] sprites = getColliders(posX, posY);
		if (sprites.length > 0) {
			for (Sprite sprite : sprites) {
				if (sprite instanceof Food) {
				lengthen(posX + (lengthShake * 30), posY);
				((Food) sprite).isVisible = false;
				Score.SCORE += steps.size();
				continue;
				}
			}
		}
		


		
		if (Input.getKeyUp(KeyEvent.VK_ESCAPE)) {
			LevelFactory executeLevel = new LevelStore();
			LevelExecuter levelExecuter = executeLevel.getLevel(LevelName.MENU);
			levelExecuter.execute();
		}

		switch (direction) {
		case LEFT:
			moveX -= runSpeed;
			break;
		case RIGHT:
			moveX += runSpeed;
			break;
		case UP:
			moveY -= runSpeed;
			break;
		case DOWN:
			moveY += runSpeed;
			break;
		}

		posX += moveX * deltaTime;
		posY += moveY * deltaTime;
		
		addPos(posX, posY);

		if (posX > borderWidth) {
			posX = -borderWidth;
		} else if (posX < 0 && Math.abs(posX) > borderWidth) {
			posX = borderWidth;
		}

		if (posY > borderHeight) {
			posY = -borderHeight;
		} else if (posY < 0 && Math.abs(posY) > borderHeight) {
			posY = borderHeight;
		}*/
		
	

	}
	
	

	@Override
	public void render(Graphics g) {
		g.setColor(color);
	
		
		/*if (lengthShake > 0) {
			for (Float[] pos : steps) {
				g.fillRect((int) (pos[0] - width / 2) + Render.gameWidth / 2,
						(int) (pos[1] - height / 2) + Render.gameHeight / 2, (int) width, (int) height);
			}
		} else {
			g.fillRect((int) (posX - width / 2) + Render.gameWidth / 2,
					(int) (posY - height / 2) + Render.gameHeight / 2, (int) width, (int) height);
		}*/
		
		
	/*	for (Float[] pos : steps) {
			g.fillRect((int) (pos[0] - width / 2) + Render.gameWidth / 2,
					(int) (pos[1] - height / 2) + Render.gameHeight / 2, (int) width, (int) height);
		}*/
		
		
		g.fillRect((int) (posX - width / 2) + Render.gameWidth / 2,
				(int) (posY - height / 2) + Render.gameHeight / 2, (int) width, (int) height);
		
		g.setColor(Color.BLACK);
		g.drawRect((int) (posX - width / 2) + Render.gameWidth / 2,
				(int) (posY - height / 2) + Render.gameHeight / 2, (int) width, (int) height);
		
		
	}

	
	

	
}
