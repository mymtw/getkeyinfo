package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class LazyGridScopeImpl$item$1$1 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ Object $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridScopeImpl$item$1$1(Object obj) {
        super(1);
        this.$key = obj;
    }

    public final Object invoke(int i) {
        return this.$key;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
