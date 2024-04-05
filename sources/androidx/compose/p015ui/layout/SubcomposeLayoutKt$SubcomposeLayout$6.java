package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$6 */
public final class SubcomposeLayoutKt$SubcomposeLayout$6 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1696m0, C7280a, C1712w> $measurePolicy;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ SubcomposeLayoutState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$6(SubcomposeLayoutState subcomposeLayoutState, C1436d dVar, C19861p<? super C1696m0, ? super C7280a, ? extends C1712w> pVar, int i, int i2) {
        super(2);
        this.$state = subcomposeLayoutState;
        this.$modifier = dVar;
        this.$measurePolicy = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SubcomposeLayoutKt.m3532b(this.$state, this.$modifier, this.$measurePolicy, dVar, this.$$changed | 1, this.$$default);
    }
}
