package kotlin.sequences;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SequencesKt___SequencesKt$onEach$1 extends Lambda implements C19857l<Object, Object> {
    public final /* synthetic */ C19857l<Object, C19394m> $action;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$onEach$1(C19857l<Object, C19394m> lVar) {
        super(1);
        this.$action = lVar;
    }

    public final Object invoke(Object obj) {
        this.$action.invoke(obj);
        return obj;
    }
}
