/* Matt Nicol
 * OOP Sokoban v0.2
 * 06/12/18
 * Eclipse V2018-09 4.9.0 
 */



package application;

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
			hasCrate = true;			
		}
		else hasCrate = false;
	}
	
	
	
	
}
