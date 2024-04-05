package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.c */
class C6176c implements Serializable {

    /* renamed from: a */
    private C6201u f13422a;

    /* renamed from: b */
    private final int f13423b;

    /* renamed from: c */
    private int f13424c;

    /* renamed from: d */
    private int f13425d;

    /* renamed from: e */
    private boolean f13426e = false;

    /* renamed from: f */
    private boolean f13427f = false;

    public C6176c(int i) {
        this.f13423b = i;
    }

    /* renamed from: a */
    public int mo17512a() {
        return (!this.f13426e || this.f13427f) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : this.f13424c;
    }

    /* renamed from: a */
    public void mo17513a(int i) {
        this.f13422a = null;
        this.f13424c = this.f13423b;
        this.f13425d = i;
        this.f13426e = true;
        this.f13427f = false;
    }

    /* renamed from: a */
    public void mo17514a(C6201u uVar) {
        this.f13422a = uVar;
        int a = uVar.mo17542a();
        this.f13424c = a;
        if (a == this.f13423b) {
            this.f13427f = true;
        }
    }

    /* JADX WARNING: type inference failed for: r7v15, types: [com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17515a(java.util.Stack<com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6201u> r5, com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6189l r6, byte[] r7, byte[] r8, com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6187k r9) {
        /*
            r4 = this;
            if (r9 == 0) goto L_0x01c7
            boolean r0 = r4.f13427f
            if (r0 != 0) goto L_0x01bf
            boolean r0 = r4.f13426e
            if (r0 == 0) goto L_0x01bf
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k$a r0 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k$a
            r0.<init>()
            int r1 = r9.f13466a
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r0 = r0.mo17536c(r1)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k$a r0 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6187k.C6188a) r0
            long r1 = r9.f13467b
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r0 = r0.mo17535a(r1)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k$a r0 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6187k.C6188a) r0
            int r1 = r4.f13425d
            r0.f13453e = r1
            int r1 = r9.f13451f
            r0.f13454f = r1
            int r1 = r9.f13452g
            r0.f13455g = r1
            int r9 = r9.f13469d
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r9 = r0.mo17537d(r9)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k$a r9 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6187k.C6188a) r9
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o r9 = r9.mo17529e()
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k r9 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6187k) r9
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.j$a r0 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.j$a
            r0.<init>()
            int r1 = r9.f13466a
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r0 = r0.mo17536c(r1)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.j$a r0 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6185j.C6186a) r0
            long r1 = r9.f13467b
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r0 = r0.mo17535a(r1)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.j$a r0 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6185j.C6186a) r0
            int r1 = r4.f13425d
            r0.f13447e = r1
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o r0 = r0.mo17528e()
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.j r0 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6185j) r0
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r1 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a
            r1.<init>()
            int r2 = r9.f13466a
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r1 = r1.mo17536c(r2)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r1 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r1
            long r2 = r9.f13467b
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r1 = r1.mo17535a(r2)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r1 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r1
            int r2 = r4.f13425d
            r1.f13441f = r2
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o r1 = r1.mo17525e()
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h r1 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h) r1
            byte[] r8 = r6.mo17533d(r8, r9)
            r6.mo17531b(r8, r7)
            n2.x r7 = r6.mo17530a(r9)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u r7 = com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6199s.m12410b(r6, r7, r0)
        L_0x0086:
            boolean r8 = r5.isEmpty()
            r9 = 1
            if (r8 != 0) goto L_0x0121
            java.lang.Object r8 = r5.peek()
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u r8 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6201u) r8
            int r8 = r8.mo17542a()
            int r0 = r7.mo17542a()
            if (r8 != r0) goto L_0x0121
            java.lang.Object r8 = r5.peek()
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u r8 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6201u) r8
            int r8 = r8.mo17542a()
            int r0 = r4.f13423b
            if (r8 == r0) goto L_0x0121
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r8 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a
            r8.<init>()
            int r0 = r1.f13466a
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r8 = r8.mo17536c(r0)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r8 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r8
            long r2 = r1.f13467b
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r8 = r8.mo17535a(r2)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r8 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r8
            int r0 = r1.f13438e
            r8.f13440e = r0
            int r0 = r1.f13439f
            int r0 = r0 - r9
            int r0 = r0 / 2
            r8.f13441f = r0
            int r0 = r1.f13469d
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r8 = r8.mo17537d(r0)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r8 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r8
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o r8 = r8.mo17525e()
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h r8 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h) r8
            java.lang.Object r0 = r5.pop()
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u r0 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6201u) r0
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u r7 = com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6199s.m12409a(r6, r0, r7, r8)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u r0 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u
            int r1 = r7.mo17542a()
            int r1 = r1 + r9
            byte[] r7 = r7.mo17543b()
            r0.<init>(r1, r7)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r7 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a
            r7.<init>()
            int r1 = r8.f13466a
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r7 = r7.mo17536c(r1)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r7 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r7
            long r1 = r8.f13467b
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r7 = r7.mo17535a(r1)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r7 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r7
            int r1 = r8.f13438e
            int r1 = r1 + r9
            r7.f13440e = r1
            int r9 = r8.f13439f
            r7.f13441f = r9
            int r8 = r8.f13469d
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r7 = r7.mo17537d(r8)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r7 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r7
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o r7 = r7.mo17525e()
            r1 = r7
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h r1 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h) r1
            r7 = r0
            goto L_0x0086
        L_0x0121:
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u r8 = r4.f13422a
            if (r8 != 0) goto L_0x0129
            r4.f13422a = r7
            goto L_0x01a6
        L_0x0129:
            int r8 = r8.mo17542a()
            int r0 = r7.mo17542a()
            if (r8 != r0) goto L_0x01a3
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r5 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a
            r5.<init>()
            int r8 = r1.f13466a
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r5 = r5.mo17536c(r8)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r5 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r5
            long r2 = r1.f13467b
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r5 = r5.mo17535a(r2)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r5 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r5
            int r8 = r1.f13438e
            r5.f13440e = r8
            int r8 = r1.f13439f
            int r8 = r8 - r9
            int r8 = r8 / 2
            r5.f13441f = r8
            int r8 = r1.f13469d
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r5 = r5.mo17537d(r8)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r5 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r5
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o r5 = r5.mo17525e()
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h r5 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h) r5
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u r8 = r4.f13422a
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u r6 = com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6199s.m12409a(r6, r8, r7, r5)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u r7 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u r8 = r4.f13422a
            int r8 = r8.mo17542a()
            int r8 = r8 + r9
            byte[] r6 = r6.mo17543b()
            r7.<init>(r8, r6)
            r4.f13422a = r7
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r6 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a
            r6.<init>()
            int r8 = r5.f13466a
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r6 = r6.mo17536c(r8)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r6 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r6
            long r0 = r5.f13467b
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r6 = r6.mo17535a(r0)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r6 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r6
            int r8 = r5.f13438e
            int r8 = r8 + r9
            r6.f13440e = r8
            int r8 = r5.f13439f
            r6.f13441f = r8
            int r5 = r5.f13469d
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r5 = r6.mo17537d(r5)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.h$a r5 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6182h.C6183a) r5
            r5.mo17525e()
            goto L_0x01a6
        L_0x01a3:
            r5.push(r7)
        L_0x01a6:
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u r5 = r4.f13422a
            int r5 = r5.mo17542a()
            int r6 = r4.f13423b
            if (r5 != r6) goto L_0x01b3
            r4.f13427f = r9
            goto L_0x01be
        L_0x01b3:
            int r5 = r7.mo17542a()
            r4.f13424c = r5
            int r5 = r4.f13425d
            int r5 = r5 + r9
            r4.f13425d = r5
        L_0x01be:
            return
        L_0x01bf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "finished or not initialized"
            r5.<init>(r6)
            throw r5
        L_0x01c7:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "otsHashAddress == null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6176c.mo17515a(java.util.Stack, com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.l, byte[], byte[], com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k):void");
    }

    /* renamed from: b */
    public int mo17516b() {
        return this.f13425d;
    }

    /* renamed from: c */
    public boolean mo17517c() {
        return this.f13427f;
    }

    /* renamed from: d */
    public boolean mo17518d() {
        return this.f13426e;
    }

    /* renamed from: e */
    public C6201u mo17519e() {
        return this.f13422a.clone();
    }
}
