/* Matt Nicol - 09001885
 * UINH17135 - OOP Sokoban v0.7
 * 10/01/19
 * Eclipse V2018-09 4.9.0 
 */


package sokoban;

import javafx.scene.image.Image;



public class WarehouseKeeper extends MovableMapElmt {
	
    Coord keeperCrd = new Coord();
	
	public WarehouseKeeper()
	{
		
	}
	
    /**
     * @return Return loaded warehouse keeper image
     */
	@Override
    public Image getImage() 
	{
		return ICON_WAREHOUSEKEEPER;
	}
	
    /**
     * Set Warehouse Keeper coordinates
     */
	public void createElement(int x, int y) 
    {
        keeperCrd.setX(x);
        keeperCrd.setY(y);
    }

}	//END of WarehouseKeeper