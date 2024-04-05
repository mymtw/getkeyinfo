package androidx.compose.foundation;

import androidx.compose.runtime.saveable.C1375i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class ScrollState$Companion$Saver$1 extends Lambda implements C19861p<C1375i, ScrollState, Integer> {
    public static final ScrollState$Companion$Saver$1 INSTANCE = new ScrollState$Companion$Saver$1();

    public ScrollState$Companion$Saver$1() {
        super(2);
    }

    public final Integer invoke(C1375i iVar, ScrollState scrollState) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(scrollState, "it");
        return Integer.valueOf(scrollState.mo3693e());
    }
}
