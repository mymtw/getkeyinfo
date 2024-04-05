package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

final class zabd implements BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ GoogleApiManager zaa;

    public zabd(GoogleApiManager googleApiManager) {
        this.zaa = googleApiManager;
    }

    public final void onBackgroundStateChanged(boolean z) {
        this.zaa.zat.sendMessage(this.zaa.zat.obtainMessage(1, Boolean.valueOf(z)));
    }
}
