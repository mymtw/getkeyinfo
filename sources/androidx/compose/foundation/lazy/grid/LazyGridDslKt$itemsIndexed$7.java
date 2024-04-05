package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class LazyGridDslKt$itemsIndexed$7 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ Object[] $items;
    public final /* synthetic */ C19861p<Integer, Object, Object> $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$itemsIndexed$7(C19861p<? super Integer, Object, ? extends Object> pVar, Object[] objArr) {
        super(1);
        this.$key = pVar;
        this.$items = objArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$key.invoke(Integer.valueOf(i), this.$items[i]);
    }
}
