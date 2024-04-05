package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import androidx.work.C3436p;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6192o;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k */
public final class C6187k extends C6192o {

    /* renamed from: e */
    public final int f13450e;

    /* renamed from: f */
    public final int f13451f;

    /* renamed from: g */
    public final int f13452g;

    /* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k$a */
    public static class C6188a extends C6192o.C6193a<C6188a> {

        /* renamed from: e */
        public int f13453e = 0;

        /* renamed from: f */
        public int f13454f = 0;

        /* renamed from: g */
        public int f13455g = 0;

        public C6188a() {
            super(0);
        }

        /* renamed from: b */
        public final C6192o.C6193a mo17524b() {
            return this;
        }

        /* renamed from: e */
        public final C6192o mo17529e() {
            return new C6187k(this);
        }
    }

    public C6187k(C6188a aVar) {
        super(aVar);
        this.f13450e = aVar.f13453e;
        this.f13451f = aVar.f13454f;
        this.f13452g = aVar.f13455g;
    }

    /* renamed from: a */
    public final byte[] mo17523a() {
        byte[] a = super.mo17523a();
        C3436p.m8242d(this.f13450e, 16, a);
        C3436p.m8242d(this.f13451f, 20, a);
        C3436p.m8242d(this.f13452g, 24, a);
        return a;
    }
}
