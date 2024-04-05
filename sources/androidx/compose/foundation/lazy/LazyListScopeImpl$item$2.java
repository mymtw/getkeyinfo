package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class LazyListScopeImpl$item$2 extends Lambda implements C19857l<Integer, Object> {
    public final /* synthetic */ Object $contentType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListScopeImpl$item$2(Object obj) {
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
