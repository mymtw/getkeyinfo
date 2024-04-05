package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.compose.p015ui.text.input.C1993m;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C15697i;
import com.google.android.play.core.internal.C15710v;
import p614ll.C18199a;
import p689ul.C18617o;

/* renamed from: com.google.android.play.core.appupdate.p */
public final class C15574p {

    /* renamed from: e */
    public static final C15032m3 f35049e = new C15032m3("AppUpdateService");

    /* renamed from: f */
    public static final Intent f35050f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    public C15697i f35051a;

    /* renamed from: b */
    public final String f35052b;

    /* renamed from: c */
    public final Context f35053c;

    /* renamed from: d */
    public final C15576r f35054d;

    public C15574p(Context context, C15576r rVar) {
        this.f35052b = context.getPackageName();
        this.f35053c = context;
        this.f35054d = rVar;
        if (C15710v.m25542b(context)) {
            Context applicationContext = context.getApplicationContext();
            this.f35051a = new C15697i(applicationContext != null ? applicationContext : context, f35049e, "AppUpdateService", f35050f, C1993m.f4507v);
        }
    }

    /* renamed from: a */
    public static Bundle m25229a(C15574p pVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putAll(C18199a.m30698a("app_update"));
        bundle2.putInt("playcore.version.code", 11003);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(pVar.f35053c.getPackageManager().getPackageInfo(pVar.f35053c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f35049e.mo52243c("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public static C18617o m25230b() {
        f35049e.mo52243c("onError(%d)", -9);
        InstallException installException = new InstallException(-9);
        C18617o oVar = new C18617o();
        synchronized (oVar.f41106a) {
            if (!oVar.f41108c) {
                oVar.f41108c = true;
                oVar.f41110e = installException;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        oVar.f41107b.mo70124b(oVar);
        return oVar;
    }
}
