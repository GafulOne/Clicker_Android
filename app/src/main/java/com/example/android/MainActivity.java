package com.example.android;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    ImageButton plusButton;
    private long score = 0;
    private int multiplier = 2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainText = (TextView) findViewById(R.id.main_Text);
        plusButton = (android.widget.ImageButton) findViewById(R.id.plus_Button);
        plusButton.setOnClickListener(clickListener);
    }

    public void onClick(View view)
    {
        Intent intent = new Intent(this, Shop.class);
        startActivity(intent);
    }
   View.OnClickListener clickListener = new View.OnClickListener()
   {
       @Override
       public void onClick(View v)
       {
           if(v.getId() == R.id.plus_Button) {
               score++;
               String s = "" + score + "";
               mainText.setText(s.toCharArray(), 0, s.length());
               plusButton.setOnClickListener(clickListener);
           }

           if (score == 10)
           {
               Toast.makeText(getApplicationContext(), "Достижение получено! Покемон эволюционировал!",Toast.LENGTH_LONG).show();
               plusButton.setImageResource(R.drawable.charmeleon);

           }
           if (score == 100)
           {
               Toast.makeText(getApplicationContext(), "Достижение получено! Покемон эволюционировал!",Toast.LENGTH_LONG).show();
               plusButton.setImageResource(R.drawable.charizard);
           }
           if (score == 99)
           {
               plusButton.setImageResource(R.drawable.charmeleon);
           }
           if (score == 1000)
           {
               Toast.makeText(getApplicationContext(), "Достижение получено: Потрогай траву",Toast.LENGTH_LONG).show();
           }
       }
   };
}