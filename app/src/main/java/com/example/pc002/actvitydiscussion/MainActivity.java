package com.example.pc002.actvitydiscussion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public  void onClick(View v){
            Toast.makeText(MainActivity.this, "Variable Listener", Toast.LENGTH_LONG).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Button Demo");

        Button ordinaryButton = findViewById(R.id.ordinary_button);
        ImageButton icon_button = findViewById(R.id.icon_button);
        Button icon_in_the_left_Button = findViewById(R.id.icon_in_the_left_button);
        Button icon_in_the_right_Button = findViewById(R.id.icon_in_the_right_button);

    ordinaryButton.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Ordinary Button is clicked!", Toast.LENGTH_LONG).show();
            }
            @Override
            protected Object clone() throws CloneNotSupportedException{
                return super.clone();
            }


        });

       icon_in_the_left_Button.setOnClickListener(clickListener);
       icon_in_the_right_Button.setOnClickListener(this);
}

    @Override
    public void onClick(View view) {
        //Toast.makeText(this, "Activity Listener",Toast.LENGTH_LONG).show();
        int id = view.getId();
        switch (id){
            case R.id.ordinary_button:
                Toast.makeText(this, "ordinary button clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.icon_button:
                Toast.makeText(this, "image button clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.icon_in_the_left_button:
                Toast.makeText(this, "icon left clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.icon_in_the_right_button:
                Toast.makeText(this, "icon right clicked",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
