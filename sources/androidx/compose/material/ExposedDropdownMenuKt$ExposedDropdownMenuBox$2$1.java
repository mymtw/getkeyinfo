package androidx.compose.material;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ C19857l<Boolean, C19394m> $onExpandedChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1(C19857l<? super Boolean, C19394m> lVar, boolean z) {
        super(0);
        this.$onExpandedChange = lVar;
        this.$expanded = z;
    }

    public final void invoke() {
        this.$onExpandedChange.invoke(Boolean.valueOf(!this.$expanded));
    }
}
