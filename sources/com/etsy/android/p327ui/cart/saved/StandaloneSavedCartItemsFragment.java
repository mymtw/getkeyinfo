package com.etsy.android.p327ui.cart.saved;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.C6331b;
import com.etsy.android.R;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.apiv3.cart.CartPage;
import com.etsy.android.lib.models.homescreen.MessageCard;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.C9904g;
import com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler;
import com.etsy.android.p327ui.cart.C9323l;
import com.etsy.android.p327ui.cart.C9330p;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.p327ui.cart.clicklisteners.C9281f;
import com.etsy.android.p327ui.cart.saved.C9336a;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.push.CartRefreshDelegate;
import com.etsy.android.uikit.viewholder.ItemDividerDecoration;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.util.C12059p;
import com.etsy.android.util.C12060q;
import com.etsy.android.vespa.VespaBaseFragment;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p260v0.C8184a;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p357gf.C12796e;
import p367ib.C12929d;
import p415of.C13173c;
import p415of.C13185n;
import p440s9.C13366a;
import p445sf.C13379a;
import p445sf.C13380b;
import p456ua.C13461f;
import p472wb.C13799a;
import p472wb.C13801b;
import p478x9.C13851a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cart.saved.StandaloneSavedCartItemsFragment */
public final class StandaloneSavedCartItemsFragment extends VespaBaseFragment<CartPage> implements CartRefreshDelegate.C8937a, C13366a, C9731e0.C9733b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8267e adImpressionRepository;
    public CartBadgeCountRepo cartBadgeCountRepo;
    private final C9281f cartEmptyMessageClickListener = new C9281f(this);
    public C9323l cartRefreshEventManager;
    public C9330p cartUriParser;
    public C12724a deepLinkEligibility;
    public C13851a deepLinkEntityChecker;
    private C7091a disposables = new C7091a();
    public C11780h favoriteRepository;
    private final C13380b pagination = new C13380b();
    public C8731g retrofit;
    public C12741o routeInspector;
    public C13461f rxSchedulers;
    private SavedCartClickHandler savedCartClickListener;
    public C12929d savedCartRepository;
    public C10865h searchUriParser;
    private final C19285c viewModel$delegate = C19350d.m32677b(new StandaloneSavedCartItemsFragment$viewModel$2(this));
    public C8656o viewModelFactory;

    /* renamed from: com.etsy.android.ui.cart.saved.StandaloneSavedCartItemsFragment$a */
    public static final class C9335a extends ItemDividerDecoration.C11965c {

        /* renamed from: a */
        public final /* synthetic */ StandaloneSavedCartItemsFragment f20612a;

        public C9335a(StandaloneSavedCartItemsFragment standaloneSavedCartItemsFragment) {
            this.f20612a = standaloneSavedCartItemsFragment;
        }

        /* renamed from: a */
        public final ItemDividerDecoration.Alignment mo31549a() {
            return ItemDividerDecoration.Alignment.ALIGN_CHILD;
        }

        /* renamed from: b */
        public final boolean mo31550b(int i) {
            return i < this.f20612a.adapter.getItemCount() - 1;
        }
    }

    private final ItemDividerDecoration getItemDividerDecoration() {
        Context requireContext = requireContext();
        Object obj = C8184a.f17966a;
        return new ItemDividerDecoration(C8184a.C8187c.m16466b(requireContext, R.drawable.list_divider), new C9335a(this), 0);
    }

    private final C9336a getViewModel() {
        return (C9336a) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    public static final void m34928onCreateView$lambda1(StandaloneSavedCartItemsFragment standaloneSavedCartItemsFragment, String str) {
        C19383o.m32797g(standaloneSavedCartItemsFragment, "this$0");
        C8901g0.m17338d(standaloneSavedCartItemsFragment.requireActivity(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m34929onViewCreated$lambda2(StandaloneSavedCartItemsFragment standaloneSavedCartItemsFragment, C12059p pVar) {
        C19383o.m32797g(standaloneSavedCartItemsFragment, "this$0");
        C9336a.C9337a aVar = (C9336a.C9337a) pVar.mo38935a();
        if (C19383o.m32792b(aVar, C9336a.C9337a.C9340c.f20622a)) {
            standaloneSavedCartItemsFragment.onRefresh();
        } else if (C19383o.m32792b(aVar, C9336a.C9337a.C9338a.f20620a)) {
            standaloneSavedCartItemsFragment.onLoadFailure();
        } else if (aVar instanceof C9336a.C9337a.C9339b) {
            standaloneSavedCartItemsFragment.onLoadSuccess(((C9336a.C9337a.C9339b) aVar).f20621a);
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

    public final C8267e getAdImpressionRepository() {
        C8267e eVar = this.adImpressionRepository;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("adImpressionRepository");
        throw null;
    }

    public String getApiUrl() {
        return "/etsyapps/v3/bespoke/member/carts/saved-for-later";
    }

    public final CartBadgeCountRepo getCartBadgeCountRepo() {
        CartBadgeCountRepo cartBadgeCountRepo2 = this.cartBadgeCountRepo;
        if (cartBadgeCountRepo2 != null) {
            return cartBadgeCountRepo2;
        }
        C19383o.m32805o("cartBadgeCountRepo");
        throw null;
    }

    public final C9323l getCartRefreshEventManager() {
        C9323l lVar = this.cartRefreshEventManager;
        if (lVar != null) {
            return lVar;
        }
        C19383o.m32805o("cartRefreshEventManager");
        throw null;
    }

    public final C9330p getCartUriParser() {
        C9330p pVar = this.cartUriParser;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("cartUriParser");
        throw null;
    }

    public final C12724a getDeepLinkEligibility() {
        C12724a aVar = this.deepLinkEligibility;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("deepLinkEligibility");
        throw null;
    }

    public final C13851a getDeepLinkEntityChecker() {
        C13851a aVar = this.deepLinkEntityChecker;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("deepLinkEntityChecker");
        throw null;
    }

    public final C11780h getFavoriteRepository() {
        C11780h hVar = this.favoriteRepository;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("favoriteRepository");
        throw null;
    }

    public int getFragmentTitle() {
        return R.string.standalone_saved_for_later_title;
    }

    public C13379a getPagination() {
        return this.pagination;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C8731g getRetrofit() {
        C8731g gVar = this.retrofit;
        if (gVar != null) {
            return gVar;
        }
        C19383o.m32805o("retrofit");
        throw null;
    }

    public final C12741o getRouteInspector() {
        C12741o oVar = this.routeInspector;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("routeInspector");
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

    public final C12929d getSavedCartRepository() {
        C12929d dVar = this.savedCartRepository;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("savedCartRepository");
        throw null;
    }

    public final C10865h getSearchUriParser() {
        C10865h hVar = this.searchUriParser;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("searchUriParser");
        throw null;
    }

    public String getTrackingName() {
        return "cart_saved_view";
    }

    public final C8656o getViewModelFactory() {
        C8656o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewModelFactory");
        throw null;
    }

    public void handleEmptyMessageClick(MessageCard messageCard) {
        C19383o.m32797g(messageCard, MessageCard.ITEM_TYPE);
        if (!this.cartEmptyMessageClickListener.mo31623a(messageCard, getCartUriParser())) {
            super.handleEmptyMessageClick(messageCard);
        }
    }

    public boolean hasRecyclerViewPadding() {
        return false;
    }

    public void onCartCountsUpdated(int i, int i2, boolean z, int i3) {
        C9336a viewModel = getViewModel();
        C13380b bVar = this.pagination;
        String contentUrl = getContentUrl();
        C19383o.m32796f(contentUrl, "contentUrl");
        viewModel.getClass();
        C19383o.m32797g(bVar, "pagination");
        if (!z) {
            return;
        }
        if (i3 != 2) {
            C12060q.m19870a(viewModel.f20618g, C9336a.C9337a.C9340c.f20622a);
        } else if (i3 != 2) {
        } else {
            if (i2 == 0) {
                C12060q.m19870a(viewModel.f20618g, C9336a.C9337a.C9340c.f20622a);
            } else if (C18263b.m30839d0(bVar.f29305a)) {
                viewModel.mo31756b(contentUrl);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        getAdapter().f28994f = true;
        getViewLifecycleOwner().getLifecycle().mo10733a(new CartRefreshDelegate(requireActivity(), this, getCartBadgeCountRepo()));
        this.savedCartClickListener = new SavedCartClickHandler(this, getAnalyticsContext(), getAdapter(), getCartRefreshEventManager(), getSavedCartRepository(), getRxSchedulers());
        C13173c adapter = getAdapter();
        C8703p analyticsContext = getAnalyticsContext();
        C11780h favoriteRepository2 = getFavoriteRepository();
        C13461f rxSchedulers2 = getRxSchedulers();
        C8267e adImpressionRepository2 = getAdImpressionRepository();
        C12724a deepLinkEligibility2 = getDeepLinkEligibility();
        View view = onCreateView;
        C12741o routeInspector2 = getRouteInspector();
        C13851a deepLinkEntityChecker2 = getDeepLinkEntityChecker();
        C10865h searchUriParser2 = getSearchUriParser();
        C19383o.m32796f(adapter, "getAdapter()");
        C19383o.m32796f(analyticsContext, "analyticsContext");
        C13801b bVar = new C13801b(new C13799a(this, adapter, analyticsContext, favoriteRepository2, rxSchedulers2, adImpressionRepository2, deepLinkEligibility2, routeInspector2, deepLinkEntityChecker2, searchUriParser2, this, (ListingCardViewHolderOptions) null, (C10715a) null, (C12796e) null, (C8630b) null, (WeakReference) null, 63488));
        bVar.mo45894i(R.id.view_type_saved_cart_listing_card, this.savedCartClickListener);
        SavedCartClickHandler savedCartClickHandler = this.savedCartClickListener;
        C19383o.m32794d(savedCartClickHandler);
        LambdaObserver g = savedCartClickHandler.f20037f.mo20637g(new C6331b(this, 3));
        C7091a aVar = this.disposables;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(g);
        addDelegateViewHolderFactory(bVar);
        this.recyclerView.setScrollBarStyle(33554432);
        this.recyclerView.addItemDecoration(getItemDividerDecoration());
        return view;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.savedCartClickListener = null;
        this.disposables.mo19405d();
    }

    public void onLoadContent() {
        C9336a viewModel = getViewModel();
        String contentUrl = getContentUrl();
        C19383o.m32796f(contentUrl, "contentUrl");
        viewModel.mo31756b(contentUrl);
    }

    public void onLoadSuccess(C13185n nVar) {
        FragmentActivity activity;
        C19383o.m32797g(nVar, "result");
        super.onLoadSuccess(nVar);
        if ((nVar instanceof CartPage) && (activity = getActivity()) != null) {
            CartPage cartPage = (CartPage) nVar;
            CartRefreshDelegate.sendBroadcast(activity, cartPage.getCartCount(), cartPage.getSavedCount(), false, 2);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        getViewModel().f20619h.observe(getViewLifecycleOwner(), new C9904g(this, 2));
    }

    public final void setAdImpressionRepository(C8267e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.adImpressionRepository = eVar;
    }

    public final void setCartBadgeCountRepo(CartBadgeCountRepo cartBadgeCountRepo2) {
        C19383o.m32797g(cartBadgeCountRepo2, "<set-?>");
        this.cartBadgeCountRepo = cartBadgeCountRepo2;
    }

    public final void setCartRefreshEventManager(C9323l lVar) {
        C19383o.m32797g(lVar, "<set-?>");
        this.cartRefreshEventManager = lVar;
    }

    public final void setCartUriParser(C9330p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.cartUriParser = pVar;
    }

    public final void setDeepLinkEligibility(C12724a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEligibility = aVar;
    }

    public final void setDeepLinkEntityChecker(C13851a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEntityChecker = aVar;
    }

    public final void setFavoriteRepository(C11780h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.favoriteRepository = hVar;
    }

    public final void setRetrofit(C8731g gVar) {
        C19383o.m32797g(gVar, "<set-?>");
        this.retrofit = gVar;
    }

    public final void setRouteInspector(C12741o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.routeInspector = oVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSavedCartRepository(C12929d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.savedCartRepository = dVar;
    }

    public final void setSearchUriParser(C10865h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.searchUriParser = hVar;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }
}
