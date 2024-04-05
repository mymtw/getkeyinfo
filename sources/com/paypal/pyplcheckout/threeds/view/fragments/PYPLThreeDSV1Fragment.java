package com.paypal.pyplcheckout.threeds.view.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C2870k0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.threeds.model.PayPalThreeDSV1ViewContentPageConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PYPLThreeDSV1Fragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PYPLThreeDSV1Fragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private PayPalThreeDSV1ViewContentPageConfig payPalThreeDSV1ViewContentPageConfig;
    private RelativeLayout threeDSBodyContainer;
    private FrameLayout threeDSBottomSheetLayout;
    private RelativeLayout threeDSFooterContainer;
    private RelativeLayout threeDSHeaderContainer;
    /* access modifiers changed from: private */
    public BottomSheetBehavior<?> threeDSSheetBottomBehavior;
    private MainPaysheetViewModel viewModel;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PYPLThreeDSV1Fragment newInstance() {
            return new PYPLThreeDSV1Fragment();
        }
    }

    static {
        Class<PYPLThreeDSV1Fragment> cls = PYPLThreeDSV1Fragment.class;
    }

    private final void addBottomSheetCallbacks() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.threeDSSheetBottomBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new PYPLThreeDSV1Fragment$addBottomSheetCallbacks$1(this));
        } else {
            C19383o.m32805o("threeDSSheetBottomBehavior");
            throw null;
        }
    }

    private final void attachContainerViews() {
        PayPalThreeDSV1ViewContentPageConfig payPalThreeDSV1ViewContentPageConfig2 = this.payPalThreeDSV1ViewContentPageConfig;
        if (payPalThreeDSV1ViewContentPageConfig2 != null) {
            List<ContentView> headerContentViewsList = payPalThreeDSV1ViewContentPageConfig2.getHeaderContentViewsList();
            C19383o.m32796f(headerContentViewsList, "payPalThreeDSV1ViewConte…ig.headerContentViewsList");
            RelativeLayout relativeLayout = this.threeDSHeaderContainer;
            if (relativeLayout != null) {
                attachContentViewsToContainer(headerContentViewsList, relativeLayout);
                PayPalThreeDSV1ViewContentPageConfig payPalThreeDSV1ViewContentPageConfig3 = this.payPalThreeDSV1ViewContentPageConfig;
                if (payPalThreeDSV1ViewContentPageConfig3 != null) {
                    List<ContentView> bodyContentViewsList = payPalThreeDSV1ViewContentPageConfig3.getBodyContentViewsList();
                    C19383o.m32796f(bodyContentViewsList, "payPalThreeDSV1ViewConte…nfig.bodyContentViewsList");
                    RelativeLayout relativeLayout2 = this.threeDSBodyContainer;
                    if (relativeLayout2 != null) {
                        attachContentViewsToContainer(bodyContentViewsList, relativeLayout2);
                        PayPalThreeDSV1ViewContentPageConfig payPalThreeDSV1ViewContentPageConfig4 = this.payPalThreeDSV1ViewContentPageConfig;
                        if (payPalThreeDSV1ViewContentPageConfig4 != null) {
                            List<ContentView> footerContentViewsList = payPalThreeDSV1ViewContentPageConfig4.getFooterContentViewsList();
                            C19383o.m32796f(footerContentViewsList, "payPalThreeDSV1ViewConte…ig.footerContentViewsList");
                            RelativeLayout relativeLayout3 = this.threeDSFooterContainer;
                            if (relativeLayout3 != null) {
                                attachContentViewsToContainer(footerContentViewsList, relativeLayout3);
                            } else {
                                C19383o.m32805o("threeDSFooterContainer");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("payPalThreeDSV1ViewContentPageConfig");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("threeDSBodyContainer");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("payPalThreeDSV1ViewContentPageConfig");
                    throw null;
                }
            } else {
                C19383o.m32805o("threeDSHeaderContainer");
                throw null;
            }
        } else {
            C19383o.m32805o("payPalThreeDSV1ViewContentPageConfig");
            throw null;
        }
    }

    private final void bindViews(View view) {
        View findViewById = view.findViewById(C17165R.C17167id.three_ds_bottom_sheet_layout);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.t…e_ds_bottom_sheet_layout)");
        this.threeDSBottomSheetLayout = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.header_container);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.header_container)");
        this.threeDSHeaderContainer = (RelativeLayout) findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.body_container);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.body_container)");
        this.threeDSBodyContainer = (RelativeLayout) findViewById3;
        View findViewById4 = view.findViewById(C17165R.C17167id.footer_container);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.footer_container)");
        this.threeDSFooterContainer = (RelativeLayout) findViewById4;
    }

    private final void init() {
        Context context = getContext();
        if (context != null) {
            this.payPalThreeDSV1ViewContentPageConfig = new PayPalThreeDSV1ViewContentPageConfig(context, this, DebugConfigManager.getInstance().getThreeDSContentPageListener(), DebugConfigManager.getInstance().getThreeDSContentPage());
        }
    }

    public static final PYPLThreeDSV1Fragment newInstance() {
        return Companion.newInstance();
    }

    private final void setUpBottomSheetBehaviour() {
        AutoCloseBottomSheetBehavior.Companion companion = AutoCloseBottomSheetBehavior.Companion;
        FrameLayout frameLayout = this.threeDSBottomSheetLayout;
        if (frameLayout != null) {
            BottomSheetBehavior<?> from$default = AutoCloseBottomSheetBehavior.Companion.from$default(companion, frameLayout, getOnOutsidePaysheetClick(), (AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener) null, 4, (Object) null);
            this.threeDSSheetBottomBehavior = from$default;
            if (from$default != null) {
                from$default.setHideable(false);
                BottomSheetBehavior<?> bottomSheetBehavior = this.threeDSSheetBottomBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                } else {
                    C19383o.m32805o("threeDSSheetBottomBehavior");
                    throw null;
                }
            } else {
                C19383o.m32805o("threeDSSheetBottomBehavior");
                throw null;
            }
        } else {
            C19383o.m32805o("threeDSBottomSheetLayout");
            throw null;
        }
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

    public String getViewId() {
        return TAG;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.viewModel = (MainPaysheetViewModel) new C2870k0(requireActivity()).mo10829a(MainPaysheetViewModel.class);
        init();
        attachContainerViews();
        setUpBottomSheetBehaviour();
        addBottomSheetCallbacks();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17165R.C17169layout.pypl_three_ds_fragment, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        bindViews(inflate);
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        PayPalThreeDSV1ViewContentPageConfig payPalThreeDSV1ViewContentPageConfig2 = this.payPalThreeDSV1ViewContentPageConfig;
        if (payPalThreeDSV1ViewContentPageConfig2 != null) {
            payPalThreeDSV1ViewContentPageConfig2.removeContentViewListeners();
            _$_clearFindViewByIdCache();
            return;
        }
        C19383o.m32805o("payPalThreeDSV1ViewContentPageConfig");
        throw null;
    }
}
