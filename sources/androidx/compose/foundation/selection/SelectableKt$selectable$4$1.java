package androidx.compose.foundation.selection;

import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1910q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p753kq.C19857l;

public final class SelectableKt$selectable$4$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ boolean $selected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectableKt$selectable$4$1(boolean z) {
        super(1);
        this.$selected = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        boolean z = this.$selected;
        C19410j<Object>[] jVarArr = C1908o.f4253a;
        C1908o.f4265m.mo7356a(qVar, C1908o.f4253a[12], Boolean.valueOf(z));
    }
}
