package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import java.util.Map;
import p169l5.C7267c;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.p */
public final class C6194p {

    /* renamed from: a */
    public final C6179e f13474a;

    /* renamed from: b */
    public final C6200t f13475b;

    /* renamed from: c */
    public final int f13476c;

    /* renamed from: d */
    public final int f13477d;

    public C6194p(int i, int i2, C7267c cVar) {
        this.f13476c = i;
        this.f13477d = i2;
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        } else if (i % i2 == 0) {
            int i3 = i / i2;
            if (i3 != 1) {
                C6200t tVar = new C6200t(i3, cVar);
                this.f13475b = tVar;
                String a = tVar.f13500b.f13456a.f13462a.mo19523a();
                int a2 = mo17538a();
                C6191n nVar = tVar.f13500b.f13456a;
                int i4 = nVar.f13464c;
                int i5 = nVar.f13465d;
                if (a != null) {
                    this.f13474a = C6179e.f13431c.get(C6179e.m12383a(a, a2, i4, i5, i, i2));
                } else {
                    Map<String, C6179e> map = C6179e.f13431c;
                    throw new NullPointerException("algorithmName == null");
                }
            } else {
                throw new IllegalArgumentException("height / layers must be greater than 1");
            }
        } else {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
    }

    /* renamed from: a */
    public final int mo17538a() {
        return this.f13475b.mo17541a();
    }
}
