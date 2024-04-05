package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C1013h;
import androidx.compose.foundation.text.selection.C1014i;
import androidx.compose.p015ui.semantics.C1910q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class CoreTextFieldKt$TextFieldCursorHandle$2$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ long $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$TextFieldCursorHandle$2$1(long j) {
        super(1);
        this.$position = j;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        qVar.mo7342a(C1014i.f2131c, new C1013h(Handle.Cursor, this.$position));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }
}
