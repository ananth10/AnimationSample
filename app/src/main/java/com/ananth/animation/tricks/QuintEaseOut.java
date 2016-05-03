package com.ananth.animation.tricks;

/**
 * Created by Babu on 5/2/2016.
 */
public class QuintEaseOut extends BaseEasingMethod{
    public QuintEaseOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*((t=t/d-1)*t*t*t*t + 1) + b;
    }
}
