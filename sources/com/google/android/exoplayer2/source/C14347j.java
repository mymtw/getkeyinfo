package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.etsy.android.p327ui.cart.googlepay.C9307e;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.C14344i;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p307aa.C8494a;
import p513bj.C14049b0;
import p594jh.C17912g;
import p595ji.C17992d;
import p595ji.C17993e;
import p595ji.C17995g;
import p595ji.C17996h;
import p595ji.C17997i;
import p595ji.C17998j;

/* renamed from: com.google.android.exoplayer2.source.j */
public interface C14347j {

    /* renamed from: com.google.android.exoplayer2.source.j$a */
    public static class C14348a {

        /* renamed from: a */
        public final int f32161a;

        /* renamed from: b */
        public final C14344i.C14345a f32162b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C14349a> f32163c;

        /* renamed from: d */
        public final long f32164d;

        /* renamed from: com.google.android.exoplayer2.source.j$a$a */
        public static final class C14349a {

            /* renamed from: a */
            public Handler f32165a;

            /* renamed from: b */
            public C14347j f32166b;

            public C14349a(Handler handler, C14347j jVar) {
                this.f32165a = handler;
                this.f32166b = jVar;
            }
        }

        public C14348a() {
            this(new CopyOnWriteArrayList(), 0, (C14344i.C14345a) null);
        }

        /* renamed from: a */
        public final long mo47787a(long j) {
            long b = C17912g.m30088b(j);
            if (b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f32164d + b;
        }

        /* renamed from: b */
        public final void mo47788b(int i, Format format, int i2, Object obj, long j) {
            mo47789c(new C17993e(1, i, format, i2, obj, mo47787a(j), -9223372036854775807L));
        }

        /* renamed from: c */
        public final void mo47789c(C17993e eVar) {
            Iterator<C14349a> it = this.f32163c.iterator();
            while (it.hasNext()) {
                C14349a next = it.next();
                C14049b0.m21624E(next.f32165a, new C8494a(this, 1, next.f32166b, eVar));
            }
        }

        /* renamed from: d */
        public final void mo47790d(C17992d dVar, int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            C17992d dVar2 = dVar;
            mo47791e(dVar, new C17993e(i, i2, format, i3, obj, mo47787a(j), mo47787a(j2)));
        }

        /* renamed from: e */
        public final void mo47791e(C17992d dVar, C17993e eVar) {
            Iterator<C14349a> it = this.f32163c.iterator();
            while (it.hasNext()) {
                C14349a next = it.next();
                C14049b0.m21624E(next.f32165a, new C17998j(this, next.f32166b, dVar, eVar));
            }
        }

        /* renamed from: f */
        public final void mo47792f(C17992d dVar, int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            C17992d dVar2 = dVar;
            mo47793g(dVar, new C17993e(i, i2, format, i3, obj, mo47787a(j), mo47787a(j2)));
        }

        /* renamed from: g */
        public final void mo47793g(C17992d dVar, C17993e eVar) {
            Iterator<C14349a> it = this.f32163c.iterator();
            while (it.hasNext()) {
                C14349a next = it.next();
                C14049b0.m21624E(next.f32165a, new C17997i(this, next.f32166b, dVar, eVar));
            }
        }

        /* renamed from: h */
        public final void mo47794h(C17992d dVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            C17992d dVar2 = dVar;
            mo47796j(dVar, new C17993e(i, i2, format, i3, obj, mo47787a(j), mo47787a(j2)), iOException, z);
        }

        /* renamed from: i */
        public final void mo47795i(C17992d dVar, int i, IOException iOException, boolean z) {
            mo47794h(dVar, i, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        /* renamed from: j */
        public final void mo47796j(C17992d dVar, C17993e eVar, IOException iOException, boolean z) {
            Iterator<C14349a> it = this.f32163c.iterator();
            while (it.hasNext()) {
                C14349a next = it.next();
                C14049b0.m21624E(next.f32165a, new C17996h(this, next.f32166b, dVar, eVar, iOException, z));
            }
        }

        /* renamed from: k */
        public final void mo47797k(C17992d dVar, int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            C17992d dVar2 = dVar;
            mo47798l(dVar, new C17993e(i, i2, format, i3, obj, mo47787a(j), mo47787a(j2)));
        }

        /* renamed from: l */
        public final void mo47798l(C17992d dVar, C17993e eVar) {
            Iterator<C14349a> it = this.f32163c.iterator();
            while (it.hasNext()) {
                C14349a next = it.next();
                C14049b0.m21624E(next.f32165a, new C17995g(this, next.f32166b, dVar, eVar, 0));
            }
        }

        /* renamed from: m */
        public final void mo47799m(C17993e eVar) {
            C14344i.C14345a aVar = this.f32162b;
            aVar.getClass();
            Iterator<C14349a> it = this.f32163c.iterator();
            while (it.hasNext()) {
                C14349a next = it.next();
                C14049b0.m21624E(next.f32165a, new C9307e(this, next.f32166b, aVar, eVar, 1));
            }
        }

        public C14348a(CopyOnWriteArrayList copyOnWriteArrayList, int i, C14344i.C14345a aVar) {
            this.f32163c = copyOnWriteArrayList;
            this.f32161a = i;
            this.f32162b = aVar;
            this.f32164d = 0;
        }
    }

    /* renamed from: j */
    void mo47687j(int i, C14344i.C14345a aVar, C17993e eVar) {
    }

    /* renamed from: m */
    void mo47688m(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar) {
    }

    /* renamed from: r */
    void mo47689r(int i, C14344i.C14345a aVar, C17993e eVar) {
    }

    /* renamed from: t */
    void mo47690t(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar) {
    }

    /* renamed from: w */
    void mo47691w(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar) {
    }

    /* renamed from: z */
    void mo47692z(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar, IOException iOException, boolean z) {
    }
}
