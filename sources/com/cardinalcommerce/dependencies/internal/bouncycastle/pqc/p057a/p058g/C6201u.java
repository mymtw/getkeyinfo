package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import java.io.Serializable;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.u */
public final class C6201u implements Serializable {

    /* renamed from: a */
    private final int f13503a;

    /* renamed from: b */
    private final byte[] f13504b;

    public C6201u(int i, byte[] bArr) {
        this.f13503a = i;
        this.f13504b = bArr;
    }

    /* renamed from: a */
    public int mo17542a() {
        return this.f13503a;
    }

    /* renamed from: b */
    public byte[] mo17543b() {
        return C6177d.m12380f(this.f13504b);
    }

    /* renamed from: c */
    public C6201u clone() {
        return new C6201u(mo17542a(), mo17543b());
    }
}
