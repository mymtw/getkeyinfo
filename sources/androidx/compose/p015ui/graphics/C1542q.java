package androidx.compose.p015ui.graphics;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.graphics.q */
public final class C1542q {

    /* renamed from: a */
    public static Method f3352a;

    /* renamed from: b */
    public static Method f3353b;

    /* renamed from: c */
    public static boolean f3354c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: a */
    public static void m3352a(Canvas canvas, boolean z) {
        Method method;
        C19383o.m32797g(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C1544r.f3356a.mo6397a(canvas, z);
            return;
        }
        if (!f3354c) {
            if (i == 28) {
                Class<Class> cls = Class.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                    f3352a = (Method) declaredMethod.invoke(Canvas.class, new Object[]{"insertReorderBarrier", new Class[0]});
                    f3353b = (Method) declaredMethod.invoke(Canvas.class, new Object[]{"insertInorderBarrier", new Class[0]});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } else {
                f3352a = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f3353b = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
            }
            Method method2 = f3352a;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            Method method3 = f3353b;
            if (method3 != null) {
                method3.setAccessible(true);
            }
            f3354c = true;
        }
        if (z) {
            try {
                Method method4 = f3352a;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = f3353b) != null) {
            method.invoke(canvas, new Object[0]);
        }
    }
}
