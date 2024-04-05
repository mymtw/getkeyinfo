package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.f */
public final class C2931f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C2923o f6606b;

    /* renamed from: c */
    public final /* synthetic */ String f6607c;

    /* renamed from: d */
    public final /* synthetic */ int f6608d;

    /* renamed from: e */
    public final /* synthetic */ int f6609e;

    /* renamed from: f */
    public final /* synthetic */ Bundle f6610f;

    /* renamed from: g */
    public final /* synthetic */ MediaBrowserServiceCompat.C2922n f6611g;

    public C2931f(int i, int i2, Bundle bundle, MediaBrowserServiceCompat.C2922n nVar, MediaBrowserServiceCompat.C2924p pVar, String str) {
        this.f6611g = nVar;
        this.f6606b = pVar;
        this.f6607c = str;
        this.f6608d = i;
        this.f6609e = i2;
        this.f6610f = bundle;
    }

    public final void run() {
        IBinder a = ((MediaBrowserServiceCompat.C2924p) this.f6606b).mo10913a();
        MediaBrowserServiceCompat.this.mConnections.remove(a);
        MediaBrowserServiceCompat.C2909f fVar = new MediaBrowserServiceCompat.C2909f(this.f6607c, this.f6608d, this.f6609e, this.f6610f, this.f6606b);
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        mediaBrowserServiceCompat.mCurConnection = fVar;
        MediaBrowserServiceCompat.C2908e onGetRoot = mediaBrowserServiceCompat.onGetRoot(this.f6607c, this.f6609e, this.f6610f);
        fVar.f6573h = onGetRoot;
        MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
        mediaBrowserServiceCompat2.mCurConnection = null;
        if (onGetRoot == null) {
            StringBuilder h = C0072d.m201h("No root for client ");
            h.append(this.f6607c);
            h.append(" from service ");
            h.append(C2931f.class.getName());
            Log.i(MediaBrowserServiceCompat.TAG, h.toString());
            try {
                ((MediaBrowserServiceCompat.C2924p) this.f6606b).mo10915c(2, (Bundle) null);
            } catch (RemoteException unused) {
                StringBuilder h2 = C0072d.m201h("Calling onConnectFailed() failed. Ignoring. pkg=");
                h2.append(this.f6607c);
                Log.w(MediaBrowserServiceCompat.TAG, h2.toString());
            }
        } else {
            try {
                mediaBrowserServiceCompat2.mConnections.put(a, fVar);
                a.linkToDeath(fVar, 0);
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.mSession;
                if (token != null) {
                    MediaBrowserServiceCompat.C2923o oVar = this.f6606b;
                    MediaBrowserServiceCompat.C2908e eVar = fVar.f6573h;
                    String str = eVar.f6564a;
                    Bundle bundle = eVar.f6565b;
                    MediaBrowserServiceCompat.C2924p pVar = (MediaBrowserServiceCompat.C2924p) oVar;
                    pVar.getClass();
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putInt("extra_service_version", 2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_media_item_id", str);
                    bundle2.putParcelable("data_media_session_token", token);
                    bundle2.putBundle("data_root_hints", bundle);
                    pVar.mo10915c(1, bundle2);
                }
            } catch (RemoteException unused2) {
                StringBuilder h3 = C0072d.m201h("Calling onConnect() failed. Dropping client. pkg=");
                h3.append(this.f6607c);
                Log.w(MediaBrowserServiceCompat.TAG, h3.toString());
                MediaBrowserServiceCompat.this.mConnections.remove(a);
            }
        }
    }
}
