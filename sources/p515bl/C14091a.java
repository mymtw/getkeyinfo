package p515bl;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import p289y0.C8351c;

/* renamed from: bl.a */
public final class C14091a {

    /* renamed from: a */
    public static final int[] f31044a = {16842919};

    /* renamed from: b */
    public static final int[] f31045b = {16842913, 16842919};

    /* renamed from: c */
    public static final int[] f31046c = {16842913};

    /* renamed from: d */
    public static final int[] f31047d = {16842910, 16842919};

    /* renamed from: e */
    public static final String f31048e = C14091a.class.getSimpleName();

    /* renamed from: a */
    public static ColorStateList m21807a(ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{f31046c, StateSet.NOTHING}, new int[]{m21808b(colorStateList, f31045b), m21808b(colorStateList, f31044a)});
    }

    /* renamed from: b */
    public static int m21808b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return C8351c.m16666h(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    /* renamed from: c */
    public static ColorStateList m21809c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f31047d, 0)) != 0) {
            Log.w(f31048e, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: d */
    public static boolean m21810d(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
