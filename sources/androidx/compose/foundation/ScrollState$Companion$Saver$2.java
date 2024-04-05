package androidx.compose.foundation;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ScrollState$Companion$Saver$2 extends Lambda implements C19857l<Integer, ScrollState> {
    public static final ScrollState$Companion$Saver$2 INSTANCE = new ScrollState$Companion$Saver$2();

    public ScrollState$Companion$Saver$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final ScrollState invoke(int i) {
        return new ScrollState(i);
    }
}
