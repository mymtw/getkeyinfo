package androidx.compose.foundation;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import com.google.android.gms.common.api.Api;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;

public final class ScrollingLayoutModifier implements C1702p {

    /* renamed from: b */
    public final ScrollState f1285b;

    /* renamed from: c */
    public final boolean f1286c;

    /* renamed from: d */
    public final boolean f1287d;

    /* renamed from: e */
    public final C1030w f1288e;

    public ScrollingLayoutModifier(ScrollState scrollState, boolean z, boolean z2, C1030w wVar) {
        C19383o.m32797g(scrollState, "scrollerState");
        C19383o.m32797g(wVar, "overscrollEffect");
        this.f1285b = scrollState;
        this.f1286c = z;
        this.f1287d = z2;
        this.f1288e = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollingLayoutModifier)) {
            return false;
        }
        ScrollingLayoutModifier scrollingLayoutModifier = (ScrollingLayoutModifier) obj;
        return C19383o.m32792b(this.f1285b, scrollingLayoutModifier.f1285b) && this.f1286c == scrollingLayoutModifier.f1286c && this.f1287d == scrollingLayoutModifier.f1287d && C19383o.m32792b(this.f1288e, scrollingLayoutModifier.f1288e);
    }

    /* renamed from: f */
    public final int mo3562f(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        return layoutNodeWrapper.mo6664D(i);
    }

    public final int hashCode() {
        int hashCode = this.f1285b.hashCode() * 31;
        boolean z = this.f1286c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f1287d;
        if (!z3) {
            z2 = z3;
        }
        return this.f1288e.hashCode() + ((i + (z2 ? 1 : 0)) * 31);
    }

    /* renamed from: r */
    public final int mo3563r(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        return layoutNodeWrapper.mo6669z(i);
    }

    /* renamed from: s */
    public final int mo3564s(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        return layoutNodeWrapper.mo6668s(i);
    }

    /* renamed from: t */
    public final int mo3565t(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        return layoutNodeWrapper.mo6667i(i);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ScrollingLayoutModifier(scrollerState=");
        h.append(this.f1285b);
        h.append(", isReversed=");
        h.append(this.f1286c);
        h.append(", isVertical=");
        h.append(this.f1287d);
        h.append(", overscrollEffect=");
        h.append(this.f1288e);
        h.append(')');
        return h.toString();
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C0114h.m282M(j, this.f1287d ? Orientation.Vertical : Orientation.Horizontal);
        boolean z = this.f1287d;
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int g = z ? Integer.MAX_VALUE : C7280a.m13962g(j);
        if (this.f1287d) {
            i = C7280a.m13963h(j);
        }
        C1686i0 J = uVar.mo6665J(C7280a.m13956a(j, 0, i, 0, g, 5));
        int i2 = J.f3722b;
        int h = C7280a.m13963h(j);
        if (i2 > h) {
            i2 = h;
        }
        int i3 = J.f3723c;
        int g2 = C7280a.m13962g(j);
        if (i3 > g2) {
            i3 = g2;
        }
        int i4 = J.f3723c - i3;
        int i5 = J.f3722b - i2;
        if (!this.f1287d) {
            i4 = i5;
        }
        this.f1288e.setEnabled(i4 != 0);
        return xVar.mo4387Z(i2, i3, C19294b0.m32559p0(), new ScrollingLayoutModifier$measure$1(this, i4, J));
    }
}
