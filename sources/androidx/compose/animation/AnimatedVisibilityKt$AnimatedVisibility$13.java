package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

public final class AnimatedVisibilityKt$AnimatedVisibility$13 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19862q<C0468d, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C0473i $enter;
    public final /* synthetic */ C0475k $exit;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ Transition<T> $this_AnimatedVisibility;
    public final /* synthetic */ C19857l<T, Boolean> $visible;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$13(Transition<T> transition, C19857l<? super T, Boolean> lVar, C1436d dVar, C0473i iVar, C0475k kVar, C19862q<? super C0468d, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$this_AnimatedVisibility = transition;
        this.$visible = lVar;
        this.$modifier = dVar;
        this.$enter = iVar;
        this.$exit = kVar;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AnimatedVisibilityKt.m1027c(this.$this_AnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
