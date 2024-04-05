package kotlin.sequences;

import kotlin.collections.C19331x;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class SequencesKt___SequencesKt$filterIndexed$1 extends Lambda implements C19857l<C19331x<Object>, Boolean> {
    public final /* synthetic */ C19861p<Integer, Object, Boolean> $predicate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$filterIndexed$1(C19861p<? super Integer, Object, Boolean> pVar) {
        super(1);
        this.$predicate = pVar;
    }

    public final Boolean invoke(C19331x<Object> xVar) {
        C19383o.m32797g(xVar, "it");
        return this.$predicate.invoke(Integer.valueOf(xVar.f43190a), xVar.f43191b);
    }
}
