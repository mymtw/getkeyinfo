package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import p753kq.C19861p;

final class EffectsKt$LaunchedEffect$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C19525d0, C19340c<? super C19394m>, Object> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectsKt$LaunchedEffect$1(C19861p<? super C19525d0, ? super C19340c<? super C19394m>, ? extends Object> pVar, int i) {
        super(2);
        this.$block = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C19861p<C19525d0, C19340c<? super C19394m>, Object> pVar = this.$block;
        int i2 = this.$$changed | 1;
        C1360s sVar = C1415u.f3074a;
        C19383o.m32797g(pVar, "block");
        ComposerImpl h = dVar.mo5440h(-805415771);
        if ((i2 & 1) != 0 || !h.mo5442i()) {
            throw new IllegalStateException("LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.".toString());
        }
        h.mo5396C();
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new EffectsKt$LaunchedEffect$1(pVar, i2);
        }
    }
}
