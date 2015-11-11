package com.dicedmelon.example.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    initializeNumber();
  }

  private void initializeNumber() {
    NumberProvider numberProvider = new NumberProvider();

    TextView numberTextView = (TextView) findViewById(R.id.number);
    numberTextView.setText(String.valueOf(numberProvider.provideNumber()));
  }
}
