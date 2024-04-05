package androidx.compose.material;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

final class CheckboxKt$Checkbox$2$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ C19857l<Boolean, C19394m> $onCheckedChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$Checkbox$2$1(C19857l<? super Boolean, C19394m> lVar, boolean z) {
        super(0);
        this.$onCheckedChange = lVar;
        this.$checked = z;
    }

    public final void invoke() {
        this.$onCheckedChange.invoke(Boolean.valueOf(!this.$checked));
    }
}
