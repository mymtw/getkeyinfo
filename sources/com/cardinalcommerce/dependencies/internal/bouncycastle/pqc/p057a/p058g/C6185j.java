package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import androidx.work.C3436p;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6192o;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.j */
public final class C6185j extends C6192o {

    /* renamed from: e */
    public final int f13444e;

    /* renamed from: f */
    public final int f13445f;

    /* renamed from: g */
    public final int f13446g;

    /* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.j$a */
    public static class C6186a extends C6192o.C6193a<C6186a> {

        /* renamed from: e */
        public int f13447e = 0;

        /* renamed from: f */
        public int f13448f = 0;

        /* renamed from: g */
        public int f13449g = 0;

        public C6186a() {
            super(1);
        }

        /* renamed from: b */
        public final C6192o.C6193a mo17524b() {
            return this;
        }

        /* renamed from: e */
        public final C6192o mo17528e() {
            return new C6185j(this);
        }
    }

    public C6185j(C6186a aVar) {
        super(aVar);
        this.f13444e = aVar.f13447e;
        this.f13445f = aVar.f13448f;
        this.f13446g = aVar.f13449g;
    }

    /* renamed from: a */
    public final byte[] mo17523a() {
        byte[] a = super.mo17523a();
        C3436p.m8242d(this.f13444e, 16, a);
        C3436p.m8242d(this.f13445f, 20, a);
        C3436p.m8242d(this.f13446g, 24, a);
        return a;
    }
}
