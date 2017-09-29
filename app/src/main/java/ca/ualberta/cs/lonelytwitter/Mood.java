/*
 * Copyright (c) Team X, CMPUT301, University of Alberta- All Rights Reserved. You may use, distribute or modify this code under terms and condisitons of the Code of Students Behaviour at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Mood
 *
 * @author kivrikog
 * @version 1.0
 * @see SadMood
 * @see HappyMood
 * @since 1.0
 */

public abstract class Mood {
    private Date date;
    /**
     * Gets the message as as string
     *
     */

    public String getMessage() {
        return message;
    }
    private String message;
    /**
     * Messages assigned
     *
     * @param message message length
     */

    public Mood(String message){
        this.message=message;
        this.date=new Date();

    }
    /**
     * Mood assigned with date and string message
     *
     * @param message message string
     */
    public Mood(String message,Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Setsdate
     *
     * @param date date of tweet
     */
    public void setDate(Date date){
        this.date=date;
    }
    public Date getDate(){
        return date;
    }

    public abstract String getMood();

}
