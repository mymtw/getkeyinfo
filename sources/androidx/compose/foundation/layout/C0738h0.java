package androidx.compose.foundation.layout;

import android.view.ViewConfiguration;

/* renamed from: androidx.compose.foundation.layout.h0 */
public final class C0738h0 {

    /* renamed from: a */
    public static final float f1502a = ViewConfiguration.getScrollFriction();

    /* renamed from: b */
    public static final double f1503b;

    /* renamed from: c */
    public static final double f1504c;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        f1503b = log;
        f1504c = log - 1.0d;
    }
}
