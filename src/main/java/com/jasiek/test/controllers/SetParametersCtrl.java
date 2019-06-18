package com.jasiek.test.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class SetParametersCtrl  {
    @FXML
    protected CheckBox mixA, mixB, mixC;

    @FXML
    protected CheckBox thicknessA, thicknessB, thicknessC;

    @FXML
    protected CheckBox speedA, speedB;

    @FXML
    protected CheckBox fillA, fillB;

    public void back(ActionEvent event) throws IOException {
        System.out.println("Przejscie do kroku Co chcesz zbudowac?");
        Parent back = FXMLLoader.load((getClass().getResource("/fxml/chooseObjectScene.fxml")));
        Scene chooseObjectScene = new Scene(back);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(chooseObjectScene);
        window.setResizable(false);
        window.show();
    }

    @FXML
    public void actionMixA(ActionEvent event) {
        if(mixA.isSelected()){
            mixB.setSelected(false);
            mixC.setSelected(false);
        }
    }

    public void actionMixB(ActionEvent event) {
        if(mixB.isSelected()){
            mixA.setSelected(false);
            mixC.setSelected(false);
        }
    }

    public void actionMixC(ActionEvent event) {
        if(mixC.isSelected()){
            mixA.setSelected(false);
            mixB.setSelected(false);
        }
    }

    public void actionThicknessA(ActionEvent event) {
        if(thicknessA.isSelected()){
            thicknessB.setSelected(false);
            thicknessC.setSelected(false);
        }
    }

    public void actionThicknessB(ActionEvent event) {
        if(thicknessB.isSelected()){
            thicknessA.setSelected(false);
            thicknessC.setSelected(false);
        }
    }

    public void actionThicknessC(ActionEvent event) {
        if(thicknessC.isSelected()){
            thicknessA.setSelected(false);
            thicknessB.setSelected(false);
        }
    }

    public void actionFillA(ActionEvent event) {
        if(fillA.isSelected()){
            fillB.setSelected(false);
        }
    }

    public void actionFillB(ActionEvent event) {
        if(fillB.isSelected()){
            fillA.setSelected(false);
        }
    }

    public void actionSpeedA(ActionEvent event) {
        if(speedA.isSelected()){
            speedB.setSelected(false);
        }
    }

    public void actionSpeedB(ActionEvent event) {
        if(speedB.isSelected()){
            speedA.setSelected(false);
        }
    }

    public void guard(){
        if(mixA.isSelected() || mixB.isSelected() || mixC.isSelected()){
            if(thicknessA.isSelected() || thicknessB.isSelected() || thicknessC.isSelected()){
                if(speedA.isSelected() || speedB.isSelected()){
                    System.out.println("sd");
                }
            }
        }
    }

    public void warningAlert(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("WarningAlert");
        alert.setContentText("Set all parameters!");
        alert.showAndWait();
    }
}
