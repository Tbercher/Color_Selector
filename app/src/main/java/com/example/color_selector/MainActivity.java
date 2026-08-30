package com.example.color_selector;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewColor;
    TextView textViewHex, textViewRGB, textViewR, textViewB, textViewG;
    SeekBar seekBarRed, seekBarBlue, seekBarGreen;
    Button buttonWhite, buttonBlack, buttonBlue, buttonReset;

    String red = "64", green = "128", blue = "0" , hexColor = "default";

    int redInt = 64, greenInt = 124, blueInt = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageViewColor = findViewById(R.id.imageViewColor);
        textViewHex = findViewById(R.id.textViewHex);
        textViewRGB = findViewById(R.id.textViewRGB);
        textViewR = findViewById(R.id.textViewR);
        textViewB = findViewById(R.id.textViewB);
        textViewG = findViewById(R.id.textViewG);
        seekBarRed = findViewById(R.id.seekBarRed);
        seekBarBlue = findViewById(R.id.seekBarBlue);
        seekBarGreen = findViewById(R.id.seekBarGreen);

        findViewById(R.id.buttonWhite).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBarRed.setProgress(255);
                seekBarGreen.setProgress(255);
                seekBarBlue.setProgress(255);

            }
        });

        findViewById(R.id.buttonBlack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBarRed.setProgress(0);
                seekBarGreen.setProgress(0);
                seekBarBlue.setProgress(0);


            }
        });

        findViewById(R.id.buttonBlue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBarRed.setProgress(0);
                seekBarGreen.setProgress(0);
                seekBarBlue.setProgress(255);

            }
        });

        findViewById(R.id.buttonReset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBarRed.setProgress(64);
                seekBarGreen.setProgress(128);
                seekBarBlue.setProgress(0);

            }
        });

        seekBarBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewB.setText(String.valueOf(progress));

                blue = String.valueOf(progress);

                textViewRGB.setText(getString(R.string.color_rgb_format, red, green, blue));

                try{
                    blueInt = Integer.parseInt(blue);
                }catch(NumberFormatException e){
                    blueInt = 0;
                }

                hexColor = String.format("Color Hex: #%02X%02X%02X", redInt, greenInt, blueInt);

                textViewHex.setText(hexColor);

                imageViewColor.setBackgroundColor(Color.rgb(redInt, greenInt, blueInt));



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewG.setText(String.valueOf(progress));
                green = String.valueOf(progress);


                textViewRGB.setText(getString(R.string.color_rgb_format, red, green, blue));

                try{
                    greenInt = Integer.parseInt(green);
                }catch(NumberFormatException e){
                    greenInt = 0;
                }

                hexColor = String.format("Color Hex: #%02X%02X%02X", redInt, greenInt, blueInt);

                textViewHex.setText(hexColor);

                imageViewColor.setBackgroundColor(Color.rgb(redInt, greenInt, blueInt));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewR.setText(String.valueOf(progress));
                red = String.valueOf(progress);
                textViewRGB.setText(getString(R.string.color_rgb_format, red, green, blue));

                try{
                    redInt = Integer.parseInt(red);
                }catch(NumberFormatException e){
                    redInt = 0;
                }

                hexColor = String.format("Color Hex: #%02X%02X%02X", redInt, greenInt, blueInt);

                textViewHex.setText(hexColor);

                imageViewColor.setBackgroundColor(Color.rgb(redInt, greenInt, blueInt));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}