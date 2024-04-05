package p273w4;

import android.content.Context;
import com.bumptech.glide.RequestManager;
import p273w4.C8232b;
import p273w4.C8244m;

/* renamed from: w4.d */
public final class C8235d implements C8232b {

    /* renamed from: b */
    public final Context f18067b;

    /* renamed from: c */
    public final C8232b.C8233a f18068c;

    public C8235d(Context context, RequestManager.C5948c cVar) {
        this.f18067b = context.getApplicationContext();
        this.f18068c = cVar;
    }

    public final void onDestroy() {
    }

    public final void onStart() {
        C8244m a = C8244m.m16533a(this.f18067b);
        C8232b.C8233a aVar = this.f18068c;
        synchronized (a) {
            a.f18074b.add(aVar);
            a.mo20853b();
        }
    }

    public final void onStop() {
        C8244m a = C8244m.m16533a(this.f18067b);
        C8232b.C8233a aVar = this.f18068c;
        synchronized (a) {
            a.f18074b.remove(aVar);
            if (a.f18075c) {
                if (a.f18074b.isEmpty()) {
                    C8244m.C8247c cVar = a.f18073a;
                    cVar.f18080c.get().unregisterNetworkCallback(cVar.f18081d);
                    a.f18075c = false;
                }
            }
        }
    }
}
