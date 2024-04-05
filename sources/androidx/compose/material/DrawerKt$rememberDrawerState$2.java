package androidx.compose.material;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

final class DrawerKt$rememberDrawerState$2 extends Lambda implements C19846a<C1206k0> {
    public final /* synthetic */ C19857l<DrawerValue, Boolean> $confirmStateChange;
    public final /* synthetic */ DrawerValue $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$rememberDrawerState$2(DrawerValue drawerValue, C19857l<? super DrawerValue, Boolean> lVar) {
        super(0);
        this.$initialValue = drawerValue;
        this.$confirmStateChange = lVar;
    }

    public final C1206k0 invoke() {
        return new C1206k0(this.$initialValue, this.$confirmStateChange);
    }
}
