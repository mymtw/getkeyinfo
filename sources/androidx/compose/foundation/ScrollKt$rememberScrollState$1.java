package androidx.compose.foundation;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ScrollKt$rememberScrollState$1 extends Lambda implements C19846a<ScrollState> {
    public final /* synthetic */ int $initial;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollKt$rememberScrollState$1(int i) {
        super(0);
        this.$initial = i;
    }

    public final ScrollState invoke() {
        return new ScrollState(this.$initial);
    }
}
