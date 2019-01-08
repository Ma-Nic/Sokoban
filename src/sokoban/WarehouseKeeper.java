/* Matt Nicol
 * OOP Sokoban v0.5
 * 08/01/19
 * Eclipse V2018-09 4.9.0 
 */


package sokoban;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;



public class WarehouseKeeper extends MoveableMapElmt {
	
	public WarehouseKeeper()
	{
		
	}
	
	public void setKeeperImage() 
	{
		try 
		{
			Image keeperIcon = new Image(new FileInputStream("resources/SokobanImages/WarehouseKeeper.png"));
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	

}
