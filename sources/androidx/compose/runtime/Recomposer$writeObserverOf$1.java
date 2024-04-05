package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p219r.C7731c;
import p753kq.C19857l;

final class Recomposer$writeObserverOf$1 extends Lambda implements C19857l<Object, C19394m> {
    public final /* synthetic */ C1349n $composition;
    public final /* synthetic */ C7731c<Object> $modifiedValues;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$writeObserverOf$1(C1349n nVar, C7731c<Object> cVar) {
        super(1);
        this.$composition = nVar;
        this.$modifiedValues = cVar;
    }

    public final void invoke(Object obj) {
        C19383o.m32797g(obj, "value");
        this.$composition.mo5812m(obj);
        C7731c<Object> cVar = this.$modifiedValues;
        if (cVar != null) {
            cVar.add(obj);
        }
    }
}
