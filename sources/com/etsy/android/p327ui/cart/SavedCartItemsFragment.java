package com.etsy.android.p327ui.cart;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.C6487g;
import com.etsy.android.R;
import com.etsy.android.checkout.C6336c;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.apiv3.cart.CartPage;
import com.etsy.android.lib.models.homescreen.MessageCard;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler;
import com.etsy.android.p327ui.cart.C9315k;
import com.etsy.android.p327ui.cart.CartWithSavedFragment;
import com.etsy.android.p327ui.cart.clicklisteners.C9281f;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.singleactivity.C11321e;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.push.CartRefreshDelegate;
import com.etsy.android.uikit.viewholder.C12013v;
import com.etsy.android.uikit.viewholder.ItemDividerDecoration;
import com.etsy.android.vespa.VespaBaseFragment;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.subjects.C19254a;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p367ib.C12929d;
import p415of.C13173c;
import p440s9.C13366a;
import p445sf.C13379a;
import p445sf.C13380b;
import p456ua.C13461f;
import p472wb.C13799a;
import p472wb.C13801b;
import p478x9.C13851a;

/* renamed from: com.etsy.android.ui.cart.SavedCartItemsFragment */
public class SavedCartItemsFragment extends VespaBaseFragment<CartPage> implements CartWithSavedFragment.C9231b, CartRefreshDelegate.C8937a, C13366a, C11321e {
    public C8267e adImpressionRepository;
    public CartBadgeCountRepo cartBadgeCountRepo;
    private C9281f cartEmptyMessageClickListener = new C9281f(this);
    private Disposable cartRefreshDisposable;
    public C9323l cartRefreshEventManager;
    public C9330p cartUriParser;
    public C12724a deepLinkEligibility;
    public C13851a deepLinkEntityChecker;
    private Disposable errorMessageDisposable;
    public C11780h favoriteRepository;
    public CartRefreshDelegate mCartRefreshDelegate;
    public C13380b mPagination = new C13380b();
    public SavedCartClickHandler mSavedCartClickListener;
    public C8731g retrofit;
    public C12741o routeInspector;
    public C13461f rxSchedulers;
    public C12929d savedCartRepository;
    public C10865h searchUriParser;

    /* renamed from: com.etsy.android.ui.cart.SavedCartItemsFragment$a */
    public class C9239a extends ItemDividerDecoration.C11965c {
        public C9239a() {
        }

        /* renamed from: a */
        public final ItemDividerDecoration.Alignment mo31549a() {
            return ItemDividerDecoration.Alignment.ALIGN_CHILD;
        }

        /* renamed from: b */
        public final boolean mo31550b(int i) {
            return i < SavedCartItemsFragment.this.getAdapter().getItemCount() - 1;
        }
    }

    /* renamed from: com.etsy.android.ui.cart.SavedCartItemsFragment$b */
    public class C9240b extends C12013v {
        public C9240b(int i) {
            super(i);
        }

        /* renamed from: f */
        public final boolean mo31303f(View view, RecyclerView recyclerView) {
            return recyclerView.getChildAdapterPosition(view) == 0;
        }
    }

    private ItemDividerDecoration getItemDividerDecoration() {
        return new ItemDividerDecoration(getContext().getDrawable(R.drawable.list_divider), (ItemDividerDecoration.C11965c) new C9239a());
    }

