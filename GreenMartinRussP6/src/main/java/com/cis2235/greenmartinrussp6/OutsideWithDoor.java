//stewart martin
// smartin91@cnm.edu
// class outSideWithDoor
// JR made the variables, methods, constructor.
package com.cis2235.greenmartinrussp6;

public class OutsideWithDoor extends Outside implements HasExteriorDoor{

    //create variables for the doorDescription and door location
    String doorDescription;
    public OutsideWithDoor(String name, boolean hot, String doorDescription){

        super(name, hot);
        this.doorDescription=doorDescription;

    }

    @Override
    public String getDoorDescription() {
        return "";
    }



    @Override
    public Location getDoorLocation() {
        return null;
    }

    //@Override
    public void setDoorLocation(Location location) {

    }


    @Override
    public String getDescription(){
        return doorDescription;
    }
}
