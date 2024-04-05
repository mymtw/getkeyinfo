package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class ComposerImpl$invokeMovableContentLambda$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ C1325g0<Object> $content;
    public final /* synthetic */ Object $parameter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$invokeMovableContentLambda$1(C1325g0<Object> g0Var, Object obj) {
        super(2);
        this.$content = g0Var;
        this.$parameter = obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            this.$content.getClass();
            throw null;
        } else {
            dVar.mo5396C();
        }
    }
}
