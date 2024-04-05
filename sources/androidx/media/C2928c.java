package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import p193o.C7494b;
import p261v1.C8192a;

/* renamed from: androidx.media.c */
public final class C2928c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C8192a f6600b;

    /* renamed from: c */
    public final /* synthetic */ String f6601c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f6602d;

    /* renamed from: e */
    public final /* synthetic */ MediaBrowserServiceCompat.C2912h f6603e;

    public C2928c(MediaBrowserServiceCompat.C2912h hVar, C8192a aVar, String str, Bundle bundle) {
        this.f6603e = hVar;
        this.f6600b = aVar;
        this.f6601c = str;
        this.f6602d = bundle;
    }

    public final void run() {
        int i = 0;
        while (true) {
            C7494b<IBinder, MediaBrowserServiceCompat.C2909f> bVar = MediaBrowserServiceCompat.this.mConnections;
            if (i < bVar.f16745d) {
                MediaBrowserServiceCompat.C2909f n = bVar.mo19980n(i);
                if (n.f6569d.equals(this.f6600b)) {
                    this.f6603e.mo10903h(n, this.f6601c, this.f6602d);
                }
                i++;
            } else {
                return;
            }
        }
    }
}
