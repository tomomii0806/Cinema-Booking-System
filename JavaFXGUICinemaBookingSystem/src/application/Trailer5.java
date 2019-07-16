package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Trailer5 implements Initializable {

    
	@FXML
	private MediaView mv;
	
	private MediaPlayer mp;
	
	private Media m;
	
	
	

public void stop(ActionEvent event) {
	mp.stop();
}





@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	String path = new File("src/image/media.io_alita-battle-angel-trailer-1_h720p.mp4").getAbsolutePath();
	m = new Media(new File(path).toURI().toString());
	//m = new Media(path);
	mp = new MediaPlayer(m);
	mv.setMediaPlayer(mp);
	mp.setAutoPlay(true);
	DoubleProperty width = mv.fitWidthProperty();
	DoubleProperty height = mv.fitHeightProperty();
	width.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
	height.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));

}

}
