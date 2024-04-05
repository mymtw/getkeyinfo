package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import android.support.p013v4.media.C0072d;
import java.util.Map;
import p169l5.C7267c;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.n */
public final class C6191n {

    /* renamed from: a */
    public final C7267c f13462a;

    /* renamed from: b */
    public final int f13463b;

    /* renamed from: c */
    public final int f13464c;

    /* renamed from: d */
    public final int f13465d;

    public C6191n(C7267c cVar) {
        this.f13462a = cVar;
        String a = cVar.mo19523a();
        int b = a.equals("SHAKE128") ? 32 : a.equals("SHAKE256") ? 64 : cVar.mo19524b();
        this.f13463b = b;
        int i = 16;
        this.f13464c = 16;
        double d = (double) (b * 8);
        int i2 = 0;
        int i3 = 16;
        int i4 = 0;
        while (true) {
            i3 >>= 1;
            if (i3 == 0) {
                break;
            }
            i4++;
        }
        int ceil = (int) Math.ceil(d / ((double) i4));
        int i5 = ceil * 15;
        int i6 = 0;
        while (true) {
            i5 >>= 1;
            if (i5 == 0) {
                break;
            }
            i6++;
        }
        while (true) {
            i >>= 1;
            if (i == 0) {
                break;
            }
            i2++;
        }
        int floor = ((int) Math.floor((double) (i6 / i2))) + 1 + ceil;
        this.f13465d = floor;
        String a2 = cVar.mo19523a();
        if (a2 == null) {
            Map<String, C6190m> map = C6190m.f13460b;
            throw new NullPointerException("algorithmName == null");
        } else if (C6190m.f13460b.get(C6190m.m12400a(b, floor, a2)) == null) {
            StringBuilder h = C0072d.m201h("cannot find OID for digest algorithm: ");
            h.append(cVar.mo19523a());
            throw new IllegalArgumentException(h.toString());
        }
    }
}
