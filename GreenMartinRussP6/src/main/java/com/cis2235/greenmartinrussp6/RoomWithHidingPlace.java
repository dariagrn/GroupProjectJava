
//stewart Martin made the class
//JR made the variables, methods, constructor

package com.cis2235.greenmartinrussp6;



public class RoomWithHidingPlace extends Room implements IsHidingPlace {

    private String  hidingPlaceName;
    public String description;


    public RoomWithHidingPlace(String name, String decoration,  String hidingPlaceName){

        super(name,decoration);
        this.hidingPlaceName=hidingPlaceName;


    }


    @Override
    public String getHidingPlaceName() {

        return hidingPlaceName;
    }



    @Override
    //the superclass is in Room.  That is where the method is made
    public String  getDescription() {

        return description;

    }





}
