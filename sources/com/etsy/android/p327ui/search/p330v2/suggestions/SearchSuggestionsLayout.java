package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.compose.animation.C0472h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C3185q;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.p043ui.C4950e;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.search.TaxonomyNode;
import com.etsy.android.p327ui.search.p330v2.C10969a;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11047d;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11056k;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11064o;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11083w;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p145io.reactivex.subjects.PublishSubject;
import p248tp.C8061n;
import p260v0.C8184a;
import p430qe.C13311c;
import p435rb.C13350a;
import p504ai.C13983i;
import p568fn.C17782b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.SearchSuggestionsLayout */
public final class SearchSuggestionsLayout extends ConstraintLayout implements SearchView.C0283l, C11047d.C11049b {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public final int MIN_SUGGESTIONS;
    public Map<Integer, View> _$_findViewCache;
    /* access modifiers changed from: private */
    public C11047d adapter;
    private C8703p analyticsContext;
    /* access modifiers changed from: private */
    public final PublishSubject<C13311c> clickEvents;
    private View errorView;
    private boolean hasLoggedPopularSearchesEvent;
    private TextView historyEmptyText;
    private View loadingView;
    /* access modifiers changed from: private */
    public RecyclerView recyclerView;
    private boolean showRecentlyViewedScrollRightEvent;
    /* access modifiers changed from: private */
    public List<C11083w> suggestions;

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.SearchSuggestionsLayout$a */
    public static final class C11035a extends GridLayoutManager.C3075b {

        /* renamed from: d */
        public final /* synthetic */ SearchSuggestionsLayout f24473d;

        /* renamed from: e */
        public final /* synthetic */ int f24474e;

        /* renamed from: f */
        public final /* synthetic */ int f24475f;

        public C11035a(SearchSuggestionsLayout searchSuggestionsLayout, int i, int i2) {
            this.f24473d = searchSuggestionsLayout;
            this.f24474e = i;
            this.f24475f = i2;
        }

