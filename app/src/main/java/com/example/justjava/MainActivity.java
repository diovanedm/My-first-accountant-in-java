package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FloatingActionButton buttonSomar =  findViewById(R.id.somar_text_view);
        buttonSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increment();
            }
        });

        final FloatingActionButton buttonSubrair = findViewById(R.id.subrair_text_view);
        buttonSubrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrement();
            }
        });

        final Button buttonOrder = findViewById(R.id.order);
        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayPrice(quantity * 5);
            }
        });
    }


    public void increment() {
        quantity++;
        displayQuantity(quantity);
    }

    public void decrement(){
        if(quantity > 0) {
            quantity--;
            displayQuantity(quantity);
        }
    }

    public void displayQuantity(int value) {
        TextView textView = findViewById(R.id.quantity_text_view);
        textView.setText("" + value);
    }

    public void displayPrice(int value) {
        TextView priceCoffee = findViewById(R.id.price_text_view);
        priceCoffee.setText(NumberFormat.getCurrencyInstance().format(value));
    }
}