package kotlin.sequences;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SequencesKt___SequencesKt$minus$4$iterator$1 extends Lambda implements C19857l<Object, Boolean> {
    public final /* synthetic */ Collection<Object> $other;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$minus$4$iterator$1(Collection<Object> collection) {
        super(1);
        this.$other = collection;
    }

    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(this.$other.contains(obj));
    }
}
