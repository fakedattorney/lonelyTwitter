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
