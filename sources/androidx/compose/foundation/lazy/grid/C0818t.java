package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.collections.C19318k;
import kotlin.reflect.C19421p;

/* renamed from: androidx.compose.foundation.lazy.grid.t */
public final class C0818t {

    /* renamed from: a */
    public final int f1742a;

    /* renamed from: b */
    public final Object f1743b;

    /* renamed from: c */
    public final boolean f1744c;

    /* renamed from: d */
    public final int f1745d;

    /* renamed from: e */
    public final int f1746e;

    /* renamed from: f */
    public final boolean f1747f;

    /* renamed from: g */
    public final LayoutDirection f1748g;

    /* renamed from: h */
    public final int f1749h;

    /* renamed from: i */
    public final int f1750i;

    /* renamed from: j */
    public final C1686i0[] f1751j;

    /* renamed from: k */
    public final LazyGridItemPlacementAnimator f1752k;

    /* renamed from: l */
    public final long f1753l;

    /* renamed from: m */
    public final int f1754m;

    /* renamed from: n */
    public final int f1755n;

    public C0818t(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, C1686i0[] i0VarArr, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j) {
        this.f1742a = i;
        this.f1743b = obj;
        this.f1744c = z;
        this.f1745d = i2;
        this.f1746e = i3;
        this.f1747f = z2;
        this.f1748g = layoutDirection;
        this.f1749h = i4;
        this.f1750i = i5;
        this.f1751j = i0VarArr;
        this.f1752k = lazyGridItemPlacementAnimator;
        this.f1753l = j;
        int i6 = 0;
        for (C1686i0 i0Var : i0VarArr) {
            i6 = Math.max(i6, this.f1744c ? i0Var.f3723c : i0Var.f3722b);
        }
        this.f1754m = i6;
        this.f1755n = i6 + this.f1746e;
    }

    /* renamed from: a */
    public final C0814p mo4351a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i;
        int i9 = i2;
        ArrayList arrayList = new ArrayList();
        boolean z = this.f1744c;
        int i10 = z ? i4 : i3;
        int i11 = this.f1747f ? (i10 - i8) - this.f1754m : i8;
        int i12 = (!z || this.f1748g != LayoutDirection.Rtl) ? i9 : ((z ? i3 : i4) - i9) - this.f1745d;
        long o = z ? C19421p.m32949o(i12, i11) : C19421p.m32949o(i11, i12);
        int f1 = this.f1747f ? C19318k.m32614f1(this.f1751j) : 0;
        while (true) {
            boolean z2 = this.f1747f;
            if (!(!z2 ? f1 < this.f1751j.length : f1 >= 0)) {
                break;
            }
            arrayList.add(z2 ? 0 : arrayList.size(), new C0813o(this.f1751j[f1], this.f1751j[f1].mo6722f()));
            f1 = this.f1747f ? f1 - 1 : f1 + 1;
        }
        long o2 = this.f1744c ? C19421p.m32949o(i9, i8) : C19421p.m32949o(i, i2);
        int i13 = this.f1742a;
        Object obj = this.f1743b;
        long a = this.f1744c ? C0761x.m1707a(this.f1745d, this.f1754m) : C0761x.m1707a(this.f1754m, this.f1745d);
        int i14 = this.f1746e;
        boolean z3 = this.f1747f;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = arrayList2;
        return new C0814p(o2, o, i13, obj, i5, i6, a, i7, i14, -(!z3 ? this.f1749h : this.f1750i), i10 + (!z3 ? this.f1750i : this.f1749h), this.f1744c, arrayList2, this.f1752k, this.f1753l);
    }
}
