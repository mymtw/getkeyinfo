package androidx.compose.runtime;

import androidx.compose.animation.C0391c;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class ComposerImpl$realizeMovement$2 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ int $count;
    public final /* synthetic */ int $from;
    public final /* synthetic */ int $to;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$realizeMovement$2(int i, int i2, int i3) {
        super(3);
        this.$from = i;
        this.$to = i2;
        this.$count = i3;
    }

    public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
        C0391c.m1059f(cVar, "applier", d1Var, "<anonymous parameter 1>", y0Var, "<anonymous parameter 2>");
        cVar.mo5639a(this.$from, this.$to, this.$count);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }
}
