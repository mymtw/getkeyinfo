package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.C0454t;
import java.util.ArrayList;
import java.util.List;
import p174m0.C7287g;
import p174m0.C7290i;

/* renamed from: androidx.compose.foundation.lazy.grid.p */
public final class C0814p implements C0805g {

    /* renamed from: a */
    public final long f1720a;

    /* renamed from: b */
    public final long f1721b;

    /* renamed from: c */
    public final int f1722c;

    /* renamed from: d */
    public final Object f1723d;

    /* renamed from: e */
    public final int f1724e;

    /* renamed from: f */
    public final int f1725f;

    /* renamed from: g */
    public final long f1726g;

    /* renamed from: h */
    public final int f1727h;

    /* renamed from: i */
    public final int f1728i;

    /* renamed from: j */
    public final int f1729j;

    /* renamed from: k */
    public final int f1730k;

    /* renamed from: l */
    public final boolean f1731l;

    /* renamed from: m */
    public final List<C0813o> f1732m;

    /* renamed from: n */
    public final LazyGridItemPlacementAnimator f1733n;

    /* renamed from: o */
    public final long f1734o;

    /* renamed from: p */
    public final boolean f1735p;

    public C0814p() {
        throw null;
    }

    public C0814p(long j, long j2, int i, Object obj, int i2, int i3, long j3, int i4, int i5, int i6, int i7, boolean z, ArrayList arrayList, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j4) {
        this.f1720a = j;
        this.f1721b = j2;
        this.f1722c = i;
        this.f1723d = obj;
        this.f1724e = i2;
        this.f1725f = i3;
        this.f1726g = j3;
        this.f1727h = i4;
        this.f1728i = i5;
        this.f1729j = i6;
        this.f1730k = i7;
        this.f1731l = z;
        this.f1732m = arrayList;
        this.f1733n = lazyGridItemPlacementAnimator;
        this.f1734o = j4;
        int size = arrayList.size();
        boolean z2 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                break;
            } else if (mo4348e(i8) != null) {
                z2 = true;
                break;
            } else {
                i8++;
            }
        }
        this.f1735p = z2;
    }

    /* renamed from: a */
    public final long mo4339a() {
        return this.f1726g;
    }

    /* renamed from: b */
    public final int mo4340b() {
        return this.f1724e;
    }

    /* renamed from: c */
    public final int mo4341c() {
        return this.f1725f;
    }

    /* renamed from: d */
    public final long mo4342d() {
        return this.f1720a;
    }

    /* renamed from: e */
    public final C0454t<C7287g> mo4348e(int i) {
        Object obj = this.f1732m.get(i).f1719b;
        if (obj instanceof C0454t) {
            return (C0454t) obj;
        }
        return null;
    }

    /* renamed from: f */
    public final int mo4349f() {
        return this.f1728i + (this.f1731l ? C7290i.m13995b(this.f1726g) : (int) (this.f1726g >> 32));
    }

    public final int getIndex() {
        return this.f1722c;
    }
}
