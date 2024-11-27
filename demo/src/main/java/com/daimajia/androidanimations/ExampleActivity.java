package com.daimajia.androidanimations;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class ExampleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example);

        final TextView t = findViewById(R.id.notice);
        t.setText("Please input your Email and Password");

        findViewById(R.id.submit).setOnClickListener(v -> {
            YoYo.with(Techniques.Tada)
                    .duration(700)
                    .playOn(findViewById(R.id.edit_area));

            t.setText("Wrong password!");
        });

        final TextView t2 = findViewById(R.id.notice2);
        t2.setText("Please input your Email and Password");

        findViewById(R.id.submit2).setOnClickListener(v -> {
            YoYo.with(Techniques.Shake).playOn(findViewById(R.id.edit_area2));

            t2.setText("Wrong password!");
        });
    }
}
