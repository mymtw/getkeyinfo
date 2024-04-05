package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.p015ui.semantics.C1909p;
import androidx.compose.p015ui.semantics.C1910q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ boolean $isStartHandle;
    public final /* synthetic */ long $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1(boolean z, long j) {
        super(1);
        this.$isStartHandle = z;
        this.$position = j;
    }

    public final void invoke(C1910q qVar) {
        Handle handle;
        C19383o.m32797g(qVar, "$this$semantics");
        C1909p<C1013h> pVar = C1014i.f2131c;
        if (this.$isStartHandle) {
            handle = Handle.SelectionStart;
        } else {
            handle = Handle.SelectionEnd;
        }
        qVar.mo7342a(pVar, new C1013h(handle, this.$position));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }
}
