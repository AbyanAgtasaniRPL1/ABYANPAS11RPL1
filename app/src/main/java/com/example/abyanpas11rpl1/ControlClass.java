package com.example.abyanpas11rpl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.abyanpas11rpl1.MainActivity;
import com.example.abyanpas11rpl1.MainMenu;

public class ControlClass extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
        if (sharedPreferences.getString("username", "").isEmpty() ||
                sharedPreferences.getString("username", "").equalsIgnoreCase("")){
            //login dulu
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }else {
            startActivity(new Intent(getApplicationContext(), MainMenu.class));
            finish();
        }
    }
}