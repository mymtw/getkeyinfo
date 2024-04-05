package com.etsy.android.p327ui.search.listingresults;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.core.widget.C2397b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2869k;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.media.MediaBrowserServiceCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.work.C3424m;
import androidx.work.C3437q;
import androidx.work.C3438r;
import com.appboy.Constants;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.view.C6486a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8707d;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.SearchImpressionMetadata;
import com.etsy.android.lib.models.TaxonomyNode;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.lib.models.apiv3.FacetCountListMap;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage;
import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable;
import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelableKt;
import com.etsy.android.lib.models.apiv3.SearchWithAds;
import com.etsy.android.lib.models.apiv3.search.GuidedSearch;
import com.etsy.android.lib.models.apiv3.search.QueryCorrection;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.lib.models.cardviewelement.SearchFilterHeader;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.persistviewed.PersistViewedBus;
import com.etsy.android.lib.push.settings.C8848c;
import com.etsy.android.p072ad.impressions.AdImpressionScrollListener;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.C11795y;
import com.etsy.android.p327ui.cardview.clickhandlers.C9134o;
import com.etsy.android.p327ui.cardview.clickhandlers.C9141v;
import com.etsy.android.p327ui.conversation.list.ccm.C9581e;
import com.etsy.android.p327ui.navigation.keys.dialogfragmentkeys.SavedSearchEmailPromptKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.search.C10744d;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.search.C10866i;
import com.etsy.android.p327ui.search.SearchResultsHeaderView;
import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.container.C10741a;
import com.etsy.android.p327ui.search.filters.C10755a;
import com.etsy.android.p327ui.search.listingresults.C10909i;
import com.etsy.android.p327ui.search.listingresults.C10920j;
import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState;
import com.etsy.android.p327ui.search.p330v2.C10969a;
import com.etsy.android.p327ui.search.p330v2.C10970b;
import com.etsy.android.p327ui.search.p330v2.C10971c;
import com.etsy.android.p327ui.search.p330v2.C10974e;
import com.etsy.android.p327ui.search.p330v2.C11027h;
import com.etsy.android.p327ui.search.p330v2.C11028i;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.C10978a;
import com.etsy.android.p327ui.search.p330v2.filters.C10980b;
import com.etsy.android.p327ui.search.p330v2.filters.C10982c;
import com.etsy.android.p327ui.search.p330v2.filters.FilterFormatter;
import com.etsy.android.p327ui.search.p330v2.filters.FilterType;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11010o;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11015r;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterParams;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchFiltersRequest;
import com.etsy.android.p327ui.search.p330v2.impressions.SearchImpressionsUploadWorker;
import com.etsy.android.p327ui.search.p330v2.relatedcategories.C11031a;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.qualtrics.C8951c;
import com.etsy.android.qualtrics.C8952d;
import com.etsy.android.search.savedsearch.C8984h;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import com.etsy.android.stylekit.views.C9053d;
import com.etsy.android.stylekit.views.ratings.C9072a;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionViewModel;
import com.etsy.android.uikit.p331ui.favorites.HeartMonitor;
import com.etsy.android.uikit.util.C11914o;
import com.etsy.android.uikit.viewholder.ListingCardUiModel;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.vespa.VespaBaseFragment;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.assetpacks.C15588c1;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C19410j;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.C19669s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.C19928a0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.PublishSubject;
import p248tp.C8071s;
import p277w8.C8267e;
import p344ef.C12697a;
import p346fa.C12703a;
import p350fe.C12724a;
import p350fe.C12741o;
import p356ge.C12788a;
import p356ge.C12790b;
import p357gf.C12796e;
import p400mf.C13074b;
import p400mf.C13078c;
import p402n9.C13089i;
import p414oe.C13163b;
import p414oe.C13164c;
import p414oe.C13166d;
import p415of.C13173c;
import p415of.C13182k;
import p415of.C13186o;
import p422pe.C13224c;
import p422pe.C13228g;
import p425q9.C13263n;
import p425q9.C13265p;
import p425q9.C13267q;
import p430qe.C13300a;
import p440s9.C13366a;
import p445sf.C13379a;
import p445sf.C13380b;
import p456ua.C13461f;
import p472wb.C13799a;
import p478x9.C13851a;
import p486y9.C13888d;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19857l;
import p759nq.C19920b;
import retrofit2.C20145v;
import retrofit2.HttpException;

