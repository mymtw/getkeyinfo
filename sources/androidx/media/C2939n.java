package androidx.media;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.p014os.ResultReceiver;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.n */
public final class C2939n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C2923o f6640b;

    /* renamed from: c */
    public final /* synthetic */ String f6641c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f6642d;

    /* renamed from: e */
    public final /* synthetic */ ResultReceiver f6643e;

    /* renamed from: f */
    public final /* synthetic */ MediaBrowserServiceCompat.C2922n f6644f;

    public C2939n(MediaBrowserServiceCompat.C2922n nVar, MediaBrowserServiceCompat.C2924p pVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f6644f = nVar;
        this.f6640b = pVar;
        this.f6641c = str;
        this.f6642d = bundle;
        this.f6643e = resultReceiver;
    }

    public final void run() {
        MediaBrowserServiceCompat.C2909f orDefault = MediaBrowserServiceCompat.this.mConnections.getOrDefault(((MediaBrowserServiceCompat.C2924p) this.f6640b).mo10913a(), null);
        if (orDefault == null) {
            StringBuilder h = C0072d.m201h("sendCustomAction for callback that isn't registered action=");
            h.append(this.f6641c);
            h.append(", extras=");
            h.append(this.f6642d);
            Log.w(MediaBrowserServiceCompat.TAG, h.toString());
            return;
        }
        MediaBrowserServiceCompat.this.performCustomAction(this.f6641c, this.f6642d, orDefault, this.f6643e);
    }
}
