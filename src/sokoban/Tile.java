/* Matt Nicol
 * OOP Sokoban v0.5
 * 08/01/19
 * Eclipse V2018-09 4.9.0 
 */


package sokoban;

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
