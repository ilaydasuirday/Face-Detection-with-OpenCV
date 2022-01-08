module JavaFx {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires javafx.fxml;
    requires javafx.media;
    requires java.compiler;
    requires java.desktop;


    opens FaceDetection;
}