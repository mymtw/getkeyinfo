package androidx.compose.foundation.layout;

import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class BoxWithConstraintsKt$BoxWithConstraints$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19862q<C0735g, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1428a $contentAlignment;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ boolean $propagateMinConstraints;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxWithConstraintsKt$BoxWithConstraints$2(C1436d dVar, C1428a aVar, boolean z, C19862q<? super C0735g, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$contentAlignment = aVar;
        this.$propagateMinConstraints = z;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        BoxWithConstraintsKt.m1460a(this.$modifier, this.$contentAlignment, this.$propagateMinConstraints, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
