package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class FlowKt__DelayKt$debounce$2 extends Lambda implements C19857l<Object, Long> {
    public final /* synthetic */ long $timeoutMillis;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounce$2(long j) {
        super(1);
        this.$timeoutMillis = j;
    }

    public final Long invoke(Object obj) {
        return Long.valueOf(this.$timeoutMillis);
    }
}
