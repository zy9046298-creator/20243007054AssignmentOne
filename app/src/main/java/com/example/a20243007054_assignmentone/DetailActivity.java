package com.example.a20243007054_assignmentone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_INDEX = "ITEM_INDEX";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        int index = getIntent().getIntExtra(
                EXTRA_ITEM_INDEX,
                0
        );


        String[] categoryNames = getResources()
                .getStringArray(R.array.category_names);


        String[] titles = getResources()
                .getStringArray(R.array.string_array_titles);

        String[] contents = getResources()
                .getStringArray(R.array.string_array_content);

        String[] imageNames = getResources()
                .getStringArray(R.array.string_array_images);

        TextView categoryView = findViewById(R.id.detail_title);

        TextView titleView = findViewById(
                R.id.detail_content_title
        );

        TextView contentView = findViewById(
                R.id.detail_content
        );

        ImageView imageView = findViewById(
                R.id.detail_image
        );


        categoryView.setText(categoryNames[index]);
        titleView.setText(titles[index].trim());
        contentView.setText(contents[index]);


        String imageName = imageNames[index].trim();

        int imageId = getResources().getIdentifier(
                imageName,
                "drawable",
                getPackageName()
        );

        imageView.setImageResource(imageId);
    }
}