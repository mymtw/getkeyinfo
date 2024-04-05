package androidx.compose.animation;

import androidx.compose.animation.core.C0418c0;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class AnimatedVisibilityKt$AnimatedVisibility$8 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19862q<C0468d, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C0473i $enter;
    public final /* synthetic */ C0475k $exit;
    public final /* synthetic */ String $label;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C0418c0<Boolean> $visibleState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibility$8(C0418c0<Boolean> c0Var, C1436d dVar, C0473i iVar, C0475k kVar, String str, C19862q<? super C0468d, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$visibleState = c0Var;
        this.$modifier = dVar;
        this.$enter = iVar;
        this.$exit = kVar;
        this.$label = str;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AnimatedVisibilityKt.m1026b(this.$visibleState, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
