package com.sovimal.cricket.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Controller {
    @FXML
    private VBox authVbox;

    @FXML
    public  BorderPane borderpane;

    @FXML
    private VBox newMathVBox;

    @FXML
    private AnchorPane clientandpartiesAncherpane;

    @FXML
    private VBox matchesVbox;

    @FXML
    private VBox selectMatchVbox;

    @FXML
    private VBox declarationVbox;


    private FXMLLoader loader;
    private Scene scene;
    public static Stage stage;
    public static BorderPane bPane;

public void initialize(){
    bPane = borderpane;
}

    //show login scene
    @FXML
    public void showAuthenticationDialog(){

         loader = new FXMLLoader(getClass().getResource("../design/authentication.fxml"));
            try {
                authVbox = (VBox) loader.load();
                borderpane.setCenter(authVbox);
            }catch (IOException e){
                e.printStackTrace();;
            }
    }
    //show create new match scene
    @FXML
    public void showCreateNeaMatch(){
        loader = new FXMLLoader(getClass().getResource("../design/newMatch.fxml"));
        try {
            newMathVBox = (VBox) loader.load();
            borderpane.setCenter(newMathVBox);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //show client and parties scene
    @FXML
    public void showClientandParties(){
        loader = new FXMLLoader(getClass().getResource("../design/clientandparties.fxml"));
        try{
            clientandpartiesAncherpane = (AnchorPane) loader.load();
            borderpane.setCenter(clientandpartiesAncherpane);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //open onclick www.sovimal.com home page
    @FXML
    public void openHyperLink(){
        try {
            Desktop.getDesktop().browse(new URI("http://www.sovimal.com/Default.aspx"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    //show matches scene
    @FXML
    public void matches(){

        loader = new FXMLLoader(getClass().getResource("../design/matches.fxml"));
        try{
            matchesVbox = (VBox) loader.load();
            borderpane.setCenter(matchesVbox);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //show select match scene
    @FXML
    public void selectMatches(){

        loader = new FXMLLoader(getClass().getResource("../design/selectmatch.fxml"));
        try{
            selectMatchVbox = (VBox) loader.load();
            borderpane.setCenter(selectMatchVbox);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //show declaration scene
    @FXML
    public void declaration(){
        loader = new FXMLLoader(getClass().getResource("../design/declaration.fxml"));
        try{
                declarationVbox = (VBox) loader.load();
                borderpane.setCenter(declarationVbox);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
