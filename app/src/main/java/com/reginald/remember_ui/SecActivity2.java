package com.reginald.remember_ui;

import static com.reginald.remember_ui.R.id.seccondTextAct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class SecActivity2 extends AppCompatActivity {

    TextView textView;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sec2);

        textView = findViewById(R.id.seccondTextAct);


        String someInput = getIntent().getStringExtra("some input");

        textView.setText(someInput);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
}