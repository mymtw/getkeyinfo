package com.etsy.android.p327ui.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.extensions.ViewExtensions$trackingCheckedChange$1;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.search.QueryCorrection;
import com.etsy.android.lib.models.cardviewelement.BasicSectionHeader;
import com.etsy.android.lib.models.cardviewelement.SearchFilterHeader;
import com.etsy.android.p327ui.cardview.clickhandlers.C9141v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p414oe.C13163b;
import p414oe.C13166d;
import p504ai.C13983i;
import p568fn.C17782b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.search.SearchResultsFilterHeaderView */
public final class SearchResultsFilterHeaderView extends SearchResultsHeaderView {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private final C19285c filterButton$delegate = C19350d.m32677b(new SearchResultsFilterHeaderView$filterButton$2(this));
    private final C19285c filterButtonClickableContainer$delegate = C19350d.m32677b(new SearchResultsFilterHeaderView$filterButtonClickableContainer$2(this));
    private List<SearchFilterPill> filterPillsCache = new ArrayList();
    private final C19285c filterPillsContainer$delegate = C19350d.m32677b(new SearchResultsFilterHeaderView$filterPillsContainer$2(this));
    private boolean is3x3View;
    private final C19285c queryCorrectionArrow$delegate = C19350d.m32677b(new SearchResultsFilterHeaderView$queryCorrectionArrow$2(this));
    private final C19285c queryCorrectionContainer$delegate = C19350d.m32677b(new SearchResultsFilterHeaderView$queryCorrectionContainer$2(this));
    private final C19285c queryCorrectionText$delegate = C19350d.m32677b(new SearchResultsFilterHeaderView$queryCorrectionText$2(this));
    private final C19285c resultCount$delegate = C19350d.m32677b(new SearchResultsFilterHeaderView$resultCount$2(this));
    private final C19285c selectedCategories$delegate = C19350d.m32677b(new SearchResultsFilterHeaderView$selectedCategories$2(this));
    private final C19285c selectedFilters$delegate = C19350d.m32677b(new SearchResultsFilterHeaderView$selectedFilters$2(this));
    private final C19285c toggleButton$delegate = C19350d.m32677b(new SearchResultsFilterHeaderView$toggleButton$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsFilterHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        View.inflate(context, R.layout.view_search_results_filter_header, this);
        setRadius(0.0f);
    }

