package com.etsy.android.p327ui.favorites.search;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cardview.viewholders.C9182h1;
import com.etsy.android.p327ui.favorites.search.clusters.C9888a;
import com.etsy.android.p327ui.favorites.search.clusters.ClusterItem;
import com.etsy.android.stylekit.views.CollageButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19543e0;
import p001a0.C0005b;
import p186n2.C7377b;
import p186n2.C7426q;
import p186n2.C7429r;
import p431qf.C13327b;
import p504ai.C13983i;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.search.SearchView */
public final class SearchView extends ConstraintLayout {
    public static final int $stable = 8;
    public static final C9881a Companion = new C9881a();
    private static final String EMPTY_STRING = "";
    private static final int FIRST_ITEM = 0;
    public Map<Integer, View> _$_findViewCache;
    /* access modifiers changed from: private */
    public C8672b analyticsTracker;
    private final C19285c clustersRecyclerView$delegate;
    private final C19285c createCollectionButton$delegate;
    private final C19285c editCollectionButton$delegate;
    private final C19285c filterButton$delegate;
    private final C19285c searchEditText$delegate;
    /* access modifiers changed from: private */
    public C9891e searchInFavoritesListItem;
    private final C19285c searchInputLayout$delegate;
    private final RecyclerView.C3108s searchWithClustersOnScrollListener;

    /* renamed from: com.etsy.android.ui.favorites.search.SearchView$a */
    public static final class C9881a {
    }

    /* renamed from: com.etsy.android.ui.favorites.search.SearchView$b */
    public static final class C9882b extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ SearchView f21806b;

