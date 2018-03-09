package com.sovimal.cricket.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class Declaration {
    @FXML
    private VBox declarationVbox;

    //close declaration window
    @FXML
    public void closeWindow(){

        Controller.bPane.getChildren().removeAll(declarationVbox);
    }
}
