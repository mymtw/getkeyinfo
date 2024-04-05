package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1517e0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.compose.material.z1 */
public final class C1274z1 {

    /* renamed from: a */
    public static final C1274z1 f2677a = new C1274z1();

    /* renamed from: b */
    public static final float f2678b = ((float) 1);

    /* renamed from: c */
    public static final float f2679c = ((float) 2);

    /* renamed from: d */
    public static final float f2680d = ((float) 52);

    /* renamed from: a */
    public final void mo5379a(float f, int i, int i2, long j, C1302d dVar, C1436d dVar2) {
        int i3;
        C1436d dVar3;
        float f2;
        long j2;
        long j3;
        float f3;
        float f4;
        C1436d dVar4;
        int i4;
        int i5 = i;
        ComposerImpl h = dVar.mo5440h(910934799);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i5 | 6;
            dVar3 = dVar2;
        } else if ((i5 & 14) == 0) {
            dVar3 = dVar2;
            i3 = (h.mo5408I(dVar3) ? 4 : 2) | i5;
        } else {
            dVar3 = dVar2;
            i3 = i5;
        }
        if ((i5 & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (h.mo5428b(f2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                f2 = f;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            f2 = f;
        }
        if ((i5 & 896) == 0) {
            j2 = j;
            i3 |= ((i2 & 4) != 0 || !h.mo5434e(j2)) ? 128 : 256;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i5 & 7168) == 0) {
                i3 |= h.mo5408I(this) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
            }
        }
        if ((i3 & 5851) != 1170 || !h.mo5442i()) {
            h.mo5466u0();
            if ((i5 & 1) == 0 || h.mo5425Y()) {
                dVar4 = i6 != 0 ? C1436d.C1437a.f3125b : dVar3;
                if ((i2 & 2) != 0) {
                    f4 = f2678b;
                    i3 &= -113;
                } else {
                    f4 = f2;
                }
                if ((i2 & 4) != 0) {
                    j3 = C1545s.m3356b(((C1545s) h.mo5410J(ContentColorKt.f2199a)).f3366a, 0.12f);
                    i3 &= -897;
                    h.mo5419S();
                    C1192i0.m2325a(f4, 0.0f, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 8, j3, h, dVar4);
                    f3 = f4;
                    dVar3 = dVar4;
                }
            } else {
                h.mo5396C();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                dVar4 = dVar3;
                f4 = f2;
            }
            j3 = j2;
            h.mo5419S();
            C1192i0.m2325a(f4, 0.0f, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 8, j3, h, dVar4);
            f3 = f4;
            dVar3 = dVar4;
        } else {
            h.mo5396C();
            f3 = f2;
            j3 = j2;
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new TabRowDefaults$Divider$1(this, dVar3, f3, j3, i, i2);
        }
    }

    /* renamed from: b */
    public final void mo5380b(float f, int i, int i2, long j, C1302d dVar, C1436d dVar2) {
        int i3;
        C1436d dVar3;
        float f2;
        long j2;
        long j3;
        float f3;
        float f4;
        C1436d dVar4;
        int i4;
        int i5 = i;
        ComposerImpl h = dVar.mo5440h(1499002201);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i5 | 6;
            dVar3 = dVar2;
        } else if ((i5 & 14) == 0) {
            dVar3 = dVar2;
            i3 = (h.mo5408I(dVar3) ? 4 : 2) | i5;
        } else {
            dVar3 = dVar2;
            i3 = i5;
        }
        if ((i5 & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (h.mo5428b(f)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                f2 = f;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            f2 = f;
        }
        if ((i5 & 896) == 0) {
            j2 = j;
            i3 |= ((i2 & 4) != 0 || !h.mo5434e(j2)) ? 128 : 256;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i5 & 7168) == 0) {
                i3 |= h.mo5408I(this) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
            }
        }
        if ((i3 & 5851) != 1170 || !h.mo5442i()) {
            h.mo5466u0();
            if ((i5 & 1) == 0 || h.mo5425Y()) {
                dVar4 = i6 != 0 ? C1436d.C1437a.f3125b : dVar3;
                f4 = (i2 & 2) != 0 ? f2679c : f2;
                if ((i2 & 4) != 0) {
                    j2 = ((C1545s) h.mo5410J(ContentColorKt.f2199a)).f3366a;
                }
            } else {
                h.mo5396C();
                dVar4 = dVar3;
                f4 = f2;
            }
            h.mo5419S();
            BoxKt.m1455a(C0761x.m1655A(SizeKt.m1488h(SizeKt.m1487g(dVar4), f4), j2, C1517e0.f3292a), h, 0);
            f3 = f4;
            j3 = j2;
            dVar3 = dVar4;
        } else {
            h.mo5396C();
            f3 = f2;
            j3 = j2;
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new TabRowDefaults$Indicator$1(this, dVar3, f3, j3, i, i2);
        }
    }
}