        /* renamed from: d */
        public final int mo11265d(int i) {
            RecyclerView.Adapter adapter = this.f24473d.recyclerView.getAdapter();
            C19383o.m32794d(adapter);
            return adapter.getItemViewType(i) == R.layout.list_item_mosaic_card ? this.f24474e : this.f24475f;
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.SearchSuggestionsLayout$b */
    public static final class C11036b extends RecyclerView.C3108s {
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C19383o.m32797g(recyclerView, "recyclerView");
            if (i == 1) {
                C15588c1.m25340p0(recyclerView);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.SearchSuggestionsLayout$c */
    public static final class C11037c implements C11051f {

        /* renamed from: a */
        public final /* synthetic */ SearchSuggestionsLayout f24476a;

        public C11037c(SearchSuggestionsLayout searchSuggestionsLayout) {
            this.f24476a = searchSuggestionsLayout;
        }

        /* renamed from: a */
        public final void mo36649a(int i) {
            this.f24476a.fetchRemainingSavedSearches(i);
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.SearchSuggestionsLayout$d */
    public static final class C11038d extends C3185q.C3194g {

        /* renamed from: e */
        public final /* synthetic */ SearchSuggestionsLayout f24477e;

        /* renamed from: f */
        public final /* synthetic */ Drawable f24478f;

        /* renamed from: g */
        public final /* synthetic */ ColorDrawable f24479g;

        /* renamed from: h */
        public final /* synthetic */ int f24480h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11038d(SearchSuggestionsLayout searchSuggestionsLayout, Drawable drawable, ColorDrawable colorDrawable, int i) {
            super(0);
            this.f24477e = searchSuggestionsLayout;
            this.f24478f = drawable;
            this.f24479g = colorDrawable;
            this.f24480h = i;
        }

        /* renamed from: d */
        public final void mo11932d(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3084b0 b0Var, float f, float f2, int i, boolean z) {
            Canvas canvas2 = canvas;
            RecyclerView.C3084b0 b0Var2 = b0Var;
            float f3 = f;
            C19383o.m32797g(canvas, "c");
            C19383o.m32797g(recyclerView, "recyclerView");
            C19383o.m32797g(b0Var2, "viewHolder");
            View view = b0Var2.itemView;
            C19383o.m32796f(view, "viewHolder.itemView");
            int height = view.getHeight();
            Drawable drawable = this.f24478f;
            int i2 = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            Drawable drawable2 = this.f24478f;
            if (drawable2 != null) {
                i2 = drawable2.getMinimumWidth();
            }
            int i3 = (height - intrinsicHeight) / 2;
            int top = view.getTop() + i3;
            int right = (view.getRight() - i3) - i2;
            int right2 = view.getRight() - i3;
            int i4 = intrinsicHeight + top;
            if (f3 < 0.0f) {
                this.f24479g.setBounds(view.getRight() + ((int) f3), view.getTop(), view.getRight(), view.getBottom());
                this.f24479g.draw(canvas);
                Drawable drawable3 = this.f24478f;
                if (drawable3 != null) {
                    drawable3.setTint(this.f24480h);
                    this.f24478f.setBounds(right, top, right2, i4);
                    this.f24478f.draw(canvas);
                }
            }
            canvas.save();
            super.mo11932d(canvas, recyclerView, b0Var, f, f2, i, z);
        }

        /* renamed from: e */
        public final void mo11933e(RecyclerView recyclerView, RecyclerView.C3084b0 b0Var, RecyclerView.C3084b0 b0Var2) {
            C19383o.m32797g(recyclerView, "recyclerView");
            C19383o.m32797g(b0Var, "viewHolder");
        }

        /* renamed from: f */
        public final void mo11934f(RecyclerView.C3084b0 b0Var) {
            C19383o.m32797g(b0Var, "viewHolder");
            int bindingAdapterPosition = b0Var.getBindingAdapterPosition();
            List access$getSuggestions$p = this.f24477e.suggestions;
            C11083w.C11089f fVar = null;
            Object obj = access$getSuggestions$p != null ? (C11083w) C19327t.m32641W0(bindingAdapterPosition, access$getSuggestions$p) : null;
            if (obj instanceof C11083w.C11089f) {
                fVar = (C11083w.C11089f) obj;
            }
            if (fVar != null) {
                C11064o oVar = fVar.f24560a;
                HashMap hashMap = new HashMap();
                hashMap.put(PredefinedAnalyticsProperty.QUERY, oVar.mo36653b());
                if (oVar instanceof C11064o.C11069e) {
                    this.f24477e.clickEvents.onNext(new C13311c.C13316e(((C11064o.C11069e) oVar).f24533d));
                    C8703p analyticsContext = this.f24477e.getAnalyticsContext();
                    if (analyticsContext != null) {
                        analyticsContext.mo21333d("swipe_to_delete_recent_search", hashMap);
                    }
                } else if (oVar instanceof C11064o.C11067c) {
                    this.f24477e.clickEvents.onNext(new C13311c.C13315d(((C11064o.C11067c) oVar).f24523a));
                    C8703p analyticsContext2 = this.f24477e.getAnalyticsContext();
                    if (analyticsContext2 != null) {
                        analyticsContext2.mo21333d("swipe_to_delete_recent_search", hashMap);
                    }
                }
                List access$getSuggestions$p2 = this.f24477e.suggestions;
                if (bindingAdapterPosition <= (access$getSuggestions$p2 != null ? access$getSuggestions$p2.size() : Integer.MIN_VALUE)) {
                    List access$getSuggestions$p3 = this.f24477e.suggestions;
                    if (access$getSuggestions$p3 != null) {
                        C11083w wVar = (C11083w) access$getSuggestions$p3.remove(bindingAdapterPosition);
                    }
                    this.f24477e.cleanQueryHeadersIfNecessary();
                }
                this.f24477e.adapter.notifyItemRemoved(bindingAdapterPosition);
                List access$getSuggestions$p4 = this.f24477e.suggestions;
                boolean z = false;
                if (access$getSuggestions$p4 != null && access$getSuggestions$p4.size() == this.f24477e.MIN_SUGGESTIONS) {
                    z = true;
                }
                if (z) {
                    this.f24477e.clickEvents.onNext(C13311c.C13318g.f29223a);
                }
            }
        }

        /* renamed from: g */
        public final int mo11942g(RecyclerView recyclerView, RecyclerView.C3084b0 b0Var) {
            C19383o.m32797g(recyclerView, "recyclerView");
            C19383o.m32797g(b0Var, "viewHolder");
            int bindingAdapterPosition = b0Var.getBindingAdapterPosition();
            if (bindingAdapterPosition == -1) {
                return 0;
            }
            List access$getSuggestions$p = this.f24477e.suggestions;
            C11083w wVar = access$getSuggestions$p != null ? (C11083w) C19327t.m32641W0(bindingAdapterPosition, access$getSuggestions$p) : null;
            if (!(wVar instanceof C11083w.C11089f)) {
                return 0;
            }
            C11064o oVar = ((C11083w.C11089f) wVar).f24560a;
            if ((oVar instanceof C11064o.C11067c) || (oVar instanceof C11064o.C11069e)) {
                return this.f7426c;
            }
            return 0;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchSuggestionsLayout(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchSuggestionsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchSuggestionsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        this.MIN_SUGGESTIONS = 1;
        this.clickEvents = new PublishSubject<>();
        LayoutInflater.from(context).inflate(R.layout.layout_search_suggestions, this, true);
        Context context2 = getContext();
        C19383o.m32796f(context2, "getContext()");
        TypedValue typedValue = new TypedValue();
        context2.getTheme().resolveAttribute(R.attr.clg_color_bg_primary, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        View findViewById = findViewById(R.id.search_suggestions_empty_text);
        C19383o.m32796f(findViewById, "findViewById(R.id.search_suggestions_empty_text)");
        this.historyEmptyText = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.search_suggestions_recyclerview);
        C19383o.m32796f(findViewById2, "findViewById(R.id.search_suggestions_recyclerview)");
        this.recyclerView = (RecyclerView) findViewById2;
        View findViewById3 = findViewById(R.id.loading_view);
        C19383o.m32796f(findViewById3, "findViewById(R.id.loading_view)");
        this.loadingView = findViewById3;
        View findViewById4 = findViewById(R.id.no_internet);
        C19383o.m32796f(findViewById4, "findViewById(R.id.no_internet)");
        this.errorView = findViewById4;
        hideLoaderAndError();
        int integer = context.getResources().getInteger(R.integer.vespa_grid_layout_max_span);
        int integer2 = context.getResources().getInteger(R.integer.vespa_category_card_item_span);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(integer);
        gridLayoutManager.f7008K = new C11035a(this, integer2, integer);
        this.recyclerView.setLayoutManager(gridLayoutManager);
        this.recyclerView.addOnScrollListener(new C11036b());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.clg_space_4);
        C10969a aVar = new C10969a(dimensionPixelSize, dimensionPixelSize, true);
        C10969a aVar2 = new C10969a(dimensionPixelSize2, dimensionPixelSize2, false);
        this.recyclerView.addItemDecoration(aVar);
        this.recyclerView.addItemDecoration(aVar2);
        this.adapter = new C11047d(this, new C19846a<C19394m>(this) {
            public final /* synthetic */ SearchSuggestionsLayout this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                this.this$0.onRecentViewScrollEnd();
            }
        }, new C11037c(this));
        setupSwipeToDeleteSearches();
        this.recyclerView.setAdapter(this.adapter);
    }

    /* access modifiers changed from: private */
    public final void cleanQueryHeadersIfNecessary() {
        boolean z;
        boolean z2;
        int i;
        List<C11083w> list = this.suggestions;
        int i2 = -1;
        if (list != null) {
            z2 = false;
            int i3 = 0;
            z = false;
            i = -1;
            for (T next : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C11083w wVar = (C11083w) next;
                    if (wVar instanceof C11083w.C11090g) {
                        C11056k kVar = ((C11083w.C11090g) wVar).f24561a;
                        if (kVar instanceof C11056k.C11060d) {
                            i2 = i3;
                        } else if (kVar instanceof C11056k.C11058b) {
                            i = i3;
                        }
                    } else if (wVar instanceof C11083w.C11089f) {
                        C11064o oVar = ((C11083w.C11089f) wVar).f24560a;
                        if (oVar instanceof C11064o.C11069e) {
                            z2 = true;
                        } else if (oVar instanceof C11064o.C11067c) {
                            z = true;
                        }
                    }
                    i3 = i4;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
        } else {
            z2 = false;
            z = false;
            i = -1;
        }
        if (!z2 && i2 >= 0) {
            List<C11083w> list2 = this.suggestions;
            if (list2 != null) {
                C11083w remove = list2.remove(i2);
            }
            this.adapter.notifyItemRemoved(i2);
        }
        if (!z && i >= 0) {
            List<C11083w> list3 = this.suggestions;
            if (list3 != null) {
                C11083w remove2 = list3.remove(i);
            }
            this.adapter.notifyItemRemoved(i);
        }
    }

    /* access modifiers changed from: private */
    public final void fetchRemainingSavedSearches(int i) {
        C8703p pVar = this.analyticsContext;
        if (pVar != null) {
            pVar.mo21333d("search_interstitial_more_saved_search_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        }
        this.clickEvents.onNext(new C13311c.C13317f(i));
    }

    private final boolean hasListQueriesWithBadges(List<? extends C11083w> list) {
        if (list == null) {
            return false;
        }
        for (C11083w wVar : list) {
            if (wVar instanceof C11083w.C11089f) {
                C11064o oVar = ((C11083w.C11089f) wVar).f24560a;
                if (oVar instanceof C11064o.C11069e) {
                    return ((C11064o.C11069e) oVar).f24535f;
                }
            }
        }
        return false;
    }

    private final void setupSwipeToDeleteSearches() {
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ColorDrawable colorDrawable = new ColorDrawable(C13350a.m21013d(context, R.attr.clg_color_bg_error));
        Context context2 = getContext();
        Object obj = C8184a.f17966a;
        Drawable b = C8184a.C8187c.m16466b(context2, R.drawable.clg_icon_core_trash_v1);
        Context context3 = getContext();
        TypedValue typedValue = new TypedValue();
        context3.getTheme().resolveAttribute(R.attr.clg_color_text_primary_on_dark, typedValue, true);
        new C3185q(new C11038d(this, b, colorDrawable, C8184a.C8188d.m16468a(getContext(), typedValue.resourceId))).mo11917f(this.recyclerView);
    }

    private final void showList() {
        this.historyEmptyText.setVisibility(8);
        this.recyclerView.setVisibility(0);
        setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: showSearchSuggestions$lambda-1  reason: not valid java name */
    public static final void m35050showSearchSuggestions$lambda1(SearchSuggestionsLayout searchSuggestionsLayout) {
        C19383o.m32797g(searchSuggestionsLayout, "this$0");
        searchSuggestionsLayout.recyclerView.scrollToPosition(0);
    }

    private final void trackBadgeSeenEvent(List<? extends C11083w> list) {
        C8703p pVar;
        if (hasListQueriesWithBadges(list) && (pVar = this.analyticsContext) != null) {
            pVar.mo21333d("saved_search_badge_seen", (Map<? extends AnalyticsProperty, Object>) null);
        }
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

    public final C8061n<C13311c> clickEvents() {
        PublishSubject<C13311c> publishSubject = this.clickEvents;
        return C0472h.m1242c(publishSubject, publishSubject);
    }

    public final C8703p getAnalyticsContext() {
        return this.analyticsContext;
    }

    public final void hideLoaderAndError() {
        this.loadingView.setVisibility(8);
        this.errorView.setVisibility(8);
    }

    public void hideSearchHistory() {
        this.historyEmptyText.setVisibility(0);
        this.recyclerView.setVisibility(8);
    }

    public void onBrowseCategoriesClicked() {
        C15588c1.m25340p0(this);
        C8703p pVar = this.analyticsContext;
        if (pVar != null) {
            pVar.mo21333d("browse_all_categories_landing", (Map<? extends AnalyticsProperty, Object>) null);
        }
        this.clickEvents.onNext(C13311c.C13312a.f29217a);
    }

    public void onCategoryClicked(TaxonomyNode taxonomyNode) {
        C19383o.m32797g(taxonomyNode, ResponseConstants.CATEGORY);
        C8703p pVar = this.analyticsContext;
        if (pVar != null) {
            pVar.mo21333d("autosuggest_category_tapped", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.CATEGORY_ID, Long.valueOf(taxonomyNode.getId()))));
        }
        this.clickEvents.onNext(new C13311c.C13313b(new com.etsy.android.lib.models.TaxonomyNode(taxonomyNode.getId(), taxonomyNode.getAllName())));
    }

    public void onClearRecentSearchesClicked() {
        C8703p pVar = this.analyticsContext;
        if (pVar != null) {
            pVar.mo21333d("clear_search_history_all", (Map<? extends AnalyticsProperty, Object>) null);
        }
        this.clickEvents.onNext(C13311c.C13314c.f29219a);
    }

    public void onDeleteQueryClicked(C11083w.C11089f fVar, int i) {
        C19383o.m32797g(fVar, "query");
        C8703p pVar = this.analyticsContext;
        if (pVar != null) {
            pVar.mo21333d("clear_search_history_individual", (Map<? extends AnalyticsProperty, Object>) null);
        }
        this.clickEvents.onNext(new C13311c.C13315d(fVar.f24560a.mo36653b()));
    }

    public void onDetachedFromWindow() {
        this.recyclerView.setAdapter((RecyclerView.Adapter) null);
        super.onDetachedFromWindow();
    }

    public void onGiftCardsClicked() {
        C8703p pVar = this.analyticsContext;
        if (pVar != null) {
            pVar.mo21333d("open_create_gift_card", (Map<? extends AnalyticsProperty, Object>) null);
        }
        this.clickEvents.onNext(C13311c.C13319h.f29224a);
    }

    public void onGiftGuideClicked(String str) {
        C19383o.m32797g(str, "deepLink");
        C8703p pVar = this.analyticsContext;
        if (pVar != null) {
            pVar.mo21333d("autosuggest_gift_guide_tapped", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.GIFT_GUIDE_DEEPLINK, str)));
        }
        this.clickEvents.onNext(new C13311c.C13320i(str));
    }

    public void onListingClicked(String str) {
        C19383o.m32797g(str, "listingId");
        C15588c1.m25340p0(this);
        C8703p pVar = this.analyticsContext;
        if (pVar != null) {
            pVar.mo21333d("recently_viewed_listing_tapped_on_search_dropdown", (Map<? extends AnalyticsProperty, Object>) null);
        }
        this.clickEvents.onNext(new C13311c.C13321j(str));
    }

    public void onMoreShopsClicked(C11083w.C11093j jVar) {
        C19383o.m32797g(jVar, "moreSuggestion");
        C8703p pVar = this.analyticsContext;
        if (pVar != null) {
            pVar.mo21333d("autosuggest_see_more_shops_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        }
        this.clickEvents.onNext(new C13311c.C13322k(jVar));
    }

    public void onQueryClicked(C11083w.C11089f fVar, int i) {
        SearchOptions searchOptions;
        Map<String, String> map;
        C8703p pVar;
        C19383o.m32797g(fVar, "query");
        C11064o oVar = fVar.f24560a;
        if (oVar instanceof C11064o.C11066b) {
            C8703p pVar2 = this.analyticsContext;
            if (pVar2 != null) {
                pVar2.mo21333d("popular_search_tapped", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.QUERY, oVar.mo36653b())));
            }
        } else if (oVar instanceof C11064o.C11065a) {
            C8703p pVar3 = this.analyticsContext;
            if (pVar3 != null) {
                pVar3.mo21333d("autosuggest_listing_searched", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.QUERY, oVar), new Pair(PredefinedAnalyticsProperty.ROW_NUMBER, Integer.valueOf(fVar.f24560a.mo36652a()))));
            }
        } else if (oVar instanceof C11064o.C11069e) {
            HashMap hashMap = new HashMap();
            PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.QUERY;
            hashMap.put(predefinedAnalyticsProperty, fVar.f24560a);
            PredefinedAnalyticsProperty predefinedAnalyticsProperty2 = PredefinedAnalyticsProperty.ROW_NUMBER;
            hashMap.put(predefinedAnalyticsProperty2, Integer.valueOf(fVar.f24560a.mo36652a()));
            C8703p pVar4 = this.analyticsContext;
            if (pVar4 != null) {
                pVar4.mo21333d("saved_query_searched", C19294b0.m32562s0(new Pair(predefinedAnalyticsProperty, fVar.f24560a), new Pair(predefinedAnalyticsProperty2, Integer.valueOf(fVar.f24560a.mo36652a()))));
            }
            C11064o oVar2 = fVar.f24560a;
            if (((C11064o.C11069e) oVar2).f24535f && (pVar = this.analyticsContext) != null) {
                pVar.mo21333d("saved_query_searched_with_badge", C19294b0.m32562s0(new Pair(predefinedAnalyticsProperty, oVar2), new Pair(predefinedAnalyticsProperty2, Integer.valueOf(fVar.f24560a.mo36652a()))));
            }
            RecyclerView.C3084b0 findViewHolderForAdapterPosition = this.recyclerView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition instanceof C11063n) {
                ViewExtensions.m12860d(((C11063n) findViewHolderForAdapterPosition).f24518f);
            }
        }
        C11064o oVar3 = fVar.f24560a;
        Long l = null;
        C11064o.C11069e eVar = oVar3 instanceof C11064o.C11069e ? (C11064o.C11069e) oVar3 : null;
        PublishSubject<C13311c> publishSubject = this.clickEvents;
        String b = oVar3.mo36653b();
        if (eVar == null || (map = eVar.f24534e) == null) {
            searchOptions = null;
        } else {
            SearchOptions.Companion companion = SearchOptions.Companion;
            C8694h a = LogCatKt.m17045a();
            companion.getClass();
            searchOptions = SearchOptions.Companion.m18949c(map, a);
        }
        if (eVar != null) {
            l = Long.valueOf(eVar.f24533d);
        }
        publishSubject.onNext(new C13311c.C13324m(b, searchOptions, l, fVar.f24560a instanceof C11064o.C11067c));
    }

    public boolean onQueryTextChange(String str) {
        refreshUiState(str);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }

    public final void onRecentViewScrollEnd() {
        if (!this.showRecentlyViewedScrollRightEvent) {
            C8703p pVar = this.analyticsContext;
            if (pVar != null) {
                pVar.mo21333d("recently_viewed_listings_search_dropdown_scrolled_to_end", (Map<? extends AnalyticsProperty, Object>) null);
            }
            this.showRecentlyViewedScrollRightEvent = true;
        }
    }

    public void onShopClicked(C11083w.C11097n nVar) {
        C19383o.m32797g(nVar, ResponseConstants.SHOP);
        C8703p pVar = this.analyticsContext;
        if (pVar != null) {
            pVar.mo21333d("autosuggest_shop_result_tapped", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.SHOP_NAME, nVar.f24569a), new Pair(PredefinedAnalyticsProperty.ROW_NUMBER, Integer.valueOf(nVar.f24573e))));
        }
        this.clickEvents.onNext(new C13311c.C13325n(nVar));
    }

    public void onSuggestionPopulationClicked(C11083w.C11089f fVar) {
        C19383o.m32797g(fVar, "query");
        this.clickEvents.onNext(new C13311c.C13323l(fVar.f24560a.mo36653b()));
    }

    public void refreshUiState() {
        refreshUiState("");
    }

    public final void setAnalyticsContext(C8703p pVar) {
        this.analyticsContext = pVar;
    }

    public final void setErrorViewClickListener(View.OnClickListener onClickListener) {
        this.errorView.findViewById(R.id.btn_retry_internet).setOnClickListener(onClickListener);
    }

    public void showDeleteQueryError() {
        Toast.makeText(getContext(), R.string.search_history_delete_query_error, 0).show();
    }

    public final void showErrorView() {
        this.loadingView.setVisibility(8);
        this.errorView.setVisibility(0);
    }

    public final void showLoader() {
        this.loadingView.setVisibility(0);
        this.errorView.setVisibility(8);
    }

    public void showRemainingSavedSearches(int i, List<C11083w.C11089f> list) {
        C19383o.m32797g(list, "savedSearches");
        List<C11083w> list2 = this.suggestions;
        if (list2 != null) {
            C11083w remove = list2.remove(i);
        }
        List<C11083w> list3 = this.suggestions;
        if (list3 != null) {
            list3.addAll(i, list);
        }
        this.adapter.mo11950j(this.suggestions);
        this.adapter.notifyItemRemoved(i);
        this.adapter.notifyItemRangeInserted(i, list.size());
    }

    public void showSearchSuggestions(List<? extends C11083w> list, boolean z) {
        C19383o.m32797g(list, "suggestionViewData");
        showList();
        if (!this.hasLoggedPopularSearchesEvent) {
            Iterator<? extends C11083w> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C11083w wVar = (C11083w) it.next();
                if ((wVar instanceof C11083w.C11089f) && (((C11083w.C11089f) wVar).f24560a instanceof C11064o.C11066b)) {
                    C8703p pVar = this.analyticsContext;
                    if (pVar != null) {
                        pVar.mo21333d("popular_searches_displayed", (Map<? extends AnalyticsProperty, Object>) null);
                    }
                    this.hasLoggedPopularSearchesEvent = true;
                }
            }
        }
        ArrayList q1 = C19327t.m32661q1(list);
        this.suggestions = q1;
        trackBadgeSeenEvent(q1);
        if (z) {
            C11047d dVar = this.adapter;
            dVar.f7450b.mo11837b(this.suggestions, new C4950e(this, 2));
            return;
        }
        C11047d dVar2 = this.adapter;
        dVar2.f7450b.mo11837b(this.suggestions, (C4950e) null);
    }

    public final void refreshUiState(CharSequence charSequence) {
        String obj = charSequence != null ? charSequence.toString() : "";
        C11047d dVar = this.adapter;
        dVar.getClass();
        C19383o.m32797g(obj, "<set-?>");
        dVar.f24496f = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchSuggestionsLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
