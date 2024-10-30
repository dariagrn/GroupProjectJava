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

import javax.swing.*;

public class HelloController
{
    //keep track of how many moves were taken
    private int howManyMovesTaken=0;

    //Location object to keep track of current location
    Location locationObject;

    //Opponent object to keep track of opponent
    Opponent opponentObject;

    //Object references to keep track of each of the rooms in the house

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
    private Button btnHide;

    @FXML
    void onActionCheckCloset(ActionEvent event) {

    }

    @FXML
    void onActionComboBoxEvent(ActionEvent event) {

    }

    @FXML
    void onActionExitGame(ActionEvent event) {
        //JR
        int exitTheGame= JOptionPane.showConfirmDialog(null, "Are you sure you want to leave?", "Close window", JOptionPane.YES_NO_OPTION);

        if (exitTheGame == JOptionPane.YES_OPTION) {

            System.exit(0);
        }

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

        //JR
        btnHide.setFont(Font.font("Comic San MS", FontWeight.BOLD, 15));
    }

    @FXML
    void onActionMouseExited(MouseEvent event)
    {
        //Remove bold and enlargement of save and summary button
        btnGoHere.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        btnGoThroughDoor.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        btnCheckCloset.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        btnExitTheGame.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));

        //JR
        btnHide.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));//JR
    }



    private void createObjects(){

//       Instantiate the classes and pass information about each room to each constructor

/*   	Populate the exits array for each room.  We have to do this after we create
        all of the instances because we are going to refer to them.  This is instantiating the array
        declared in the Location class, public Location[] exits;  exits is an array of Locations that this location connects to.*/


    }


    private void redrawForm(){
//        i.	Since the location has changed, clear the Combo Box items.
//        ii.	Set the exit names corresponding to the current location into the Combo Box
//        iii.	Set the first exit to be displayed in the Combo Box
//        iv.	If the current location has a hiding place
//        1.	Set the text on the Check button to display  “Check “ + hidingPlaceName
//        2.	Set the Check button to be visible.
//                v.	If there is no hiding place, set the Check button to not visible.
//        vi.	If the current location has an exterior door,
//        1.	Set the GoThroughTheDoor button to visible
//        vii.	If there is no door, set the button to not visible.

    }



    private void moveToANewLocation(Location newLocation){

//        increments number of moves
//        sets currentLocation to newLocation
//        calls redrawForm()


    }


    private void resetGame(boolean displayMessage) {
//    i. if displayMessage is true,
//            1. Display a message in a JOP that states how many moves it took to find the opponent(optional)
//    2. Display a summary in the TextArea of how many moves and the name of the location where they were found
//    ii.In any
//    case , reset the
//    controls to play another game

}


    //JR
    public void  initialize(){
        //call createObjects
        createObjects();
        cmbExits.setItems(cmbList);

        //Instantiate the opponent object and make the initial location the front yard.
        //Call resetGame(false);


    }



}