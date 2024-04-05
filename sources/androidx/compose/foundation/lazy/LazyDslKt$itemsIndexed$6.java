package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class LazyDslKt$itemsIndexed$6 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ Object[] $items;
    public final /* synthetic */ C19861p<Integer, Object, Object> $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$itemsIndexed$6(C19861p<? super Integer, Object, ? extends Object> pVar, Object[] objArr) {
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
