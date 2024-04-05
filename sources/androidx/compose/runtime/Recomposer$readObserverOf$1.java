package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class Recomposer$readObserverOf$1 extends Lambda implements C19857l<Object, C19394m> {
    public final /* synthetic */ C1349n $composition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$readObserverOf$1(C1349n nVar) {
        super(1);
        this.$composition = nVar;
    }

    public final void invoke(Object obj) {
        C19383o.m32797g(obj, "value");
        this.$composition.mo5807i(obj);
    }
}
