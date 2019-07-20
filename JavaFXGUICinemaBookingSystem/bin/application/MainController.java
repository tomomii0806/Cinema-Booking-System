package application;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import application.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainController {

	private ArrayList<User> users = new ArrayList<>();
	
	@FXML
	private Label idStatus;	
	@FXML
	private TextField txtUsername;	
	@FXML
	private TextField txtPassword;	
	@FXML
	private Button loginBtn;
	
	
	public void Signin(ActionEvent event) {
		
		try {
			User user2 = new User(txtUsername.getText(), txtPassword.getText());
			users.add(user2);
			idStatus.setText("Signin Success");
			
			MessageBox.displayEndMessage("Welcome", "Your account is successfully activeted!", "Go to'Home' and select a movie");
			
			Stage primatyStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Pane root = FXMLLoader.load(getClass().getResource("/application/Trailer.fxml"));
			
			Scene scene = new Scene(root, 981, 513); 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// TODO: Set scene to be the scene for stage and show the stage
			primatyStage.setScene(scene);
			primatyStage.show();
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
    
	public void Login(ActionEvent event) {
		
		try {
			User user = new User("user", "pass");
			users.add(user);
			
			
			for (User u: users)
			{			
				if (txtUsername.getText().equals(u.getUsername()) && txtPassword.getText().equals(u.getPassword()))
				{
					idStatus.setText("Login Success");
					Stage primatyStage = new Stage();
					FXMLLoader loader = new FXMLLoader();
					Pane root = FXMLLoader.load(getClass().getResource("/application/Trailer.fxml"));
					
					Scene scene = new Scene(root, 981, 513); 
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					// TODO: Set scene to be the scene for stage and show the stage
					primatyStage.setScene(scene);
					primatyStage.show();
					
					
				}else {
					idStatus.setText("Login Failed");
				}
				
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
