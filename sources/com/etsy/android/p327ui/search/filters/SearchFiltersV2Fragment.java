package com.etsy.android.p327ui.search.filters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.animation.C0472h;
import androidx.core.widget.C2398c;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.lib.models.apiv3.FacetCountListMap;
import com.etsy.android.lib.models.apiv3.SearchWithAds;
import com.etsy.android.lib.models.apiv3.filters.AttributeFacet;
import com.etsy.android.lib.models.apiv3.filters.AttributeValue;
import com.etsy.android.lib.models.apiv3.filters.SearchFiltersV2Type;
import com.etsy.android.lib.models.apiv3.filters.StaticFilterAttribute;
import com.etsy.android.lib.models.apiv3.filters.StaticFilters;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.C11324t;
import com.etsy.android.p327ui.C9090a;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchCountrySelectorKey;
import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.filters.C10767e;
import com.etsy.android.p327ui.search.filters.adapter.C10759b;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10984a;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10985b;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10986c;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10987d;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10990e;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10996i;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11005m;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11010o;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11024t;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterCountry;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterParams;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchFiltersRequest;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.TextinputKt;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.price.PriceFilterOptionType;
import com.etsy.android.stylekit.views.C9064o;
import com.etsy.android.stylekit.views.CollageCheckbox;
import com.etsy.android.stylekit.views.CollageContentToggle;
import com.etsy.android.stylekit.views.CollageRadioButton;
import com.etsy.android.stylekit.views.CollageRadioGroup;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.stylekit.views.ProgressButton;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.BaseActivity;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.play.core.assetpacks.C15588c1;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p145io.reactivex.subjects.PublishSubject;
import p356ge.C12788a;
import p356ge.C12790b;
import p402n9.C13090j;
import p402n9.C13091k;
import p414oe.C13162a;
import p414oe.C13163b;
import p414oe.C13166d;
import p414oe.C13167e;
import p440s9.C13366a;
import p456ua.C13461f;
import p486y9.C13888d;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment */
public final class SearchFiltersV2Fragment extends TrackingBaseFragment implements C13366a, CollageContentToggle.C9030a, C9090a.C9096b, C11324t.C11329b {
    public static final int $stable = 8;
    public static final int COLOR_GRID_COLUMN_COUNT = 4;
    public static final C10747a Companion = new C10747a();
    public static final String PARAM_FEATURED_CATEGORIES = "featured_categories";
    public static final String PARAM_FILTERS = "filters";
    public static final String PARAM_QUERY = "query";

    /* renamed from: SHOP_LOCATION_ANYWHERE */
    public static final int new_search_filter_shop_location_anywhere = 2131952679;

    /* renamed from: SHOP_LOCATION_CUSTOM */
    public static final int new_search_filter_shop_location_custom_title = 2131952681;

