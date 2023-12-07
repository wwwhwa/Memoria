package com.example.memoria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MemoriaStart extends Activity {

    Button mStart;
    Button mExit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        mStart = (Button)findViewById(R.id.butStart);
        mExit = (Button)findViewById(R.id.butExit);

        mStart.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame();
            }
        });

        mExit.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void startGame () {
        Intent i = new Intent(this, MemoriaActivity.class);
        startActivity (i);
    }
}
