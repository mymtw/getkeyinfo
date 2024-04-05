package androidx.compose.animation;

import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class CrossfadeKt$Crossfade$4$1$alpha$2 extends Lambda implements C19862q<Transition.C0402b<T>, C1302d, Integer, C0454t<Float>> {
    public final /* synthetic */ C0454t<Float> $animationSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$4$1$alpha$2(C0454t<Float> tVar) {
        super(3);
        this.$animationSpec = tVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.C0402b) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C0454t<Float> invoke(Transition.C0402b<T> bVar, C1302d dVar, int i) {
        C19383o.m32797g(bVar, "$this$animateFloat");
        dVar.mo5465u(438406499);
        C0454t<Float> tVar = this.$animationSpec;
        dVar.mo5406H();
        return tVar;
    }
}
