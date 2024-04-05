package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class CrossfadeKt$Crossfade$3$1 extends Lambda implements C19857l<T, Boolean> {
    public final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$3$1(Transition<T> transition) {
        super(1);
        this.$this_Crossfade = transition;
    }

    public final Boolean invoke(T t) {
        return Boolean.valueOf(!C19383o.m32792b(t, this.$this_Crossfade.mo3412d()));
    }
}
