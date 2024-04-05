package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public class AssetPackExtractionService extends Service {
    public C15670x zza;

    public final IBinder onBind(Intent intent) {
        return this.zza;
    }

    public final void onCreate() {
        C15635o0 o0Var;
        super.onCreate();
        Context applicationContext = getApplicationContext();
        synchronized (C15588c1.class) {
            if (C15588c1.f35076b == null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 != null) {
                    applicationContext = applicationContext2;
                }
                C15588c1.f35076b = new C15635o0(new C15661u2(applicationContext));
            }
            o0Var = C15588c1.f35076b;
        }
        this.zza = (C15670x) o0Var.f35263a.zza();
    }
}
