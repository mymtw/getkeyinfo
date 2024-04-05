package androidx.media;

import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.g */
public final class C2932g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C2923o f6612b;

    /* renamed from: c */
    public final /* synthetic */ MediaBrowserServiceCompat.C2922n f6613c;

    public C2932g(MediaBrowserServiceCompat.C2922n nVar, MediaBrowserServiceCompat.C2924p pVar) {
        this.f6613c = nVar;
        this.f6612b = pVar;
    }

    public final void run() {
        MediaBrowserServiceCompat.C2909f remove = MediaBrowserServiceCompat.this.mConnections.remove(((MediaBrowserServiceCompat.C2924p) this.f6612b).mo10913a());
        if (remove != null) {
            ((MediaBrowserServiceCompat.C2924p) remove.f6571f).mo10913a().unlinkToDeath(remove, 0);
        }
    }
}
