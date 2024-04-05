package androidx.media;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.p014os.ResultReceiver;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.j */
public final class C2935j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C2923o f6623b;

    /* renamed from: c */
    public final /* synthetic */ String f6624c;

    /* renamed from: d */
    public final /* synthetic */ ResultReceiver f6625d;

    /* renamed from: e */
    public final /* synthetic */ MediaBrowserServiceCompat.C2922n f6626e;

    public C2935j(MediaBrowserServiceCompat.C2922n nVar, MediaBrowserServiceCompat.C2924p pVar, String str, ResultReceiver resultReceiver) {
        this.f6626e = nVar;
        this.f6623b = pVar;
        this.f6624c = str;
        this.f6625d = resultReceiver;
    }

    public final void run() {
        MediaBrowserServiceCompat.C2909f orDefault = MediaBrowserServiceCompat.this.mConnections.getOrDefault(((MediaBrowserServiceCompat.C2924p) this.f6623b).mo10913a(), null);
        if (orDefault == null) {
            StringBuilder h = C0072d.m201h("getMediaItem for callback that isn't registered id=");
            h.append(this.f6624c);
            Log.w(MediaBrowserServiceCompat.TAG, h.toString());
            return;
        }
        MediaBrowserServiceCompat.this.performLoadItem(this.f6624c, orDefault, this.f6625d);
    }
}
