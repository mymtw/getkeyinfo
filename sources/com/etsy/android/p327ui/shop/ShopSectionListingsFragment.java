package com.etsy.android.p327ui.shop;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.animation.C0472h;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.datatypes.ShopHomeSortOption;
import com.etsy.android.lib.push.registration.C8839l;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.cardview.clickhandlers.C9125j;
import com.etsy.android.p327ui.cardview.clickhandlers.C9126k;
import com.etsy.android.p327ui.shop.C11188p0;
import com.etsy.android.p327ui.shop.viewholder.C11287l0;
import com.etsy.android.p327ui.shop.viewholder.C11289m0;
import com.etsy.android.p327ui.shop.viewholder.C11291n0;
import com.etsy.android.shophome.C8994h;
import com.etsy.android.shophome.C8999j;
import com.etsy.android.shophome.C9003k;
import com.etsy.android.stylekit.views.CollageSelectAdapter;
import com.etsy.android.stylekit.views.CollageSelectDropdown;
import com.etsy.android.uikit.EndlessRecyclerViewListFragment;
import com.etsy.android.uikit.adapter.C11829a;
import com.etsy.android.uikit.adapter.C11832c;
import com.etsy.android.uikit.p331ui.favorites.HeartMonitor;
import com.etsy.android.uikit.viewholder.C12007s;
import com.etsy.android.uikit.viewholder.C12008t;
import com.etsy.android.uikit.viewholder.ListingCardUiModel;
import com.etsy.android.uikit.viewholder.ListingCardViewHolder;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19322o;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19380l;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.C19543e0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.subjects.PublishSubject;
import p277w8.C8267e;
import p340ea.C12673n;
import p357gf.C12796e;
import p400mf.C13074b;
import p400mf.C13078c;
import p415of.C13180i;
import p418pa.C13197c;
import p425q9.C13265p;
import p440s9.C13366a;
import p456ua.C13461f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.shop.ShopSectionListingsFragment */
public final class ShopSectionListingsFragment extends EndlessRecyclerViewListFragment<ListingCard> implements C13366a, C9731e0.C9732a {
    public static final int $stable = 8;
    public static final C11122a Companion = new C11122a();
    public static final String IS_LISTINGS_REARRANGE_ENABLED = "listing_rearrange_enabled";
    public static final String LISTING_COUNT = "listing_count";
    public static final String SECTION_ID = "section_id";
    public static final String SECTION_TITLE = "section_title";
    public static final String SHOP_ID = "shop_id";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8267e adImpressionRepository;
    private C12008t dependencies;
    private final C7091a disposable = new C7091a();
    public C12673n elkLogger;
    /* access modifiers changed from: private */
    public C9125j listingCardClickHandler;
    private int listingCount;
    public C12796e listingImagesRepository;
    private boolean needsInitialLoad = true;
    public C8994h repository;
    public C13461f schedulers;
    private String sectionTitle = "";
    /* access modifiers changed from: private */
    public ShopHomeSortOption selectedSortOption;
    public C13265p session;
    private View shopSectionListingsErrorView;
    private View shopSectionListingsLoadingView;
    private RecyclerView shopSectionListingsRecyclerView;
    private List<? extends ShopHomeSortOption> sortOptions;
    private C8999j viewModel;

    /* renamed from: com.etsy.android.ui.shop.ShopSectionListingsFragment$ShopSectionListingsAdapter */
    public final class ShopSectionListingsAdapter extends C11832c<ListingCard> implements C13180i {

        /* renamed from: c */
        public final C12008t f24601c;

        /* renamed from: d */
        public final List<ShopHomeSortOption> f24602d;

        /* renamed from: e */
        public final int f24603e = 1;

        /* renamed from: f */
        public final ListingCardViewHolderOptions.ShopHome f24604f;

        /* renamed from: g */
        public final C11140d1 f24605g;

        public ShopSectionListingsAdapter(FragmentActivity fragmentActivity, C12008t tVar, List list, C8623e eVar) {
            super(fragmentActivity);
            this.f24601c = tVar;
            this.f24602d = list;
            this.f24604f = new ListingCardViewHolderOptions.ShopHome("shop_home_all_items", eVar);
            this.f24605g = new C11140d1(this);
            addHeader(0);
            addHeader(1);
            addFooter(2);
        }

        /* renamed from: b */
        public final void mo31298b(int i) {
        }

