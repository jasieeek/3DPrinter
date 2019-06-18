package com.jasiek.test.reports;

import javafx.scene.control.CheckBox;

public class GenerateReportBuilding {
    public void generate(CheckBox mixA, CheckBox mixB, CheckBox thicknessA, CheckBox thicknessB, CheckBox speedA){
        Singleton s = Singleton.getInstance();
        s.setWhatPrint(1);
        s.setNameObject("Building");
        if(mixA.isSelected()){
            s.setConcreteMix("Concrete with dispersed reinforcement");
        }
        else if(mixB.isSelected()){
            s.setConcreteMix("High-quality concrete");
        }
        else{
            s.setConcreteMix("Waterproof concrete");
        }
        //wall thickness
        if(thicknessA.isSelected()){
            s.setWallThickness(20);
        }
        else if(thicknessB.isSelected()){
            s.setWallThickness(30);
        }
        else{
            s.setWallThickness(40);
        }
        if(speedA.isSelected()){
            s.setPrintSpeed(200);
        }
        else{
            s.setPrintSpeed(400);
        }
        System.out.println(s.toText());
    }
}
