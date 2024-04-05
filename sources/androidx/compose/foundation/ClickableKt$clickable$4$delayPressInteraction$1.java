package androidx.compose.foundation;

import androidx.compose.runtime.C1338j0;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ClickableKt$clickable$4$delayPressInteraction$1 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ C1338j0<Boolean> $isClickableInScrollableContainer;
    public final /* synthetic */ C19846a<Boolean> $isRootInScrollableContainer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$4$delayPressInteraction$1(C1338j0<Boolean> j0Var, C19846a<Boolean> aVar) {
        super(0);
        this.$isClickableInScrollableContainer = j0Var;
        this.$isRootInScrollableContainer = aVar;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(this.$isClickableInScrollableContainer.getValue().booleanValue() || this.$isRootInScrollableContainer.invoke().booleanValue());
    }
}
