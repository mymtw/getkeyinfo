package com.etsy.android.p327ui.estimateddelivery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.estimateddelivery.EstimatedDeliveryDateLegaleseVariantDialogFragment */
public final class EstimatedDeliveryDateLegaleseVariantDialogFragment extends TrackingBottomSheetDialogFragment {
    public static final int $stable = 8;
    public static final C9734a Companion = new C9734a();
    public static final String SHOW_UPGRADED_SHIPPING = "show_upgraded_shipping";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    /* renamed from: com.etsy.android.ui.estimateddelivery.EstimatedDeliveryDateLegaleseVariantDialogFragment$a */
    public static final class C9734a {
    }

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
        return layoutInflater.inflate(R.layout.estimated_delivery_date_legalese_variant_fragment, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean(SHOW_UPGRADED_SHIPPING, false);
        }
        View findViewById = view.findViewById(R.id.upgraded_shipping);
        if (z) {
            ViewExtensions.m12869m(findViewById);
        } else {
            ViewExtensions.m12860d(findViewById);
        }
    }
}
