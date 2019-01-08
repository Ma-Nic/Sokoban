/* Matt Nicol
 * OOP Sokoban v0.5
 * 08/01/19
 * Eclipse V2018-09 4.9.0 
 */



package sokoban;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;



public class Diamond extends MapElement {
	
	boolean hasCrate = false;
	
	public Diamond() 
	{		
		
	}
	
	public void setDiamondImage() 
	{
		try 
		{
			Image diamondIcon = new Image(new FileInputStream("resources/SokobanImages/Diamond.png"));
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public boolean getHasCrate()
	{
		return hasCrate;
	}
	
	public void setHasCrate(boolean dhc)
	{
		// If diamond tile has crate, return true
		if (dhc == true)
		{
			this.hasCrate = true;			
		}
		else this.hasCrate = false;
	}
	
	
	
	
}
