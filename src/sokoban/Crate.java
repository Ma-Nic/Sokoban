/* Matt Nicol
 * OOP Sokoban v0.6
 * 09/01/19
 * Eclipse V2018-09 4.9.0 
 */



package sokoban;

import java.awt.image.BufferedImage;



public class Crate extends MovableMapElmt {

	BufferedImage crateState;
	
	public Crate()
	{
		
	}
	
    /**
     * @return Return loaded crate image
     */
	@Override
    public BufferedImage getImage() 
	{
		return crateState;
	}
	
	public void crateCheck() 
	{
		
	}
	
	// If on diamond, set image icon to diamond with crate
	public void setOnDiamond()
	{
			this.crateState = ICON_CRATE_IN_PLACE;
			this.getImage();
	}
	
	// If crate is not on diamond, set image icon to crate
    public void setNoDiamond() 
	{
		this.crateState = ICON_CRATE;
		this.getImage();
    }
	
}	//END of Crate