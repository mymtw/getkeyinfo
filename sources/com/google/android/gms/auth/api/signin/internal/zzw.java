package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import p564fj.C17737a;
import p588ij.C17842a;
import p588ij.C17846e;
import p588ij.C17849h;
import p588ij.C17852k;

public final class zzw extends zzr {
    private final Context mContext;

    public zzw(Context context) {
        this.mContext = context;
    }

    private final void zzl() {
        if (!GooglePlayServicesUtilLight.isGooglePlayServicesUid(this.mContext, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    public final void zzj() {
        zzl();
        C17842a a = C17842a.m29965a(this.mContext);
        GoogleSignInAccount b = a.mo69076b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (b != null) {
            googleSignInOptions = a.mo69077c();
        }
        GoogleApiClient build = new GoogleApiClient.Builder(this.mContext).addApi(C17737a.f38568a, googleSignInOptions).build();
        try {
            if (build.blockingConnect().isSuccess()) {
                if (b != null) {
                    C17737a.f38569b.getClass();
                    Context context = build.getContext();
                    C17846e.f38760a.mo49326d("Revoking access", new Object[0]);
                    C17842a.m29965a(context).mo69080g("refreshToken");
                    C17846e.m29974b(context);
                    build.execute(new C17849h(build));
                } else {
                    build.clearDefaultAccountAndReconnect();
                }
            }
        } finally {
            build.disconnect();
        }
    }

    public final void zzk() {
        zzl();
        C17852k.m29975b(this.mContext).mo69082a();
    }
}
