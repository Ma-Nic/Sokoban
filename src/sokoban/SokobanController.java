/* Matt Nicol - 09001885
 * UINH17135 - OOP Sokoban v0.7
 * 10/01/19
 * Eclipse V2018-09 4.9.0 
 */

package sokoban;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class SokobanController {
	
	protected int level;
	Level lvl = new Level();

    @FXML
    private MenuBar MenuBar;

    @FXML
    private MenuItem MenuLvl_1;

    @FXML
    private MenuItem MenuLvl_2;

    @FXML
    private MenuItem MenuLvl_3;

    @FXML
    private MenuItem MenuLvl_4;

    @FXML
    private MenuItem MenuLvl_5;

    @FXML
    private MenuItem GameInstructions;

    @FXML
    private MenuItem AboutGame;

    @FXML
    private MenuItem QuitGame;

    @FXML
    private Button ResetLevel;

    @FXML
    private TextField MoveNum;

    @FXML
    private TextField LevelNum;

    @FXML
    public static GridPane LevelArea;
    
    
    @FXML
    void closeGame(ActionEvent event) {
    System.exit(0);	
    }

    @FXML
    void resetLevel(ActionEvent event) {
    	SokobanGame.resetLevel(lvl, level);
    	System.out.println("level reset");
    }

    @FXML
    void selectLvl_1(ActionEvent event) {
    	level = 1;
    	SokobanGame.selectLevel(lvl, level);
    	System.out.println(level);
    }

    @FXML
    void selectLvl_2(ActionEvent event) {
    	level = 2;
    	SokobanGame.selectLevel(lvl, level);
    	System.out.println(level);
    }

    @FXML
    void selectLvl_3(ActionEvent event) {
    	level = 3;
    	SokobanGame.selectLevel(lvl, level);
    	System.out.println(level);
    }

    @FXML
    void selectLvl_4(ActionEvent event) {
    	level = 4;
    	SokobanGame.selectLevel(lvl, level);
    	System.out.println(level);
    }

    @FXML
    void selectLvl_5(ActionEvent event) {
    	level = 5;
    	SokobanGame.selectLevel(lvl, level);
    	System.out.println(level);
    }

    @FXML
    void showAboutGame(ActionEvent event) {

    }

    @FXML
    void showGameInstrc(ActionEvent event) {

    }

}
