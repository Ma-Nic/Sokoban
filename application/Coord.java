/* Matt Nicol
 * OOP Sokoban v0.2
 * 06/12/18
 * Eclipse V2018-09 4.9.0 
 */



package application;

public class Coord {

	//Declare variables
	protected int x_value = 0;
	protected int y_value = 0;
	
	//Set Coordinates to 0
	public Coord()
	{
		x_value = 0;
		y_value = 0;
	}
	
	//Overwrite Coordinates
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
	
	
}
