package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SequencesKt__SequencesKt$flatten$2 extends Lambda implements C19857l<Iterable<Object>, Iterator<Object>> {
    public static final SequencesKt__SequencesKt$flatten$2 INSTANCE = new SequencesKt__SequencesKt$flatten$2();

    public SequencesKt__SequencesKt$flatten$2() {
        super(1);
    }

    public final Iterator<Object> invoke(Iterable<Object> iterable) {
        C19383o.m32797g(iterable, "it");
        return iterable.iterator();
    }
}
