package androidx.compose.foundation.lazy;

import androidx.compose.runtime.saveable.C1375i;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19861p;

public final class LazyListState$Companion$Saver$1 extends Lambda implements C19861p<C1375i, LazyListState, List<? extends Integer>> {
    public static final LazyListState$Companion$Saver$1 INSTANCE = new LazyListState$Companion$Saver$1();

    public LazyListState$Companion$Saver$1() {
        super(2);
    }

    public final List<Integer> invoke(C1375i iVar, LazyListState lazyListState) {
        C19383o.m32797g(iVar, "$this$listSaver");
        C19383o.m32797g(lazyListState, "it");
        return C17782b.m29865e0(Integer.valueOf(lazyListState.mo4224e()), Integer.valueOf(lazyListState.mo4225f()));
    }
}
