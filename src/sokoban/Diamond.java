/* Matt Nicol
 * OOP Sokoban v0.6
 * 09/01/19
 * Eclipse V2018-09 4.9.0 
 */



package sokoban;

import java.awt.image.BufferedImage;



public class Diamond extends MapElement {
	
	private boolean hasCrate = false;
	
	public Diamond() 
	{		
		
	}
	
    /**
     * @return Return loaded diamond image
     */
	@Override
    public BufferedImage getImage() 
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
	
}	//END of Diamond
