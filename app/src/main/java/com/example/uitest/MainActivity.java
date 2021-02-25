package com.example.uitest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    Button button3;
    TextView number1;
    int n1 = 0;
    TextView number2;
    int n2 = 0;

    //        FragmentManager supportFragmentManager = True;
//        {
//            NavHostFragment navHostFragment;
//            navHostFragment = (NavHostFragment) supportFragmentManager.findFragmentById(R.id.Fragment0);
//            NavController navController = navHostFragment.getNavController();
//        }
//
//    public void FragmentActivity(FragmentManager supportFragmentManager) {
//        this.supportFragmentManager = supportFragmentManager;
//    }

//button.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Navigation.findNavController(view).navigate(R.id.navigationAction);
//        }
//    })


//public void navigate (int resId){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        this.number1 = findViewById(R.id.textView1);
        this.number1.setText("I'm text");
        this.number2 = findViewById(R.id.textView2);
        this.number2.setText("I'm text too");
        this.button = findViewById(R.id.testButton);
        this.button.setText("I'm not clicked yet");
        this.button2 = findViewById(R.id.button2);
        this.button2.setText("I'm not clicked yet 2");
        this.button2.setOnClickListener(v -> {
            button2.setText("I'm clicked 2");
            n2 = n2 + 1;
            number2.setText("I'm clicked " + n2 + " times");
        });

        this.button3 = findViewById(R.id.button3);
        this.button3.setText("Click me to navigate to the next page");
//        this.button3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.Fragment1, null));
        this.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.Fragment1);
            }
        });

    }


    public void onButtonClicked(View view) {
    this.button.setText("I'm clicked");
    n1 = n1 + 1;
    this.number1.setText("I'm clicked " +n1 + " times");
    }



}