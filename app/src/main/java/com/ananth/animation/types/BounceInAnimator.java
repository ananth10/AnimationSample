package com.ananth.animation.types;

import android.animation.ObjectAnimator;
import android.view.View;

import com.ananth.animation.tricks.BaseViewAnimator;

/**
 * Created by Babu on 5/2/2016.
 */
public class BounceInAnimator extends BaseViewAnimator {


    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",0,1, 1 ,1),
                ObjectAnimator.ofFloat(target,"scaleX",0.3f,1.05f,0.9f,1),
                ObjectAnimator.ofFloat(target,"scaleY",0.3f,1.05f,0.9f,1)
        );
    }
}
