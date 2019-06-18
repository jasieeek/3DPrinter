package com.jasiek.test;

        import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.stage.Stage;
        import javafx.stage.StageStyle;

public class FxApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/mainScene.fxml"));

        stage.setScene(new Scene(root));
        stage.initStyle(StageStyle.DECORATED);
        stage.setResizable(false);
        stage.setTitle("3D Printer Interface");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
