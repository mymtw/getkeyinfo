package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class LazyDslKt$itemsIndexed$7 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ C19861p<Integer, Object, Object> $contentType;
    public final /* synthetic */ Object[] $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$itemsIndexed$7(C19861p<? super Integer, Object, ? extends Object> pVar, Object[] objArr) {
        super(1);
        this.$contentType = pVar;
        this.$items = objArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$contentType.invoke(Integer.valueOf(i), this.$items[i]);
    }
}
