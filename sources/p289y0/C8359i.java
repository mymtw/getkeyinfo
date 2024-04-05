package p289y0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p021b1.C3464l;
import p280x0.C8286d;

/* renamed from: y0.i */
public class C8359i extends C8358h {

    /* renamed from: f */
    public final Class<?> f18335f;

    /* renamed from: g */
    public final Constructor<?> f18336g;

    /* renamed from: h */
    public final Method f18337h;

    /* renamed from: i */
    public final Method f18338i;

    /* renamed from: j */
    public final Method f18339j;

    /* renamed from: k */
    public final Method f18340k;

    /* renamed from: l */
    public final Method f18341l;

    public C8359i() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = m16683l(cls2);
            method2 = m16684m(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = mo20951n(cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder h = C0072d.m201h("Unable to collect necessary methods for class ");
            h.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", h.toString(), e);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f18335f = cls;
        this.f18336g = constructor;
        this.f18337h = method3;
        this.f18338i = method2;
        this.f18339j = method;
        this.f18340k = method4;
        this.f18341l = method5;
    }

    /* renamed from: l */
    public static Method m16683l(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* renamed from: m */
    public static Method m16684m(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* renamed from: a */
    public final Typeface mo20944a(Context context, C8286d.C8288b bVar, Resources resources, int i) {
        Object obj;
        if (!mo20950k()) {
            return super.mo20944a(context, bVar, resources, i);
        }
        try {
            obj = this.f18336g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C8286d.C8289c cVar : bVar.f18159a) {
            if (!mo20947h(context, obj, cVar.f18160a, cVar.f18164e, cVar.f18161b, cVar.f18162c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f18163d))) {
                try {
                    this.f18340k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!mo20949j(obj)) {
            return null;
        }
        return mo20948i(obj);
    }

    /* renamed from: b */
    public final Typeface mo20945b(Context context, C3464l[] lVarArr, int i) {
        Object obj;
        Typeface i2;
        boolean z;
        ParcelFileDescriptor openFileDescriptor;
        if (lVarArr.length < 1) {
            return null;
        }
        if (!mo20950k()) {
            C3464l e = mo20952e(i, lVarArr);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(e.f8079a, "r", (CancellationSignal) null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(e.f8081c).setItalic(e.f8082d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (C3464l lVar : lVarArr) {
                if (lVar.f8083e == 0) {
                    Uri uri = lVar.f8079a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, C8365n.m16712e(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f18336g.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            boolean z2 = false;
            for (C3464l lVar2 : lVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar2.f8079a);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.f18338i.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(lVar2.f8080b), null, Integer.valueOf(lVar2.f8081c), Integer.valueOf(lVar2.f8082d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z = false;
                    }
                    if (!z) {
                        try {
                            this.f18340k.invoke(obj, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                        }
                        return null;
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                try {
                    this.f18340k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused5) {
                }
                return null;
            } else if (mo20949j(obj) && (i2 = mo20948i(obj)) != null) {
                return Typeface.create(i2, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    /* renamed from: c */
    public final Typeface mo20946c(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        if (!mo20950k()) {
            return super.mo20946c(context, resources, i, str, i2);
        }
        try {
            obj = this.f18336g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!mo20947h(context, obj, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            try {
                this.f18340k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!mo20949j(obj)) {
            return null;
        } else {
            return mo20948i(obj);
        }
    }

    /* renamed from: h */
    public final boolean mo20947h(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f18337h.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public Typeface mo20948i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f18335f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f18341l.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public final boolean mo20949j(Object obj) {
        try {
            return ((Boolean) this.f18339j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: k */
    public final boolean mo20950k() {
        if (this.f18337h == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f18337h != null;
    }

    /* renamed from: n */
    public Method mo20951n(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
