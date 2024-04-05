package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Iterator;
import p193o.C7494b;
import p193o.C7500h;

/* renamed from: androidx.media.b */
public final class C2927b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f6597b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f6598c;

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C2912h f6599d;

    public C2927b(MediaBrowserServiceCompat.C2912h hVar, String str, Bundle bundle) {
        this.f6599d = hVar;
        this.f6597b = str;
        this.f6598c = bundle;
    }

    public final void run() {
        Iterator it = ((C7500h.C7503c) MediaBrowserServiceCompat.this.mConnections.keySet()).iterator();
        while (it.hasNext()) {
            C7494b<IBinder, MediaBrowserServiceCompat.C2909f> bVar = MediaBrowserServiceCompat.this.mConnections;
            this.f6599d.mo10903h(bVar.getOrDefault((IBinder) it.next(), null), this.f6597b, this.f6598c);
        }
    }
}
