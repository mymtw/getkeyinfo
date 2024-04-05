package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SequencesKt___SequencesJvmKt$filterIsInstance$1 extends Lambda implements C19857l<Object, Boolean> {
    public final /* synthetic */ Class<Object> $klass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesJvmKt$filterIsInstance$1(Class<Object> cls) {
        super(1);
        this.$klass = cls;
    }

    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(this.$klass.isInstance(obj));
    }
}
