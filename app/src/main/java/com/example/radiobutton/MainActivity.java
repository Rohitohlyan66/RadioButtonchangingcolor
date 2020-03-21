package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

        RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup)findViewById(R.id.rg);

            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId)
                    {
                        case R.id.rb1:
                            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
                            break;

                        case R.id.rb2:
                            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
                            break;

                        case R.id.rb3:
                            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#008000"));
                            break;

                        case R.id.rb4:
                            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000ff"));
                            break;

                    }
                }
            });

    }
}
