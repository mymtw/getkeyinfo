package androidx.compose.foundation;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1 extends Lambda implements C19846a<Float> {
    public final /* synthetic */ ScrollState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1(ScrollState scrollState) {
        super(0);
        this.$state = scrollState;
    }

    public final Float invoke() {
        return Float.valueOf((float) this.$state.mo3693e());
    }
}
