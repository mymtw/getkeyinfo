package com.paypal.pyplcheckout.billingagreements.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.billingagreements.view.config.BillingAgreementsTermsPageConfig;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PYPLBillingAgreementsTermsFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "PYPLBillingAgreementsTermsFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private BillingAgreementsTermsPageConfig billingAgreementsTermsPageConfig;
    private LinearLayout bodyContainer;
    /* access modifiers changed from: private */
    public BottomSheetBehavior<?> bottomSheetBehaviour;
    private LinearLayout footerContainer;
    private LinearLayout headerContainer;
    private ConstraintLayout paysheetContainer;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return PYPLBillingAgreementsTermsFragment.TAG;
        }

        public final PYPLBillingAgreementsTermsFragment newInstance() {
            return new PYPLBillingAgreementsTermsFragment();
        }
    }

    static {
        Class<PYPLBillingAgreementsTermsFragment> cls = PYPLBillingAgreementsTermsFragment.class;
    }

    private final void addBottomSheetCallbacks() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.bottomSheetBehaviour;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new PYPLBillingAgreementsTermsFragment$addBottomSheetCallbacks$1(this));
        } else {
            C19383o.m32805o("bottomSheetBehaviour");
            throw null;
        }
    }

    private final void attachContainerViews() {
        BillingAgreementsTermsPageConfig billingAgreementsTermsPageConfig2 = this.billingAgreementsTermsPageConfig;
        if (billingAgreementsTermsPageConfig2 != null) {
            List<ContentView> headerContentViewsList = billingAgreementsTermsPageConfig2.getHeaderContentViewsList();
            C19383o.m32796f(headerContentViewsList, "billingAgreementsTermsPa…ig.headerContentViewsList");
            LinearLayout linearLayout = this.headerContainer;
            if (linearLayout != null) {
                attachContentViewsToContainer(headerContentViewsList, linearLayout);
                BillingAgreementsTermsPageConfig billingAgreementsTermsPageConfig3 = this.billingAgreementsTermsPageConfig;
                if (billingAgreementsTermsPageConfig3 != null) {
                    List<ContentView> bodyContentViewsList = billingAgreementsTermsPageConfig3.getBodyContentViewsList();
                    C19383o.m32796f(bodyContentViewsList, "billingAgreementsTermsPa…nfig.bodyContentViewsList");
                    LinearLayout linearLayout2 = this.bodyContainer;
                    if (linearLayout2 != null) {
                        attachContentViewsToContainer(bodyContentViewsList, linearLayout2);
                        BillingAgreementsTermsPageConfig billingAgreementsTermsPageConfig4 = this.billingAgreementsTermsPageConfig;
                        if (billingAgreementsTermsPageConfig4 != null) {
                            List<ContentView> footerContentViewsList = billingAgreementsTermsPageConfig4.getFooterContentViewsList();
                            C19383o.m32796f(footerContentViewsList, "billingAgreementsTermsPa…ig.footerContentViewsList");
                            LinearLayout linearLayout3 = this.footerContainer;
                            if (linearLayout3 != null) {
                                attachContentViewsToContainer(footerContentViewsList, linearLayout3);
                            } else {
                                C19383o.m32805o("footerContainer");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("billingAgreementsTermsPageConfig");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("bodyContainer");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("billingAgreementsTermsPageConfig");
                    throw null;
                }
            } else {
                C19383o.m32805o("headerContainer");
                throw null;
            }
        } else {
            C19383o.m32805o("billingAgreementsTermsPageConfig");
            throw null;
        }
    }

    private final void bindViews(View view) {
        View findViewById = view.findViewById(C17165R.C17167id.header_container);
        C19383o.m32796f(findViewById, "root.findViewById(R.id.header_container)");
        this.headerContainer = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.body_container);
        C19383o.m32796f(findViewById2, "root.findViewById(R.id.body_container)");
        this.bodyContainer = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.footer_container);
        C19383o.m32796f(findViewById3, "root.findViewById(R.id.footer_container)");
        this.footerContainer = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(C17165R.C17167id.paysheet_container);
        C19383o.m32796f(findViewById4, "root.findViewById(R.id.paysheet_container)");
        this.paysheetContainer = (ConstraintLayout) findViewById4;
    }

    private final void initContentPage() {
        Context context = getContext();
        if (context != null) {
            this.billingAgreementsTermsPageConfig = new BillingAgreementsTermsPageConfig(context, this, DebugConfigManager.getInstance().getBillingAgreementsTermsContentPage());
        }
    }

    private final void setupBottomSheetBehaviour() {
        AutoCloseBottomSheetBehavior.Companion companion = AutoCloseBottomSheetBehavior.Companion;
        ConstraintLayout constraintLayout = this.paysheetContainer;
        if (constraintLayout != null) {
            BottomSheetBehavior<?> from$default = AutoCloseBottomSheetBehavior.Companion.from$default(companion, constraintLayout, getOnOutsidePaysheetClick(), (AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener) null, 4, (Object) null);
            this.bottomSheetBehaviour = from$default;
            if (from$default != null) {
                from$default.setHideable(false);
                BottomSheetBehavior<?> bottomSheetBehavior = this.bottomSheetBehaviour;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                } else {
                    C19383o.m32805o("bottomSheetBehaviour");
                    throw null;
                }
            } else {
                C19383o.m32805o("bottomSheetBehaviour");
                throw null;
            }
        } else {
            C19383o.m32805o("paysheetContainer");
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
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        return str;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        initContentPage();
        attachContainerViews();
        setupBottomSheetBehaviour();
        addBottomSheetCallbacks();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17165R.C17169layout.pypl_billing_agreements_terms_fragment, viewGroup, false);
        C19383o.m32796f(inflate, "it");
        bindViews(inflate);
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        PLog.impression$default(PEnums.TransitionName.BA_AUTHORIZATION_INFO_PAGE_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
    }
}
