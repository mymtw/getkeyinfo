package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ExtractionForegroundService extends Service {
    private final IBinder zza = new C15651s0(this);

    public final IBinder onBind(Intent intent) {
        return this.zza;
    }

    public final synchronized void zza() {
        stopForeground(true);
        stopSelf();
    }
}
