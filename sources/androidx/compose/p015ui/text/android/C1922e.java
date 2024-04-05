package androidx.compose.p015ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.e */
public final class C1922e {
    /* renamed from: a */
    public static final void m4216a(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        C19383o.m32797g(paint, "paint");
        C19383o.m32797g(charSequence, "text");
        C19383o.m32797g(rect, "rect");
        paint.getTextBounds(charSequence, i, i2, rect);
    }
}
