package com.etsy.android.uikit.util;

import android.view.ViewTreeObserver;

/* renamed from: com.etsy.android.uikit.util.o */
public final class C11914o {
    /* renamed from: a */
    public static void m19629a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: b */
    public static void m19630b(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }
}
