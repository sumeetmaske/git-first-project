package com.sovimal.cricket.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class AuthenticationController {

    @FXML
    private VBox authVbox;
    @FXML
    public void closeAuth(){

        Controller.bPane.getChildren().removeAll(authVbox);
    }
}
