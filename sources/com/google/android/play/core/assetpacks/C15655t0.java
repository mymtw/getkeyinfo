package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.internal.zzz;
import java.util.ArrayList;

/* renamed from: com.google.android.play.core.assetpacks.t0 */
public final class C15655t0 implements ServiceConnection {

    /* renamed from: b */
    public final C15032m3 f35333b = new C15032m3("ExtractionForegroundServiceConnection");

    /* renamed from: c */
    public final ArrayList f35334c = new ArrayList();

    /* renamed from: d */
    public final Context f35335d;

    /* renamed from: e */
    public ExtractionForegroundService f35336e;

    /* renamed from: f */
    public Notification f35337f;

    public C15655t0(Context context) {
        this.f35335d = context;
    }

    /* renamed from: a */
    public final void mo55486a() {
        ArrayList arrayList;
        synchronized (this.f35334c) {
            arrayList = new ArrayList(this.f35334c);
            this.f35334c.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((zzz) arrayList.get(i)).zze(new Bundle(), new Bundle());
            } catch (RemoteException unused) {
                this.f35333b.mo52243c("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f35333b.mo52242b("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((C15651s0) iBinder).f35328a;
        this.f35336e = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f35337f);
        mo55486a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
