package androidx.compose.runtime.internal;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class ComposableLambdaImpl$invoke$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $changed;
    public final /* synthetic */ Object $p1;
    public final /* synthetic */ Object $p2;
    public final /* synthetic */ Object $p3;
    public final /* synthetic */ Object $p4;
    public final /* synthetic */ ComposableLambdaImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$4(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(2);
        this.this$0 = composableLambdaImpl;
        this.$p1 = obj;
        this.$p2 = obj2;
        this.$p3 = obj3;
        this.$p4 = obj4;
        this.$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C19383o.m32797g(dVar, "nc");
        this.this$0.mo5832d(this.$p1, this.$p2, this.$p3, this.$p4, dVar, this.$changed | 1);
    }
}
