package androidx.compose.p015ui.window;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.C19383o;
import p514bk.C14088a;
import p568fn.C17782b;

/* renamed from: androidx.compose.ui.window.d */
public final class C2091d extends C14088a {
    /* renamed from: c */
    public final void mo7975c(View view, int i, int i2) {
        C19383o.m32797g(view, "composeView");
        view.setSystemGestureExclusionRects(C17782b.m29866f0(new Rect(0, 0, i, i2)));
    }
}
