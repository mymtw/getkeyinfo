package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.C2021q;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class ClickableTextKt$ClickableText$2$1 extends Lambda implements C19857l<C2021q, C19394m> {
    public final /* synthetic */ C1338j0<C2021q> $layoutResult;
    public final /* synthetic */ C19857l<C2021q, C19394m> $onTextLayout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$2$1(C1338j0<C2021q> j0Var, C19857l<? super C2021q, C19394m> lVar) {
        super(1);
        this.$layoutResult = j0Var;
        this.$onTextLayout = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C2021q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C2021q qVar) {
        C19383o.m32797g(qVar, "it");
        this.$layoutResult.setValue(qVar);
        this.$onTextLayout.invoke(qVar);
    }
}
