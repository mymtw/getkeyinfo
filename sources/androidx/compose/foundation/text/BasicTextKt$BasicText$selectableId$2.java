package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C1018l;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BasicTextKt$BasicText$selectableId$2 extends Lambda implements C19846a<Long> {
    public final /* synthetic */ C1018l $selectionRegistrar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$selectableId$2(C1018l lVar) {
        super(0);
        this.$selectionRegistrar = lVar;
    }

    public final Long invoke() {
        C1018l lVar = this.$selectionRegistrar;
        return Long.valueOf(lVar != null ? lVar.mo4712a() : 0);
    }
}
