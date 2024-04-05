package p289y0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p280x0.C8286d;

/* renamed from: y0.h */
public class C8358h extends C8363m {

    /* renamed from: a */
    public static Class<?> f18330a = null;

    /* renamed from: b */
    public static Constructor<?> f18331b = null;

    /* renamed from: c */
    public static Method f18332c = null;

    /* renamed from: d */
    public static Method f18333d = null;

    /* renamed from: e */
    public static boolean f18334e = false;

    /* renamed from: f */
    public static boolean m16680f(Object obj, String str, int i, boolean z) {
        m16681g();
        try {
            return ((Boolean) f18332c.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public static void m16681g() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f18334e) {
            f18334e = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f18331b = constructor;
            f18330a = cls;
            f18332c = method;
            f18333d = method2;
        }
    }

    /* renamed from: a */
    public Typeface mo20944a(Context context, C8286d.C8288b bVar, Resources resources, int i) {
        m16681g();
        try {
            Object newInstance = f18331b.newInstance(new Object[0]);
            C8286d.C8289c[] cVarArr = bVar.f18159a;
            int length = cVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                C8286d.C8289c cVar = cVarArr[i2];
                File d = C8365n.m16711d(context);
                if (d == null) {
                    return null;
                }
                try {
                    if (!C8365n.m16709b(d, resources, cVar.f18165f)) {
                        d.delete();
                        return null;
                    } else if (!m16680f(newInstance, d.getPath(), cVar.f18161b, cVar.f18162c)) {
                        return null;
                    } else {
                        d.delete();
                        i2++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d.delete();
                }
            }
            m16681g();
            try {
                Object newInstance2 = Array.newInstance(f18330a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f18333d.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
