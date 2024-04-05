package androidx.databinding;

import androidx.databinding.C2442c;
import androidx.databinding.C2453j;
import p077d1.C6622f;

/* renamed from: androidx.databinding.h */
public final class C2448h extends C2442c<C2453j.C2454a, C2453j, C2450b> {

    /* renamed from: g */
    public static final C6622f<C2450b> f5712g = new C6622f<>(10);

    /* renamed from: h */
    public static final C2449a f5713h = new C2449a();

    /* renamed from: androidx.databinding.h$a */
    public class C2449a extends C2442c.C2443a<C2453j.C2454a, C2453j, C2450b> {
        /* renamed from: a */
        public final void mo9261a(Object obj, int i, Object obj2, Object obj3) {
            C2453j.C2454a aVar = (C2453j.C2454a) obj;
            C2453j jVar = (C2453j) obj2;
            C2450b bVar = (C2450b) obj3;
            if (i == 1) {
                int i2 = bVar.f5714a;
                aVar.mo9272e(jVar);
            } else if (i == 2) {
                int i3 = bVar.f5714a;
                aVar.mo9273f(jVar);
            } else if (i == 3) {
                int i4 = bVar.f5714a;
                aVar.mo9274g(jVar);
            } else if (i != 4) {
                aVar.mo9271a(jVar);
            } else {
                int i5 = bVar.f5714a;
                aVar.mo9275h(jVar);
            }
        }
    }

    /* renamed from: androidx.databinding.h$b */
    public static class C2450b {

        /* renamed from: a */
        public int f5714a;
    }

    public C2448h() {
        super(f5713h);
    }

    /* renamed from: j */
    public static C2450b m5408j(int i, int i2) {
        C2450b b = f5712g.mo18807b();
        if (b == null) {
            b = new C2450b();
        }
        b.f5714a = i;
        b.getClass();
        b.getClass();
        return b;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo9284c(int i, Object obj, Object obj2) {
        mo9292k((C2453j) obj, i, (C2450b) null);
    }

    /* renamed from: k */
    public final synchronized void mo9292k(C2453j jVar, int i, C2450b bVar) {
        super.mo9284c(i, jVar, bVar);
        if (bVar != null) {
            f5712g.mo18806a(bVar);
        }
    }
}
