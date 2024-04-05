package androidx.compose.material;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

final class DrawerKt$rememberBottomDrawerState$2 extends Lambda implements C19846a<C1185g> {
    public final /* synthetic */ C19857l<BottomDrawerValue, Boolean> $confirmStateChange;
    public final /* synthetic */ BottomDrawerValue $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$rememberBottomDrawerState$2(BottomDrawerValue bottomDrawerValue, C19857l<? super BottomDrawerValue, Boolean> lVar) {
        super(0);
        this.$initialValue = bottomDrawerValue;
        this.$confirmStateChange = lVar;
    }

    public final C1185g invoke() {
        return new C1185g(this.$initialValue, this.$confirmStateChange);
    }
}
