package androidx.compose.animation;

import androidx.compose.p015ui.layout.C1681g;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class AnimatedContentMeasurePolicy$maxIntrinsicWidth$1 extends Lambda implements C19857l<C1681g, Integer> {
    public final /* synthetic */ int $height;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentMeasurePolicy$maxIntrinsicWidth$1(int i) {
        super(1);
        this.$height = i;
    }

    public final Integer invoke(C1681g gVar) {
        C19383o.m32797g(gVar, "it");
        return Integer.valueOf(gVar.mo6664D(this.$height));
    }
}
