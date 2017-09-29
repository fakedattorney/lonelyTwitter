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
 * @see Tweet
 * @see Tweetable
 * @since 1.0
 */
public class NormalTweet extends Tweet{
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    public NormalTweet(String message) {
        super(message);

    }
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
