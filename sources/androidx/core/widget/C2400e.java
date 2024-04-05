package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import p002a1.C0006a;

/* renamed from: androidx.core.widget.e */
public final class C2400e {

    /* renamed from: androidx.core.widget.e$a */
    public static class C2401a {
        /* renamed from: a */
        public static EdgeEffect m5351a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m5352b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m5353c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static float m5349a(EdgeEffect edgeEffect) {
        if (C0006a.m80a()) {
            return C2401a.m5352b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m5350b(EdgeEffect edgeEffect, float f, float f2) {
        if (C0006a.m80a()) {
            return C2401a.m5353c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }
}
