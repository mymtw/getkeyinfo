package androidx.compose.p015ui.layout;

import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;

/* renamed from: androidx.compose.ui.layout.d */
public final class C1675d implements C1710u {

    /* renamed from: b */
    public final C1681g f3714b;

    /* renamed from: c */
    public final IntrinsicMinMax f3715c;

    /* renamed from: d */
    public final IntrinsicWidthHeight f3716d;

    public C1675d(C1681g gVar, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        C19383o.m32797g(gVar, "measurable");
        C19383o.m32797g(intrinsicMinMax, "minMax");
        C19383o.m32797g(intrinsicWidthHeight, "widthHeight");
        this.f3714b = gVar;
        this.f3715c = intrinsicMinMax;
        this.f3716d = intrinsicWidthHeight;
    }

    /* renamed from: D */
    public final int mo6664D(int i) {
        return this.f3714b.mo6664D(i);
    }

    /* renamed from: J */
    public final C1686i0 mo6665J(long j) {
        if (this.f3716d == IntrinsicWidthHeight.Width) {
            return new C1677e(this.f3715c == IntrinsicMinMax.Max ? this.f3714b.mo6664D(C7280a.m13962g(j)) : this.f3714b.mo6669z(C7280a.m13962g(j)), C7280a.m13962g(j));
        }
        return new C1677e(C7280a.m13963h(j), this.f3715c == IntrinsicMinMax.Max ? this.f3714b.mo6667i(C7280a.m13963h(j)) : this.f3714b.mo6668s(C7280a.m13963h(j)));
    }

    /* renamed from: f */
    public final Object mo6666f() {
        return this.f3714b.mo6666f();
    }

    /* renamed from: i */
    public final int mo6667i(int i) {
        return this.f3714b.mo6667i(i);
    }

    /* renamed from: s */
    public final int mo6668s(int i) {
        return this.f3714b.mo6668s(i);
    }

    /* renamed from: z */
    public final int mo6669z(int i) {
        return this.f3714b.mo6669z(i);
    }
}
