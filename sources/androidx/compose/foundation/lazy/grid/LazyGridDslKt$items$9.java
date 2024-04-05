package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class LazyGridDslKt$items$9 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ C19857l<Object, Object> $contentType;
    public final /* synthetic */ Object[] $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$items$9(C19857l<Object, ? extends Object> lVar, Object[] objArr) {
        super(1);
        this.$contentType = lVar;
        this.$items = objArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$contentType.invoke(this.$items[i]);
    }
}
