package androidx.compose.animation;

import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

public final class CrossfadeKt$Crossfade$6 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C0454t<Float> $animationSpec;
    public final /* synthetic */ C19862q<T, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C19857l<T, Object> $contentKey;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$6(Transition<T> transition, C1436d dVar, C0454t<Float> tVar, C19857l<? super T, ? extends Object> lVar, C19862q<? super T, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$this_Crossfade = transition;
        this.$modifier = dVar;
        this.$animationSpec = tVar;
        this.$contentKey = lVar;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        CrossfadeKt.m1031a(this.$this_Crossfade, this.$modifier, this.$animationSpec, this.$contentKey, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
