package p597jl;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.C0326j;
import p003a2.C0023f;

/* renamed from: jl.v */
public final class C18035v {

    /* renamed from: a */
    public static final RectF f39454a = new RectF();

    /* renamed from: a */
    public static View m30471a(int i, View view) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(C0326j.m864i(resourceName, " is not a valid ancestor"));
    }

    /* renamed from: b */
    public static RectF m30472b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF((float) i, (float) i2, (float) (view.getWidth() + i), (float) (view.getHeight() + i2));
    }

    /* renamed from: c */
    public static float m30473c(float f, float f2, float f3, float f4, float f5, boolean z) {
        return (!z || (f5 >= 0.0f && f5 <= 1.0f)) ? f5 < f3 ? f : f5 > f4 ? f2 : C0023f.m103b(f2, f, (f5 - f3) / (f4 - f3), f) : C0023f.m103b(f2, f, f5, f);
    }

    /* renamed from: d */
    public static int m30474d(float f, float f2, float f3, int i, int i2) {
        if (f3 < f) {
            return i;
        }
        if (f3 > f2) {
            return i2;
        }
        float f4 = (float) i;
        return (int) C0023f.m103b((float) i2, f4, (f3 - f) / (f2 - f), f4);
    }
}
