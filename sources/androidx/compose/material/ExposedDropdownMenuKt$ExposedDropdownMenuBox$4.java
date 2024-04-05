package androidx.compose.material;

import androidx.compose.p015ui.focus.C1478l;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$4 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ C1478l $focusRequester;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$4(boolean z, C1478l lVar) {
        super(0);
        this.$expanded = z;
        this.$focusRequester = lVar;
    }

    public final void invoke() {
        if (this.$expanded) {
            this.$focusRequester.mo6218a();
        }
    }
}
