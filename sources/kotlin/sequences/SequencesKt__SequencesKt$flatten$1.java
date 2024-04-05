package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SequencesKt__SequencesKt$flatten$1 extends Lambda implements C19857l<C19431g<Object>, Iterator<Object>> {
    public static final SequencesKt__SequencesKt$flatten$1 INSTANCE = new SequencesKt__SequencesKt$flatten$1();

    public SequencesKt__SequencesKt$flatten$1() {
        super(1);
    }

    public final Iterator<Object> invoke(C19431g<Object> gVar) {
        C19383o.m32797g(gVar, "it");
        return gVar.iterator();
    }
}
