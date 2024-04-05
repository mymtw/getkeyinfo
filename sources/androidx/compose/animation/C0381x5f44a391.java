package androidx.compose.animation;

import androidx.compose.animation.core.C0454t;
import androidx.compose.p015ui.platform.C1859o0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.animation.AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1 */
public final class C0381x5f44a391 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C0454t $animationSpec$inlined;
    public final /* synthetic */ C19861p $finishedListener$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0381x5f44a391(C0454t tVar, C19861p pVar) {
        super(1);
        this.$animationSpec$inlined = tVar;
        this.$finishedListener$inlined = pVar;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$animationSpec$inlined, "animationSpec");
        o0Var.f4114b.mo7222b(this.$finishedListener$inlined, "finishedListener");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
