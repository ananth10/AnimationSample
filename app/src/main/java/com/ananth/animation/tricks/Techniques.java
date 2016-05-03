package com.ananth.animation.tricks;

import com.ananth.animation.types.BounceInAnimator;
import com.ananth.animation.types.BounceInUpAnimator;
import com.ananth.animation.types.LandingAnimator;
import com.ananth.animation.types.TakingOffAnimator;

/**
 * Created by Babu on 5/2/2016.
 */
public enum  Techniques {

    BounceIn(BounceInAnimator.class),
    BounceInUp(BounceInUpAnimator.class),
    Landing(LandingAnimator.class),
    TakingOff(TakingOffAnimator.class);
    private Class animatorClazz;

    private Techniques(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
