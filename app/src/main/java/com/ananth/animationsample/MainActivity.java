package com.ananth.animationsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ananth.animation.tricks.Techniques;
import com.ananth.animation.tricks.YoYo;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView mLandingAnimation;
    private TextView mTakingOffAnimation;
    private TextView mBounceInAnimation;
    private TextView mBounceInUpAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back_arrow);
        mLandingAnimation=(TextView)findViewById(R.id.landing_animator);
        mTakingOffAnimation=(TextView)findViewById(R.id.taking_off__animator);
        mBounceInAnimation=(TextView)findViewById(R.id.bounce_in__animator);
        mBounceInUpAnimation=(TextView)findViewById(R.id.bounce_in_up__animator);


        mLandingAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AnimationPlay.class).putExtra("type","landing"));
            }
        });

        mTakingOffAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AnimationPlay.class).putExtra("type","taking_off"));
            }
        });

        mBounceInAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AnimationPlay.class).putExtra("type","bounce_in"));
            }
        });

        mBounceInUpAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AnimationPlay.class).putExtra("type","bounce_in_up"));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        /*switch (item.getItemId()) {

            case R.id.edit_icon:
                Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            default:
                break;
        }*/
        return true;
    }
}
