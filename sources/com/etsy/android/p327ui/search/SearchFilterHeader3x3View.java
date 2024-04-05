package com.etsy.android.p327ui.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
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
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p414oe.C13163b;
import p504ai.C13983i;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.search.SearchFilterHeader3x3View */
public final class SearchFilterHeader3x3View extends SearchResultsHeaderView {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private final C19285c filterButton$delegate = C19350d.m32677b(new SearchFilterHeader3x3View$filterButton$2(this));
    private final C19285c queryCorrectionArrow$delegate = C19350d.m32677b(new SearchFilterHeader3x3View$queryCorrectionArrow$2(this));
    private final C19285c queryCorrectionContainer$delegate = C19350d.m32677b(new SearchFilterHeader3x3View$queryCorrectionContainer$2(this));
    private final C19285c queryCorrectionText$delegate = C19350d.m32677b(new SearchFilterHeader3x3View$queryCorrectionText$2(this));
    private final C19285c resultCount$delegate = C19350d.m32677b(new SearchFilterHeader3x3View$resultCount$2(this));
    private final C19285c selectedCategories$delegate = C19350d.m32677b(new SearchFilterHeader3x3View$selectedCategories$2(this));
    private final C19285c selectedFilters$delegate = C19350d.m32677b(new SearchFilterHeader3x3View$selectedFilters$2(this));
    private final C19285c toggleButton$delegate = C19350d.m32677b(new SearchFilterHeader3x3View$toggleButton$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFilterHeader3x3View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        View.inflate(context, R.layout.search_result_header_3x3_toggle, this);
        setRadius(0.0f);
    }

    private final Button getFilterButton() {
        return (Button) this.filterButton$delegate.getValue();
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
        if (basicSectionHeader instanceof SearchFilterHeader) {
            SearchFilterHeader searchFilterHeader = (SearchFilterHeader) basicSectionHeader;
            getFilterButton().setText(searchFilterHeader.getActionTitle());
            getResultCount().setText(searchFilterHeader.getTitle());
            getFilterButton().setTextAppearance(R.style.clg_button_secondary);
            Button filterButton = getFilterButton();
            Context context = getContext();
            Object obj = C8184a.f17966a;
            filterButton.setBackground(C8184a.C8187c.m16466b(context, R.drawable.dark_mode_sk_btn_secondary_bg));
            ViewExtensions.m12869m(getFilterButton());
            ViewExtensions.m12869m(getToggleButton());
            ViewExtensions.m12869m(getResultCount());
            String categories = searchFilterHeader.getCategories();
            boolean z3 = false;
            if (categories == null || categories.length() == 0) {
                ViewExtensions.m12860d(getSelectedCategories());
            } else {
                ViewExtensions.m12869m(getSelectedCategories());
                TextView selectedCategories = getSelectedCategories();
                Context context2 = getContext();
                C19383o.m32796f(context2, ResponseConstants.CONTEXT);
                String categories2 = searchFilterHeader.getCategories();
                C19383o.m32796f(categories2, "header.categories");
                selectedCategories.setText(C0761x.m1696U0(context2, categories2));
            }
            String subtitle = searchFilterHeader.getSubtitle();
            if (subtitle == null || subtitle.length() == 0) {
                z3 = true;
            }
            if (z3) {
                ViewExtensions.m12860d(getSelectedFilters());
            } else {
                ViewExtensions.m12869m(getSelectedFilters());
                TextView selectedFilters = getSelectedFilters();
                Context context3 = getContext();
                C19383o.m32796f(context3, ResponseConstants.CONTEXT);
                String subtitle2 = searchFilterHeader.getSubtitle();
                C19383o.m32796f(subtitle2, "header.subtitle");
                selectedFilters.setText(C0761x.m1696U0(context3, subtitle2));
            }
            getToggleButton().setChecked(z2);
            ToggleButton toggleButton = getToggleButton();
            C19383o.m32796f(toggleButton, "toggleButton");
            toggleButton.setOnCheckedChangeListener(new ViewExtensions$trackingCheckedChange$1(new SearchFilterHeader3x3View$bind$1(vVar)));
            if (z) {
                ViewExtensions.m12863g(getFilterButton());
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
                        ViewExtensions.m12866j(queryCorrectionContainer, new SearchFilterHeader3x3View$bind$2$1$1(vVar, url));
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
            Button filterButton2 = getFilterButton();
            C19383o.m32796f(filterButton2, "filterButton");
            ViewExtensions.m12866j(filterButton2, new SearchFilterHeader3x3View$bind$4(vVar));
        } else {
            ViewExtensions.m12860d(getFilterButton());
            ViewExtensions.m12869m(getSelectedFilters());
            getSelectedFilters().setText(basicSectionHeader.getTitle());
            getResultCount().setText(basicSectionHeader.getSubtitle());
        }
        ToggleButton toggleButton2 = getToggleButton();
        C19383o.m32796f(toggleButton2, "toggleButton");
        NavigationExtensionsKt.m17420a(toggleButton2, 500);
    }
}
