package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by kivrikog on 9/14/17.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date; //if needed to import it just click alt+enter and choose to import it

    private ArrayList<Mood> moods;

    public Tweet(String message){ //class names should start w capital letters while attributes should start with small letter
        this.message=message;//attributes
        this.date=new Date();

    }
    public Tweet(String message, Date date){
        this.message=message;
        this.date=date;

    }
    //in java we get some stuff from object
    public void setDate(Date date){
        this.date=date;

    }
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

    public void setMoods(ArrayList<Mood> moods) {
        this.moods = moods;
    }

}
