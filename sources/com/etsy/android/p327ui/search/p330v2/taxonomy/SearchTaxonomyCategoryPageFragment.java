package com.etsy.android.p327ui.search.p330v2.taxonomy;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.Constants;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8704a;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.TaxonomyNode;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.TaxonomyCategory;
import com.etsy.android.lib.models.apiv3.vespa.BaseActionableItem;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.models.cardviewelement.IPageLink;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.lib.models.cardviewelement.PageDeepLink;
import com.etsy.android.lib.models.cardviewelement.SearchPageLink;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.editable.EditableListing;
import com.etsy.android.lib.models.interfaces.ISearchPageLink;
import com.etsy.android.lib.models.interfaces.ITaxonomyCategory;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p072ad.impressions.AdImpressionScrollListener;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.cardview.CardRecyclerViewBaseFragment;
import com.etsy.android.p327ui.cardview.clickhandlers.C9116a;
import com.etsy.android.p327ui.cardview.clickhandlers.C9121f;
import com.etsy.android.p327ui.cardview.clickhandlers.C9125j;
import com.etsy.android.p327ui.cardview.clickhandlers.C9126k;
import com.etsy.android.p327ui.cardview.viewholders.C9168d0;
import com.etsy.android.p327ui.cardview.viewholders.C9173e1;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.search.container.C10741a;
import com.etsy.android.p327ui.search.p330v2.C10969a;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.stylekit.views.CollageEdge;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.util.C11914o;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.util.BOEOptionsMenuItemHelper;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlin.text.C19456j;
import p003a2.C0023f;
import p107f9.C6815a;
import p260v0.C8184a;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p356ge.C12788a;
import p357gf.C12796e;
import p363he.C12821d;
import p415of.C13171a;
import p415of.C13173c;
import p415of.C13186o;
import p423pf.C13236g;
import p439rf.C13364c;
import p445sf.C13379a;
import p445sf.C13382d;
import p456ua.C13461f;
import p464va.C13554f;
import p472wb.C13799a;
import p472wb.C13801b;
import p472wb.C13805c;
import p472wb.C13806d;
import p478x9.C13851a;
import p486y9.C13888d;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.search.v2.taxonomy.SearchTaxonomyCategoryPageFragment */
public final class SearchTaxonomyCategoryPageFragment extends CardRecyclerViewBaseFragment {
    public static final int $stable = 8;
    public static final C11103a Companion = new C11103a();
    public static final String FRAGMENT_TAG = "SearchTaxonomyCategoryPageFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private AdImpressionScrollListener adsImpressionsLogger;
    private String anchorListingId;
    public C11110a categoriesViewEligibility;
    private Page categoryRedirectPage;
    private CollageEdge collageEdge;
    public C13888d currentLocale;
    public C13851a entityChecker;
    public C11780h favoriteRepository;
    private final C13382d paginationNone = new C13382d();
    public C8704a performanceTrackerAdapter;
    /* access modifiers changed from: private */
    public ViewTreeObserver.OnGlobalLayoutListener recyclerViewOnGlobalLayoutListener;
    public C13461f rxSchedulers;
    /* access modifiers changed from: private */
    public boolean shouldResetToolbar = true;
    /* access modifiers changed from: private */
    public String taxonomyId;
    private String taxonomyPath;

    /* renamed from: com.etsy.android.ui.search.v2.taxonomy.SearchTaxonomyCategoryPageFragment$a */
    public static final class C11103a {
    }

    /* renamed from: com.etsy.android.ui.search.v2.taxonomy.SearchTaxonomyCategoryPageFragment$b */
    public final class C11104b extends C13801b {

        /* renamed from: com.etsy.android.ui.search.v2.taxonomy.SearchTaxonomyCategoryPageFragment$b$a */
        public static final class C11105a extends C13171a<BaseActionableItem> {

            /* renamed from: d */
            public final /* synthetic */ SearchTaxonomyCategoryPageFragment f24585d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11105a(SearchTaxonomyCategoryPageFragment searchTaxonomyCategoryPageFragment, Fragment fragment, C8703p pVar) {
                super(fragment, pVar);
                this.f24585d = searchTaxonomyCategoryPageFragment;
                C19383o.m32796f(pVar, "mViewTracker");
            }

