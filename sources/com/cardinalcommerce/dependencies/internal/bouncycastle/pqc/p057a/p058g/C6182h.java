package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import androidx.work.C3436p;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6192o;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h */
public final class C6182h extends C6192o {

    /* renamed from: e */
    public final int f13438e;

    /* renamed from: f */
    public final int f13439f;

    /* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a */
    public static class C6183a extends C6192o.C6193a<C6183a> {

        /* renamed from: e */
        public int f13440e = 0;

        /* renamed from: f */
        public int f13441f = 0;

        public C6183a() {
            super(2);
        }

        /* renamed from: b */
        public final C6192o.C6193a mo17524b() {
            return this;
        }

        /* renamed from: e */
        public final C6192o mo17525e() {
            return new C6182h(this);
        }
    }

    public C6182h(C6183a aVar) {
        super(aVar);
        this.f13438e = aVar.f13440e;
        this.f13439f = aVar.f13441f;
    }

    /* renamed from: a */
    public final byte[] mo17523a() {
        byte[] a = super.mo17523a();
        C3436p.m8242d(0, 16, a);
        C3436p.m8242d(this.f13438e, 20, a);
        C3436p.m8242d(this.f13439f, 24, a);
        return a;
    }
}