    private final void bindFilterPills(C13163b bVar, C9141v vVar) {
        SearchFilterPill searchFilterPill;
        getFilterPillsContainer().removeAllViews();
        if (bVar == null || bVar.f28955c.isEmpty()) {
            ViewExtensions.m12860d(getFilterPillsContainer());
            return;
        }
        int i = 0;
        for (T next : bVar.f28955c) {
            int i2 = i + 1;
            if (i >= 0) {
                C13166d dVar = (C13166d) next;
                if (C19327t.m32641W0(i, this.filterPillsCache) == null) {
                    Context context = getContext();
                    C19383o.m32796f(context, ResponseConstants.CONTEXT);
                    searchFilterPill = new SearchFilterPill(context);
                    this.filterPillsCache.add(i, searchFilterPill);
                } else {
                    searchFilterPill = this.filterPillsCache.get(i);
                }
                searchFilterPill.setSelected(dVar.f28972d);
                searchFilterPill.setText(dVar.f28970b);
                ViewExtensions.m12866j(searchFilterPill, new SearchResultsFilterHeaderView$bindFilterPills$1$1(vVar, dVar));
                getFilterPillsContainer().addView(searchFilterPill);
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        ViewExtensions.m12869m(getFilterPillsContainer());
    }

    private final void bindSelectedCategories(SearchFilterHeader searchFilterHeader) {
        String categories = searchFilterHeader.getCategories();
        if (categories == null || categories.length() == 0) {
            ViewExtensions.m12860d(getSelectedCategories());
            return;
        }
        ViewExtensions.m12869m(getSelectedCategories());
        TextView selectedCategories = getSelectedCategories();
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        String categories2 = searchFilterHeader.getCategories();
        C19383o.m32796f(categories2, "header.categories");
        selectedCategories.setText(C0761x.m1696U0(context, categories2));
    }

    private final void bindSelectedFilters(SearchFilterHeader searchFilterHeader) {
        String subtitle = searchFilterHeader.getSubtitle();
        if (subtitle == null || subtitle.length() == 0) {
            ViewExtensions.m12860d(getSelectedFilters());
            return;
        }
        ViewExtensions.m12869m(getSelectedFilters());
        TextView selectedFilters = getSelectedFilters();
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        String subtitle2 = searchFilterHeader.getSubtitle();
        C19383o.m32796f(subtitle2, "header.subtitle");
        selectedFilters.setText(C0761x.m1696U0(context, subtitle2));
    }

    private final Button getFilterButton() {
        return (Button) this.filterButton$delegate.getValue();
    }

    private final FrameLayout getFilterButtonClickableContainer() {
        return (FrameLayout) this.filterButtonClickableContainer$delegate.getValue();
    }

    private final LinearLayout getFilterPillsContainer() {
        return (LinearLayout) this.filterPillsContainer$delegate.getValue();
    }

    private final ImageView getQueryCorrectionArrow() {
        return (ImageView) this.queryCorrectionArrow$delegate.getValue();
    }

    private final ViewGroup getQueryCorrectionContainer() {
        return (ViewGroup) this.queryCorrectionContainer$delegate.getValue();
    }

    private final TextView getQueryCorrectionText() {
        return (TextView) this.queryCorrectionText$delegate.getValue();
    }

    private final TextView getResultCount() {
        return (TextView) this.resultCount$delegate.getValue();
    }

    private final TextView getSelectedCategories() {
        return (TextView) this.selectedCategories$delegate.getValue();
    }

    private final TextView getSelectedFilters() {
        return (TextView) this.selectedFilters$delegate.getValue();
    }

    private final ToggleButton getToggleButton() {
        return (ToggleButton) this.toggleButton$delegate.getValue();
    }

    private final void showCorrectedQueryInfo(SearchFilterHeader searchFilterHeader, C9141v vVar) {
        ViewExtensions.m12863g(getFilterButtonClickableContainer());
        ViewExtensions.m12863g(getSelectedCategories());
        if (getSelectedFilters().getVisibility() == 0) {
            ViewExtensions.m12863g(getSelectedFilters());
        }
        ViewExtensions.m12863g(getToggleButton());
        ViewExtensions.m12863g(getResultCount());
        QueryCorrection queryCorrection = searchFilterHeader.getQueryCorrection();
        C19394m mVar = null;
        if (queryCorrection != null) {
            ViewExtensions.m12869m(getQueryCorrectionContainer());
            getQueryCorrectionText().setText(C18263b.m30867s0(queryCorrection.getHtmlMessage()));
            String url = queryCorrection.getUrl();
            if (url != null) {
                ViewExtensions.m12869m(getQueryCorrectionArrow());
                ViewGroup queryCorrectionContainer = getQueryCorrectionContainer();
                C19383o.m32796f(queryCorrectionContainer, "queryCorrectionContainer");
                ViewExtensions.m12866j(queryCorrectionContainer, new SearchResultsFilterHeaderView$showCorrectedQueryInfo$1$1$1(vVar, url));
                mVar = C19394m.f43287a;
            }
            if (mVar == null) {
                ViewExtensions.m12860d(getQueryCorrectionArrow());
            }
            mVar = C19394m.f43287a;
        }
        if (mVar == null) {
            ViewExtensions.m12860d(getQueryCorrectionContainer());
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

    public void bind(BasicSectionHeader basicSectionHeader, C9141v vVar, boolean z, boolean z2, C13163b bVar) {
        C19383o.m32797g(basicSectionHeader, ResponseConstants.HEADER);
        C19383o.m32797g(vVar, "clickHandler");
        this.is3x3View = z2;
        if (basicSectionHeader instanceof SearchFilterHeader) {
            SearchFilterHeader searchFilterHeader = (SearchFilterHeader) basicSectionHeader;
            getFilterButton().setText(searchFilterHeader.getActionTitle());
            getResultCount().setText(searchFilterHeader.getTitle());
            getFilterButton().setTextAppearance(R.style.clg_button_secondary);
            Button filterButton = getFilterButton();
            Context context = getContext();
            Object obj = C8184a.f17966a;
            filterButton.setBackground(C8184a.C8187c.m16466b(context, R.drawable.dark_mode_sk_btn_secondary_bg));
            ViewExtensions.m12869m(getFilterButtonClickableContainer());
            ViewExtensions.m12869m(getToggleButton());
            ViewExtensions.m12869m(getResultCount());
            bindSelectedCategories(searchFilterHeader);
            bindSelectedFilters(searchFilterHeader);
            bindFilterPills(bVar, vVar);
            getToggleButton().setChecked(z2);
            ToggleButton toggleButton = getToggleButton();
            C19383o.m32796f(toggleButton, "toggleButton");
            toggleButton.setOnCheckedChangeListener(new ViewExtensions$trackingCheckedChange$1(new SearchResultsFilterHeaderView$bind$1(vVar)));
            if (z) {
                showCorrectedQueryInfo(searchFilterHeader, vVar);
            }
            FrameLayout filterButtonClickableContainer = getFilterButtonClickableContainer();
            C19383o.m32796f(filterButtonClickableContainer, "filterButtonClickableContainer");
            ViewExtensions.m12866j(filterButtonClickableContainer, new SearchResultsFilterHeaderView$bind$2(vVar));
            return;
        }
        ViewExtensions.m12860d(getFilterButtonClickableContainer());
        ViewExtensions.m12869m(getSelectedFilters());
        getSelectedFilters().setText(basicSectionHeader.getTitle());
        getResultCount().setText(basicSectionHeader.getSubtitle());
    }
}
