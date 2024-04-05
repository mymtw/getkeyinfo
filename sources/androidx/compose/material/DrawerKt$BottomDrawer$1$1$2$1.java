package androidx.compose.material;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p174m0.C7282b;
import p174m0.C7287g;
import p753kq.C19857l;

public final class DrawerKt$BottomDrawer$1$1$2$1 extends Lambda implements C19857l<C7282b, C7287g> {
    public final /* synthetic */ C1185g $drawerState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$1$1$2$1(C1185g gVar) {
        super(1);
        this.$drawerState = gVar;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return new C7287g(m34749invokeBjo55l4((C7282b) obj));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m34749invokeBjo55l4(C7282b bVar) {
        C19383o.m32797g(bVar, "$this$offset");
        return C19421p.m32949o(0, C7279a.m13954l(((Number) this.$drawerState.f2282e.getValue()).floatValue()));
    }
}
