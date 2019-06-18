package com.jasiek.test.additives;

import com.jasiek.test.reports.Singleton;
import javafx.stage.FileChooser;

import java.io.File;

public class FileSelect {
    public String filePath = new String();

    public File openFile(){
        try{
            FileChooser fileChooser = new FileChooser();
            FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Select a File(*.cad)", "*.cad");
            fileChooser.getExtensionFilters().add(filter);
            fileChooser.setTitle("Select a project of building");
            File file = fileChooser.showOpenDialog(null);

            filePath = file.getPath();

            file = new File(filePath);

            return file;
        }
        catch(NullPointerException e) {
            System.out.println("You don't choose a file. Try again.");
        }
        return null;
    }

}
