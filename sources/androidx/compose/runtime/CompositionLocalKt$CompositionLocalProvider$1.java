package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class CompositionLocalKt$CompositionLocalProvider$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1412t0<?>[] $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositionLocalKt$CompositionLocalProvider$1(C1412t0<?>[] t0VarArr, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$values = t0VarArr;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1412t0<?>[] t0VarArr = this.$values;
        CompositionLocalKt.m2530a((C1412t0[]) Arrays.copyOf(t0VarArr, t0VarArr.length), this.$content, dVar, this.$$changed | 1);
    }
}
