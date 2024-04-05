package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SequencesKt___SequencesKt$filterNotNull$1 extends Lambda implements C19857l<Object, Boolean> {
    public static final SequencesKt___SequencesKt$filterNotNull$1 INSTANCE = new SequencesKt___SequencesKt$filterNotNull$1();

    public SequencesKt___SequencesKt$filterNotNull$1() {
        super(1);
    }

    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj == null);
    }
}
