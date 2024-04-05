package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ Object[] $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(Object[] objArr) {
        super(1);
        this.$items = objArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        Object obj = this.$items[i];
        return null;
    }
}