        public C9882b(SearchView searchView) {
            this.f21806b = searchView;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C19383o.m32797g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (i > 0) {
                C19394m unused = this.f21806b.trackClusterScrolledRight();
            }
        }
    }

    /* renamed from: com.etsy.android.ui.favorites.search.SearchView$c */
    public static final class C9883c extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ SearchView f21807b;

        public C9883c(SearchView searchView) {
            this.f21807b = searchView;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C19383o.m32797g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            RecyclerView.C3100o layoutManager = recyclerView.getLayoutManager();
            C19383o.m32795e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            this.f21807b.showClusters(((GridLayoutManager) layoutManager).mo11279P0() == 0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        this.searchWithClustersOnScrollListener = new C9883c(this);
        this.searchInputLayout$delegate = C19350d.m32677b(new SearchView$searchInputLayout$2(this));
        this.searchEditText$delegate = C19350d.m32677b(new SearchView$searchEditText$2(this));
        this.filterButton$delegate = C19350d.m32677b(new SearchView$filterButton$2(this));
        this.createCollectionButton$delegate = C19350d.m32677b(new SearchView$createCollectionButton$2(this));
        this.editCollectionButton$delegate = C19350d.m32677b(new SearchView$editCollectionButton$2(this));
        this.clustersRecyclerView$delegate = C19350d.m32677b(new SearchView$clustersRecyclerView$2(this));
        LayoutInflater.from(context).inflate(R.layout.list_item_search_in_favorites, this, true);
    }

    private final void animateClustersCollapse() {
        C7429r rVar = new C7429r();
        C7377b bVar = new C7377b();
        bVar.f16565g.add(this);
        bVar.f16562d = 0;
        rVar.mo19770F(new FastOutSlowInInterpolator());
        rVar.mo19802N(bVar);
        C7426q.m14342a(this, rVar);
        ViewExtensions.m12860d(getClustersRecyclerView());
    }

    private final void animateClustersExpand() {
        C7429r rVar = new C7429r();
        C7377b bVar = new C7377b();
        bVar.f16565g.add(this);
        bVar.f16562d = 300;
        rVar.mo19770F(new FastOutSlowInInterpolator());
        rVar.mo19802N(bVar);
        C7426q.m14342a(this, rVar);
        ViewExtensions.m12869m(getClustersRecyclerView());
    }

    private final void bindButtons(boolean z, boolean z2) {
        CollageButton editCollectionButton = getEditCollectionButton();
        if (z) {
            ViewExtensions.m12869m(editCollectionButton);
        } else {
            ViewExtensions.m12860d(editCollectionButton);
        }
        CollageButton createCollectionButton = getCreateCollectionButton();
        if (z2) {
            ViewExtensions.m12869m(createCollectionButton);
            setOnCreateCollectionButtonClickedListener();
            return;
        }
        ViewExtensions.m12860d(createCollectionButton);
    }

    private final void bindClusters(List<ClusterItem> list) {
        RecyclerView clustersRecyclerView = getClustersRecyclerView();
        C9888a aVar = new C9888a(new SearchView$bindClusters$1$1(this));
        aVar.mo11950j(list);
        clustersRecyclerView.setAdapter(aVar);
        clustersRecyclerView.addOnScrollListener(new C9882b(this));
        showClusters(true);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.clg_space_8);
        C13327b bVar = new C13327b(dimensionPixelOffset, getResources().getDimensionPixelOffset(R.dimen.clg_space_8), 0, getResources().getDimensionPixelOffset(R.dimen.clg_space_8), 12, 0);
        RecyclerView clustersRecyclerView2 = getClustersRecyclerView();
        if (clustersRecyclerView2.getItemDecorationCount() > 0) {
            clustersRecyclerView2.removeItemDecorationAt(0);
        }
        clustersRecyclerView2.addItemDecoration(bVar);
    }

    private final void bindFilterButton() {
        C9891e eVar = this.searchInFavoritesListItem;
        if (eVar != null) {
            Button filterButton = getFilterButton();
            if (eVar.f21820c) {
                RecyclerView.Adapter adapter = getClustersRecyclerView().getAdapter();
                boolean z = false;
                if (adapter != null && adapter.getItemCount() == 0) {
                    z = true;
                }
                if (z) {
                    ViewExtensions.m12866j(filterButton, new SearchView$bindFilterButton$1$1$1(this, eVar));
                    ViewExtensions.m12869m(filterButton);
                    return;
                }
            }
            ViewExtensions.m12860d(filterButton);
        }
    }

    private final void bindSearch() {
        C9891e eVar = this.searchInFavoritesListItem;
        if (eVar != null) {
            getSearchInputLayout().setEndIconOnClickListener(new C9182h1(1, this, eVar));
            TextInputEditText searchEditText = getSearchEditText();
            searchEditText.setHint(searchEditText.getHint());
            searchEditText.setText(eVar.f21823f);
            searchEditText.setOnFocusChangeListener(new C9893g(this, 0));
            getSearchInputLayout().setEndIconVisible(C18263b.m30839d0(searchEditText.getText()));
            searchEditText.addTextChangedListener(new C9884x6477de38(this));
            searchEditText.setOnEditorActionListener(new C9894h(this, eVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: bindSearch$lambda-6$lambda-1  reason: not valid java name */
    public static final void m34979bindSearch$lambda6$lambda1(SearchView searchView, C9891e eVar, View view) {
        C19383o.m32797g(searchView, "this$0");
        C19383o.m32797g(eVar, "$item");
        searchView.trackSearchCleared();
        eVar.f21819b.onSearchCleared();
        searchView.getSearchEditText().setText("");
        searchView.removeFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: bindSearch$lambda-6$lambda-5$lambda-2  reason: not valid java name */
    public static final void m34980bindSearch$lambda6$lambda5$lambda2(SearchView searchView, View view, boolean z) {
        C19383o.m32797g(searchView, "this$0");
        if (z) {
            searchView.trackSearchTapped();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: bindSearch$lambda-6$lambda-5$lambda-4  reason: not valid java name */
    public static final boolean m34981bindSearch$lambda6$lambda5$lambda4(SearchView searchView, C9891e eVar, TextView textView, int i, KeyEvent keyEvent) {
        C19383o.m32797g(searchView, "this$0");
        C19383o.m32797g(eVar, "$item");
        if (3 != i) {
            return false;
        }
        searchView.performSearch(textView.getText().toString(), eVar.f21819b);
        return true;
    }

    private final RecyclerView getClustersRecyclerView() {
        Object value = this.clustersRecyclerView$delegate.getValue();
        C19383o.m32796f(value, "<get-clustersRecyclerView>(...)");
        return (RecyclerView) value;
    }

    private final CollageButton getCreateCollectionButton() {
        Object value = this.createCollectionButton$delegate.getValue();
        C19383o.m32796f(value, "<get-createCollectionButton>(...)");
        return (CollageButton) value;
    }

    private final CollageButton getEditCollectionButton() {
        Object value = this.editCollectionButton$delegate.getValue();
        C19383o.m32796f(value, "<get-editCollectionButton>(...)");
        return (CollageButton) value;
    }

    private final Button getFilterButton() {
        Object value = this.filterButton$delegate.getValue();
        C19383o.m32796f(value, "<get-filterButton>(...)");
        return (Button) value;
    }

    private final TextInputEditText getSearchEditText() {
        Object value = this.searchEditText$delegate.getValue();
        C19383o.m32796f(value, "<get-searchEditText>(...)");
        return (TextInputEditText) value;
    }

    /* access modifiers changed from: private */
    public final TextInputLayout getSearchInputLayout() {
        Object value = this.searchInputLayout$delegate.getValue();
        C19383o.m32796f(value, "<get-searchInputLayout>(...)");
        return (TextInputLayout) value;
    }

    private final void hideClusters() {
        ViewExtensions.m12860d(getClustersRecyclerView());
    }

    /* access modifiers changed from: private */
    public final void performSearch(String str, C9890d dVar) {
        getSearchEditText().setText(str);
        removeFocus();
        if (dVar != null) {
            dVar.onSearch(str);
        }
        showClusters(false);
    }

    private final void removeFocus() {
        getSearchEditText().clearFocus();
        C15588c1.m25340p0(getSearchEditText());
    }

    /* access modifiers changed from: private */
    public final C19394m trackClusterScrolledRight() {
        C8672b bVar = this.analyticsTracker;
        Boolean bool = null;
        if (bVar == null) {
            return null;
        }
        String analyticsId = FavoriteSearchAnalytics.CLUSTER_SCROLLED_RIGHT.getAnalyticsId();
        C9891e eVar = this.searchInFavoritesListItem;
        if (eVar != null) {
            bool = Boolean.valueOf(eVar.f21820c);
        }
        bVar.mo21333d(analyticsId, C0005b.m33a0(bool));
        return C19394m.f43287a;
    }

    private final C19394m trackClusterShown() {
        C8672b bVar = this.analyticsTracker;
        Boolean bool = null;
        if (bVar == null) {
            return null;
        }
        String analyticsId = FavoriteSearchAnalytics.CLUSTER_SHOWN.getAnalyticsId();
        C9891e eVar = this.searchInFavoritesListItem;
        if (eVar != null) {
            bool = Boolean.valueOf(eVar.f21820c);
        }
        bVar.mo21333d(analyticsId, C0005b.m33a0(bool));
        return C19394m.f43287a;
    }

    /* access modifiers changed from: private */
    public final C19394m trackClusterTapped() {
        C8672b bVar = this.analyticsTracker;
        Boolean bool = null;
        if (bVar == null) {
            return null;
        }
        String analyticsId = FavoriteSearchAnalytics.CLUSTER_TAPPED.getAnalyticsId();
        C9891e eVar = this.searchInFavoritesListItem;
        if (eVar != null) {
            bool = Boolean.valueOf(eVar.f21820c);
        }
        bVar.mo21333d(analyticsId, C0005b.m33a0(bool));
        return C19394m.f43287a;
    }

    private final C19394m trackSearch(String str) {
        C8672b bVar = this.analyticsTracker;
        Boolean bool = null;
        if (bVar == null) {
            return null;
        }
        C9891e eVar = this.searchInFavoritesListItem;
        boolean z = true;
        if (eVar == null || !eVar.f21820c) {
            z = false;
        }
        String analyticsId = z ? FavoriteSearchAnalytics.COLLECTION_SEARCH.getAnalyticsId() : FavoriteSearchAnalytics.FAVORITES_SEARCH.getAnalyticsId();
        C9891e eVar2 = this.searchInFavoritesListItem;
        if (eVar2 != null) {
            bool = Boolean.valueOf(eVar2.f21820c);
        }
        Map a0 = C0005b.m33a0(bool);
        PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.QUERY;
        if (str == null) {
            str = "";
        }
        bVar.mo21333d(analyticsId, C19294b0.m32564u0(a0, C19421p.m32931U(new Pair(predefinedAnalyticsProperty, str))));
        return C19394m.f43287a;
    }

    private final C19394m trackSearchCleared() {
        C8672b bVar = this.analyticsTracker;
        Boolean bool = null;
        if (bVar == null) {
            return null;
        }
        C9891e eVar = this.searchInFavoritesListItem;
        boolean z = true;
        if (eVar == null || !eVar.f21820c) {
            z = false;
        }
        String analyticsId = z ? FavoriteSearchAnalytics.COLLECTION_SEARCH_CLEARED.getAnalyticsId() : FavoriteSearchAnalytics.FAVORITES_SEARCH_CLEARED.getAnalyticsId();
        C9891e eVar2 = this.searchInFavoritesListItem;
        if (eVar2 != null) {
            bool = Boolean.valueOf(eVar2.f21820c);
        }
        bVar.mo21333d(analyticsId, C0005b.m33a0(bool));
        return C19394m.f43287a;
    }

    private final C19394m trackSearchTapped() {
        C8672b bVar = this.analyticsTracker;
        Boolean bool = null;
        if (bVar == null) {
            return null;
        }
        C9891e eVar = this.searchInFavoritesListItem;
        boolean z = true;
        if (eVar == null || !eVar.f21820c) {
            z = false;
        }
        String analyticsId = z ? FavoriteSearchAnalytics.COLLECTION_SEARCH_TAPPED.getAnalyticsId() : FavoriteSearchAnalytics.FAVORITES_SEARCH_TAPPED.getAnalyticsId();
        C9891e eVar2 = this.searchInFavoritesListItem;
        if (eVar2 != null) {
            bool = Boolean.valueOf(eVar2.f21820c);
        }
        bVar.mo21333d(analyticsId, C0005b.m33a0(bool));
        return C19394m.f43287a;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void bind(C9891e eVar) {
        C19383o.m32797g(eVar, "data");
        this.searchInFavoritesListItem = eVar;
        trackSearch(eVar.f21823f);
        bindSearch();
        bindFilterButton();
        bindButtons(eVar.f21822e, eVar.f21821d);
    }

    public final RecyclerView.C3108s getSearchWithClustersOnScrollListener() {
        return this.searchWithClustersOnScrollListener;
    }

    public final void setClusters(List<ClusterItem> list) {
        C19383o.m32797g(list, "clusters");
        if (C19543e0.m33306Y(list)) {
            bindClusters(list);
        } else {
            hideClusters();
        }
    }

    public final void setOnCollectionMenuButtonClickedListener(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, "onCollectionMenuButtonClickedListener");
        ViewExtensions.m12866j(getEditCollectionButton(), new SearchView$setOnCollectionMenuButtonClickedListener$1(aVar));
    }

    public final void setOnCreateCollectionButtonClickedListener() {
        ViewExtensions.m12866j(getCreateCollectionButton(), SearchView$setOnCreateCollectionButtonClickedListener$1.INSTANCE);
    }

    public final void showClusters(boolean z) {
        if (z) {
            Editable text = getSearchEditText().getText();
            if (text == null || text.length() == 0) {
                trackClusterShown();
                animateClustersExpand();
                return;
            }
        }
        animateClustersCollapse();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchView(C8672b bVar, Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.analyticsTracker = bVar;
    }
}
