package com.reginald.remember_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.Viewing);

        editText = findViewById(R.id.editText);
    }

    public void getSecAct(){
        Intent intent = new Intent(MainActivity.this, SecActivity2.class);

        intent.putExtra("some input",editText.getText().toString());

        startActivity(intent);


    }


    public void animate(View view){

        textview.animate().rotationBy(360).start();

        textview.animate().scaleXBy(190).start();

        textview.animate().setDuration(20).start();


        getSecAct();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}