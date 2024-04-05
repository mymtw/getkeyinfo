package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class LazyGridDslKt$itemsIndexed$4 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ C19861p<Integer, Object, Object> $contentType;
    public final /* synthetic */ List<Object> $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$itemsIndexed$4(C19861p<? super Integer, Object, ? extends Object> pVar, List<Object> list) {
        super(1);
        this.$contentType = pVar;
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$contentType.invoke(Integer.valueOf(i), this.$items.get(i));
    }
}
