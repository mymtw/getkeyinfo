package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

final /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$1 extends FunctionReferenceImpl implements C19857l<Iterable<Object>, Iterator<Object>> {
    public static final SequencesKt___SequencesKt$flatMapIndexed$1 INSTANCE = new SequencesKt___SequencesKt$flatMapIndexed$1();

    public SequencesKt___SequencesKt$flatMapIndexed$1() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    public final Iterator<Object> invoke(Iterable<Object> iterable) {
        C19383o.m32797g(iterable, "p0");
        return iterable.iterator();
    }
}
