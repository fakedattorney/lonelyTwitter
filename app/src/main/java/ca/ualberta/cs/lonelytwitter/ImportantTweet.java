package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kivrikog on 9/14/17.
 */

public class ImportantTweet extends Tweet{
    //multiple inheritant not allowed in java so dont try to extend multiple stuff just extend one
    public ImportantTweet(String message){
        super(message);

    }
    public ImportantTweet(String message, Date date){
        super(message, date);
    }
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
