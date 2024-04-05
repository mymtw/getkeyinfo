package androidx.compose.material;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

final class SwipeToDismissKt$rememberDismissState$2 extends Lambda implements C19846a<C1189h0> {
    public final /* synthetic */ C19857l<DismissValue, Boolean> $confirmStateChange;
    public final /* synthetic */ DismissValue $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$rememberDismissState$2(DismissValue dismissValue, C19857l<? super DismissValue, Boolean> lVar) {
        super(0);
        this.$initialValue = dismissValue;
        this.$confirmStateChange = lVar;
    }

    public final C1189h0 invoke() {
        return new C1189h0(this.$initialValue, this.$confirmStateChange);
    }
}
