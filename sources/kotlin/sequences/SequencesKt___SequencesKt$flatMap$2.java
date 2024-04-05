package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

final /* synthetic */ class SequencesKt___SequencesKt$flatMap$2 extends FunctionReferenceImpl implements C19857l<C19431g<Object>, Iterator<Object>> {
    public static final SequencesKt___SequencesKt$flatMap$2 INSTANCE = new SequencesKt___SequencesKt$flatMap$2();

    public SequencesKt___SequencesKt$flatMap$2() {
        super(1, C19431g.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    public final Iterator<Object> invoke(C19431g<Object> gVar) {
        C19383o.m32797g(gVar, "p0");
        return gVar.iterator();
    }
}
