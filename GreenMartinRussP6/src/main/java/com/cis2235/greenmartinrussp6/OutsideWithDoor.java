//stewart martin
// smartin91@cnm.edu
// class outSideWithDoor

package com.cis2235.greenmartinrussp6;

public class OutsideWithDoor extends Outside implements HasExteriorDoor{


    public OutsideWithDoor(String name, boolean hot, String doorDescription){

        super(name, hot);

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
