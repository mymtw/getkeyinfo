package androidx.compose.runtime.snapshots;

import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class GlobalSnapshot$1$1$1 extends Lambda implements C19857l<Object, C19394m> {
    public final /* synthetic */ List<C19857l<Object, C19394m>> $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$1$1$1(List<C19857l<Object, C19394m>> list) {
        super(1);
        this.$it = list;
    }

    public final void invoke(Object obj) {
        C19383o.m32797g(obj, "state");
        List<C19857l<Object, C19394m>> list = this.$it;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).invoke(obj);
        }
    }
}
