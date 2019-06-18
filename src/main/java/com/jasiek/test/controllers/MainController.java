package com.jasiek.test.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;


import java.io.IOException;

public class MainController extends SetParametersCtrl{

    @FXML
    public void goPrint(ActionEvent event) throws IOException {
        super.back(event);

    }

    @FXML
    public void info(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("InfoAlert");
        alert.setContentText("The program is used for easy and pleasant " +
                "setting of all necessary parameters for 3D printing." +
                "The program has 5 windows:\n   " +
                "1. The start window The main window in which you can see information about the program, go to the selection of the object and exit the program.\n   " +
                "2. Selection of the object In this window, the user chooses what he wants to print.\n   " +
                "3. Setting the parameters Here, the user sets the print parameters of his project.\n   " +
                "4. Design / pattern selection In the last step, the user selects the path of the project file or the object pattern.\n   " +
                "5. Summary At the end of the summary with everything that is needed for a 3d printer for printing.");
        alert.showAndWait();
    }

    @FXML
    public void exit(ActionEvent event){
        System.exit(0);
    }
}
