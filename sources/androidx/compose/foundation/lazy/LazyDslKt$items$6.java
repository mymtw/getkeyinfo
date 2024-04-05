package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class LazyDslKt$items$6 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ Object[] $items;
    public final /* synthetic */ C19857l<Object, Object> $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$items$6(C19857l<Object, ? extends Object> lVar, Object[] objArr) {
        super(1);
        this.$key = lVar;
        this.$items = objArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$key.invoke(this.$items[i]);
    }
}
