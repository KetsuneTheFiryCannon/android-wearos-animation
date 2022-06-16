package com.example.wearos_animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wearos_animation.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    ImageView rotateImage;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        rotateImage = findViewById(R.id.imageRotate);
        Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        rotateImage.startAnimation(rotate);

    }
}