package com.etsy.android.lib.install;

import android.content.Context;
import android.content.SharedPreferences;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

public final class InstallPersistence {

    /* renamed from: a */
    public final Context f19034a;

    public InstallPersistence(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f19034a = context;
    }

    /* renamed from: a */
    public final String mo21280a() {
        SharedPreferences sharedPreferences = this.f19034a.getSharedPreferences("EtsyInstallPrefs", 0);
        C19383o.m32796f(sharedPreferences, "sp");
        InstallPersistence$getInstallationUUID$1 installPersistence$getInstallationUUID$1 = InstallPersistence$getInstallationUUID$1.INSTANCE;
        C19383o.m32797g(installPersistence$getInstallationUUID$1, "defaultValue");
        String string = sharedPreferences.getString("EtsyUUID", (String) null);
        if (string != null) {
            return string;
        }
        String str = (String) installPersistence$getInstallationUUID$1.invoke();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C19383o.m32796f(edit, "editor");
        edit.putString("EtsyUUID", str);
        edit.apply();
        return str;
    }
}
