package com.paypal.pyplcheckout.animation.sequences;

import androidx.recyclerview.widget.RecyclerView;

public enum Duration {
    SHORT(500),
    LONG(RecyclerView.MAX_SCROLL_DURATION),
    SUPER(4000),
    NONE(0);
    
    private final int duration;

    private Duration(int i) {
        this.duration = i;
    }

    public final int getDuration() {
        return this.duration;
    }
}
