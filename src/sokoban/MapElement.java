/* Matt Nicol
 * OOP Sokoban v0.6
 * 09/01/19
 * Eclipse V2018-09 4.9.0 
 */

package sokoban;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class MapElement {		// Abstract, must construct an actual map element from subclasses

	// Declare images folder path, constant
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
	 * @return the loaded icon image
	 */
    private static BufferedImage loadImage(String imageName) {
    	// Try to load specific icon image from source
    		
    	BufferedImage img = null;
    		try 
    		{	// Create and load file path from constant path and passed in image name
    		    img = ImageIO.read(new File(ICON_IMAGE_PATH + "/" + imageName));
    		} 	catch (FileNotFoundException fnfe) {		// Catch error if file is not found
    			fnfe.printStackTrace();
    		}	catch (IOException e){		// Catch error for any problem reading from the file
    			e.printStackTrace();
    		}
    		return img; 
    }   //END loadImage
	
    /**
     * @return Return loaded icon image 
     */
    public BufferedImage getImage() {
    	return null;
    }
    
    
}	//END of MapElements
