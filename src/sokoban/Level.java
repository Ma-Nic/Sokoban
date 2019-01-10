/* Matt Nicol
 * OOP Sokoban v0.6
 * 09/01/19
 * Eclipse V2018-09 4.9.0 
 */


package sokoban;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


public class Level {


	private static final String MAP_LEVEL_PATH = "maps";	// Declare maps folder path, constant
	
	protected MapElement mapMatrix[][];				// Declare multi array for storing the map
	protected Coord mapDimensions = new Coord();	// Create map and keeper coord objects
	protected Coord keeperCrd = new Coord();
	protected Coord cratesCrd[];					// Declare array for storing crate coords
	protected int currMoves;						// Declare current moves and cell size variables
	protected int cellSize;

	
	public Level()		// Constructor, initialise variables to 0
	{
		mapDimensions.setX(0);
		mapDimensions.setY(0);
		keeperCrd.setX(0);
		keeperCrd.setY(0);;
		currMoves = 0;
	}
	
	/**
	 * @param levelSelected Passes the level selected from SokobanGame
	 */
	public TileLayer loadLevel(String levelSelected) {

		// Create a buffered reader to read characters from the level file
	    FileReader fileInput = null;
	    BufferedReader fileIn = null;
	    LinkedList<String> cells = new LinkedList<String>();
	    ListIterator<String> cells_itr;
	    currMoves = 0;
	    
		//Catch exceptions when reading the file(s)
		try 
		{
			// Add map path to selected level
			fileInput = new FileReader(MAP_LEVEL_PATH + "/" + levelSelected + ".txt");			
		    fileIn = new BufferedReader(fileInput);
			
			// Loop through level file to read all lines, add to array
		      String input;
		      for (int i = 0; (input = fileIn.readLine()) != null; i++) {
		        if (input.length() > mapDimensions.getX()) {
		          mapDimensions.setX(input.length());
		        }
		        cells.add(input);
		      }
		      mapDimensions.setY(cells.size());
		      mapMatrix = new MapElement[mapDimensions.getX()][mapDimensions.getY()];

//		       flagArray = new int[mapDimensions.getX()][mapDimensions.getY()];
//		       int i, j;
//		       for (i = 0; i < mapDimensions.getY(); i++) {
//		        for (j = 0; j < mapDimensions.getX(); j++) {
//		        	flagArray[j][i] = 0;
//		        }
		      
		      
		      
		 } 	catch (FileNotFoundException fnfe) {	// Catch error if file is not found
			fnfe.printStackTrace();
		 }	catch (IOException e){		// Catch error for any problem reading a line from the file
			e.printStackTrace();
		}			
	}	//END of loadLevel
	
	
	public Coord getDimensions() 	// Get map dimensions
	{
	    return mapDimensions;
	}

	public int getColCount() 		// Get X count
	{ 
		int X = mapDimensions.getX();
		return X;
	}

	public int getRowCount()		//Get Y count
	{ 
		int Y = mapDimensions.getY();
		return Y;
	}
	
	public int getMoves() 			// Get move count
	{
		return currMoves;
	}
	
	
	
	

}	//END of Level
