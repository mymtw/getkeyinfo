package androidx.compose.runtime.saveable;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.snapshots.C1395m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class RememberSaveableKt$mutableStateSaver$1$1 extends Lambda implements C19861p<C1375i, C1338j0<Object>, C1338j0<Object>> {
    public final /* synthetic */ C1373g<Object, Object> $this_with;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$mutableStateSaver$1$1(C1373g<Object, Object> gVar) {
        super(2);
        this.$this_with = gVar;
    }

    public final C1338j0<Object> invoke(C1375i iVar, C1338j0<Object> j0Var) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(j0Var, "state");
        if (j0Var instanceof C1395m) {
            return C0761x.m1751w0(this.$this_with.mo5928a(iVar, j0Var.getValue()), ((C1395m) j0Var).getPolicy());
        }
        throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
    }
}
