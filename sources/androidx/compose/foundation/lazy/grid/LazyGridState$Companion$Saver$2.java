package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class LazyGridState$Companion$Saver$2 extends Lambda implements C19857l<List<? extends Integer>, LazyGridState> {
    public static final LazyGridState$Companion$Saver$2 INSTANCE = new LazyGridState$Companion$Saver$2();

    public LazyGridState$Companion$Saver$2() {
        super(1);
    }

    public final LazyGridState invoke(List<Integer> list) {
        C19383o.m32797g(list, "it");
        return new LazyGridState(list.get(0).intValue(), list.get(1).intValue());
    }
}
