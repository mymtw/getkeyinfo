package p667rn;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: rn.c */
public final class C18501c extends C18500b {

    /* renamed from: d */
    public static Class f40740d;

    /* renamed from: b */
    public final Object f40741b;

    /* renamed from: c */
    public final Field f40742c;

    public C18501c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f40740d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get((Object) null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f40741b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f40742c = field;
    }

    /* renamed from: a */
    public final void mo70008a(AccessibleObject accessibleObject) {
        boolean z = false;
        if (!(this.f40741b == null || this.f40742c == null)) {
            try {
                f40740d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f40741b, new Object[]{accessibleObject, Long.valueOf(((Long) f40740d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f40741b, new Object[]{this.f40742c})).longValue()), Boolean.TRUE});
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }
}
