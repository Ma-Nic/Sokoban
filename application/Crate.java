/* Matt Nicol
 * OOP Sokoban v0.2
 * 06/12/18
 * Eclipse V2018-09 4.9.0 
 */



package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;



public class Crate extends MoveableMapElmt {

	public Crate()
	{
		
	}
	
	public void setCrateImage() 
	{
		try 
		{
			Image crateIcon = new Image(new FileInputStream("resources/SokobanImages/Crate.png"));
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
}
