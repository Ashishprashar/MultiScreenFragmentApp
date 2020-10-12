package com.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numbers,familyMembers,colors,pharases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setView();
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(intent);
            }
        });
        familyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(intent);
            }
        });
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(intent);
            }
        });
        pharases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PharasesActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setView() {
        numbers= findViewById(R.id.number);
        familyMembers= findViewById(R.id.family);
        colors=findViewById(R.id.colors);
        pharases=findViewById(R.id.phrases);
    }

}