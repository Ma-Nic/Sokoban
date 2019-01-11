/* Matt Nicol - 09001885
 * UINH17135 - OOP Sokoban v0.7
 * 10/01/19
 * Eclipse V2018-09 4.9.0 
 */



package sokoban;

import javafx.scene.image.Image;



public class Diamond extends MapElement {
	
	private boolean hasCrate = false;
    Coord diamondCrd = new Coord();
	
	public Diamond() 
	{		
		
	}
	
    /**
     * @return Return loaded diamond image
     */
	@Override
    public Image getImage() 
	{
    	return ICON_DIAMOND;
    }
	
	/**
	 * @param dhc Boolean value to set whether the diamond has a crate or not
	 */
	public void setHasCrate(boolean dhc) 
	{
		if(dhc == true) {
			this.hasCrate = true;
		}
		else {
			this.hasCrate = false;
		}
	}
    
    /**
     * @return Return boolean of whether diamond has a crate or not
     */
	public boolean getHasCrate()
	{
		return hasCrate;
	}
	
	
    /**
     * Set Diamond coordinates
     */
	public void createElement(int x, int y) 
    {
        diamondCrd.setX(x);
        diamondCrd.setY(y);
    }
	
}	//END of Diamond
