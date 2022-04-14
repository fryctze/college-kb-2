package fryctze.college.collegekb2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Scanner;

public class gantiKataSuperman extends AppCompatActivity {

    private static final String TAG = "hehe";

    EditText et0, et1, et2, et3, et4, et5, et6, et7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganti_kata_superman);

        initUI();
    }

    private void initUI() {
        et0 = findViewById(R.id.et_0);
        et1 = findViewById(R.id.et_1);
        et2 = findViewById(R.id.et_2);
        et3 = findViewById(R.id.et_3);
        et4 = findViewById(R.id.et_4);
        et5 = findViewById(R.id.et_5);
        et6 = findViewById(R.id.et_6);
        et7 = findViewById(R.id.et_7);
    }

    public void clickSubmitCinderella(View view) {
        readFromFile();
    }


    private void readFromFile(){
        String a0 = et0.getText().toString();
        String a1 = et1.getText().toString();
        String a2 = et2.getText().toString();
        String a3 = et3.getText().toString();
        String a4 = et4.getText().toString();
        String a5 = et5.getText().toString();
        String a6 = et6.getText().toString();
        String a7 = et7.getText().toString();

        Scanner scan = new Scanner(getResources().openRawResource(R.raw.cinderella));
        StringBuilder newline = new StringBuilder();

        boolean isNotTitle = true;
        String title = "";

        while (scan.hasNextLine()){
            String line = scan.nextLine();
            Log.d(TAG, "readFromFile: "+line);
            if (isNotTitle){
                title = line;
                isNotTitle = false;
                continue;
            }

            boolean foundBracket = false;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '['){
                    switch (line.charAt(i+1)){
                        case '0':
                            Log.d(TAG, "readFromFile: "+a0);
                            for (int j = 0; j < a0.length(); j++) {
                                newline.append(a0.charAt(j));
                            }
                            foundBracket=true;
                            break;
                        case '1':
                            Log.d(TAG, "readFromFile: "+a1);
                            for (int j = 0; j < a1.length(); j++) {
                                newline.append(a1.charAt(j));
                            }
                            foundBracket=true;
                            break;
                        case '2':
                            Log.d(TAG, "readFromFile: "+a2);
                            for (int j = 0; j < a2.length(); j++) {
                                newline.append(a2.charAt(j));
                            }
                            foundBracket=true;
                            break;
                        case '3':
                            Log.d(TAG, "readFromFile: "+a3);
                            for (int j = 0; j < a3.length(); j++) {
                                newline.append(a3.charAt(j));
                            }
                            foundBracket=true;
                            break;
                        case '4':
                            Log.d(TAG, "readFromFile: "+a4);
                            for (int j = 0; j < a4.length(); j++) {
                                newline.append(a4.charAt(j));
                            }
                            foundBracket=true;
                            break;
                        case '5':
                            Log.d(TAG, "readFromFile: "+a5);
                            for (int j = 0; j < a5.length(); j++) {
                                newline.append(a5.charAt(j));
                            }
                            foundBracket=true;
                            break;
                        case '6':
                            Log.d(TAG, "readFromFile: "+a6);
                            for (int j = 0; j < a6.length(); j++) {
                                newline.append(a6.charAt(j));
                            }
                            foundBracket=true;
                            break;
                        case '7':
                            Log.d(TAG, "readFromFile: "+a7);
                            for (int j = 0; j < a7.length(); j++) {
                                newline.append(a7.charAt(j));
                            }
                            foundBracket=true;
                            break;
                    }
                } else if (line.charAt(i) == ']'){
                    foundBracket = false;
                    continue;
                }

                if (!foundBracket){
                    newline.append(line.charAt(i));
                }
            }
        }

        Intent intent = new Intent(this, activity_akhirCinderella.class);
        intent.putExtra("story", newline.toString());
        intent.putExtra("title", title);
        startActivity(intent);
        finish();
    }
}