/* Matt Nicol - 09001885
 * UINH17135 - OOP Sokoban v0.7
 * 10/01/19
 * Eclipse V2018-09 4.9.0 
 */


package sokoban;


import javafx.scene.image.Image;



public class Wall extends MapElement {
	
    Coord wallCrd = new Coord();
	
	public Wall()
	{
		
	}
	
    /**
     * @return Return loaded wall image
     */
	@Override
    public Image getImage() 
	{
    	return ICON_WALL;
    }	
	
    /**
     * Set Wall coordinates
     */
	public void createElement(int x, int y) 
    {
        wallCrd.setX(x);
        wallCrd.setY(y);
    }

}	//END of Wall