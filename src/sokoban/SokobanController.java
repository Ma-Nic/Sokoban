/* Matt Nicol
 * OOP Sokoban v0.3
 * 12/12/18
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
    private GridPane LevelArea;

    @FXML
    void closeGame(ActionEvent event) {
    	
    }

    @FXML
    void resetLevel(ActionEvent event) {
    	SokobanGame.resetLevel(level);
    	System.out.println("level reset");
    }

    @FXML
    void selectLvl_1(ActionEvent event) {
    	level = 1;
    	SokobanGame.selectLevel(level);
    	System.out.println(level);
    }

    @FXML
    void selectLvl_2(ActionEvent event) {
    	level = 2;
    	SokobanGame.selectLevel(level);
    	System.out.println(level);
    }

    @FXML
    void selectLvl_3(ActionEvent event) {
    	level = 3;
    	SokobanGame.selectLevel(level);
    	System.out.println(level);
    }

    @FXML
    void selectLvl_4(ActionEvent event) {
    	level = 4;
    	SokobanGame.selectLevel(level);
    	System.out.println(level);
    }

    @FXML
    void selectLvl_5(ActionEvent event) {
    	level = 5;
    	SokobanGame.selectLevel(level);
    	System.out.println(level);
    }

    @FXML
    void showAboutGame(ActionEvent event) {

    }

    @FXML
    void showGameInstrc(ActionEvent event) {

    }

}
