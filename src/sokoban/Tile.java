/* Matt Nicol
 * OOP Sokoban v0.6
 * 09/01/19
 * Eclipse V2018-09 4.9.0 
 */


package sokoban;

import java.awt.image.BufferedImage;



public class Tile extends MapElement {
	
	public Tile()
	{
		
	}
	
	@Override
    public BufferedImage getImage() {
    	return ICON_TILE;
    }

}	//END of Tile