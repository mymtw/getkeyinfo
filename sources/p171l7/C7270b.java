package p171l7;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6177d;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6194p;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6197r;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6200t;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6204w;
import java.io.IOException;
import java.util.HashMap;
import p129h7.C6959b;
import p141i7.C6997b;
import p161k6.C7198a;
import p161k6.C7199b;
import p162k7.C7207b;
import p181m7.C7339a;
import p181m7.C7346h;
import p181m7.C7347i;
import p181m7.C7348j;
import p181m7.C7352n;
import p223r5.C7770q;
import p244t5.C7959a;
import p244t5.C8018s1;
import p244t5.C8021t1;
import p267v7.C8212a;

/* renamed from: l7.b */
public final class C7270b {

    /* renamed from: a */
    public static HashMap f16122a;

    /* renamed from: l7.b$a */
    public static class C7271a extends C7274d {
        public C7271a(int i) {
        }

        /* renamed from: a */
        public final C7770q mo19529a(C7198a aVar) {
            return new C6959b(aVar.f15982c.mo20594s());
        }
    }

    /* renamed from: l7.b$b */
    public static class C7272b extends C7274d {
        public C7272b(int i) {
        }

        /* renamed from: a */
        public final C7770q mo19529a(C7198a aVar) {
            return new C6997b(((Integer) C7277c.f16134l.get(aVar.f15981b.f15983b)).intValue(), aVar.f15982c.mo20593q());
        }
    }

    /* renamed from: l7.b$c */
    public static class C7273c extends C7274d {
        public C7273c(int i) {
        }

        /* renamed from: a */
        public final C7770q mo19529a(C7198a aVar) {
            return new C7207b(aVar.f15982c.mo20594s(), C7277c.m13937a(C7346h.m14113e(aVar.f15981b.f15984c)));
        }
    }

    /* renamed from: l7.b$d */
    public static abstract class C7274d {
        /* renamed from: a */
        public abstract C7770q mo19529a(C7198a aVar);
    }

    /* renamed from: l7.b$e */
    public static class C7275e extends C7274d {
        public C7275e(int i) {
        }

        /* renamed from: a */
        public final C7770q mo19529a(C7198a aVar) {
            C7347i e = C7347i.m14115e(aVar.f15981b.f15984c);
            C7959a aVar2 = e.f16349d.f15983b;
            C8018s1 g = aVar.mo19494g();
            C7352n nVar = g instanceof C7352n ? (C7352n) g : g != null ? new C7352n(C8021t1.m16151s(g)) : null;
            C6204w.C6205a aVar3 = new C6204w.C6205a(new C6200t(e.f16348c, C7277c.m13940d(aVar2)));
            aVar3.f13524c = C6177d.m12380f(nVar.mo19619g());
            aVar3.f13523b = C6177d.m12380f(C8212a.m16504k(nVar.f16369c));
            return new C6204w(aVar3);
        }
    }

    /* renamed from: l7.b$f */
    public static class C7276f extends C7274d {
        public C7276f(int i) {
        }

        /* renamed from: a */
        public final C7770q mo19529a(C7198a aVar) {
            C7348j e = C7348j.m14117e(aVar.f15981b.f15984c);
            C7959a aVar2 = e.f16353e.f15983b;
            C8018s1 g = aVar.mo19494g();
            C7352n nVar = g instanceof C7352n ? (C7352n) g : g != null ? new C7352n(C8021t1.m16151s(g)) : null;
            C6197r.C6198a aVar3 = new C6197r.C6198a(new C6194p(e.f16351c, e.f16352d, C7277c.m13940d(aVar2)));
            aVar3.f13498c = C6177d.m12380f(nVar.mo19619g());
            aVar3.f13497b = C6177d.m12380f(C8212a.m16504k(nVar.f16369c));
            return new C6197r(aVar3);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f16122a = hashMap;
        hashMap.put(C7339a.f16306h, new C7272b(0));
        f16122a.put(C7339a.f16307i, new C7272b(0));
        f16122a.put(C7339a.f16308j, new C7272b(0));
        f16122a.put(C7339a.f16309k, new C7272b(0));
        f16122a.put(C7339a.f16310l, new C7272b(0));
        f16122a.put(C7339a.f16302d, new C7273c(0));
        f16122a.put(C7339a.f16303e, new C7271a(0));
        f16122a.put(C7339a.f16304f, new C7275e(0));
        f16122a.put(C7339a.f16305g, new C7276f(0));
    }

    /* renamed from: a */
    public static C7770q m13930a(C7198a aVar) {
        C7199b bVar = aVar.f15981b;
        C7274d dVar = (C7274d) f16122a.get(bVar.f15983b);
        if (dVar != null) {
            return dVar.mo19529a(aVar);
        }
        StringBuilder h = C0072d.m201h("algorithm identifier in public key not recognised: ");
        h.append(bVar.f15983b);
        throw new IOException(h.toString());
    }
}
