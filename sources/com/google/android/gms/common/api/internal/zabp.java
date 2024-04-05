package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;
import p605kk.C18123g;
import p605kk.C18124h;

public class zabp extends zal {
    private C18124h<Void> zad = new C18124h<>();

    private zabp(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    public static zabp zaa(Activity activity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zabp zabp = (zabp) fragment.getCallbackOrNull("GmsAvailabilityHelper", zabp.class);
        if (zabp == null) {
            return new zabp(fragment);
        }
        if (zabp.zad.f39566a.mo69667n()) {
            zabp.zad = new C18124h<>();
        }
        return zabp;
    }

    public void onDestroy() {
        super.onDestroy();
        this.zad.mo69679c(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public final C18123g<Void> zac() {
        return this.zad.f39566a;
    }

    public final void zaa(ConnectionResult connectionResult, int i) {
        String errorMessage = connectionResult.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "Error connecting to Google Play services";
        }
        this.zad.mo69677a(new ApiException(new Status(connectionResult, errorMessage, connectionResult.getErrorCode())));
    }

    public final void zaa() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        if (lifecycleActivity == null) {
            this.zad.mo69679c(new ApiException(new Status(8)));
            return;
        }
        int isGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(lifecycleActivity);
        if (isGooglePlayServicesAvailable == 0) {
            this.zad.mo69680d(null);
        } else if (!this.zad.f39566a.mo69667n()) {
            zab(new ConnectionResult(isGooglePlayServicesAvailable, (PendingIntent) null), 0);
        }
    }
}
