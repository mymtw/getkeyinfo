package com.etsy.android.lib.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.network.d0 */
public final class C8728d0 implements C8726c0 {

    /* renamed from: a */
    public final Context f19173a;

    /* renamed from: b */
    public final SharedPreferences f19174b;

    public C8728d0(Context context) {
        this.f19173a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getString(R.string.config_preferences_file_name), 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f19174b = sharedPreferences;
    }

    /* renamed from: a */
    public final String mo29946a() {
        String string = this.f19174b.getString(this.f19173a.getString(R.string.config_prefs_xdebug_ide), "phpstorm");
        return string == null ? "phpstorm" : string;
    }

    public final boolean isActive() {
        return this.f19174b.getBoolean(this.f19173a.getString(R.string.config_prefs_xdebug_toggle), false);
    }
}
