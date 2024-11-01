//stewart Martin
//smartin91@cnm.edu
//class Opponent
//JR made the variables, methods, constructor

package com.cis2235.greenmartinrussp6;

import java.util.Random;

public class Opponent {
    private Random random=new Random();
    private Location myLocation;

    public Opponent(Location startingLocation) {


        this.myLocation=startingLocation;

    }

    //getter for location that returns myLocation
    public Location getMyLocation() {

        return myLocation;

    }


    public boolean check(Location locationToCheck){
            //checking if myLocation is the same as loctionToCheck
            if(myLocation==locationToCheck){
                return true;

            }else
            {
                //if it is return true else false
                return false;
            }

    }


    public void move() {
        while (true) {


            //checks to see if th current room has a door
            if (myLocation instanceof HasExteriorDoor) {

                //if there is a door, Opponent has  a  50% chance of going through it.
                //Then opponent moves to a random location and keeps going until a hiding place is found.
                HasExteriorDoor locationWithDoor = (HasExteriorDoor) myLocation;
                myLocation = locationWithDoor.getDoorLocation();

                //get a roandom number that  will give you 50% chance.
                // create  a boolean
                boolean openDoor=random.nextBoolean();
                //if the answer is true, then move
                if(openDoor==true){

                    myLocation = locationWithDoor.getDoorLocation();
                }

            }
            else {
                // Pick a random location from the available exits
                Location[] exits = myLocation.getExits();
                myLocation = exits[random.nextInt(exits.length)];
            }
            // Stop if the new location has a hiding place
            if (myLocation instanceof IsHidingPlace) {
                break;
            }

        }

    }

}
