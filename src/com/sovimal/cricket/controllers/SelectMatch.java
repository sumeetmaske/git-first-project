package com.sovimal.cricket.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class SelectMatch {

    @FXML
    private VBox selectMatchVbox;

    @FXML
    public void closeWindow(){

        Controller.bPane.getChildren().removeAll(selectMatchVbox);
    }
}
