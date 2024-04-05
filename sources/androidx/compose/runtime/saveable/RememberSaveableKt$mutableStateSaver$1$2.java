package androidx.compose.runtime.saveable;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.snapshots.C1395m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class RememberSaveableKt$mutableStateSaver$1$2 extends Lambda implements C19857l<C1338j0<Object>, C1338j0<Object>> {
    public final /* synthetic */ C1373g<Object, Object> $this_with;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$mutableStateSaver$1$2(C1373g<Object, Object> gVar) {
        super(1);
        this.$this_with = gVar;
    }

    public final C1338j0<Object> invoke(C1338j0<Object> j0Var) {
        Object obj;
        C19383o.m32797g(j0Var, "it");
        if (j0Var instanceof C1395m) {
            if (j0Var.getValue() != null) {
                C1373g<Object, Object> gVar = this.$this_with;
                Object value = j0Var.getValue();
                C19383o.m32794d(value);
                obj = gVar.mo5929b(value);
            } else {
                obj = null;
            }
            return C0761x.m1751w0(obj, ((C1395m) j0Var).getPolicy());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
