package com.etsy.android.p327ui.user.purchases;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.C0120c;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.C3150h;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.C8693g;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.Transaction;
import com.etsy.android.p327ui.cardview.clickhandlers.C9135p;
import com.etsy.android.p327ui.user.purchases.C11639e;
import com.etsy.android.p327ui.user.purchases.module.ModuleViewHolder;
import com.etsy.android.p327ui.user.review.C11714m;
import com.etsy.android.p327ui.user.review.ReviewTrackingSource;
import com.etsy.android.qualtrics.C8952d;
import com.etsy.android.qualtrics.QualtricsConfiguration;
import com.etsy.android.uikit.EndlessRecyclerViewListFragment;
import com.etsy.android.uikit.adapter.C11829a;
import com.etsy.android.uikit.p331ui.favorites.HeartMonitor;
import com.etsy.android.util.OneShotOnResume;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.flow.C19665q1;
import kotlinx.coroutines.flow.C19669s;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import p145io.reactivex.disposables.C7091a;
import p337de.C12647a;
import p337de.C12648b;
import p337de.C12649c;
import p356ge.C12788a;
import p356ge.C12790b;
import p370ie.C12942b;
import p370ie.C12948h;
import p415of.C13181j;
import p425q9.C13265p;
import p440s9.C13366a;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.user.purchases.PurchasesFragment */
public final class PurchasesFragment extends EndlessRecyclerViewListFragment<C11639e> implements C11678t, C13366a, C11714m {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C7091a disposable = new C7091a();
    public C8630b etsyMoneyFactory;
    public C11672r presenter;
    private final C0120c<C12942b> reviewActionResult;
    public C13461f rxSchedulers;
    public C13265p session;
    private final C0120c<C12948h> signInForPurchasesResult;
    public C11679u viewModel;

    /* renamed from: com.etsy.android.ui.user.purchases.PurchasesFragment$a */
    public static final class C11627a extends C3150h {
        /* renamed from: f */
        public final boolean mo11629f(RecyclerView.C3084b0 b0Var) {
            C19383o.m32797g(b0Var, "viewHolder");
            return b0Var instanceof ModuleViewHolder;
        }
    }

    public PurchasesFragment() {
        C0120c<C12948h> registerForActivityResult = registerForActivityResult(new C12649c(), new C11653k(this));
        C19383o.m32796f(registerForActivityResult, "registerForActivityResul…dSignIn()\n        }\n    }");
        this.signInForPurchasesResult = registerForActivityResult;
        C0120c<C12942b> registerForActivityResult2 = registerForActivityResult(new C12648b(), new C11654l(this));
        C19383o.m32796f(registerForActivityResult2, "registerForActivityResul…tAdapter)\n        }\n    }");
        this.reviewActionResult = registerForActivityResult2;
    }

    /* access modifiers changed from: private */
    public final void handleOnReviewUpdated(Bundle bundle) {
        Transaction transaction = null;
        Object serializable = bundle != null ? bundle.getSerializable("transaction") : null;
        if (serializable instanceof Transaction) {
            transaction = (Transaction) serializable;
        }
        if (transaction != null) {
            Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
            C19383o.m32796f(lifecycle, "viewLifecycleOwner.lifecycle");
            new OneShotOnResume(lifecycle, new PurchasesFragment$handleOnReviewUpdated$1$1(this, transaction));
        }
        onRefresh();
    }

    private final void onUserCancelledSignIn() {
        C12788a.m20426e(getActivity());
    }

