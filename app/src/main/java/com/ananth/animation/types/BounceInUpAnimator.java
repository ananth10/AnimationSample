package com.ananth.animation.types;

import android.animation.ObjectAnimator;
import android.view.View;

import com.ananth.animation.tricks.BaseViewAnimator;

/**
 * Created by Babu on 5/3/2016.
 */
public class BounceInUpAnimator  extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"translationY",target.getMeasuredHeight(), -30,10,0),
                ObjectAnimator.ofFloat(target,"alpha",0,1,1,1)
        );
    }
}
