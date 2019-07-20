package application;

import java.io.File;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class TrailerController implements Initializable{

	ArrayList<Movie> movies = new ArrayList<>();
	
	@FXML
	private ChoiceBox<String> choiceMovie;
	@FXML
	private ChoiceBox<String> choiceTime;
	@FXML
	private TextField choiceTicket;
	@FXML
	private Label title;
	@FXML
	private Label time;
	@FXML
	private Label ticket;
	@FXML
	private Label price;
	@FXML
	private Button infinityTitle;
	@FXML
	private Button pikachuTitle;
	@FXML
	private Button interstellerTitle;
	@FXML
	private Button endgameTitle;
	@FXML
	private Button alitaTitle;
	@FXML
	private Button poohTitle;
	@FXML
	private Button infinityWar;
	@FXML
	private Button detectivePikachu;
	@FXML
	private Button intersteller;
	@FXML
	private Button endGame;
	@FXML
	private Button alita;
	@FXML
	private Button pooh;
	
	
	private static double TICKET_PRICE_3D = 17.0;
	private static double TICKET_PRICE_2D = 12.0;

	
		
	
	public void playTrailer(ActionEvent event) throws Exception {
		try {	
					Stage primatyStage = new Stage();
					Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
					Scene scene = new Scene(root ); 
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

					// TODO: Set scene to be the scene for stage and show the stage
					primatyStage.setScene(scene);				
					primatyStage.show();
							
		} catch (IOException e) {
			e.printStackTrace();
		}
			}

	
	public void playTrailer2(ActionEvent event) throws Exception {
		try {
				Stage primatyStage = new Stage();
					Parent root = FXMLLoader.load(getClass().getResource("/application/Trailer2.fxml"));
					Scene scene = new Scene(root ); 
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

					// TODO: Set scene to be the scene for stage and show the stage
					primatyStage.setScene(scene);
					primatyStage.show();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
			}
	
	public void playTrailer3(ActionEvent event) throws Exception {
		try {
					Stage primatyStage = new Stage();
					Parent root = FXMLLoader.load(getClass().getResource("/application/Trailer3.fxml"));
					Scene scene = new Scene(root ); 
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primatyStage.setScene(scene);
					primatyStage.show();
	
		} catch (IOException e) {
			e.printStackTrace();
		}
			}
	
	public void playTrailer4(ActionEvent event) throws Exception {
		try {
					Stage primatyStage = new Stage();
					Parent root = FXMLLoader.load(getClass().getResource("/application/Trailer4.fxml"));
					Scene scene = new Scene(root ); 
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primatyStage.setScene(scene);
					primatyStage.show();
					
		
		} catch (IOException e) {
			e.printStackTrace();
		}
			}
	
	public void playTrailer5(ActionEvent event) throws Exception {
		try {
					Stage primatyStage = new Stage();
					Parent root = FXMLLoader.load(getClass().getResource("/application/Trailer5.fxml"));
					Scene scene = new Scene(root ); 
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primatyStage.setScene(scene);
					primatyStage.show();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
			}
	
	public void playTrailer6(ActionEvent event) throws Exception {
		try {
					Stage primatyStage = new Stage();
					Parent root = FXMLLoader.load(getClass().getResource("/application/Trailer6.fxml"));
					Scene scene = new Scene(root ); 
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primatyStage.setScene(scene);
					primatyStage.show();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
			}
	
	
	Movie one = new Movie("Avengers: Infinity War(2D)", "2h 29min", "Anthony Russo", "Robert Downey Jr", "2019-01-02", "15:30");
	Movie two = new Movie("Alita: Battle Angel (2D)", "2h 02min", "Robert Rodriguez", "Rosa Salazar", "2019-01-02", "12:30");
	Movie three = new Movie("Intersteller (3D)", "2h 49min", "Christopher Nolan", "Matthew McConaughey", "2019-01-02", "17:30");
	Movie four = new Movie("Avengers: Endgame (3D)", "2h 29min", "Anthony Russo", "Robert Downey Jr", "2019-01-02", "16:30");
	Movie five = new Movie("Christopher Robin (2D)", "1h 44min", "Marc Forster", "Ewan McGregor", "2019-01-02", "12:00");
	Movie six = new Movie("Pokémon Detective Pikachu (2D)", "2h 49min", "Rob Letterman", "Ryan Reynolds", "2019-01-02", "20:15");

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		// Constructor for movies
		Movie m = new Movie(0, 0);
		
		movies.add(one);
		movies.add(two);
		movies.add(three);
		movies.add(four);
		movies.add(five);
		movies.add(six);
		
		
		//:::::::::::::::::::::::: ChoiceBox Add Movies :::::::::::::::::::::::::::
		
		choiceMovie.getItems().add(one.getTitle());	
		choiceMovie.getItems().add(two.getTitle());	
		choiceMovie.getItems().add(three.getTitle());	
		choiceMovie.getItems().add(four.getTitle());	
		choiceMovie.getItems().add(five.getTitle());	
		choiceMovie.getItems().add(six.getTitle());	
	
		
		//:::::::::::::::::::::::: ChoiceBox Add Time :::::::::::::::::::::::::::::
		
		choiceTime.getItems().add("12:00");
		choiceTime.getItems().add("16:30");
		choiceTime.getItems().add("20:15");
		
		
	}	
	
	
	
	public void purchace(ActionEvent event) {
		String movieSelection = (String) choiceMovie.getValue();
		if(movieSelection==null){
		MessageBox.show("Please select a movie!","ERROR");
		return;
		}
		String timeSelection = (String) choiceTime.getValue();
		if(timeSelection==null){
		MessageBox.show("Please select a time!","ERROR");
		return;
		}
		Integer numTickets = null;
		try{
		numTickets = Integer.parseInt(choiceTicket.getText());
		}catch(Exception e){
		MessageBox.show("Please enter a number for the number of tickets!","ERROR");
		return;
		}
		
			
			double totalCost = 0;
			if(movieSelection.endsWith("(2D)")){
			totalCost = numTickets * TICKET_PRICE_2D;
			}else{
			totalCost = numTickets * TICKET_PRICE_3D;
			}
			
			String image = null;
			if (movieSelection == one.getTitle())
			{
				image = "image/infinityWar(img).jpg";
			}
			else if (movieSelection == two.getTitle())
			{
				image = "image/alita.jpg";
			}
			else if (movieSelection == three.getTitle())
			{
				image = "image/intersteller.jpg";
			}
			else if (movieSelection == four.getTitle())
			{
				image = "image/endgame.jpg";
			}
			else if (movieSelection == five.getTitle())
			{
				image = "image/pooh.jpg";
			}
			else if (movieSelection == six.getTitle())
			{
				image = "image/pikachu.jpg";
			}
			
			MessageBox.showConfirmation(movieSelection, ""+totalCost, timeSelection, choiceTicket.getText(), "Please confirm your purchase..", image);
			
			
	
		
	}
	
	public void popup1(ActionEvent event) {
		
	String title = "Avengers: Infinity War";
	String discr = "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment, the fate of Earth and existence has never been more uncertain.";
	String img = "image/infinityWar(new).jpg";
	String cast = " Brie Larson, Bradley Cooper, Scarlett Johansson";
	MessageBox.description(img, title, discr, cast);
	
	}
	
	public void popup2(ActionEvent event) {
		
		String title = "Detective Pikachu";
		String discr = "A young man joins forces with Detective Pikachu to unravel the mystery behind his father's disappearance. Chasing clues through the streets of Ryme City, the dynamic duo soon discover a devious plot that poses a threat to the Pokémon universe.";
		String img = "image/pikachu(new).jpg";
		String cast = " Ryan Reynolds, Suki Waterhouse, Kathryn Newton";
		MessageBox.description(img, title, discr, cast);
		
		}
	
	public void popup3(ActionEvent event) {
		
		String title = "Interstellar";
		String discr = "In Earth's future, a global crop blight and second Dust Bowl are slowly rendering the planet uninhabitable. Professor Brand (Michael Caine), a brilliant NASA physicist, is working on plans to save mankind by transporting Earth's population to a new home via a wormhole. But first, Brand must send former NASA pilot Cooper (Matthew McConaughey) and a team of researchers through the wormhole and across the galaxy to find out which of three planets could be mankind's new home.";
		String img = "image/intersteller(new).jpg";
		String cast = "Matthew McConaughey, Anne Hathaway, Jessica Chastain";
		MessageBox.description(img, title, discr, cast);
		
		}
	
	public void popup4(ActionEvent event) {
		
		String title = "Avengers: End Game";
		String discr = "Adrift in space with no food or water, Tony Stark sends a message to Pepper Potts as his oxygen supply starts to dwindle. Meanwhile, the remaining Avengers -- Thor, Black Widow, Captain America and Bruce Banner -- must figure out a way to bring back their vanquished allies for an epic showdown with Thanos -- the evil demigod who decimated the planet and the universe.";
		String img = "image/endgame(new).jpg";
		String cast = " Brie Larson, Bradley Cooper, Scarlett Johansson";
		MessageBox.description(img, title, discr, cast);
		
		}
	
	public void popup5(ActionEvent event) {
		
		String title = "Alita: Buttle Angel";
		String discr = "Set several centuries in the future, the abandoned Alita is found in the scrapyard of Iron City by Ido, a compassionate cyber-doctor who takes the unconscious cyborg Alita to his clinic. When Alita awakens, she has no memory of who she is, nor does she have any recognition of the world she finds herself in. As Alita learns to navigate her new life and the treacherous streets of Iron City, Ido tries to shield her from her mysterious past.";
		String img = "image/alita(new).jpg";
		String cast = "Rosa Salazar, Christoph Waltz, Jennifer Connelly ";
		MessageBox.description(img, title, discr, cast);
		
		}
	
	public void popup6(ActionEvent event) {
		
		String title = "Christopher Robin";
		String discr = "Christopher Robin -- now a family man living in London -- receives a surprise visit from his old childhood pal, Winnie-the-Pooh. With Christopher's help, Pooh embarks on a journey to find his friends -- Tigger, Eeyore, Owl, Piglet, Rabbit, Kanga and Roo. Once reunited, the lovable bear and the gang travel to the big city to help Christopher rediscover the joy of life.";
		String img = "image/pooh(new).jpg";
		String cast = " Ewan McGregor, Hayley Atwell, Bronte Carmichael ";
		MessageBox.description(img, title, discr, cast);
		
		}
	
	
	public void handleBtn1(MouseEvent e) {
		infinityTitle.setScaleX(1.3);
		infinityTitle.setScaleY(1.3);
		infinityTitle.setScaleZ(1.3);
	}
	
	public void handleBtn1Exit(MouseEvent e) {
		infinityTitle.setScaleX(1);
		infinityTitle.setScaleY(1);
		infinityTitle.setScaleZ(1);
	}
	
	public void handleBtn2(MouseEvent e) {
		pikachuTitle.setScaleX(1.3);
		pikachuTitle.setScaleY(1.3);
		pikachuTitle.setScaleZ(1.3);
	}
	
	public void handleBtn2Exit(MouseEvent e) {
		pikachuTitle.setScaleX(1);
		pikachuTitle.setScaleY(1);
		pikachuTitle.setScaleZ(1);
	}
	
	public void handleBtn3(MouseEvent e) {
		interstellerTitle.setScaleX(1.3);
		interstellerTitle.setScaleY(1.3);
		interstellerTitle.setScaleZ(1.3);
	}
	
	public void handleBtn3Exit(MouseEvent e) {
		interstellerTitle.setScaleX(1);
		interstellerTitle.setScaleY(1);
		interstellerTitle.setScaleZ(1);
	}
	
	public void handleBtn4(MouseEvent e) {
		endgameTitle.setScaleX(1.3);
		endgameTitle.setScaleY(1.3);
		endgameTitle.setScaleZ(1.3);
	}
	
	public void handleBtn4Exit(MouseEvent e) {
		endgameTitle.setScaleX(1);
		endgameTitle.setScaleY(1);
		endgameTitle.setScaleZ(1);
	}
	
	public void handleBtn5(MouseEvent e) {
		alitaTitle.setScaleX(1.3);
		alitaTitle.setScaleY(1.3);
		alitaTitle.setScaleZ(1.3);
	}
	
	public void handleBtn5Exit(MouseEvent e) {
		alitaTitle.setScaleX(1);
		alitaTitle.setScaleY(1);
		alitaTitle.setScaleZ(1);
	}
	
	public void handleBtn6(MouseEvent e) {
		poohTitle.setScaleX(1.3);
		poohTitle.setScaleY(1.3);
		poohTitle.setScaleZ(1.3);
	}
	
	public void handleBtn6Exit(MouseEvent e) {
		poohTitle.setScaleX(1);
		poohTitle.setScaleY(1);
		poohTitle.setScaleZ(1);
	}
	
	public void enter1(MouseEvent e) {
		infinityWar.setScaleX(1.3);
		infinityWar.setScaleY(1.3);
		infinityWar.setScaleZ(1.3);
	}
	
	public void exit1(MouseEvent e) {
		infinityWar.setScaleX(1);
		infinityWar.setScaleY(1);
		infinityWar.setScaleZ(1);
	
		}
	public void enter2(MouseEvent e) {
		detectivePikachu.setScaleX(1.3);
		detectivePikachu.setScaleY(1.3);
		detectivePikachu.setScaleZ(1.3);
	}
	
	public void exit2(MouseEvent e) {
		detectivePikachu.setScaleX(1);
		detectivePikachu.setScaleY(1);
		detectivePikachu.setScaleZ(1);
	}
	public void enter3(MouseEvent e) {
		intersteller.setScaleX(1.3);
		intersteller.setScaleY(1.3);
		intersteller.setScaleZ(1.3);
	}
	
	public void exit3(MouseEvent e) {
		intersteller.setScaleX(1);
		intersteller.setScaleY(1);
		intersteller.setScaleZ(1);
	}
	public void enter4(MouseEvent e) {
		endGame.setScaleX(1.3);
		endGame.setScaleY(1.3);
		endGame.setScaleZ(1.3);
	}
	
	public void exit4(MouseEvent e) {
		endGame.setScaleX(1);
		endGame.setScaleY(1);
		endGame.setScaleZ(1);
	}
	public void enter5(MouseEvent e) {
		alita.setScaleX(1.3);
		alita.setScaleY(1.3);
		alita.setScaleZ(1.3);
	}
	
	public void exit5(MouseEvent e) {
		alita.setScaleX(1);
		alita.setScaleY(1);
		alita.setScaleZ(1);
	}
	public void enter6(MouseEvent e) {
		pooh.setScaleX(1.3);
		pooh.setScaleY(1.3);
		pooh.setScaleZ(1.3);
	}
	
	public void exit6(MouseEvent e) {
		pooh.setScaleX(1);
		pooh.setScaleY(1);
		pooh.setScaleZ(1);
	}
}	