    /* access modifiers changed from: private */
    /* renamed from: reviewActionResult$lambda-3  reason: not valid java name */
    public static final void m35069reviewActionResult$lambda3(PurchasesFragment purchasesFragment, C12647a aVar) {
        C19383o.m32797g(purchasesFragment, "this$0");
        int i = aVar.f27895a;
        if (i == 411) {
            Intent intent = aVar.f27896b;
            purchasesFragment.handleOnReviewUpdated(intent != null ? intent.getExtras() : null);
        } else if (i == 412) {
            C11672r presenter2 = purchasesFragment.getPresenter();
            C11829a<T> aVar2 = purchasesFragment.adapter;
            C19383o.m32795e(aVar2, "null cannot be cast to non-null type com.etsy.android.ui.user.purchases.PurchaseReceiptAdapter");
            PurchaseReceiptAdapter purchaseReceiptAdapter = (PurchaseReceiptAdapter) aVar2;
            presenter2.getClass();
            purchaseReceiptAdapter.clearData();
            purchaseReceiptAdapter.addItems(presenter2.f25839b.f25878c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: signInForPurchasesResult$lambda-0  reason: not valid java name */
    public static final void m35070signInForPurchasesResult$lambda0(PurchasesFragment purchasesFragment, C12647a aVar) {
        C19383o.m32797g(purchasesFragment, "this$0");
        if (aVar.f27895a == 311) {
            purchasesFragment.onUserSignedIn();
        } else {
            purchasesFragment.onUserCancelledSignIn();
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

    public final C7091a getDisposable() {
        return this.disposable;
    }

    public final C8630b getEtsyMoneyFactory() {
        C8630b bVar = this.etsyMoneyFactory;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("etsyMoneyFactory");
        throw null;
    }

    public Fragment getFragment() {
        return this;
    }

    public FragmentActivity getFragmentActivity() {
        return getActivity();
    }

    public int getLoadTriggerPosition() {
        return 2;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C11672r getPresenter() {
        C11672r rVar = this.presenter;
        if (rVar != null) {
            return rVar;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public final C13461f getRxSchedulers() {
        C13461f fVar = this.rxSchedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("rxSchedulers");
        throw null;
    }

    public C13181j getScrollListener() {
        return this;
    }

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public String getTrackingName() {
        return "your_purchases";
    }

    public C8693g getTrackingView() {
        return this;
    }

    public final C11679u getViewModel() {
        C11679u uVar = this.viewModel;
        if (uVar != null) {
            return uVar;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    public void launchReviewFlow(C12942b bVar) {
        C19383o.m32797g(bVar, "navigationKey");
        this.reviewActionResult.mo1157b(bVar);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 301) {
            if (i2 == 311 && intent != null) {
                EtsyAction etsyAction = EtsyAction.VIEW_PURCHASES;
                EtsyAction.C8658a aVar = EtsyAction.Companion;
                String action = intent.getAction();
                aVar.getClass();
                if (etsyAction == ((EtsyAction) EtsyAction.intentActions.get(action))) {
                    onUserSignedIn();
                    return;
                }
            }
            onUserCancelledSignIn();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        if (context != null) {
            C11672r presenter2 = getPresenter();
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            presenter2.getClass();
            Resources resources = fragmentActivity.getResources();
            C19383o.m32796f(resources, "context.resources");
            PurchaseReceiptAdapter purchaseReceiptAdapter = new PurchaseReceiptAdapter(fragmentActivity, new C11649g(resources, presenter2.f25841d, new SimpleDateFormat("MMM dd", presenter2.f25843f.mo46718b())), new C9135p(presenter2.f25838a.getFragment(), presenter2.f25844g, ReviewTrackingSource.PURCHASES_CAROUSEL));
            purchaseReceiptAdapter.f26308b = presenter2.f25838a.getScrollListener();
            purchaseReceiptAdapter.f25736e.observe(presenter2.f25838a.getFragment(), new C11668n(presenter2, 0));
            purchaseReceiptAdapter.f25738g.observe(presenter2.f25838a.getFragment(), new C11669o(presenter2, 0));
            presenter2.f25838a.setAdapter(purchaseReceiptAdapter);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        if (getActivity() != null) {
            C11672r presenter2 = getPresenter();
            FragmentActivity activity = getActivity();
            if (activity != null) {
                presenter2.getClass();
                Window window = activity.getWindow();
                if (window != null) {
                    TypedValue typedValue = new TypedValue();
                    activity.getTheme().resolveAttribute(R.attr.clg_color_bg_primary, typedValue, true);
                    window.setBackgroundDrawableResource(typedValue.resourceId);
                }
                QualtricsConfiguration.m17374a(activity, presenter2.f25842e, presenter2.f25843f, C8952d.C8958f.f19756c);
            }
            Lifecycle lifecycle = presenter2.f25838a.getFragment().getLifecycle();
            C19383o.m32796f(lifecycle, "view.getFragment().lifecycle");
            new HeartMonitor(lifecycle, new C11670p(presenter2));
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        C11672r presenter3 = getPresenter();
        RecyclerView recyclerView = this.recyclerView;
        C19383o.m32796f(recyclerView, "recyclerView");
        presenter3.getClass();
        recyclerView.addItemDecoration(new C11671q());
        this.emptyText.setText(getString(R.string.empty_purchases));
        this.recyclerView.setClipChildren(false);
        this.recyclerView.setItemAnimator(new C11627a());
        return onCreateView;
    }

    public void onDestroyView() {
        C1993m.m4374t(getPresenter().f25851n.f43661b);
        super.onDestroyView();
    }

    public void onLoadContent() {
        C11632c cVar;
        C11672r presenter2 = getPresenter();
        int apiOffset = getApiOffset();
        C11679u uVar = presenter2.f25839b;
        if (apiOffset == 0) {
            uVar.f25878c.clear();
            uVar.f25879d = 0;
        }
        if (apiOffset == 0) {
            uVar.getClass();
            cVar = new C11632c(4, 0, true);
        } else {
            cVar = new C11632c(4, apiOffset - uVar.f25879d, false);
        }
        C19669s.m33429a(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C19665q1(new PurchasesViewModel$getListItems$1(uVar, cVar, (C19340c<? super PurchasesViewModel$getListItems$1>) null)), new PurchasesPresenter$loadContent$1(presenter2, (C19340c<? super PurchasesPresenter$loadContent$1>) null)), new PurchasesPresenter$loadContent$2((C19340c<? super PurchasesPresenter$loadContent$2>) null)), presenter2.f25851n);
    }

    public void onLoadFailure() {
        super.onLoadFailure();
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setTitle(getString(R.string.your_purchases));
        }
    }

    public void onStart() {
        super.onStart();
        if (getSession().mo45960e()) {
            onUserSignedIn();
            return;
        }
        this.signInForPurchasesResult.mo1157b(new C12948h(C12790b.m20432d(this), EtsyAction.VIEW_PURCHASES, (Bundle) null, (String) null, (String) null, (String) null, 60));
    }

    public void onUserSignedIn() {
        if (isEmpty()) {
            loadContent();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        C19388s.m32894x0(this, "result_back_from_review", new PurchasesFragment$onViewCreated$1(this));
        if (getPresenter().f25839b.f25878c.isEmpty()) {
            setApiOffset(0);
            return;
        }
        C11672r presenter2 = getPresenter();
        C11829a<T> aVar = this.adapter;
        C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.ui.user.purchases.PurchaseReceiptAdapter");
        PurchaseReceiptAdapter purchaseReceiptAdapter = (PurchaseReceiptAdapter) aVar;
        presenter2.getClass();
        purchaseReceiptAdapter.clearData();
        purchaseReceiptAdapter.addItems(presenter2.f25839b.f25878c);
    }

    public void setAdapter(PurchaseReceiptAdapter purchaseReceiptAdapter) {
        C19383o.m32797g(purchaseReceiptAdapter, "adapter");
        this.adapter = purchaseReceiptAdapter;
    }

    public final void setEtsyMoneyFactory(C8630b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.etsyMoneyFactory = bVar;
    }

    public final void setPresenter(C11672r rVar) {
        C19383o.m32797g(rVar, "<set-?>");
        this.presenter = rVar;
    }

    public void setPurchaseListItems(List<? extends C11639e> list, int i) {
        C19383o.m32797g(list, ResponseConstants.RESULTS);
        onLoadSuccess(list, i);
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setViewModel(C11679u uVar) {
        C19383o.m32797g(uVar, "<set-?>");
        this.viewModel = uVar;
    }

    public void updateModuleListItem() {
        List<T> items = this.adapter.getItems();
        C19383o.m32796f(items, "adapter.items");
        Iterator<T> it = items.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((C11639e) it.next()) instanceof C11639e.C11641b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            this.adapter.notifyItemChanged(i);
        }
    }
}
