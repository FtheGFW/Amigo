package me.ele.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import me.ele.amigo.Amigo;

public class ThirdActivity extends AppCompatActivity {

    public static final String TAG = ThirdActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(TAG, "resources--->" + getResources());

        setContentView(R.layout.activity_main);

//        Amigo.clear(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Amigo.work(ThirdActivity.this);
            }
        });
    }
}
