package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kivrikog on 9/14/17.
 */

public class HappyMood extends Mood {

    public HappyMood() {
        super("I am happy");
    }

    public HappyMood(Date date){
        super("I am happy",date);
    }

    @Override
    public String getMood(){
        return this.getMessage();
    }

}
