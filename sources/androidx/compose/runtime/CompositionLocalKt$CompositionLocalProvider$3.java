package androidx.compose.runtime;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class CompositionLocalKt$CompositionLocalProvider$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1343l $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositionLocalKt$CompositionLocalProvider$3(C1343l lVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C19383o.m32797g((Object) null, ResponseConstants.CONTEXT);
        throw null;
    }
}
