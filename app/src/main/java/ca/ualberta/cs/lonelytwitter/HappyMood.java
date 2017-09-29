/*
 * Copyright (c) Team X, CMPUT301, University of Alberta- All Rights Reserved. You may use, distribute or modify this code under terms and condisitons of the Code of Students Behaviour at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a NormalTweet
 *
 * @author kivrikog
 * @version 1.0
 * @see NormalTweet
 * @see Mood
 * @see SadMood
 * @since 1.0
 */

public class HappyMood extends Mood {

    public HappyMood() {
        super("I am happy");
    }
    /**
     * Asigns I am happy text and date to happy mood
     *
     * @param date date of tweet
     */

    public HappyMood(Date date){
        super("I am happy",date);
    }
    /**
     * Get the mood in the string
     *
     */
    @Override
    public String getMood(){
        return this.getMessage();
    }

}
