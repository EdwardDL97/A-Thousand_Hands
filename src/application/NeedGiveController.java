/*Edward Diaz Lopez (gft586) NeedGiveController class  */
package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/*
 * The NeedGiveController class combines the Inventory.fxml,NeedGive.fxml, and Main.fxml 
 * so user can switch between scenes. 
 * In the Need/Give screen there is a functionality where user can enter text and press the '+'
 * button to delete text and prompt a confirmation alert
 */

public class NeedGiveController {
	
	@FXML
	private TextField userText; // TextField that asks for userid needing/giving
	@FXML
	private TextField itemText; // TextField that asks for item needing/giving
	@FXML
	private TextField amountText; // TextField that asks for amount they are needing/giving
	
	/*
	 * Method message that clears text and creates a confirmation alert when the add button is pressed
	 * The method passes through ActionEvent called e
	 */
	@FXML
	private void message(ActionEvent e) {
		/*clears the text from TextFields userText, itemText, and amountText*/
		userText.clear();
		itemText.clear();
		amountText.clear();
		
		Alert a = new Alert(AlertType.NONE); 
		a.setAlertType(AlertType.CONFIRMATION); // set alert type 
		a.show(); // show the dialog
	}
	
	/*
	 * Method firstScene that returns user back to the firstScene(Main Menu)
	 * The method passes through ActionEvent called event
	 */
	@FXML
	public void firstScene(ActionEvent event) throws IOException {
		SplitPane view = (SplitPane)FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(view);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
		window.setTitle("A THOUSAND HANDS");
	}
	
	
	/*
	 * Method secondScene that returns user back to the secondScene(Need/Give Menu)
	 * The method passes through ActionEvent called event
	 */
	@FXML
	public void secondScene(ActionEvent event) throws IOException {
		Parent view = (SplitPane)FXMLLoader.load(getClass().getResource("NeedGive.fxml"));
		Scene scene = new Scene(view);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
		window.setTitle("A THOUSAND HANDS");
	}
		
	/*
	 * Method thirdScene that returns user back to the thirdScene(Inventory Menu)
	 * The method passes through ActionEvent called event
	 */
	@FXML
	public void thirdScene(ActionEvent event) throws IOException {
		Parent view = (SplitPane)FXMLLoader.load(getClass().getResource("Inventory.fxml"));
		Scene scene = new Scene(view);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
		window.setTitle("A THOUSAND HANDS");
		
	}
	
	
}