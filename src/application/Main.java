/* Edward Diaz Lopez (gft586) Main class */
package application;
	
import javafx.application.Application;	
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.fxml.FXMLLoader;

/*
 * The Main class runs JavaFX and opens the Main Menu screen (Main.fxml)
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			SplitPane root = (SplitPane)FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root,625,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("A THOUSAND HANDS");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * main contains the launch command to execute javafx
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
