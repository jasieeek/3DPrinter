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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class LoadPatternCtrl{

    @FXML
    private ImageView imgView;
    @FXML
    private Label caption;

    public String chooseMenu = "";

    @FXML
    public void back(ActionEvent event) throws IOException {
        System.out.println("Powrot do ustawien parametrow 2");
        Parent back = FXMLLoader.load((getClass().getResource("/fxml/setParametres2Scene.fxml")));
        Scene setParametresScene = new Scene(back);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(setParametresScene);
        window.setResizable(false);
        window.show();
    }

    @FXML
    public void choosePattern(ActionEvent event) throws IOException {
        if(chooseMenu.isEmpty()){
            System.out.println("Wybierz wzorzec!");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("WarningAlert");
            alert.setContentText("Choose a pattern!");
            alert.showAndWait();
        }
        else{
            Singleton s = Singleton.getInstance();
            s.setNameObject(chooseMenu);
            s.setPathToProject("null");
            s.toText();
            System.out.println("Przejscie do podsumowania");
            Parent go = FXMLLoader.load((getClass().getResource("/fxml/summaryScene2.fxml")));
            Scene summaryScene = new Scene(go);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(summaryScene);
            window.setResizable(false);
            window.show();
        }
    }

    @FXML
    public void chooseProject(ActionEvent event) throws IOException {
        FileSelect select = new FileSelect();
        try{
            String projectPath = select.openFile().getAbsolutePath();
            Singleton s = Singleton.getInstance();
            s.setPathToProject(projectPath);
            s.setNameObject("Object from project");
            System.out.println("Przejscie do podsumowania2");
            Parent go = FXMLLoader.load((getClass().getResource("/fxml/summaryScene2.fxml")));
            Scene summary2Scene = new Scene(go);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(summary2Scene);
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

    @FXML
    public void menuAirbrick1(ActionEvent event) {
        Image img = new Image("/img/airBrick1.jpg");
        chooseMenu = "Air brick 1\nDIM(490mm/240mm/240mm)";
        caption.setText(chooseMenu);
        imgView.setImage(img);
    }

    @FXML
    public void menuAirbrick2(ActionEvent event) {
        Image img = new Image("/img/airBrick2.png");
        chooseMenu = "Air brick 2\nDIM(490mm/240mm/240mm)";
        caption.setText(chooseMenu);
        imgView.setImage(img);
    }

    @FXML
    public void menuBlock(ActionEvent event) {
        Image img = new Image("/img/block.jpg");
        chooseMenu = "Block\nDIM(500mm/250mm/100mm)";
        caption.setText(chooseMenu);
        imgView.setImage(img);
    }

    @FXML
    public void menuRing(ActionEvent event) {
        Image img = new Image("/img/ring.jpg");
        chooseMenu = "Ring\nDIM(900mm/900mm/1300mm)";
        caption.setText(chooseMenu);
        imgView.setImage(img);
    }

    @FXML
    public void menuPot1(ActionEvent event) {
        Image img = new Image("/img/plant_pot1.jpg");
        chooseMenu = "Plant pot 1\nDIM(200mm/200mm/400mm)";
        caption.setText(chooseMenu);
        imgView.setImage(img);
    }

    @FXML
    public void menuPot2(ActionEvent event) {
        Image img = new Image("/img/plant_pot2.jpg");
        chooseMenu = "Plant pot 2\nDIM(150mm/150mm/300mm)";
        caption.setText(chooseMenu);
        imgView.setImage(img);
    }


}