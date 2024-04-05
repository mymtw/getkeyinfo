package com.etsy.android.p327ui.user;

import android.content.SharedPreferences;
import android.widget.CompoundButton;
import androidx.appcompat.app.C0156f;
import kotlin.jvm.internal.C19383o;
import p389lc.C13011b;

/* renamed from: com.etsy.android.ui.user.m */
public final /* synthetic */ class C11610m implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ SharedPreferences f25711b;

    /* renamed from: c */
    public final /* synthetic */ C13011b f25712c;

    public /* synthetic */ C11610m(SharedPreferences sharedPreferences, C13011b bVar) {
        this.f25711b = sharedPreferences;
        this.f25712c = bVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SharedPreferences sharedPreferences = this.f25711b;
        C13011b bVar = this.f25712c;
        C19383o.m32797g(sharedPreferences, "$prefs");
        C19383o.m32797g(bVar, "$darkModeTracker");
        if (z) {
            sharedPreferences.edit().putBoolean("dark_mode_preference", true).apply();
            C0156f.m490z(2);
            bVar.mo45808a(true);
            return;
        }
        sharedPreferences.edit().putBoolean("dark_mode_preference", false).apply();
        C0156f.m490z(1);
        bVar.mo45808a(false);
    }
}
