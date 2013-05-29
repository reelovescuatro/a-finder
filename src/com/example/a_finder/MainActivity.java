package com.example.a_finder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}


/** Called when the user clicks the Send button */
public void sendMessage(View view) {
    // Do something in response to button
	Intent intent = new Intent(MainActivity.this, Profile.class);
    startActivity(intent);
}
}