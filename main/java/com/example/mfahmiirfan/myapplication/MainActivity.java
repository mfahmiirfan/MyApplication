package com.example.mfahmiirfan.myapplication;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Minus(View view){
        TextView quantity=(TextView)findViewById(R.id.quantity);
        i =Integer.parseInt((String) quantity.getText());
        if(i>0){
            i = i-1;
            quantity.setText(""+i);
        }
    }

    public void Plus(View view){
        TextView quantity=(TextView)findViewById(R.id.quantity);
        i =Integer.parseInt((String) quantity.getText());
        i = i+1;
        quantity.setText(""+i);
    }

    public void Submit(View view){
        int hargaSatuan=6500;
        TextView totalBayar=(TextView)findViewById(R.id.totalbayar);
        EditText hargaInput=(EditText)findViewById(R.id.hargainput);
        if(!hargaInput.getText().toString().isEmpty()){
            hargaSatuan=Integer.parseInt(hargaInput.getText().toString());
        }
        totalBayar.setText("Rp."+ (hargaSatuan*i));
    }
}
