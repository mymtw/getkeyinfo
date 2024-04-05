package androidx.compose.foundation.selection;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

final class ToggleableKt$toggleable$4$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C19857l<Boolean, C19394m> $onValueChange;
    public final /* synthetic */ boolean $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleable$4$1(C19857l<? super Boolean, C19394m> lVar, boolean z) {
        super(0);
        this.$onValueChange = lVar;
        this.$value = z;
    }

    public final void invoke() {
        this.$onValueChange.invoke(Boolean.valueOf(!this.$value));
    }
}
