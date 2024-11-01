//stewart martin
// smartin91@cnm.edu
//room class
//JR made the variables, methods, constructor

package com.cis2235.greenmartinrussp6;

public class Room  extends Location{

    private String decoration;
    private  String description;


    public Room(String name, String decoration) {
        super(name);
         this.decoration = decoration;
    }

    // Getter for decoration
    public String getDecoration() {
        return decoration;
    }


    @Override
    public String  getDescription(){

        return super.getDescription() + " You see " + decoration + ".";


    }
}
