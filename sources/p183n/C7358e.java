package p183n;

import android.graphics.drawable.Drawable;

/* renamed from: n.e */
public final class C7358e extends Drawable {

    /* renamed from: a */
    public static final double f16383a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    public static final /* synthetic */ int f16384b = 0;

    /* renamed from: a */
    public static float m14159a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f16383a) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
