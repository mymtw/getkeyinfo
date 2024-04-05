package androidx.compose.p015ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.compose.p015ui.graphics.colorspace.C1505c;
import androidx.compose.p015ui.graphics.colorspace.ColorSpaces;
import com.google.android.play.core.appupdate.C15562d;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.graphics.i */
public final class C1525i {
    /* renamed from: a */
    public static final C1505c m3301a(Bitmap bitmap) {
        C1505c b;
        C19383o.m32797g(bitmap, "<this>");
        ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null && (b = m3302b(colorSpace)) != null) {
            return b;
        }
        float[] fArr = ColorSpaces.f3224a;
        return ColorSpaces.f3226c;
    }

    /* renamed from: b */
    public static final C1505c m3302b(ColorSpace colorSpace) {
        C19383o.m32797g(colorSpace, "<this>");
        return C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.SRGB)) ? ColorSpaces.f3226c : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.ACES)) ? ColorSpaces.f3238o : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.ACESCG)) ? ColorSpaces.f3239p : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.ADOBE_RGB)) ? ColorSpaces.f3236m : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.BT2020)) ? ColorSpaces.f3231h : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.BT709)) ? ColorSpaces.f3230g : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_LAB)) ? ColorSpaces.f3241r : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_XYZ)) ? ColorSpaces.f3240q : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.DCI_P3)) ? ColorSpaces.f3232i : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.DISPLAY_P3)) ? ColorSpaces.f3233j : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB)) ? ColorSpaces.f3228e : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB)) ? ColorSpaces.f3229f : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_SRGB)) ? ColorSpaces.f3227d : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.NTSC_1953)) ? ColorSpaces.f3234k : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB)) ? ColorSpaces.f3237n : C19383o.m32792b(colorSpace, ColorSpace.get(ColorSpace.Named.SMPTE_C)) ? ColorSpaces.f3235l : ColorSpaces.f3226c;
    }

    /* renamed from: c */
    public static final Bitmap m3303c(int i, int i2, int i3, boolean z, C1505c cVar) {
        C19383o.m32797g(cVar, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, C15562d.m25186X(i3), z, m3304d(cVar));
        C19383o.m32796f(createBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return createBitmap;
    }

    /* renamed from: d */
    public static final ColorSpace m3304d(C1505c cVar) {
        C19383o.m32797g(cVar, "<this>");
        ColorSpace colorSpace = ColorSpace.get(C19383o.m32792b(cVar, ColorSpaces.f3226c) ? ColorSpace.Named.SRGB : C19383o.m32792b(cVar, ColorSpaces.f3238o) ? ColorSpace.Named.ACES : C19383o.m32792b(cVar, ColorSpaces.f3239p) ? ColorSpace.Named.ACESCG : C19383o.m32792b(cVar, ColorSpaces.f3236m) ? ColorSpace.Named.ADOBE_RGB : C19383o.m32792b(cVar, ColorSpaces.f3231h) ? ColorSpace.Named.BT2020 : C19383o.m32792b(cVar, ColorSpaces.f3230g) ? ColorSpace.Named.BT709 : C19383o.m32792b(cVar, ColorSpaces.f3241r) ? ColorSpace.Named.CIE_LAB : C19383o.m32792b(cVar, ColorSpaces.f3240q) ? ColorSpace.Named.CIE_XYZ : C19383o.m32792b(cVar, ColorSpaces.f3232i) ? ColorSpace.Named.DCI_P3 : C19383o.m32792b(cVar, ColorSpaces.f3233j) ? ColorSpace.Named.DISPLAY_P3 : C19383o.m32792b(cVar, ColorSpaces.f3228e) ? ColorSpace.Named.EXTENDED_SRGB : C19383o.m32792b(cVar, ColorSpaces.f3229f) ? ColorSpace.Named.LINEAR_EXTENDED_SRGB : C19383o.m32792b(cVar, ColorSpaces.f3227d) ? ColorSpace.Named.LINEAR_SRGB : C19383o.m32792b(cVar, ColorSpaces.f3234k) ? ColorSpace.Named.NTSC_1953 : C19383o.m32792b(cVar, ColorSpaces.f3237n) ? ColorSpace.Named.PRO_PHOTO_RGB : C19383o.m32792b(cVar, ColorSpaces.f3235l) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB);
        C19383o.m32796f(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }
}
