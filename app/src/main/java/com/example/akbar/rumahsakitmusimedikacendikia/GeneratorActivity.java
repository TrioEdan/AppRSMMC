package com.example.akbar.rumahsakitmusimedikacendikia;

import android.graphics.Bitmap;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class GeneratorActivity extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generator);
        imageView = findViewById(R.id.image1);
        Bitmap bitmap = getIntent().getParcelableExtra("pict");
        imageView.setImageBitmap(bitmap);
    }
}
