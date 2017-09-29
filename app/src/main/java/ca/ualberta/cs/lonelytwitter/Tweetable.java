/*
 * Copyright (c) Team X, CMPUT301, University of Alberta- All Rights Reserved. You may use, distribute or modify this code under terms and condisitons of the Code of Students Behaviour at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Represents a Tweetable
 *
 * @author kivrikog
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @see Tweet
 * @since 1.0
 */
public interface Tweetable {
    public String getMessage();

    public Date getDate();


}
