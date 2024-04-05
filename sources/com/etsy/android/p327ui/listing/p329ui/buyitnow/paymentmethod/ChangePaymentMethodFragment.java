package com.etsy.android.p327ui.listing.p329ui.buyitnow.paymentmethod;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.NativeBuyItNowSubscreenFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.UiState;
import com.etsy.android.uikit.viewholder.ItemDividerDecoration;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.paymentmethod.ChangePaymentMethodFragment */
public final class ChangePaymentMethodFragment extends NativeBuyItNowSubscreenFragment {
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

    public void bind(UiState.Summary summary) {
        C19383o.m32797g(summary, "uiState");
        View requireView = requireView();
        RecyclerView recyclerView = (RecyclerView) requireView.findViewById(R.id.payment_method_list);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(new C10395a(summary.getAvailablePaymentMethods(), getDispatcher()));
        recyclerView.addItemDecoration(new ItemDividerDecoration(requireContext(), requireContext().getResources().getDimensionPixelSize(R.dimen.clg_space_16)));
        View findViewById = requireView.findViewById(R.id.add_new_payment_method);
        C19383o.m32796f(findViewById, "");
        ViewExtensions.m12866j(findViewById, new ChangePaymentMethodFragment$bind$1$2$1(this));
    }

    public int getLayoutId() {
        return R.layout.fragment_native_buy_it_now_change_payment_method;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }
}
