package com.paypal.pyplcheckout.auth.p541ui;

import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.support.p013v4.media.C0070b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.C9054e;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.flavorauth.ThirdPartyAuthPresenter;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import com.paypal.pyplcheckout.p543di.SdkComponentKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.pyplcheckout.auth.ui.NativeAuthParentFragment */
public final class NativeAuthParentFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long FADE_ANIMATION_DURATION = 250;
    /* access modifiers changed from: private */
    public static final String TAG = "NativeAuthParentFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private View backButton;
    private View bottomScrollView;
    /* access modifiers changed from: private */
    public BottomSheetBehavior<?> bottomSheetBehavior;
    private View closeButton;
    private NativeAuthScreen initialAuthScreen;
    private View loadingHeaderView;
    public ThirdPartyAuthPresenter thirdPartyAuthPresenter;

    /* renamed from: com.paypal.pyplcheckout.auth.ui.NativeAuthParentFragment$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return NativeAuthParentFragment.TAG;
        }
    }

    static {
        Class<NativeAuthParentFragment> cls = NativeAuthParentFragment.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m35212onViewCreated$lambda0(View view) {
        ContentRouter.INSTANCE.navigateBackInAuthFlow$pyplcheckout_externalThreedsRelease();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m35213onViewCreated$lambda1(NativeAuthParentFragment nativeAuthParentFragment, View view) {
        C19383o.m32797g(nativeAuthParentFragment, "this$0");
        FragmentActivity activity = nativeAuthParentFragment.getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            ContentRouter.INSTANCE.closeNativeAuthFlow$pyplcheckout_externalThreedsRelease(appCompatActivity);
        }
    }

    private final void setUpBottomSheetBehaviour() {
        AutoCloseBottomSheetBehavior.Companion companion = AutoCloseBottomSheetBehavior.Companion;
        View view = this.bottomScrollView;
        if (view != null) {
            BottomSheetBehavior<?> from$default = AutoCloseBottomSheetBehavior.Companion.from$default(companion, view, getOnOutsidePaysheetClick(), (AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener) null, 4, (Object) null);
            this.bottomSheetBehavior = from$default;
            if (from$default != null) {
                from$default.setHideable(false);
                BottomSheetBehavior<?> bottomSheetBehavior2 = this.bottomSheetBehavior;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.addBottomSheetCallback(new NativeAuthParentFragment$setUpBottomSheetBehaviour$1(this));
                    BottomSheetBehavior<?> bottomSheetBehavior3 = this.bottomSheetBehavior;
                    if (bottomSheetBehavior3 != null) {
                        bottomSheetBehavior3.setState(3);
                    } else {
                        C19383o.m32805o("bottomSheetBehavior");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("bottomSheetBehavior");
                    throw null;
                }
            } else {
                C19383o.m32805o("bottomSheetBehavior");
                throw null;
            }
        } else {
            C19383o.m32805o("bottomScrollView");
            throw null;
        }
    }

    private final void toggleHeaderButtons(NativeAuthScreen nativeAuthScreen) {
        if (nativeAuthScreen.getShowBackButton()) {
            View view = this.backButton;
            if (view != null) {
                view.setVisibility(0);
                View view2 = this.backButton;
                if (view2 != null) {
                    view2.setEnabled(true);
                } else {
                    C19383o.m32805o("backButton");
                    throw null;
                }
            } else {
                C19383o.m32805o("backButton");
                throw null;
            }
        } else {
            View view3 = this.backButton;
            if (view3 != null) {
                view3.setVisibility(4);
                View view4 = this.backButton;
                if (view4 != null) {
                    view4.setEnabled(false);
                } else {
                    C19383o.m32805o("backButton");
                    throw null;
                }
            } else {
                C19383o.m32805o("backButton");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void toggleLoadingView(boolean z) {
        View view = this.loadingHeaderView;
        if (view != null) {
            boolean z2 = false;
            if (z) {
                if (!(view.getVisibility() == 0)) {
                    view.setAlpha(0.0f);
                    view.setVisibility(0);
                    view.setClickable(true);
                    view.setFocusable(true);
                    view.animate().alpha(1.0f).setDuration(FADE_ANIMATION_DURATION).setListener((Animator.AnimatorListener) null);
                    return;
                }
            }
            if (!z) {
                if (view.getVisibility() == 0) {
                    z2 = true;
                }
                if (z2) {
                    view.animate().alpha(0.0f).setDuration(FADE_ANIMATION_DURATION).setListener(new NativeAuthParentFragment$toggleLoadingView$1$1(view));
                    return;
                }
                return;
            }
            return;
        }
        C19383o.m32805o("loadingHeaderView");
        throw null;
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

    public final int getFragmentCount() {
        return getChildFragmentManager().mo10355E();
    }

    public final ThirdPartyAuthPresenter getThirdPartyAuthPresenter() {
        ThirdPartyAuthPresenter thirdPartyAuthPresenter2 = this.thirdPartyAuthPresenter;
        if (thirdPartyAuthPresenter2 != null) {
            return thirdPartyAuthPresenter2;
        }
        C19383o.m32805o("thirdPartyAuthPresenter");
        throw null;
    }

    public final void loadChildAuthFragment(NativeAuthScreen nativeAuthScreen) {
        C19383o.m32797g(nativeAuthScreen, "nativeAuthScreen");
        toggleLoadingView(false);
        toggleHeaderButtons(nativeAuthScreen);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C2740a c = C0070b.m182c(childFragmentManager, childFragmentManager);
        c.mo10531h(C17165R.C17167id.contentFrameLayout, nativeAuthScreen.getFragment(), (String) null);
        c.mo10529c(nativeAuthScreen.getFragment().getClass().getSimpleName());
        c.mo10532i(C17165R.anim.slide_in_up, C17165R.anim.slide_stay, 0, 0);
        c.mo10483d();
    }

    public void onAttach(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        super.onAttach(context);
        SdkComponentKt.inject(this);
        getThirdPartyAuthPresenter().setLoadingListener(new NativeAuthParentFragment$onAttach$1(this));
    }

    public final void onBackPressed() {
        getChildFragmentManager().mo10364Q();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(C17165R.C17169layout.native_auth_parent_fragment, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C17165R.C17167id.loadingHeaderView);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.loadingHeaderView)");
        this.loadingHeaderView = findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.bottomScrollView);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.bottomScrollView)");
        this.bottomScrollView = findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.backArrowImageView);
        C19383o.m32796f(findViewById3, "view.findViewById<View>(R.id.backArrowImageView)");
        this.backButton = findViewById3;
        View findViewById4 = view.findViewById(C17165R.C17167id.closeImageView);
        C19383o.m32796f(findViewById4, "view.findViewById<View>(R.id.closeImageView)");
        this.closeButton = findViewById4;
        View view2 = this.backButton;
        if (view2 != null) {
            view2.setOnClickListener(new C17196a());
            View view3 = this.closeButton;
            if (view3 != null) {
                view3.setOnClickListener(new C9054e(this, 6));
                NativeAuthScreen nativeAuthScreen = this.initialAuthScreen;
                if (nativeAuthScreen != null) {
                    loadChildAuthFragment(nativeAuthScreen);
                }
                setUpBottomSheetBehaviour();
                return;
            }
            C19383o.m32805o("closeButton");
            throw null;
        }
        C19383o.m32805o("backButton");
        throw null;
    }

    public final void removeChildAuthFragment(Fragment fragment) {
        C19383o.m32797g(fragment, "fragment");
        if (fragment.isVisible()) {
            getChildFragmentManager().mo10364Q();
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C2740a aVar = new C2740a(childFragmentManager);
        aVar.mo10490n(fragment);
        aVar.mo10483d();
    }

    public final void setChildFragmentToLoad(NativeAuthScreen nativeAuthScreen) {
        C19383o.m32797g(nativeAuthScreen, "nativeAuthScreen");
        this.initialAuthScreen = nativeAuthScreen;
    }

    public final void setThirdPartyAuthPresenter(ThirdPartyAuthPresenter thirdPartyAuthPresenter2) {
        C19383o.m32797g(thirdPartyAuthPresenter2, "<set-?>");
        this.thirdPartyAuthPresenter = thirdPartyAuthPresenter2;
    }
}
