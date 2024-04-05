package com.braze.enums;

import androidx.recyclerview.widget.RecyclerView;

public enum BrazeViewBounds {
    NOTIFICATION_EXPANDED_IMAGE(478, 256),
    NOTIFICATION_INLINE_PUSH_IMAGE(384, 256),
    NOTIFICATION_LARGE_ICON(64, 64),
    NOTIFICATION_ONE_IMAGE_STORY(256, 128),
    BASE_CARD_VIEW(RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN, RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN),
    IN_APP_MESSAGE_MODAL(580, 580),
    IN_APP_MESSAGE_SLIDEUP(100, 100),
    NO_BOUNDS(0, 0);
    
    private final int heightDp;
    private final int widthDp;

    private BrazeViewBounds(int i, int i2) {
        this.widthDp = i;
        this.heightDp = i2;
    }

    public final int getHeightDp() {
        return this.heightDp;
    }

    public final int getWidthDp() {
        return this.widthDp;
    }
}
