package com.jasiek.test.reports;

public class Singleton {

    private static Singleton instance = null;

    private int whatPrint;           //0 = null, 1 = building, 2 = simple object
    private String concreteMix;
    private int wallThickness;
    private int fill;
    private int printSpeed;
    private String pathToProject;
    private String nameObject;

    private Singleton(){
        System.out.println("Singleton created!");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    public int getWhatPrint() {
        return whatPrint;
    }

    public String getConcreteMix() {
        return concreteMix;
    }

    public int getWallThickness() {
        return wallThickness;
    }

    public int  getFill() {
        return fill;
    }

    public int getPrintSpeed() {
        return printSpeed;
    }

    public void setWhatPrint(int whatPrint) {
        this.whatPrint = whatPrint;
    }

    public void setConcreteMix(String concreteMix) {
        this.concreteMix = concreteMix;
    }

    public void setWallThickness(int wallThickness) {
        this.wallThickness = wallThickness;
    }

    public void setFill(int fill) {
        this.fill = fill;
    }

    public void setPrintSpeed(int printSpeed) {
        this.printSpeed = printSpeed;
    }

    public String getPathToProject() {
        return pathToProject;
    }

    public void setPathToProject(String pathToProject) {
        this.pathToProject = pathToProject;
    }

    public String getNameObject() {
        return nameObject;
    }

    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }

    public String toText() {
        if(whatPrint == 1){
            return "ParameterReport{" +
                    "whatPrint = building" +
                    ", path to project = " + pathToProject +
                    ", concrete mix = " + concreteMix +
                    ", wall thickness = " + wallThickness + " cm" +
                    ", print speed = " + printSpeed + " mm/s" +
                    '}';
        }
        else if(whatPrint == 2){
            return "ParameterReport{" +
                    "whatPrint = simple 3D object" +
                    "name = " + nameObject +
                    ", concrete mix = " + concreteMix +
                    ", fill = " + fill + " cm" +
                    ", print speed = " + printSpeed + " mm/s" +
                    '}';
        }
        else{
            return "Blad";
        }
    }
}
