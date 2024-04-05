package p639ol;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.measurement.internal.C15032m3;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ol.c */
public abstract class C18316c {

    /* renamed from: a */
    public final C15032m3 f40209a;

    /* renamed from: b */
    public final IntentFilter f40210b;

    /* renamed from: c */
    public final Context f40211c;

    /* renamed from: d */
    public final HashSet f40212d = new HashSet();

    /* renamed from: e */
    public C18315b f40213e = null;

    /* renamed from: f */
    public volatile boolean f40214f = false;

    public C18316c(C15032m3 m3Var, IntentFilter intentFilter, Context context) {
        this.f40209a = m3Var;
        this.f40210b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f40211c = applicationContext != null ? applicationContext : context;
    }

    /* renamed from: a */
    public abstract void mo55341a(Context context, Intent intent);

    /* renamed from: b */
    public final void mo69853b() {
        C18315b bVar;
        if ((this.f40214f || !this.f40212d.isEmpty()) && this.f40213e == null) {
            C18315b bVar2 = new C18315b(this);
            this.f40213e = bVar2;
            this.f40211c.registerReceiver(bVar2, this.f40210b);
        }
        if (!this.f40214f && this.f40212d.isEmpty() && (bVar = this.f40213e) != null) {
            this.f40211c.unregisterReceiver(bVar);
            this.f40213e = null;
        }
    }

    /* renamed from: c */
    public final synchronized void mo69854c(C18314a aVar) {
        this.f40209a.mo52245e("registerListener", new Object[0]);
        if (aVar != null) {
            this.f40212d.add(aVar);
            mo69853b();
        } else {
            throw new NullPointerException("Registered Play Core listener should not be null.");
        }
    }

    /* renamed from: d */
    public final synchronized void mo69855d(C18314a aVar) {
        this.f40209a.mo52245e("unregisterListener", new Object[0]);
        if (aVar != null) {
            this.f40212d.remove(aVar);
            mo69853b();
        } else {
            throw new NullPointerException("Unregistered Play Core listener should not be null.");
        }
    }

    /* renamed from: e */
    public final synchronized void mo69856e(Object obj) {
        Iterator it = new HashSet(this.f40212d).iterator();
        while (it.hasNext()) {
            ((C18314a) it.next()).mo31232a(obj);
        }
    }
}
