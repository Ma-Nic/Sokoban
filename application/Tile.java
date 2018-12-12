/* Matt Nicol
 * OOP Sokoban v0.3
 * 12/12/18
 * Eclipse V2018-09 4.9.0 
 */


package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;



public class Tile extends MapElement {
	
	public Tile()
	{
		
	}
	
	public void setTileImage() 
	{
		try 
		{
			Image tileIcon = new Image(new FileInputStream("resources/SokobanImages/Tile.png"));
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
