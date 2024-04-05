package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p219r.C7731c;
import p753kq.C19846a;

final class Recomposer$performRecompose$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C1349n $composition;
    public final /* synthetic */ C7731c<Object> $modifiedValues;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$performRecompose$1$1(C7731c<Object> cVar, C1349n nVar) {
        super(0);
        this.$modifiedValues = cVar;
        this.$composition = nVar;
    }

    public final void invoke() {
        C7731c<Object> cVar = this.$modifiedValues;
        C1349n nVar = this.$composition;
        for (Object m : cVar) {
            nVar.mo5812m(m);
        }
    }
}
