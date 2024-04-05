package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1 */
final class C0783x8bcdbb9d extends Lambda implements C19857l<Integer, Integer> {
    public final /* synthetic */ List<C0814p> $positionedItems;
    public final /* synthetic */ LazyGridItemPlacementAnimator $this_run;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0783x8bcdbb9d(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, List<C0814p> list) {
        super(1);
        this.$this_run = lazyGridItemPlacementAnimator;
        this.$positionedItems = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Integer invoke(int i) {
        int i2;
        if (this.$this_run.f1636b) {
            i2 = this.$positionedItems.get(i).f1724e;
        } else {
            i2 = this.$positionedItems.get(i).f1725f;
        }
        return Integer.valueOf(i2);
    }
}
