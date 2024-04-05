package androidx.compose.foundation.layout;

import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.platform.C1859o0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SizeKt$createWrapContentWidthModifier$2 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C1428a.C1430b $align;
    public final /* synthetic */ boolean $unbounded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$createWrapContentWidthModifier$2(C1428a.C1430b bVar, boolean z) {
        super(1);
        this.$align = bVar;
        this.$unbounded = z;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$$receiver");
        o0Var.f4114b.mo7222b(this.$align, "align");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$unbounded), "unbounded");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
