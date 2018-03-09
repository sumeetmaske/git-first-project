package com.sovimal.cricket.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;


public class NewClient {

    @FXML
    private VBox newClientVBox;

    @FXML
    public void closewindow(){
        ClientAndParties.staticAncherPane.getChildren().removeAll(newClientVBox);
    }
}
