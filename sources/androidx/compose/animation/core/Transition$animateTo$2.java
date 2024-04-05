package androidx.compose.animation.core;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class Transition$animateTo$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ S $targetState;
    public final /* synthetic */ Transition<S> $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$2(Transition<S> transition, S s, int i) {
        super(2);
        this.$tmp0_rcvr = transition;
        this.$targetState = s;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        this.$tmp0_rcvr.mo3409a(this.$targetState, dVar, this.$$changed | 1);
    }
}
