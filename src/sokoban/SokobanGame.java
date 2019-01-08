/* Matt Nicol
 * OOP Sokoban v0.3
 * 12/12/18
 * Eclipse V2018-09 4.9.0 
 */


package sokoban;

public class SokobanGame {
	
	protected Level currentLevel;
	protected int displayLevelNumber;
	
	public SokobanGame()
	{
		
	}
	
	/**
	 * @param level Passes the level number based on user choice from SokobanController,
	 * Switch Case loads chosen level
	 */
	public static void selectLevel(int level)
	{
		
		switch (level) 
		{	
		case 1: Level.loadLevel("level1");
		case 2: Level.loadLevel("level2");
		case 3: Level.loadLevel("level3");
		case 4: Level.loadLevel("level4");
		case 5: Level.loadLevel("level5");
		default: System.out.println("Please Select a Level");
		}	
	}		//END of selectLevel
	
	
	/**
	 * @param levelNumber Sets the level display number
	 */
	public void setLevel(int levelNumber) 
	{
		displayLevelNumber = levelNumber;
	}	//END of setLevel
	
	
	/**
	 * @param level Passes current level from SokobanController
	 */
	public static void resetLevel(int level) 
	{
		// Reset current level
		selectLevel(level);
	}	//END of resetLevel

	
	
}	//END of SokobanGame
