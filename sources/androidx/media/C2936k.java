package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Iterator;

/* renamed from: androidx.media.k */
public final class C2936k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C2923o f6627b;

    /* renamed from: c */
    public final /* synthetic */ int f6628c;

    /* renamed from: d */
    public final /* synthetic */ String f6629d;

    /* renamed from: e */
    public final /* synthetic */ int f6630e;

    /* renamed from: f */
    public final /* synthetic */ Bundle f6631f;

    /* renamed from: g */
    public final /* synthetic */ MediaBrowserServiceCompat.C2922n f6632g;

    public C2936k(int i, int i2, Bundle bundle, MediaBrowserServiceCompat.C2922n nVar, MediaBrowserServiceCompat.C2924p pVar, String str) {
        this.f6632g = nVar;
        this.f6627b = pVar;
        this.f6628c = i;
        this.f6629d = str;
        this.f6630e = i2;
        this.f6631f = bundle;
    }

    public final void run() {
        IBinder a = ((MediaBrowserServiceCompat.C2924p) this.f6627b).mo10913a();
        MediaBrowserServiceCompat.this.mConnections.remove(a);
        Iterator<MediaBrowserServiceCompat.C2909f> it = MediaBrowserServiceCompat.this.mPendingConnections.iterator();
        MediaBrowserServiceCompat.C2909f fVar = null;
        while (it.hasNext()) {
            MediaBrowserServiceCompat.C2909f next = it.next();
            if (next.f6568c == this.f6628c) {
                if (TextUtils.isEmpty(this.f6629d) || this.f6630e <= 0) {
                    fVar = new MediaBrowserServiceCompat.C2909f(next.f6566a, next.f6567b, next.f6568c, this.f6631f, this.f6627b);
                }
                it.remove();
            }
        }
        if (fVar == null) {
            fVar = new MediaBrowserServiceCompat.C2909f(this.f6629d, this.f6630e, this.f6628c, this.f6631f, this.f6627b);
        }
        MediaBrowserServiceCompat.this.mConnections.put(a, fVar);
        try {
            a.linkToDeath(fVar, 0);
        } catch (RemoteException unused) {
            Log.w(MediaBrowserServiceCompat.TAG, "IBinder is already dead.");
        }
    }
}
