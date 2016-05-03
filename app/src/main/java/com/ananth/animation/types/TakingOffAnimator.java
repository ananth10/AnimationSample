package com.ananth.animation.types;

import android.animation.ObjectAnimator;
import android.view.View;

import com.ananth.animation.tricks.BaseViewAnimator;
import com.ananth.animation.tricks.Glider;
import com.ananth.animation.tricks.Skill;

/**
 * Created by Babu on 5/3/2016.
 */
public class TakingOffAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                Glider.glide(Skill.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "scaleX", 1f, 1.5f)),
                Glider.glide(Skill.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "scaleY", 1f, 1.5f)),
                Glider.glide(Skill.QuintEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "alpha", 1, 0))
        );
    }
}
