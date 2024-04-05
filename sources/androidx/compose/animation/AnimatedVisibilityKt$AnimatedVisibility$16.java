package androidx.compose.animation;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class AnimatedVisibilityKt$AnimatedVisibility$16 extends Lambda implements C19862q<C0468d, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$16(C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(3);
        this.$content = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C0468d) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0468d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$AnimatedVisibility");
        if ((i & 81) != 16 || !dVar2.mo5442i()) {
            this.$content.invoke(dVar2, Integer.valueOf((this.$$dirty >> 15) & 14));
        } else {
            dVar2.mo5396C();
        }
    }
}
