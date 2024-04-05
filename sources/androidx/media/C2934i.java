package androidx.media;

import android.os.IBinder;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.i */
public final class C2934i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C2923o f6619b;

    /* renamed from: c */
    public final /* synthetic */ String f6620c;

    /* renamed from: d */
    public final /* synthetic */ IBinder f6621d;

    /* renamed from: e */
    public final /* synthetic */ MediaBrowserServiceCompat.C2922n f6622e;

    public C2934i(MediaBrowserServiceCompat.C2922n nVar, MediaBrowserServiceCompat.C2924p pVar, String str, IBinder iBinder) {
        this.f6622e = nVar;
        this.f6619b = pVar;
        this.f6620c = str;
        this.f6621d = iBinder;
    }

    public final void run() {
        MediaBrowserServiceCompat.C2909f orDefault = MediaBrowserServiceCompat.this.mConnections.getOrDefault(((MediaBrowserServiceCompat.C2924p) this.f6619b).mo10913a(), null);
        if (orDefault == null) {
            StringBuilder h = C0072d.m201h("removeSubscription for callback that isn't registered id=");
            h.append(this.f6620c);
            Log.w(MediaBrowserServiceCompat.TAG, h.toString());
        } else if (!MediaBrowserServiceCompat.this.removeSubscription(this.f6620c, orDefault, this.f6621d)) {
            StringBuilder h2 = C0072d.m201h("removeSubscription called for ");
            h2.append(this.f6620c);
            h2.append(" which is not subscribed");
            Log.w(MediaBrowserServiceCompat.TAG, h2.toString());
        }
    }
}
