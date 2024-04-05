package com.etsy.android.lib.models.conversation;

public final class InteractionState {
    public static final int $stable = 0;
    private final boolean isDraftInProgress;
    private final boolean isPhotoLoading;
    private final boolean isSending;

    public final boolean isDraftInProgress() {
        return this.isDraftInProgress;
    }

    public final boolean isPhotoLoading() {
        return this.isPhotoLoading;
    }

    public final boolean isSending() {
        return this.isSending;
    }
}
