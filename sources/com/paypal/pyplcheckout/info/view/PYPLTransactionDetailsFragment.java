package com.paypal.pyplcheckout.info.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C2870k0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.info.model.TransactionDetailsContentPageConfig;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PYPLTransactionDetailsFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PYPLTransactionDetailsFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private RelativeLayout transactionDetailsBodyContainer;
    private LinearLayout transactionDetailsBottomSheetLayout;
    private RelativeLayout transactionDetailsHeaderContainer;
    private BottomSheetBehavior<?> transactionDetailsSheetBottomBehavior;
    private TransactionDetailsContentPageConfig transactionDetailsViewContentPageConfig;
    private MainPaysheetViewModel viewModel;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PYPLTransactionDetailsFragment newInstance() {
            return new PYPLTransactionDetailsFragment();
        }
    }

    static {
        Class<PYPLTransactionDetailsFragment> cls = PYPLTransactionDetailsFragment.class;
    }

    private final void attachContainerViews() {
        TransactionDetailsContentPageConfig transactionDetailsContentPageConfig = this.transactionDetailsViewContentPageConfig;
        if (transactionDetailsContentPageConfig != null) {
            List<ContentView> headerContentViewsList = transactionDetailsContentPageConfig.getHeaderContentViewsList();
            C19383o.m32796f(headerContentViewsList, "transactionDetailsViewCo…ig.headerContentViewsList");
            RelativeLayout relativeLayout = this.transactionDetailsHeaderContainer;
            if (relativeLayout != null) {
                attachContentViewsToContainer(headerContentViewsList, relativeLayout);
                TransactionDetailsContentPageConfig transactionDetailsContentPageConfig2 = this.transactionDetailsViewContentPageConfig;
                if (transactionDetailsContentPageConfig2 != null) {
                    List<ContentView> bodyContentViewsList = transactionDetailsContentPageConfig2.getBodyContentViewsList();
                    C19383o.m32796f(bodyContentViewsList, "transactionDetailsViewCo…nfig.bodyContentViewsList");
                    RelativeLayout relativeLayout2 = this.transactionDetailsBodyContainer;
                    if (relativeLayout2 != null) {
                        attachContentViewsToContainer(bodyContentViewsList, relativeLayout2);
                    } else {
                        C19383o.m32805o("transactionDetailsBodyContainer");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("transactionDetailsViewContentPageConfig");
                    throw null;
                }
            } else {
                C19383o.m32805o("transactionDetailsHeaderContainer");
                throw null;
            }
        } else {
            C19383o.m32805o("transactionDetailsViewContentPageConfig");
            throw null;
        }
    }

    private final void bindViews(View view) {
        View findViewById = view.findViewById(C17165R.C17167id.transactionDetailsBottomSheetLayout);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.t…DetailsBottomSheetLayout)");
        this.transactionDetailsBottomSheetLayout = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.header_container);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.header_container)");
        this.transactionDetailsHeaderContainer = (RelativeLayout) findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.body_container);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.body_container)");
        this.transactionDetailsBodyContainer = (RelativeLayout) findViewById3;
    }

    public static final PYPLTransactionDetailsFragment newInstance() {
        return Companion.newInstance();
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

    public final void init() {
        Context context = getContext();
        if (context != null) {
            this.transactionDetailsViewContentPageConfig = new TransactionDetailsContentPageConfig(context, this, DebugConfigManager.getInstance().getPayPalTransactionDetailsHeaderViewListener(), DebugConfigManager.getInstance().getTransactionDetailsContentPage());
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.viewModel = (MainPaysheetViewModel) new C2870k0(requireActivity()).mo10829a(MainPaysheetViewModel.class);
        init();
        attachContainerViews();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17165R.C17169layout.fragment_pypl_transaction_details, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        bindViews(inflate);
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
