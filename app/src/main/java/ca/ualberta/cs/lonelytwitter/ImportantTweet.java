/*
 * Copyright (c) Team X, CMPUT301, University of Alberta- All Rights Reserved. You may use, distribute or modify this code under terms and condisitons of the Code of Students Behaviour at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a ImprtantTweet
 *
 * @author kivrikog
 * @version 1.0
 * @see ImportantTweet
 * @see Tweet
 * @since 1.0
 */

public class ImportantTweet extends Tweet{
    //multiple inheritant not allowed in java so dont try to extend multiple stuff just extend one
    public ImportantTweet(String message){
        super(message);
/**
 * Important tweets with message and date
 *
 * @param message message tweet
 * @param date tweet date
 */
    }
    public ImportantTweet(String message, Date date){
        super(message, date);
    }
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
