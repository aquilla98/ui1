package com.example.uitest;

import android.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class newActivity2 extends AppCompatActivity {
    Button button4;
    TextView number4;
    int n4 = 0;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraintlayout);
        this.button4 = findViewById(R.id.button4);
        this.button4.setText("I'm not clicked yet");
        this.number4 = findViewById(R.id.textView4);
        this.number4.setText("Not clicked yet");
        this.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.setText("I'm clicked 4");
                n4 = n4 + 1;
                number4.setText("I'm clicked " + n4 + " times");

            }
        });

//        this.button2 = findViewById(R.id.button2);
//        this.button2.setText("I'm not clicked yet 2");

    }
}
