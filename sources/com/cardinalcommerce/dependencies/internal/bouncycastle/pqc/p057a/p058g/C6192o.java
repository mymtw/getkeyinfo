package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import androidx.work.C3436p;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o */
public abstract class C6192o {

    /* renamed from: a */
    public final int f13466a;

    /* renamed from: b */
    public final long f13467b;

    /* renamed from: c */
    public final int f13468c;

    /* renamed from: d */
    public final int f13469d;

    /* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a */
    public static abstract class C6193a<T extends C6193a> {

        /* renamed from: a */
        public final int f13470a;

        /* renamed from: b */
        public int f13471b = 0;

        /* renamed from: c */
        public long f13472c = 0;

        /* renamed from: d */
        public int f13473d = 0;

        public C6193a(int i) {
            this.f13470a = i;
        }

        /* renamed from: a */
        public final T mo17535a(long j) {
            this.f13472c = j;
            return mo17524b();
        }

        /* renamed from: b */
        public abstract T mo17524b();

        /* renamed from: c */
        public final T mo17536c(int i) {
            this.f13471b = i;
            return mo17524b();
        }

        /* renamed from: d */
        public final T mo17537d(int i) {
            this.f13473d = i;
            return mo17524b();
        }
    }

    public C6192o(C6193a aVar) {
        this.f13466a = aVar.f13471b;
        this.f13467b = aVar.f13472c;
        this.f13468c = aVar.f13470a;
        this.f13469d = aVar.f13473d;
    }

    /* renamed from: a */
    public byte[] mo17523a() {
        byte[] bArr = new byte[32];
        C3436p.m8242d(this.f13466a, 0, bArr);
        C3436p.m8246h(this.f13467b, bArr, 4);
        C3436p.m8242d(this.f13468c, 12, bArr);
        C3436p.m8242d(this.f13469d, 28, bArr);
        return bArr;
    }
}
