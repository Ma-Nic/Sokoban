/* Matt Nicol - 09001885
 * UINH17135 - OOP Sokoban v0.7
 * 10/01/19
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
	 * @param level Passes the level number based on user choice from SokobanController
	 * @param Lvl Passes level class from SokobanController
	 */
	public static void selectLevel(Level Lvl, int level)
	{
		
		switch (level) 
		{	
		case 1: Lvl.loadLevel("level1.txt");
		break;
		case 2: Lvl.loadLevel("level2.txt");
		break;
		case 3: Lvl.loadLevel("level3.txt");
		break;
		case 4: Lvl.loadLevel("level4.txt");
		break;
		case 5: Lvl.loadLevel("level5.txt");
		break;
		default: System.out.println("Please Select a Level");
		break;
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
	 * @param lvl Passes level class from SokobanController
	 * @param level Passes current level from SokobanController
	 */
	public static void resetLevel(Level lvl, int level) 
	{
		selectLevel(lvl, level);		// Reset current level
	}	//END of resetLevel

	
	
}	//END of SokobanGame
