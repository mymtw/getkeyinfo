package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.node.LayoutNodeWrapper;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;

/* renamed from: androidx.compose.ui.layout.z */
public final class C1716z implements C1710u {

    /* renamed from: b */
    public final C1681g f3773b;

    /* renamed from: c */
    public final MeasuringIntrinsics$IntrinsicMinMax f3774c;

    /* renamed from: d */
    public final MeasuringIntrinsics$IntrinsicWidthHeight f3775d;

    public C1716z(LayoutNodeWrapper layoutNodeWrapper, MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax, MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight) {
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        C19383o.m32797g(measuringIntrinsics$IntrinsicMinMax, "minMax");
        C19383o.m32797g(measuringIntrinsics$IntrinsicWidthHeight, "widthHeight");
        this.f3773b = layoutNodeWrapper;
        this.f3774c = measuringIntrinsics$IntrinsicMinMax;
        this.f3775d = measuringIntrinsics$IntrinsicWidthHeight;
    }

    /* renamed from: D */
    public final int mo6664D(int i) {
        return this.f3773b.mo6664D(i);
    }

    /* renamed from: J */
    public final C1686i0 mo6665J(long j) {
        if (this.f3775d == MeasuringIntrinsics$IntrinsicWidthHeight.Width) {
            return new C1666a0(this.f3774c == MeasuringIntrinsics$IntrinsicMinMax.Max ? this.f3773b.mo6664D(C7280a.m13962g(j)) : this.f3773b.mo6669z(C7280a.m13962g(j)), C7280a.m13962g(j));
        }
        return new C1666a0(C7280a.m13963h(j), this.f3774c == MeasuringIntrinsics$IntrinsicMinMax.Max ? this.f3773b.mo6667i(C7280a.m13963h(j)) : this.f3773b.mo6668s(C7280a.m13963h(j)));
    }

    /* renamed from: f */
    public final Object mo6666f() {
        return this.f3773b.mo6666f();
    }

    /* renamed from: i */
    public final int mo6667i(int i) {
        return this.f3773b.mo6667i(i);
    }

    /* renamed from: s */
    public final int mo6668s(int i) {
        return this.f3773b.mo6668s(i);
    }

    /* renamed from: z */
    public final int mo6669z(int i) {
        return this.f3773b.mo6669z(i);
    }
}
