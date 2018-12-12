/* Matt Nicol
 * OOP Sokoban v0.2
 * 06/12/18
 * Eclipse V2018-09 4.9.0 
 */

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SokobanController {

    @FXML
    private MenuBar MenuBar;

    @FXML
    private Button ResetLevel;

    @FXML
    private TextField MoveNum;

    @FXML
    private TextField LevelNum;

    @FXML
    private VBox LevelArea;

    @FXML
    void resetLevel(ActionEvent event) {

    }

}

