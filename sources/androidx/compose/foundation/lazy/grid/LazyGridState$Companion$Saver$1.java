package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.saveable.C1375i;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19861p;

public final class LazyGridState$Companion$Saver$1 extends Lambda implements C19861p<C1375i, LazyGridState, List<? extends Integer>> {
    public static final LazyGridState$Companion$Saver$1 INSTANCE = new LazyGridState$Companion$Saver$1();

    public LazyGridState$Companion$Saver$1() {
        super(2);
    }

    public final List<Integer> invoke(C1375i iVar, LazyGridState lazyGridState) {
        C19383o.m32797g(iVar, "$this$listSaver");
        C19383o.m32797g(lazyGridState, "it");
        return C17782b.m29865e0(Integer.valueOf(lazyGridState.mo4313e()), Integer.valueOf(lazyGridState.mo4314f()));
    }
}
