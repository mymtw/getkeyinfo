package androidx.compose.material;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class DismissState$Companion$Saver$2 extends Lambda implements C19857l<DismissValue, C1189h0> {
    public final /* synthetic */ C19857l<DismissValue, Boolean> $confirmStateChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DismissState$Companion$Saver$2(C19857l<? super DismissValue, Boolean> lVar) {
        super(1);
        this.$confirmStateChange = lVar;
    }

    public final C1189h0 invoke(DismissValue dismissValue) {
        C19383o.m32797g(dismissValue, "it");
        return new C1189h0(dismissValue, this.$confirmStateChange);
    }
}
