package androidx.compose.animation.core;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class SuspendAnimationKt$animate$3 extends Lambda implements C19857l<C0419d<Object, Object>, C19394m> {
    public final /* synthetic */ C19861p<Object, Object, C19394m> $block;
    public final /* synthetic */ C0435k0<Object, Object> $typeConverter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$3(C19861p<Object, Object, C19394m> pVar, C0435k0<Object, Object> k0Var) {
        super(1);
        this.$block = pVar;
        this.$typeConverter = k0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C0419d<Object, Object>) (C0419d) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C0419d<Object, Object> dVar) {
        C19383o.m32797g(dVar, "$this$animate");
        this.$block.invoke(dVar.mo3481b(), this.$typeConverter.mo3510b().invoke(dVar.f1101f));
    }
}
