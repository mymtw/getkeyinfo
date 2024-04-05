package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.h */
public final class C2933h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C2923o f6614b;

    /* renamed from: c */
    public final /* synthetic */ String f6615c;

    /* renamed from: d */
    public final /* synthetic */ IBinder f6616d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f6617e;

    /* renamed from: f */
    public final /* synthetic */ MediaBrowserServiceCompat.C2922n f6618f;

    public C2933h(MediaBrowserServiceCompat.C2922n nVar, MediaBrowserServiceCompat.C2924p pVar, String str, IBinder iBinder, Bundle bundle) {
        this.f6618f = nVar;
        this.f6614b = pVar;
        this.f6615c = str;
        this.f6616d = iBinder;
        this.f6617e = bundle;
    }

    public final void run() {
        MediaBrowserServiceCompat.C2909f orDefault = MediaBrowserServiceCompat.this.mConnections.getOrDefault(((MediaBrowserServiceCompat.C2924p) this.f6614b).mo10913a(), null);
        if (orDefault == null) {
            StringBuilder h = C0072d.m201h("addSubscription for callback that isn't registered id=");
            h.append(this.f6615c);
            Log.w(MediaBrowserServiceCompat.TAG, h.toString());
            return;
        }
        MediaBrowserServiceCompat.this.addSubscription(this.f6615c, orDefault, this.f6616d, this.f6617e);
    }
}
