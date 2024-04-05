package androidx.compose.foundation.lazy.grid;

import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.compose.foundation.lazy.grid.v */
public final class C0820v {

    /* renamed from: a */
    public final int f1760a;

    /* renamed from: b */
    public final C0818t[] f1761b;

    /* renamed from: c */
    public final List<C0801c> f1762c;

    /* renamed from: d */
    public final boolean f1763d;

    /* renamed from: e */
    public final int f1764e;

    /* renamed from: f */
    public final LayoutDirection f1765f;

    /* renamed from: g */
    public final int f1766g;

    /* renamed from: h */
    public final int f1767h;

    /* renamed from: i */
    public final int f1768i;

    /* renamed from: j */
    public final int f1769j;

    public C0820v() {
        throw null;
    }

    public C0820v(int i, C0818t[] tVarArr, List list, boolean z, int i2, LayoutDirection layoutDirection, int i3, int i4) {
        this.f1760a = i;
        this.f1761b = tVarArr;
        this.f1762c = list;
        this.f1763d = z;
        this.f1764e = i2;
        this.f1765f = layoutDirection;
        this.f1766g = i3;
        this.f1767h = i4;
        int i5 = 0;
        for (C0818t tVar : tVarArr) {
            i5 = Math.max(i5, tVar.f1754m);
        }
        this.f1768i = i5;
        this.f1769j = i5 + this.f1766g;
    }

    /* renamed from: a */
    public final ArrayList mo4353a(int i, int i2, int i3) {
        C0818t[] tVarArr = this.f1761b;
        ArrayList arrayList = new ArrayList(tVarArr.length);
        int length = tVarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < length) {
            C0818t tVar = tVarArr[i4];
            int i8 = i5 + 1;
            int i9 = (int) this.f1762c.get(i5).f1700a;
            int i10 = this.f1765f == LayoutDirection.Rtl ? (this.f1764e - i6) - i9 : i6;
            boolean z = this.f1763d;
            int i11 = z ? this.f1760a : i10;
            if (!z) {
                i10 = this.f1760a;
            }
            C0814p a = tVar.mo4351a(i, i7, i2, i3, i11, i10, this.f1768i);
            i7 += tVar.f1745d + this.f1767h;
            i6 += i9;
            arrayList.add(a);
            i4++;
            i5 = i8;
            tVarArr = tVarArr;
        }
        return arrayList;
    }
}
