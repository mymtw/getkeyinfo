package p273w4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p036c5.C4419f;
import p036c5.C4420g;
import p036c5.C4426l;
import p273w4.C8232b;

/* renamed from: w4.m */
public final class C8244m {

    /* renamed from: d */
    public static volatile C8244m f18072d;

    /* renamed from: a */
    public final C8247c f18073a;

    /* renamed from: b */
    public final HashSet f18074b = new HashSet();

    /* renamed from: c */
    public boolean f18075c;

    /* renamed from: w4.m$a */
    public class C8245a implements C4420g<ConnectivityManager> {

        /* renamed from: a */
        public final /* synthetic */ Context f18076a;

        public C8245a(Context context) {
            this.f18076a = context;
        }

        public final Object get() {
            return (ConnectivityManager) this.f18076a.getSystemService("connectivity");
        }
    }

    /* renamed from: w4.m$b */
    public class C8246b implements C8232b.C8233a {
        public C8246b() {
        }

        /* renamed from: a */
        public final void mo16810a(boolean z) {
            ArrayList arrayList;
            synchronized (C8244m.this) {
                arrayList = new ArrayList(C8244m.this.f18074b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C8232b.C8233a) it.next()).mo16810a(z);
            }
        }
    }

    /* renamed from: w4.m$c */
    public static final class C8247c {

        /* renamed from: a */
        public boolean f18078a;

        /* renamed from: b */
        public final C8232b.C8233a f18079b;

        /* renamed from: c */
        public final C4420g<ConnectivityManager> f18080c;

        /* renamed from: d */
        public final C8248a f18081d = new C8248a();

        /* renamed from: w4.m$c$a */
        public class C8248a extends ConnectivityManager.NetworkCallback {
            public C8248a() {
            }

            public final void onAvailable(Network network) {
                C4426l.m10132f().post(new C8249n(this, true));
            }

            public final void onLost(Network network) {
                C4426l.m10132f().post(new C8249n(this, false));
            }
        }

        public C8247c(C4419f fVar, C8246b bVar) {
            this.f18080c = fVar;
            this.f18079b = bVar;
        }
    }

    public C8244m(Context context) {
        this.f18073a = new C8247c(new C4419f(new C8245a(context)), new C8246b());
    }

    /* renamed from: a */
    public static C8244m m16533a(Context context) {
        if (f18072d == null) {
            synchronized (C8244m.class) {
                if (f18072d == null) {
                    f18072d = new C8244m(context.getApplicationContext());
                }
            }
        }
        return f18072d;
    }

    /* renamed from: b */
    public final void mo20853b() {
        if (!this.f18075c && !this.f18074b.isEmpty()) {
            C8247c cVar = this.f18073a;
            boolean z = true;
            cVar.f18078a = cVar.f18080c.get().getActiveNetwork() != null;
            try {
                cVar.f18080c.get().registerDefaultNetworkCallback(cVar.f18081d);
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                z = false;
            }
            this.f18075c = z;
        }
    }
}
