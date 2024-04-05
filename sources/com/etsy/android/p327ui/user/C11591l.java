package com.etsy.android.p327ui.user;

import android.content.SharedPreferences;
import android.widget.PopupWindow;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.l */
public final /* synthetic */ class C11591l implements PopupWindow.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ SharedPreferences f25677b;

    public /* synthetic */ C11591l(SharedPreferences sharedPreferences) {
        this.f25677b = sharedPreferences;
    }

    public final void onDismiss() {
        SharedPreferences sharedPreferences = this.f25677b;
        C19383o.m32797g(sharedPreferences, "$prefs");
        sharedPreferences.edit().putBoolean("dark_mode_tooltip_shown", true).apply();
    }
}
