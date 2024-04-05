package androidx.compose.material;

import androidx.compose.runtime.saveable.C1375i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class SwipeableState$Companion$Saver$1 extends Lambda implements C19861p<C1375i, SwipeableState<Object>, Object> {
    public static final SwipeableState$Companion$Saver$1 INSTANCE = new SwipeableState$Companion$Saver$1();

    public SwipeableState$Companion$Saver$1() {
        super(2);
    }

    public final Object invoke(C1375i iVar, SwipeableState<Object> swipeableState) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(swipeableState, "it");
        return swipeableState.mo5116d();
    }
}
