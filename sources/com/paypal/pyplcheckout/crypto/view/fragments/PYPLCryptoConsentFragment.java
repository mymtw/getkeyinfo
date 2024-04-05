package com.paypal.pyplcheckout.crypto.view.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.crypto.model.CryptoConsentViewContentPageConfig;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PYPLCryptoConsentFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PYPLCryptoConsentFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private RelativeLayout cryptoConsentBodyContainer;
    private FrameLayout cryptoConsentBottomSheetLayout;
    private RelativeLayout cryptoConsentFooterContainer;
    private RelativeLayout cryptoConsentHeaderContainer;
    /* access modifiers changed from: private */
    public BottomSheetBehavior<?> cryptoConsentSheetBottomBehavior;
    private CryptoConsentViewContentPageConfig mCryptoConsentViewContentPageConfig;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PYPLCryptoConsentFragment newInstance() {
            return new PYPLCryptoConsentFragment();
        }
    }

    static {
        Class<PYPLCryptoConsentFragment> cls = PYPLCryptoConsentFragment.class;
    }

    private final void addBottomSheetCallbacks() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.cryptoConsentSheetBottomBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new PYPLCryptoConsentFragment$addBottomSheetCallbacks$1(this));
        } else {
            C19383o.m32805o("cryptoConsentSheetBottomBehavior");
            throw null;
        }
    }

    private final void attachContainerViews() {
        CryptoConsentViewContentPageConfig cryptoConsentViewContentPageConfig = this.mCryptoConsentViewContentPageConfig;
        if (cryptoConsentViewContentPageConfig != null) {
            List<ContentView> headerContentViewsList = cryptoConsentViewContentPageConfig.getHeaderContentViewsList();
            C19383o.m32796f(headerContentViewsList, "mCryptoConsentViewConten…ig.headerContentViewsList");
            RelativeLayout relativeLayout = this.cryptoConsentHeaderContainer;
            if (relativeLayout != null) {
                attachContentViewsToContainer(headerContentViewsList, relativeLayout);
                CryptoConsentViewContentPageConfig cryptoConsentViewContentPageConfig2 = this.mCryptoConsentViewContentPageConfig;
                if (cryptoConsentViewContentPageConfig2 != null) {
                    List<ContentView> bodyContentViewsList = cryptoConsentViewContentPageConfig2.getBodyContentViewsList();
                    C19383o.m32796f(bodyContentViewsList, "mCryptoConsentViewConten…nfig.bodyContentViewsList");
                    RelativeLayout relativeLayout2 = this.cryptoConsentBodyContainer;
                    if (relativeLayout2 != null) {
                        attachContentViewsToContainer(bodyContentViewsList, relativeLayout2);
                        CryptoConsentViewContentPageConfig cryptoConsentViewContentPageConfig3 = this.mCryptoConsentViewContentPageConfig;
                        if (cryptoConsentViewContentPageConfig3 != null) {
                            List<ContentView> footerContentViewsList = cryptoConsentViewContentPageConfig3.getFooterContentViewsList();
                            C19383o.m32796f(footerContentViewsList, "mCryptoConsentViewConten…ig.footerContentViewsList");
                            RelativeLayout relativeLayout3 = this.cryptoConsentFooterContainer;
                            if (relativeLayout3 != null) {
                                attachContentViewsToContainer(footerContentViewsList, relativeLayout3);
                            } else {
                                C19383o.m32805o("cryptoConsentFooterContainer");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("mCryptoConsentViewContentPageConfig");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("cryptoConsentBodyContainer");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("mCryptoConsentViewContentPageConfig");
                    throw null;
                }
            } else {
                C19383o.m32805o("cryptoConsentHeaderContainer");
                throw null;
            }
        } else {
            C19383o.m32805o("mCryptoConsentViewContentPageConfig");
            throw null;
        }
    }

    private final void bindViews(View view) {
        View findViewById = view.findViewById(C17165R.C17167id.fragmentBottomSheetLayout);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.fragmentBottomSheetLayout)");
        this.cryptoConsentBottomSheetLayout = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.header_container);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.header_container)");
        this.cryptoConsentHeaderContainer = (RelativeLayout) findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.body_container);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.body_container)");
        this.cryptoConsentBodyContainer = (RelativeLayout) findViewById3;
        View findViewById4 = view.findViewById(C17165R.C17167id.footer_container);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.footer_container)");
        this.cryptoConsentFooterContainer = (RelativeLayout) findViewById4;
    }

    private final void init() {
        Context context = getContext();
        if (context != null) {
            this.mCryptoConsentViewContentPageConfig = new CryptoConsentViewContentPageConfig(context, this, DebugConfigManager.getInstance().getCryptoConsentViewListener(), DebugConfigManager.getInstance().getCryptoConsentViewContentPage());
        }
    }

    public static final PYPLCryptoConsentFragment newInstance() {
        return Companion.newInstance();
    }

    private final void setUpBottomSheetBehaviour() {
        AutoCloseBottomSheetBehavior.Companion companion = AutoCloseBottomSheetBehavior.Companion;
        FrameLayout frameLayout = this.cryptoConsentBottomSheetLayout;
        if (frameLayout != null) {
            BottomSheetBehavior<?> from$default = AutoCloseBottomSheetBehavior.Companion.from$default(companion, frameLayout, getOnOutsidePaysheetClick(), (AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener) null, 4, (Object) null);
            this.cryptoConsentSheetBottomBehavior = from$default;
            if (from$default != null) {
                from$default.setHideable(false);
                BottomSheetBehavior<?> bottomSheetBehavior = this.cryptoConsentSheetBottomBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                } else {
                    C19383o.m32805o("cryptoConsentSheetBottomBehavior");
                    throw null;
                }
            } else {
                C19383o.m32805o("cryptoConsentSheetBottomBehavior");
                throw null;
            }
        } else {
            C19383o.m32805o("cryptoConsentBottomSheetLayout");
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
        init();
        attachContainerViews();
        setUpBottomSheetBehaviour();
        addBottomSheetCallbacks();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        PLog.impression$default(PEnums.TransitionName.CRYPTO_LEGAL_PAGE_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E102, PEnums.StateName.PAY_WITH_CRYPTO, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
        View inflate = layoutInflater.inflate(C17165R.C17169layout.pypl_fragment_layout, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        bindViews(inflate);
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
