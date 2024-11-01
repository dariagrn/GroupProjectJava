//stewart martin
// smartin91@cnm.edu
//OutSide class
//JR made the variables, methods, constructor

package com.cis2235.greenmartinrussp6;

public class Outside extends Location{

    boolean hot;

    public Outside(String name, boolean hot) {
        super(name);
        this.hot=hot;

    }

    // Getter for hot
    public boolean isHot() {
        return hot;
    }

    // Override getDescription to include temperature details
    @Override
    public String getDescription() {
        String description = super.getDescription();
        if (hot) {
            description += " It's very hot.";
        }
        return description;
    }




}