    /* renamed from: SHOP_LOCATION_LOCAL */
    public static final int search_filter_shop_location_local = 2131953397;
    public static final int SIZE_GRID_COLUMN_COUNT = 3;
    public static final int SPAN_ONE_COLUMN = 1;
    public static final int SPAN_THREE_COLUMNS = 3;
    public static final int SPAN_TWO_COLUMNS = 2;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private C10759b categoriesAdapter;
    private List<? extends FacetCount> categoryFacets;
    public C13888d currentLocale;
    /* access modifiers changed from: private */
    public boolean customPriceTracked;
    /* access modifiers changed from: private */
    public boolean customShopLocationTracked;
    private final C7091a disposable;
    private List<AttributeFacet> dynamicFacets;
    private FilterParams filterParams;
    private SearchFiltersRequest filtersRequest = new SearchFiltersRequest((String) null, (String) null, (SearchOptions) null, (String) null, (Bundle) null, (Integer) null, (Boolean) null, 127, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public boolean hasChangedCategory;
    private LinearLayout layoutFilters;
    public C8694h logCat;
    public NumberFormat numberFormat;
    private Map<String, C10996i> optionsAdapterMap;
    private C13167e priceFilterOptionsAdapter;
    private List<Integer> priceRangeList;
    /* access modifiers changed from: private */
    public String query;
    private Map<SearchFiltersV2Type, Integer> resMap;
    private Button resetButton;
    public C13461f schedulers;
    private NestedScrollView scrollView;
    public C11010o searchFiltersEligibility;
    private SearchOptions searchOptions;
    private ProgressButton showResults;
    private StaticFilters staticFilters;
    /* access modifiers changed from: private */
    public TextView textCurrentCountry;
    private Map<String, CollageContentToggle> toggleMap;
    public C10767e viewModel;
    public C8656o viewModelFactory;

    /* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$a */
    public static final class C10747a {
    }

    /* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$b */
    public /* synthetic */ class C10748b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23682a;

        static {
            int[] iArr = new int[SearchFiltersV2Type.values().length];
            iArr[SearchFiltersV2Type.SORT_BY.ordinal()] = 1;
            iArr[SearchFiltersV2Type.ITEM_TYPE.ordinal()] = 2;
            iArr[SearchFiltersV2Type.COLOR.ordinal()] = 3;
            iArr[SearchFiltersV2Type.SIZE.ordinal()] = 4;
            iArr[SearchFiltersV2Type.MULTI_SELECT.ordinal()] = 5;
            iArr[SearchFiltersV2Type.SHIPPING.ordinal()] = 6;
            iArr[SearchFiltersV2Type.OTHER_OPTIONS.ordinal()] = 7;
            iArr[SearchFiltersV2Type.CATEGORY.ordinal()] = 8;
            iArr[SearchFiltersV2Type.SHIPS_TO.ordinal()] = 9;
            iArr[SearchFiltersV2Type.SHOP_LOCATION.ordinal()] = 10;
            iArr[SearchFiltersV2Type.PRICE.ordinal()] = 11;
            f23682a = iArr;
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$c */
    public static final class C10749c implements CollageRadioGroup.C9044a {

        /* renamed from: a */
        public final /* synthetic */ SearchFiltersV2Fragment f23683a;

        /* renamed from: b */
        public final /* synthetic */ int f23684b;

        /* renamed from: c */
        public final /* synthetic */ CollageTextInput f23685c;

        /* renamed from: d */
        public final /* synthetic */ CollageTextInput f23686d;

        /* renamed from: e */
        public final /* synthetic */ List<C13166d> f23687e;

        /* renamed from: f */
        public final /* synthetic */ C11005m.C11006a f23688f;

        public C10749c(SearchFiltersV2Fragment searchFiltersV2Fragment, int i, CollageTextInput collageTextInput, CollageTextInput collageTextInput2, List<C13166d> list, C11005m.C11006a aVar) {
            this.f23683a = searchFiltersV2Fragment;
            this.f23684b = i;
            this.f23685c = collageTextInput;
            this.f23686d = collageTextInput2;
            this.f23687e = list;
            this.f23688f = aVar;
        }

        /* renamed from: a */
        public final void mo30994a(boolean z, CollageRadioButton collageRadioButton) {
            C19383o.m32797g(collageRadioButton, "selectedButton");
            int id = collageRadioButton.getId();
            if (id == 0) {
                this.f23683a.getViewModel().mo35757w();
            } else if (id == this.f23684b) {
                this.f23685c.requestFocus();
                this.f23683a.getViewModel().mo35755u(this.f23684b, this.f23685c.getText(), this.f23686d.getText());
            } else {
                C10767e viewModel = this.f23683a.getViewModel();
                int id2 = collageRadioButton.getId();
                List<C13166d> list = this.f23687e;
                viewModel.getClass();
                C19383o.m32797g(list, "priceOptions");
                viewModel.f23731D.setUserSpecifiedMax(false);
                viewModel.f23731D.setUserSpecifiedMin(false);
                boolean z2 = true;
                if (1 > id2 || id2 > list.size()) {
                    z2 = false;
                }
                if (z2) {
                    C13166d dVar = list.get(id2);
                    viewModel.f23731D.setMinPrice(dVar.f28969a.f28949a);
                    viewModel.f23731D.setMaxPrice(dVar.f28969a.f28950b);
                    viewModel.f23731D.setPriceIndex(id2);
                    viewModel.mo35748l();
                    viewModel.mo35751o(list.get(id2).f28973e, false);
                }
            }
            if (collageRadioButton.getId() != this.f23684b) {
                this.f23683a.clearFocus(this.f23685c);
                this.f23683a.clearFocus(this.f23686d);
                SearchFiltersV2Fragment searchFiltersV2Fragment = this.f23683a;
                C11005m.C11006a aVar = this.f23688f;
                searchFiltersV2Fragment.updateBreadcrumb(new C10984a(aVar != null ? aVar.f24408a : null, new C11016s.C11023g(this.f23687e.get(collageRadioButton.getId()).f28970b)));
            }
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$d */
    public static final class C10750d extends GridLayoutManager.C3075b {

        /* renamed from: d */
        public final /* synthetic */ AttributeFacet f23689d;

        public C10750d(AttributeFacet attributeFacet) {
            this.f23689d = attributeFacet;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
            r3 = r3.getName();
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo11265d(int r3) {
            /*
                r2 = this;
                com.etsy.android.lib.models.apiv3.filters.AttributeFacet r0 = r2.f23689d
                java.util.List r0 = r0.getValueFacets()
                int r0 = r0.size()
                if (r3 >= r0) goto L_0x003b
                com.etsy.android.lib.models.apiv3.filters.AttributeFacet r0 = r2.f23689d
                java.util.List r0 = r0.getValueFacets()
                java.lang.Object r3 = r0.get(r3)
                com.etsy.android.lib.models.apiv3.filters.ValueFacet r3 = (com.etsy.android.lib.models.apiv3.filters.ValueFacet) r3
                com.etsy.android.lib.models.apiv3.filters.AttributeValue r3 = r3.getAttributeValue()
                if (r3 == 0) goto L_0x002d
                java.lang.String r3 = r3.getName()
                if (r3 == 0) goto L_0x002d
                int r3 = r3.length()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L_0x002e
            L_0x002d:
                r3 = 0
            L_0x002e:
                r0 = 1
                if (r3 == 0) goto L_0x003a
                int r3 = r3.intValue()
                r1 = 8
                if (r3 <= r1) goto L_0x003a
                r0 = 2
            L_0x003a:
                return r0
            L_0x003b:
                r3 = 3
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.SearchFiltersV2Fragment.C10750d.mo11265d(int):int");
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$e */
    public static final class C10751e implements CollageContentToggle.C9030a {

        /* renamed from: b */
        public final /* synthetic */ CollageRadioGroup f23690b;

        /* renamed from: c */
        public final /* synthetic */ C13163b f23691c;

        /* renamed from: d */
        public final /* synthetic */ SearchFiltersV2Fragment f23692d;

        /* renamed from: e */
        public final /* synthetic */ List<C13166d> f23693e;

        public C10751e(CollageRadioGroup collageRadioGroup, C13163b bVar, SearchFiltersV2Fragment searchFiltersV2Fragment, List<C13166d> list) {
            this.f23690b = collageRadioGroup;
            this.f23691c = bVar;
            this.f23692d = searchFiltersV2Fragment;
            this.f23693e = list;
        }

        public final void onAnimationComplete() {
        }

        public final void onCollapse() {
            if (this.f23690b.getCheckedRadioButtonId() == this.f23691c.f28959g && !this.f23692d.customPriceTracked) {
                this.f23692d.getViewModel().mo35751o(this.f23693e.get(this.f23691c.f28959g).f28973e, true);
                this.f23692d.customPriceTracked = true;
            }
            this.f23692d.hideKeyboard();
        }

        public final void onExpanded() {
        }

        public final void onPopOut() {
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$f */
    public static final class C10752f implements CollageRadioGroup.C9044a {

        /* renamed from: a */
        public final /* synthetic */ SearchFiltersV2Fragment f23694a;

        /* renamed from: b */
        public final /* synthetic */ CollageTextInput f23695b;

        /* renamed from: c */
        public final /* synthetic */ CollageContentToggle f23696c;

        public C10752f(SearchFiltersV2Fragment searchFiltersV2Fragment, CollageTextInput collageTextInput, CollageContentToggle collageContentToggle) {
            this.f23694a = searchFiltersV2Fragment;
            this.f23695b = collageTextInput;
            this.f23696c = collageContentToggle;
        }

        /* renamed from: a */
        public final void mo30994a(boolean z, CollageRadioButton collageRadioButton) {
            C19383o.m32797g(collageRadioButton, "selectedButton");
            SearchFiltersV2Fragment searchFiltersV2Fragment = this.f23694a;
            int id = collageRadioButton.getId();
            CollageTextInput collageTextInput = this.f23695b;
            C19383o.m32796f(collageTextInput, "shopLocationInput");
            searchFiltersV2Fragment.updateShopLocationOptions(id, collageTextInput, this.f23696c, collageRadioButton.getText());
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$g */
    public static final class C10753g implements CollageContentToggle.C9030a {

        /* renamed from: b */
        public final /* synthetic */ CollageRadioGroup f23697b;

        /* renamed from: c */
        public final /* synthetic */ SearchFiltersV2Fragment f23698c;

        public C10753g(CollageRadioGroup collageRadioGroup, SearchFiltersV2Fragment searchFiltersV2Fragment) {
            this.f23697b = collageRadioGroup;
            this.f23698c = searchFiltersV2Fragment;
        }

        public final void onAnimationComplete() {
        }

        public final void onCollapse() {
            if (this.f23697b.getCheckedRadioButtonId() == R.string.new_search_filter_shop_location_custom_title && !this.f23698c.customShopLocationTracked) {
                this.f23698c.getViewModel().mo35752p(true);
                this.f23698c.customShopLocationTracked = true;
            }
            this.f23698c.hideKeyboard();
        }

        public final void onExpanded() {
        }

        public final void onPopOut() {
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$h */
    public static final class C10754h implements CollageRadioGroup.C9044a {

        /* renamed from: a */
        public final /* synthetic */ SearchFiltersV2Fragment f23699a;

        /* renamed from: b */
        public final /* synthetic */ C10985b f23700b;

        public C10754h(SearchFiltersV2Fragment searchFiltersV2Fragment, C10985b bVar) {
            this.f23699a = searchFiltersV2Fragment;
            this.f23700b = bVar;
        }

        /* renamed from: a */
        public final void mo30994a(boolean z, CollageRadioButton collageRadioButton) {
            C19383o.m32797g(collageRadioButton, "selectedButton");
            String text = collageRadioButton.getText();
            C10767e viewModel = this.f23699a.getViewModel();
            int id = collageRadioButton.getId();
            AttributeFacet attributeFacet = this.f23700b.f24367a;
            viewModel.getClass();
            C19383o.m32797g(text, "selectedValue");
            C19383o.m32797g(attributeFacet, "facet");
            AttributeValue attribute = attributeFacet.getAttribute();
            SearchFiltersV2Type filterType = attribute != null ? attribute.getFilterType() : null;
            int i = filterType == null ? -1 : C10767e.C10768a.f23762a[filterType.ordinal()];
            if (i == 1) {
                SortOrder sortOrder = viewModel.f23735H.get(Integer.valueOf(id));
                if (sortOrder != null) {
                    viewModel.f23731D.setSortOrder(sortOrder);
                }
                viewModel.mo35748l();
                SearchFiltersV2Type searchFiltersV2Type = SearchFiltersV2Type.SORT_BY;
                viewModel.f23761z.onNext(new C10984a(viewModel.mo35742e(searchFiltersV2Type), new C11016s.C11023g(text)));
                viewModel.f23728A.onNext(new C10986c(new C10987d.C10989b(viewModel.f23734G.get(searchFiltersV2Type)), viewModel.mo35741c(), new C11016s.C11021e(viewModel.f23734G.get(filterType)), Boolean.TRUE));
            } else if (i == 3) {
                SearchOptions.MarketPlace marketPlace = viewModel.f23736I.get(Integer.valueOf(id));
                if (marketPlace != null) {
                    viewModel.f23731D.setMarketplace(marketPlace);
                }
                viewModel.mo35748l();
                SearchFiltersV2Type searchFiltersV2Type2 = SearchFiltersV2Type.ITEM_TYPE;
                viewModel.f23761z.onNext(new C10984a(viewModel.mo35742e(searchFiltersV2Type2), new C11016s.C11023g(text)));
                viewModel.f23728A.onNext(new C10986c(new C10987d.C10989b(viewModel.f23734G.get(searchFiltersV2Type2)), viewModel.mo35741c(), new C11016s.C11021e(viewModel.f23734G.get(filterType)), Boolean.TRUE));
            }
        }
    }

    public SearchFiltersV2Fragment() {
        EmptyList emptyList = EmptyList.INSTANCE;
        this.categoryFacets = emptyList;
        this.dynamicFacets = emptyList;
        SearchOptions searchOptions2 = r2;
        SearchOptions searchOptions3 = new SearchOptions((List) null, false, false, false, false, false, false, false, (SearchOptions.Location) null, (BigDecimal) null, (BigDecimal) null, false, false, (String) null, (String) null, (SortOrder) null, (SearchOptions.MarketPlace) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
        this.searchOptions = searchOptions2;
        this.disposable = new C7091a();
        this.filterParams = new FilterParams((String) null, (List) null, (List) null, (List) null, (StaticFilters) null, (SearchOptions) null, (SearchFiltersRequest) null, 0, 255, (DefaultConstructorMarker) null);
        this.query = "";
        this.priceRangeList = emptyList;
        this.toggleMap = new LinkedHashMap();
        this.optionsAdapterMap = new LinkedHashMap();
    }

    private final CollageCheckbox buildCheckbox(String str, int i) {
        CollageCheckbox collageCheckbox = (CollageCheckbox) View.inflate(getContext(), R.layout.list_item_filter_multi_select, (ViewGroup) null).findViewById(R.id.checkbox);
        collageCheckbox.setLayoutParams(getParams());
        collageCheckbox.setText(str);
        collageCheckbox.setId(i);
        return collageCheckbox;
    }

    private final Pair<AttributeFacet, CollageContentToggle> buildContentToggle(C10985b bVar) {
        String str;
        int intValue;
        Integer nameRes;
        AttributeFacet attributeFacet = bVar.f24367a;
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        CollageContentToggle collageContentToggle = new CollageContentToggle(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        if (this.toggleMap.containsKey(bVar.f24368b) && this.toggleMap.get(bVar.f24368b) != null) {
            collageContentToggle = this.toggleMap.get(bVar.f24368b);
            C19383o.m32794d(collageContentToggle);
        }
        AttributeValue attribute = attributeFacet.getAttribute();
        String str2 = null;
        if ((attribute != null ? attribute.getName() : null) != null) {
            AttributeValue attribute2 = attributeFacet.getAttribute();
            if (attribute2 != null) {
                str2 = attribute2.getName();
            }
            str = String.valueOf(str2);
        } else {
            AttributeValue attribute3 = attributeFacet.getAttribute();
            if (attribute3 == null || (nameRes = attribute3.getNameRes()) == null) {
                str = "";
            } else {
                str = getResources().getString(nameRes.intValue());
                C19383o.m32796f(str, "resources.getString(it)");
            }
        }
        CollageContentToggle collageContentToggle2 = collageContentToggle;
        collageContentToggle2.setTitle(str);
        collageContentToggle2.addOnLayoutChangeListener(new C10765c(this));
        C11016s sVar = bVar.f24370d;
        if (sVar instanceof C11016s.C11021e) {
            Integer num = ((C11016s.C11021e) sVar).f24438a;
            if (!(num == null || (intValue = num.intValue()) == 0)) {
                collageContentToggle2.setDescription(getResources().getString(intValue));
            }
        } else if (sVar instanceof C11016s.C11023g) {
            collageContentToggle2.setDescription(((C11016s.C11023g) sVar).f24441a);
        }
        return new Pair<>(attributeFacet, collageContentToggle);
    }

    /* access modifiers changed from: private */
    /* renamed from: buildContentToggle$lambda-33  reason: not valid java name */
    public static final void m35030buildContentToggle$lambda33(SearchFiltersV2Fragment searchFiltersV2Fragment, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        NestedScrollView nestedScrollView;
        C19383o.m32797g(searchFiltersV2Fragment, "this$0");
        NestedScrollView nestedScrollView2 = searchFiltersV2Fragment.scrollView;
        if (nestedScrollView2 != null) {
            int height = nestedScrollView2.getHeight();
            NestedScrollView nestedScrollView3 = searchFiltersV2Fragment.scrollView;
            if (nestedScrollView3 != null) {
                int top = nestedScrollView3.getTop();
                NestedScrollView nestedScrollView4 = searchFiltersV2Fragment.scrollView;
                if (nestedScrollView4 != null) {
                    int scrollY = nestedScrollView4.getScrollY();
                    int i9 = i8 - i6;
                    int i10 = i4 - i2;
                    if (i10 > i9 && i9 != 0) {
                        if (i10 < height) {
                            int i11 = height + scrollY;
                            if (i4 > i11) {
                                int i12 = i4 - i11;
                                NestedScrollView nestedScrollView5 = searchFiltersV2Fragment.scrollView;
                                if (nestedScrollView5 != null) {
                                    nestedScrollView5.postDelayed(new C10764b(searchFiltersV2Fragment, i12, 0), 250);
                                }
                            }
                        } else if (i2 > top + scrollY && (nestedScrollView = searchFiltersV2Fragment.scrollView) != null) {
                            nestedScrollView.postDelayed(new C10755a(searchFiltersV2Fragment, i2, 0), 250);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: buildContentToggle$lambda-33$lambda-31  reason: not valid java name */
    public static final void m35031buildContentToggle$lambda33$lambda31(SearchFiltersV2Fragment searchFiltersV2Fragment, int i) {
        C19383o.m32797g(searchFiltersV2Fragment, "this$0");
        NestedScrollView nestedScrollView = searchFiltersV2Fragment.scrollView;
        if (nestedScrollView != null) {
            nestedScrollView.smoothScrollTo(0, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: buildContentToggle$lambda-33$lambda-32  reason: not valid java name */
    public static final void m35032buildContentToggle$lambda33$lambda32(SearchFiltersV2Fragment searchFiltersV2Fragment, int i) {
        C19383o.m32797g(searchFiltersV2Fragment, "this$0");
        NestedScrollView nestedScrollView = searchFiltersV2Fragment.scrollView;
        if (nestedScrollView != null) {
            nestedScrollView.smoothScrollBy(0, i);
        }
    }

    private final CollageRadioButton buildRadioButton(AttributeValue attributeValue, int i) {
        Integer nameRes;
        String str = null;
        CollageRadioButton collageRadioButton = (CollageRadioButton) View.inflate(requireContext(), R.layout.layout_filter_radio_button, (ViewGroup) null).findViewById(R.id.radio_button);
        collageRadioButton.setLayoutParams(getParams());
        if ((attributeValue != null ? attributeValue.getNameRes() : null) == null || ((nameRes = attributeValue.getNameRes()) != null && nameRes.intValue() == 0)) {
            if (attributeValue != null) {
                str = attributeValue.getName();
            }
            collageRadioButton.setText(str);
            collageRadioButton.setId(i);
        } else {
            Integer nameRes2 = attributeValue.getNameRes();
            if (nameRes2 != null) {
                int intValue = nameRes2.intValue();
                collageRadioButton.setText(getResources().getString(intValue));
                collageRadioButton.setId(intValue);
            }
        }
        return collageRadioButton;
    }

    private final RecyclerView buildRecyclerView() {
        RecyclerView recyclerView = new RecyclerView(requireContext());
        LinearLayout.LayoutParams params = getParams();
        params.setMargins((int) getResources().getDimension(R.dimen.clg_space_16), 0, 0, 0);
        recyclerView.setLayoutParams(params);
        return recyclerView;
    }

    @SuppressLint({"ResourceType"})
    private final View buildShopLocationRadioButton(String str, int i) {
        CollageRadioButton collageRadioButton = (CollageRadioButton) View.inflate(getContext(), R.layout.layout_filter_radio_button, (ViewGroup) null).findViewById(R.id.radio_button);
        collageRadioButton.setLayoutParams(getParams());
        collageRadioButton.setText(str);
        if (i == 0) {
            collageRadioButton.setId(R.string.new_search_filter_shop_location_anywhere);
        } else if (i == 1) {
            collageRadioButton.setId(R.string.search_filter_shop_location_local);
        } else if (i == 2) {
            collageRadioButton.setId(R.string.new_search_filter_shop_location_custom_title);
        }
        return collageRadioButton;
    }

    /* access modifiers changed from: private */
    public final void clearFocus(CollageTextInput collageTextInput) {
        collageTextInput.clearFocus();
        C15588c1.m25340p0(collageTextInput);
    }

    private final void finishWithResult(String str, SearchOptions searchOptions2) {
        boolean z = !this.hasChangedCategory && C19383o.m32792b(this.filtersRequest.getParentIncludeFeatureCategories(), Boolean.TRUE);
        Bundle bundle = new Bundle();
        bundle.putString("query", str);
        bundle.putParcelable("filters", searchOptions2);
        bundle.putBoolean("featured_categories", z);
        C19394m mVar = C19394m.f43287a;
        C19388s.m32892w0(this, "902", bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C12788a.m20426e(activity);
        }
    }

    private final View getCustomPriceFieldsView(CollageRadioGroup collageRadioGroup, C11005m.C11006a aVar) {
        BigDecimal bigDecimal;
        C13162a aVar2;
        C13162a aVar3;
        C13163b bVar = aVar.f24409b;
        BigDecimal bigDecimal2 = null;
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_price_filter, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.min_price);
        C19383o.m32796f(findViewById, "customPriceView.findViewById(R.id.min_price)");
        CollageTextInput collageTextInput = (CollageTextInput) findViewById;
        View findViewById2 = inflate.findViewById(R.id.max_price);
        C19383o.m32796f(findViewById2, "customPriceView.findViewById(R.id.max_price)");
        CollageTextInput collageTextInput2 = (CollageTextInput) findViewById2;
        collageTextInput.setLabelText(bVar.f28956d + 9 + getResources().getString(R.string.search_filters_price_min));
        collageTextInput2.setLabelText(bVar.f28956d + 9 + getResources().getString(R.string.search_filters_price_max));
        if (bVar.f28958f) {
            C13166d dVar = bVar.f28961i.f24437b;
            if (dVar == null || (aVar3 = dVar.f28969a) == null || (bigDecimal = aVar3.f28949a) == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
                collageTextInput.setText(bigDecimal.toString());
            }
            C13166d dVar2 = bVar.f28961i.f24437b;
            if (!(dVar2 == null || (aVar2 = dVar2.f28969a) == null)) {
                bigDecimal2 = aVar2.f28950b;
            }
            if (bigDecimal2 != null) {
                collageTextInput2.setText(bigDecimal2.toString());
            }
        }
        setUpPriceFields(collageTextInput, collageTextInput2, collageRadioGroup, aVar);
        return inflate;
    }

    public static /* synthetic */ View getCustomPriceFieldsView$default(SearchFiltersV2Fragment searchFiltersV2Fragment, CollageRadioGroup collageRadioGroup, C11005m.C11006a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            collageRadioGroup = null;
        }
        return searchFiltersV2Fragment.getCustomPriceFieldsView(collageRadioGroup, aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        r0 = (r0 = r0.createConfigurationContext(r1)).getResources();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getEnglishString(int r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0036
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>(r0)
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r2 = "en"
            r0.<init>(r2)
            r1.setLocale(r0)
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0030
            android.content.Context r0 = r0.createConfigurationContext(r1)
            if (r0 == 0) goto L_0x0030
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x0030
            java.lang.String r4 = r0.getString(r4)
            goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        L_0x0036:
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.SearchFiltersV2Fragment.getEnglishString(int):java.lang.String");
    }

    private final LinearLayout.LayoutParams getParams() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    /* access modifiers changed from: private */
    public final void hideKeyboard() {
        View view = getView();
        if (view != null) {
            view.postDelayed(new C2398c(this, 1), 300);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: hideKeyboard$lambda-19  reason: not valid java name */
    public static final void m35033hideKeyboard$lambda19(SearchFiltersV2Fragment searchFiltersV2Fragment) {
        C19383o.m32797g(searchFiltersV2Fragment, "this$0");
        C15588c1.m25340p0(searchFiltersV2Fragment.getView());
    }

    private final void initObservers() {
        PublishSubject<Boolean> publishSubject = getViewModel().f23755t;
        LambdaObserver f = SubscribersKt.m32501f(C0472h.m1242c(publishSubject, publishSubject), new SearchFiltersV2Fragment$initObservers$1(getLogCat()), new SearchFiltersV2Fragment$initObservers$2(this), 2);
        C7091a aVar = this.disposable;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
        PublishSubject<SearchWithAds> publishSubject2 = getViewModel().f23752q;
        LambdaObserver f2 = SubscribersKt.m32501f(C0472h.m1242c(publishSubject2, publishSubject2), new SearchFiltersV2Fragment$initObservers$3(getLogCat()), new SearchFiltersV2Fragment$initObservers$4(this), 2);
        C7091a aVar2 = this.disposable;
        C19383o.m32798h(aVar2, "compositeDisposable");
        aVar2.mo19403b(f2);
        PublishSubject<C10985b> publishSubject3 = getViewModel().f23756u;
        LambdaObserver f3 = SubscribersKt.m32501f(C0472h.m1242c(publishSubject3, publishSubject3), new SearchFiltersV2Fragment$initObservers$5(getLogCat()), new SearchFiltersV2Fragment$initObservers$6(this), 2);
        C7091a aVar3 = this.disposable;
        C19383o.m32798h(aVar3, "compositeDisposable");
        aVar3.mo19403b(f3);
        C19254a<FilterCountry> aVar4 = getViewModel().f23758w;
        LambdaObserver f4 = SubscribersKt.m32501f(C0472h.m1241b(aVar4, aVar4), new SearchFiltersV2Fragment$initObservers$7(getLogCat()), new SearchFiltersV2Fragment$initObservers$8(this), 2);
        C7091a aVar5 = this.disposable;
        C19383o.m32798h(aVar5, "compositeDisposable");
        aVar5.mo19403b(f4);
        PublishSubject<String> publishSubject4 = getViewModel().f23760y;
        Disposable f5 = C0472h.m1242c(publishSubject4, publishSubject4).mo20636f(new C13090j(this, 6), new C13091k(getLogCat(), 1), Functions.f28539c, Functions.f28540d);
        C7091a aVar6 = this.disposable;
        C19383o.m32798h(aVar6, "compositeDisposable");
        aVar6.mo19403b(f5);
        PublishSubject<C10984a> publishSubject5 = getViewModel().f23761z;
        LambdaObserver f6 = SubscribersKt.m32501f(C0472h.m1242c(publishSubject5, publishSubject5), new SearchFiltersV2Fragment$initObservers$11(getLogCat()), new SearchFiltersV2Fragment$initObservers$12(this), 2);
        C7091a aVar7 = this.disposable;
        C19383o.m32798h(aVar7, "compositeDisposable");
        aVar7.mo19403b(f6);
        PublishSubject<C11005m.C11006a> publishSubject6 = getViewModel().f23759x;
        LambdaObserver f7 = SubscribersKt.m32501f(C0472h.m1242c(publishSubject6, publishSubject6), new SearchFiltersV2Fragment$initObservers$13(getLogCat()), new SearchFiltersV2Fragment$initObservers$14(this), 2);
        C7091a aVar8 = this.disposable;
        C19383o.m32798h(aVar8, "compositeDisposable");
        aVar8.mo19403b(f7);
        PublishSubject<C10986c> publishSubject7 = getViewModel().f23728A;
        LambdaObserver f8 = SubscribersKt.m32501f(C0472h.m1242c(publishSubject7, publishSubject7), new SearchFiltersV2Fragment$initObservers$15(getLogCat()), new SearchFiltersV2Fragment$initObservers$16(this), 2);
        C7091a aVar9 = this.disposable;
        C19383o.m32798h(aVar9, "compositeDisposable");
        aVar9.mo19403b(f8);
    }

    /* access modifiers changed from: private */
    /* renamed from: initObservers$lambda-6  reason: not valid java name */
    public static final void m35034initObservers$lambda6(SearchFiltersV2Fragment searchFiltersV2Fragment, String str) {
        C19383o.m32797g(searchFiltersV2Fragment, "this$0");
        C19383o.m32796f(str, "query");
        searchFiltersV2Fragment.finishWithResult(str, searchFiltersV2Fragment.getViewModel().f23731D);
    }

    /* access modifiers changed from: private */
    public final void onCountrySelectorClicked() {
        this.toggleMap.clear();
        this.optionsAdapterMap.clear();
        String d = C12790b.m20432d(this);
        C10767e viewModel2 = getViewModel();
        FilterCountry m = viewModel2.f23758w.mo71420m();
        if (m == null) {
            m = new FilterCountry(viewModel2.f23731D.getShipsToCountryName(), viewModel2.f23731D.getShipsToCountryCode());
        }
        C12790b.m20430b(this, new SearchCountrySelectorKey(d, m));
    }

    /* access modifiers changed from: private */
    public final CollageRadioGroup.C9044a onPriceChangeListener(C11005m.C11006a aVar, CollageTextInput collageTextInput, CollageTextInput collageTextInput2) {
        C13163b bVar = aVar.f24409b;
        return new C10749c(this, bVar.f28959g, collageTextInput, collageTextInput2, bVar.f28955c, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5$lambda-4  reason: not valid java name */
    public static final void m35035onViewCreated$lambda5$lambda4(SearchFiltersV2Fragment searchFiltersV2Fragment, View view) {
        C19383o.m32797g(searchFiltersV2Fragment, "this$0");
        searchFiltersV2Fragment.resetFilters();
    }

    /* access modifiers changed from: private */
    public final void selectCustomPriceMultiSelectOption(C11005m.C11006a aVar) {
        if (getConfigMap().mo21132b(C8592b.f18762U0) && aVar != null) {
            C10767e viewModel2 = getViewModel();
            viewModel2.getClass();
            List<C13166d> list = aVar.f24409b.f28955c;
            viewModel2.f23746k.getClass();
            C19383o.m32797g(list, "existingPriceOptions");
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
            for (C13166d a : list) {
                arrayList.add(C13166d.m20828a(a));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C13166d dVar = (C13166d) it.next();
                dVar.f28972d = dVar.f28971c == PriceFilterOptionType.CUSTOM;
            }
            C13163b bVar = aVar.f24409b;
            bVar.getClass();
            bVar.f28955c = arrayList;
            C13163b bVar2 = aVar.f24409b;
            viewModel2.f23759x.onNext(new C11005m.C11006a(viewModel2.f23742g.mo35740a(bVar2.f28954b), bVar2, aVar.f24410c));
            viewModel2.mo35748l();
        }
    }

    private final void setUpCategoryRecyclerView(List<? extends FacetCount> list, CollageContentToggle collageContentToggle) {
        RecyclerView buildRecyclerView = buildRecyclerView();
        requireContext();
        buildRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        buildRecyclerView.setAdapter(this.categoriesAdapter);
        buildRecyclerView.setItemAnimator((RecyclerView.C3094l) null);
        C10759b bVar = this.categoriesAdapter;
        if (bVar != null) {
            bVar.mo11950j(list);
        }
        collageContentToggle.addView(buildRecyclerView);
    }

    private final void setUpPriceFields(CollageTextInput collageTextInput, CollageTextInput collageTextInput2, CollageRadioGroup collageRadioGroup, C11005m.C11006a aVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = collageTextInput.getText();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = collageTextInput2.getText();
        int i = aVar.f24409b.f28959g;
        TextinputKt.m18959a(collageTextInput, new SearchFiltersV2Fragment$setUpPriceFields$1$1(ref$ObjectRef, this, ref$ObjectRef2, i));
        CollageRadioGroup collageRadioGroup2 = collageRadioGroup;
        C11005m.C11006a aVar2 = aVar;
        int i2 = i;
        CollageTextInput collageTextInput3 = collageTextInput;
        CollageTextInput collageTextInput4 = collageTextInput2;
        TextinputKt.m18960b(collageTextInput, new SearchFiltersV2Fragment$setUpPriceFields$1$2(collageRadioGroup2, this, aVar2, i2, collageTextInput3, collageTextInput4));
        TextinputKt.m18959a(collageTextInput2, new SearchFiltersV2Fragment$setUpPriceFields$2$1(ref$ObjectRef2, this, ref$ObjectRef, i));
        TextinputKt.m18960b(collageTextInput2, new SearchFiltersV2Fragment$setUpPriceFields$2$2(collageRadioGroup2, this, aVar2, i2, collageTextInput3, collageTextInput4));
        collageTextInput2.setOnEditorActionListener(new C11024t(new SearchFiltersV2Fragment$setUpPriceFields$2$3(this, collageTextInput, collageTextInput2)));
    }

    /* access modifiers changed from: private */
    public final void showFilters(C10985b bVar) {
        AttributeValue attribute = bVar.f24367a.getAttribute();
        SearchFiltersV2Type filterType = attribute != null ? attribute.getFilterType() : null;
        switch (filterType == null ? -1 : C10748b.f23682a[filterType.ordinal()]) {
            case 1:
            case 2:
                showSingleSelectFilter(bVar);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                showMultiSelectFilter(bVar);
                return;
            case 8:
                showTopLevelCategories(bVar);
                return;
            case 9:
                showShipsToFilter(bVar);
                return;
            case 10:
                showShopLocationFilters(bVar);
                return;
            case 11:
                C10767e viewModel2 = getViewModel();
                List<Integer> list = this.priceRangeList;
                int i = bVar.f24372f;
                viewModel2.getClass();
                C19383o.m32797g(list, "priceRangeList");
                C13163b a = viewModel2.f23746k.mo45881a(viewModel2.f23731D, list, false);
                viewModel2.f23759x.onNext(new C11005m.C11006a(viewModel2.f23742g.mo35740a(a.f28954b), a, i));
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    public final void showLoader(boolean z) {
        if (z) {
            ProgressButton progressButton = this.showResults;
            if (progressButton != null) {
                progressButton.showLoading();
                return;
            }
            return;
        }
        ProgressButton progressButton2 = this.showResults;
        if (progressButton2 != null) {
            progressButton2.hideLoading();
        }
    }

    private final void showMultiSelectFilter(C10985b bVar) {
        Pair<AttributeFacet, CollageContentToggle> buildContentToggle = buildContentToggle(bVar);
        AttributeFacet component1 = buildContentToggle.component1();
        CollageContentToggle component2 = buildContentToggle.component2();
        AttributeValue attribute = bVar.f24367a.getAttribute();
        SearchFiltersV2Type searchFiltersV2Type = null;
        SearchFiltersV2Type filterType = attribute != null ? attribute.getFilterType() : null;
        int i = bVar.f24372f;
        LinearLayout linearLayout = this.layoutFilters;
        int i2 = -1;
        if (linearLayout != null) {
            if (!(linearLayout.indexOfChild(component2) != -1)) {
                if (filterType == SearchFiltersV2Type.SHIPPING || filterType == SearchFiltersV2Type.OTHER_OPTIONS) {
                    linearLayout.addView(component2);
                } else {
                    linearLayout.addView(component2, i);
                }
            }
        }
        this.toggleMap.put(bVar.f24368b, component2);
        List list = EmptyList.INSTANCE;
        C11016s sVar = bVar.f24370d;
        if (sVar instanceof C11016s.C11019c) {
            C11016s.C11019c cVar = (C11016s.C11019c) sVar;
            list = cVar.f24435b;
            component2.setDescription(cVar.f24434a);
        } else {
            component2.setDescription("");
        }
        if (filterType == SearchFiltersV2Type.OTHER_OPTIONS) {
            component2.showBottomDivider(true);
        }
        int i3 = bVar.f24371e;
        if (i3 == 0) {
            LinearLayout linearLayout2 = this.layoutFilters;
            if (linearLayout2 != null) {
                linearLayout2.removeView(component2);
            }
        } else if (i3 == 1) {
            C10996i iVar = this.optionsAdapterMap.get(bVar.f24368b);
            if (iVar != null) {
                iVar.mo36553k(component1.getValueFacets(), list);
            }
        } else if (i3 == 2) {
            C10996i iVar2 = this.optionsAdapterMap.get(bVar.f24368b);
            if (iVar2 != null) {
                iVar2.mo36553k(component1.getValueFacets(), list);
                return;
            }
            AttributeValue attribute2 = component1.getAttribute();
            if (attribute2 != null) {
                searchFiltersV2Type = attribute2.getFilterType();
            }
            C10996i iVar3 = new C10996i(list, searchFiltersV2Type, new SearchFiltersV2Fragment$showMultiSelectFilter$2(this, component1));
            RecyclerView recyclerView = new RecyclerView(requireContext());
            if (filterType != null) {
                i2 = C10748b.f23682a[filterType.ordinal()];
            }
            if (i2 == 3) {
                requireContext();
                recyclerView.setLayoutManager(new GridLayoutManager(4));
                recyclerView.setAdapter(iVar3);
            } else if (i2 != 4) {
                requireContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter(iVar3);
            } else {
                requireContext();
                GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
                gridLayoutManager.f7008K = new C10750d(component1);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(gridLayoutManager);
                recyclerView.setAdapter(iVar3);
            }
            recyclerView.getRecycledViewPool().mo11691b(0);
            recyclerView.getRecycledViewPool().mo11691b(1);
            this.optionsAdapterMap.put(bVar.f24368b, iVar3);
            component2.addView(recyclerView);
            iVar3.mo36553k(component1.getValueFacets(), list);
        }
    }

    /* access modifiers changed from: private */
    public final void showMultiSelectPriceFilters(C11005m.C11006a aVar) {
        CollageContentToggle collageContentToggle;
        C13163b bVar = aVar.f24409b;
        List<C13166d> list = bVar.f28955c;
        if (!list.isEmpty()) {
            if (!this.toggleMap.containsKey(aVar.f24408a)) {
                Context requireContext = requireContext();
                C19383o.m32796f(requireContext, "requireContext()");
                collageContentToggle = new CollageContentToggle(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                LinearLayout linearLayout = this.layoutFilters;
                if (linearLayout != null) {
                    linearLayout.addView(collageContentToggle, aVar.f24410c);
                }
                collageContentToggle.setTitle(bVar.f28953a);
                this.toggleMap.put(aVar.f24408a, collageContentToggle);
                if (this.priceFilterOptionsAdapter == null) {
                    this.priceFilterOptionsAdapter = new C13167e(new SearchFiltersV2Fragment$showMultiSelectPriceFilters$1(this, aVar));
                }
                RecyclerView recyclerView = new RecyclerView(requireContext());
                requireContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter(this.priceFilterOptionsAdapter);
                collageContentToggle.addView(recyclerView);
                collageContentToggle.addView(getCustomPriceFieldsView$default(this, (CollageRadioGroup) null, aVar, 1, (Object) null));
            } else {
                collageContentToggle = this.toggleMap.get(aVar.f24408a);
            }
            if (collageContentToggle != null) {
                collageContentToggle.setDescription(bVar.f28960h);
            }
            C13167e eVar = this.priceFilterOptionsAdapter;
            if (eVar != null) {
                eVar.mo11950j(list);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void showNewFilters(SearchWithAds searchWithAds) {
        StaticFilterAttribute staticFilterAttribute;
        T t;
        boolean z;
        List<StaticFilterAttribute> attributes;
        T t2;
        showLoader(false);
        toggleResetButton();
        C10767e viewModel2 = getViewModel();
        String string = getResources().getString(R.string.all_categories);
        C19383o.m32796f(string, "resources.getString(R.string.all_categories)");
        FacetCountListMap facetCountListMap = searchWithAds.getFacetCountListMap();
        String str = null;
        List categoryFacetCounts = facetCountListMap != null ? facetCountListMap.getCategoryFacetCounts() : null;
        if (categoryFacetCounts == null) {
            categoryFacetCounts = EmptyList.INSTANCE;
        }
        viewModel2.mo35753q(string, this.query, categoryFacetCounts);
        C10767e viewModel3 = getViewModel();
        viewModel3.getClass();
        StaticFilters staticFilters2 = viewModel3.f23754s;
        if (staticFilters2 == null || (attributes = staticFilters2.getAttributes()) == null) {
            staticFilterAttribute = null;
        } else {
            Iterator<T> it = attributes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (C19383o.m32792b(((StaticFilterAttribute) t2).getId(), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    break;
                }
            }
            staticFilterAttribute = (StaticFilterAttribute) t2;
        }
        C10766d dVar = viewModel3.f23742g;
        FacetCountListMap facetCountListMap2 = searchWithAds.getFacetCountListMap();
        List attributeFacets = facetCountListMap2 != null ? facetCountListMap2.getAttributeFacets() : null;
        if (attributeFacets == null) {
            attributeFacets = EmptyList.INSTANCE;
        }
        dVar.getClass();
        ArrayList b = C10766d.m18645b(attributeFacets, staticFilterAttribute);
        int i = 0;
        for (T next : viewModel3.f23753r) {
            int i2 = i + 1;
            if (i >= 0) {
                AttributeFacet attributeFacet = (AttributeFacet) next;
                C10990e d = C10767e.m18648d(attributeFacet);
                C11016s h = viewModel3.mo35744h(attributeFacet, viewModel3.f23731D);
                PublishSubject<C10985b> publishSubject = viewModel3.f23756u;
                AttributeValue attribute = attributeFacet.getAttribute();
                publishSubject.onNext(new C10985b(attributeFacet, attribute != null ? attribute.getId() : null, d, h, 0, i));
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(viewModel3.f23750o);
        arrayList.removeAll(viewModel3.f23753r);
        arrayList.addAll(7, b);
        viewModel3.f23750o = arrayList;
        Iterator it2 = b.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                AttributeFacet attributeFacet2 = (AttributeFacet) next2;
                int i5 = i3 + 7;
                C10990e d2 = C10767e.m18648d(attributeFacet2);
                C11016s h2 = viewModel3.mo35744h(attributeFacet2, viewModel3.f23731D);
                PublishSubject<C10985b> publishSubject2 = viewModel3.f23756u;
                AttributeValue attribute2 = attributeFacet2.getAttribute();
                publishSubject2.onNext(new C10985b(attributeFacet2, attribute2 != null ? attribute2.getId() : null, d2, h2, 2, i5));
                i3 = i4;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        viewModel3.f23753r = b;
        Iterator<T> it3 = viewModel3.f23750o.iterator();
        while (true) {
            if (!it3.hasNext()) {
                t = null;
                break;
            }
            t = it3.next();
            AttributeValue attribute3 = ((AttributeFacet) t).getAttribute();
            if ((attribute3 != null ? attribute3.getFilterType() : null) == SearchFiltersV2Type.CATEGORY) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        AttributeFacet attributeFacet3 = (AttributeFacet) t;
        List<AttributeFacet> list = viewModel3.f23750o;
        C19383o.m32797g(list, "<this>");
        int indexOf = list.indexOf(attributeFacet3);
        if (attributeFacet3 != null) {
            ArrayList arrayList2 = new ArrayList();
            FacetCount selectedCategoryFacet = viewModel3.f23731D.getSelectedCategoryFacet();
            if (selectedCategoryFacet != null) {
                C10767e.m18650r(viewModel3.f23749n, arrayList2, selectedCategoryFacet);
                viewModel3.f23731D.setCategoryFacets(arrayList2);
            }
            C10990e d3 = C10767e.m18648d(attributeFacet3);
            C11016s h3 = viewModel3.mo35744h(attributeFacet3, viewModel3.f23731D);
            PublishSubject<C10985b> publishSubject3 = viewModel3.f23756u;
            AttributeValue attribute4 = attributeFacet3.getAttribute();
            if (attribute4 != null) {
                str = attribute4.getId();
            }
            publishSubject3.onNext(new C10985b(attributeFacet3, str, d3, h3, 2, indexOf));
        }
        updateShowResultsButtonText(searchWithAds.getCount());
    }

    /* access modifiers changed from: private */
    public final void showPriceFilters(C11005m.C11006a aVar) {
        C11005m.C11006a aVar2 = aVar;
        C13163b bVar = aVar2.f24409b;
        List<C13166d> list = bVar.f28955c;
        if (!list.isEmpty()) {
            Context requireContext = requireContext();
            C19383o.m32796f(requireContext, "requireContext()");
            CollageContentToggle collageContentToggle = new CollageContentToggle(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            LinearLayout linearLayout = this.layoutFilters;
            if (linearLayout != null) {
                linearLayout.addView(collageContentToggle, aVar2.f24410c);
            }
            collageContentToggle.setTitle(bVar.f28953a);
            this.toggleMap.put(aVar2.f24408a, collageContentToggle);
            Context requireContext2 = requireContext();
            C19383o.m32796f(requireContext2, "requireContext()");
            CollageRadioGroup collageRadioGroup = new CollageRadioGroup(requireContext2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    collageRadioGroup.addView(buildRadioButton(((C13166d) next).f28970b, i));
                    i = i2;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
            collageContentToggle.addView(collageRadioGroup);
            View customPriceFieldsView = getCustomPriceFieldsView(collageRadioGroup, aVar2);
            View findViewById = customPriceFieldsView.findViewById(R.id.min_price);
            C19383o.m32796f(findViewById, "customPriceView.findViewById(R.id.min_price)");
            CollageTextInput collageTextInput = (CollageTextInput) findViewById;
            View findViewById2 = customPriceFieldsView.findViewById(R.id.max_price);
            C19383o.m32796f(findViewById2, "customPriceView.findViewById(R.id.max_price)");
            CollageTextInput collageTextInput2 = (CollageTextInput) findViewById2;
            collageContentToggle.addView(customPriceFieldsView);
            collageContentToggle.setListener(new C10751e(collageRadioGroup, bVar, this, list));
            collageRadioGroup.check(bVar.f28957e);
            String str = bVar.f28960h;
            if (str != null) {
                updateBreadcrumb(new C10984a(aVar2.f24408a, new C11016s.C11023g(str)));
            }
            collageRadioGroup.setOnCheckedChangeListener(onPriceChangeListener(aVar2, collageTextInput, collageTextInput2));
        }
    }

    private final void showShipsToFilter(C10985b bVar) {
        Pair<AttributeFacet, CollageContentToggle> buildContentToggle = buildContentToggle(bVar);
        AttributeFacet component1 = buildContentToggle.component1();
        CollageContentToggle component2 = buildContentToggle.component2();
        LinearLayout linearLayout = this.layoutFilters;
        if (linearLayout != null) {
            linearLayout.addView(component2, bVar.f24372f);
        }
        this.toggleMap.put(bVar.f24368b, component2);
        View inflate = View.inflate(requireContext(), R.layout.layout_filter_ships_to, (ViewGroup) null);
        this.textCurrentCountry = (TextView) inflate.findViewById(R.id.text_current_country);
        Button button = (Button) inflate.findViewById(R.id.button_update);
        TextView textView = this.textCurrentCountry;
        if (textView != null) {
            textView.setText(getCurrentLocale().mo46719c().getDisplayCountry());
        }
        button.setText(getResources().getString(R.string.update));
        ViewExtensions.m12866j(button, new SearchFiltersV2Fragment$showShipsToFilter$1(this));
        component2.addView(inflate);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        r7 = r7.getNameRes();
     */
    @android.annotation.SuppressLint({"ResourceType"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void showShopLocationFilters(com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10985b r11) {
        /*
            r10 = this;
            kotlin.Pair r0 = r10.buildContentToggle(r11)
            java.lang.Object r1 = r0.component1()
            com.etsy.android.lib.models.apiv3.filters.AttributeFacet r1 = (com.etsy.android.lib.models.apiv3.filters.AttributeFacet) r1
            java.lang.Object r0 = r0.component2()
            com.etsy.android.stylekit.views.CollageContentToggle r0 = (com.etsy.android.stylekit.views.CollageContentToggle) r0
            android.widget.LinearLayout r2 = r10.layoutFilters
            if (r2 == 0) goto L_0x0019
            int r3 = r11.f24372f
            r2.addView(r0, r3)
        L_0x0019:
            java.util.Map<java.lang.String, com.etsy.android.stylekit.views.CollageContentToggle> r2 = r10.toggleMap
            java.lang.String r3 = r11.f24368b
            r2.put(r3, r0)
            java.util.List r1 = r1.getValueFacets()
            boolean r2 = r1.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0145
            com.etsy.android.stylekit.views.CollageRadioGroup r2 = new com.etsy.android.stylekit.views.CollageRadioGroup
            android.content.Context r5 = r10.requireContext()
            java.lang.String r4 = "requireContext()"
            kotlin.jvm.internal.C19383o.m32796f(r5, r4)
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
            r5 = r4
        L_0x0045:
            boolean r6 = r1.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x00bd
            java.lang.Object r6 = r1.next()
            int r8 = r5 + 1
            if (r5 < 0) goto L_0x00b9
            com.etsy.android.lib.models.apiv3.filters.ValueFacet r6 = (com.etsy.android.lib.models.apiv3.filters.ValueFacet) r6
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r7 = r6.getAttributeValue()
            if (r7 == 0) goto L_0x006b
            java.lang.Integer r7 = r7.getNameRes()
            if (r7 != 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            int r7 = r7.intValue()
            if (r7 != 0) goto L_0x006b
            r7 = r3
            goto L_0x006c
        L_0x006b:
            r7 = r4
        L_0x006c:
            if (r7 != 0) goto L_0x0093
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r6 = r6.getAttributeValue()
            if (r6 == 0) goto L_0x00b7
            java.lang.Integer r6 = r6.getNameRes()
            if (r6 == 0) goto L_0x00b7
            int r6 = r6.intValue()
            android.content.res.Resources r7 = r10.getResources()
            java.lang.String r6 = r7.getString(r6)
            java.lang.String r7 = "resources.getString(it)"
            kotlin.jvm.internal.C19383o.m32796f(r6, r7)
            android.view.View r5 = r10.buildShopLocationRadioButton(r6, r5)
            r2.addView(r5)
            goto L_0x00b7
        L_0x0093:
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r6 = r6.getAttributeValue()
            if (r6 == 0) goto L_0x009f
            java.lang.String r6 = r6.getName()
            if (r6 != 0) goto L_0x00ab
        L_0x009f:
            y9.d r6 = r10.getCurrentLocale()
            java.util.Locale r6 = r6.mo46719c()
            java.lang.String r6 = r6.getDisplayCountry()
        L_0x00ab:
            java.lang.String r7 = "systemRegion"
            kotlin.jvm.internal.C19383o.m32796f(r6, r7)
            android.view.View r5 = r10.buildShopLocationRadioButton(r6, r5)
            r2.addView(r5)
        L_0x00b7:
            r5 = r8
            goto L_0x0045
        L_0x00b9:
            p568fn.C17782b.m29877o0()
            throw r7
        L_0x00bd:
            r0.addView(r2)
            android.content.Context r1 = r10.requireContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r4 = 2131624245(0x7f0e0135, float:1.8875664E38)
            android.view.View r1 = r1.inflate(r4, r7)
            r4 = 2131430070(0x7f0b0ab6, float:1.848183E38)
            android.view.View r1 = r1.findViewById(r4)
            com.etsy.android.stylekit.views.CollageTextInput r1 = (com.etsy.android.stylekit.views.CollageTextInput) r1
            r0.setFocusableInTouchMode(r3)
            r0.addView(r1)
            if (r1 == 0) goto L_0x0108
            java.lang.CharSequence r4 = r0.getTitle()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.setLabelText(r4)
            com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showShopLocationFilters$2$1 r4 = new com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showShopLocationFilters$2$1
            r4.<init>(r10, r0)
            com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.TextinputKt.m18959a(r1, r4)
            com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showShopLocationFilters$2$2 r4 = new com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showShopLocationFilters$2$2
            r4.<init>(r10, r1)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.t r5 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.t
            r5.<init>(r4)
            r1.setOnEditorActionListener(r5)
            com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showShopLocationFilters$2$3 r4 = new com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showShopLocationFilters$2$3
            r4.<init>(r2)
            com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.TextinputKt.m18960b(r1, r4)
        L_0x0108:
            r2.setFocusableInTouchMode(r3)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.s r3 = r11.f24370d
            boolean r4 = r3 instanceof com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s.C11022f
            if (r4 == 0) goto L_0x013d
            r4 = r3
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$f r4 = (com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s.C11022f) r4
            int r4 = r4.f24439a
            r2.check((int) r4)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.a r4 = new com.etsy.android.ui.search.v2.filters.searchfiltersv2.a
            java.lang.String r11 = r11.f24368b
            r4.<init>(r11, r3)
            r10.updateBreadcrumb(r4)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$f r3 = (com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s.C11022f) r3
            int r11 = r3.f24439a
            r4 = 2131952681(0x7f130429, float:1.9541812E38)
            if (r11 != r4) goto L_0x0135
            com.etsy.android.ui.search.v2.SearchOptions$Location r11 = r3.f24440b
            java.lang.String r11 = r11.getLocation()
            r1.setText(r11)
        L_0x0135:
            com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$f r11 = new com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$f
            r11.<init>(r10, r1, r0)
            r2.setOnCheckedChangeListener(r11)
        L_0x013d:
            com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$g r11 = new com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$g
            r11.<init>(r2, r10)
            r0.setListener(r11)
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.SearchFiltersV2Fragment.showShopLocationFilters(com.etsy.android.ui.search.v2.filters.searchfiltersv2.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        r4 = r4.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void showSingleSelectFilter(com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10985b r10) {
        /*
            r9 = this;
            kotlin.Pair r0 = r9.buildContentToggle(r10)
            java.lang.Object r1 = r0.component1()
            com.etsy.android.lib.models.apiv3.filters.AttributeFacet r1 = (com.etsy.android.lib.models.apiv3.filters.AttributeFacet) r1
            java.lang.Object r0 = r0.component2()
            com.etsy.android.stylekit.views.CollageContentToggle r0 = (com.etsy.android.stylekit.views.CollageContentToggle) r0
            android.widget.LinearLayout r2 = r9.layoutFilters
            if (r2 == 0) goto L_0x0019
            int r3 = r10.f24372f
            r2.addView(r0, r3)
        L_0x0019:
            java.util.Map<java.lang.String, com.etsy.android.stylekit.views.CollageContentToggle> r2 = r9.toggleMap
            java.lang.String r3 = r10.f24368b
            r2.put(r3, r0)
            java.util.List r1 = r1.getValueFacets()
            boolean r2 = r1.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x00a1
            com.etsy.android.stylekit.views.CollageRadioGroup r2 = new com.etsy.android.stylekit.views.CollageRadioGroup
            android.content.Context r4 = r9.requireContext()
            java.lang.String r3 = "requireContext()"
            kotlin.jvm.internal.C19383o.m32796f(r4, r3)
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Iterator r1 = r1.iterator()
        L_0x0043:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0076
            java.lang.Object r3 = r1.next()
            com.etsy.android.lib.models.apiv3.filters.ValueFacet r3 = (com.etsy.android.lib.models.apiv3.filters.ValueFacet) r3
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r4 = r3.getAttributeValue()
            if (r4 == 0) goto L_0x0060
            java.lang.String r4 = r4.getId()
            if (r4 == 0) goto L_0x0060
            java.lang.Integer r4 = kotlin.text.C19456j.m33016T0(r4)
            goto L_0x0061
        L_0x0060:
            r4 = 0
        L_0x0061:
            if (r4 == 0) goto L_0x0043
            r4.intValue()
            com.etsy.android.lib.models.apiv3.filters.AttributeValue r3 = r3.getAttributeValue()
            int r4 = r4.intValue()
            com.etsy.android.stylekit.views.CollageRadioButton r3 = r9.buildRadioButton((com.etsy.android.lib.models.apiv3.filters.AttributeValue) r3, (int) r4)
            r2.addView(r3)
            goto L_0x0043
        L_0x0076:
            r0.addView(r2)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.s r1 = r10.f24370d
            boolean r3 = r1 instanceof com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s.C11018b
            if (r3 == 0) goto L_0x00a1
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$b r1 = (com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s.C11018b) r1
            java.lang.Integer r1 = r1.f24433a
            if (r1 == 0) goto L_0x00a1
            int r1 = r1.intValue()
            r2.check((int) r1)
            android.view.View r1 = r2.findViewById(r1)
            com.etsy.android.stylekit.views.CollageRadioButton r1 = (com.etsy.android.stylekit.views.CollageRadioButton) r1
            java.lang.String r1 = r1.getText()
            r0.setDescription(r1)
            com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$h r0 = new com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$h
            r0.<init>(r9, r10)
            r2.setOnCheckedChangeListener(r0)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.SearchFiltersV2Fragment.showSingleSelectFilter(com.etsy.android.ui.search.v2.filters.searchfiltersv2.b):void");
    }

    private final void showTopLevelCategories(C10985b bVar) {
        LinearLayout linearLayout;
        Pair<AttributeFacet, CollageContentToggle> buildContentToggle = buildContentToggle(bVar);
        AttributeFacet component1 = buildContentToggle.component1();
        CollageContentToggle component2 = buildContentToggle.component2();
        LinearLayout linearLayout2 = this.layoutFilters;
        boolean z = false;
        if (linearLayout2 != null) {
            if (!(linearLayout2.indexOfChild(component2) != -1)) {
                z = true;
            }
        }
        if (z && (linearLayout = this.layoutFilters) != null) {
            linearLayout.addView(component2, bVar.f24372f);
        }
        this.toggleMap.put(bVar.f24368b, component2);
        List list = EmptyList.INSTANCE;
        C11016s sVar = bVar.f24370d;
        if (sVar instanceof C11016s.C11017a) {
            C11016s.C11017a aVar = (C11016s.C11017a) sVar;
            list = aVar.f24432b;
            component2.setDescription(aVar.f24431a);
            component2.setDescriptionEllipsize(TextUtils.TruncateAt.START);
        }
        if (list.isEmpty()) {
            list = C17782b.m29864d0(getViewModel().f23749n);
        }
        ((FacetCount) list.get(list.size() - 1)).setOpen(true);
        C10759b bVar2 = this.categoriesAdapter;
        if (bVar2 == null) {
            this.categoriesAdapter = new C10759b(new SearchFiltersV2Fragment$showTopLevelCategories$1(this), new SearchFiltersV2Fragment$showTopLevelCategories$2(this, component1));
            setUpCategoryRecyclerView(list, component2);
        } else if (bVar2 != null) {
            bVar2.mo11950j(list);
        }
    }

    private final void toggleResetButton() {
        Button button = this.resetButton;
        if (button != null) {
            button.setEnabled(!this.searchOptions.hasDefaultFilters());
        }
    }

    /* access modifiers changed from: private */
    public final void updateBreadcrumb(C10984a aVar) {
        CollageContentToggle collageContentToggle = this.toggleMap.get(aVar.f24365a);
        C11016s sVar = aVar.f24366b;
        if (sVar instanceof C11016s.C11021e) {
            Integer num = ((C11016s.C11021e) sVar).f24438a;
            if (num != null) {
                int intValue = num.intValue();
                if (collageContentToggle != null) {
                    collageContentToggle.setDescription(getResources().getString(intValue));
                }
            }
        } else if (sVar instanceof C11016s.C11023g) {
            if (collageContentToggle != null) {
                collageContentToggle.setDescription(((C11016s.C11023g) sVar).f24441a);
            }
        } else if (sVar instanceof C11016s.C11022f) {
            if (collageContentToggle != null) {
                SearchOptions.Location location = ((C11016s.C11022f) sVar).f24440b;
                Resources resources = getResources();
                C19383o.m32796f(resources, "resources");
                collageContentToggle.setDescription(location.getLocation(resources));
            }
        } else if ((sVar instanceof C11016s.C11020d) && collageContentToggle != null) {
            C13166d dVar = ((C11016s.C11020d) sVar).f24437b;
            collageContentToggle.setDescription(dVar != null ? dVar.f28970b : null);
        }
    }

    /* access modifiers changed from: private */
    public final void updateCustomShopLocation(CollageContentToggle collageContentToggle, CharSequence charSequence) {
        collageContentToggle.setDescription(String.valueOf(charSequence));
        getViewModel().mo35750n(String.valueOf(charSequence));
        this.customShopLocationTracked = false;
    }

    /* access modifiers changed from: private */
    public final void updateShopLocationOptions(int i, CollageTextInput collageTextInput, CollageContentToggle collageContentToggle, String str) {
        if (i == R.string.new_search_filter_shop_location_anywhere) {
            Map<SearchFiltersV2Type, Integer> map = this.resMap;
            if (map != null) {
                Integer num = map.get(SearchFiltersV2Type.ANYWHERE);
                if (num != null) {
                    collageContentToggle.setDescription(getResources().getString(num.intValue()));
                }
            } else {
                C19383o.m32805o("resMap");
                throw null;
            }
        } else if (i == R.string.new_search_filter_shop_location_custom_title) {
            collageTextInput.requestFocus();
            getViewModel().mo35750n(collageTextInput.getText());
        } else if (i == R.string.search_filter_shop_location_local) {
            collageContentToggle.setDescription(str);
        }
        if (i != R.string.new_search_filter_shop_location_custom_title) {
            getViewModel().mo35749m(i);
            clearFocus(collageTextInput);
        }
    }

    private final void updateShowResultsButtonText(int i) {
        String str;
        ProgressButton progressButton = this.showResults;
        if (progressButton != null) {
            if (!getSearchFiltersEligibility().f24413a.mo21132b(C8592b.f18764V0)) {
                str = getString(R.string.search_filters_show_results);
            } else if (i > 0) {
                str = getResources().getQuantityString(R.plurals.search_filters_show_results_with_count, i, new Object[]{getNumberFormat().format(Integer.valueOf(i))});
            } else {
                str = getResources().getString(R.string.search_filters_show_results_zero_count);
            }
            progressButton.setText(str);
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

    public final C13888d getCurrentLocale() {
        C13888d dVar = this.currentLocale;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("currentLocale");
        throw null;
    }

    public int getFragmentTitle() {
        return R.string.search_title_filters;
    }

    public final C8694h getLogCat() {
        C8694h hVar = this.logCat;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("logCat");
        throw null;
    }

    public final NumberFormat getNumberFormat() {
        NumberFormat numberFormat2 = this.numberFormat;
        if (numberFormat2 != null) {
            return numberFormat2;
        }
        C19383o.m32805o("numberFormat");
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
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

    public final C10767e getViewModel() {
        C10767e eVar = this.viewModel;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    public final C8656o getViewModelFactory() {
        C8656o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewModelFactory");
        throw null;
    }

    public void onAnimationComplete() {
    }

    public void onCollapse() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("FILTER_PARAMS")) {
            FilterParams filterParams2 = (FilterParams) arguments.getParcelable("FILTER_PARAMS");
            if (filterParams2 == null) {
                filterParams2 = new FilterParams((String) null, (List) null, (List) null, (List) null, (StaticFilters) null, (SearchOptions) null, (SearchFiltersRequest) null, 0, 255, (DefaultConstructorMarker) null);
            }
            this.filterParams = filterParams2;
            this.query = filterParams2.getQuery();
            List<Integer> priceBuckets = this.filterParams.getPriceBuckets();
            if (priceBuckets != null) {
                this.priceRangeList = priceBuckets;
            } else {
                EmptyList emptyList = EmptyList.INSTANCE;
            }
            this.searchOptions = this.filterParams.getSearchOptions();
            this.categoryFacets = this.filterParams.getCategoryFacets();
            this.dynamicFacets = this.filterParams.getDynamicFacets();
            this.staticFilters = this.filterParams.getStaticFilters();
            this.filtersRequest = this.filterParams.getFiltersRequest();
        }
        if (bundle != null && bundle.containsKey("SEARCH_OPTIONS")) {
            SearchOptions searchOptions2 = (SearchOptions) bundle.getParcelable("SEARCH_OPTIONS");
            if (searchOptions2 == null) {
                searchOptions2 = this.searchOptions;
            }
            this.searchOptions = searchOptions2;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32795e(requireActivity, "null cannot be cast to non-null type com.etsy.android.ui.BOEActivity");
        ((BOEActivity) requireActivity).getAppBarHelper().setNavigationIcon((int) R.drawable.sk_ic_back_tinted);
        return layoutInflater.inflate(R.layout.fragment_search_filters, viewGroup, false);
    }

    public void onDestroyView() {
        AppBarHelper appBarHelper;
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (!(baseActivity == null || (appBarHelper = baseActivity.getAppBarHelper()) == null)) {
            appBarHelper.removeCustomTitleView();
        }
        this.layoutFilters = null;
        this.scrollView = null;
        this.textCurrentCountry = null;
        this.resetButton = null;
        this.showResults = null;
        this.categoriesAdapter = null;
        getViewModel().f23741f.getClass();
    }

    public void onDetach() {
        super.onDetach();
        this.optionsAdapterMap.clear();
        this.toggleMap.clear();
        getViewModel().f23741f.getClass();
    }

    public void onExpanded() {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        if (menuItem.getItemId() == 16908332) {
            getChildFragmentManager().mo10364Q();
            trackAdHocEvent("filters_back_tapped");
        }
        return onOptionsItemSelected;
    }

    public void onPopOut() {
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("SEARCH_OPTIONS", this.searchOptions);
    }

    public void onStart() {
        super.onStart();
        this.disposable.mo19405d();
        initObservers();
    }

    public void onStop() {
        super.onStop();
        this.disposable.mo19405d();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(R.attr.clg_color_bg_primary, typedValue, true);
            window.setBackgroundDrawableResource(typedValue.resourceId);
        }
        this.scrollView = (NestedScrollView) view.findViewById(R.id.nestedScrollView);
        this.layoutFilters = (LinearLayout) view.findViewById(R.id.layout_filters);
        ProgressButton progressButton = (ProgressButton) view.findViewById(R.id.search_filters_show_results);
        this.showResults = progressButton;
        if (progressButton != null) {
            ViewExtensions.m12866j(progressButton, new SearchFiltersV2Fragment$onViewCreated$2(this));
        }
        updateShowResultsButtonText(this.filterParams.getResultCount());
        C15588c1.m25340p0(view);
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        setViewModel((C10767e) new C2870k0((C2880m0) requireActivity, (C2870k0.C2872b) getViewModelFactory()).mo10829a(C10767e.class));
        this.resMap = getViewModel().f23734G;
        initObservers();
        C10767e viewModel2 = getViewModel();
        SearchOptions searchOptions2 = this.searchOptions;
        viewModel2.getClass();
        C19383o.m32797g(searchOptions2, "<set-?>");
        viewModel2.f23731D = searchOptions2;
        C10767e viewModel3 = getViewModel();
        SearchFiltersRequest searchFiltersRequest = this.filtersRequest;
        viewModel3.getClass();
        C19383o.m32797g(searchFiltersRequest, "<set-?>");
        viewModel3.f23751p = searchFiltersRequest;
        C10767e viewModel4 = getViewModel();
        String string = getResources().getString(R.string.all_categories);
        C19383o.m32796f(string, "resources.getString(R.string.all_categories)");
        viewModel4.mo35753q(string, this.query, this.categoryFacets);
        getViewModel().mo35747k(this.dynamicFacets, this.staticFilters);
        FragmentActivity activity2 = getActivity();
        if (activity2 instanceof BaseActivity) {
            AppBarHelper appBarHelper = ((BaseActivity) activity2).getAppBarHelper();
            appBarHelper.setHomeAsUpEnabled(true);
            View customTitleView = appBarHelper.setCustomTitleView((int) R.layout.collage_filters_header);
            Button button = customTitleView != null ? (Button) customTitleView.findViewById(R.id.reset) : null;
            this.resetButton = button;
            if (button != null) {
                button.setOnClickListener(new C9064o(this, 2));
            }
            toggleResetButton();
        }
        C19388s.m32894x0(this, "COUNTRY_SELECTED", new SearchFiltersV2Fragment$onViewCreated$4(this));
    }

    public final void resetFilters() {
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView != null) {
            nestedScrollView.smoothScrollTo(0, 0);
        }
        LinearLayout linearLayout = this.layoutFilters;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.toggleMap.clear();
        this.optionsAdapterMap.clear();
        this.priceFilterOptionsAdapter = null;
        C10767e viewModel2 = getViewModel();
        List<AttributeFacet> list = this.dynamicFacets;
        viewModel2.getClass();
        C19383o.m32797g(list, "dynamicFacets");
        viewModel2.f23731D.resetToDefault();
        viewModel2.f23729B = C19294b0.m32559p0();
        EmptyList emptyList = EmptyList.INSTANCE;
        viewModel2.f23750o = emptyList;
        viewModel2.f23753r = emptyList;
        viewModel2.f23741f.getClass();
        viewModel2.mo35747k(list, viewModel2.f23754s);
        viewModel2.mo35748l();
        toggleResetButton();
        this.categoriesAdapter = null;
        NestedScrollView nestedScrollView2 = this.scrollView;
        if (nestedScrollView2 != null) {
            nestedScrollView2.smoothScrollTo(0, 0);
        }
        C15588c1.m25340p0(getView());
        trackAdHocEvent("filters_clear_all_tapped");
    }

    public final void setCurrentLocale(C13888d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.currentLocale = dVar;
    }

    public final void setLogCat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logCat = hVar;
    }

    public final void setNumberFormat(NumberFormat numberFormat2) {
        C19383o.m32797g(numberFormat2, "<set-?>");
        this.numberFormat = numberFormat2;
    }

    public final void setSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.schedulers = fVar;
    }

    public final void setSearchFiltersEligibility(C11010o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.searchFiltersEligibility = oVar;
    }

    public final void setViewModel(C10767e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.viewModel = eVar;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r1 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = ((com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10987d.C10989b) r0).f24378a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void trackAdHocEvent(com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10986c r6) {
        /*
            r5 = this;
            java.lang.String r0 = "filterEvent"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.d r0 = r6.f24373a
            boolean r1 = r0 instanceof com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10987d.C10988a
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0012
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.d$a r0 = (com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10987d.C10988a) r0
            java.lang.String r0 = r0.f24377a
            goto L_0x0026
        L_0x0012:
            boolean r1 = r0 instanceof com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10987d.C10989b
            if (r1 == 0) goto L_0x0025
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.d$b r0 = (com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C10987d.C10989b) r0
            java.lang.Integer r0 = r0.f24378a
            if (r0 == 0) goto L_0x0025
            int r0 = r0.intValue()
            java.lang.String r0 = r5.getEnglishString(r0)
            goto L_0x0026
        L_0x0025:
            r0 = r2
        L_0x0026:
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.s r1 = r6.f24375c
            boolean r3 = r1 instanceof com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s.C11023g
            if (r3 == 0) goto L_0x0031
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$g r1 = (com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s.C11023g) r1
            java.lang.String r1 = r1.f24441a
            goto L_0x0053
        L_0x0031:
            boolean r3 = r1 instanceof com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s.C11021e
            if (r3 == 0) goto L_0x0044
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$e r1 = (com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s.C11021e) r1
            java.lang.Integer r1 = r1.f24438a
            if (r1 == 0) goto L_0x0052
            int r1 = r1.intValue()
            java.lang.String r1 = r5.getEnglishString(r1)
            goto L_0x0053
        L_0x0044:
            boolean r3 = r1 instanceof com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s.C11020d
            if (r3 == 0) goto L_0x0052
            com.etsy.android.ui.search.v2.filters.searchfiltersv2.s$d r1 = (com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11016s.C11020d) r1
            oe.d r1 = r1.f24437b
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = r1.f28970b
            if (r1 != 0) goto L_0x0053
        L_0x0052:
            r1 = r2
        L_0x0053:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Map<com.etsy.android.lib.logger.AnalyticsProperty, java.lang.Object> r4 = r6.f24374b
            r3.putAll(r4)
            java.lang.Boolean r4 = r6.f24376d
            if (r4 == 0) goto L_0x0086
            r4.booleanValue()
            java.lang.Boolean r6 = r6.f24376d
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0079
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r6 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.FILTER_IDENTIFIER
            r3.put(r6, r0)
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r6 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.FILTER_OPTION_SELECTED
            r3.put(r6, r1)
            java.lang.String r6 = "filter_applied"
            goto L_0x0085
        L_0x0079:
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r6 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.FILTER_IDENTIFIER
            r3.put(r6, r0)
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r6 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.FILTER_OPTION_DESELECTED
            r3.put(r6, r1)
            java.lang.String r6 = "filter_removed"
        L_0x0085:
            r2 = r6
        L_0x0086:
            com.etsy.android.lib.logger.p r6 = r5.getAnalyticsContext()
            r6.mo21333d(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.SearchFiltersV2Fragment.trackAdHocEvent(com.etsy.android.ui.search.v2.filters.searchfiltersv2.c):void");
    }

    public C9090a.C9091a.C9094c getActionBarOverrides() {
        return C9090a.C9091a.C9094c.f19992c;
    }

    public C11324t.C11325a.C11327b getBottomTabsOverrides() {
        return C11324t.C11325a.C11327b.f24989c;
    }

    private final CollageRadioButton buildRadioButton(String str, int i) {
        CollageRadioButton collageRadioButton = (CollageRadioButton) View.inflate(getContext(), R.layout.layout_filter_radio_button, (ViewGroup) null).findViewById(R.id.radio_button);
        collageRadioButton.setLayoutParams(getParams());
        collageRadioButton.setText(str);
        collageRadioButton.setId(i);
        return collageRadioButton;
    }

    public final void trackAdHocEvent(String str) {
        C19383o.m32797g(str, "event");
        getAnalyticsContext().mo21333d(str, (Map<? extends AnalyticsProperty, Object>) null);
    }
}
