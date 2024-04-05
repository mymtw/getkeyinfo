package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class LazyGridScrollingKt$calculateLineAverageMainAxisSize$lineOf$1 extends Lambda implements C19857l<Integer, Integer> {
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ List<C0805g> $visibleItems;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridScrollingKt$calculateLineAverageMainAxisSize$lineOf$1(boolean z, List<? extends C0805g> list) {
        super(1);
        this.$isVertical = z;
        this.$visibleItems = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Integer invoke(int i) {
        return Integer.valueOf(this.$isVertical ? this.$visibleItems.get(i).mo4340b() : this.$visibleItems.get(i).mo4341c());
    }
}
