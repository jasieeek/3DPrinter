package com.jasiek.test.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChooseObjectCtrl {
    public boolean whatPrint;     //true = buildings, false = simple 3D object

    @FXML
    public void back(ActionEvent event) throws IOException {
        //powrot do wyboru objektu
        System.out.println("powrot do wyboru objektu");
        Parent back = FXMLLoader.load((getClass().getResource("/fxml/mainScene.fxml")));
        Scene mainScene = new Scene(back);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainScene);
        window.show();
    }

    @FXML
    public void buildingChoose(ActionEvent event) throws IOException {
        //przejscie do ustawien parametrow 2
        whatPrint = true;
        System.out.println("przejscie do ustawien parametrow 1");
        Parent goNext = FXMLLoader.load((getClass().getResource("/fxml/setParametres1Scene.fxml")));
        Scene setParametres2Scene = new Scene(goNext);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(setParametres2Scene);
        window.setResizable(false);
        window.show();

    }

    @FXML
    public void simpleObjectChoose(ActionEvent event) throws IOException {
        //przejscie do ustawien parametrow 1
        whatPrint = false;
        System.out.println("przejscie do ustawien parametrow 2");
        Parent goNext = FXMLLoader.load((getClass().getResource("/fxml/setParametres2Scene.fxml")));
        Scene setParametres1Scene = new Scene(goNext);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(setParametres1Scene);
        window.setResizable(false);
        window.show();
    }
}
