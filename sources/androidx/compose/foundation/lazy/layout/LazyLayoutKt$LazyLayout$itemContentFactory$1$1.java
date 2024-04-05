package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C1342k1;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class LazyLayoutKt$LazyLayout$itemContentFactory$1$1 extends Lambda implements C19846a<C0841d> {
    public final /* synthetic */ C1342k1<C0841d> $currentItemProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$itemContentFactory$1$1(C1342k1<? extends C0841d> k1Var) {
        super(0);
        this.$currentItemProvider = k1Var;
    }

    public final C0841d invoke() {
        return this.$currentItemProvider.getValue();
    }
}
