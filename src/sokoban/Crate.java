/* Matt Nicol - 09001885
 * UINH17135 - OOP Sokoban v0.7
 * 10/01/19
 * Eclipse V2018-09 4.9.0 
 */



package sokoban;

import javafx.scene.image.Image;



public class Crate extends MovableMapElmt {

	Image crateState;
    Coord crateCrd = new Coord();
	
	public Crate()
	{
		
	}
	
    /**
     * @return Return loaded crate image
     */
	@Override
    public Image getImage() 
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
    
    /**
     * Set Crate coordinates
     */
	public void createElement(int x, int y) 
    {
        crateCrd.setX(x);
        crateCrd.setY(y);
    }
	
}	//END of Crate