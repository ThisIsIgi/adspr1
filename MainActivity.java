package com.example.spr;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.math.*;

import java.util.function.ToIntFunction;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         EditText a = findViewById(R.id.aedit);

         EditText b = findViewById(R.id.bedit);

         EditText c = findViewById(R.id.cedit);

       EditText wynik = findViewById(R.id.wynik);
        Button button = findViewById(R.id.button);
        button.setOnClickListener((View v)-> {
            wynik.setText("");
             String astring = a.getText().toString();
             int aint = Integer.parseInt(astring);
             String bstring = b.getText().toString();
             float bint = Integer.parseInt(bstring);
             String cstring = c.getText().toString();
             int cint = Integer.parseInt(cstring);

             float dzialanie = (float) (bint*bint) -  (4*aint*cint);
             if(dzialanie<0){
                 wynik.setHint("brak rozwiazan");
             }else {
                 float dzialanie2 = (float) (-bint + Math.sqrt(dzialanie)/(2*aint));
                 float dzialanie3 = (float) (-bint - Math.sqrt(dzialanie)/(2*aint));
                 wynik.setText("DELTA: "+dzialanie+ " x1: "+dzialanie2+" x2: "+dzialanie3);
             }




        });
    }
}