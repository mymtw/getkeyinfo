package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.l */
public final class C2937l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C2923o f6633b;

    /* renamed from: c */
    public final /* synthetic */ MediaBrowserServiceCompat.C2922n f6634c;

    public C2937l(MediaBrowserServiceCompat.C2922n nVar, MediaBrowserServiceCompat.C2924p pVar) {
        this.f6634c = nVar;
        this.f6633b = pVar;
    }

    public final void run() {
        IBinder a = ((MediaBrowserServiceCompat.C2924p) this.f6633b).mo10913a();
        MediaBrowserServiceCompat.C2909f remove = MediaBrowserServiceCompat.this.mConnections.remove(a);
        if (remove != null) {
            a.unlinkToDeath(remove, 0);
        }
    }
}
