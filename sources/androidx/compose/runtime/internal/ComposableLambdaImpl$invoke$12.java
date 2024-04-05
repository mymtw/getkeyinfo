package androidx.compose.runtime.internal;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class ComposableLambdaImpl$invoke$12 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $changed;
    public final /* synthetic */ int $changed1;
    public final /* synthetic */ Object $p1;
    public final /* synthetic */ Object $p10;
    public final /* synthetic */ Object $p11;
    public final /* synthetic */ Object $p12;
    public final /* synthetic */ Object $p2;
    public final /* synthetic */ Object $p3;
    public final /* synthetic */ Object $p4;
    public final /* synthetic */ Object $p5;
    public final /* synthetic */ Object $p6;
    public final /* synthetic */ Object $p7;
    public final /* synthetic */ Object $p8;
    public final /* synthetic */ Object $p9;
    public final /* synthetic */ ComposableLambdaImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$12(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, int i, int i2) {
        super(2);
        this.this$0 = composableLambdaImpl;
        this.$p1 = obj;
        this.$p2 = obj2;
        this.$p3 = obj3;
        this.$p4 = obj4;
        this.$p5 = obj5;
        this.$p6 = obj6;
        this.$p7 = obj7;
        this.$p8 = obj8;
        this.$p9 = obj9;
        this.$p10 = obj10;
        this.$p11 = obj11;
        this.$p12 = obj12;
        this.$changed = i;
        this.$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        C19383o.m32797g(dVar2, "nc");
        this.this$0.mo5854l(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, this.$p9, this.$p10, this.$p11, this.$p12, dVar2, this.$changed | 1, this.$changed1);
    }
}
