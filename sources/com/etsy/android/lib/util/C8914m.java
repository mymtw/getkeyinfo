package com.etsy.android.lib.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;
import com.etsy.android.R;

/* renamed from: com.etsy.android.lib.util.m */
public final class C8914m {

    /* renamed from: c */
    public static float f19669c;

    /* renamed from: a */
    public final DisplayMetrics f19670a;

    /* renamed from: b */
    public final WindowManager f19671b;

    public C8914m(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f19671b = windowManager;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f19670a = displayMetrics;
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        if (f19669c == 0.0f) {
            m17348f(context);
        }
    }

    /* renamed from: a */
    public static int m17343a(Activity activity) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        if (activity.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, displayMetrics);
        }
        return 0;
    }

    /* renamed from: b */
    public static int m17344b(Resources resources) {
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m17345c(Context context) {
        return context.getResources().getBoolean(R.bool.width_720);
    }

    /* renamed from: d */
    public static boolean m17346d(Activity activity) {
        return (activity.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: e */
    public static boolean m17347e(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: f */
    public static void m17348f(Context context) {
        f19669c = context.getResources().getDisplayMetrics().density;
    }
}
