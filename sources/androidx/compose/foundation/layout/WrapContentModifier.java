package androidx.compose.foundation.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.C1862p0;
import androidx.compose.p015ui.unit.LayoutDirection;
import com.google.android.gms.common.api.Api;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p174m0.C7280a;
import p174m0.C7287g;
import p174m0.C7290i;
import p753kq.C19857l;
import p753kq.C19861p;

public final class WrapContentModifier extends C1862p0 implements C1702p {

    /* renamed from: c */
    public final Direction f1456c;

    /* renamed from: d */
    public final boolean f1457d;

    /* renamed from: e */
    public final C19861p<C7290i, LayoutDirection, C7287g> f1458e;

    /* renamed from: f */
    public final Object f1459f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapContentModifier(Direction direction, boolean z, C19861p<? super C7290i, ? super LayoutDirection, C7287g> pVar, Object obj, C19857l<? super C1859o0, C19394m> lVar) {
        super(lVar);
        C19383o.m32797g(direction, "direction");
        this.f1456c = direction;
        this.f1457d = z;
        this.f1458e = pVar;
        this.f1459f = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WrapContentModifier)) {
            return false;
        }
        WrapContentModifier wrapContentModifier = (WrapContentModifier) obj;
        return this.f1456c == wrapContentModifier.f1456c && this.f1457d == wrapContentModifier.f1457d && C19383o.m32792b(this.f1459f, wrapContentModifier.f1459f);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f1457d);
        return this.f1459f.hashCode() + ((hashCode + (this.f1456c.hashCode() * 31)) * 31);
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        Direction direction = this.f1456c;
        Direction direction2 = Direction.Vertical;
        int i = 0;
        int j2 = direction != direction2 ? 0 : C7280a.m13965j(j);
        Direction direction3 = this.f1456c;
        Direction direction4 = Direction.Horizontal;
        if (direction3 == direction4) {
            i = C7280a.m13964i(j);
        }
        Direction direction5 = this.f1456c;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int h = (direction5 == direction2 || !this.f1457d) ? C7280a.m13963h(j) : Integer.MAX_VALUE;
        if (this.f1456c == direction4 || !this.f1457d) {
            i2 = C7280a.m13962g(j);
        }
        C1686i0 J = uVar.mo6665J(C0114h.m313q(j2, h, i, i2));
        int M = C19388s.m32833M(J.f3722b, C7280a.m13965j(j), C7280a.m13963h(j));
        int M2 = C19388s.m32833M(J.f3723c, C7280a.m13964i(j), C7280a.m13962g(j));
        return xVar.mo4387Z(M, M2, C19294b0.m32559p0(), new WrapContentModifier$measure$1(this, M, J, M2, xVar));
    }
}
