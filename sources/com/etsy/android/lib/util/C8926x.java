package com.etsy.android.lib.util;

import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;
import p568fn.C17782b;

/* renamed from: com.etsy.android.lib.util.x */
public final class C8926x {

    /* renamed from: a */
    public final PackageManager f19688a;

    /* renamed from: b */
    public final List<String> f19689b = C17782b.m29865e0("com.etsy.android.soe", "com.etsy.android.soe.alpha");

    public C8926x(PackageManager packageManager) {
        this.f19688a = packageManager;
    }

    /* renamed from: a */
    public final Intent mo30499a() {
        boolean z;
        Intent intent = null;
        for (String launchIntentForPackage : this.f19689b) {
            intent = this.f19688a.getLaunchIntentForPackage(launchIntentForPackage);
            if (intent != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return intent;
    }
}
