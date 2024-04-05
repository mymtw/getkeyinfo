package kotlin.sequences;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p753kq.C19857l;

final class SequencesKt___SequencesKt$minus$1$iterator$1 extends Lambda implements C19857l<Object, Boolean> {
    public final /* synthetic */ Object $element;
    public final /* synthetic */ Ref$BooleanRef $removed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$minus$1$iterator$1(Ref$BooleanRef ref$BooleanRef, Object obj) {
        super(1);
        this.$removed = ref$BooleanRef;
        this.$element = obj;
    }

    public final Boolean invoke(Object obj) {
        boolean z = true;
        if (!this.$removed.element && C19383o.m32792b(obj, this.$element)) {
            this.$removed.element = true;
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
