package androidx.compose.foundation.lazy;

import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.collections.C19318k;
import kotlin.reflect.C19421p;

/* renamed from: androidx.compose.foundation.lazy.w */
public final class C0864w {

    /* renamed from: a */
    public final int f1853a;

    /* renamed from: b */
    public final C1686i0[] f1854b;

    /* renamed from: c */
    public final boolean f1855c;

    /* renamed from: d */
    public final C1428a.C1430b f1856d;

    /* renamed from: e */
    public final C1428a.C1431c f1857e;

    /* renamed from: f */
    public final LayoutDirection f1858f;

    /* renamed from: g */
    public final boolean f1859g;

    /* renamed from: h */
    public final int f1860h;

    /* renamed from: i */
    public final int f1861i;

    /* renamed from: j */
    public final LazyListItemPlacementAnimator f1862j;

    /* renamed from: k */
    public final int f1863k;

    /* renamed from: l */
    public final long f1864l;

    /* renamed from: m */
    public final Object f1865m;

    /* renamed from: n */
    public final int f1866n;

    /* renamed from: o */
    public final int f1867o;

    /* renamed from: p */
    public final int f1868p;

    public C0864w(int i, C1686i0[] i0VarArr, boolean z, C1428a.C1430b bVar, C1428a.C1431c cVar, LayoutDirection layoutDirection, boolean z2, int i2, int i3, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i4, long j, Object obj) {
        this.f1853a = i;
        this.f1854b = i0VarArr;
        this.f1855c = z;
        this.f1856d = bVar;
        this.f1857e = cVar;
        this.f1858f = layoutDirection;
        this.f1859g = z2;
        this.f1860h = i2;
        this.f1861i = i3;
        this.f1862j = lazyListItemPlacementAnimator;
        this.f1863k = i4;
        this.f1864l = j;
        this.f1865m = obj;
        int i5 = 0;
        int i6 = 0;
        for (C1686i0 i0Var : i0VarArr) {
            boolean z3 = this.f1855c;
            i5 += z3 ? i0Var.f3723c : i0Var.f3722b;
            i6 = Math.max(i6, !z3 ? i0Var.f3723c : i0Var.f3722b);
        }
        this.f1866n = i5;
        this.f1867o = i5 + this.f1863k;
        this.f1868p = i6;
    }

    /* renamed from: a */
    public final C0858q mo4401a(int i, int i2, int i3) {
        long j;
        ArrayList arrayList = new ArrayList();
        int i4 = this.f1855c ? i3 : i2;
        boolean z = this.f1859g;
        int i5 = z ? (i4 - i) - this.f1866n : i;
        int f1 = z ? C19318k.m32614f1(this.f1854b) : 0;
        while (true) {
            boolean z2 = this.f1859g;
            if (!z2 ? f1 < this.f1854b.length : f1 >= 0) {
                C1686i0 i0Var = this.f1854b[f1];
                int size = z2 ? 0 : arrayList.size();
                if (this.f1855c) {
                    C1428a.C1430b bVar = this.f1856d;
                    if (bVar != null) {
                        j = C19421p.m32949o(bVar.mo6134a(i0Var.f3722b, i2, this.f1858f), i5);
                        int i6 = i3;
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    int i7 = i2;
                    C1428a.C1431c cVar = this.f1857e;
                    if (cVar != null) {
                        j = C19421p.m32949o(i5, cVar.mo6135a(i0Var.f3723c, i3));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                i5 += this.f1855c ? i0Var.f3723c : i0Var.f3722b;
                arrayList.add(size, new C0857p(j, i0Var, this.f1854b[f1].mo6722f()));
                f1 = this.f1859g ? f1 - 1 : f1 + 1;
            } else {
                return new C0858q(i, this.f1853a, this.f1865m, this.f1866n, this.f1867o, -(!z2 ? this.f1860h : this.f1861i), i4 + (!z2 ? this.f1861i : this.f1860h), this.f1855c, arrayList, this.f1862j, this.f1864l);
            }
        }
    }
}
