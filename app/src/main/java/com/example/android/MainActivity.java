package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

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
    Button minusButton;
    Button dropButton;
    private long score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainText = (TextView) findViewById(R.id.main_Text);
        plusButton = (android.widget.ImageButton) findViewById(R.id.plus_Button);
        minusButton = (Button) findViewById(R.id.minus_Button);
        dropButton = (Button) findViewById(R.id.drop_Button);
        plusButton.setOnClickListener(clickListener);
        minusButton.setOnClickListener(clickListener);
        dropButton.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            if(v.getId() == R.id.plus_Button)
            {
                score ++;
                if (score == 12 || score == 13 || score == 14)
                {
                    String s = "Кнопка нажата " + score + " раз";
                    mainText.setText(s.toCharArray(),0, s.length());
                    plusButton.setOnClickListener(clickListener);
                }
                else
                {
                    if (score % 10 == 2 || score % 10 == 3 || score % 10 == 4)
                    {
                        String s = "Кнопка нажата " + score + " раза";
                        mainText.setText(s.toCharArray(),0, s.length());
                        plusButton.setOnClickListener(clickListener);
                    }
                    else
                    {
                        String s = "Кнопка нажата " + score + " раз";
                        mainText.setText(s.toCharArray(),0, s.length());
                        plusButton.setOnClickListener(clickListener);
                    }
                }
            }

            if(v.getId() == R.id.minus_Button)
            {
                score --;
                if (score == -12 || score == -13 || score == -14)
                {
                    String s = "Кнопка нажата " + score + " раз";
                    mainText.setText(s.toCharArray(),0, s.length());
                    minusButton.setOnClickListener(clickListener);
                }
                else
                {
                    if (score % 10 == -2 || score % 10 == -3 || score % 10 == -4)
                    {
                        String s = "Кнопка нажата " + score + " раза";
                        mainText.setText(s.toCharArray(),0, s.length());
                        minusButton.setOnClickListener(clickListener);
                    }
                    else
                    {
                        String s = "Кнопка нажата " + score + " раз";
                        mainText.setText(s.toCharArray(),0, s.length());
                        minusButton.setOnClickListener(clickListener);
                    }
                }
            }

            if(v.getId() == R.id.drop_Button)
            {
                score = 0;
                String s = "Кнопка нажата " + score + " раз";
                mainText.setText(s.toCharArray(),0, s.length());
                dropButton.setOnClickListener(clickListener);
            }
            if (score == 50)
            {
                Toast.makeText(getApplicationContext(), "Достижение получено! Покемон эволюционировал!",Toast.LENGTH_LONG).show();
                plusButton.setImageResource(R.drawable.charmeleon);
            }
            if (score == 49)
            {
                plusButton.setImageResource(R.drawable.charmander);
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