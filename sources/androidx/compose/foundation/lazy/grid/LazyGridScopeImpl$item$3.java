package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class LazyGridScopeImpl$item$3 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ Object $contentType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridScopeImpl$item$3(Object obj) {
        super(1);
        this.$contentType = obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Object invoke(int i) {
        return this.$contentType;
    }
}
