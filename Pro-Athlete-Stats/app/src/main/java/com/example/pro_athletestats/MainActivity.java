package com.example.pro_athletestats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity<stringRequest> extends AppCompatActivity {

    TextView tv_baseball;
    TextView tv_basketball;
    TextView tv_soccer;
    ImageView img_baseball;
    ImageView img_basketball;
    ImageView img_soccer;

//Here's a comment in the Java file
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_baseball = findViewById(R.id.tv_baseball);
        tv_basketball = findViewById(R.id.tv_basketball);
        tv_soccer = findViewById(R.id.tv_soccer);
        img_baseball = findViewById(R.id.img_baseball);
        img_basketball = findViewById(R.id.img_basketball);
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


    public void openSoccerActivity(View view) {
        Intent intentToOpenAlbumActivity = new Intent(this, SoccerActivity.class);
        startActivity(intentToOpenAlbumActivity);
    }
    final TextView textView = (TextView) findViewById(R.id.text);
// ...

    // Instantiate the RequestQueue.
    com.android.volley.RequestQueue queue = Volley.newRequestQueue(this);
    String url ="http://www.google.com";

    // Request a string response from the provided URL.
    StringRequest StringRequest = new StringRequest(Request.Method.GET, url,
            new Response.Listener<String>() {

                public void onResponse(String response) {
                    // Display the first 500 characters of the response string.
                    textView.setText("Response is: "+ response.substring(0,500));
                }
            }, new Response.ErrorListener() {

        public void onErrorResponse(VolleyError error) {
            textView.setText("That didn't work!");
        }
    });
 //Add the request to the RequestQueue;
   //queue.add(stringRequest);

}


