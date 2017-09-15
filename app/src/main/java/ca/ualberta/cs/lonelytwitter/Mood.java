package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kivrikog on 9/14/17.
 */

public abstract class Mood {
    private Date date;

    public String getMessage() {
        return message;
    }
    private String message;

    public Mood(String message){
        this.message=message;
        this.date=new Date();

    }
    public Mood(String message,Date date) {
        this.message = message;
        this.date = date;
    }


    public void setDate(Date date){
        this.date=date;
    }
    public Date getDate(){
        return date;
    }

    public abstract String getMood();

}
