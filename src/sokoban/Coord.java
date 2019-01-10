/* Matt Nicol
 * OOP Sokoban v0.6
 * 09/01/19
 * Eclipse V2018-09 4.9.0 
 */



package sokoban;

public class Coord {

	//Declare variables
	private int x_value = 0;
	private int y_value = 0;
	
	//Set Coordinates to 0
	public Coord()
	{
		x_value = 0;
		y_value = 0;
	}
	
	//Overload Coordinates
	public Coord(int x, int y)
	{
		x_value = x;
		y_value = y;
	}
	
	//Get x coord
	public int getX() 
	{
		return x_value;
	}
	
	//Get y coord
	public int getY() 
	{
		return y_value;
	}
	
	//Set x coord
	public void setX(int newX)
	{
		x_value = newX;
	}
	
	//Set y coord
	public void setY(int newY)
	{
		y_value = newY;
	}
	
	
}	//END Coord
