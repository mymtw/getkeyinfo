package androidx.compose.runtime;

import androidx.compose.animation.C0391c;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class ComposerImpl$apply$operation$1 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ C19861p<T, V, C19394m> $block;
    public final /* synthetic */ V $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$apply$operation$1(C19861p<? super T, ? super V, C19394m> pVar, V v) {
        super(3);
        this.$block = pVar;
        this.$value = v;
    }

    public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
        C0391c.m1059f(cVar, "applier", d1Var, "<anonymous parameter 1>", y0Var, "<anonymous parameter 2>");
        this.$block.invoke(cVar.mo5612e(), this.$value);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }
}
