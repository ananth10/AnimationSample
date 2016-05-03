package com.ananth.animationsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;

import com.ananth.animation.tricks.Techniques;
import com.ananth.animation.tricks.YoYo;

public class AnimationPlay extends AppCompatActivity {

    private Toolbar toolbar;
    private String mType;
    private ImageView mHeart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_play);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back_arrow);
        mHeart=(ImageView)findViewById(R.id.like_heart);

        if(getIntent()!=null)
        {
            mType=getIntent().getStringExtra("type");
        }
        playAnimation(mType);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return true;
    }

    private void playAnimation(String type)
    {
        switch (type)
        {
            case "landing":
                YoYo.with(Techniques.Landing)
                        .duration(2000)
                        .playOn(findViewById(R.id.like_heart));
                break;
            case "taking_off":
                YoYo.with(Techniques.TakingOff)
                        .duration(2000)
                        .playOn(findViewById(R.id.like_heart));
                break;
            case "bounce_in":
                YoYo.with(Techniques.BounceIn)
                        .duration(2000)
                        .playOn(findViewById(R.id.like_heart));
                break;
            case "bounce_in_up":
                YoYo.with(Techniques.BounceInUp)
                        .duration(2000)
                        .playOn(findViewById(R.id.like_heart));

                break;
        }
    }
}
