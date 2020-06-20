package com.example.pro_athletestats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tv_baseball;
    TextView tv_basketball;
    TextView tv_soccer;
    TextView tv_football;
    ImageView img_baseball;
    ImageView img_basketball;
    ImageView img_football;
    ImageView img_soccer;

//Here's a comment in the Java file
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_baseball = findViewById(R.id.tv_baseball);
        tv_basketball = findViewById(R.id.tv_basketball);
        tv_football = findViewById(R.id.tv_football);
        tv_soccer = findViewById(R.id.tv_soccer);
        img_baseball = findViewById(R.id.img_baseball);
        img_basketball = findViewById(R.id.img_basketball);
        img_football = findViewById(R.id.img_football);
        img_soccer = findViewById(R.id.img_soccer);
    }



    public void openBasketballActivity(View view) {
        Intent intentToOpenArtistActivity = new Intent(this, BasketballActivity.class);
        startActivity(intentToOpenArtistActivity);
    }

    public void openBaseballActivity(View view) {
        Intent intentToOpenAlbumActivity = new Intent(this, BaseballActivity.class);
        startActivity(intentToOpenAlbumActivity);
    }

    public void openFootballActivity(View view) {
        Intent intentToOpenAlbumActivity = new Intent(this, FootballActivity.class);
        startActivity(intentToOpenAlbumActivity);
    }

    public void openSoccerActivity(View view) {
        Intent intentToOpenAlbumActivity = new Intent(this, SoccerActivity.class);
        startActivity(intentToOpenAlbumActivity);
    }

/*    final TextView textView = (TextView) findViewById(R.id.text);
// ...

    // Instantiate the RequestQueue.
    RequestQueue queue = Volley.newRequestQueue(this);
    String url ="http://www.google.com";

    // Request a string response from the provided URL.
    StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    // Display the first 500 characters of the response string.
                    textView.setText("Response is: "+ response.substring(0,500));
                }
            }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            textView.setText("That didn't work!");
        }
    });

// Add the request to the RequestQueue.
  //  queue.add(stringRequest);
*/
}


