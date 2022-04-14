package fryctze.college.collegekb2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_akhirTarzan extends AppCompatActivity {

    TextView tvStory, tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhir_tarzan);

        String story = getIntent().getStringExtra("story");
        String title = getIntent().getStringExtra("title");
        initUI();

        tvStory.setText(story);
        tvTitle.setText(title);
    }
    private void initUI() {
        tvStory = findViewById(R.id.textcinderella);
        tvTitle = findViewById(R.id.tv_title);
    }

    public void clickPlayAgainTarzan(View view) {
        startActivity(new Intent(this, gantiKataTarzan.class));
        finish();
    }

    public void clickHomeFromTarzan(View view) {
        finish();
    }
}