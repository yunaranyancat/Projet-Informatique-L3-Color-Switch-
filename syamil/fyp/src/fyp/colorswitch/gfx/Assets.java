package fyp.colorswitch.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int widthBtn = 64, heightBtn = 64;

	public static BufferedImage[] btn_start, title;
	
	public static void init() {
 
		SpriteSheet uiSheet = new SpriteSheet(ImageLoader.LoadImage("/textures/ui.png"));
				
		btn_start = new BufferedImage[2];
		title = new BufferedImage[1];
		
		btn_start[0] = uiSheet.crop(0, 0, widthBtn, heightBtn);
		btn_start[1] = uiSheet.crop(widthBtn, 0, widthBtn, heightBtn);
		title[0] = ImageLoader.LoadImage("/textures/title.png");
		
	}
}
