/* Matt Nicol - 09001885
 * UINH17135 - OOP Sokoban v0.7
 * 10/01/19
 * Eclipse V2018-09 4.9.0 
 */


package sokoban;

import javafx.scene.image.Image;



public class Tile extends MapElement {
	
    Coord tileCrd = new Coord();
	
	public Tile()
	{
		
	}
	
	@Override
    public Image getImage() 
	{
    	return ICON_TILE;
    }

    /**
     * Set Tile coordinates
     */
	public void createElement(int x, int y) 
    {

        tileCrd.setX(x);
        tileCrd.setY(y);
    }
	
}	//END of Tile