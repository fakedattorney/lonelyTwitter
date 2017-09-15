package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kivrikog on 9/14/17.
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
