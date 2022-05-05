package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonSomar =  findViewById(R.id.somar_text_view);
        buttonSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.quantity_text_view);
                int soma = Integer.parseInt((String) textView.getText()) + 1;
                textView.setText("" + soma);
            }
        });

        final Button buttonSubrair = findViewById(R.id.subrair_text_view);
        buttonSubrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.quantity_text_view);
                if(Integer.parseInt((String) textView.getText()) > 0) {
                    int subtrair = Integer.parseInt((String) textView.getText()) - 1;
                    textView.setText("" + subtrair);
                }
            }
        });
    }
}