    private C12013v getMarginsItemDecoration() {
        return new C9240b(getResources().getDimensionPixelOffset(R.dimen.margin_large));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(String str) throws Exception {
        C8901g0.m17338d(getContext(), str);
    }

    /* access modifiers changed from: private */
    public void processCartRefreshEvent(C9315k kVar) {
        if (kVar instanceof C9315k.C9320e) {
            onRefresh();
            this.cartRefreshEventManager.mo31715a();
        }
    }

    public boolean canScrollUp() {
        RecyclerView recyclerView = this.recyclerView;
        C19383o.m32797g(recyclerView, "<this>");
        return recyclerView.canScrollVertically(-1);
    }

    public String getApiUrl() {
        return "/etsyapps/v3/bespoke/member/carts/saved-for-later";
    }

    public Class<CartPage> getPageClass() {
        return CartPage.class;
    }

    public C13379a getPagination() {
        return this.mPagination;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public String getTrackingName() {
        return "cart_saved_view";
    }

    public void handleEmptyMessageClick(MessageCard messageCard) {
        if (!this.cartEmptyMessageClickListener.mo31623a(messageCard, this.cartUriParser)) {
            super.handleEmptyMessageClick(messageCard);
        }
    }

    public void onCartCountsUpdated(int i, int i2, boolean z, int i3) {
        if (!z) {
            return;
        }
        if (i3 != 2) {
            onRefresh();
        } else if (i3 != 2) {
        } else {
            if (i2 == 0) {
                onRefresh();
            } else if (!TextUtils.isEmpty(getPagination().f29305a)) {
                onLoadContent();
            }
        }
    }

    public void onCartPageSelected() {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.mCartRefreshDelegate = new CartRefreshDelegate(getActivity(), this, this.cartBadgeCountRepo);
        getAdapter().f28994f = true;
        C13799a.C13800a aVar = new C13799a.C13800a();
        aVar.f30377a = this;
        C13173c adapter = getAdapter();
        C19383o.m32797g(adapter, "value");
        aVar.f30378b = adapter;
        C8703p analyticsContext = getAnalyticsContext();
        C19383o.m32797g(analyticsContext, "value");
        aVar.f30379c = analyticsContext;
        aVar.f30382f = this;
        C11780h hVar = this.favoriteRepository;
        C19383o.m32797g(hVar, "value");
        aVar.f30380d = hVar;
        C13461f fVar = this.rxSchedulers;
        C19383o.m32797g(fVar, "value");
        aVar.f30381e = fVar;
        C8267e eVar = this.adImpressionRepository;
        C19383o.m32797g(eVar, "value");
        aVar.f30384h = eVar;
        C12724a aVar2 = this.deepLinkEligibility;
        C19383o.m32797g(aVar2, "value");
        aVar.f30385i = aVar2;
        C12741o oVar = this.routeInspector;
        C19383o.m32797g(oVar, "value");
        aVar.f30386j = oVar;
        C13851a aVar3 = this.deepLinkEntityChecker;
        C19383o.m32797g(aVar3, "value");
        aVar.f30387k = aVar3;
        C10865h hVar2 = this.searchUriParser;
        C19383o.m32797g(hVar2, "value");
        aVar.f30388l = hVar2;
        C13801b bVar = new C13801b(aVar.mo46660a());
        SavedCartClickHandler savedCartClickHandler = new SavedCartClickHandler(this, getAnalyticsContext(), getAdapter(), this.cartRefreshEventManager, this.savedCartRepository, this.rxSchedulers);
        this.mSavedCartClickListener = savedCartClickHandler;
        bVar.mo45894i(R.id.view_type_saved_cart_listing_card, savedCartClickHandler);
        this.errorMessageDisposable = this.mSavedCartClickListener.f20037f.mo20637g(new C6487g(this, 5));
        addDelegateViewHolderFactory(bVar);
        if (getConfigMap().mo21132b(C8592b.f18845y)) {
            this.recyclerView.setScrollBarStyle(33554432);
            this.recyclerView.addItemDecoration(getItemDividerDecoration());
            if (C8914m.m17345c(getActivity())) {
                this.recyclerView.addItemDecoration(getMarginsItemDecoration());
            }
        }
        return onCreateView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.errorMessageDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.cartRefreshDisposable;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }

    public void onPause() {
        super.onPause();
        this.mCartRefreshDelegate.onPause();
    }

    public void onRefresh() {
        getAdapter().clear();
        this.emptyView.setVisibility(8);
        resetAndLoadContent();
    }

    public void onResume() {
        super.onResume();
        this.mCartRefreshDelegate.onResume();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19254a<C9315k> aVar = this.cartRefreshEventManager.f20595a;
        this.rxSchedulers.getClass();
        ObservableSubscribeOn i = aVar.mo20639i(C13461f.m21235b());
        this.rxSchedulers.getClass();
        this.cartRefreshDisposable = i.mo20635e(C13461f.m21236c()).mo20637g(new C6336c(this, 1));
    }

    public void scrollToTop() {
        this.recyclerView.smoothScrollToPosition(0);
    }
}
