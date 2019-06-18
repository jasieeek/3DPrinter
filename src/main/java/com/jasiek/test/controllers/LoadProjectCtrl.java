package com.jasiek.test.controllers;

import com.jasiek.test.additives.FileSelect;
import com.jasiek.test.reports.Singleton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class LoadProjectCtrl extends SetParametres1Ctrl {

    @FXML
    public void back(ActionEvent event) throws IOException {
        System.out.println("Powrot do ustawien parametrow 1");
        Parent back = FXMLLoader.load((getClass().getResource("/fxml/setParametres1Scene.fxml")));
        Scene setParametresScene = new Scene(back);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(setParametresScene);
        window.setResizable(false);
        window.show();
    }

    @FXML
    public void chooseProject(ActionEvent event) throws IOException {
        FileSelect select = new FileSelect();
        try{
            String projectPath = select.openFile().getAbsolutePath();
            Singleton s = Singleton.getInstance();
            s.setPathToProject(projectPath);
            System.out.println("Przejscie do podsumowania1");
            Parent go = FXMLLoader.load((getClass().getResource("/fxml/summaryScene1.fxml")));
            Scene summary1Scene = new Scene(go);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(summary1Scene);
            window.setResizable(false);
            window.show();
        }
        catch (Exception e){
            System.out.println("Nie wybrano pliku!");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("WarningAlert");
            alert.setContentText("Don't choose a file!");
            alert.showAndWait();
        }

    }
}
