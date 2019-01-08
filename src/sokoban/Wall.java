/* Matt Nicol
 * OOP Sokoban v0.5
 * 08/01/19
 * Eclipse V2018-09 4.9.0 
 */


package sokoban;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;


public class Wall extends MapElement {
	
	protected Image image;
	
	public Wall()
	{
		
	}
	
	public void setWallImage() 
	{
		try 
		{
			Image wallIcon = new Image(new FileInputStream("resources/SokobanImages/Wall.png"));
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	

}
