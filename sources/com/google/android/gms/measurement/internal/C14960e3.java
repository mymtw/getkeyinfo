package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* renamed from: com.google.android.gms.measurement.internal.e3 */
public final class C14960e3 {

    /* renamed from: a */
    public final C15103u3 f33444a;

    public C14960e3(C14973f7 f7Var) {
        this.f33444a = f7Var.f33497m;
    }

    @VisibleForTesting
    /* renamed from: a */
    public final boolean mo51990a() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.f33444a.f33872b);
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f33444a.mo52016b().f33732o.mo52237a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f33444a.mo52016b().f33732o.mo52238b(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
