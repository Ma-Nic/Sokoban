package sokoban;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GameImages {
	
	// Declare images folder path, unchangeable
	private static final String ICON_IMAGE_PATH = "images";
	
	// Declare all game icons and load images
	public static final BufferedImage ICON_CRATE = loadImage("Crate.png");
	public static final BufferedImage ICON_DIAMOND = loadImage("Diamond.png");
	public static final BufferedImage ICON_CRATE_IN_PLACE = loadImage("CrateInPlace.png");
	public static final BufferedImage ICON_WALL = loadImage("Wall.png");
	public static final BufferedImage ICON_WAREHOUSEKEEPER = loadImage("WarehouseKeeper.png");
	public static final BufferedImage ICON_TILE = loadImage("Tile.png");

    
	/**
	 * Tries to load the image from the path "images" 
	 * @param imageName the name of the wanted image
	 * @return the icon image
	 */
    private static BufferedImage loadImage(String imageName) {
    	// Try to load specific icon image from source
	
    		BufferedImage img = null;
    		try {
    		    img = ImageIO.read(new File(ICON_IMAGE_PATH + "/" + imageName));
    		} catch (IOException e) {
    		}
			
    		return img; 
			
    }   //END loadImage
}	//END GameImages
