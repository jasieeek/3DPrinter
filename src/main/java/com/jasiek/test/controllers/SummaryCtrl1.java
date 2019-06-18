package com.jasiek.test.controllers;

import com.jasiek.test.reports.Singleton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class SummaryCtrl1 {
    @FXML
    private TextArea whatPrint;
    @FXML
    private TextArea parameters;

    @FXML
    public void back(ActionEvent event) throws IOException {
        System.out.println("Powrot do wyboru projektu");
        Parent back = FXMLLoader.load((getClass().getResource("/fxml/loadProjectScene.fxml")));
        Scene chooseProjectScene = new Scene(back);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(chooseProjectScene);
        window.setResizable(false);
        window.show();
    }

    @FXML
    public void goToPrint(ActionEvent event) {
        System.out.println("Przejscie do drukowania");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("InformationAlert");
        alert.setContentText("Printing:\n" + whatPrint.getText() + "\nParameters:\n" + parameters.getText());
        alert.showAndWait();
    }

    @FXML
    public void initialize(){
        Singleton s = Singleton.getInstance();
        whatPrint.appendText(s.getNameObject() + "\nPath to project: \n" + s.getPathToProject());
        parameters.appendText("Concrete mix: " + s.getConcreteMix() +
                "\nWall thickness: " + s.getWallThickness() +
                "\nPrint speed: " + s.getPrintSpeed());
    }
}
