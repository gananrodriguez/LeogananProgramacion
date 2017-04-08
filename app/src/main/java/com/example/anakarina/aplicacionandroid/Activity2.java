package com.example.anakarina.aplicacionandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView vistados;
        Button botonotro;


        vistados = (TextView) findViewById(R.id.view2);
        botonotro = (Button) findViewById(R.id.button3);
    }

    @Override
    public void onClick(View view) {

        Intent volver = new Intent(this,MainActivity.class);
        startActivity(volver);
    }
}
