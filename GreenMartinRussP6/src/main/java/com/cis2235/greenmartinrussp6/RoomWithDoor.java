//stewart Martin
//Smartin91@cnm.edu
//class RoomWithDoor

//JR made the variables, methods, constructor

package com.cis2235.greenmartinrussp6;

public class RoomWithDoor extends RoomWithHidingPlace implements HasExteriorDoor{

    private String doorDescription;
    private Location doorLocation;


    public RoomWithDoor(String name, String decoration, String hidingPlaceName, String doorDescription) {

        super(name, decoration, hidingPlaceName);

        //assign doorDescription to class variable
        this.doorDescription = doorDescription;

    }

    @Override
    public String getDoorDescription() {
        return doorDescription;
    }

    @Override
    public Location getDoorLocation() {
        return doorLocation;
    }


    public void setDoorLocation(Location location) {
        this.doorLocation = location;

    }
    @Override
    public String getDescription() {
        return super.getDescription() + " There is a door " + doorDescription + ".";
    }


}
