package com.jasiek.test.reports;

import javafx.scene.control.CheckBox;

public class GenerateReportObject {
    public void generate(CheckBox mixA, CheckBox mixB, CheckBox fillA, CheckBox speedA){
        Singleton s = Singleton.getInstance();
        s.setWhatPrint(2);
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
        if(fillA.isSelected()){
            s.setFill(20);
        }
        else{
            s.setFill(30);
        }
        //print speed
        if(speedA.isSelected()){
            s.setPrintSpeed(200);
        }
        else{
            s.setPrintSpeed(400);
        }
        System.out.println(s.toText());
    }
}
