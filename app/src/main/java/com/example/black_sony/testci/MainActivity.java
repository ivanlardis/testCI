package com.example.black_sony.testci;

import org.w3c.dom.Text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView= (TextView) findViewById(R.id.textTTT);
    textView.setText(""+getResources().getString(R.string.mainView));

    }
}
