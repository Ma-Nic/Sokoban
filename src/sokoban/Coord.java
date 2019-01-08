/* Matt Nicol
 * OOP Sokoban v0.5
 * 08/01/19
 * Eclipse V2018-09 4.9.0 
 */



package sokoban;

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
	
	//Overload Coordinates
	public Coord(int x, int y)
	{
		x_value = x;
		y_value = y;
	}
	
	//Get x coord
	public int getX() 
	{
		return this.x_value;
	}
	
	//Get y coord
	public int getY() 
	{
		return this.y_value;
	}
	
	//Set x coord
	public void setX(int newX)
	{
		this.x_value = newX;
	}
	
	//Set y coord
	public void setY(int newY)
	{
		this.y_value = newY;
	}
	
	
}
