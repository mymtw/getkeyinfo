package kotlin.sequences;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

final class SequencesKt__SequencesKt$generateSequence$1 extends Lambda implements C19857l<Object, Object> {
    public final /* synthetic */ C19846a<Object> $nextFunction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$generateSequence$1(C19846a<Object> aVar) {
        super(1);
        this.$nextFunction = aVar;
    }

    public final Object invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        return this.$nextFunction.invoke();
    }
}
