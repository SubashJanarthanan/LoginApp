package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * The Class LoginController.
 * 
 * @author Subash
 */
public class LoginController {

	/** The actiontarget. */
	@FXML
	private Text actiontarget;

	/**
	 * Handle submit button action.
	 *
	 * @param event the event
	 */
	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
		actiontarget.setText("Welcome to JavaFx login");
		
	}

}
