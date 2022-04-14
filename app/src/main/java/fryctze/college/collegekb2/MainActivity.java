package fryctze.college.collegekb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "asd";

    ImageButton cinderella;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI(){
        cinderella = findViewById(R.id.ibCinderella);
        cinderella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, gantiKataCinderella.class));
                finish();
            }
        });
    }




    public void clickSuperman(View view) {
        startActivity(new Intent(this, gantiKataSuperman.class));
        finish();
    }

    public void clickTarzan(View view) {
        startActivity(new Intent(this, gantiKataTarzan.class));
        finish();
    }

    public void clickCredit(View view) {
        startActivity(new Intent(this, CreditActivity.class));
    }
}