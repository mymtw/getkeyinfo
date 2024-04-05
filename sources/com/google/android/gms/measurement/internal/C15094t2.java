package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.t2 */
public final class C15094t2 extends C14928a7 {
    public C15094t2(C14973f7 f7Var) {
        super(f7Var);
    }

    /* renamed from: j */
    public final void mo51944j() {
    }

    /* renamed from: k */
    public final boolean mo52315k() {
        mo51942h();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C15103u3) this.f33681b).f33872b.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
