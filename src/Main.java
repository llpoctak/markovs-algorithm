import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	public static Main inst;

	public Stage stage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			inst = this;

			FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("Main.fxml"));
            Scene scene = new Scene((AnchorPane)loader.load());

			stage = primaryStage;

			primaryStage.setTitle("Markov's normal algorithms");
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
