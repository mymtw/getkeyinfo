package androidx.compose.foundation.lazy.layout;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p753kq.C19861p;

public final class LazyLayoutKt$LazyLayout$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C0841d $itemProvider;
    public final /* synthetic */ C19861p<C0843f, C7280a, C1712w> $measurePolicy;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C0845h $prefetchState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$3(C0841d dVar, C1436d dVar2, C0845h hVar, C19861p<? super C0843f, ? super C7280a, ? extends C1712w> pVar, int i, int i2) {
        super(2);
        this.$itemProvider = dVar;
        this.$modifier = dVar2;
        this.$prefetchState = hVar;
        this.$measurePolicy = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        LazyLayoutKt.m1863a(this.$itemProvider, this.$modifier, this.$prefetchState, this.$measurePolicy, dVar, this.$$changed | 1, this.$$default);
    }
}
