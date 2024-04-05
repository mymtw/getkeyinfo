package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19863r;

public final class AnimatedContentKt$AnimatedContent$8 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19863r<C0468d, S, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1428a $contentAlignment;
    public final /* synthetic */ C19857l<S, Object> $contentKey;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ Transition<S> $this_AnimatedContent;
    public final /* synthetic */ C19857l<AnimatedContentScope<S>, C0471g> $transitionSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$8(Transition<S> transition, C1436d dVar, C19857l<? super AnimatedContentScope<S>, C0471g> lVar, C1428a aVar, C19857l<? super S, ? extends Object> lVar2, C19863r<? super C0468d, ? super S, ? super C1302d, ? super Integer, C19394m> rVar, int i, int i2) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$modifier = dVar;
        this.$transitionSpec = lVar;
        this.$contentAlignment = aVar;
        this.$contentKey = lVar2;
        this.$content = rVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AnimatedContentKt.m1008a(this.$this_AnimatedContent, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$contentKey, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
