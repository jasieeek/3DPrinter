package com.jasiek.test.controllers;

import com.jasiek.test.reports.GenerateReportBuilding;
import com.jasiek.test.reports.GenerateReportObject;
import com.jasiek.test.reports.Singleton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SetParametres2Ctrl extends SetParametersCtrl {

    @FXML
    public void back(ActionEvent event) throws IOException {
        super.back(event);
    }

    @FXML

    public void next(ActionEvent event) throws IOException{
        if(mixA.isSelected() || mixB.isSelected() || mixC.isSelected()){
            if(fillA.isSelected() || fillB.isSelected()){
                if(speedA.isSelected() || speedB.isSelected()){
                    //GET INFO FROM CHECKBOXES
                    GenerateReportObject generateReport = new GenerateReportObject();
                    generateReport.generate(mixA, mixB, fillA, speedA);
                    System.out.println("Przejscie do wyboru projektu/obiektu");
                    Parent next = FXMLLoader.load((getClass().getResource("/fxml/loadPatternScene.fxml")));
                    Scene loadPatternScene = new Scene(next);

                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                    window.setScene(loadPatternScene);
                    window.setResizable(false);
                    window.show();
                }
                else{
                    System.out.println("Zaznacz wszystkie kolumny!");
                    super.warningAlert();
                }
            }
            else{
                System.out.println("Zaznacz wszystkie kolumny!");
                super.warningAlert();
            }
        }
        else{
            System.out.println("Zaznacz wszystkie kolumny!");
            super.warningAlert();
        }
    }

    @FXML
    public void actionMixA(ActionEvent event) {
        super.actionMixA(event);
    }

    @FXML
    public void actionMixB(ActionEvent event) {
        super.actionMixB(event);
    }

    @FXML
    public void actionMixC(ActionEvent event) {
        super.actionMixC(event);
    }

    @FXML
    public void actionFillA(ActionEvent event) {
        super.actionFillA(event);
    }

    @FXML
    public void actionFillB(ActionEvent event) {
        super.actionFillB(event);
    }


    @FXML
    public void actionSpeedA(ActionEvent event) {
        super.actionSpeedA(event);
    }

    @FXML
    public void actionSpeedB(ActionEvent event) {
        super.actionSpeedB(event);
    }


}
