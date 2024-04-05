package com.etsy.android.lib.p326ui;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.ui.DetailsBottomSheetDialogFragment */
public final class DetailsBottomSheetDialogFragment extends TrackingBottomSheetDialogFragment {
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
        View inflate = layoutInflater.inflate(R.layout.fragment_details_bottom_sheet, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.details_bottom_sheet_title);
        C19383o.m32796f(findViewById, "root.findViewById(R.id.details_bottom_sheet_title)");
        View findViewById2 = inflate.findViewById(R.id.details_bottom_sheet_body);
        C19383o.m32796f(findViewById2, "root.findViewById(R.id.details_bottom_sheet_body)");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(requireArguments().getString("title"));
        String string = requireArguments().getString(DetailsBottomSheetNavigationKey.PARAM_BODY);
        if (string != null) {
            textView.setText(Html.fromHtml(string, 63));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return inflate;
    }
}
