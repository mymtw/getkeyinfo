package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import java.util.Map;
import p169l5.C7267c;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.t */
public final class C6200t {

    /* renamed from: a */
    public final C6180f f13499a;

    /* renamed from: b */
    public final C6189l f13500b;

    /* renamed from: c */
    public final int f13501c;

    /* renamed from: d */
    public final int f13502d;

    public C6200t(int i, C7267c cVar) {
        if (i >= 2) {
            this.f13500b = new C6189l(new C6191n(cVar));
            this.f13501c = i;
            int i2 = 2;
            while (true) {
                int i3 = this.f13501c;
                if (i2 > i3) {
                    throw new IllegalStateException("should never happen...");
                } else if ((i3 - i2) % 2 == 0) {
                    this.f13502d = i2;
                    String a = this.f13500b.f13456a.f13462a.mo19523a();
                    int a2 = mo17541a();
                    C6191n nVar = this.f13500b.f13456a;
                    int i4 = nVar.f13464c;
                    int i5 = nVar.f13465d;
                    if (a != null) {
                        this.f13499a = C6180f.f13434c.get(C6180f.m12384a(a2, i4, i5, a, i));
                        return;
                    } else {
                        Map<String, C6180f> map = C6180f.f13434c;
                        throw new NullPointerException("algorithmName == null");
                    }
                } else {
                    i2++;
                }
            }
        } else {
            throw new IllegalArgumentException("height must be >= 2");
        }
    }

    /* renamed from: a */
    public final int mo17541a() {
        return this.f13500b.f13456a.f13463b;
    }
}
