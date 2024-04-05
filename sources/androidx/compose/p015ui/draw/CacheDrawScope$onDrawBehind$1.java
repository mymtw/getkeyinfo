package androidx.compose.p015ui.draw;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p297z.C8410c;
import p297z.C8412e;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1 */
final class CacheDrawScope$onDrawBehind$1 extends Lambda implements C19857l<C8410c, C19394m> {
    public final /* synthetic */ C19857l<C8412e, C19394m> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CacheDrawScope$onDrawBehind$1(C19857l<? super C8412e, C19394m> lVar) {
        super(1);
        this.$block = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8410c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8410c cVar) {
        C19383o.m32797g(cVar, "$this$onDrawWithContent");
        this.$block.invoke(cVar);
        cVar.mo6911O0();
    }
}
