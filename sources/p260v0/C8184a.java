package p260v0;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.util.WeakHashMap;
import p280x0.C8284b;
import p280x0.C8292f;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: v0.a */
public class C8184a {

    /* renamed from: a */
    public static final Object f17966a = new Object();

    /* renamed from: b */
    public static final Object f17967b = new Object();

    /* renamed from: v0.a$a */
    public static class C8185a {
        /* renamed from: a */
        public static void m16460a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        public static void m16461b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: v0.a$b */
    public static class C8186b {
        /* renamed from: a */
        public static File[] m16462a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        public static File[] m16463b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        public static File[] m16464c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: v0.a$c */
    public static class C8187c {
        /* renamed from: a */
        public static File m16465a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        public static Drawable m16466b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        public static File m16467c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: v0.a$d */
    public static class C8188d {
        /* renamed from: a */
        public static int m16468a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        public static <T> T m16469b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: c */
        public static String m16470c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: v0.a$e */
    public static class C8189e {
        /* renamed from: a */
        public static Context m16471a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        public static File m16472b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        public static boolean m16473c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: v0.a$f */
    public static class C8190f {
        /* renamed from: a */
        public static ComponentName m16474a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: a */
    public static int m16458a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* renamed from: b */
    public static ColorStateList m16459b(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C8292f.C8293a aVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C8292f.C8294b bVar = new C8292f.C8294b(resources, theme);
        synchronized (C8292f.f18174c) {
            SparseArray sparseArray = C8292f.f18173b.get(bVar);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = (C8292f.C8293a) sparseArray.get(i)) == null)) {
                if (aVar.f18176b.equals(resources.getConfiguration())) {
                    colorStateList2 = aVar.f18175a;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = C8292f.f18172a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        if (!z) {
            try {
                colorStateList = C8284b.m16575a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (C8292f.f18174c) {
            WeakHashMap<C8292f.C8294b, SparseArray<C8292f.C8293a>> weakHashMap = C8292f.f18173b;
            SparseArray sparseArray2 = weakHashMap.get(bVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(bVar, sparseArray2);
            }
            sparseArray2.append(i, new C8292f.C8293a(colorStateList, bVar.f18177a.getConfiguration()));
        }
        return colorStateList;
    }
}
