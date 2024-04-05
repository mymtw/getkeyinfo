package androidx.compose.material;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class DrawerState$Companion$Saver$2 extends Lambda implements C19857l<DrawerValue, C1206k0> {
    public final /* synthetic */ C19857l<DrawerValue, Boolean> $confirmStateChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerState$Companion$Saver$2(C19857l<? super DrawerValue, Boolean> lVar) {
        super(1);
        this.$confirmStateChange = lVar;
    }

    public final C1206k0 invoke(DrawerValue drawerValue) {
        C19383o.m32797g(drawerValue, "it");
        return new C1206k0(drawerValue, this.$confirmStateChange);
    }
}
