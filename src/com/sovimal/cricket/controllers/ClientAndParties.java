package com.sovimal.cricket.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ClientAndParties {
    @FXML
    private VBox clientpartiesVbox;

    @FXML
    private AnchorPane clientandpartiesAncherpane;

    @FXML
    private VBox newClientVBox;
    public static FXMLLoader loader;
    public static Stage stageClient;
    public static AnchorPane staticAncherPane;

    public void initialize(){
        staticAncherPane = clientandpartiesAncherpane;
    }

    @FXML
    public void newclient(){

        loader = new FXMLLoader(getClass().getResource("../design/newclient.fxml"));
        stageClient = new Stage();
        try{
            newClientVBox = (VBox) loader.load();
           ((AnchorPane)clientandpartiesAncherpane).getChildren().add(newClientVBox);
//            Scene scene = new Scene(newClientVBox);
//            stageClient.setScene(scene);
//            stageClient.initStyle(StageStyle.UNDECORATED);
//            stageClient.show();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @FXML
    public void closeClientAndParties(){
        Controller.bPane.getChildren().removeAll(clientandpartiesAncherpane);
    }
}
