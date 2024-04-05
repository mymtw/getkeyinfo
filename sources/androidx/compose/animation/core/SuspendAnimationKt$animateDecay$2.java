package androidx.compose.animation.core;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class SuspendAnimationKt$animateDecay$2 extends Lambda implements C19857l<C0419d<Float, C0426g>, C19394m> {
    public final /* synthetic */ C19861p<Float, Float, C19394m> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animateDecay$2(C19861p<? super Float, ? super Float, C19394m> pVar) {
        super(1);
        this.$block = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C0419d<Float, C0426g>) (C0419d) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C0419d<Float, C0426g> dVar) {
        C19383o.m32797g(dVar, "$this$animate");
        this.$block.invoke(dVar.mo3481b(), Float.valueOf(((C0426g) dVar.f1101f).f1116a));
    }
}
