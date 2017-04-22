package com.example.anakarina.aplicacionandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView vista1;
    Button boton1;
    RadioGroup radioGroup;

    @Override

    // este metodo se ejecuta cuando e inicia la pantalla
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //declaro variables
        vista1 =(TextView) findViewById(R.id.view1);
        boton1 = (Button) findViewById(R.id.button);
        radioGroup = (RadioGroup) findViewById(R.id.Radiogroup1);
        boton1.setOnClickListener(this);
        this.leo();




    }

    @Override
    //este metodo me permite ir a la segunda vista
    public void onClick(View v) {
        switch (v.getId()){

        case R.id.button:
        vista1.setText("oprimimos boton1");
             Intent intent = new Intent(this,Activity2.class);
            startActivity(intent);
             break;
          //  case R.id.button2:
            //        vista1.setText("boton 2");

              //  Intent dos = new Intent(this,Activity2.class);
               // startActivity(dos);
        default:

             break;
        }
    }


    //este metodo me permite  seleccionar los radiobutton



   public void leo () {

       radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

               switch (checkedId) {

                   case R.id.radioButtonOne:
                       Toast.makeText(getApplicationContext(),"opcion",Toast.LENGTH_SHORT).show();;
                       break;

                   case R.id.radioButtonTwo:
                       Toast.makeText(getApplicationContext(),"opcion2",Toast.LENGTH_SHORT).show();
                       break;

                   case R.id.radioButtonthree:
                       Toast.makeText(getApplicationContext(),"opcion3",Toast.LENGTH_SHORT).show();
                       break;

                   case R.id.radioButtonfour:
                       Toast.makeText(getApplicationContext(),"opcion4",Toast.LENGTH_SHORT).show();
                       break;

                   default:

                       break;

               }


           }
       });
   }















}

















