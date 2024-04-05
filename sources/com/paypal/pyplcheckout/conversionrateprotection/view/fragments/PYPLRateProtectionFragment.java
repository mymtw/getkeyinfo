package com.paypal.pyplcheckout.conversionrateprotection.view.fragments;

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
import com.paypal.pyplcheckout.conversionrateprotection.model.RateProtectionViewContentPageConfig;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PYPLRateProtectionFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PYPLRateProtectionFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private RateProtectionViewContentPageConfig mRateProtectionViewContentPageConfig;
    private MainPaysheetViewModel mViewModel;
    private RelativeLayout rateProtectionBodyContainer;
    private FrameLayout rateProtectionBottomSheetLayout;
    private RelativeLayout rateProtectionFooterContainer;
    private RelativeLayout rateProtectionHeaderContainer;
    /* access modifiers changed from: private */
    public BottomSheetBehavior<?> rateProtectionSheetBottomBehavior;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PYPLRateProtectionFragment newInstance() {
            return new PYPLRateProtectionFragment();
        }
    }

    static {
        Class<PYPLRateProtectionFragment> cls = PYPLRateProtectionFragment.class;
    }

    private final void addBottomSheetCallbacks() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.rateProtectionSheetBottomBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new PYPLRateProtectionFragment$addBottomSheetCallbacks$1(this));
        } else {
            C19383o.m32805o("rateProtectionSheetBottomBehavior");
            throw null;
        }
    }

    private final void attachContainerViews() {
        RateProtectionViewContentPageConfig rateProtectionViewContentPageConfig = this.mRateProtectionViewContentPageConfig;
        if (rateProtectionViewContentPageConfig != null) {
            List<ContentView> headerContentViewsList = rateProtectionViewContentPageConfig.getHeaderContentViewsList();
            C19383o.m32796f(headerContentViewsList, "mRateProtectionViewConte…ig.headerContentViewsList");
            RelativeLayout relativeLayout = this.rateProtectionHeaderContainer;
            if (relativeLayout != null) {
                attachContentViewsToContainer(headerContentViewsList, relativeLayout);
                RateProtectionViewContentPageConfig rateProtectionViewContentPageConfig2 = this.mRateProtectionViewContentPageConfig;
                if (rateProtectionViewContentPageConfig2 != null) {
                    List<ContentView> bodyContentViewsList = rateProtectionViewContentPageConfig2.getBodyContentViewsList();
                    C19383o.m32796f(bodyContentViewsList, "mRateProtectionViewConte…nfig.bodyContentViewsList");
                    RelativeLayout relativeLayout2 = this.rateProtectionBodyContainer;
                    if (relativeLayout2 != null) {
                        attachContentViewsToContainer(bodyContentViewsList, relativeLayout2);
                        RateProtectionViewContentPageConfig rateProtectionViewContentPageConfig3 = this.mRateProtectionViewContentPageConfig;
                        if (rateProtectionViewContentPageConfig3 != null) {
                            List<ContentView> footerContentViewsList = rateProtectionViewContentPageConfig3.getFooterContentViewsList();
                            C19383o.m32796f(footerContentViewsList, "mRateProtectionViewConte…ig.footerContentViewsList");
                            RelativeLayout relativeLayout3 = this.rateProtectionFooterContainer;
                            if (relativeLayout3 != null) {
                                attachContentViewsToContainer(footerContentViewsList, relativeLayout3);
                            } else {
                                C19383o.m32805o("rateProtectionFooterContainer");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("mRateProtectionViewContentPageConfig");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("rateProtectionBodyContainer");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("mRateProtectionViewContentPageConfig");
                    throw null;
                }
            } else {
                C19383o.m32805o("rateProtectionHeaderContainer");
                throw null;
            }
        } else {
            C19383o.m32805o("mRateProtectionViewContentPageConfig");
            throw null;
        }
    }

    private final void bindViews(View view) {
        View findViewById = view.findViewById(C17165R.C17167id.rateProtectionBottomSheetLayout);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.r…tectionBottomSheetLayout)");
        this.rateProtectionBottomSheetLayout = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.header_container);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.header_container)");
        this.rateProtectionHeaderContainer = (RelativeLayout) findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.body_container);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.body_container)");
        this.rateProtectionBodyContainer = (RelativeLayout) findViewById3;
        View findViewById4 = view.findViewById(C17165R.C17167id.footer_container);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.footer_container)");
        this.rateProtectionFooterContainer = (RelativeLayout) findViewById4;
    }

    private final void init() {
        Context context = getContext();
        if (context != null) {
            this.mRateProtectionViewContentPageConfig = new RateProtectionViewContentPageConfig(context, this, DebugConfigManager.getInstance().getRateProtectionContentPageListener(), DebugConfigManager.getInstance().getRateProtectionContentPage());
        }
    }

    public static final PYPLRateProtectionFragment newInstance() {
        return Companion.newInstance();
    }

    private final void setUpBottomSheetBehaviour() {
        AutoCloseBottomSheetBehavior.Companion companion = AutoCloseBottomSheetBehavior.Companion;
        FrameLayout frameLayout = this.rateProtectionBottomSheetLayout;
        if (frameLayout != null) {
            BottomSheetBehavior<?> from$default = AutoCloseBottomSheetBehavior.Companion.from$default(companion, frameLayout, getOnOutsidePaysheetClick(), (AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener) null, 4, (Object) null);
            this.rateProtectionSheetBottomBehavior = from$default;
            if (from$default != null) {
                from$default.setHideable(false);
                BottomSheetBehavior<?> bottomSheetBehavior = this.rateProtectionSheetBottomBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                } else {
                    C19383o.m32805o("rateProtectionSheetBottomBehavior");
                    throw null;
                }
            } else {
                C19383o.m32805o("rateProtectionSheetBottomBehavior");
                throw null;
            }
        } else {
            C19383o.m32805o("rateProtectionBottomSheetLayout");
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
        this.mViewModel = (MainPaysheetViewModel) new C2870k0(requireActivity()).mo10829a(MainPaysheetViewModel.class);
        init();
        attachContainerViews();
        setUpBottomSheetBehaviour();
        addBottomSheetCallbacks();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17165R.C17169layout.pypl_rate_protection_fragment, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        bindViews(inflate);
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
