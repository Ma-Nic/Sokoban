/* Matt Nicol
 * OOP Sokoban v0.6
 * 09/01/19
 * Eclipse V2018-09 4.9.0 
 */


package sokoban;

import java.awt.image.BufferedImage;



public class WarehouseKeeper extends MovableMapElmt {
	
	public WarehouseKeeper()
	{
		
	}
	
    /**
     * @return Return loaded warehouse keeper image
     */
	@Override
    public BufferedImage getImage() 
	{
		return ICON_WAREHOUSEKEEPER;
	}
	

}	//END of WarehouseKeeper