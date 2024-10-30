//stewart Martin
//smartin91@cnm.edu
//class Opponent


package com.cis2235.greenmartinrussp6;

import java.util.Random;

public class Opponent {
    private Random random;
    private Location myLocation;

    public Opponent(Location startingLocation) {

        random  = new Random();
        myLocation=startingLocation;

    }

    //getter for location that returns myLocation


    public void move(){
        //checks to see if th current room has a door
            //if there is a door, Opponent has  a  50% chance of going through it.
            //Then opponent moves to a random location and keeps going until a hiding place is found.

        if(myLocation instanceof HasExteriorDoor){
            HasExteriorDoor locationWithDoor=(HasExteriorDoor)myLocation;

            //get a roandom number that  will give you 50% chance
            //create  a boolean
            //cif the answer is true, then move
            myLocation  = locationWithDoor.getDoorLocation();



        }
        //create a bool for hidden =false;
        //start a while loop while not hidden
            //get a rand_num depending on the myLocation.exits.length
            //set myLocation to myLocation.exits[rand_num]
            //check if myLocation is an instance of IsHidingPlace
            //if it is, hidden =true and loop ends

//        public boolean check(Location locationToCheck){
//            //checking if myLocation is the same as loctionToCheck
//                //if it is return true else false
//            return false;
//
//
//
//        }



    }


}
