package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class LazyGridDslKt$items$2 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ List<Object> $items;
    public final /* synthetic */ C19857l<Object, Object> $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$items$2(C19857l<Object, ? extends Object> lVar, List<Object> list) {
        super(1);
        this.$key = lVar;
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$key.invoke(this.$items.get(i));
    }
}
