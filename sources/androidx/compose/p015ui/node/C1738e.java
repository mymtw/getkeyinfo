package androidx.compose.p015ui.node;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.node.e */
public final class C1738e {

    /* renamed from: a */
    public final LayoutNode f3904a;

    /* renamed from: b */
    public C1338j0<C1711v> f3905b;

    /* renamed from: c */
    public C1711v f3906c;

    public C1738e(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "layoutNode");
        this.f3904a = layoutNode;
    }

    /* renamed from: a */
    public final C1711v mo6896a() {
        C1338j0<C1711v> j0Var = this.f3905b;
        if (j0Var == null) {
            C1711v vVar = this.f3906c;
            if (vVar != null) {
                j0Var = C0761x.m1751w0(vVar, C1351n1.f2948a);
            } else {
                throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
            }
        }
        this.f3905b = j0Var;
        return j0Var.getValue();
    }
}
