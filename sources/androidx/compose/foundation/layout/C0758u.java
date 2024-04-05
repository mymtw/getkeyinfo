package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;

/* renamed from: androidx.compose.foundation.layout.u */
public final class C0758u implements IntrinsicSizeModifier {

    /* renamed from: b */
    public static final C0758u f1553b = new C0758u();

    /* renamed from: f */
    public final int mo3562f(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        return layoutNodeWrapper.mo6669z(i);
    }

    /* renamed from: t0 */
    public final long mo3944t0(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$calculateContentConstraints");
        C19383o.m32797g(uVar, "measurable");
        return C7280a.C7281a.m13971e(uVar.mo6669z(C7280a.m13962g(j)));
    }
}
