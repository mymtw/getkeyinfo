package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19862q<C1251s1, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1251s1 $item;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$2$1$1(C19862q<? super C1251s1, ? super C1302d, ? super Integer, C19394m> qVar, C1251s1 s1Var, int i) {
        super(2);
        this.$content = qVar;
        this.$item = s1Var;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C19862q<C1251s1, C1302d, Integer, C19394m> qVar = this.$content;
            C1251s1 s1Var = this.$item;
            C19383o.m32794d(s1Var);
            qVar.invoke(s1Var, dVar, Integer.valueOf((this.$$dirty >> 3) & 112));
            return;
        }
        dVar.mo5396C();
    }
}
