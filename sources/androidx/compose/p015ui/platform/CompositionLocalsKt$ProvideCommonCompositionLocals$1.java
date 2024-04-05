package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.node.C1750p;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1 */
public final class CompositionLocalsKt$ProvideCommonCompositionLocals$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1750p $owner;
    public final /* synthetic */ C1828e1 $uriHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositionLocalsKt$ProvideCommonCompositionLocals$1(C1750p pVar, C1828e1 e1Var, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i) {
        super(2);
        this.$owner = pVar;
        this.$uriHandler = e1Var;
        this.$content = pVar2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        CompositionLocalsKt.m3939a(this.$owner, this.$uriHandler, this.$content, dVar, this.$$changed | 1);
    }
}
