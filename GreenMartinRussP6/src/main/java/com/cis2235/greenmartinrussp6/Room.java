//stewart martin
// smartin91@cnm.edu
//room class
//JR made the variables, methods, constructor

package com.cis2235.greenmartinrussp6;

public abstract class Room {

    private String decoration;

    public Room(String name, String decoration) {

        String description =( "You see " + decoration + ". ");
    }


    public abstract String  getDescription();
}
