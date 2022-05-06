package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonSomar =  findViewById(R.id.somar_text_view);
        buttonSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increment();
            }
        });

        final Button buttonSubrair = findViewById(R.id.subrair_text_view);
        buttonSubrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrement();
            }
        });
    }


    public void increment() {
        quantity++;
        displayQuantity(quantity);
        displayPrice(quantity * 5);
    }

    public void decrement(){
        if(quantity > 0) {
            quantity--;
            displayQuantity(quantity);
            displayPrice(quantity * 5);
        }
    }

    public void displayQuantity(int value) {
        TextView textView = findViewById(R.id.quantity_text_view);
        textView.setText("" + value);
    }

    public void displayPrice(int value) {
        TextView priceCoffee = findViewById(R.id.price_text_view);
        priceCoffee.setText("" + value);
    }
}