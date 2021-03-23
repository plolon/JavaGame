package game;

import javax.swing.ImageIcon;

public class Ball extends Sprite {

	private int xdir;
	private int ydir;
	
	public Ball() {
		initBall();
	}
	
	private void initBall() {
		xdir = 1;
		ydir = -1;
		
		loadImage();
		getImageDimension();
		resetState();
	}
	
	private void loadImage() {
		var imageIcon = new ImageIcon("src/rsc/ball.png");
		image = imageIcon.getImage();
	}
	
	void move() {
		
		x += xdir;
		y += ydir;
		
		if (x==0) {
			setXDir(1);
		}
		
		if (x==Commons.WIDTH - imageWidth) {
			setXDir(-1);
		}
		
		if (y==0) {
			setYDir(1);
		}
	}
	
	private void resetState() {
		x = Commons.INIT_BALL_X;
		y = Commons.INIT_BALL_Y;
	}
	
	void setXDir(int x) {
		xdir = x;
	}
	
	void setYDir(int y) {
		ydir = y;
	}
	
	int getYDir() {
		return ydir;
	}
}