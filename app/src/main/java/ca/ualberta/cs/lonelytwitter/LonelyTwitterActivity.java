/*
 * Copyright (c) Team X, CMPUT301, University of Alberta- All Rights Reserved. You may use, distribute or modify this code under terms and condisitons of the Code of Students Behaviour at University of Alberta.
 */


package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
/**
 * Represents a LonelyTwitterActivity
 *
 * @author kivrikog
 * @version 1.0
 * @see Tweet
 * @see Mood
 * @see Tweetable
 * @see ImportantTweet
 * @since 1.0
 */

public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;

	private ArrayList<Tweet> tweets =new ArrayList<Tweet>();
	private ArrayAdapter<Tweet> adapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		Button clearButton = (Button) findViewById(R.id.clear);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

        /**Saves when the button is pressed and saves in the file
         *
         * @param tweets
         */

		saveButton.setOnClickListener(new View.OnClickListener() {


			public void onClick(View v) {



				setResult(RESULT_OK);
				String text = bodyText.getText().toString();
				tweets.add(new NormalTweet(text));
				adapter.notifyDataSetChanged();
				saveInFile();
				//finish();

			}
		});

        /**
         * Clears the tweets and saves in file
         *
         * @param tweets to clear
         *
         */

		clearButton.setOnClickListener(new View.OnClickListener(){

			public void onClick(View v){
				setResult(RESULT_OK);
				tweets.clear();
                adapter.notifyDataSetChanged();
				saveInFile();

			}


		});
	}


	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		loadFromFile();

		adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweets);
		oldTweetsList.setAdapter(adapter);
	}

    /**
     * Loads the tweets from the file
     * @throws RuntimeException
     * @throws  FileNotFoundException
     */
	private void loadFromFile() {

		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			Gson gson = new Gson();
			Type listType = new TypeToken<ArrayList<NormalTweet>>() {}.getType();
			tweets = gson.fromJson(in,listType);


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			tweets = new ArrayList<Tweet>();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}

	}
    /**
     * Saves the tweets to the file
     * @throws RuntimeException
     * @throws  FileNotFoundException
     */
	
	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_PRIVATE);
			OutputStreamWriter writer = new OutputStreamWriter(fos);
			Gson gson= new Gson();
			gson.toJson(tweets, writer);
			writer.flush();

			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
}