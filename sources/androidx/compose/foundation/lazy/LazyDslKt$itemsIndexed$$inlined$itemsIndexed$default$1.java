package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(List list) {
        super(1);
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        this.$items.get(i);
        return null;
    }
}
