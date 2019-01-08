/* Matt Nicol
 * OOP Sokoban v0.3
 * 12/12/18
 * Eclipse V2018-09 4.9.0 
 */


package sokoban;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Level {

	// Declare maps folder path, unchangeable
	private static final String MAP_LEVEL_PATH = "maps";
	
	
	
	public Level()
	{
		
	}
	
	/**
	 * @param levelSelected Passes the level selected from SokobanGame
	 */
	public static void loadLevel(String levelSelected) {

		// Create a buffered reader to read characters from the level file
		FileReader reader = null;
		BufferedReader inputBuffer = null;

		
		//Catch exceptions when reading the file(s)
		try 
		{
			// Add map path to selected level
			reader = new FileReader(MAP_LEVEL_PATH + "/" + levelSelected);
			inputBuffer = new BufferedReader(reader);

			
			// Loop through level file to read all lines, add to array
			String inputLine = inputBuffer.readLine();
			while(inputLine != null)
			{
				
				inputLine = inputBuffer.readLine();
				
			
			} // END WHILE
			
		} catch (FileNotFoundException fnfe) {	// Catch error if file is not found
			fnfe.printStackTrace();
			
		} catch (IOException ioe){	// Catch error for any problem reading a line from the file
			ioe.printStackTrace();
			
		} finally {
			// Dispose of buffer, finally ensures this is carried out
			if(inputBuffer != null){
				try {
					inputBuffer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}	//END of loadLevel
}	//END of Level
