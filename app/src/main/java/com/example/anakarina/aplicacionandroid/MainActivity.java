package com.example.anakarina.aplicacionandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView vista1;
    Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        vista1 =(TextView) findViewById(R.id.view1);
        boton1 = (Button) findViewById(R.id.button);
        boton1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        case R.id.button:
        vista1.setText("oprimimos boton1");
             Intent intent = new Intent(this,Activity2.class);
            startActivity(intent);
             break;
            case R.id.button2:
                    vista1.setText("boton 2");

                Intent dos = new Intent(this,Activity2.class);
                startActivity(dos);
        default:

             break;
        }
    }
}