        public final int getListItemViewType(int i) {
            return R.id.view_type_shop_home_listing;
        }

        /* renamed from: i */
        public final void mo31300i(int i) {
        }

        public final void onBindFooterViewHolder(RecyclerView.C3084b0 b0Var, int i) {
            C19383o.m32795e(b0Var, "null cannot be cast to non-null type com.etsy.android.ui.shop.viewholder.ShopSectionListingsCountFooterViewHolder");
            C11287l0 l0Var = (C11287l0) b0Var;
            int size = getItems().size();
            View view = l0Var.itemView;
            C19383o.m32795e(view, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view).setText(l0Var.itemView.getContext().getResources().getString(R.string.shop_home_section_listings_count, new Object[]{String.valueOf(size), String.valueOf(size)}));
        }

        public final void onBindHeaderViewHolder(RecyclerView.C3084b0 b0Var, int i) {
            if (b0Var instanceof C11291n0) {
                C11291n0 n0Var = (C11291n0) b0Var;
                ShopHomeSortOption access$getSelectedSortOption$p = ShopSectionListingsFragment.this.selectedSortOption;
                if (access$getSelectedSortOption$p != null) {
                    n0Var.getClass();
                    Context context = n0Var.itemView.getContext();
                    C19383o.m32796f(context, "itemView.context");
                    CollageSelectAdapter collageSelectAdapter = new CollageSelectAdapter(context, 0, 2, (DefaultConstructorMarker) null);
                    for (ShopHomeSortOption title : n0Var.f24920b) {
                        collageSelectAdapter.add(title.getTitle());
                    }
                    CollageSelectDropdown collageSelectDropdown = (CollageSelectDropdown) n0Var.itemView.findViewById(R.id.shop_section_listings_sort);
                    collageSelectDropdown.setCollageAdapter(collageSelectAdapter);
                    String title2 = access$getSelectedSortOption$p.getTitle();
                    C19383o.m32796f(title2, "selectedSort.title");
                    collageSelectDropdown.setSelection(title2);
                    collageSelectDropdown.setOnItemClickListener(new C11289m0(n0Var));
                    return;
                }
                C19383o.m32805o("selectedSortOption");
                throw null;
            }
        }

        public final void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
            List items = getItems();
            C19383o.m32796f(items, ResponseConstants.ITEMS);
            if (!items.isEmpty()) {
                C19383o.m32795e(b0Var, "null cannot be cast to non-null type com.etsy.android.uikit.viewholder.ListingCardViewHolder");
                ((ListingCardViewHolder) b0Var).mo38778g((ListingCard) getItems().get(i - getHeaderCount()));
            }
        }

        public final RecyclerView.C3084b0 onCreateFooterViewHolder(ViewGroup viewGroup, int i) {
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            return new C11287l0(viewGroup);
        }

        public final RecyclerView.C3084b0 onCreateHeaderViewHolder(ViewGroup viewGroup, int i) {
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            if (i == 0) {
                return new C11123b(viewGroup);
            }
            if (i == this.f24603e) {
                return new C11291n0(viewGroup, this.f24602d, new C11125x6fb397a3(ShopSectionListingsFragment.this));
            }
            throw new IllegalStateException("Unsupported header type");
        }

