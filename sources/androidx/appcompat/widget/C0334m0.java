package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p260v0.C8184a;
import p289y0.C8351c;
import p628nj.C18263b;

/* renamed from: androidx.appcompat.widget.m0 */
public final class C0334m0 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f855a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f856b = {-16842910};

    /* renamed from: c */
    public static final int[] f857c = {16842908};

    /* renamed from: d */
    public static final int[] f858d = {16842919};

    /* renamed from: e */
    public static final int[] f859e = {16842912};

    /* renamed from: f */
    public static final int[] f860f = new int[0];

    /* renamed from: g */
    public static final int[] f861g = new int[1];

    /* renamed from: a */
    public static void m882a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C18263b.f40080q);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m883b(Context context, int i) {
        ColorStateList d = m885d(context, i);
        if (d != null && d.isStateful()) {
            return d.getColorForState(f856b, d.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f855a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int c = m884c(context, i);
        return C8351c.m16666h(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: c */
    public static int m884c(Context context, int i) {
        int[] iArr = f861g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static ColorStateList m885d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f861g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = C8184a.m16459b(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
