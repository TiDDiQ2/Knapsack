
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.RED;

public class sampleTest extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Text text = new Text("Hi how are you");
        text.setFont(Font.font("verdana", FontWeight.BOLD,
                FontPosture.REGULAR, 20));
        text.setX(50); text.setY(75);
        text.setStrikethrough(true);

        Text text2 = new Text("Welcome To Tutorialspoint");
        text2.setFont(Font.font("verdana", FontWeight.BOLD,
                FontPosture.REGULAR, 20));
        text2.setX(50); text2.setY(110);
        text2.setUnderline(true);

        Group root = new Group(text, text2);
        Scene scene = new Scene(root, 600, 300);
        primaryStage.setTitle("Sample Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
