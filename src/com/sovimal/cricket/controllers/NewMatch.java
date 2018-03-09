package com.sovimal.cricket.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class NewMatch {



    @FXML
    private VBox newMathVBox;

    //close create new match scene.
    @FXML
    public void closeNewMatch(){

        Controller.bPane.getChildren().removeAll(newMathVBox);
    }
}
