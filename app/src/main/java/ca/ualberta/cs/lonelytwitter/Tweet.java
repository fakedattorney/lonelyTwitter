/*
*Class Name: Tweet
*
* Version: Version 1.0
*
* Date of Creation: September 28th, 2017
*
 * Copyright (c) Team X, CMPUT301, University of Alberta- All Rights Reserved. You may use, distribute or modify this code under terms and condisitons of the Code of Students Behaviour at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author kivrikog
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date; //if needed to import it just click alt+enter and choose to import it

    private ArrayList<Mood> moods;

    public Tweet(String message){ //class names should start w capital letters while attributes should start with small letter
        this.message=message;//attributes
        this.date=new Date();

    }

    /**
     * Constructs Tweet objects
     *
     * @param message tweetmessage
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message=message;
        this.date=date;

    }
    /**
     * Sets dates to tweets
     *
     *
     * @param date tweet date
     */
    //in java we get some stuff from object
    public void setDate(Date date){
        this.date=date;

    }

    /**
     * Sets tweet messagesTweet message
     *
     * @param message message length
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <=140){
            this.message=message;

        }
        else{
            throw new TweetTooLongException();
        }
    }

    public Date getDate(){
        return date;

    }
    @Override
    public String toString(){
        return date.toString()+" | " + message;
    }

    public String getMessage(){
        return message;
    }

    public abstract Boolean isImportant();
    /**
     * Sets the moods to the tweets
     *
     * @param moods assigns moods
     */

    public void setMoods(ArrayList<Mood> moods) {
        this.moods = moods;
    }

}
