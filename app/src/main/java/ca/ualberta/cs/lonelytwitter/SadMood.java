/*
 * Copyright (c) Team X, CMPUT301, University of Alberta- All Rights Reserved. You may use, distribute or modify this code under terms and condisitons of the Code of Students Behaviour at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kivrikog on 9/14/17.
 */

public class SadMood extends Mood{
    public SadMood() {
        super("I am sad");
    }

    public SadMood(Date date) {
        super("I am sad",date);
    }

    @Override
    public String getMood(){
        return this.getMessage();
    }
}