            /* renamed from: c */
            public final void mo31328c(Object obj) {
                BaseActionableItem baseActionableItem = (BaseActionableItem) obj;
                C19383o.m32797g(baseActionableItem, "data");
                ServerDrivenAction serverDrivenAction = !baseActionableItem.getActions().isEmpty() ? baseActionableItem.getActions().get(0) : null;
                if (serverDrivenAction != null) {
                    String deepLink = serverDrivenAction.getDeepLink();
                    C19383o.m32796f(deepLink, "action.deepLink");
                    Uri parse = Uri.parse(serverDrivenAction.getPath());
                    C13851a entityChecker = this.f24585d.getEntityChecker();
                    C19383o.m32796f(parse, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
                    DeepLinkEntity a = entityChecker.mo46683a(parse);
                    this.f24585d.getRouteInspector().getClass();
                    String queryParameter = parse.getQueryParameter(ResponseConstants.TAXONOMY_ID);
                    if (a == DeepLinkEntity.SEARCH && C18263b.m30839d0(queryParameter)) {
                        this.f24585d.getSearchContainerComponent().navigateToSearchResults("", (SearchOptions) null, (String) null, C19456j.m33017U0(queryParameter));
                    } else if (C18263b.m30839d0(deepLink)) {
                        C12788a.m20424c(this.f24585d.getActivity(), new C12821d(deepLink));
                    }
                }
            }
        }

        public C11104b(C13799a aVar) {
            super(aVar);
        }

        /* renamed from: b */
        public final C12086e<?> mo31854b(ViewGroup viewGroup, int i) {
            C12086e<?> eVar;
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            switch (i) {
                case R.id.view_type_horizontal_list_section:
                case R.id.view_type_horizontal_shops:
                    C12086e<?> b = super.mo31854b(viewGroup, i);
                    C19383o.m32794d(b);
                    ViewGroup.LayoutParams layoutParams = b.itemView.getLayoutParams();
                    C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int dimensionPixelSize = SearchTaxonomyCategoryPageFragment.this.getResources().getDimensionPixelSize(R.dimen.neg_pills_margins_edges);
                    marginLayoutParams.setMargins(dimensionPixelSize, marginLayoutParams.topMargin, dimensionPixelSize, marginLayoutParams.bottomMargin);
                    b.itemView.requestLayout();
                    return b;
                case R.id.view_type_horizontal_topics:
                    eVar = super.mo31854b(viewGroup, i);
                    C19383o.m32794d(eVar);
                    int dimensionPixelSize2 = SearchTaxonomyCategoryPageFragment.this.getResources().getDimensionPixelSize(R.dimen.clg_space_16);
                    ((RecyclerView) eVar.itemView.findViewById(R.id.horizontal_recycler_view)).setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, SearchTaxonomyCategoryPageFragment.this.getResources().getDimensionPixelSize(R.dimen.clg_space_4));
                    ViewGroup.LayoutParams layoutParams2 = eVar.itemView.getLayoutParams();
                    C19383o.m32795e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int dimensionPixelSize3 = SearchTaxonomyCategoryPageFragment.this.getResources().getDimensionPixelSize(R.dimen.neg_pills_margins_edges);
                    marginLayoutParams2.setMargins(dimensionPixelSize3, marginLayoutParams2.topMargin, dimensionPixelSize3, marginLayoutParams2.bottomMargin);
                    eVar.itemView.requestLayout();
                    break;
                case R.id.view_type_list_section_formatted_taxonomy_category_pills:
                case R.id.view_type_list_section_search_suggestion_with_image:
                    eVar = super.mo31854b(viewGroup, i);
                    C19383o.m32794d(eVar);
                    ViewGroup.LayoutParams layoutParams3 = eVar.itemView.getLayoutParams();
                    C19383o.m32795e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    int dimensionPixelSize4 = SearchTaxonomyCategoryPageFragment.this.getResources().getDimensionPixelSize(R.dimen.neg_pills_margins_edges);
                    marginLayoutParams3.setMargins(dimensionPixelSize4, marginLayoutParams3.topMargin, dimensionPixelSize4, marginLayoutParams3.bottomMargin);
                    eVar.itemView.requestLayout();
                    int dimensionPixelSize5 = SearchTaxonomyCategoryPageFragment.this.getResources().getDimensionPixelSize(R.dimen.clg_space_8);
                    RecyclerView recyclerView = (RecyclerView) eVar.itemView.findViewById(R.id.horizontal_recycler_view);
                    recyclerView.setPadding(dimensionPixelSize5, recyclerView.getPaddingTop(), dimensionPixelSize5, recyclerView.getPaddingBottom());
                    break;
                case R.id.view_type_search_interstitial_category_header:
                    Object f = this.f28982a.mo19993f(i, (Integer) null);
                    C19383o.m32795e(f, "null cannot be cast to non-null type com.etsy.android.vespa.BaseViewHolderClickHandler<com.etsy.android.lib.models.apiv3.vespa.BaseActionableItem>");
                    return new C9173e1(viewGroup, (C13171a) f);
                case R.id.view_type_section_header_with_page_link:
                    C9121f fVar = (C9121f) this.f28982a.mo19993f(i, (Integer) null);
                    C19383o.m32794d(fVar);
                    C9168d0 d0Var = new C9168d0(viewGroup, fVar);
                    TextView textView = (TextView) d0Var.itemView.findViewById(R.id.headerTitle);
                    ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
                    C19383o.m32795e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams4).setMarginStart(textView.getResources().getDimensionPixelSize(R.dimen.clg_space_8));
                    textView.requestLayout();
                    return d0Var;
                default:
                    return super.mo31854b(viewGroup, i);
            }
            return eVar;
        }

