package androidx.compose.animation;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class EnterExitTransitionKt$slideInVertically$1 extends Lambda implements C19857l<Integer, Integer> {
    public static final EnterExitTransitionKt$slideInVertically$1 INSTANCE = new EnterExitTransitionKt$slideInVertically$1();

    public EnterExitTransitionKt$slideInVertically$1() {
        super(1);
    }

    public final Integer invoke(int i) {
        return Integer.valueOf((-i) / 2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
