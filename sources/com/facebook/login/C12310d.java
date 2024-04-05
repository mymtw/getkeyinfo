package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.login.LoginClient;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p401mg.C13080a;
import p461uf.C13519m;

/* renamed from: com.facebook.login.d */
public final class C12310d {

    /* renamed from: d */
    public static final ScheduledExecutorService f27432d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    public final C13519m f27433a;

    /* renamed from: b */
    public String f27434b;

    /* renamed from: c */
    public String f27435c;

    public C12310d(Context context, String str) {
        PackageInfo packageInfo;
        this.f27434b = str;
        this.f27433a = new C13519m(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f27435c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: b */
    public static Bundle m20137b(String str) {
        Class<C12310d> cls = C12310d.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo39614a(String str, String str2) {
        if (!C13080a.m20762b(this)) {
            try {
                Bundle b = m20137b("");
                b.putString("2_result", LoginClient.Result.Code.ERROR.getLoggingValue());
                b.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                b.putString("3_method", str2);
                this.f27433a.mo46174a(b, str);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
