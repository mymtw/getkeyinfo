package kotlin.sequences;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.lang3.ClassUtils;
import p753kq.C19857l;

final class SequencesKt___SequencesKt$requireNoNulls$1 extends Lambda implements C19857l<Object, Object> {
    public final /* synthetic */ C19431g<Object> $this_requireNoNulls;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$requireNoNulls$1(C19431g<Object> gVar) {
        super(1);
        this.$this_requireNoNulls = gVar;
    }

    public final Object invoke(Object obj) {
        if (obj != null) {
            return obj;
        }
        StringBuilder h = C0072d.m201h("null element found in ");
        h.append(this.$this_requireNoNulls);
        h.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
        throw new IllegalArgumentException(h.toString());
    }
}
