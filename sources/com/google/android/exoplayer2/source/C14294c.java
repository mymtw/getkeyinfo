package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.C14347j;
import java.io.IOException;
import java.util.HashMap;
import p505aj.C14014t;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17939k1;
import p595ji.C17990b;
import p595ji.C17992d;
import p595ji.C17993e;

/* renamed from: com.google.android.exoplayer2.source.c */
public abstract class C14294c<T> extends C14289a {

    /* renamed from: g */
    public final HashMap<T, C14296b<T>> f31789g = new HashMap<>();

    /* renamed from: h */
    public Handler f31790h;

    /* renamed from: i */
    public C14014t f31791i;

    /* renamed from: com.google.android.exoplayer2.source.c$a */
    public final class C14295a implements C14347j, C14216b {

        /* renamed from: b */
        public final T f31792b;

        /* renamed from: c */
        public C14347j.C14348a f31793c;

        /* renamed from: d */
        public C14216b.C14217a f31794d;

        public C14295a(T t) {
            this.f31793c = new C14347j.C14348a(C14294c.this.f31764c.f32163c, 0, (C14344i.C14345a) null);
            this.f31794d = new C14216b.C14217a(C14294c.this.f31765d.f31566c, 0, (C14344i.C14345a) null);
            this.f31792b = t;
        }

        /* renamed from: A */
        public final void mo47323A(int i, C14344i.C14345a aVar, int i2) {
            if (mo47685a(i, aVar)) {
                this.f31794d.mo47332d(i2);
            }
        }

        /* renamed from: B */
        public final void mo47324B(int i, C14344i.C14345a aVar) {
            if (mo47685a(i, aVar)) {
                this.f31794d.mo47334f();
            }
        }

        /* renamed from: D */
        public final void mo47325D(int i, C14344i.C14345a aVar) {
            if (mo47685a(i, aVar)) {
                this.f31794d.mo47331c();
            }
        }

        /* renamed from: a */
        public final boolean mo47685a(int i, C14344i.C14345a aVar) {
            C14344i.C14345a aVar2;
            if (aVar != null) {
                aVar2 = C14294c.this.mo47632r(this.f31792b, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            C14294c.this.getClass();
            C14347j.C14348a aVar3 = this.f31793c;
            if (aVar3.f32161a != i || !C14049b0.m21628a(aVar3.f32162b, aVar2)) {
                this.f31793c = new C14347j.C14348a(C14294c.this.f31764c.f32163c, i, aVar2);
            }
            C14216b.C14217a aVar4 = this.f31794d;
            if (aVar4.f31564a == i && C14049b0.m21628a(aVar4.f31565b, aVar2)) {
                return true;
            }
            this.f31794d = new C14216b.C14217a(C14294c.this.f31765d.f31566c, i, aVar2);
            return true;
        }

        /* renamed from: b */
        public final C17993e mo47686b(C17993e eVar) {
            C14294c cVar = C14294c.this;
            long j = eVar.f39344f;
            cVar.getClass();
            C14294c cVar2 = C14294c.this;
            long j2 = eVar.f39345g;
            cVar2.getClass();
            return (j == eVar.f39344f && j2 == eVar.f39345g) ? eVar : new C17993e(eVar.f39339a, eVar.f39340b, eVar.f39341c, eVar.f39342d, eVar.f39343e, j, j2);
        }

        /* renamed from: c */
        public final void mo47326c(int i, C14344i.C14345a aVar) {
            if (mo47685a(i, aVar)) {
                this.f31794d.mo47330b();
            }
        }

        /* renamed from: j */
        public final void mo47687j(int i, C14344i.C14345a aVar, C17993e eVar) {
            if (mo47685a(i, aVar)) {
                this.f31793c.mo47789c(mo47686b(eVar));
            }
        }

        /* renamed from: m */
        public final void mo47688m(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar) {
            if (mo47685a(i, aVar)) {
                this.f31793c.mo47798l(dVar, mo47686b(eVar));
            }
        }

        /* renamed from: n */
        public final void mo47327n(int i, C14344i.C14345a aVar, Exception exc) {
            if (mo47685a(i, aVar)) {
                this.f31794d.mo47333e(exc);
            }
        }

        /* renamed from: r */
        public final void mo47689r(int i, C14344i.C14345a aVar, C17993e eVar) {
            if (mo47685a(i, aVar)) {
                this.f31793c.mo47799m(mo47686b(eVar));
            }
        }

        /* renamed from: t */
        public final void mo47690t(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar) {
            if (mo47685a(i, aVar)) {
                this.f31793c.mo47791e(dVar, mo47686b(eVar));
            }
        }

        /* renamed from: v */
        public final void mo47328v(int i, C14344i.C14345a aVar) {
            if (mo47685a(i, aVar)) {
                this.f31794d.mo47329a();
            }
        }

        /* renamed from: w */
        public final void mo47691w(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar) {
            if (mo47685a(i, aVar)) {
                this.f31793c.mo47793g(dVar, mo47686b(eVar));
            }
        }

        /* renamed from: z */
        public final void mo47692z(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar, IOException iOException, boolean z) {
            if (mo47685a(i, aVar)) {
                this.f31793c.mo47796j(dVar, mo47686b(eVar), iOException, z);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.c$b */
    public static final class C14296b<T> {

        /* renamed from: a */
        public final C14344i f31796a;

        /* renamed from: b */
        public final C14344i.C14346b f31797b;

        /* renamed from: c */
        public final C14294c<T>.a f31798c;

        public C14296b(C14344i iVar, C17990b bVar, C14295a aVar) {
            this.f31796a = iVar;
            this.f31797b = bVar;
            this.f31798c = aVar;
        }
    }

    /* renamed from: l */
    public void mo47625l() throws IOException {
        for (C14296b<T> bVar : this.f31789g.values()) {
            bVar.f31796a.mo47625l();
        }
    }

    /* renamed from: m */
    public final void mo47658m() {
        for (C14296b next : this.f31789g.values()) {
            next.f31796a.mo47655i(next.f31797b);
        }
    }

    /* renamed from: n */
    public final void mo47659n() {
        for (C14296b next : this.f31789g.values()) {
            next.f31796a.mo47654g(next.f31797b);
        }
    }

    /* renamed from: q */
    public void mo47627q() {
        for (C14296b next : this.f31789g.values()) {
            next.f31796a.mo47650a(next.f31797b);
            next.f31796a.mo47652c(next.f31798c);
            next.f31796a.mo47657k(next.f31798c);
        }
        this.f31789g.clear();
    }

    /* renamed from: r */
    public C14344i.C14345a mo47632r(T t, C14344i.C14345a aVar) {
        return aVar;
    }

    /* renamed from: s */
    public abstract void mo47628s(T t, C14344i iVar, C17939k1 k1Var);

    /* renamed from: t */
    public final void mo47684t(T t, C14344i iVar) {
        C14075p.m21691c(!this.f31789g.containsKey(t));
        C17990b bVar = new C17990b(this, t);
        C14295a aVar = new C14295a(t);
        this.f31789g.put(t, new C14296b(iVar, bVar, aVar));
        Handler handler = this.f31790h;
        handler.getClass();
        iVar.mo47651b(handler, aVar);
        Handler handler2 = this.f31790h;
        handler2.getClass();
        iVar.mo47656j(handler2, aVar);
        iVar.mo47653d(bVar, this.f31791i);
        if (!(!this.f31763b.isEmpty())) {
            iVar.mo47655i(bVar);
        }
    }
}
