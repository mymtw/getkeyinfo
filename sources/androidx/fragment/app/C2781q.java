package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p010a9.C0048b;
import p193o.C7506i;

/* renamed from: androidx.fragment.app.q */
public class C2781q {

    /* renamed from: a */
    public static final C7506i<ClassLoader, C7506i<String, Class<?>>> f6332a = new C7506i<>();

    /* renamed from: b */
    public static Class<?> m6662b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C7506i<ClassLoader, C7506i<String, Class<?>>> iVar = f6332a;
        C7506i orDefault = iVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new C7506i();
            iVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    /* renamed from: c */
    public static Class<? extends Fragment> m6663c(ClassLoader classLoader, String str) {
        try {
            return m6662b(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.InstantiationException(C0048b.m163a("Unable to instantiate fragment ", str, ": make sure class name exists"), e);
        } catch (ClassCastException e2) {
            throw new Fragment.InstantiationException(C0048b.m163a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        }
    }

    /* renamed from: a */
    public Fragment mo10411a(ClassLoader classLoader, String str) {
        throw null;
    }
}
