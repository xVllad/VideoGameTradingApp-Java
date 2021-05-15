package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Model.DataBase;
import sample.Model.Person;
import sun.security.util.Password;
import sample.Model.DataBase;
import javax.naming.Name;

public class Main extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("View/Login.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1600, 1000));
        primaryStage.show();

        DataBase.readXMLPerson();
        DataBase.readXMLGames();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
