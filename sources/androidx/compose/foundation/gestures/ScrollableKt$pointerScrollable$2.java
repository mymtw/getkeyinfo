package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.C1644p;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class ScrollableKt$pointerScrollable$2 extends Lambda implements C19857l<C1644p, Boolean> {
    public static final ScrollableKt$pointerScrollable$2 INSTANCE = new ScrollableKt$pointerScrollable$2();

    public ScrollableKt$pointerScrollable$2() {
        super(1);
    }

    public final Boolean invoke(C1644p pVar) {
        C19383o.m32797g(pVar, "down");
        return Boolean.valueOf(!(pVar.f3663h == 2));
    }
}
