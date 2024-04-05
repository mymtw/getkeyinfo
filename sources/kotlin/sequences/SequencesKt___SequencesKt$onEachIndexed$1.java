package kotlin.sequences;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class SequencesKt___SequencesKt$onEachIndexed$1 extends Lambda implements C19861p<Integer, Object, Object> {
    public final /* synthetic */ C19861p<Integer, Object, C19394m> $action;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$onEachIndexed$1(C19861p<? super Integer, Object, C19394m> pVar) {
        super(2);
        this.$action = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), obj2);
    }

    public final Object invoke(int i, Object obj) {
        this.$action.invoke(Integer.valueOf(i), obj);
        return obj;
    }
}
