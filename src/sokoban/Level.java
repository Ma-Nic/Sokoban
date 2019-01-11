/* Matt Nicol - 09001885
 * UINH17135 - OOP Sokoban v0.7
 * 10/01/19
 * Eclipse V2018-09 4.9.0 
 */


package sokoban;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class Level {

	private static final String MAP_LEVEL_PATH = "maps";	// Declare maps folder path, constant
	
	private MapElement[][] map = new MapElement[25][15];		// Declare multi-array to store map characters
	GridPane playArea = new GridPane();
	Image tileTexture;

	Wall wall = new Wall();
	Coord coord = new Coord();
	Crate crate = new Crate();
	Diamond diamond = new Diamond();
	Tile tile = new Tile();
	WarehouseKeeper keeper = new WarehouseKeeper();
	
	
	public Level()
	{
		
	}
	
	
	public void loadLevel(String levelSelected)
	{
		String filePath = MAP_LEVEL_PATH + "/" + levelSelected;
	
		try (BufferedReader fileIn = new BufferedReader(new FileReader(filePath)))
		{
		    int x = 0;
		    int y = 0;  
			String input;
			
			// Loop through level file to read all lines, add to Map Element array
		    while ((input = fileIn.readLine()) != null) 
		    {   			  
		    	System.out.println(input);

		    	for (int i = 0; i < input.length(); i++) {
		    	  char mapIcon = input.charAt(i);
	                  switch (mapIcon) {			// Switch case while reading file dependent on what character is found
	                  	  case ' ': 		//tile	                  		
	                  		  tile.createElement(x, y);
	                  		  tileTexture = tile.getImage();
	                  		  playArea.add(new ImageView(tileTexture), x, y);
	                  		  setMapElmt(x, y, tile);
	                  		  break;
	                      case 'X':			//wall
	                          wall.createElement(x, y);
	                  		  tileTexture = wall.getImage();
	                  		  playArea.add(new ImageView(tileTexture), x, y);
	                          setMapElmt(x, y , wall);
	                          break;
	                      case '.':			//diamond	                          
	                          diamond.createElement(x, y);
	                  		  tileTexture = diamond.getImage();
	                  		  playArea.add(new ImageView(tileTexture), x, y);
	                          setMapElmt(x, y, diamond);
	                          break;
	                      case '*':			//crate
	                          crate.createElement(x, y);
	                  		  tileTexture = crate.getImage();
	                  		  playArea.add(new ImageView(tileTexture), x, y);
	                          setMapElmt(x, y, crate);
	                          break;
	                      case '@':	        //warehouseKeeper
	                          keeper.createElement(x, y);
	                  		  tileTexture = keeper.getImage();
	                  		  playArea.add(new ImageView(tileTexture), x, y);
	                          setMapElmt(x, y, keeper);
	                          break;
	                      default:
	                          System.out.println("Invalid character");
	                          System.exit(0);		    			  
	                  }	//END switch case

	                    x++;            // Every loop, increase x and y to fit within the grid
	                    if (x >= input.length()) 
	                    {
	                        y++;
	                        x = 0;
	                    }
	                  
		    	  } //END for loop
		    } //END while loop
		    setPlayArea(playArea);
		
		}	catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
		}	catch (IOException e) {
			e.printStackTrace();
		}	//END try catch	
		
	}	//END Level loadLevel

	public void setMapElmt(int x, int y, MapElement mapElement) 
	{
	       map[x][y] = mapElement;
	}
	
	public void setPlayArea(GridPane pArea)
	{
		SokobanController.LevelArea = pArea;
	}
	

}	//END of Level
