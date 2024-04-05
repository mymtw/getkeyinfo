package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class LazyListState$Companion$Saver$2 extends Lambda implements C19857l<List<? extends Integer>, LazyListState> {
    public static final LazyListState$Companion$Saver$2 INSTANCE = new LazyListState$Companion$Saver$2();

    public LazyListState$Companion$Saver$2() {
        super(1);
    }

    public final LazyListState invoke(List<Integer> list) {
        C19383o.m32797g(list, "it");
        return new LazyListState(list.get(0).intValue(), list.get(1).intValue());
    }
}
