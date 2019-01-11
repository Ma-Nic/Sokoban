/* Matt Nicol - 09001885
 * UINH17135 - OOP Sokoban v0.7
 * 10/01/19
 * Eclipse V2018-09 4.9.0 
 */

package sokoban;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;



public abstract class MapElement {		// Abstract, must construct an actual map element from subclasses

	// Declare images folder path, constant
	private static final String ICON_IMAGE_PATH = "images";
	
	// Declare all game icons and load images
	public static final Image ICON_CRATE = loadImage("Crate.png");
	public static final Image ICON_DIAMOND = loadImage("Diamond.png");
	public static final Image ICON_CRATE_IN_PLACE = loadImage("CrateInPlace.png");
	public static final Image ICON_WALL = loadImage("Wall.png");
	public static final Image ICON_WAREHOUSEKEEPER = loadImage("WarehouseKeeper.png");
	public static final Image ICON_TILE = loadImage("Tile.png");

	public Level layer;
	
	public MapElement ()
	{

	}
	
	/**
	 * Tries to load the image from the path "images" 
	 * @param imageName the name of the wanted image
	 * @return the loaded icon image
	 */
    private static Image loadImage(String imageName) {
    	// Try to load specific icon image from source
    		
    	Image img = null;
    		try 
    		{	// Create and load file path from constant path and passed in image name
    			FileInputStream imageStream = new FileInputStream(ICON_IMAGE_PATH + "/" + imageName);
    			img = new Image(imageStream);

    		} 	catch (FileNotFoundException fnfe) {		// Catch error if file is not found
    			fnfe.printStackTrace();
    		}	
    		return img; 
    }   //END loadImage
	
    /**
     * @return Return loaded icon image 
     */
    public Image getImage() 
    {
    	return null;
    }
    
    
    /**
     * Create elements with coordinates
     * @param x Pass in x coordinate
     * @param y Pass in y coordinate
     */
    public void createElement(int x, int y) 
    {
    	
    }
    
}	//END of MapElements
