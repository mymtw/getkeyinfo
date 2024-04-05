package androidx.compose.runtime.snapshots;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class NestedReadonlySnapshot$readObserver$1$1$1 extends Lambda implements C19857l<Object, C19394m> {
    public final /* synthetic */ C19857l<Object, C19394m> $it;
    public final /* synthetic */ C19857l<Object, C19394m> $readObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedReadonlySnapshot$readObserver$1$1$1(C19857l<Object, C19394m> lVar, C19857l<Object, C19394m> lVar2) {
        super(1);
        this.$readObserver = lVar;
        this.$it = lVar2;
    }

    public final void invoke(Object obj) {
        C19383o.m32797g(obj, "state");
        this.$readObserver.invoke(obj);
        this.$it.invoke(obj);
    }
}
