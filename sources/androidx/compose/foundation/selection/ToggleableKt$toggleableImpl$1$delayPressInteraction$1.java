package androidx.compose.foundation.selection;

import androidx.compose.runtime.C1338j0;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ToggleableKt$toggleableImpl$1$delayPressInteraction$1 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ C19846a<Boolean> $isRootInScrollableContainer;
    public final /* synthetic */ C1338j0<Boolean> $isToggleableInScrollableContainer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableImpl$1$delayPressInteraction$1(C1338j0<Boolean> j0Var, C19846a<Boolean> aVar) {
        super(0);
        this.$isToggleableInScrollableContainer = j0Var;
        this.$isRootInScrollableContainer = aVar;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(this.$isToggleableInScrollableContainer.getValue().booleanValue() || this.$isRootInScrollableContainer.invoke().booleanValue());
    }
}