/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment */
public final class SearchResultsListingsFragment extends VespaBaseFragment<Page> implements C13366a, C13228g.C13229a, C10974e, C13300a {
    public static final /* synthetic */ C19410j<Object>[] $$delegatedProperties;
    public static final int $stable = 8;
    public static final C10886a Companion = new C10886a();
    private static final int ITEMS_PER_PAGE = 30;
    private static final int ITEMS_PER_PAGE_FOR_3x3 = 50;
    private static final int LIMIT_FOR_FILTERS_REQUEST = 2;
    private static final String SAVE_IS_BROWSELISTINGS_LOGGED = "has_logged_browselistings";
    private static final String SAVE_SEARCH_IMPRESSION_DISPLAYED_LISTINGS = "displayed_listings";
    private static final String SAVE_SEARCH_IMPRESSION_ON_SCROLL_LISTENER_ENABLED = "enabled";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8267e adImpressionRepository;
    private AdImpressionScrollListener adImpressionsLogger;
    public C8629a appCurrency;
    private C10971c buyerFeatures;
    public Connectivity connectivity;
    public C13888d currentLocale;
    public C12724a deepLinkEligibility;
    public C13851a deepLinkEntityChecker;
    private final C7091a disposables = new C7091a();
    private final C19920b emptyTitle$delegate = C11795y.m19487a(this, R.id.new_search_empty_title);
    public C8630b etsyMoneyFactory;
    public C11780h favoriteRepository;
    private C11031a featuredCategoriesAdapter;
    private RecyclerView featuredCategoriesRecycler;
    private final FilterFormatter filterFormatter = new FilterFormatter();
    private final C19920b filtersRoot$delegate = C11795y.m19487a(this, R.id.new_search_empty_filter_list);
    private final C19920b filtersTitle$delegate = C11795y.m19487a(this, R.id.new_search_empty_filter_title);
    private SearchWithAds forwardedSearchWithAds;
    public C12703a grafana;
    private C10969a gridSpacingItemDecoration;
    public C12796e imagesRepository;
    private boolean isAttachedToSearchView;
    private boolean isBrowseListingsLogged;
    private ListingCardViewHolderOptions listingCardOptions;
    private int listingsPerRow2x2;
    private int listingsPerRow3x3;
    public C8694h logCat;
    public PersistViewedBus persistViewedBus;
    private C13163b priceFilter;
    public C13164c priceFilterHelper;
    public C8951c qualtricsWrapper;
    private final C19920b queriesRoot$delegate = C11795y.m19487a(this, R.id.new_search_empty_query_list);
    private final C19920b queriesTitle$delegate = C11795y.m19487a(this, R.id.new_search_empty_query_title);
    private C10970b queryReformulationsListItemDecoration;
    private final C7091a recentlyViewedDisposables = new C7091a();
    private final List<ViewTreeObserver.OnGlobalLayoutListener> recyclerViewGlobalLayoutListeners = new ArrayList();
    /* access modifiers changed from: private */
    public View relatedCategoriesHeaderView;
    private Bundle requestParams;
    public C12741o routeInspector;
    public C13461f rxSchedulers;
    private View saveSearchPrompt;
    public C8984h savedSearchViewDelegate;
    public C13461f schedulers;
    public C11010o searchFiltersEligibility;
    private final C13228g searchImpressionsOnScrollListener = new C13228g();
    public C10865h searchUriParser;
    public C13265p session;
    public C13267q sessionTimeManager;
    /* access modifiers changed from: private */
    public SearchResultsHeaderView stickyHeaderView;
    private TaxonomyNode taxonomyNode;
    private TransactionViewModel<C11869a> transactionViewModel;
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(SearchResultsListingsViewModel.class), new C10892x288446d5(new C10891x288446d4(this)), new SearchResultsListingsFragment$viewModel$2(this));
    public C8656o viewModelFactory;
    public C3437q workManager;

    /* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment$a */
    public static final class C10886a {
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment$b */
    public static final class C10887b extends RecyclerView.C3099n {
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
            C19383o.m32797g(rect, "outRect");
            C19383o.m32797g(view, "view");
            C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
            C19383o.m32797g(yVar, "state");
            rect.left = recyclerView.getResources().getDimensionPixelSize(R.dimen.clg_space_12);
            if (recyclerView.getChildAdapterPosition(view) == yVar.mo11715b() - 1) {
                rect.right = recyclerView.getResources().getDimensionPixelSize(R.dimen.clg_space_12);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment$c */
    public static final class C10888c extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ SearchResultsListingsFragment f24151b;

        public C10888c(SearchResultsListingsFragment searchResultsListingsFragment) {
            this.f24151b = searchResultsListingsFragment;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C19383o.m32797g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                this.f24151b.swipeRefreshLayout.setEnabled(false);
            }
            if (i == 0) {
                this.f24151b.swipeRefreshLayout.setEnabled(true);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment$d */
    public static final class C10889d extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ C12697a f24152b;

        public C10889d(C12697a aVar) {
            this.f24152b = aVar;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C19383o.m32797g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f24152b.mo45458a(recyclerView, i2);
        }
    }

    /* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment$e */
    public static final class C10890e implements C13078c {

        /* renamed from: a */
        public final /* synthetic */ SearchResultsListingsFragment f24153a;

        public C10890e(SearchResultsListingsFragment searchResultsListingsFragment) {
            this.f24153a = searchResultsListingsFragment;
        }

        /* renamed from: a */
        public final void mo31411a(C13074b bVar) {
            C19383o.m32797g(bVar, "update");
            if (this.f24153a.adapter != null && this.f24153a.adapter.getItemCount() != 0) {
                int i = 0;
                if (bVar instanceof C13074b.C13076b) {
                    while (i < this.f24153a.adapter.getItems().size()) {
                        if (this.f24153a.adapter.getItem(i) instanceof ListingCardUiModel) {
                            Object item = this.f24153a.adapter.getItem(i);
                            C19383o.m32795e(item, "null cannot be cast to non-null type com.etsy.android.uikit.viewholder.ListingCardUiModel");
                            ListingCardUiModel listingCardUiModel = (ListingCardUiModel) item;
                            C13074b.C13076b bVar2 = (C13074b.C13076b) bVar;
                            if (listingCardUiModel.getListingId().getIdAsLong() == bVar2.f28749a) {
                                listingCardUiModel.setIsFavorite(bVar2.f28750b);
                                this.f24153a.adapter.notifyItemChanged(i);
                                return;
                            }
                        }
                        i++;
                    }
                } else if (bVar instanceof C13074b.C13075a) {
                    while (i < this.f24153a.adapter.getItems().size()) {
                        if (this.f24153a.adapter.getItem(i) instanceof ListingCardUiModel) {
                            Object item2 = this.f24153a.adapter.getItem(i);
                            C19383o.m32795e(item2, "null cannot be cast to non-null type com.etsy.android.uikit.viewholder.ListingCardUiModel");
                            ListingCardUiModel listingCardUiModel2 = (ListingCardUiModel) item2;
                            C13074b.C13075a aVar = (C13074b.C13075a) bVar;
                            if (listingCardUiModel2.getListingId().getIdAsLong() == aVar.f28745a) {
                                listingCardUiModel2.setHasCollections(aVar.f28746b);
                                this.f24153a.adapter.notifyItemChanged(i);
                                return;
                            }
                        }
                        i++;
                    }
                }
            }
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SearchResultsListingsFragment.class, "emptyTitle", "getEmptyTitle()Landroid/widget/TextView;", 0);
        C19386q.f43269a.getClass();
        $$delegatedProperties = new C19410j[]{propertyReference1Impl, new PropertyReference1Impl(SearchResultsListingsFragment.class, "filtersTitle", "getFiltersTitle()Landroid/view/View;", 0), new PropertyReference1Impl(SearchResultsListingsFragment.class, "filtersRoot", "getFiltersRoot()Landroid/widget/LinearLayout;", 0), new PropertyReference1Impl(SearchResultsListingsFragment.class, "queriesTitle", "getQueriesTitle()Landroid/view/View;", 0), new PropertyReference1Impl(SearchResultsListingsFragment.class, "queriesRoot", "getQueriesRoot()Landroid/widget/LinearLayout;", 0)};
    }

    private final void attachToSearchView() {
        C10741a searchContainerComponent = getSearchContainerComponent();
        if (getSearchContainerComponent() instanceof C10866i.C10868b) {
            C19383o.m32795e(searchContainerComponent, "null cannot be cast to non-null type com.etsy.android.ui.search.SearchViewHelper.Provider");
            C10866i searchViewHelper = ((C10866i.C10868b) searchContainerComponent).getSearchViewHelper();
            if (searchViewHelper != null && getSession().mo45960e()) {
                searchViewHelper.mo36075g(this);
                searchViewHelper.mo36076h(getViewModel().mo36199f() != null);
            }
        }
        this.isAttachedToSearchView = true;
    }

    private final void bindSavedSearch(Long l) {
        getViewModel().mo36206m(l);
        setSearchHelperIsSaved(l != null);
    }

    private final void configureForCategoryRedirect(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("SEARCH_CATEGORY_REDIRECT");
        String str = null;
        SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable = parcelable instanceof SearchCategoryRedirectPageParcelable ? (SearchCategoryRedirectPageParcelable) parcelable : null;
        SearchCategoryRedirectPage searchCategoryRedirectPage = searchCategoryRedirectPageParcelable != null ? SearchCategoryRedirectPageParcelableKt.toSearchCategoryRedirectPage(searchCategoryRedirectPageParcelable) : null;
        this.forwardedSearchWithAds = searchCategoryRedirectPage != null ? searchCategoryRedirectPage.getSearchResults() : null;
        this.taxonomyNode = searchCategoryRedirectPage != null ? searchCategoryRedirectPage.getTaxonomyNode() : null;
        bundle.remove("SEARCH_CATEGORY_REDIRECT");
        SearchResultsListingsViewModel viewModel = getViewModel();
        if (searchCategoryRedirectPage != null) {
            str = searchCategoryRedirectPage.getFilterParam(SearchCategoryRedirectPage.PARAM_QUERY);
        }
        if (str == null) {
            str = "";
        }
        viewModel.mo36205l(str);
        if (bundle.containsKey(ResponseConstants.PAGE_LINK)) {
            C13379a pagination = getPagination();
            C19383o.m32795e(pagination, "null cannot be cast to non-null type com.etsy.android.vespa.pagination.PaginationForNextLink");
            ((C13380b) pagination).mo46066i(bundle.getString(ResponseConstants.PAGE_LINK));
            bundle.remove(ResponseConstants.PAGE_LINK);
        }
        getSearchContainerComponent().setQueryQuietly(getViewModel().mo36198e());
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void configureForRegularSearch(android.os.Bundle r26, android.os.Bundle r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r2 = r25.getViewModel()
            java.lang.String r3 = "SEARCH_QUERY"
            java.lang.String r4 = ""
            java.lang.String r3 = r1.getString(r3, r4)
            java.lang.String r4 = "fragmentArgs.getString(Nav.SEARCH_QUERY, \"\")"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            r2.mo36205l(r3)
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r2 = r25.getViewModel()
            java.lang.String r3 = "ANCHOR_LISTING_ID"
            r4 = 0
            java.lang.String r3 = r1.getString(r3, r4)
            kotlinx.coroutines.flow.StateFlowImpl r2 = r2.f24190t
        L_0x0025:
            java.lang.Object r8 = r2.getValue()
            r5 = r8
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r5 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r5
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = r15
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 262139(0x3fffb, float:3.67335E-40)
            r4 = r8
            r8 = r3
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r5 = com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState.m18908b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r4 = r2.mo72337i(r4, r5)
            if (r4 == 0) goto L_0x0176
            java.lang.String r2 = "SEARCH_REQUEST_PARAMS"
            android.os.Bundle r2 = r1.getBundle(r2)
            r0.requestParams = r2
            r2 = -1
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r4 = r25.getViewModel()
            java.lang.String r5 = "SAVED_SEARCH_ID"
            long r5 = r1.getLong(r5, r2)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.mo36206m(r5)
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r4 = r25.getViewModel()
            java.lang.Long r4 = r4.mo36199f()
            if (r4 != 0) goto L_0x0078
            goto L_0x0089
        L_0x0078:
            long r4 = r4.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0089
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r2 = r25.getViewModel()
            r4 = 0
            r2.mo36206m(r4)
            goto L_0x008a
        L_0x0089:
            r4 = 0
        L_0x008a:
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r2 = r25.getViewModel()
            java.lang.String r3 = "SEARCH_IS_RECENT_SEARCH"
            boolean r24 = r1.getBoolean(r3)
            kotlinx.coroutines.flow.StateFlowImpl r2 = r2.f24190t
        L_0x0096:
            java.lang.Object r3 = r2.getValue()
            r5 = r3
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r5 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 245759(0x3bfff, float:3.44382E-40)
            r20 = r24
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r5 = com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState.m18908b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r3 = r2.mo72337i(r3, r5)
            if (r3 == 0) goto L_0x0096
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r2 = r25.getViewModel()
            java.lang.String r3 = "SEARCH_WITH_NEW_FILTERS"
            boolean r3 = r1.getBoolean(r3)
            kotlinx.coroutines.flow.StateFlowImpl r2 = r2.f24190t
        L_0x00cf:
            java.lang.Object r15 = r2.getValue()
            r5 = r15
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r5 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r4 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 229375(0x37fff, float:3.21423E-40)
            r21 = r3
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r5 = com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState.m18908b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r4 = r2.mo72337i(r4, r5)
            if (r4 == 0) goto L_0x0173
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r2 = r25.getViewModel()
            java.lang.String r3 = "SEARCH_FEATURED_CATEGORIES"
            boolean r23 = r1.getBoolean(r3)
            kotlinx.coroutines.flow.StateFlowImpl r2 = r2.f24190t
        L_0x0109:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r4 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 261887(0x3feff, float:3.66982E-40)
            r13 = r23
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r4 = com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState.m18908b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r3 = r2.mo72337i(r3, r4)
            if (r3 == 0) goto L_0x0109
            if (r27 != 0) goto L_0x0151
            java.lang.String r2 = "search_taxonomy_id"
            java.lang.Long r2 = com.google.android.play.core.appupdate.C15562d.m25175M(r1, r2)
            java.lang.String r3 = "search_taxonomy_name"
            java.lang.String r1 = r1.getString(r3)
            if (r2 == 0) goto L_0x0151
            if (r1 == 0) goto L_0x0151
            com.etsy.android.lib.models.TaxonomyNode r4 = new com.etsy.android.lib.models.TaxonomyNode
            java.lang.String r2 = r2.toString()
            r4.<init>((java.lang.String) r2, (java.lang.String) r1)
            goto L_0x0152
        L_0x0151:
            r4 = 0
        L_0x0152:
            r0.taxonomyNode = r4
            pe.g r1 = r0.searchImpressionsOnScrollListener
            r1.f29078d = r0
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r2 = r25.getViewModel()
            java.lang.String r2 = r2.mo36198e()
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0168
            r2 = 1
            goto L_0x0169
        L_0x0168:
            r2 = 0
        L_0x0169:
            r1.f29076b = r2
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r1 = r25.getViewModel()
            r1.mo36201h()
            return
        L_0x0173:
            r4 = 0
            goto L_0x00cf
        L_0x0176:
            r4 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.listingresults.SearchResultsListingsFragment.configureForRegularSearch(android.os.Bundle, android.os.Bundle):void");
    }

    private final void configureRecyclerView(boolean z) {
        C10969a aVar = this.gridSpacingItemDecoration;
        if (aVar != null) {
            RecyclerView recyclerView = this.recyclerView;
            if (aVar != null) {
                recyclerView.removeItemDecoration(aVar);
            } else {
                C19383o.m32805o("gridSpacingItemDecoration");
                throw null;
            }
        }
        C10970b bVar = this.queryReformulationsListItemDecoration;
        if (bVar != null) {
            this.recyclerView.removeItemDecoration(bVar);
        }
        Resources resources = getResources();
        int dimensionPixelSize = z ? resources.getDimensionPixelSize(R.dimen.grid_divider_spacing_3x3) : resources.getDimensionPixelSize(R.dimen.clg_space_8);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.edge_edge_listing_spacing);
        C10744d dVar = new C10744d(dimensionPixelSize2, dimensionPixelSize2, !z);
        this.gridSpacingItemDecoration = dVar;
        this.recyclerView.addItemDecoration(dVar);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        int max = Math.max(dimensionPixelSize3 - dimensionPixelSize, 0);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.clg_space_24);
        C10970b bVar2 = new C10970b(dimensionPixelSize3, max, dimensionPixelSize4, Math.max(dimensionPixelSize4 - dimensionPixelSize, 0));
        this.queryReformulationsListItemDecoration = bVar2;
        this.recyclerView.addItemDecoration(bVar2);
    }

    private final View createFilterRemovalView(Activity activity, C10978a aVar) {
        View inflate = LayoutInflater.from(activity).inflate(R.layout.search_result_empty_filter_removal_view, (ViewGroup) null, false);
        C19383o.m32795e(inflate, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) inflate).setText(aVar.f24342a);
        int dimensionPixelSize = requireActivity().getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        int dimensionPixelSize2 = requireActivity().getResources().getDimensionPixelSize(R.dimen.clg_space_16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        inflate.setLayoutParams(layoutParams);
        inflate.setOnClickListener(new C10905e(0, this, aVar));
        return inflate;
    }

    /* access modifiers changed from: private */
    /* renamed from: createFilterRemovalView$lambda-22  reason: not valid java name */
    public static final void m35040createFilterRemovalView$lambda22(SearchResultsListingsFragment searchResultsListingsFragment, C10978a aVar, View view) {
        C19383o.m32797g(searchResultsListingsFragment, "this$0");
        C19383o.m32797g(aVar, "$filter");
        C10982c filtersViewModel = searchResultsListingsFragment.getFiltersViewModel();
        SearchOptions searchOptions = searchResultsListingsFragment.getFiltersViewModel().f24355k;
        ArrayList q1 = C19327t.m32661q1(searchResultsListingsFragment.getFiltersViewModel().f24354j);
        FilterFormatter filterFormatter2 = searchResultsListingsFragment.filterFormatter;
        C19383o.m32797g(searchOptions, "searchOptions");
        C19383o.m32797g(filterFormatter2, "filterFormatter");
        switch (C10978a.C10979a.f24344a[aVar.f24343b.ordinal()]) {
            case 1:
                searchOptions.resetCategoryFacets();
                break;
            case 2:
                searchOptions.setMarketplace(SearchOptions.MarketPlace.MARKETPLACE_ALL_ITEMS);
                q1 = FilterFormatter.m18954c(q1, FilterType.FILTER_MARKETPLACE);
                break;
            case 3:
                searchOptions.resetPriceLimit();
                q1 = FilterFormatter.m18954c(q1, FilterType.FILTER_PRICE);
                break;
            case 4:
                searchOptions.resetShipsToCountry();
                q1 = FilterFormatter.m18954c(q1, FilterType.FILTER_SHIPS_TO);
                break;
            case 5:
                searchOptions.getShopLocation().resetToDefault();
                q1 = FilterFormatter.m18954c(q1, FilterType.FILTER_SHOP_LOCATION);
                break;
            case 6:
                searchOptions.setAcceptsGiftCards(false);
                q1 = FilterFormatter.m18954c(q1, FilterType.FILTER_GIFT_CARDS);
                break;
            case 7:
                SortOrder.Companion.getClass();
                searchOptions.setSortOrder(SortOrder.DEFAULT);
                q1 = FilterFormatter.m18954c(q1, FilterType.OPTION_SORT_ORDER);
                break;
            case 8:
                searchOptions.setOnSale(false);
                q1 = FilterFormatter.m18954c(q1, FilterType.FILTER_ONSALE);
                break;
            case 9:
                searchOptions.setFreeShipping(false);
                q1 = FilterFormatter.m18954c(q1, FilterType.FILTER_FREE_SHIPPING);
                break;
            case 10:
                searchOptions.setOneDayShipping(false);
                q1 = FilterFormatter.m18954c(q1, FilterType.FILTER_1_DAY_SHIPPING);
                break;
            case 11:
                searchOptions.setThreeDayShipping(false);
                q1 = FilterFormatter.m18954c(q1, FilterType.FILTER_3_DAY_SHIPPING);
                break;
            case 12:
                searchOptions.setCustomizable(false);
                q1 = FilterFormatter.m18954c(q1, FilterType.FILTER_CUSTOMIZABLE);
                break;
            case 13:
                searchOptions.setGiftWrap(false);
                q1 = FilterFormatter.m18954c(q1, FilterType.FILTER_GIFT_WRAP);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        filtersViewModel.getClass();
        filtersViewModel.f24354j = q1;
        C10982c filtersViewModel2 = searchResultsListingsFragment.getFiltersViewModel();
        SearchOptions searchOptions2 = searchResultsListingsFragment.getFiltersViewModel().f24355k;
        filtersViewModel2.getClass();
        C19383o.m32797g(searchOptions2, "searchOptions");
        filtersViewModel2.f24356l.onNext(searchOptions2);
    }

    private final View createSimplifiedQueryView(FragmentActivity fragmentActivity, String str) {
        View inflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.search_result_empty_simplified_query_view, (ViewGroup) null, false);
        C19383o.m32795e(inflate, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) inflate).setText(str);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        inflate.setOnClickListener(new SearchResultsListingsFragment$createSimplifiedQueryView$1(str, this, fragmentActivity, PredefinedAnalyticsProperty.QUERY));
        return inflate;
    }

    private final void detachFromSearchView() {
        C10741a searchContainerComponent = getSearchContainerComponent();
        if (getSearchContainerComponent() instanceof C10866i.C10868b) {
            C19383o.m32795e(searchContainerComponent, "null cannot be cast to non-null type com.etsy.android.ui.search.SearchViewHelper.Provider");
            C10866i searchViewHelper = ((C10866i.C10868b) searchContainerComponent).getSearchViewHelper();
            if (searchViewHelper != null) {
                searchViewHelper.mo36075g((C13300a) null);
            }
        }
        this.isAttachedToSearchView = false;
    }

    private final int findSelectedFeaturedCategoryPosition(List<? extends IFormattedTaxonomyCategory> list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (((IFormattedTaxonomyCategory) list.get(i)).getFormats().contains(FormattedTaxonomyCategory.Format.SELECTED)) {
                return (i == 0 || i == list.size() + -1) ? i : i - 1;
            }
            i++;
        }
        return 0;
    }

    private final TextView getEmptyTitle() {
        return (TextView) this.emptyTitle$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final LinearLayout getFiltersRoot() {
        return (LinearLayout) this.filtersRoot$delegate.getValue(this, $$delegatedProperties[2]);
    }

    private final View getFiltersTitle() {
        return (View) this.filtersTitle$delegate.getValue(this, $$delegatedProperties[1]);
    }

    private final C10982c getFiltersViewModel() {
        return getViewModel().f24186p;
    }

    private final LinearLayout getQueriesRoot() {
        return (LinearLayout) this.queriesRoot$delegate.getValue(this, $$delegatedProperties[4]);
    }

    private final View getQueriesTitle() {
        return (View) this.queriesTitle$delegate.getValue(this, $$delegatedProperties[3]);
    }

    private final C10741a getSearchContainerComponent() {
        Fragment parentFragment = getParentFragment();
        C19383o.m32795e(parentFragment, "null cannot be cast to non-null type com.etsy.android.ui.search.container.SearchContainerComponent");
        return (C10741a) parentFragment;
    }

    /* access modifiers changed from: private */
    public final SearchResultsListingsViewModel getViewModel() {
        return (SearchResultsListingsViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void handle3x3Toggle(boolean z) {
        Object value;
        SearchResultsListingsState searchResultsListingsState;
        Object value2;
        boolean z2 = z;
        SearchResultsListingsViewModel viewModel = getViewModel();
        List<T> items = this.adapter.getItems();
        C19383o.m32796f(items, "adapter.items");
        SearchOptions searchOptions = getFiltersViewModel().f24355k;
        viewModel.getClass();
        C19383o.m32797g(searchOptions, "searchOptions");
        StateFlowImpl stateFlowImpl = viewModel.f24190t;
        do {
            value = stateFlowImpl.getValue();
            searchResultsListingsState = (SearchResultsListingsState) value;
        } while (!stateFlowImpl.mo72337i(value, z2 ? SearchResultsListingsState.m18908b(searchResultsListingsState, (ArrayList) null, (String) null, (String) null, (ListingCard) null, (GuidedSearch) null, (QueryCorrection) null, (List) null, (Long) null, false, 0, 0, (SearchFilterHeader) null, (List) null, SearchResultsListingsState.ViewMode.THREE_BY_THREE, false, false, (C10920j.C10921a) null, 253951) : SearchResultsListingsState.m18908b(searchResultsListingsState, (ArrayList) null, (String) null, (String) null, (ListingCard) null, (GuidedSearch) null, (QueryCorrection) null, (List) null, (Long) null, false, 0, 0, (SearchFilterHeader) null, (List) null, SearchResultsListingsState.ViewMode.TWO_BY_TWO, false, false, (C10920j.C10921a) null, 253951)));
        viewModel.f24185o.mo46761a().edit().putBoolean("show3x3viewTry2", z2).apply();
        if (viewModel.mo36200g() > 0) {
            ArrayList arrayList = new ArrayList();
            for (T next : items) {
                if (next instanceof ListingCardUiModel) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                EtsyId listingId = ((ListingCardUiModel) next2).getListingId();
                ListingCard c = viewModel.mo36196c();
                if (true ^ C19383o.m32792b(listingId, c != null ? c.getListingId() : null)) {
                    arrayList2.add(next2);
                }
            }
            Page b = viewModel.mo36195b(searchOptions, arrayList2, true);
            StateFlowImpl stateFlowImpl2 = viewModel.f24190t;
            do {
                value2 = stateFlowImpl2.getValue();
            } while (!stateFlowImpl2.mo72337i(value2, ((SearchResultsListingsState) value2).mo36191a(new C10909i.C10919j(b, ((SearchResultsListingsState) viewModel.f24191u.getValue()).f24167n == SearchResultsListingsState.ViewMode.THREE_BY_THREE))));
            viewModel.mo36201h();
        }
    }

    private final void handleError(Throwable th) {
        getViewModel().f24180j.mo21370b();
        int i = -1;
        if (th instanceof HttpException) {
            i = ((HttpException) th).code();
        }
        onLoadFailure(i);
    }

    /* access modifiers changed from: private */
    public final void handleListingRecentlyViewed(long j) {
        List items = getAdapter().getItems();
        C19383o.m32796f(items, "getAdapter()\n            .items");
        int i = 0;
        for (Object next : items) {
            int i2 = i + 1;
            if (i >= 0) {
                C13186o oVar = (C13186o) next;
                if (oVar instanceof ListingCardUiModel) {
                    ListingCardUiModel listingCardUiModel = (ListingCardUiModel) oVar;
                    if (listingCardUiModel.getListingId().getIdAsLong() == j) {
                        listingCardUiModel.setViewedInLast24Hours(true);
                        RecyclerView recyclerView = this.recyclerView;
                        if (recyclerView != null) {
                            recyclerView.post(new C10755a(this, i, 1));
                        }
                    }
                }
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: handleListingRecentlyViewed$lambda-18$lambda-17  reason: not valid java name */
    public static final void m35041handleListingRecentlyViewed$lambda18$lambda17(SearchResultsListingsFragment searchResultsListingsFragment, int i) {
        C19383o.m32797g(searchResultsListingsFragment, "this$0");
        searchResultsListingsFragment.getAdapter().notifyItemChanged(i);
    }

    private final void handleSearchResultsLoaded(C10909i.C10914e eVar) {
        updatePctDiscount();
        onLoadComplete(eVar.f24224a);
        getViewModel().f24180j.mo21371c();
    }

    private final void handleSideEffect(C10909i iVar) {
        Object value;
        SearchResultsListingsState searchResultsListingsState;
        C10909i iVar2 = iVar;
        if (iVar2 instanceof C10909i.C10913d) {
            handleError(((C10909i.C10913d) iVar2).f24223a);
        } else if (iVar2 instanceof C10909i.C10918i) {
            C10909i.C10918i iVar3 = (C10909i.C10918i) iVar2;
            updateFilterHeader(iVar3.f24228a, iVar3.f24229b);
        } else if (C19383o.m32792b(iVar2, C10909i.C10915f.f24225a)) {
            setViewsForFirstPageLoad();
        } else if (iVar2 instanceof C10909i.C10919j) {
            C10909i.C10919j jVar = (C10909i.C10919j) iVar2;
            updateGridSize(jVar.f24230a, jVar.f24231b);
        } else if (iVar2 instanceof C10909i.C10910a) {
            C10909i.C10910a aVar = (C10909i.C10910a) iVar2;
            getAnalyticsContext().mo21333d(aVar.f24219a, aVar.f24220b);
        } else if (iVar2 instanceof C10909i.C10912c) {
            SearchFilterHeader d = getViewModel().mo36197d();
            if (d != null) {
                updateStickyHeaderView(d);
            }
        } else if (iVar2 instanceof C10909i.C10914e) {
            handleSearchResultsLoaded((C10909i.C10914e) iVar2);
        } else if (iVar2 instanceof C10909i.C10911b) {
            this.adapter.clear();
        } else if (iVar2 instanceof C10909i.C10916g) {
            showSavedSearchEmailPrompt();
        } else if (iVar2 instanceof C10909i.C10917h) {
            showSaveSearchOnboardingPrompt();
        }
        SearchResultsListingsViewModel viewModel = getViewModel();
        viewModel.getClass();
        C19383o.m32797g(iVar2, "sideEffect");
        StateFlowImpl stateFlowImpl = viewModel.f24190t;
        do {
            value = stateFlowImpl.getValue();
            searchResultsListingsState = (SearchResultsListingsState) value;
            searchResultsListingsState.getClass();
        } while (!stateFlowImpl.mo72337i(value, SearchResultsListingsState.m18908b(searchResultsListingsState, C19327t.m32649e1(iVar2, searchResultsListingsState.f24154a), (String) null, (String) null, (ListingCard) null, (GuidedSearch) null, (QueryCorrection) null, (List) null, (Long) null, false, 0, 0, (SearchFilterHeader) null, (List) null, (SearchResultsListingsState.ViewMode) null, false, false, (C10920j.C10921a) null, 262142)));
    }

    /* access modifiers changed from: private */
    public final void handleState(SearchResultsListingsState searchResultsListingsState) {
        showUi(searchResultsListingsState.f24171r);
        C10909i iVar = (C10909i) C19327t.m32640V0(searchResultsListingsState.f24154a);
        if (iVar != null) {
            handleSideEffect(iVar);
        }
        bindSavedSearch(searchResultsListingsState.f24161h);
        setRelatedCategoriesInAdapter(searchResultsListingsState.f24166m);
    }

    private final void init(Bundle bundle) {
        if (bundle != null) {
            this.isBrowseListingsLogged = bundle.getBoolean(SAVE_IS_BROWSELISTINGS_LOGGED, false);
        }
    }

    private final void initRelatedCategories(RecyclerView recyclerView) {
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.addItemDecoration(new C10887b());
        if (this.swipeRefreshLayout != null) {
            recyclerView.addOnScrollListener(new C10888c(this));
        }
    }

    private final void initTopLevelFacet() {
        TaxonomyNode taxonomyNode2 = this.taxonomyNode;
        if (taxonomyNode2 != null) {
            getFiltersViewModel().f24355k.setCategoryFacets(C17782b.m29864d0(new FacetCount(taxonomyNode2.getTaxonomyNodeId().getId(), taxonomyNode2.getName(), 0)));
        }
        this.taxonomyNode = null;
    }

    /* access modifiers changed from: private */
    public final boolean is3x3ViewShown() {
        return ((SearchResultsListingsState) getViewModel().f24191u.getValue()).f24167n == SearchResultsListingsState.ViewMode.THREE_BY_THREE;
    }

    private final boolean keepListings(C13186o oVar) {
        if (oVar instanceof ListingCardUiModel) {
            EtsyId listingId = ((ListingCardUiModel) oVar).getListingId();
            ListingCard c = getViewModel().mo36196c();
            if (!C19383o.m32792b(listingId, c != null ? c.getListingId() : null)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void loadOriginalQuery(String str) {
        SearchOptions searchOptions;
        String str2 = null;
        if (str.length() > 0) {
            Uri parse = Uri.parse(str);
            SearchOptions.Companion companion = SearchOptions.Companion;
            C10865h searchUriParser2 = getSearchUriParser();
            C19383o.m32796f(parse, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            C8694h logCat2 = getLogCat();
            companion.getClass();
            searchOptions = SearchOptions.Companion.m18947a(searchUriParser2, parse, logCat2);
        } else {
            searchOptions = null;
        }
        if (searchOptions != null) {
            str2 = searchOptions.getQuery();
        }
        getSearchContainerComponent().navigateToSearchResults(str2, searchOptions);
    }

    private final void loadResults() {
        if (this.taxonomyNode != null) {
            loadSearchResultsWithTaxonomyFilter();
        } else {
            loadSearchResults();
        }
    }

    private final void loadSearchResults() {
        EtsyId listingId;
        Object value;
        SearchResultsListingsViewModel viewModel = getViewModel();
        SearchOptions searchOptions = getFiltersViewModel().f24355k;
        Bundle bundle = this.requestParams;
        viewModel.getClass();
        C19383o.m32797g(searchOptions, "searchOptions");
        String str = viewModel.f24179i.f29305a;
        boolean z = str == null || str.length() == 0;
        if (z) {
            StateFlowImpl stateFlowImpl = viewModel.f24190t;
            do {
                value = stateFlowImpl.getValue();
            } while (!stateFlowImpl.mo72337i(value, ((SearchResultsListingsState) value).mo36191a(C10909i.C10915f.f24225a)));
        }
        searchOptions.setCategoryProlist(true);
        viewModel.f24180j.mo21369a();
        boolean z2 = viewModel.f24176f.f26665k;
        String e = viewModel.mo36198e();
        String str2 = ((SearchResultsListingsState) viewModel.f24191u.getValue()).f24156c;
        if (str2 == null) {
            ListingCard c = viewModel.mo36196c();
            str2 = (c == null || (listingId = c.getListingId()) == null) ? null : listingId.getId();
        }
        C19697g.m33468f(C19388s.m32866i0(viewModel), (CoroutineContext) null, (CoroutineStart) null, new SearchResultsListingsViewModel$loadSearchResults$2(viewModel, new C11015r(e, str2, searchOptions, viewModel.f24177g.mo21246a(), C15562d.m25187Y(bundle), viewModel.f24178h, (Integer) null, viewModel.f24179i.f29305a, (Boolean) null, true, z2, (C8707d) null, viewModel.mo36199f(), Boolean.valueOf(((SearchResultsListingsState) viewModel.f24191u.getValue()).f24162i)), z, (C19340c<? super SearchResultsListingsViewModel$loadSearchResults$2>) null), 3);
    }

    private final void loadSearchResultsWithTaxonomyFilter() {
        initTopLevelFacet();
        loadSearchResults();
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    public static final void m35042onCreateView$lambda1(BOEActivity bOEActivity, View view, boolean z) {
        if (z) {
            C12788a.m20424c(bOEActivity, new SearchContainerKey(C19421p.m32935c0(bOEActivity), (SearchSpec) null, (SearchRedirectSpec) null, (Bundle) null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-2  reason: not valid java name */
    public static final void m35043onCreateView$lambda2(SearchResultsListingsFragment searchResultsListingsFragment, SearchOptions searchOptions) {
        C19383o.m32797g(searchResultsListingsFragment, "this$0");
        View view = searchResultsListingsFragment.emptyView;
        C19383o.m32796f(view, "emptyView");
        if (view.getVisibility() == 0) {
            searchResultsListingsFragment.resetAndLoadContent();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-3  reason: not valid java name */
    public static final void m35044onCreateView$lambda3(SearchResultsListingsFragment searchResultsListingsFragment, SearchOptions searchOptions) {
        C19383o.m32797g(searchResultsListingsFragment, "this$0");
        SearchFilterHeader d = searchResultsListingsFragment.getViewModel().mo36197d();
        if (d != null) {
            FilterFormatter filterFormatter2 = searchResultsListingsFragment.filterFormatter;
            List<C10978a> list = searchResultsListingsFragment.getFiltersViewModel().f24354j;
            filterFormatter2.getClass();
            d.setSubtitle(FilterFormatter.m18953b(list));
        }
        searchResultsListingsFragment.resetAndLoadContent();
    }

    private final void onEmptyResults(List<String> list) {
        ViewExtensions.m12860d(this.stickyHeaderView);
        ViewExtensions.m12860d(this.relatedCategoriesHeaderView);
        ArrayList c = getFiltersViewModel().mo36466c();
        ViewExtensions.m12860d(getFiltersTitle());
        getFiltersRoot().removeAllViews();
        ViewExtensions.m12860d(getQueriesTitle());
        getQueriesRoot().removeAllViews();
        getEmptyTitle().setText(getQuery().length() == 0 ? getResources().getString(R.string.new_search_empty_view_title_for_no_query) : getResources().getString(R.string.new_search_empty_view_title, new Object[]{getQuery()}));
        if (!c.isEmpty()) {
            ViewExtensions.m12869m(getFiltersTitle());
            Iterator it = c.iterator();
            while (it.hasNext()) {
                getFiltersRoot().addView(createFilterRemovalView(getActivity(), (C10978a) it.next()));
            }
        }
        if (!list.isEmpty()) {
            ViewExtensions.m12869m(getQueriesTitle());
            for (String createSimplifiedQueryView : list) {
                LinearLayout queriesRoot = getQueriesRoot();
                FragmentActivity requireActivity = requireActivity();
                C19383o.m32796f(requireActivity, "requireActivity()");
                queriesRoot.addView(createSimplifiedQueryView(requireActivity, createSimplifiedQueryView));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void priceFilterClicked(C13166d dVar, boolean z) {
        C13163b bVar = this.priceFilter;
        if (bVar != null) {
            C10982c filtersViewModel = getFiltersViewModel();
            filtersViewModel.getClass();
            C19383o.m32797g(dVar, "selectedPriceOption");
            FilterFormatter filterFormatter2 = filtersViewModel.f24358n;
            List<C10978a> list = filtersViewModel.f24354j;
            FilterType filterType = FilterType.FILTER_PRICE;
            filterFormatter2.getClass();
            filtersViewModel.f24354j = FilterFormatter.m18954c(list, filterType);
            filtersViewModel.f24355k.setUserSpecifiedMax(false);
            filtersViewModel.f24355k.setUserSpecifiedMin(false);
            List<C13166d> list2 = bVar.f28955c;
            filtersViewModel.f24350f.getClass();
            ArrayList h = C13164c.m20821h(dVar, list2, z);
            bVar.f28955c = h;
            SearchOptions searchOptions = filtersViewModel.f24355k;
            filtersViewModel.f24350f.getClass();
            searchOptions.setMinPrice(C13164c.m20820f(dVar, h));
            SearchOptions searchOptions2 = filtersViewModel.f24355k;
            filtersViewModel.f24350f.getClass();
            searchOptions2.setMaxPrice(C13164c.m20819e(dVar, h));
            if (filtersViewModel.f24355k.hasMinPrice() || filtersViewModel.f24355k.hasMaxPrice()) {
                SearchOptions searchOptions3 = filtersViewModel.f24355k;
                filtersViewModel.mo36465b(C10980b.m18955a(searchOptions3, searchOptions3.hasMaxPrice(), filtersViewModel.f24346b, filtersViewModel.f24347c, filtersViewModel.f24349e));
            }
            filtersViewModel.f24357m.onNext(filtersViewModel.f24355k);
        }
    }

    private final void setRelatedCategoriesInAdapter(List<? extends IFormattedTaxonomyCategory> list) {
        if (list != null) {
            if (this.featuredCategoriesAdapter == null && getActivity() != null) {
                C8703p analyticsContext = getAnalyticsContext();
                C19383o.m32796f(analyticsContext, "analyticsContext");
                this.featuredCategoriesAdapter = new C11031a(new C9134o(this, analyticsContext));
            }
            C11031a aVar = this.featuredCategoriesAdapter;
            if (aVar != null) {
                RecyclerView recyclerView = this.featuredCategoriesRecycler;
                if (recyclerView != null) {
                    recyclerView.setAdapter(aVar);
                    aVar.f24458c = list;
                    aVar.notifyDataSetChanged();
                    RecyclerView recyclerView2 = this.featuredCategoriesRecycler;
                    if (recyclerView2 != null) {
                        recyclerView2.scrollToPosition(findSelectedFeaturedCategoryPosition(list));
                    } else {
                        C19383o.m32805o("featuredCategoriesRecycler");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("featuredCategoriesRecycler");
                    throw null;
                }
            }
        }
    }

    private final void setSearchHelperIsSaved(boolean z) {
        if (((getActivity() instanceof C10741a) || (getParentFragment() instanceof C10741a)) && (getSearchContainerComponent() instanceof C10866i.C10868b)) {
            C10741a searchContainerComponent = getSearchContainerComponent();
            C19383o.m32795e(searchContainerComponent, "null cannot be cast to non-null type com.etsy.android.ui.search.SearchViewHelper.Provider");
            C10866i searchViewHelper = ((C10866i.C10868b) searchContainerComponent).getSearchViewHelper();
            if (searchViewHelper != null) {
                searchViewHelper.mo36076h(z);
            }
        }
    }

    private final void setSearchWithAdsResults(SearchWithAds searchWithAds, boolean z) {
        getViewModel().mo36207n(searchWithAds, z);
    }

    private final void setViewsForFirstPageLoad() {
        ViewExtensions.m12860d(this.emptyView);
        setRefreshing(true);
        getAdImpressionRepository().f18117j.clear();
        this.searchImpressionsOnScrollListener.f29077c.clear();
        getViewModel().mo36204k(0);
    }

    private final void showSaveSearchOnboardingPrompt() {
        if (getView() != null) {
            if (this.saveSearchPrompt == null) {
                View findViewById = requireView().findViewById(R.id.saveSearchTooltip);
                C19383o.m32796f(findViewById, "requireView().findViewById(R.id.saveSearchTooltip)");
                this.saveSearchPrompt = findViewById;
                findViewById.findViewById(R.id.tooltip_x).setOnClickListener(new C6486a(this, 3));
            }
            View view = this.saveSearchPrompt;
            if (view != null) {
                ViewExtensions.m12869m(view);
                View view2 = this.saveSearchPrompt;
                if (view2 != null) {
                    view2.setAlpha(0.0f);
                    View view3 = this.saveSearchPrompt;
                    if (view3 != null) {
                        view3.animate().setDuration(200).alpha(1.0f).start();
                        getAnalyticsContext().mo21333d("save_search_prompt_seen", (Map<? extends AnalyticsProperty, Object>) null);
                        return;
                    }
                    C19383o.m32805o("saveSearchPrompt");
                    throw null;
                }
                C19383o.m32805o("saveSearchPrompt");
                throw null;
            }
            C19383o.m32805o("saveSearchPrompt");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showSaveSearchOnboardingPrompt$lambda-21  reason: not valid java name */
    public static final void m35045showSaveSearchOnboardingPrompt$lambda21(SearchResultsListingsFragment searchResultsListingsFragment, View view) {
        C19383o.m32797g(searchResultsListingsFragment, "this$0");
        View view2 = searchResultsListingsFragment.saveSearchPrompt;
        if (view2 != null) {
            view2.animate().setDuration(200).alpha(0.0f).withEndAction(new C2397b(searchResultsListingsFragment, 1)).start();
        } else {
            C19383o.m32805o("saveSearchPrompt");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showSaveSearchOnboardingPrompt$lambda-21$lambda-20  reason: not valid java name */
    public static final void m35046showSaveSearchOnboardingPrompt$lambda21$lambda20(SearchResultsListingsFragment searchResultsListingsFragment) {
        C19383o.m32797g(searchResultsListingsFragment, "this$0");
        View view = searchResultsListingsFragment.saveSearchPrompt;
        if (view != null) {
            ViewExtensions.m12860d(view);
        } else {
            C19383o.m32805o("saveSearchPrompt");
            throw null;
        }
    }

    private final void showSavedSearchEmailPrompt() {
        getAnalyticsContext().mo21333d("saved_search_email_prompt_seen", (Map<? extends AnalyticsProperty, Object>) null);
        C12790b.m20430b(this, new SavedSearchEmailPromptKey(C12790b.m20432d(this)));
    }

    /* access modifiers changed from: private */
    public final void showSearchFilters() {
        List<FacetCount> list = null;
        getAnalyticsContext().mo21333d("filter_button_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        SearchFiltersRequest searchFiltersRequest = new SearchFiltersRequest(getViewModel().mo36198e(), ((SearchResultsListingsState) getViewModel().f24191u.getValue()).f24156c, getFiltersViewModel().f24355k, getAppCurrency().mo21246a(), this.requestParams, 2, Boolean.valueOf(((SearchResultsListingsState) getViewModel().f24191u.getValue()).f24162i));
        String e = getViewModel().mo36198e();
        FacetCountListMap facetCountListMap = getFiltersViewModel().f24351g;
        List attributeFacets = facetCountListMap != null ? facetCountListMap.getAttributeFacets() : null;
        if (attributeFacets == null) {
            attributeFacets = EmptyList.INSTANCE;
        }
        List list2 = attributeFacets;
        FacetCountListMap facetCountListMap2 = getFiltersViewModel().f24351g;
        if (facetCountListMap2 != null) {
            list = facetCountListMap2.getCategoryFacetCounts();
        }
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        getSearchContainerComponent().onFiltersClicked(new FilterParams(e, list2, list, getFiltersViewModel().f24352h, getFiltersViewModel().f24353i, getFiltersViewModel().f24355k, searchFiltersRequest, getViewModel().mo36200g()));
    }

    private final void showUi(C10920j jVar) {
        if (!(jVar instanceof C10920j.C10922b) && (jVar instanceof C10920j.C10921a)) {
            onEmptyResults(((C10920j.C10921a) jVar).f24232a);
        }
    }

    private final void trackSaveSearchEvent(boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PredefinedAnalyticsProperty.CONTENT_SOURCE, MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
        if (z) {
            getAnalyticsContext().mo21333d("create_saved_search", linkedHashMap);
        } else {
            getAnalyticsContext().mo21333d("delete_saved_search", linkedHashMap);
        }
    }

    private final void updateFilterHeader(int i, QueryCorrection queryCorrection) {
        SearchFilterHeader d = getViewModel().mo36197d();
        if (d != null) {
            d.setTitle(getResources().getQuantityString(R.plurals.item_lowercase_quantity, i, new Object[]{NumberFormat.getInstance().format((long) i)}));
            FilterFormatter filterFormatter2 = this.filterFormatter;
            List<C10978a> list = getFiltersViewModel().f24354j;
            filterFormatter2.getClass();
            d.setSubtitle(FilterFormatter.m18953b(list));
            FilterFormatter filterFormatter3 = this.filterFormatter;
            ArrayList c = getFiltersViewModel().mo36466c();
            Resources resources = getResources();
            C19383o.m32796f(resources, "resources");
            filterFormatter3.getClass();
            d.setCategories(FilterFormatter.m18952a(c, resources));
            if (queryCorrection != null) {
                d.setQueryCorrection(queryCorrection);
            }
            updateStickyHeaderView(d);
        }
    }

    private final void updateGridSize(Page page, boolean z) {
        RecyclerView.C3100o layoutManager = this.recyclerView.getLayoutManager();
        C19383o.m32795e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int P0 = ((GridLayoutManager) layoutManager).mo11279P0();
        addPage(page, true);
        this.adapter.notifyDataSetChanged();
        configureRecyclerView(z);
        if (P0 >= 0) {
            this.recyclerView.scrollToPosition(P0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updatePctDiscount() {
        /*
            r7 = this;
            com.etsy.android.ui.search.v2.filters.c r0 = r7.getFiltersViewModel()
            com.etsy.android.ui.search.v2.SearchOptions r1 = r0.f24355k
            java.lang.String r1 = r1.getPctDiscountMin()
            com.etsy.android.ui.search.v2.SearchOptions r2 = r0.f24355k
            java.lang.String r2 = r2.getPctDiscountMax()
            int r3 = r1.length()
            r4 = 1
            r5 = 0
            if (r3 <= 0) goto L_0x001a
            r3 = r4
            goto L_0x001b
        L_0x001a:
            r3 = r5
        L_0x001b:
            java.lang.String r6 = "resources.getString(\n   …ountMin\n                )"
            if (r3 == 0) goto L_0x004b
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0027
            r3 = r4
            goto L_0x0028
        L_0x0027:
            r3 = r5
        L_0x0028:
            if (r3 == 0) goto L_0x004b
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
            if (r2 == 0) goto L_0x004b
            android.content.res.Resources r2 = r0.f24346b
            r3 = 2131952674(0x7f130422, float:1.9541797E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r1
            java.lang.String r1 = r2.getString(r3, r4)
            kotlin.jvm.internal.C19383o.m32796f(r1, r6)
            com.etsy.android.ui.search.v2.filters.a r2 = new com.etsy.android.ui.search.v2.filters.a
            com.etsy.android.ui.search.v2.filters.FilterType r3 = com.etsy.android.p327ui.search.p330v2.filters.FilterType.FILTER_ONSALE
            r2.<init>(r1, r3)
            r0.mo36465b(r2)
            goto L_0x0080
        L_0x004b:
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0053
            r2 = r4
            goto L_0x0054
        L_0x0053:
            r2 = r5
        L_0x0054:
            if (r2 == 0) goto L_0x0071
            android.content.res.Resources r2 = r0.f24346b
            r3 = 2131952675(0x7f130423, float:1.95418E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r1
            java.lang.String r1 = r2.getString(r3, r4)
            kotlin.jvm.internal.C19383o.m32796f(r1, r6)
            com.etsy.android.ui.search.v2.filters.a r2 = new com.etsy.android.ui.search.v2.filters.a
            com.etsy.android.ui.search.v2.filters.FilterType r3 = com.etsy.android.p327ui.search.p330v2.filters.FilterType.FILTER_ONSALE
            r2.<init>(r1, r3)
            r0.mo36465b(r2)
            goto L_0x0080
        L_0x0071:
            com.etsy.android.ui.search.v2.filters.FilterFormatter r1 = r0.f24358n
            java.util.List<com.etsy.android.ui.search.v2.filters.a> r2 = r0.f24354j
            com.etsy.android.ui.search.v2.filters.FilterType r3 = com.etsy.android.p327ui.search.p330v2.filters.FilterType.FILTER_ONSALE
            r1.getClass()
            java.util.ArrayList r1 = com.etsy.android.p327ui.search.p330v2.filters.FilterFormatter.m18954c(r2, r3)
            r0.f24354j = r1
        L_0x0080:
            com.etsy.android.ui.search.v2.SearchOptions r1 = r0.f24355k
            java.lang.String r2 = "searchOptions"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            io.reactivex.subjects.PublishSubject<com.etsy.android.ui.search.v2.SearchOptions> r0 = r0.f24356l
            r0.onNext(r1)
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r0 = r7.getViewModel()
            com.etsy.android.lib.models.cardviewelement.SearchFilterHeader r0 = r0.mo36197d()
            if (r0 == 0) goto L_0x00c8
            com.etsy.android.ui.search.v2.filters.FilterFormatter r1 = r7.filterFormatter
            com.etsy.android.ui.search.v2.filters.c r2 = r7.getFiltersViewModel()
            java.util.List<com.etsy.android.ui.search.v2.filters.a> r2 = r2.f24354j
            r1.getClass()
            java.lang.String r1 = com.etsy.android.p327ui.search.p330v2.filters.FilterFormatter.m18953b(r2)
            r0.setSubtitle(r1)
            com.etsy.android.ui.search.v2.filters.FilterFormatter r1 = r7.filterFormatter
            com.etsy.android.ui.search.v2.filters.c r2 = r7.getFiltersViewModel()
            java.util.ArrayList r2 = r2.mo36466c()
            android.content.res.Resources r3 = r7.getResources()
            java.lang.String r4 = "resources"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            r1.getClass()
            java.lang.String r1 = com.etsy.android.p327ui.search.p330v2.filters.FilterFormatter.m18952a(r2, r3)
            r0.setCategories(r1)
            kotlin.m r0 = kotlin.C19394m.f43287a
            goto L_0x00c9
        L_0x00c8:
            r0 = 0
        L_0x00c9:
            if (r0 != 0) goto L_0x00f0
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r0 = r7.getViewModel()
            com.etsy.android.lib.models.cardviewelement.SearchFilterHeader r1 = new com.etsy.android.lib.models.cardviewelement.SearchFilterHeader
            r2 = 2131953387(0x7f1306eb, float:1.9543244E38)
            java.lang.String r2 = r7.getString(r2)
            r1.<init>(r2)
            com.etsy.android.ui.search.v2.filters.FilterFormatter r2 = r7.filterFormatter
            com.etsy.android.ui.search.v2.filters.c r3 = r7.getFiltersViewModel()
            java.util.List<com.etsy.android.ui.search.v2.filters.a> r3 = r3.f24354j
            r2.getClass()
            java.lang.String r2 = com.etsy.android.p327ui.search.p330v2.filters.FilterFormatter.m18953b(r3)
            r1.setSubtitle(r2)
            r0.mo36203j(r1)
        L_0x00f0:
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r0 = r7.getViewModel()
            com.etsy.android.lib.models.cardviewelement.SearchFilterHeader r0 = r0.mo36197d()
            if (r0 == 0) goto L_0x00fd
            r7.updateStickyHeaderView(r0)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.listingresults.SearchResultsListingsFragment.updatePctDiscount():void");
    }

    private final void updateStickyHeaderView(SearchFilterHeader searchFilterHeader) {
        C8703p analyticsContext = getAnalyticsContext();
        C19383o.m32796f(analyticsContext, "analyticsContext");
        C9141v vVar = new C9141v(analyticsContext, new C10894x36cefc78(this), new C10895x36cefc79(this), new C10896x36cefc7a(this), new C10897x36cefc7b(this));
        this.priceFilter = getPriceFilterHelper().mo45881a(getViewModel().f24186p.f24355k, getViewModel().f24186p.f24352h, true);
        SearchResultsHeaderView searchResultsHeaderView = this.stickyHeaderView;
        if (searchResultsHeaderView != null) {
            searchResultsHeaderView.bind(searchFilterHeader, vVar, false, is3x3ViewShown(), this.priceFilter);
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
        return "";
    }

    public final C8629a getAppCurrency() {
        C8629a aVar = this.appCurrency;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("appCurrency");
        throw null;
    }

    public final Connectivity getConnectivity() {
        Connectivity connectivity2 = this.connectivity;
        if (connectivity2 != null) {
            return connectivity2;
        }
        C19383o.m32805o("connectivity");
        throw null;
    }

    public final C13888d getCurrentLocale() {
        C13888d dVar = this.currentLocale;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("currentLocale");
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

    public final C8630b getEtsyMoneyFactory() {
        C8630b bVar = this.etsyMoneyFactory;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("etsyMoneyFactory");
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

    public final C12703a getGrafana() {
        C12703a aVar = this.grafana;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("grafana");
        throw null;
    }

    public final C12796e getImagesRepository() {
        C12796e eVar = this.imagesRepository;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("imagesRepository");
        throw null;
    }

    public int getLayoutId() {
        return R.layout.fragment_search_results;
    }

    public int getLoadTriggerPosition() {
        return ((is3x3ViewShown() ? 50 : 30) / 2) + 1;
    }

    public final C8694h getLogCat() {
        C8694h hVar = this.logCat;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("logCat");
        throw null;
    }

    public C13379a getPagination() {
        return getViewModel().f24179i;
    }

    public C8709f getPerformanceTracker() {
        return getViewModel().f24180j.getPerformanceTracker();
    }

    public final PersistViewedBus getPersistViewedBus() {
        PersistViewedBus persistViewedBus2 = this.persistViewedBus;
        if (persistViewedBus2 != null) {
            return persistViewedBus2;
        }
        C19383o.m32805o("persistViewedBus");
        throw null;
    }

    public final C13164c getPriceFilterHelper() {
        C13164c cVar = this.priceFilterHelper;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("priceFilterHelper");
        throw null;
    }

    public final C8951c getQualtricsWrapper() {
        C8951c cVar = this.qualtricsWrapper;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("qualtricsWrapper");
        throw null;
    }

    public String getQuery() {
        return getViewModel().mo36198e();
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

    public final C8984h getSavedSearchViewDelegate() {
        C8984h hVar = this.savedSearchViewDelegate;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("savedSearchViewDelegate");
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

    public final C11010o getSearchFiltersEligibility() {
        C11010o oVar = this.searchFiltersEligibility;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("searchFiltersEligibility");
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

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public final C13267q getSessionTimeManager() {
        C13267q qVar = this.sessionTimeManager;
        if (qVar != null) {
            return qVar;
        }
        C19383o.m32805o("sessionTimeManager");
        throw null;
    }

    public String getTrackingName() {
        return MediaBrowserServiceCompat.KEY_SEARCH_RESULTS;
    }

    public final C8656o getViewModelFactory() {
        C8656o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewModelFactory");
        throw null;
    }

    public final C3437q getWorkManager() {
        C3437q qVar = this.workManager;
        if (qVar != null) {
            return qVar;
        }
        C19383o.m32805o("workManager");
        throw null;
    }

    public void initEmptyStateViews(View view) {
        C19383o.m32797g(view, "view");
        this.emptyView = view.findViewById(R.id.empty_view);
        this.emptyText = (TextView) view.findViewById(R.id.empty_view_text);
        this.emptySubtext = (TextView) view.findViewById(R.id.empty_view_subtext);
        this.emptyButton = (Button) view.findViewById(R.id.empty_button);
        this.emptyImage = (ImageView) view.findViewById(R.id.empty_image);
        this.errorView = view.findViewById(R.id.no_internet);
        this.loadingView = view.findViewById(R.id.loading_view);
        View findViewById = this.errorView.findViewById(R.id.btn_retry_internet);
        if (findViewById != null) {
            ViewExtensions.m12866j(findViewById, new SearchResultsListingsFragment$initEmptyStateViews$1(this));
        }
    }

    public boolean isEmpty() {
        return super.isEmpty() && !isLoading();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getViewModel().f24180j.mo21372d(bundle == null);
        this.transactionViewModel = C18263b.m30828W(this, new C11869a());
        C10982c filtersViewModel = getFiltersViewModel();
        filtersViewModel.f24355k = filtersViewModel.f24348d.mo36455a(getArguments());
        filtersViewModel.f24354j = filtersViewModel.mo36466c();
        this.buyerFeatures = new C10971c(getSessionTimeManager(), getConnectivity(), new C10971c.C10972a(0));
        getViewModel().mo36205l("");
        int integer = getResources().getInteger(R.integer.vespa_grid_layout_max_span);
        int integer2 = getResources().getInteger(R.integer.vespa_listing_card_span);
        int integer3 = getResources().getInteger(R.integer.vespa_listing_card_3x3_span);
        this.listingsPerRow2x2 = integer / integer2;
        this.listingsPerRow3x3 = integer / integer3;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (bundle != null || !arguments.containsKey("SEARCH_CATEGORY_REDIRECT")) {
                configureForRegularSearch(arguments, bundle);
            } else {
                configureForCategoryRedirect(arguments);
            }
        }
        PublishSubject<Long> publishSubject = getPersistViewedBus().f19378e;
        C19172m c = C0472h.m1242c(publishSubject, publishSubject);
        getSchedulers().getClass();
        LambdaObserver f = SubscribersKt.m32501f(c.mo20635e(C13461f.m21234a()), (C19857l) null, new SearchResultsListingsFragment$onCreate$2(this), 3);
        C7091a aVar = this.recentlyViewedDisposables;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        char c;
        BOEActivity bOEActivity;
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        if ((getViewModel().mo36198e().length() == 0) && getActivity() != null && (getActivity() instanceof BOEActivity) && (bOEActivity = (BOEActivity) getActivity()) != null) {
            FragmentActivity requireActivity = requireActivity();
            C19383o.m32796f(requireActivity, "requireActivity()");
            C8703p analyticsContext = getAnalyticsContext();
            C19383o.m32796f(analyticsContext, "analyticsContext");
            String string = bOEActivity.getString(R.string.search_for_anything_on_etsy_search_field_hint);
            C19383o.m32796f(string, "act.getString(R.string.s…n_etsy_search_field_hint)");
            new C10866i(requireActivity, analyticsContext, string, bOEActivity.getAppBarHelper(), new C10904d(bOEActivity), (SearchView.C0283l) null, (C9581e) null, (C9072a) null, (C9053d) null, 968);
            bOEActivity.getAppBarHelper().setNavigationIcon((int) R.drawable.sk_ic_back_tinted);
            bOEActivity.getAppBarHelper().setNavigationIconContentDescription((CharSequence) getString(R.string.abc_action_bar_up_description));
        }
        Context context = onCreateView.getContext();
        C19383o.m32796f(context, "root.context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.clg_color_bg_primary, typedValue, true);
        onCreateView.setBackgroundResource(typedValue.resourceId);
        this.recyclerView.setItemViewCacheSize(6);
        RecyclerView.C3100o layoutManager = this.recyclerView.getLayoutManager();
        C19383o.m32795e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).f7008K.f7012c = true;
        C13173c adapter = getAdapter();
        C19383o.m32796f(adapter, "getAdapter()");
        AdImpressionScrollListener adImpressionScrollListener = new AdImpressionScrollListener(adapter, new SearchResultsListingsFragment$onCreateView$2(this));
        this.adImpressionsLogger = adImpressionScrollListener;
        this.recyclerView.addOnScrollListener(adImpressionScrollListener);
        this.recyclerView.addOnScrollListener(this.searchImpressionsOnScrollListener);
        C8951c qualtricsWrapper2 = getQualtricsWrapper();
        String locale = getCurrentLocale().mo46719c().toString();
        C19383o.m32796f(locale, "currentLocale.getSystemLocale().toString()");
        qualtricsWrapper2.mo30561a(C17782b.m29865e0(new C8952d.C8961i(locale, 0), C8952d.C8959g.f19757c));
        getQualtricsWrapper().mo30562b(new SearchResultsListingsFragment$onCreateView$3(this));
        ViewStub viewStub = (ViewStub) onCreateView.findViewById(R.id.sticky_header);
        viewStub.setLayoutResource(getSearchFiltersEligibility().f24413a.mo21132b(C8592b.f18766W0) ? R.layout.view_stub_search_header_filter_pills : R.layout.view_stub_search_header);
        View inflate = viewStub.inflate();
        C19383o.m32795e(inflate, "null cannot be cast to non-null type com.etsy.android.ui.search.SearchResultsHeaderView");
        this.stickyHeaderView = (SearchResultsHeaderView) inflate;
        this.relatedCategoriesHeaderView = onCreateView.findViewById(R.id.related_categories_header);
        View findViewById = onCreateView.findViewById(R.id.header_container);
        C19383o.m32796f(findViewById, "headerContainer");
        this.recyclerView.addOnScrollListener(new C10889d(new C12697a(findViewById, getAnalyticsContext())));
        C8623e configMap = getConfigMap();
        C19383o.m32796f(configMap, "configMap");
        this.listingCardOptions = new ListingCardViewHolderOptions.C11974h(configMap);
        C8703p analyticsContext2 = getAnalyticsContext();
        C19383o.m32796f(analyticsContext2, "analyticsContext");
        C13173c adapter2 = getAdapter();
        C19383o.m32796f(adapter2, "getAdapter()");
        addDelegateViewHolderFactory(new SearchResultsViewHolderFactory(this, analyticsContext2, adapter2, new SearchResultsListingsFragment$onCreateView$5(this), new SearchResultsListingsFragment$onCreateView$6(this), new SearchResultsListingsFragment$onCreateView$7(this), new SearchResultsListingsFragment$onCreateView$8(this), getSearchFiltersEligibility()));
        C13173c adapter3 = getAdapter();
        C8703p analyticsContext3 = getAnalyticsContext();
        C11780h favoriteRepository2 = getFavoriteRepository();
        ListingCardViewHolderOptions listingCardViewHolderOptions = this.listingCardOptions;
        C12796e imagesRepository2 = getImagesRepository();
        C8630b etsyMoneyFactory2 = getEtsyMoneyFactory();
        C19383o.m32796f(adapter3, "getAdapter()");
        C19383o.m32796f(analyticsContext3, "analyticsContext");
        C13799a aVar = r0;
        View view = onCreateView;
        C13799a aVar2 = new C13799a(this, adapter3, analyticsContext3, favoriteRepository2, getRxSchedulers(), getAdImpressionRepository(), getDeepLinkEligibility(), getRouteInspector(), getDeepLinkEntityChecker(), getSearchUriParser(), (C13182k) null, listingCardViewHolderOptions, (C10715a) null, imagesRepository2, etsyMoneyFactory2, (WeakReference) null, 37888);
        addDelegateViewHolderFactory(new C10902b(aVar, new SearchResultsListingsFragment$onCreateView$9(this)));
        init(bundle);
        C7091a aVar3 = this.disposables;
        PublishSubject<SearchOptions> publishSubject = getFiltersViewModel().f24356l;
        ObservableDebounceTimed c2 = C0472h.m1242c(publishSubject, publishSubject).mo20633c(TimeUnit.MILLISECONDS);
        getSchedulers().getClass();
        ObservableSubscribeOn i = c2.mo20639i(C13461f.m21235b());
        getSchedulers().getClass();
        aVar3.mo19403b(i.mo20635e(C13461f.m21236c()).mo20637g(new C13263n(this, 5)));
        C7091a aVar4 = this.disposables;
        PublishSubject<SearchOptions> publishSubject2 = getFiltersViewModel().f24357m;
        C19172m c3 = C0472h.m1242c(publishSubject2, publishSubject2);
        getSchedulers().getClass();
        ObservableSubscribeOn i2 = c3.mo20639i(C13461f.m21235b());
        getSchedulers().getClass();
        aVar4.mo19403b(i2.mo20635e(C13461f.m21236c()).mo20637g(new C13089i(this, 7)));
        getSearchContainerComponent().clearFocus();
        if (this.forwardedSearchWithAds != null) {
            initTopLevelFacet();
            c = 1;
            setLoading(true);
            SearchWithAds searchWithAds = this.forwardedSearchWithAds;
            C19383o.m32794d(searchWithAds);
            setSearchWithAdsResults(searchWithAds, true);
            this.forwardedSearchWithAds = null;
        } else {
            c = 1;
            if (isEmpty()) {
                loadContent();
            }
        }
        ViewExtensions.m12860d(this.emptyView);
        configureRecyclerView(is3x3ViewShown());
        View view2 = view;
        View findViewById2 = view2.findViewById(R.id.related_categories_recycler);
        C19383o.m32796f(findViewById2, "root.findViewById(R.id.r…ated_categories_recycler)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.featuredCategoriesRecycler = recyclerView;
        initRelatedCategories(recyclerView);
        setRelatedCategoriesInAdapter(((SearchResultsListingsState) getViewModel().f24191u.getValue()).f24166m);
        SearchResultsHeaderView searchResultsHeaderView = this.stickyHeaderView;
        if (searchResultsHeaderView != null) {
            View findViewById3 = view2.findViewById(R.id.root_view);
            C19383o.m32796f(findViewById3, "root.findViewById<View>(R.id.root_view)");
            int[] iArr = new int[3];
            iArr[0] = searchResultsHeaderView.getId();
            RecyclerView recyclerView2 = this.featuredCategoriesRecycler;
            if (recyclerView2 != null) {
                iArr[c] = recyclerView2.getId();
                iArr[2] = this.recyclerView.getId();
                NavigationExtensionsKt.m17421b(findViewById3, iArr);
            } else {
                C19383o.m32805o("featuredCategoriesRecycler");
                throw null;
            }
        }
        return view2;
    }

    public void onDeleteSearch() {
        C19394m mVar;
        Long f = getViewModel().mo36199f();
        if (f != null) {
            long longValue = f.longValue();
            trackSaveSearchEvent(false);
            C8984h savedSearchViewDelegate2 = getSavedSearchViewDelegate();
            FragmentActivity requireActivity = requireActivity();
            C19383o.m32796f(requireActivity, "requireActivity()");
            savedSearchViewDelegate2.mo30633a(longValue, requireActivity);
            mVar = C19394m.f43287a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            getGrafana().mo45475b("saved_search.delete_without_id", 0.1d);
        }
    }

    public void onDestroy() {
        this.recentlyViewedDisposables.mo19405d();
        super.onDestroy();
    }

    public void onDestroyView() {
        for (ViewTreeObserver.OnGlobalLayoutListener b : this.recyclerViewGlobalLayoutListeners) {
            C11914o.m19630b(this.recyclerView.getViewTreeObserver(), b);
        }
        this.recyclerViewGlobalLayoutListeners.clear();
        setLoading(false);
        this.disposables.mo19405d();
        getSavedSearchViewDelegate().f19830d.mo19405d();
        this.stickyHeaderView = null;
        this.relatedCategoriesHeaderView = null;
        super.onDestroyView();
    }

    public void onListingCardShown(ListingCard listingCard) {
        String displayLocation;
        SearchImpressionMetadata searchImpressionMetadata;
        String loggingKey;
        SearchImpressionMetadata searchImpressionMetadata2;
        String data;
        C19383o.m32797g(listingCard, ListingCard.LISTING_CARD_ITEM_TYPE);
        SearchResultsListingsViewModel viewModel = getViewModel();
        viewModel.getClass();
        SearchImpressionMetadata searchImpressionMetadata3 = listingCard.getSearchImpressionMetadata();
        if (searchImpressionMetadata3 != null && (displayLocation = searchImpressionMetadata3.getDisplayLocation()) != null && (searchImpressionMetadata = listingCard.getSearchImpressionMetadata()) != null && (loggingKey = searchImpressionMetadata.getLoggingKey()) != null && (searchImpressionMetadata2 = listingCard.getSearchImpressionMetadata()) != null && (data = searchImpressionMetadata2.getData()) != null) {
            C19697g.m33468f(C19388s.m32866i0(viewModel), (CoroutineContext) null, (CoroutineStart) null, new SearchResultsListingsViewModel$insertSearchImpression$1(viewModel, new C13224c(displayLocation, loggingKey, data), (C19340c<? super SearchResultsListingsViewModel$insertSearchImpression$1>) null), 3);
        }
    }

    public void onLoadContent() {
        loadResults();
    }

    public void onLoadFailure() {
        super.onLoadFailure();
        getViewModel().f24180j.mo21371c();
    }

    public void onPause() {
        super.onPause();
        C3438r a = new C3424m.C3425a(SearchImpressionsUploadWorker.class).mo12964a();
        C19383o.m32796f(a, "Builder(\n            Sea…ss.java\n        ).build()");
        C3437q workManager2 = getWorkManager();
        workManager2.getClass();
        workManager2.mo12962c(Collections.singletonList((C3424m) a));
        getAdImpressionRepository().mo20867a();
    }

    public void onResume() {
        super.onResume();
        SearchFilterHeader d = getViewModel().mo36197d();
        if (d != null) {
            updateStickyHeaderView(d);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "bundle");
        super.onSaveInstanceState(bundle);
        TransactionViewModel<C11869a> transactionViewModel2 = this.transactionViewModel;
        if (transactionViewModel2 != null) {
            C11869a aVar = (C11869a) transactionViewModel2.f26405b;
            aVar.mo38349f(SAVE_SEARCH_IMPRESSION_DISPLAYED_LISTINGS, this.searchImpressionsOnScrollListener.f29077c);
            aVar.f26406a.put("enabled", Boolean.valueOf(this.searchImpressionsOnScrollListener.f29076b));
            return;
        }
        C19383o.m32805o("transactionViewModel");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
        r0 = r0.getReplacementQuery();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSaveSearch(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            r0 = 1
            r8.trackSaveSearchEvent(r0)
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r0 = r8.getViewModel()
            kotlinx.coroutines.flow.p1 r0 = r0.f24191u
            java.lang.Object r0 = r0.getValue()
            com.etsy.android.ui.search.listingresults.SearchResultsListingsState r0 = (com.etsy.android.p327ui.search.listingresults.SearchResultsListingsState) r0
            com.etsy.android.lib.models.apiv3.search.QueryCorrection r0 = r0.f24159f
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r0.getReplacementQuery()
            if (r0 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r2 = r0
            goto L_0x0023
        L_0x0022:
            r2 = r9
        L_0x0023:
            com.etsy.android.ui.search.v2.filters.c r9 = r8.getFiltersViewModel()
            com.etsy.android.ui.search.v2.SearchOptions r9 = r9.f24355k
            java.util.Map r3 = r9.asMap()
            kotlin.Pair r0 = r9.getSortOrderParams()
            java.lang.Object r1 = r0.component1()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.component2()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = "sort_on"
            r3.put(r4, r1)
            java.lang.String r1 = "sort_order"
            r3.put(r1, r0)
            com.etsy.android.lib.currency.a r0 = r8.getAppCurrency()
            java.lang.String r0 = r0.mo21246a()
            java.lang.String r1 = "currency"
            r3.put(r1, r0)
            boolean r9 = r9.hasShipsToCountry()
            if (r9 != 0) goto L_0x0070
            y9.d r9 = r8.getCurrentLocale()
            java.util.Locale r9 = r9.mo46719c()
            java.lang.String r9 = r9.getCountry()
            java.lang.String r0 = "currentLocale.getSystemLocale().country"
            kotlin.jvm.internal.C19383o.m32796f(r9, r0)
            java.lang.String r0 = "ship_to"
            r3.put(r0, r9)
        L_0x0070:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r9 = 0
            com.etsy.android.uikit.adapter.a<T> r0 = r8.adapter
            java.util.List r0 = r0.getItems()
            int r0 = r0.size()
        L_0x0080:
            if (r9 >= r0) goto L_0x00c1
            com.etsy.android.uikit.adapter.a<T> r1 = r8.adapter
            java.lang.Object r1 = r1.getItem(r9)
            java.lang.String r4 = "adapter.getItem(i)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r4)
            of.o r1 = (p415of.C13186o) r1
            boolean r1 = r8.keepListings(r1)
            if (r1 == 0) goto L_0x00be
            com.etsy.android.uikit.adapter.a<T> r1 = r8.adapter
            java.lang.Object r1 = r1.getItem(r9)
            java.lang.String r4 = "null cannot be cast to non-null type com.etsy.android.uikit.viewholder.ListingCardUiModel"
            kotlin.jvm.internal.C19383o.m32795e(r1, r4)
            com.etsy.android.uikit.viewholder.ListingCardUiModel r1 = (com.etsy.android.uikit.viewholder.ListingCardUiModel) r1
            boolean r1 = r1.isAd()
            if (r1 != 0) goto L_0x00be
            com.etsy.android.uikit.adapter.a<T> r1 = r8.adapter
            java.lang.Object r1 = r1.getItem(r9)
            kotlin.jvm.internal.C19383o.m32795e(r1, r4)
            com.etsy.android.uikit.viewholder.ListingCardUiModel r1 = (com.etsy.android.uikit.viewholder.ListingCardUiModel) r1
            com.etsy.android.lib.models.datatypes.EtsyId r1 = r1.getListingId()
            java.lang.String r1 = r1.getId()
            r5.add(r1)
        L_0x00be:
            int r9 = r9 + 1
            goto L_0x0080
        L_0x00c1:
            com.etsy.android.search.savedsearch.h r1 = r8.getSavedSearchViewDelegate()
            androidx.fragment.app.FragmentActivity r4 = r8.requireActivity()
            java.lang.String r9 = "requireActivity()"
            kotlin.jvm.internal.C19383o.m32796f(r4, r9)
            com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel r9 = r8.getViewModel()
            int r9 = r9.mo36200g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment$onSaveSearch$1 r7 = new com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment$onSaveSearch$1
            r7.<init>(r8)
            r1.mo30634b(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.listingresults.SearchResultsListingsFragment.onSaveSearch(java.lang.String):void");
    }

    public void onStart() {
        super.onStart();
        attachToSearchView();
    }

    public void onStop() {
        super.onStop();
        detachFromSearchView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        C19662p1 p1Var = getViewModel().f24191u;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        C19383o.m32796f(lifecycle, "viewLifecycleOwner.lifecycle");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(C2869k.m6799a(p1Var, lifecycle, Lifecycle.State.STARTED), new SearchResultsListingsFragment$onViewCreated$1(this, (C19340c<? super SearchResultsListingsFragment$onViewCreated$1>) null));
        C2887s viewLifecycleOwner = getViewLifecycleOwner();
        C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
        C19669s.m33429a(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, C15588c1.m25329i0(viewLifecycleOwner));
        ViewExtensions.m12869m(view);
        List<ViewTreeObserver.OnGlobalLayoutListener> list = this.recyclerViewGlobalLayoutListeners;
        ViewTreeObserver viewTreeObserver = this.recyclerView.getViewTreeObserver();
        SearchResultsListingsFragment$onViewCreated$2 searchResultsListingsFragment$onViewCreated$2 = new SearchResultsListingsFragment$onViewCreated$2(this);
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(searchResultsListingsFragment$onViewCreated$2);
        }
        list.add(searchResultsListingsFragment$onViewCreated$2);
        List<ViewTreeObserver.OnGlobalLayoutListener> list2 = this.recyclerViewGlobalLayoutListeners;
        ViewTreeObserver viewTreeObserver2 = this.recyclerView.getViewTreeObserver();
        SearchResultsListingsFragment$onViewCreated$3 searchResultsListingsFragment$onViewCreated$3 = new SearchResultsListingsFragment$onViewCreated$3(this);
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.addOnGlobalLayoutListener(searchResultsListingsFragment$onViewCreated$3);
        }
        list2.add(searchResultsListingsFragment$onViewCreated$3);
        Lifecycle lifecycle2 = getLifecycle();
        C19383o.m32796f(lifecycle2, "lifecycle");
        new HeartMonitor(lifecycle2, new C10890e(this));
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            TransactionViewModel<C11869a> transactionViewModel2 = this.transactionViewModel;
            HashSet<String> hashSet = null;
            if (transactionViewModel2 != null) {
                C11869a aVar = (C11869a) transactionViewModel2.f26405b;
                if (aVar.mo38344a(SAVE_SEARCH_IMPRESSION_DISPLAYED_LISTINGS)) {
                    Object b = aVar.mo38345b(SAVE_SEARCH_IMPRESSION_DISPLAYED_LISTINGS);
                    if (b instanceof HashSet) {
                        hashSet = b;
                    }
                    HashSet<String> hashSet2 = hashSet;
                    if (hashSet2 == null) {
                        hashSet2 = new HashSet<>();
                    }
                    C13228g gVar = this.searchImpressionsOnScrollListener;
                    gVar.getClass();
                    gVar.f29077c = hashSet2;
                }
                if (aVar.mo38344a("enabled")) {
                    this.searchImpressionsOnScrollListener.f29076b = aVar.mo38346c("enabled", false);
                    return;
                }
                return;
            }
            C19383o.m32805o("transactionViewModel");
            throw null;
        }
    }

    public final void setAdImpressionRepository(C8267e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.adImpressionRepository = eVar;
    }

    public final void setAppCurrency(C8629a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.appCurrency = aVar;
    }

    public final void setConnectivity(Connectivity connectivity2) {
        C19383o.m32797g(connectivity2, "<set-?>");
        this.connectivity = connectivity2;
    }

    public final void setCurrentLocale(C13888d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.currentLocale = dVar;
    }

    public final void setDeepLinkEligibility(C12724a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEligibility = aVar;
    }

    public final void setDeepLinkEntityChecker(C13851a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEntityChecker = aVar;
    }

    public final void setEtsyMoneyFactory(C8630b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.etsyMoneyFactory = bVar;
    }

    public final void setFavoriteRepository(C11780h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.favoriteRepository = hVar;
    }

    public final void setGrafana(C12703a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.grafana = aVar;
    }

    public final void setImagesRepository(C12796e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.imagesRepository = eVar;
    }

    public final void setLogCat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logCat = hVar;
    }

    public final void setPersistViewedBus(PersistViewedBus persistViewedBus2) {
        C19383o.m32797g(persistViewedBus2, "<set-?>");
        this.persistViewedBus = persistViewedBus2;
    }

    public final void setPriceFilterHelper(C13164c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.priceFilterHelper = cVar;
    }

    public final void setQualtricsWrapper(C8951c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.qualtricsWrapper = cVar;
    }

    public final void setRouteInspector(C12741o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.routeInspector = oVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSavedSearchViewDelegate(C8984h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.savedSearchViewDelegate = hVar;
    }

    public final void setSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.schedulers = fVar;
    }

    public final void setSearchFiltersEligibility(C11010o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.searchFiltersEligibility = oVar;
    }

    public final void setSearchUriParser(C10865h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.searchUriParser = hVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setSessionTimeManager(C13267q qVar) {
        C19383o.m32797g(qVar, "<set-?>");
        this.sessionTimeManager = qVar;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }

    public final void setWorkManager(C3437q qVar) {
        C19383o.m32797g(qVar, "<set-?>");
        this.workManager = qVar;
    }

    public void showEmptyView() {
        Object value;
        C10920j.C10921a aVar;
        super.showEmptyView();
        SearchResultsListingsViewModel viewModel = getViewModel();
        StateFlowImpl stateFlowImpl = viewModel.f24190t;
        do {
            value = stateFlowImpl.getValue();
            aVar = r5;
            C10920j.C10921a aVar2 = new C10920j.C10921a(0);
        } while (!stateFlowImpl.mo72337i(value, SearchResultsListingsState.m18908b((SearchResultsListingsState) value, (ArrayList) null, (String) null, (String) null, (ListingCard) null, (GuidedSearch) null, (QueryCorrection) null, (List) null, (Long) null, false, 0, 0, (SearchFilterHeader) null, (List) null, (SearchResultsListingsState.ViewMode) null, false, false, aVar, 131071)));
        C11028i iVar = viewModel.f24173c;
        String e = viewModel.mo36198e();
        C19383o.m32797g(e, "query");
        iVar.getClass();
        C8071s<C20145v<C19928a0>> a = iVar.f24447a.mo36599a(e);
        C11027h hVar = new C11027h(iVar, 0);
        a.getClass();
        ConsumerSingleObserver e2 = SubscribersKt.m32500e(C0391c.m1056b(viewModel.f24172b, C0472h.m1243e(viewModel.f24172b, new C19211l(new C19208j(a, hVar), new C8848c(iVar, 3)))), new SearchResultsListingsViewModel$loadSimplifiedQueries$2(viewModel), new SearchResultsListingsViewModel$loadSimplifiedQueries$3(viewModel));
        C7091a aVar3 = viewModel.f24192v;
        C19383o.m32798h(aVar3, "compositeDisposable");
        aVar3.mo19403b(e2);
    }

    public void showErrorView() {
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        ViewExtensions.m12860d(this.emptyView);
        ViewExtensions.m12860d(this.loadingView);
        ViewExtensions.m12860d(this.recyclerView);
        ViewExtensions.m12869m(this.errorView);
    }

    public void showListView() {
        super.showListView();
        ViewExtensions.m12860d(this.emptyView);
        ViewExtensions.m12860d(this.errorView);
        SearchResultsHeaderView searchResultsHeaderView = this.stickyHeaderView;
        if (searchResultsHeaderView != null) {
            ViewExtensions.m12869m(searchResultsHeaderView);
        }
        ViewExtensions.m12869m(this.relatedCategoriesHeaderView);
        ViewExtensions.m12869m(this.recyclerView);
    }
}
