package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Collections;

import static java.lang.Boolean.TRUE;

/**
 * Created by kivrikog on 10/12/17.
 */

public class TweetList {
    private ArrayList<Tweet>tweets=new ArrayList<Tweet>();

    public  TweetList(){

    }

    public void add(Tweet tweet)  throws IllegalArgumentException{
        if (tweets.contains(tweet)){

            throw new IllegalArgumentException();
        }
        tweets.add(tweet);

    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public ArrayList<Tweet> getTweet(int size) {
        //return tweets.get(tweets.size()-1);
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet o1, Tweet o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        return tweets;
    }


    public int getCount(){
        return tweets.size();
    }

}
