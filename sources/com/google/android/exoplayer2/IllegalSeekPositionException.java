package com.google.android.exoplayer2;

import p594jh.C17939k1;

public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final C17939k1 timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(C17939k1 k1Var, int i, long j) {
        this.timeline = k1Var;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
