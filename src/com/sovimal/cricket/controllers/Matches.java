package com.sovimal.cricket.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class Matches {

    @FXML
    private VBox matchesVbox;
    //close matches scene
    @FXML
    public void closeMatches(){

        Controller.bPane.getChildren().removeAll(matchesVbox);
    }
}
