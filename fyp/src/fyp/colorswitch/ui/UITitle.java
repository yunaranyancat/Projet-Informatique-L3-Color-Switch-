package fyp.colorswitch.ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import fyp.colorswitch.Handler;

public class UITitle extends UIObject {

	private BufferedImage[] images;
	
	public UITitle(Handler handler, float y, int width, int height, BufferedImage[] images) {
		super(handler, y, width, height);
		this.images = images;
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(images[0], (int) x, (int) y, width, height, null);
	}

	@Override
	public void onClick() {
		
	}

}
