package p628nj;

import dalvik.system.PathClassLoader;

/* renamed from: nj.c */
public final class C18264c extends PathClassLoader {
    public C18264c(ClassLoader classLoader, String str) {
        super(str, classLoader);
    }

    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
