package androidx.media;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.p014os.ResultReceiver;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.m */
public final class C2938m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C2923o f6635b;

    /* renamed from: c */
    public final /* synthetic */ String f6636c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f6637d;

    /* renamed from: e */
    public final /* synthetic */ ResultReceiver f6638e;

    /* renamed from: f */
    public final /* synthetic */ MediaBrowserServiceCompat.C2922n f6639f;

    public C2938m(MediaBrowserServiceCompat.C2922n nVar, MediaBrowserServiceCompat.C2924p pVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f6639f = nVar;
        this.f6635b = pVar;
        this.f6636c = str;
        this.f6637d = bundle;
        this.f6638e = resultReceiver;
    }

    public final void run() {
        MediaBrowserServiceCompat.C2909f orDefault = MediaBrowserServiceCompat.this.mConnections.getOrDefault(((MediaBrowserServiceCompat.C2924p) this.f6635b).mo10913a(), null);
        if (orDefault == null) {
            StringBuilder h = C0072d.m201h("search for callback that isn't registered query=");
            h.append(this.f6636c);
            Log.w(MediaBrowserServiceCompat.TAG, h.toString());
            return;
        }
        MediaBrowserServiceCompat.this.performSearch(this.f6636c, this.f6637d, orDefault, this.f6638e);
    }
}
