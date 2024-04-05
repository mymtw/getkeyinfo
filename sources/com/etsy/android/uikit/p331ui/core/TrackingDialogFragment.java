package com.etsy.android.uikit.p331ui.core;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.config.bucketing.NativeConfig;
import com.etsy.android.lib.logger.C8693g;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.uikit.ui.core.TrackingDialogFragment */
public abstract class TrackingDialogFragment extends DialogFragment implements C8693g {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final TrackingFragmentDelegate trackingDelegate = new TrackingFragmentDelegate(this);

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C8703p getAnalyticsContext() {
        C8703p pVar = this.trackingDelegate.f26437d;
        C19383o.m32796f(pVar, "trackingDelegate.analyticsContext");
        return pVar;
    }

    public Context getAndroidContext() {
        return this.trackingDelegate.getAndroidContext();
    }

    public C8623e getConfigMap() {
        C8623e eVar = this.trackingDelegate.f26437d.f19116n;
        C19383o.m32796f(eVar, "trackingDelegate.configMap");
        return eVar;
    }

    public String getDefaultName() {
        return this.trackingDelegate.getDefaultName();
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public String getTrackingName() {
        String trackingName = this.trackingDelegate.getTrackingName();
        C19383o.m32796f(trackingName, "trackingDelegate.trackingName");
        return trackingName;
    }

    public C8693g getTrackingParent() {
        return this.trackingDelegate.getTrackingParent();
    }

    public boolean isNativeFlagEnabled(NativeConfig nativeConfig) {
        C19383o.m32797g(nativeConfig, "nativeConfig");
        return this.trackingDelegate.f26437d.mo21331a(nativeConfig).f18927b;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.trackingDelegate.mo38417a(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        C8703p pVar = this.trackingDelegate.f26437d;
        if (pVar != null) {
            pVar.f19109g = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        C8703p pVar = this.trackingDelegate.f26437d;
        if (pVar != null) {
            pVar.f19109g = false;
            pVar.f19112j = false;
        }
    }

    public void onPause() {
        super.onPause();
        this.trackingDelegate.mo38418b();
    }

    public void onResume() {
        super.onResume();
        this.trackingDelegate.mo38419c();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        this.trackingDelegate.mo38420d(bundle);
    }

    public void onStop() {
        super.onStop();
        this.trackingDelegate.mo38421e();
    }

    public boolean shouldAutoTrack() {
        this.trackingDelegate.getClass();
        return true;
    }
}
