package com.cis2235.greenmartinrussp6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HelloController
{
    private final ObservableList<String> cmbList = FXCollections.observableArrayList
            ( "Dining Room", "Living Room", "Kitchen", "Master Bedroom", "Second Bedroom", "Bathroom",
            "Front Yard", "Garden", "Driveway");

    @FXML
    private Button btnCheckCloset;

    @FXML
    private ImageView ivGameMap;

    @FXML
    private Button btnExitTheGame;

    @FXML
    private Button btnGoHere;

    @FXML
    private Button btnGoThroughDoor;

    @FXML
    private ComboBox<String> cmbExits;

    @FXML
    private Label lblWelcomeText;

    @FXML
    private TextArea txtbGameSummary;

    @FXML
    void onActionCheckCloset(ActionEvent event) {

    }

    @FXML
    void onActionComboBoxEvent(ActionEvent event) {

    }

    @FXML
    void onActionExitGame(ActionEvent event) {

    }

    @FXML
    void onActionGoHere(ActionEvent event) {

    }

    @FXML
    void onActionGoThroughDoor(ActionEvent event) {

    }

    @FXML
    void onActionMouseEntered(MouseEvent event)
    {
        //Add bold and enlargement of save and summary button
        btnGoHere.setFont(Font.font("Comic San MS", FontWeight.BOLD, 15));
        btnGoThroughDoor.setFont(Font.font("Comic San MS", FontWeight.BOLD, 15));
        btnCheckCloset.setFont(Font.font("Comic San MS", FontWeight.BOLD, 15));
        btnExitTheGame.setFont(Font.font("Comic San MS", FontWeight.BOLD, 15));
    }

    @FXML
    void onActionMouseExited(MouseEvent event)
    {
        //Remove bold and enlargement of save and summary button
        btnGoHere.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        btnGoThroughDoor.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        btnCheckCloset.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        btnExitTheGame.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
    }

}