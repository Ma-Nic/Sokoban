/* Matt Nicol
 * OOP Sokoban v0.2
 * 06/12/18
 * Eclipse V2018-09 4.9.0 
 */


package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class SokobanDriver extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Parent root;
		try 
		{     
			Parent root = FXMLLoader.load(getClass().getResource("/src/resources/fxml/SokobanGUI.fxml"));
			Scene scene = new Scene(root);
			
			root.getStylesheets().add(getClass().getClassLoader().getResource("/src/application/application.css").toExternalForm());
	        primaryStage.setTitle("Let's Play Sokoban!");
			primaryStage.setScene(scene);
			primaryStage.show();
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
		
		
		
	}
}
