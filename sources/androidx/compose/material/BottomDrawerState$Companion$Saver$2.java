package androidx.compose.material;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class BottomDrawerState$Companion$Saver$2 extends Lambda implements C19857l<BottomDrawerValue, C1185g> {
    public final /* synthetic */ C19857l<BottomDrawerValue, Boolean> $confirmStateChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomDrawerState$Companion$Saver$2(C19857l<? super BottomDrawerValue, Boolean> lVar) {
        super(1);
        this.$confirmStateChange = lVar;
    }

    public final C1185g invoke(BottomDrawerValue bottomDrawerValue) {
        C19383o.m32797g(bottomDrawerValue, "it");
        return new C1185g(bottomDrawerValue, this.$confirmStateChange);
    }
}
