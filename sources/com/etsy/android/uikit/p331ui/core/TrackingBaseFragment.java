package com.etsy.android.uikit.p331ui.core;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.config.bucketing.NativeConfig;
import com.etsy.android.lib.logger.C8693g;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;

/* renamed from: com.etsy.android.uikit.ui.core.TrackingBaseFragment */
public abstract class TrackingBaseFragment extends BaseFragment implements C8693g {
    private TrackingFragmentDelegate mTrackingDelegate = new TrackingFragmentDelegate(this);

    public C8703p getAnalyticsContext() {
        return this.mTrackingDelegate.f26437d;
    }

    public Context getAndroidContext() {
        return this.mTrackingDelegate.getAndroidContext();
    }

    public C8623e getConfigMap() {
        return this.mTrackingDelegate.f26437d.f19116n;
    }

    public final String getDefaultName() {
        return this.mTrackingDelegate.getDefaultName();
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public String getTrackingName() {
        return this.mTrackingDelegate.getTrackingName();
    }

    public C8693g getTrackingParent() {
        return this.mTrackingDelegate.getTrackingParent();
    }

    public boolean isNativeFlagEnabled(NativeConfig nativeConfig) {
        return this.mTrackingDelegate.f26437d.mo21331a(nativeConfig).f18927b;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        C8703p pVar = this.mTrackingDelegate.f26437d;
        if (pVar != null && !pVar.f19110h) {
            pVar.f19112j = true;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mTrackingDelegate.mo38417a(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        C8703p pVar = this.mTrackingDelegate.f26437d;
        if (pVar != null) {
            pVar.f19109g = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        C8703p pVar = this.mTrackingDelegate.f26437d;
        if (pVar != null) {
            pVar.f19109g = false;
            pVar.f19112j = false;
        }
    }

    public void onPause() {
        super.onPause();
        this.mTrackingDelegate.mo38418b();
    }

    public void onResume() {
        super.onResume();
        this.mTrackingDelegate.mo38419c();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.mTrackingDelegate.mo38420d(bundle);
    }

    public void onStop() {
        super.onStop();
        this.mTrackingDelegate.mo38421e();
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.mTrackingDelegate.mo38422f(z);
    }

    public boolean shouldAutoTrack() {
        this.mTrackingDelegate.getClass();
        return true;
    }
}
