package com.example.choice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import me.mutasem.booleanselection.BooleanSelectionView;

public class MainActivity extends AppCompatActivity {

    BooleanSelectionView gender, old_1, old_2, old_3, old_4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        gender = findViewById(R.id.gender);
        old_1 = findViewById(R.id.old1);
        old_2 = findViewById(R.id.old2);
        old_3 = findViewById(R.id.old3);
        old_4 = findViewById(R.id.old4);
        button = findViewById(R.id.button);
        final Intent nextPage = new Intent(this, NextPage.class);

        gender.setSelectionListener(new BooleanSelectionView.SelectionListener() {
            @Override
            public void onSelectionChanged(int selection, String selectedText) {
                Toast.makeText(MainActivity.this, selectedText, Toast.LENGTH_SHORT).show();
                nextPage.putExtra("gender", selectedText);
            }
        });

        old_1.setSelectionListener(new BooleanSelectionView.SelectionListener() {
            @Override
            public void onSelectionChanged(int selection, String selectedText) {
                Toast.makeText(MainActivity.this, selectedText, Toast.LENGTH_SHORT).show();
                nextPage.putExtra(Intent.EXTRA_TEXT, selectedText);
            }
        });

        old_2.setSelectionListener(new BooleanSelectionView.SelectionListener() {
            @Override
            public void onSelectionChanged(int selection, String selectedText) {
                Toast.makeText(MainActivity.this, selectedText, Toast.LENGTH_SHORT).show();
                nextPage.putExtra(Intent.EXTRA_TEXT, selectedText);
            }
        });

        old_3.setSelectionListener(new BooleanSelectionView.SelectionListener() {
            @Override
            public void onSelectionChanged(int selection, String selectedText) {
                Toast.makeText(MainActivity.this, selectedText, Toast.LENGTH_SHORT).show();
                nextPage.putExtra(Intent.EXTRA_TEXT, selectedText);
            }
        });

        old_4.setSelectionListener(new BooleanSelectionView.SelectionListener() {
            @Override
            public void onSelectionChanged(int selection, String selectedText) {
                Toast.makeText(MainActivity.this, selectedText, Toast.LENGTH_SHORT).show();
                nextPage.putExtra(Intent.EXTRA_TEXT, selectedText);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nextPage);
            }
        });

    }
}
