package application;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MessageBox {

	public static void show(String message, String title)
    {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        stage.setMinWidth(250);

        Label lbl = new Label();
        lbl.setText(message);
        lbl.setTextFill(Color.RED);
  
        Button btnOk = new Button();
        btnOk.setText("OK");
        btnOk.setOnAction(e -> stage.close());
        btnOk.setStyle("-fx-background-color : white");
        
		
        VBox pane = new VBox(20);
        pane.getChildren().addAll(lbl, btnOk);
        pane.setAlignment(Pos.CENTER);
        pane.setBackground(Background.EMPTY);
        Scene scene = new Scene(pane, 350, 200);
        scene.setFill(Color.BLACK);
        stage.setScene(scene);
        stage.showAndWait();
    }
	
	public static void description(String url, String title, String script, String cast) 
	{
		Stage stage = new Stage();
		stage.setTitle("Description"); 
		stage.initModality(Modality.APPLICATION_MODAL);
        stage.setMinWidth(250);

        AnchorPane pane = new AnchorPane();
      
        Label lbl = new Label();
        lbl.setText(title);
        lbl.setTextFill(Color.WHITE);
        lbl.setScaleX(2);
        lbl.setScaleY(2);        
        pane.setTopAnchor(lbl, 140.0);
        pane.setLeftAnchor(lbl, 300.0);
        
        Label lbl1 = new Label();
        lbl1.setText("Description:");
        lbl1.setTextFill(Color.WHITE);
        lbl1.setScaleX(1.3);
        lbl1.setScaleY(1.3);        
        pane.setTopAnchor(lbl1, 300.0);
        pane.setLeftAnchor(lbl1, 215.0);
        
        Label lbl2 = new Label(script);
        lbl2.setTextFill(Color.WHITE);
        lbl2.setPrefWidth(400);
        lbl2.setWrapText(true);
        pane.setTopAnchor(lbl2, 330.0);
        pane.setLeftAnchor(lbl2, 200.0);
       
        Label lbl3 = new Label();
        lbl3.setText("Cast : "+ cast);
        lbl3.setTextFill(Color.WHITE);
        pane.setTopAnchor(lbl3, 250.0);
        pane.setLeftAnchor(lbl3, 200.0);
        
        // Simple displays ImageView the image as is
        Image image = new Image(url);
        ImageView iv = new ImageView();
        iv.setImage(image);
        iv.setFitWidth(600.0);
        iv.setFitHeight(900.0);
        pane.setTopAnchor(iv, 0.0);
        pane.setLeftAnchor(iv, 100.0);
         
        Rectangle rec = new Rectangle(450,600);
        rec.setFill(Color.BLACK);
        pane.setTopAnchor(rec, 0.0);
        pane.setLeftAnchor(rec, 180.0);
        FadeTransition fade = new FadeTransition();
        fade.setFromValue(.65);
        fade.setNode(rec);
        fade.play();
        
        pane.getChildren().addAll(iv, rec, lbl, lbl1, lbl2, lbl3);
        pane.setBackground(Background.EMPTY);
        Scene scene = new Scene(pane, 800, 600);
        scene.setFill(Color.BLACK);
        stage.setScene(scene);
        stage.showAndWait();
	}
	
	public static void showConfirmation(String title, String price, String time, String ticket, String message, String url)
    {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        stage.setMinWidth(250);

        AnchorPane pane = new AnchorPane();
        
        
        
        Label lbl2 = new Label();
        lbl2.setText(title);
        lbl2.setTextFill(Color.WHITE);
        lbl2.setAlignment(Pos.BASELINE_LEFT);
        pane.setTopAnchor(lbl2, 40.0);
        pane.setLeftAnchor(lbl2, 30.0);
        
        Label lbl3 = new Label();
        lbl3.setText("Start Time: "+time);
        lbl3.setTextFill(Color.WHITE);
        pane.setTopAnchor(lbl3, 70.0);
        pane.setLeftAnchor(lbl3, 30.0);
        
        Label lbl4 = new Label();
        lbl4.setText(ticket+ " tickets");
        lbl4.setTextFill(Color.WHITE);
        pane.setTopAnchor(lbl4, 100.0);
        pane.setLeftAnchor(lbl4, 30.0);
        
        Label lbl5 = new Label();
        lbl5.setText("Price : $"+ price);
        lbl5.setTextFill(Color.WHITE);
        pane.setTopAnchor(lbl5, 130.0);
        pane.setLeftAnchor(lbl5, 30.0);
        
        Label lbl1 = new Label();
        lbl1.setText(message);
        lbl1.setTextFill(Color.WHITE);
        pane.setTopAnchor(lbl1, 220.0);
        pane.setLeftAnchor(lbl1, 100.0);
        
          	 
         // simple displays ImageView the image as is
        Image image = new Image(url);
        ImageView iv = new ImageView();
        iv.setImage(image);
        iv.setFitWidth(100.0);
        iv.setFitHeight(140.0);
        pane.setTopAnchor(iv, 45.0);
        pane.setLeftAnchor(iv, 250.0);
        
        
        Button btnOk = new Button();
        btnOk.setText("Confirm");
        btnOk.setOnAction(e -> displayEndMessage("Confirmation", "Thank you for your purchase!", "You are all set"));
        btnOk.setAlignment(Pos.CENTER_LEFT);
        pane.setTopAnchor(btnOk, 250.0);
        pane.setLeftAnchor(btnOk, 170.0);
        
        
		
        pane.getChildren().addAll(lbl1, lbl2, lbl3, lbl4, lbl5, iv, btnOk);
        pane.setBackground(Background.EMPTY);
        Scene scene = new Scene(pane, 400, 310);
        scene.setFill(Color.BLACK);
        stage.setScene(scene);
        stage.showAndWait();
    }
	
	public static void displayEndMessage(String title, String message1, String message2)
    {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        stage.setMinWidth(250);

        Label lbl1 = new Label();
        lbl1.setText(message1);
        lbl1.setTextFill(Color.WHITE);
  
        Label lbl2 = new Label();
        lbl2.setText(message2);
        lbl2.setTextFill(Color.WHITE);
  
        Button btn = new Button();
        btn.setText("Home");
        btn.setOnAction(e -> stage.close());
        btn.setStyle("-fx-background-color : white");
        
        
        VBox pane = new VBox(20);
        pane.getChildren().addAll(lbl1, lbl2, btn);
        pane.setAlignment(Pos.CENTER);
        pane.setBackground(Background.EMPTY);
        Scene scene = new Scene(pane, 300, 300);
        scene.setFill(Color.BLACK);
        stage.setScene(scene);
        stage.showAndWait();
    }
}
