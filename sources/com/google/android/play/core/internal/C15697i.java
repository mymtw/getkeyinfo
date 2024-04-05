package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.compose.runtime.C1339j1;
import com.google.android.gms.measurement.internal.C15032m3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.internal.i */
public final class C15697i {

    /* renamed from: o */
    public static final HashMap f35460o = new HashMap();

    /* renamed from: a */
    public final Context f35461a;

    /* renamed from: b */
    public final C15032m3 f35462b;

    /* renamed from: c */
    public final String f35463c;

    /* renamed from: d */
    public final ArrayList f35464d = new ArrayList();

    /* renamed from: e */
    public final HashSet f35465e = new HashSet();

    /* renamed from: f */
    public final Object f35466f = new Object();

    /* renamed from: g */
    public boolean f35467g;

    /* renamed from: h */
    public final Intent f35468h;

    /* renamed from: i */
    public final C15689e f35469i;

    /* renamed from: j */
    public final WeakReference f35470j;

    /* renamed from: k */
    public final zzai f35471k = new zzai(this);

    /* renamed from: l */
    public final AtomicInteger f35472l = new AtomicInteger(0);

    /* renamed from: m */
    public C15695h f35473m;

    /* renamed from: n */
    public IInterface f35474n;

    public C15697i(Context context, C15032m3 m3Var, String str, Intent intent, C15689e eVar) {
        this.f35461a = context;
        this.f35462b = m3Var;
        this.f35463c = str;
        this.f35468h = intent;
        this.f35469i = eVar;
        this.f35470j = new WeakReference((Object) null);
    }

    /* renamed from: a */
    public final Handler mo55522a() {
        Handler handler;
        HashMap hashMap = f35460o;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f35463c)) {
                HandlerThread handlerThread = new HandlerThread(this.f35463c, 10);
                handlerThread.start();
                hashMap.put(this.f35463c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f35463c);
        }
        return handler;
    }

    /* renamed from: b */
    public final void mo55523b(C15681a aVar, C18614l lVar) {
        synchronized (this.f35466f) {
            this.f35465e.add(lVar);
            lVar.f41104a.mo70129i(new C1339j1(this, lVar));
        }
        synchronized (this.f35466f) {
            if (this.f35472l.getAndIncrement() > 0) {
                this.f35462b.mo52242b("Already connected to the service.", new Object[0]);
            }
        }
        mo55522a().post(new C15683b(this, aVar.f35439b, aVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        mo55522a().post(new com.google.android.play.core.internal.C15685c(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55524c(p689ul.C18614l r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f35466f
            monitor-enter(r0)
            java.util.HashSet r1 = r3.f35465e     // Catch:{ all -> 0x0039 }
            r1.remove(r4)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            java.lang.Object r4 = r3.f35466f
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f35472l     // Catch:{ all -> 0x0036 }
            int r0 = r0.get()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f35472l     // Catch:{ all -> 0x0036 }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            com.google.android.gms.measurement.internal.m3 r0 = r3.f35462b     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0036 }
            r0.mo52245e(r1, r2)     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return
        L_0x0028:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            com.google.android.play.core.internal.c r4 = new com.google.android.play.core.internal.c
            r4.<init>(r3)
            android.os.Handler r0 = r3.mo55522a()
            r0.post(r4)
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r0
        L_0x0039:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C15697i.mo55524c(ul.l):void");
    }

    /* renamed from: d */
    public final void mo55525d() {
        synchronized (this.f35466f) {
            Iterator it = this.f35465e.iterator();
            while (it.hasNext()) {
                ((C18614l) it.next()).mo70125a(new RemoteException(String.valueOf(this.f35463c).concat(" : Binder has died.")));
            }
            this.f35465e.clear();
        }
    }
}
