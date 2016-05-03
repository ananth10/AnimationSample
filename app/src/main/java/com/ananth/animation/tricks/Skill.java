package com.ananth.animation.tricks;

/**
 * Created by Babu on 5/2/2016.
 */
public enum Skill {


    QuintEaseOut(QuintEaseOut.class),
    Linear(com.ananth.animation.types.Linear.class);


    private Class easingMethod;

    private Skill(Class clazz) {
        easingMethod = clazz;
    }

    public BaseEasingMethod getMethod(float duration) {
        try {
            return (BaseEasingMethod)easingMethod.getConstructor(float.class).newInstance(duration);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
