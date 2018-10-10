import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Handler;


public class Main extends Application {

    public static Servicebook serviceBook;

    public static void main(String[] args) {

        Date date = new Date(26, 8, 1991);

        Date date1 = new Date(27, 8, 1991);

        Date date2 = new Date(1, 12, 1018);

        Service service = new Service(100000, date);

        Service service1 = new Service(120000, date1);

        Service service2 = new Service(50000, date2);

        serviceBook = new Servicebook();

        serviceBook.addService(service);

        serviceBook.addService(service1);

        serviceBook.addService(service2);

        System.out.println(serviceBook.hasServiceOnDate(new Date(26, 8, 1991)));
        System.out.println(serviceBook.getMostRecent());


        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Welcome to JavaFX");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label daylabel = new Label("Day");
        grid.add(daylabel, 0, 1);

        TextField dayTextField = new TextField();
        grid.add(dayTextField, 1, 1);

        Label monthLabel = new Label("Month");
        grid.add(monthLabel, 0, 2);

        TextField monthTextField = new TextField();
        grid.add(monthTextField, 1, 2);

        Label yearlabel = new Label("Year");
        grid.add(yearlabel, 0, 3);

        TextField yearTextField = new TextField();
        grid.add(yearTextField, 1, 3);

        Label mileagelabel = new Label("Mileage");
        grid.add(mileagelabel, 0, 4);

        TextField mileageTextField = new TextField();
        grid.add(mileageTextField, 1, 4);

        Label datelabel = new Label("Date and Mileage");
        grid.add(datelabel, 0, 6);


        TextArea output = new TextArea();
        grid.add(output, 1, 6, 2, 10);


        Button btn = new Button("Add Service");
        HBox hbBnt = new HBox(10);
        hbBnt.setAlignment(Pos.BOTTOM_RIGHT);
        hbBnt.getChildren().add(btn);
        grid.add(hbBnt, 1, 20);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);


        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                try {
                    String dayText = dayTextField.getText();
                    int dayInt = Integer.parseInt(dayText);

                    String monthText = monthTextField.getText();
                    int monthInt = Integer.parseInt(monthText);

                    String yearText = yearTextField.getText();
                    int yearInt = Integer.parseInt(yearText);

                    String mileageText = mileageTextField.getText();
                    int mileageInt = Integer.parseInt(mileageText);

                    Date date = new Date(dayInt, monthInt, yearInt);

                    Service service = new Service(mileageInt, date);

                    serviceBook.addService(service);


                    output.appendText(serviceBook.toString() + "\n");

                } catch (Exception e) {
                    System.err.println("Caught Exception:" + e.getMessage());
                }
            }

            });

            Scene scene = new Scene(grid, 600, 675);
        primaryStage.setScene(scene);
        primaryStage.show();


        }

    }