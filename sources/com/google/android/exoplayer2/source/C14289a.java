package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.C14347j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p505aj.C14014t;
import p513bj.C14075p;
import p594jh.C17939k1;

/* renamed from: com.google.android.exoplayer2.source.a */
public abstract class C14289a implements C14344i {

    /* renamed from: a */
    public final ArrayList<C14344i.C14346b> f31762a = new ArrayList<>(1);

    /* renamed from: b */
    public final HashSet<C14344i.C14346b> f31763b = new HashSet<>(1);

    /* renamed from: c */
    public final C14347j.C14348a f31764c = new C14347j.C14348a();

    /* renamed from: d */
    public final C14216b.C14217a f31765d = new C14216b.C14217a();

    /* renamed from: e */
    public Looper f31766e;

    /* renamed from: f */
    public C17939k1 f31767f;

    /* renamed from: a */
    public final void mo47650a(C14344i.C14346b bVar) {
        this.f31762a.remove(bVar);
        if (this.f31762a.isEmpty()) {
            this.f31766e = null;
            this.f31767f = null;
            this.f31763b.clear();
            mo47627q();
            return;
        }
        mo47655i(bVar);
    }

    /* renamed from: b */
    public final void mo47651b(Handler handler, C14347j jVar) {
        C14347j.C14348a aVar = this.f31764c;
        aVar.getClass();
        aVar.f32163c.add(new C14347j.C14348a.C14349a(handler, jVar));
    }

    /* renamed from: c */
    public final void mo47652c(C14347j jVar) {
        C14347j.C14348a aVar = this.f31764c;
        Iterator<C14347j.C14348a.C14349a> it = aVar.f32163c.iterator();
        while (it.hasNext()) {
            C14347j.C14348a.C14349a next = it.next();
            if (next.f32166b == jVar) {
                aVar.f32163c.remove(next);
            }
        }
    }

    /* renamed from: d */
    public final void mo47653d(C14344i.C14346b bVar, C14014t tVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f31766e;
        C14075p.m21691c(looper == null || looper == myLooper);
        C17939k1 k1Var = this.f31767f;
        this.f31762a.add(bVar);
        if (this.f31766e == null) {
            this.f31766e = myLooper;
            this.f31763b.add(bVar);
            mo47626o(tVar);
        } else if (k1Var != null) {
            mo47654g(bVar);
            bVar.mo47786a(this, k1Var);
        }
    }

    /* renamed from: g */
    public final void mo47654g(C14344i.C14346b bVar) {
        this.f31766e.getClass();
        boolean isEmpty = this.f31763b.isEmpty();
        this.f31763b.add(bVar);
        if (isEmpty) {
            mo47659n();
        }
    }

    /* renamed from: i */
    public final void mo47655i(C14344i.C14346b bVar) {
        boolean z = !this.f31763b.isEmpty();
        this.f31763b.remove(bVar);
        if (z && this.f31763b.isEmpty()) {
            mo47658m();
        }
    }

    /* renamed from: j */
    public final void mo47656j(Handler handler, C14216b bVar) {
        C14216b.C14217a aVar = this.f31765d;
        aVar.getClass();
        aVar.f31566c.add(new C14216b.C14217a.C14218a(handler, bVar));
    }

    /* renamed from: k */
    public final void mo47657k(C14216b bVar) {
        C14216b.C14217a aVar = this.f31765d;
        Iterator<C14216b.C14217a.C14218a> it = aVar.f31566c.iterator();
        while (it.hasNext()) {
            C14216b.C14217a.C14218a next = it.next();
            if (next.f31568b == bVar) {
                aVar.f31566c.remove(next);
            }
        }
    }

    /* renamed from: m */
    public void mo47658m() {
    }

    /* renamed from: n */
    public void mo47659n() {
    }

    /* renamed from: o */
    public abstract void mo47626o(C14014t tVar);

    /* renamed from: p */
    public final void mo47660p(C17939k1 k1Var) {
        this.f31767f = k1Var;
        Iterator<C14344i.C14346b> it = this.f31762a.iterator();
        while (it.hasNext()) {
            it.next().mo47786a(this, k1Var);
        }
    }

    /* renamed from: q */
    public abstract void mo47627q();
}
