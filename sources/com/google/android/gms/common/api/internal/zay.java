package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import p193o.C7496d;

public class zay extends zal {
    private final C7496d<ApiKey<?>> zad;
    private final GoogleApiManager zae;

    private zay(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager) {
        this(lifecycleFragment, googleApiManager, GoogleApiAvailability.getInstance());
    }

    public static void zaa(Activity activity, GoogleApiManager googleApiManager, ApiKey<?> apiKey) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zay zay = (zay) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", zay.class);
        if (zay == null) {
            zay = new zay(fragment, googleApiManager);
        }
        Preconditions.checkNotNull(apiKey, "ApiKey cannot be null");
        zay.zad.add(apiKey);
        googleApiManager.zaa(zay);
    }

    private final void zad() {
        if (!this.zad.isEmpty()) {
            this.zae.zaa(this);
        }
    }

    public void onResume() {
        super.onResume();
        zad();
    }

    public void onStart() {
        super.onStart();
        zad();
    }

    public void onStop() {
        super.onStop();
        this.zae.zab(this);
    }

    public final C7496d<ApiKey<?>> zac() {
        return this.zad;
    }

    @VisibleForTesting
    private zay(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.zad = new C7496d<>();
        this.zae = googleApiManager;
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    public final void zaa(ConnectionResult connectionResult, int i) {
        this.zae.zab(connectionResult, i);
    }

    public final void zaa() {
        this.zae.zac();
    }
}
