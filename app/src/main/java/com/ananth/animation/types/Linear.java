package com.ananth.animation.types;

import com.ananth.animation.tricks.BaseEasingMethod;

/**
 * Created by Babu on 5/2/2016.
 */
public class Linear extends BaseEasingMethod {
    public Linear(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*t/d + b;
    }
}
