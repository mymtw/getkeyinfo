package kotlin.sequences;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.lang3.ClassUtils;
import p753kq.C19857l;

public final class SequencesKt___SequencesKt$elementAt$1 extends Lambda implements C19857l<Integer, T> {
    public final /* synthetic */ int $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$elementAt$1(int i) {
        super(1);
        this.$index = i;
    }

    public final T invoke(int i) {
        throw new IndexOutOfBoundsException(C0073e.m208h(C0072d.m201h("Sequence doesn't contain element at index "), this.$index, ClassUtils.PACKAGE_SEPARATOR_CHAR));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
