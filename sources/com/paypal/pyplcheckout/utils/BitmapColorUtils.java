package com.paypal.pyplcheckout.utils;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p281x1.C8304b;
import p281x1.C8310c;
import p289y0.C8351c;
import p753kq.C19857l;

public final class BitmapColorUtils {
    public static final BitmapColorUtils INSTANCE = new BitmapColorUtils();
    private static final ConcurrentHashMap<String, Integer> contrastCache = new ConcurrentHashMap<>();

    private BitmapColorUtils() {
    }

    private final double calculateContrastRatio(int i, int i2) {
        if (Color.alpha(i) != 255) {
            return ShadowDrawableWrapper.COS_45;
        }
        if (Color.alpha(i2) < 255) {
            i2 = C8351c.m16664f(i2, i);
        }
        double calculateXyzLuma = ((double) calculateXyzLuma(i)) + 0.05d;
        double calculateXyzLuma2 = ((double) calculateXyzLuma(i2)) + 0.05d;
        return Math.max(calculateXyzLuma, calculateXyzLuma2) / Math.min(calculateXyzLuma, calculateXyzLuma2);
    }

    private final float calculateXyzLuma(int i) {
        float green = ((float) Color.green(i)) * 0.7152f;
        return ((((float) Color.blue(i)) * 0.0722f) + (green + (((float) Color.red(i)) * 0.2126f))) / 255.0f;
    }

    private final int getBestContrastingColorByWeight(int i, int i2, int i3, double d) {
        double calculateContrastRatio = calculateContrastRatio(i2, i) * d;
        if (calculateContrastRatio >= 4.5d) {
            return i2;
        }
        double calculateContrastRatio2 = calculateContrastRatio(i3, i);
        return (calculateContrastRatio < calculateContrastRatio2 && Math.abs(calculateContrastRatio - calculateContrastRatio2) >= 1.25d) ? i3 : i2;
    }

    public static /* synthetic */ int getBestContrastingColorByWeight$default(BitmapColorUtils bitmapColorUtils, int i, int i2, int i3, double d, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            d = 1.25d;
        }
        return bitmapColorUtils.getBestContrastingColorByWeight(i, i2, i3, d);
    }

    public static /* synthetic */ void getBestTextContrastingColor$default(BitmapColorUtils bitmapColorUtils, Bitmap bitmap, String str, int i, int i2, float f, float f2, boolean z, C19857l lVar, int i3, Object obj) {
        bitmapColorUtils.getBestTextContrastingColor(bitmap, (i3 & 2) != 0 ? null : str, i, i2, (i3 & 16) != 0 ? 0.25f : f, (i3 & 32) != 0 ? 0.4f : f2, (i3 & 64) != 0 ? false : z, lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: getBestTextContrastingColor$lambda-2  reason: not valid java name */
    public static final void m35462getBestTextContrastingColor$lambda2(int i, int i2, String str, C19857l lVar, C8304b bVar) {
        int i3;
        C19383o.m32797g(lVar, "$onComplete");
        if (bVar == null) {
            i3 = i;
        } else {
            C8304b.C8309e eVar = bVar.f18218e;
            i3 = eVar != null ? eVar.f18229d : i;
        }
        BitmapColorUtils bitmapColorUtils = INSTANCE;
        int i4 = bitmapColorUtils.isColorLight(i3) ? i2 : i;
        int bestContrastingColorByWeight$default = getBestContrastingColorByWeight$default(bitmapColorUtils, i3, i4, i4 == i ? i2 : i, ShadowDrawableWrapper.COS_45, 8, (Object) null);
        if (str != null) {
            contrastCache.put(str, Integer.valueOf(bestContrastingColorByWeight$default));
        }
        lVar.invoke(Integer.valueOf(bestContrastingColorByWeight$default));
    }

    private final Rect getBottomLeftRectByPercent(Bitmap bitmap, float f, float f2) {
        return new Rect(0, bitmap.getHeight() - ((int) (((float) bitmap.getHeight()) * f)), (int) (((float) bitmap.getWidth()) * f2), bitmap.getHeight());
    }

    private final boolean isColorLight(int i) {
        return calculateXyzLuma(i) > 0.9f;
    }

    public final void getBestTextContrastingColor(Bitmap bitmap, String str, int i, int i2, float f, float f2, boolean z, C19857l<? super Integer, C19394m> lVar) {
        C19383o.m32797g(bitmap, "bitmap");
        C19383o.m32797g(lVar, "onComplete");
        if (!z) {
            Integer num = str == null ? null : contrastCache.get(str);
            if (num != null) {
                lVar.invoke(num);
                return;
            }
        }
        Rect bottomLeftRectByPercent = getBottomLeftRectByPercent(bitmap, f, f2);
        int height = (bottomLeftRectByPercent.height() * bottomLeftRectByPercent.width()) / 5;
        if (height < 1000) {
            height = 1000;
        }
        C8304b.C8306b bVar = new C8304b.C8306b(bitmap);
        int i3 = bottomLeftRectByPercent.left;
        int i4 = bottomLeftRectByPercent.top;
        int i5 = bottomLeftRectByPercent.right;
        int i6 = bottomLeftRectByPercent.bottom;
        if (bVar.f18219a != null) {
            if (bVar.f18225g == null) {
                bVar.f18225g = new Rect();
            }
            bVar.f18225g.set(0, 0, bVar.f18219a.getWidth(), bVar.f18219a.getHeight());
            if (!bVar.f18225g.intersect(i3, i4, i5, i6)) {
                throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
            }
        }
        bVar.f18222d = height;
        bVar.f18223e = -1;
        new C8310c(bVar, new C17281a(i, i2, str, lVar)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{bVar.f18219a});
    }
}
