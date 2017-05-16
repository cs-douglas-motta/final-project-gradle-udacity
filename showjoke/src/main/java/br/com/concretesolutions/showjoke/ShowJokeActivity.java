package br.com.concretesolutions.showjoke;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShowJokeActivity extends AppCompatActivity {
    public static final String EXTRA_TELL_JOKE = "EXTRA_TELL_JOKE";

    private String tellJoke;

    private TextView tvShowJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);

        initFields();
        showJoke();
    }

    private void initFields() {
        tvShowJoke = (TextView) findViewById(R.id.tv_show_joke);

        if (getIntent() != null && getIntent().hasExtra(EXTRA_TELL_JOKE)) {
            tellJoke = getIntent().getStringExtra(EXTRA_TELL_JOKE);
        }
    }

    private void showJoke() {
        tvShowJoke.setText(tellJoke);
    }
}