        public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            C12007s sVar = new C12007s(viewGroup);
            C9125j access$getListingCardClickHandler$p = ShopSectionListingsFragment.this.listingCardClickHandler;
            if (access$getListingCardClickHandler$p != null) {
                return new ListingCardViewHolder(access$getListingCardClickHandler$p, false, false, this.f24601c, this.f24604f, sVar);
            }
            C19383o.m32805o("listingCardClickHandler");
            throw null;
        }
    }

    /* renamed from: com.etsy.android.ui.shop.ShopSectionListingsFragment$a */
    public static final class C11122a {
    }

    /* renamed from: com.etsy.android.ui.shop.ShopSectionListingsFragment$b */
    public final class C11123b extends RecyclerView.C3084b0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11123b(ViewGroup viewGroup) {
            super(new View(viewGroup.getContext()));
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        }
    }

    /* renamed from: com.etsy.android.ui.shop.ShopSectionListingsFragment$c */
    public /* synthetic */ class C11124c implements C13078c, C19380l {
        public C11124c() {
        }

        /* renamed from: a */
        public final void mo31411a(C13074b bVar) {
            C19383o.m32797g(bVar, "p0");
            ShopSectionListingsFragment.this.onHeartUpdateReceived(bVar);
        }

        /* renamed from: b */
        public final FunctionReferenceImpl mo31531b() {
            return new FunctionReferenceImpl(1, ShopSectionListingsFragment.this, ShopSectionListingsFragment.class, "onHeartUpdateReceived", "onHeartUpdateReceived(Lcom/etsy/android/uikit/ui/favorites/HeartUpdate;)V", 0);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C13078c) || !(obj instanceof C19380l)) {
                return false;
            }
            return C19383o.m32792b(mo31531b(), ((C19380l) obj).mo31531b());
        }

        public final int hashCode() {
            return mo31531b().hashCode();
        }
    }

    private final void hideLoading() {
        RecyclerView recyclerView = this.shopSectionListingsRecyclerView;
        if (recyclerView != null) {
            ViewExtensions.m12869m(recyclerView);
            View view = this.shopSectionListingsErrorView;
            if (view != null) {
                ViewExtensions.m12860d(view);
                View view2 = this.shopSectionListingsLoadingView;
                if (view2 != null) {
                    ViewExtensions.m12860d(view2);
                } else {
                    C19383o.m32805o("shopSectionListingsLoadingView");
                    throw null;
                }
            } else {
                C19383o.m32805o("shopSectionListingsErrorView");
                throw null;
            }
        } else {
            C19383o.m32805o("shopSectionListingsRecyclerView");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void onHeartUpdateReceived(C13074b bVar) {
        List<T> items = this.adapter.getItems();
        int i = 0;
        if (!(items == null || items.isEmpty())) {
            if (bVar instanceof C13074b.C13076b) {
                int size = items.size();
                while (i < size) {
                    ListingCard listingCard = (ListingCard) items.get(i);
                    C13074b.C13076b bVar2 = (C13074b.C13076b) bVar;
                    if (listingCard.getListingId().getIdAsLong() == bVar2.f28749a) {
                        listingCard.setIsFavorite(bVar2.f28750b);
                        this.adapter.notifyItemChanged(i);
                    }
                    i++;
                }
            } else if (bVar instanceof C13074b.C13075a) {
                int size2 = items.size();
                while (i < size2) {
                    ListingCard listingCard2 = (ListingCard) items.get(i);
                    C13074b.C13075a aVar = (C13074b.C13075a) bVar;
                    if (listingCard2.getListingId().getIdAsLong() == aVar.f28745a) {
                        listingCard2.setHasCollections(aVar.f28746b);
                        this.adapter.notifyItemChanged(i);
                    }
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final List m35052onViewCreated$lambda0(ShopSectionListingsFragment shopSectionListingsFragment, C8999j.C9000a aVar) {
        C19383o.m32797g(shopSectionListingsFragment, "this$0");
        C19383o.m32797g(aVar, "state");
        if (aVar instanceof C8999j.C9000a.C9002b) {
            C8999j.C9000a.C9002b bVar = (C8999j.C9000a.C9002b) aVar;
            ShopHomeSortOption create = ShopHomeSortOption.create(bVar.f19866b, shopSectionListingsFragment.getResources());
            C19383o.m32796f(create, "create(state.sortOption, resources)");
            shopSectionListingsFragment.selectedSortOption = create;
            return shopSectionListingsFragment.processResults(bVar.f19865a);
        } else if (aVar instanceof C8999j.C9000a.C9001a) {
            return EmptyList.INSTANCE;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m35053onViewCreated$lambda1(ShopSectionListingsFragment shopSectionListingsFragment, List list) {
        C19383o.m32797g(shopSectionListingsFragment, "this$0");
        if (list == null || list.isEmpty()) {
            shopSectionListingsFragment.showError();
        } else {
            shopSectionListingsFragment.updateListingCards(list);
        }
    }

    private final List<ListingCardUiModel> processResults(List<? extends ListingCard> list) {
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (ListingCard listingCardUiModel : list) {
            arrayList.add(new ListingCardUiModel(listingCardUiModel, true, false, false, 8, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    private final void showError() {
        RecyclerView recyclerView = this.shopSectionListingsRecyclerView;
        if (recyclerView != null) {
            ViewExtensions.m12860d(recyclerView);
            View view = this.shopSectionListingsErrorView;
            if (view != null) {
                ViewExtensions.m12869m(view);
                View view2 = this.shopSectionListingsLoadingView;
                if (view2 != null) {
                    ViewExtensions.m12860d(view2);
                } else {
                    C19383o.m32805o("shopSectionListingsLoadingView");
                    throw null;
                }
            } else {
                C19383o.m32805o("shopSectionListingsErrorView");
                throw null;
            }
        } else {
            C19383o.m32805o("shopSectionListingsRecyclerView");
            throw null;
        }
    }

    private final void showLoading() {
        View view = this.shopSectionListingsLoadingView;
        if (view != null) {
            ViewExtensions.m12869m(view);
            RecyclerView recyclerView = this.shopSectionListingsRecyclerView;
            if (recyclerView != null) {
                ViewExtensions.m12860d(recyclerView);
                View view2 = this.shopSectionListingsErrorView;
                if (view2 != null) {
                    ViewExtensions.m12860d(view2);
                } else {
                    C19383o.m32805o("shopSectionListingsErrorView");
                    throw null;
                }
            } else {
                C19383o.m32805o("shopSectionListingsRecyclerView");
                throw null;
            }
        } else {
            C19383o.m32805o("shopSectionListingsLoadingView");
            throw null;
        }
    }

    private final void updateListingCards(List<ListingCardUiModel> list) {
        if (C19543e0.m33306Y(list)) {
            onLoadSuccess(list, this.listingCount);
        } else {
            showError();
        }
        hideLoading();
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

    public final C12673n getElkLogger() {
        C12673n nVar = this.elkLogger;
        if (nVar != null) {
            return nVar;
        }
        C19383o.m32805o("elkLogger");
        throw null;
    }

    public String getFragmentTitleString() {
        return C18263b.m30837c0(this.sectionTitle) ? this.sectionTitle : getResources().getString(R.string.shop_section);
    }

    public final C12796e getListingImagesRepository() {
        C12796e eVar = this.listingImagesRepository;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("listingImagesRepository");
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C8994h getRepository() {
        C8994h hVar = this.repository;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("repository");
        throw null;
    }

    public final C13461f getSchedulers() {
        C13461f fVar = this.schedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("schedulers");
        throw null;
    }

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        C8703p analyticsContext = getAnalyticsContext();
        C19383o.m32796f(analyticsContext, "analyticsContext");
        C8623e configMap = getConfigMap();
        C19383o.m32796f(configMap, "configMap");
        this.dependencies = new C12008t(requireContext, analyticsContext, configMap, getSession(), getListingImagesRepository());
        ShopHomeSortOption create = ShopHomeSortOption.create(ShopHomeSortOption.SORT_DATE_DESC, getResources());
        C19383o.m32796f(create, "create(ShopHomeSortOptio…ORT_DATE_DESC, resources)");
        this.selectedSortOption = create;
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean(IS_LISTINGS_REARRANGE_ENABLED, false);
        }
        List<ShopHomeSortOption> defaultSortOptions = ShopHomeSortOption.defaultSortOptions(getResources(), z);
        C19383o.m32796f(defaultSortOptions, "defaultSortOptions(resou…sListingRearrangeEnabled)");
        this.sortOptions = defaultSortOptions;
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12008t tVar = this.dependencies;
        if (tVar != null) {
            List<? extends ShopHomeSortOption> list = this.sortOptions;
            if (list != null) {
                C8623e configMap2 = getConfigMap();
                C19383o.m32796f(configMap2, "configMap");
                this.adapter = new ShopSectionListingsAdapter(requireActivity, tVar, list, configMap2);
                return;
            }
            C19383o.m32805o("sortOptions");
            throw null;
        }
        C19383o.m32805o("dependencies");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = getLayoutInflater().inflate(R.layout.fragment_shop_section_listings, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.loading_view);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.loading_view)");
        this.shopSectionListingsLoadingView = findViewById;
        View findViewById2 = inflate.findViewById(R.id.no_internet);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.no_internet)");
        this.shopSectionListingsErrorView = findViewById2;
        ViewExtensions.m12860d(inflate.findViewById(R.id.btn_retry_internet));
        C11829a<T> aVar = this.adapter;
        C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.ui.shop.ShopSectionListingsFragment.ShopSectionListingsAdapter");
        ((ShopSectionListingsAdapter) aVar).f26308b = this;
        C11829a<T> aVar2 = this.adapter;
        C19383o.m32795e(aVar2, "null cannot be cast to non-null type com.etsy.android.ui.shop.ShopSectionListingsFragment.ShopSectionListingsAdapter");
        this.listingCardClickHandler = new C9125j(this, (ShopSectionListingsAdapter) aVar2, getAnalyticsContext(), (C9126k.C9128b) null, getAdImpressionRepository());
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        C11829a<T> aVar3 = this.adapter;
        C19383o.m32795e(aVar3, "null cannot be cast to non-null type com.etsy.android.ui.shop.ShopSectionListingsFragment.ShopSectionListingsAdapter");
        gridLayoutManager.f7008K = ((ShopSectionListingsAdapter) aVar3).f24605g;
        View findViewById3 = inflate.findViewById(R.id.shop_section_listings_list);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.shop_section_listings_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        this.shopSectionListingsRecyclerView = recyclerView;
        recyclerView.addItemDecoration(new C11188p0.C11189a(getResources()));
        RecyclerView recyclerView2 = this.shopSectionListingsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(gridLayoutManager);
            RecyclerView recyclerView3 = this.shopSectionListingsRecyclerView;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(this.adapter);
                return inflate;
            }
            C19383o.m32805o("shopSectionListingsRecyclerView");
            throw null;
        }
        C19383o.m32805o("shopSectionListingsRecyclerView");
        throw null;
    }

    public void onDestroyView() {
        this.disposable.mo19405d();
        super.onDestroyView();
    }

    public void onLoadContent() {
        int apiOffset = getApiOffset();
        if (apiOffset == 0) {
            showLoading();
        }
        C8999j jVar = this.viewModel;
        if (jVar != null) {
            jVar.mo30658b(apiOffset, jVar.f19862h);
        } else {
            C19383o.m32805o("viewModel");
            throw null;
        }
    }

    public final void onSortOptionSelected(ShopHomeSortOption shopHomeSortOption) {
        C19383o.m32797g(shopHomeSortOption, "sortOption");
        showLoading();
        setApiOffset(0);
        setContentExhausted(false);
        this.adapter.clearData();
        C8999j jVar = this.viewModel;
        if (jVar != null) {
            jVar.f19862h = shopHomeSortOption;
            jVar.mo30658b(0, shopHomeSortOption);
            return;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        String string = arguments != null ? arguments.getString("shop_id") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("section_id");
        }
        String str3 = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str = arguments3.getString(SECTION_TITLE)) == null) {
            str = "";
        }
        this.sectionTitle = str;
        Bundle arguments4 = getArguments();
        this.listingCount = arguments4 != null ? arguments4.getInt(LISTING_COUNT) : 0;
        C8994h repository2 = getRepository();
        C13461f schedulers2 = getSchedulers();
        C12673n elkLogger2 = getElkLogger();
        C8623e configMap = getConfigMap();
        C19383o.m32796f(configMap, "configMap");
        C8999j jVar = (C8999j) new C2870k0((C2880m0) this, (C2870k0.C2872b) new C9003k(string, str3, repository2, schedulers2, elkLogger2, configMap)).mo10829a(C8999j.class);
        this.viewModel = jVar;
        PublishSubject<C8999j.C9000a> publishSubject = jVar.f19861g;
        C19172m c = C0472h.m1242c(publishSubject, publishSubject);
        getSchedulers().getClass();
        C19179q qVar = new C19179q(c.mo20639i(C13461f.m21235b()), new C8839l(this, 2));
        getSchedulers().getClass();
        LambdaObserver g = qVar.mo20635e(C13461f.m21236c()).mo20637g(new C13197c(this, 1));
        C7091a aVar = this.disposable;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(g);
        if (this.needsInitialLoad) {
            this.needsInitialLoad = false;
            loadContent();
        }
        Lifecycle lifecycle = getLifecycle();
        C19383o.m32796f(lifecycle, "lifecycle");
        new HeartMonitor(lifecycle, new C11124c());
    }

    public final void setAdImpressionRepository(C8267e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.adImpressionRepository = eVar;
    }

    public final void setElkLogger(C12673n nVar) {
        C19383o.m32797g(nVar, "<set-?>");
        this.elkLogger = nVar;
    }

    public final void setListingImagesRepository(C12796e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.listingImagesRepository = eVar;
    }

    public final void setRepository(C8994h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.repository = hVar;
    }

    public final void setSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.schedulers = fVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }
}
