package com.example.a20243007054_assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] categoryNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoryNames = getResources()
                .getStringArray(R.array.category_names);

        ImageButton btnFacilities = findViewById(R.id.btn_facilities);
        ImageButton btnEvents = findViewById(R.id.btn_events);
        ImageButton btnClubs = findViewById(R.id.btn_clubs);
        ImageButton btnSupport = findViewById(R.id.btn_support);

        btnFacilities.setOnClickListener(view -> openDetail(0));
        btnEvents.setOnClickListener(view -> openDetail(1));
        btnClubs.setOnClickListener(view -> openDetail(2));
        btnSupport.setOnClickListener(view -> openDetail(3));
    }


    private void openDetail(int index) {
        String message = getString(
                R.string.category_clicked,
                categoryNames[index]
        );

        Toast.makeText(
                this,
                message,
                Toast.LENGTH_SHORT
        ).show();

        Intent intent = new Intent(this, DetailActivity.class);

        intent.putExtra(
                DetailActivity.EXTRA_ITEM_INDEX,
                index
        );

        startActivity(intent);
    }
}