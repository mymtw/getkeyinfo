package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import com.bumptech.glide.load.engine.C6020g;
import java.io.IOException;
import java.util.ArrayList;
import p150j4.C7109b;
import p197o4.C7588n;

/* renamed from: com.bumptech.glide.load.engine.x */
public final class C6057x implements C6020g, C6020g.C6021a {

    /* renamed from: b */
    public final C6022h<?> f13037b;

    /* renamed from: c */
    public final C6020g.C6021a f13038c;

    /* renamed from: d */
    public volatile int f13039d;

    /* renamed from: e */
    public volatile C6017d f13040e;

    /* renamed from: f */
    public volatile Object f13041f;

    /* renamed from: g */
    public volatile C7588n.C7589a<?> f13042g;

    /* renamed from: h */
    public volatile C6018e f13043h;

    public C6057x(C6022h<?> hVar, C6020g.C6021a aVar) {
        this.f13037b = hVar;
        this.f13038c = aVar;
    }

    /* renamed from: a */
    public final boolean mo16953a() {
        if (this.f13041f != null) {
            Object obj = this.f13041f;
            this.f13041f = null;
            try {
                if (!mo17003b(obj)) {
                    return true;
                }
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
        }
        if (this.f13040e != null && this.f13040e.mo16953a()) {
            return true;
        }
        this.f13040e = null;
        this.f13042g = null;
        boolean z = false;
        while (!z) {
            if (!(this.f13039d < this.f13037b.mo16957b().size())) {
                break;
            }
            ArrayList b = this.f13037b.mo16957b();
            int i = this.f13039d;
            this.f13039d = i + 1;
            this.f13042g = (C7588n.C7589a) b.get(i);
            if (this.f13042g != null) {
                if (!this.f13037b.f12920p.mo16967c(this.f13042g.f16855c.mo16854d())) {
                    if (!(this.f13037b.mo16958c(this.f13042g.f16855c.mo16848a()) != null)) {
                    }
                }
                this.f13042g.f16855c.mo16855e(this.f13037b.f12919o, new C6056w(this, this.f13042g));
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo17003b(java.lang.Object r13) throws java.io.IOException {
        /*
            r12 = this;
            java.lang.String r0 = "SourceGenerator"
            int r1 = p036c5.C4421h.f9699b
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()
            r3 = 1
            r4 = 0
            com.bumptech.glide.load.engine.h<?> r5 = r12.f13037b     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.GlideContext r5 = r5.f12907c     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.Registry r5 = r5.getRegistry()     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.data.e r5 = r5.mo16766f(r13)     // Catch:{ all -> 0x00c0 }
            java.lang.Object r6 = r5.mo16842a()     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.engine.h<?> r7 = r12.f13037b     // Catch:{ all -> 0x00c0 }
            j4.a r7 = r7.mo16960e(r6)     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.engine.f r8 = new com.bumptech.glide.load.engine.f     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.engine.h<?> r9 = r12.f13037b     // Catch:{ all -> 0x00c0 }
            j4.e r9 = r9.f12913i     // Catch:{ all -> 0x00c0 }
            r8.<init>(r7, r6, r9)     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.engine.e r6 = new com.bumptech.glide.load.engine.e     // Catch:{ all -> 0x00c0 }
            o4.n$a<?> r9 = r12.f13042g     // Catch:{ all -> 0x00c0 }
            j4.b r9 = r9.f16853a     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.engine.h<?> r10 = r12.f13037b     // Catch:{ all -> 0x00c0 }
            j4.b r11 = r10.f12918n     // Catch:{ all -> 0x00c0 }
            r6.<init>(r9, r11)     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.engine.DecodeJob$e r9 = r10.f12912h     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.engine.k$c r9 = (com.bumptech.glide.load.engine.C6030k.C6035c) r9     // Catch:{ all -> 0x00c0 }
            l4.a r9 = r9.mo16975a()     // Catch:{ all -> 0x00c0 }
            r9.mo19515b(r6, r8)     // Catch:{ all -> 0x00c0 }
            r8 = 2
            boolean r8 = android.util.Log.isLoggable(r0, r8)     // Catch:{ all -> 0x00c0 }
            if (r8 == 0) goto L_0x0054
            r6.toString()     // Catch:{ all -> 0x00c0 }
            r13.toString()     // Catch:{ all -> 0x00c0 }
            r7.toString()     // Catch:{ all -> 0x00c0 }
            p036c5.C4421h.m10119a(r1)     // Catch:{ all -> 0x00c0 }
        L_0x0054:
            java.io.File r1 = r9.mo19514a(r6)     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x0075
            r12.f13043h = r6     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.engine.d r13 = new com.bumptech.glide.load.engine.d     // Catch:{ all -> 0x00c0 }
            o4.n$a<?> r0 = r12.f13042g     // Catch:{ all -> 0x00c0 }
            j4.b r0 = r0.f16853a     // Catch:{ all -> 0x00c0 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.engine.h<?> r1 = r12.f13037b     // Catch:{ all -> 0x00c0 }
            r13.<init>(r0, r1, r12)     // Catch:{ all -> 0x00c0 }
            r12.f13040e = r13     // Catch:{ all -> 0x00c0 }
            o4.n$a<?> r13 = r12.f13042g
            com.bumptech.glide.load.data.d<Data> r13 = r13.f16855c
            r13.mo16851b()
            return r3
        L_0x0075:
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x009f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r1.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = "Attempt to write: "
            r1.append(r2)     // Catch:{ all -> 0x00c0 }
            com.bumptech.glide.load.engine.e r2 = r12.f13043h     // Catch:{ all -> 0x00c0 }
            r1.append(r2)     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = ", data: "
            r1.append(r2)     // Catch:{ all -> 0x00c0 }
            r1.append(r13)     // Catch:{ all -> 0x00c0 }
            java.lang.String r13 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r1.append(r13)     // Catch:{ all -> 0x00c0 }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x00c0 }
            android.util.Log.d(r0, r13)     // Catch:{ all -> 0x00c0 }
        L_0x009f:
            com.bumptech.glide.load.engine.g$a r13 = r12.f13038c     // Catch:{ all -> 0x00be }
            o4.n$a<?> r0 = r12.f13042g     // Catch:{ all -> 0x00be }
            j4.b r6 = r0.f16853a     // Catch:{ all -> 0x00be }
            java.lang.Object r7 = r5.mo16842a()     // Catch:{ all -> 0x00be }
            o4.n$a<?> r0 = r12.f13042g     // Catch:{ all -> 0x00be }
            com.bumptech.glide.load.data.d<Data> r8 = r0.f16855c     // Catch:{ all -> 0x00be }
            o4.n$a<?> r0 = r12.f13042g     // Catch:{ all -> 0x00be }
            com.bumptech.glide.load.data.d<Data> r0 = r0.f16855c     // Catch:{ all -> 0x00be }
            com.bumptech.glide.load.DataSource r9 = r0.mo16854d()     // Catch:{ all -> 0x00be }
            o4.n$a<?> r0 = r12.f13042g     // Catch:{ all -> 0x00be }
            j4.b r10 = r0.f16853a     // Catch:{ all -> 0x00be }
            r5 = r13
            r5.mo16874e(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00be }
            return r4
        L_0x00be:
            r13 = move-exception
            goto L_0x00c2
        L_0x00c0:
            r13 = move-exception
            r3 = r4
        L_0x00c2:
            if (r3 != 0) goto L_0x00cb
            o4.n$a<?> r0 = r12.f13042g
            com.bumptech.glide.load.data.d<Data> r0 = r0.f16855c
            r0.mo16851b()
        L_0x00cb:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C6057x.mo17003b(java.lang.Object):boolean");
    }

    public final void cancel() {
        C7588n.C7589a<?> aVar = this.f13042g;
        if (aVar != null) {
            aVar.f16855c.cancel();
        }
    }

    /* renamed from: e */
    public final void mo16874e(C7109b bVar, Object obj, C5968d<?> dVar, DataSource dataSource, C7109b bVar2) {
        this.f13038c.mo16874e(bVar, obj, dVar, this.f13042g.f16855c.mo16854d(), bVar);
    }

    /* renamed from: f */
    public final void mo16875f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final void mo16876g(C7109b bVar, Exception exc, C5968d<?> dVar, DataSource dataSource) {
        this.f13038c.mo16876g(bVar, exc, dVar, this.f13042g.f16855c.mo16854d());
    }
}
