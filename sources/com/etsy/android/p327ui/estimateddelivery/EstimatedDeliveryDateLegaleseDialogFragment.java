package com.etsy.android.p327ui.estimateddelivery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.estimateddelivery.EstimatedDeliveryDateLegaleseDialogFragment */
public final class EstimatedDeliveryDateLegaleseDialogFragment extends TrackingBottomSheetDialogFragment {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

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

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.estimated_delivery_date_legalese_fragment, viewGroup, false);
    }
}
