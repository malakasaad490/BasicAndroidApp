package com.example.basicandroidapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            return insets;
        });
        Button btnAdd=findViewById(R.id.btnAdd);
        Button btnShow=findViewById(R.id.btnShow);
        btnAdd.setOnClickListener(v -> showFragment(new AddClothesFragment()));
        btnShow.setOnClickListener(v -> showFragment(new ShowClothesFragment()));
        if (savedInstanceState==null){
            showFragment(new AdminFragment());
        }



    }

    private void showFragment(Fragment fragment) {
        FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
        FragmentTransaction ft =transaction;
        ft = ft.replace(R.id.main,fragment);
        ft.commit();
    }
}