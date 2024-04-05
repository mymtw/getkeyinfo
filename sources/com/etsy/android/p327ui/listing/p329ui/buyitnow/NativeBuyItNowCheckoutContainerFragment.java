package com.etsy.android.p327ui.listing.p329ui.buyitnow;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p013v4.media.C0070b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.C0391c;
import androidx.core.widget.C2399d;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.network.oauth2.C8766p;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.p327ui.C10075i;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10385e;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.UiState;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.paymentmethod.ChangePaymentMethodFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.shippingaddress.ChangeShippingAddressFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.shippingmethod.ChangeShippingMethodFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.summary.SummaryFragment;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.GenericHelpKey;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import com.etsy.android.util.C12059p;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.single.SingleTimer;
import p145io.reactivex.subjects.PublishSubject;
import p248tp.C8071s;
import p306z8.C8480g;
import p356ge.C12788a;
import p356ge.C12790b;
import p440s9.C13366a;
import p456ua.C13461f;
import p514bk.C14088a;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.NativeBuyItNowCheckoutContainerFragment */
public final class NativeBuyItNowCheckoutContainerFragment extends TrackingBottomSheetDialogFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C10368a dispatcher;
    private final C7091a disposables = new C7091a();
    public C10156h listingViewEligibility;
    public C13461f schedulers;
    public C10384d viewModel;

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.NativeBuyItNowCheckoutContainerFragment$a */
    public static final class C10364a extends FragmentManager.C2723k {

        /* renamed from: a */
        public final /* synthetic */ View f22719a;

        /* renamed from: b */
        public final /* synthetic */ NativeBuyItNowCheckoutContainerFragment f22720b;

        /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.NativeBuyItNowCheckoutContainerFragment$a$a */
        public static final class C10365a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ NativeBuyItNowCheckoutContainerFragment f22721b;

            public C10365a(NativeBuyItNowCheckoutContainerFragment nativeBuyItNowCheckoutContainerFragment) {
                this.f22721b = nativeBuyItNowCheckoutContainerFragment;
            }

            public final void run() {
                this.f22721b.updatePeekHeight();
            }
        }

        public C10364a(View view, NativeBuyItNowCheckoutContainerFragment nativeBuyItNowCheckoutContainerFragment) {
            this.f22719a = view;
            this.f22720b = nativeBuyItNowCheckoutContainerFragment;
        }

        /* renamed from: i */
        public final void mo10422i(FragmentManager fragmentManager, Fragment fragment) {
            C19383o.m32797g(fragmentManager, "fm");
            C19383o.m32797g(fragment, "f");
            if (!(fragment instanceof LoadingFragment)) {
                this.f22719a.postDelayed(new C10365a(this.f22720b), 150);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void goBack() {
        if (getChildFragmentManager().mo10355E() <= 1) {
            dismissAllowingStateLoss();
        } else {
            getChildFragmentManager().mo10364Q();
        }
    }

    private final void handleSideEffects(C12059p<C10385e> pVar) {
        C10385e a;
        if (pVar != null && (a = pVar.mo38935a()) != null) {
            if (C19383o.m32792b(a, C10385e.C10392g.f22749a)) {
                showLoading();
            } else if (C19383o.m32792b(a, C10385e.C10386a.f22743a)) {
                dismissAllowingStateLoss();
            } else if (C19383o.m32792b(a, C10385e.C10387b.f22744a)) {
                goBack();
            } else if (C19383o.m32792b(a, C10385e.C10389d.f22746a)) {
                showChangeAddress();
            } else if (a instanceof C10385e.C10391f) {
                showChangeShippingMethod();
            } else if (C19383o.m32792b(a, C10385e.C10390e.f22747a)) {
                showChangePaymentMethod();
            } else if (a instanceof C10385e.C10394i) {
                C8901g0.m17338d(requireActivity(), ((C10385e.C10394i) a).f22751a);
            } else if (a instanceof C10385e.C10393h) {
                showSummary();
            } else if (a instanceof C10385e.C10388c) {
                C12788a.m20423b(getActivity(), new GenericHelpKey(C12790b.m20432d(this), ((C10385e.C10388c) a).f22745a));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m35009onViewCreated$lambda1(NativeBuyItNowCheckoutContainerFragment nativeBuyItNowCheckoutContainerFragment, C12059p pVar) {
        C19383o.m32797g(nativeBuyItNowCheckoutContainerFragment, "this$0");
        nativeBuyItNowCheckoutContainerFragment.handleSideEffects(pVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m35010onViewCreated$lambda2(Throwable th) {
        LogCatKt.m17045a().error(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-3  reason: not valid java name */
    public static final void m35011onViewCreated$lambda3(NativeBuyItNowCheckoutContainerFragment nativeBuyItNowCheckoutContainerFragment) {
        C19383o.m32797g(nativeBuyItNowCheckoutContainerFragment, "this$0");
        C10384d viewModel2 = nativeBuyItNowCheckoutContainerFragment.getViewModel();
        viewModel2.f22739c.setValue(UiState.C10367b.f22723b);
        C14088a.m21780e(viewModel2.f22740d, C10385e.C10392g.f22749a);
        SingleTimer j = C8071s.m16252j(2, TimeUnit.SECONDS);
        viewModel2.f22738b.getClass();
        ConsumerSingleObserver g = C0391c.m1056b(viewModel2.f22738b, j.mo20660i(C13461f.m21234a())).mo20658g(new C8766p(viewModel2, 5), new C10075i(1));
        C7091a aVar = viewModel2.f22742f;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(g);
    }

    private final void showChangeAddress() {
        showChildFragmentSheet(new ChangeShippingAddressFragment());
    }

    private final void showChangePaymentMethod() {
        showChildFragmentSheet(new ChangePaymentMethodFragment());
    }

    private final void showChangeShippingMethod() {
        showChildFragmentSheet(new ChangeShippingMethodFragment());
    }

    private final void showChildFragmentSheet(Fragment fragment) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C2740a c = C0070b.m182c(childFragmentManager, childFragmentManager);
        C12790b.m20429a(c, FragmentAnimationMode.SLIDING);
        c.mo10531h(R.id.native_buy_it_now_checkout_container, fragment, (String) null);
        c.mo10529c(C19386q.m32807a(fragment.getClass()).mo71919c());
        c.mo10487k();
    }

    private final void showLoading() {
        updatePeekHeight();
        LoadingFragment loadingFragment = new LoadingFragment();
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C2740a aVar = new C2740a(childFragmentManager);
        aVar.mo10531h(R.id.native_buy_it_now_checkout_container, loadingFragment, (String) null);
        aVar.mo10487k();
    }

    private final void showSummary() {
        SummaryFragment summaryFragment = new SummaryFragment();
        FragmentManager childFragmentManager = getChildFragmentManager();
        C2740a c = C0070b.m182c(childFragmentManager, childFragmentManager);
        C12790b.m20429a(c, FragmentAnimationMode.FADE);
        c.mo10531h(R.id.native_buy_it_now_checkout_container, summaryFragment, (String) null);
        c.mo10529c(C19386q.m32807a(SummaryFragment.class).mo71919c());
        c.mo10487k();
    }

    /* access modifiers changed from: private */
    public final void updatePeekHeight() {
        BottomSheetBehavior from = BottomSheetBehavior.from(requireView().findViewById(R.id.native_buy_it_now_checkout_container));
        from.setState(3);
        from.setPeekHeight(requireView().findViewById(R.id.native_buy_it_now_checkout_container).getMeasuredHeight());
        from.setState(4);
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

    public final C10368a getDispatcher() {
        C10368a aVar = this.dispatcher;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("dispatcher");
        throw null;
    }

    public final C10156h getListingViewEligibility() {
        C10156h hVar = this.listingViewEligibility;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("listingViewEligibility");
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C13461f getSchedulers() {
        C13461f fVar = this.schedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("schedulers");
        throw null;
    }

    public final C10384d getViewModel() {
        C10384d dVar = this.viewModel;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(requireActivity, R.style.BottomSheetNoFloating);
        collageBottomSheet.setPopover(true);
        collageBottomSheet.setOnBackPressedListener(new NativeBuyItNowCheckoutContainerFragment$onCreateDialog$1$1(this));
        return collageBottomSheet;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_native_buy_it_now_checkout_bottom_sheet_container, viewGroup, false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.disposables.mo19405d();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        getChildFragmentManager().mo10366S(new C10364a(view, this), false);
        PublishSubject publishSubject = getViewModel().f22741e;
        getSchedulers().getClass();
        ObservableSubscribeOn i = publishSubject.mo20639i(C13461f.m21234a());
        getSchedulers().getClass();
        Disposable f = i.mo20635e(C13461f.m21236c()).mo20636f(new C8480g(this, 4), new C10383c(0), Functions.f28539c, Functions.f28540d);
        C7091a aVar = this.disposables;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
        if (bundle == null) {
            view.post(new C2399d(this, 3));
        }
    }

    public final void setDispatcher(C10368a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.dispatcher = aVar;
    }

    public final void setListingViewEligibility(C10156h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.listingViewEligibility = hVar;
    }

    public final void setSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.schedulers = fVar;
    }

    public final void setViewModel(C10384d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.viewModel = dVar;
    }
}
