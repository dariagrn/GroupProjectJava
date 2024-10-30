//stewart Martin
//Smartin91@cnm.edu
//class RoomWithDoor

package com.cis2235.greenmartinrussp6;

public class RoomWithDoor extends RoomWithHidingPlace implements HasExteriorDoor{


    public RoomWithDoor(String name, String decoration, String hidingPlaceName, String doorDescription) {
        super(name, decoration, hidingPlaceName);
        //assign doorDescription to class variable
    }

    @Override
    public String getDoorDescription() {
        return "";
    }

    @Override
    public Location getDoorLocation() {
        return null;
    }

    @Override
    public void setDoorLocation(Location location) {

    }


}