        /* renamed from: f */
        public final int mo36216f(C13186o oVar) {
            C19383o.m32797g(oVar, "item");
            return oVar.getViewType() == R.id.view_type_actionable_header ? R.id.view_type_search_interstitial_category_header : super.mo36216f(oVar);
        }

        /* renamed from: j */
        public final void mo36728j() {
            super.mo36728j();
            this.f28982a.mo19994h(R.id.view_type_search_interstitial_category_header, new C11105a(SearchTaxonomyCategoryPageFragment.this, mo45892d(), this.f28983b));
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.taxonomy.SearchTaxonomyCategoryPageFragment$c */
    public final class C11106c extends C9116a {
        public C11106c(Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
        }

        /* renamed from: e */
        public final void mo31328c(IPageLink iPageLink) {
            C19383o.m32797g(iPageLink, "data");
            if (iPageLink instanceof SearchPageLink) {
                SearchPageLink searchPageLink = (SearchPageLink) iPageLink;
                SearchTaxonomyCategoryPageFragment.this.logTouchEvent(C0023f.m110k(new StringBuilder(), this.f28980b.f19060b, "_tapped_view_all"), searchPageLink.getTaxonomyId().toString());
                SearchTaxonomyCategoryPageFragment.this.getSearchContainerComponent().navigateToSearchResults(Long.valueOf(searchPageLink.getTaxonomyId().getIdAsLong()));
                return;
            }
            super.mo31328c(iPageLink);
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.taxonomy.SearchTaxonomyCategoryPageFragment$d */
    public final class C11107d extends C9125j {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11107d(Fragment fragment, C13173c cVar, C8703p pVar, C8267e eVar) {
            super(fragment, cVar, pVar, (C9126k.C9128b) null, eVar);
            C19383o.m32797g(eVar, "adImpressionRepository");
        }

        /* renamed from: e */
        public final void mo31349e(ListingLike listingLike, boolean z, Bundle bundle) {
            C19383o.m32797g(listingLike, ResponseConstants.LISTING);
            HashMap hashMap = new HashMap();
            if (listingLike instanceof ListingCard) {
                ListingCard listingCard = (ListingCard) listingLike;
                if (C18263b.m30839d0(listingCard.getContentSource())) {
                    PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.CONTENT_SOURCE;
                    String contentSource = listingCard.getContentSource();
                    C19383o.m32796f(contentSource, "listing.contentSource");
                    hashMap.put(predefinedAnalyticsProperty, contentSource);
                }
            }
            hashMap.put(PredefinedAnalyticsProperty.LISTING_ID, listingLike.getListingId().getId());
            this.f28980b.mo21333d("category_tapped_listing", hashMap);
            super.mo31349e(listingLike, z, bundle);
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.taxonomy.SearchTaxonomyCategoryPageFragment$e */
    public static final class C11108e extends RecyclerView.C3099n {

        /* renamed from: a */
        public boolean f24587a = true;

        /* renamed from: b */
        public int f24588b;

        /* renamed from: c */
        public final /* synthetic */ SearchTaxonomyCategoryPageFragment f24589c;

        public C11108e(SearchTaxonomyCategoryPageFragment searchTaxonomyCategoryPageFragment) {
            this.f24589c = searchTaxonomyCategoryPageFragment;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
            C19383o.m32797g(rect, "outRect");
            C19383o.m32797g(view, "view");
            C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
            C19383o.m32797g(yVar, "state");
            int dimensionPixelSize = this.f24589c.getResources().getDimensionPixelSize(R.dimen.clg_space_12);
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            C19383o.m32794d(gridLayoutManager);
            GridLayoutManager.C3075b bVar = gridLayoutManager.f7008K;
            int i = gridLayoutManager.f7003F;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition >= 0) {
                int d = bVar.mo11265d(childAdapterPosition);
                if (d != i) {
                    int c = bVar.mo11264c(childAdapterPosition, i);
                    int i2 = i / d;
                    boolean z = true;
                    boolean z2 = i2 == 3;
                    boolean z3 = i2 == 2;
                    if (z2) {
                        if (this.f24587a) {
                            this.f24588b = bVar.mo11267b(childAdapterPosition, i);
                            this.f24587a = false;
                        }
                        if (bVar.mo11267b(childAdapterPosition, i) != this.f24588b) {
                            z = false;
                        }
                        rect.left = (c * dimensionPixelSize) / i;
                        rect.right = dimensionPixelSize - (((c + d) * dimensionPixelSize) / i);
                        rect.bottom = dimensionPixelSize;
                        if (z) {
                            rect.top = 0;
                        } else {
                            rect.top = dimensionPixelSize;
                        }
                    } else if (z3) {
                        int dimensionPixelSize2 = this.f24589c.getResources().getDimensionPixelSize(R.dimen.neg_edge_to_edge_margins_edges);
                        int dimensionPixelSize3 = this.f24589c.getResources().getDimensionPixelSize(R.dimen.neg_edge_to_edge_margins);
                        boolean z4 = c == 0;
                        if (c != d) {
                            z = false;
                        }
                        if (z4) {
                            rect.left = dimensionPixelSize2;
                            rect.right = dimensionPixelSize3;
                        }
                        if (z) {
                            rect.left = dimensionPixelSize3;
                            rect.right = dimensionPixelSize2;
                        }
                    }
                }
                if (childAdapterPosition == 0) {
                    rect.top = this.f24589c.getResources().getDimensionPixelSize(R.dimen.categories_tear_header_height);
                }
            }
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.taxonomy.SearchTaxonomyCategoryPageFragment$f */
    public static final class C11109f extends C13171a<C13186o> {

        /* renamed from: d */
        public final /* synthetic */ SearchTaxonomyCategoryPageFragment f24590d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11109f(SearchTaxonomyCategoryPageFragment searchTaxonomyCategoryPageFragment, C8703p pVar) {
            super(searchTaxonomyCategoryPageFragment, pVar);
            this.f24590d = searchTaxonomyCategoryPageFragment;
            C19383o.m32796f(pVar, "analyticsContext");
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            EtsyId taxonomyNodeId;
            EtsyId taxonomyNodeId2;
            C13186o oVar = (C13186o) obj;
            C19383o.m32797g(oVar, "data");
            Fragment a = mo45889a();
            if (oVar instanceof SearchPageLink) {
                SearchPageLink searchPageLink = (SearchPageLink) oVar;
                this.f24590d.logTouchEvent("view_more_results_click", searchPageLink.getTaxonomyId().getId());
                this.f24590d.getSearchContainerComponent().navigateToSearchResults(C19456j.m33017U0(searchPageLink.getTaxonomyId().getId()));
                return;
            }
            boolean z = false;
            Long l = null;
            if (oVar instanceof TaxonomyCategory) {
                TaxonomyCategory taxonomyCategory = (TaxonomyCategory) oVar;
                TaxonomyNode buildTaxonomyNode = taxonomyCategory.buildTaxonomyNode();
                if (!(this.f24590d.taxonomyId == null || buildTaxonomyNode == null)) {
                    this.f24590d.logTouchEvent("category_click", buildTaxonomyNode.getTaxonomyNodeId().toString());
                }
                C10741a access$getSearchContainerComponent = this.f24590d.getSearchContainerComponent();
                ISearchPageLink pageLink = taxonomyCategory.getPageLink();
                if (pageLink != null && pageLink.isCategoryPage()) {
                    z = true;
                }
                if (z) {
                    C19383o.m32794d(buildTaxonomyNode);
                    access$getSearchContainerComponent.navigateToCategoryPageFragment(buildTaxonomyNode.getTaxonomyNodeId().getIdAsLong(), (String) null);
                    return;
                }
                if (!(buildTaxonomyNode == null || (taxonomyNodeId2 = buildTaxonomyNode.getTaxonomyNodeId()) == null)) {
                    l = Long.valueOf(taxonomyNodeId2.getIdAsLong());
                }
                access$getSearchContainerComponent.navigateToSearchResults(l);
            } else if (oVar instanceof FormattedTaxonomyCategory) {
                FormattedTaxonomyCategory formattedTaxonomyCategory = (FormattedTaxonomyCategory) oVar;
                ITaxonomyCategory category = formattedTaxonomyCategory.getCategory();
                C19383o.m32794d(category);
                TaxonomyNode buildTaxonomyNode2 = category.buildTaxonomyNode();
                for (Pair next : formattedTaxonomyCategory.extractOnTappedEventParameters()) {
                    this.f24590d.getAnalyticsContext().mo21333d((String) next.component1(), (Map) next.component2());
                }
                C10741a access$getSearchContainerComponent2 = this.f24590d.getSearchContainerComponent();
                if (category.getDeepLink() != null) {
                    FragmentActivity activity = this.f24590d.getActivity();
                    String deepLink = category.getDeepLink();
                    C19383o.m32794d(deepLink);
                    C12788a.m20424c(activity, new C12821d(deepLink));
                } else if (category.getPageLink() != null) {
                    ISearchPageLink pageLink2 = category.getPageLink();
                    C19383o.m32794d(pageLink2);
                    if (pageLink2.isCategoryPage()) {
                        this.f24590d.shouldResetToolbar = false;
                        C19383o.m32794d(buildTaxonomyNode2);
                        EtsyId taxonomyNodeId3 = buildTaxonomyNode2.getTaxonomyNodeId();
                        C19383o.m32794d(taxonomyNodeId3);
                        access$getSearchContainerComponent2.navigateToCategoryPageFragment(taxonomyNodeId3.getIdAsLong(), (String) null);
                        return;
                    }
                    if (!(buildTaxonomyNode2 == null || (taxonomyNodeId = buildTaxonomyNode2.getTaxonomyNodeId()) == null)) {
                        l = Long.valueOf(taxonomyNodeId.getIdAsLong());
                    }
                    access$getSearchContainerComponent2.navigateToSearchResults(l);
                }
            } else if ((oVar instanceof PageDeepLink) && a != null) {
                FragmentActivity activity2 = this.f24590d.getActivity();
                String url = ((PageDeepLink) oVar).getUrl();
                C19383o.m32796f(url, "data.url");
                C12788a.m20424c(activity2, new C12821d(url));
            }
        }
    }

    static {
        Class<SearchTaxonomyCategoryPageFragment> cls = SearchTaxonomyCategoryPageFragment.class;
        Pattern pattern = C6815a.f15001a;
    }

    private final BOEActivity getBoeActivity() {
        FragmentActivity activity = getActivity();
        if (activity instanceof BOEActivity) {
            return (BOEActivity) activity;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.fragment.app.FragmentActivity] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.etsy.android.p327ui.search.container.C10741a getSearchContainerComponent() {
        /*
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.getParentFragment()
            boolean r1 = r0 instanceof com.etsy.android.p327ui.search.container.C10741a
            r2 = 0
            if (r1 == 0) goto L_0x000c
            com.etsy.android.ui.search.container.a r0 = (com.etsy.android.p327ui.search.container.C10741a) r0
            goto L_0x000d
        L_0x000c:
            r0 = r2
        L_0x000d:
            if (r0 != 0) goto L_0x0026
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            boolean r1 = r0 instanceof com.etsy.android.p327ui.search.container.C10741a
            if (r1 == 0) goto L_0x001a
            r2 = r0
            com.etsy.android.ui.search.container.a r2 = (com.etsy.android.p327ui.search.container.C10741a) r2
        L_0x001a:
            if (r2 == 0) goto L_0x001e
            r0 = r2
            goto L_0x0026
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Either parent fragment or activity must be an instance of SearchContainerComponent"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.p330v2.taxonomy.SearchTaxonomyCategoryPageFragment.getSearchContainerComponent():com.etsy.android.ui.search.container.a");
    }

    /* access modifiers changed from: private */
    public final void logTouchEvent(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PredefinedAnalyticsProperty.TAXONOMY_ID, str2);
        getAnalyticsContext().mo21333d(str, linkedHashMap);
    }

    private final void resetToolbar() {
        if (this.shouldResetToolbar && getActivity() != null && (getActivity() instanceof BOEActivity)) {
            BOEActivity bOEActivity = (BOEActivity) getActivity();
            C19383o.m32794d(bOEActivity);
            AppBarHelper appBarHelper = bOEActivity.getAppBarHelper();
            C19383o.m32796f(appBarHelper, "activity as BOEActivity?)!!.appBarHelper");
            appBarHelper.resetToolbarColor();
            if (!appBarHelper.isFullScreen(getActivity())) {
                appBarHelper.resetStatusBarColor(getActivity());
            }
            appBarHelper.restoreElevation();
        }
    }

    private final void setUpToolbar() {
        AppBarHelper appBarHelper;
        this.shouldResetToolbar = true;
        BOEActivity boeActivity = getBoeActivity();
        if (boeActivity != null && (appBarHelper = boeActivity.getAppBarHelper()) != null) {
            FragmentActivity requireActivity = requireActivity();
            Object obj = C8184a.f17966a;
            appBarHelper.changeToolbarBackgroundColor(C8184a.C8188d.m16468a(requireActivity, R.color.navigational_header_tear));
            appBarHelper.removeElevation();
            if (!appBarHelper.isFullScreen(getActivity())) {
                appBarHelper.changeStatusBarColor(C8184a.C8188d.m16468a(requireActivity(), R.color.navigational_header_tear), getActivity());
            }
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

    public String getApiUrl() {
        return "/etsyapps/v3/bespoke/member/category-page";
    }

    public C13801b getCardViewHolderFactory() {
        ListingCardViewHolderOptions.C11975i iVar = r0;
        C8623e configMap = getConfigMap();
        C19383o.m32796f(configMap, "configMap");
        ListingCardViewHolderOptions.C11975i iVar2 = new ListingCardViewHolderOptions.C11975i(configMap);
        C13173c adapter = getAdapter();
        C11780h favoriteRepository2 = getFavoriteRepository();
        C8703p analyticsContext = getAnalyticsContext();
        C13461f rxSchedulers2 = getRxSchedulers();
        C8267e adImpressionRepository = getAdImpressionRepository();
        C12724a deepLinkEligibility = getDeepLinkEligibility();
        C12741o routeInspector = getRouteInspector();
        C13851a deepLinkEntityChecker = getDeepLinkEntityChecker();
        C10865h searchUriParser = getSearchUriParser();
        C13799a aVar = r0;
        C19383o.m32796f(adapter, "getAdapter()");
        C19383o.m32796f(analyticsContext, "analyticsContext");
        C13799a aVar2 = new C13799a(this, adapter, analyticsContext, favoriteRepository2, rxSchedulers2, adImpressionRepository, deepLinkEligibility, routeInspector, deepLinkEntityChecker, searchUriParser, this, iVar, (C10715a) null, (C12796e) null, (C8630b) null, (WeakReference) null, 61440);
        return new C11104b(aVar);
    }

    public final C11110a getCategoriesViewEligibility() {
        C11110a aVar = this.categoriesViewEligibility;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("categoriesViewEligibility");
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

    public final C13851a getEntityChecker() {
        C13851a aVar = this.entityChecker;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("entityChecker");
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

    public int getLayoutId() {
        return R.layout.fragment_taxonomy_category;
    }

    public C13379a getPagination() {
        return this.paginationNone;
    }

    public C8709f getPerformanceTracker() {
        return getPerformanceTrackerAdapter().f19119a;
    }

    public final C8704a getPerformanceTrackerAdapter() {
        C8704a aVar = this.performanceTrackerAdapter;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("performanceTrackerAdapter");
        throw null;
    }

    public Map<String, String> getRequestParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("search_on_homescreen_experience", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        String str = this.taxonomyId;
        if (str != null) {
            hashMap.put(ResponseConstants.TAXONOMY_ID, str);
        } else {
            String str2 = this.taxonomyPath;
            if (str2 != null) {
                String encode = Uri.encode(str2);
                C19383o.m32796f(encode, "encode(taxonomyPath)");
                hashMap.put(EditableListing.FIELD_TAXONOMY_PATH, encode);
            }
        }
        String str3 = this.anchorListingId;
        if (str3 != null) {
            hashMap.put(ResponseConstants.ANCHOR_LISTING_ID, str3);
        }
        hashMap.put("is_redesign_phase_2_enabled", "true");
        String country = getCurrentLocale().mo46719c().getCountry();
        C19383o.m32796f(country, "currentLocale.getSystemLocale().country");
        hashMap.put("ship_to", country);
        if (getCategoriesViewEligibility().f24591a.mo21132b(C8592b.f18750O0)) {
            hashMap.put("use_horizontal_category_lists", "true");
        }
        return hashMap;
    }

    public final C13461f getRxSchedulers() {
        C13461f fVar = this.rxSchedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("rxSchedulers");
        throw null;
    }

    public String getTrackingName() {
        return ResponseConstants.CATEGORY;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [com.etsy.android.lib.models.datatypes.EtsyId] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            com.etsy.android.lib.logger.perf.a r0 = r5.getPerformanceTrackerAdapter()
            if (r6 != 0) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            r0.mo21372d(r1)
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L_0x0094
            java.lang.String r1 = "search_taxonomy_id"
            boolean r2 = r0.containsKey(r1)
            r3 = 0
            if (r2 == 0) goto L_0x0033
            java.lang.String r6 = r0.getString(r1)
            r5.taxonomyId = r6
            if (r6 != 0) goto L_0x0086
            java.lang.Long r6 = com.google.android.play.core.appupdate.C15562d.m25175M(r0, r1)
            if (r6 == 0) goto L_0x0030
            java.lang.String r3 = r6.toString()
        L_0x0030:
            r5.taxonomyId = r3
            goto L_0x0086
        L_0x0033:
            if (r6 != 0) goto L_0x0078
            java.lang.String r6 = "SEARCH_CATEGORY_REDIRECT"
            boolean r2 = r0.containsKey(r6)
            if (r2 == 0) goto L_0x0078
            android.os.Parcelable r2 = r0.getParcelable(r6)
            boolean r4 = r2 instanceof com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable
            if (r4 == 0) goto L_0x0048
            com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable r2 = (com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable) r2
            goto L_0x0049
        L_0x0048:
            r2 = r3
        L_0x0049:
            if (r2 == 0) goto L_0x0050
            com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage r2 = com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelableKt.toSearchCategoryRedirectPage(r2)
            goto L_0x0051
        L_0x0050:
            r2 = r3
        L_0x0051:
            if (r2 == 0) goto L_0x0058
            com.etsy.android.lib.models.TaxonomyNode r2 = r2.getTaxonomyNode()
            goto L_0x0059
        L_0x0058:
            r2 = r3
        L_0x0059:
            if (r2 == 0) goto L_0x005f
            com.etsy.android.lib.models.datatypes.EtsyId r3 = r2.getTaxonomyNodeId()
        L_0x005f:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r5.taxonomyId = r3
            r0.remove(r6)
            if (r2 == 0) goto L_0x0086
            com.etsy.android.lib.models.datatypes.EtsyId r6 = r2.getTaxonomyNodeId()
            if (r6 == 0) goto L_0x0086
            long r2 = r6.getIdAsLong()
            r0.putLong(r1, r2)
            goto L_0x0086
        L_0x0078:
            java.lang.String r6 = "search_taxonomy_path"
            boolean r1 = r0.containsKey(r6)
            if (r1 == 0) goto L_0x0086
            java.lang.String r6 = r0.getString(r6)
            r5.taxonomyPath = r6
        L_0x0086:
            java.lang.String r6 = "ANCHOR_LISTING_ID"
            boolean r1 = r0.containsKey(r6)
            if (r1 == 0) goto L_0x0094
            java.lang.String r6 = r0.getString(r6)
            r5.anchorListingId = r6
        L_0x0094:
            com.etsy.android.ad.impressions.AdImpressionScrollListener r6 = new com.etsy.android.ad.impressions.AdImpressionScrollListener
            of.c r0 = r5.getAdapter()
            java.lang.String r1 = "getAdapter()"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            com.etsy.android.ui.search.v2.taxonomy.SearchTaxonomyCategoryPageFragment$onCreate$2 r1 = new com.etsy.android.ui.search.v2.taxonomy.SearchTaxonomyCategoryPageFragment$onCreate$2
            r1.<init>(r5)
            r6.<init>(r0, r1)
            r5.adsImpressionsLogger = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.p330v2.taxonomy.SearchTaxonomyCategoryPageFragment.onCreate(android.os.Bundle):void");
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C19383o.m32797g(menu, "menu");
        C19383o.m32797g(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        BOEOptionsMenuItemHelper.m19853a(menu);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        Context context = onCreateView.getContext();
        C19383o.m32796f(context, "view.context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.clg_color_bg_primary, typedValue, true);
        onCreateView.setBackgroundResource(typedValue.resourceId);
        CollageEdge collageEdge2 = (CollageEdge) onCreateView.findViewById(R.id.header_edge);
        this.collageEdge = collageEdge2;
        if (collageEdge2 != null) {
            Context requireContext = requireContext();
            Object obj = C8184a.f17966a;
            collageEdge2.setImageTintList(ColorStateList.valueOf(C8184a.C8188d.m16468a(requireContext, R.color.navigational_header_tear)));
        }
        ViewExtensions.m12869m(this.collageEdge);
        RecyclerView recyclerView = this.recyclerView;
        AdImpressionScrollListener adImpressionScrollListener = this.adsImpressionsLogger;
        if (adImpressionScrollListener != null) {
            recyclerView.addOnScrollListener(adImpressionScrollListener);
            C11109f fVar = new C11109f(this, getAnalyticsContext());
            C8703p analyticsContext = getAnalyticsContext();
            C19383o.m32796f(analyticsContext, "analyticsContext");
            RecyclerView recyclerView2 = this.recyclerView;
            C19383o.m32796f(recyclerView2, "recyclerView");
            recyclerView2.addOnScrollListener(new C13805c(new C13364c(), new C13806d(analyticsContext)));
            C13173c adapter = getAdapter();
            C8703p analyticsContext2 = getAnalyticsContext();
            C19383o.m32796f(analyticsContext2, "analyticsContext");
            registerCardViewFactoryClickHandler(R.id.view_type_listing_card, new C11107d(this, adapter, analyticsContext2, getAdImpressionRepository()));
            C8703p analyticsContext3 = getAnalyticsContext();
            C19383o.m32796f(analyticsContext3, "analyticsContext");
            C11106c cVar = new C11106c(this, analyticsContext3);
            C8703p analyticsContext4 = getAnalyticsContext();
            C19383o.m32796f(analyticsContext4, "analyticsContext");
            registerCardViewFactoryClickHandler(R.id.view_type_section_header_with_page_link, new C9121f(this, analyticsContext4, cVar, (C13236g) null));
            registerCardViewFactoryClickHandler(R.id.view_type_section_link_footer, cVar);
            registerCardViewFactoryClickHandler(R.id.view_type_section_collage_link_footer, fVar);
            registerCardViewFactoryClickHandler(R.id.view_type_category_card, fVar);
            registerCardViewFactoryClickHandler(R.id.view_type_taxonomy_category, fVar);
            registerCardViewFactoryClickHandler(R.id.view_type_formatted_taxonomy_category, fVar);
            this.recyclerView.addItemDecoration(new C10969a(getResources().getDimensionPixelSize(R.dimen.clg_space_12), getResources().getDimensionPixelSize(R.dimen.clg_space_8), false));
            this.recyclerView.setPadding(getResources().getDimensionPixelSize(R.dimen.clg_space_16), this.recyclerView.getPaddingTop(), getResources().getDimensionPixelSize(R.dimen.clg_space_16), this.recyclerView.getPaddingBottom());
            this.recyclerView.addItemDecoration(new C11108e(this));
            if (bundle == null) {
                Page page = this.categoryRedirectPage;
                if (page != null) {
                    onLoadComplete(page);
                    this.categoryRedirectPage = null;
                } else {
                    getPerformanceTrackerAdapter().mo21369a();
                    loadContent();
                }
            }
            return onCreateView;
        }
        C19383o.m32805o("adsImpressionsLogger");
        throw null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            C11914o.m19630b(recyclerView.getViewTreeObserver(), this.recyclerViewOnGlobalLayoutListener);
        }
        this.recyclerViewOnGlobalLayoutListener = null;
        this.collageEdge = null;
    }

    public void onLoadFailure() {
        super.onLoadFailure();
        getPerformanceTrackerAdapter().mo21370b();
        getPerformanceTrackerAdapter().f19123e = true;
    }

    public void onLoadSuccess(C13554f.C13556b bVar) {
        C19383o.m32797g(bVar, "result");
        getPerformanceTrackerAdapter().mo21370b();
        super.onLoadSuccess(bVar);
        setUpToolbar();
        getPerformanceTrackerAdapter().f19123e = true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        if (menuItem.getItemId() != R.id.menu_search) {
            return super.onOptionsItemSelected(menuItem);
        }
        C12788a.m20424c(getActivity(), new SearchContainerKey(C19421p.m32935c0(getActivity()), (SearchSpec) null, (SearchRedirectSpec) null, (Bundle) null, 14, (DefaultConstructorMarker) null));
        return true;
    }

    public void onPause() {
        super.onPause();
        getAdImpressionRepository().mo20867a();
    }

    public void onPrepareOptionsMenu(Menu menu) {
        C19383o.m32797g(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(R.id.menu_search);
        if (findItem != null) {
            findItem.setVisible(true);
            findItem.setEnabled(true);
        }
    }

    public void onRefresh() {
        super.onRefresh();
        getAdImpressionRepository().f18117j.clear();
    }

    public void onResume() {
        super.onResume();
        setUpToolbar();
    }

    public void onStop() {
        super.onStop();
        resetToolbar();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        getSearchContainerComponent().clearFocus();
        ViewTreeObserver viewTreeObserver = this.recyclerView.getViewTreeObserver();
        SearchTaxonomyCategoryPageFragment$onViewCreated$1 searchTaxonomyCategoryPageFragment$onViewCreated$1 = new SearchTaxonomyCategoryPageFragment$onViewCreated$1(this);
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(searchTaxonomyCategoryPageFragment$onViewCreated$1);
        }
        this.recyclerViewOnGlobalLayoutListener = searchTaxonomyCategoryPageFragment$onViewCreated$1;
        this.recyclerView.addOnAttachStateChangeListener(new SearchTaxonomyCategoryPageFragment$onViewCreated$2(this));
    }

    public final void setCategoriesViewEligibility(C11110a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.categoriesViewEligibility = aVar;
    }

    public final void setCurrentLocale(C13888d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.currentLocale = dVar;
    }

    public final void setEntityChecker(C13851a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.entityChecker = aVar;
    }

    public final void setFavoriteRepository(C11780h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.favoriteRepository = hVar;
    }

    public final void setPerformanceTrackerAdapter(C8704a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.performanceTrackerAdapter = aVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }
}
