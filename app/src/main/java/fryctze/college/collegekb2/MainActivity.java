package fryctze.college.collegekb2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "asd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readFromFile();
    }


    private void readFromFile(){
        String a = "namaku";
        String b = "namamu";

        Scanner scan = new Scanner(getResources().openRawResource(R.raw.cinderella));
        String oldline = "";
        StringBuilder newline = new StringBuilder();

        while (scan.hasNextLine()){
            String line = scan.nextLine();
            oldline = line;
            boolean foundBracket = false;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '['){
                    switch (line.charAt(i+1)){
                        case '0':
                            for (int j = 0; j < a.length(); j++) {
                                newline.append(a.charAt(j));
                            }
                            foundBracket=true;
                            break;
                        case '1':
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

        Log.d(TAG, "readFromFile: old line "+oldline);
        Log.d(TAG, "readFromFile: newline "+newline);
    }

    public void clickSuperman(View view) {
    }

    public void clickCinderella(View view) {
    }

    public void clickTarzan(View view) {
    }

    public void clickCredit(View view) {
    }
}