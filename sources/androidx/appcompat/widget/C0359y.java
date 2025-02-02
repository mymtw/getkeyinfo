package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p298z0.C8419c;

/* renamed from: androidx.appcompat.widget.y */
public final class C0359y {

    /* renamed from: a */
    public static final int[] f935a = {16842912};

    /* renamed from: b */
    public static final int[] f936b = new int[0];

    /* renamed from: c */
    public static final Rect f937c = new Rect();

    /* renamed from: androidx.appcompat.widget.y$a */
    public static class C0360a {

        /* renamed from: a */
        public static final boolean f938a;

        /* renamed from: b */
        public static final Method f939b;

        /* renamed from: c */
        public static final Field f940c;

        /* renamed from: d */
        public static final Field f941d;

        /* renamed from: e */
        public static final Field f942e;

        /* renamed from: f */
        public static final Field f943f;

        /* JADX WARNING: Removed duplicated region for block: B:43:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch:{ NoSuchMethodException -> 0x0039, ClassNotFoundException -> 0x0037, NoSuchFieldException -> 0x0035 }
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch:{ NoSuchMethodException -> 0x0033, ClassNotFoundException -> 0x0031, NoSuchFieldException -> 0x002f }
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x002d }
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x0047 }
                r8 = r0
                goto L_0x0049
            L_0x002d:
                r7 = r2
                goto L_0x0047
            L_0x002f:
                r6 = r2
                goto L_0x0046
            L_0x0031:
                r6 = r2
                goto L_0x0046
            L_0x0033:
                r6 = r2
                goto L_0x0046
            L_0x0035:
                r5 = r2
                goto L_0x003d
            L_0x0037:
                r5 = r2
                goto L_0x0041
            L_0x0039:
                r5 = r2
                goto L_0x0045
            L_0x003b:
                r4 = r2
                r5 = r4
            L_0x003d:
                r6 = r5
                goto L_0x0046
            L_0x003f:
                r4 = r2
                r5 = r4
            L_0x0041:
                r6 = r5
                goto L_0x0046
            L_0x0043:
                r4 = r2
                r5 = r4
            L_0x0045:
                r6 = r5
            L_0x0046:
                r7 = r6
            L_0x0047:
                r8 = r1
                r3 = r2
            L_0x0049:
                if (r8 == 0) goto L_0x0058
                f939b = r4
                f940c = r5
                f941d = r6
                f942e = r7
                f943f = r3
                f938a = r0
                goto L_0x0064
            L_0x0058:
                f939b = r2
                f940c = r2
                f941d = r2
                f942e = r2
                f943f = r2
                f938a = r1
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0359y.C0360a.<clinit>():void");
        }
    }

    /* renamed from: androidx.appcompat.widget.y$b */
    public static class C0361b {
        /* renamed from: a */
        public static Insets m998a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* renamed from: a */
    public static boolean m994a(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m994a(a)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof C8419c) {
            return m994a(((C8419c) drawable).mo21005a());
        } else {
            if (drawable instanceof DrawableWrapper) {
                return m994a(((DrawableWrapper) drawable).getWrappedDrawable());
            }
            if (drawable instanceof ScaleDrawable) {
                return m994a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* renamed from: b */
    public static void m995b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(f935a);
            } else {
                drawable.setState(f936b);
            }
            drawable.setState(state);
        }
    }

    /* renamed from: c */
    public static Rect m996c(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets a = C0361b.m998a(drawable);
            return new Rect(a.left, a.top, a.right, a.bottom);
        }
        if (drawable instanceof C8419c) {
            drawable = ((C8419c) drawable).mo21005a();
        }
        if (i >= 29) {
            boolean z = C0360a.f938a;
        } else if (C0360a.f938a) {
            try {
                Object invoke = C0360a.f939b.invoke(drawable, new Object[0]);
                if (invoke != null) {
                    return new Rect(C0360a.f940c.getInt(invoke), C0360a.f941d.getInt(invoke), C0360a.f942e.getInt(invoke), C0360a.f943f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f937c;
    }

    /* renamed from: d */
    public static PorterDuff.Mode m997d(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
