package com.etsy.android.feedback.data;

public enum Rating {
    NONE((String) null),
    ONE_STAR(1),
    TWO_STAR(2),
    THREE_STAR(3),
    FOUR_STAR(4),
    FIVE_STAR(5);
    
    private final Integer value;

    private Rating(Integer num) {
        this.value = num;
    }

    public final Integer getValue() {
        return this.value;
    }
}
