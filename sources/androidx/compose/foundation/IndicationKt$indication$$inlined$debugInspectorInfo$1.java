package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.p015ui.platform.C1859o0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class IndicationKt$indication$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C0871p $indication$inlined;
    public final /* synthetic */ C0639i $interactionSource$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndicationKt$indication$$inlined$debugInspectorInfo$1(C0871p pVar, C0639i iVar) {
        super(1);
        this.$indication$inlined = pVar;
        this.$interactionSource$inlined = iVar;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$indication$inlined, "indication");
        o0Var.f4114b.mo7222b(this.$interactionSource$inlined, "interactionSource");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
