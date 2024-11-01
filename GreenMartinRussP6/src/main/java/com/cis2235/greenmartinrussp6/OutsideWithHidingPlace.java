//stewart Martin
// smartin91@cnm.edu
//class OutsideWithHidingPlace
//JR made the variables, methods, constructor

package com.cis2235.greenmartinrussp6;

public class OutsideWithHidingPlace extends Outside implements IsHidingPlace{

    private String description;

    //Constructor
    public OutsideWithHidingPlace(String name, boolean hot,  String hidingPlaceName) {

        //call super
        super(name, hot);

        //assign argument to member variable

    }


    //getDescription this creates the description
    @Override
    public String getDescription(){

        return description;

    }

    @Override
    public String getHidingPlaceName() {
        return "";
    }


}
