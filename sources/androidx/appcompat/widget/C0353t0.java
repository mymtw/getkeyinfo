package androidx.appcompat.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.widget.t0 */
public final class C0353t0 {

    /* renamed from: a */
    public static Method f934a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            f934a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f934a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: a */
    public static boolean m961a(View view) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return C2364y.C2369e.m5233d(view) == 1;
    }
}
