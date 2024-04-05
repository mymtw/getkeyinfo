package com.etsy.android.p327ui.search.filters.refactor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.C0326j;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2869k;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.lib.models.apiv3.filters.AttributeFacet;
import com.etsy.android.lib.models.apiv3.filters.StaticFilters;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.C11324t;
import com.etsy.android.p327ui.C11330u;
import com.etsy.android.p327ui.C11795y;
import com.etsy.android.p327ui.C9090a;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchCountrySelectorKey;
import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.C10849q;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11010o;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterCountry;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterParams;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.SearchFiltersRequest;
import com.etsy.android.stylekit.views.ProgressButton;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.google.android.play.core.assetpacks.C15588c1;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C19410j;
import kotlin.text.C19459m;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.C19669s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p114g4.C6865e;
import p356ge.C12788a;
import p356ge.C12790b;
import p440s9.C13366a;
import p628nj.C18263b;
import p759nq.C19920b;

/* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersFragment */
public final class SearchFiltersFragment extends TrackingBaseFragment implements C13366a, C9090a.C9096b, C11324t.C11329b {
    public static final /* synthetic */ C19410j<Object>[] $$delegatedProperties;
    public static final int $stable = 8;
    public static final C10774a Companion = new C10774a();
    public static final String PARAM_FEATURED_CATEGORIES = "featured_categories";
    public static final String PARAM_FILTERS = "filters";
    public static final String PARAM_QUERY = "query";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public BOEActivity boeActivity;
    public NumberFormat numberFormat;
    private final C19920b recycler$delegate = C11795y.m19487a(this, R.id.filters_list);
    private Button resetButton;
    private C10808i searchFiltersAdapter;
    public C11010o searchFiltersEligibility;
    private final C19920b showResultsButton$delegate = C11795y.m19487a(this, R.id.search_filters_show_results);
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(SearchFiltersRefactorViewModel.class), new SearchFiltersFragment$special$$inlined$viewModels$default$2(new SearchFiltersFragment$special$$inlined$viewModels$default$1(this)), new SearchFiltersFragment$viewModel$2(this));
    public C8656o viewModelFactory;

    /* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersFragment$a */
    public static final class C10774a {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SearchFiltersFragment.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        C19386q.f43269a.getClass();
        $$delegatedProperties = new C19410j[]{propertyReference1Impl, new PropertyReference1Impl(SearchFiltersFragment.class, "showResultsButton", "getShowResultsButton()Lcom/etsy/android/stylekit/views/ProgressButton;", 0)};
    }

    private final void configureShowResultsButton(C10861x xVar) {
        String str;
        if (xVar.f24090d) {
            getShowResultsButton().showLoading();
        } else {
            getShowResultsButton().hideLoading();
        }
        if (xVar.f24089c != null) {
            ProgressButton showResultsButton = getShowResultsButton();
            if (!getSearchFiltersEligibility().f24413a.mo21132b(C8592b.f18764V0)) {
                str = getString(R.string.search_filters_show_results);
            } else if (xVar.f24089c.intValue() > 0) {
                str = getResources().getQuantityString(R.plurals.search_filters_show_results_with_count, xVar.f24089c.intValue(), new Object[]{getNumberFormat().format(xVar.f24089c)});
            } else {
                str = getResources().getString(R.string.search_filters_show_results_zero_count);
            }
            showResultsButton.setText(str);
        }
    }

    private final RecyclerView getRecycler() {
        return (RecyclerView) this.recycler$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final ProgressButton getShowResultsButton() {
        return (ProgressButton) this.showResultsButton$delegate.getValue(this, $$delegatedProperties[1]);
    }

    /* access modifiers changed from: private */
    public final SearchFiltersRefactorViewModel getViewModel() {
        return (SearchFiltersRefactorViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleSideEffect(C10849q qVar) {
        Object value;
        C10855s sVar;
        C10856t tVar;
        C10849q qVar2 = qVar;
        if (qVar2 instanceof C10849q.C10850a) {
            C10849q.C10850a aVar = (C10849q.C10850a) qVar2;
            getAnalyticsContext().mo21333d(aVar.f24045a, aVar.f24046b);
        } else if (qVar2 instanceof C10849q.C10851b) {
            C12790b.m20430b(this, new SearchCountrySelectorKey(C12790b.m20432d(this), ((C10849q.C10851b) qVar2).f24047a));
        } else if (qVar2 instanceof C10849q.C10852c) {
            Bundle bundle = new Bundle();
            C10849q.C10852c cVar = (C10849q.C10852c) qVar2;
            bundle.putString("query", cVar.f24048a);
            bundle.putParcelable("filters", cVar.f24049b);
            bundle.putBoolean("featured_categories", cVar.f24050c);
            C19394m mVar = C19394m.f43287a;
            C19388s.m32892w0(this, "902", bundle);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C12788a.m20426e(activity);
            }
        } else if (qVar2 instanceof C10849q.C10853d) {
            scrollToItem(((C10849q.C10853d) qVar2).f24051a);
        }
        SearchFiltersRefactorViewModel viewModel = getViewModel();
        viewModel.getClass();
        C19383o.m32797g(qVar2, "sideEffect");
        StateFlowImpl stateFlowImpl = viewModel.f23798k;
        do {
            value = stateFlowImpl.getValue();
            sVar = (C10855s) value;
            sVar.getClass();
            tVar = sVar.f24058a;
        } while (!stateFlowImpl.mo72337i(value, C10855s.m18848b(sVar, C10856t.m18854a(tVar, (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, C19327t.m32649e1(qVar2, tVar.f24074l), (Integer) null, false, false, 30719), (FilterParams) null, (FacetCount) null, 6)));
    }

    /* access modifiers changed from: private */
    public final void handleState(C10861x xVar) {
        C10808i iVar = this.searchFiltersAdapter;
        if (iVar != null) {
            iVar.mo11950j(xVar.f24088b);
            configureShowResultsButton(xVar);
            Button button = this.resetButton;
            if (button != null) {
                button.setEnabled(xVar.f24091e);
            }
            C10849q qVar = (C10849q) C19327t.m32640V0(xVar.f24087a);
            if (qVar != null) {
                handleSideEffect(qVar);
                return;
            }
            return;
        }
        C19383o.m32805o("searchFiltersAdapter");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m35036onViewCreated$lambda2(SearchFiltersFragment searchFiltersFragment, View view) {
        C19383o.m32797g(searchFiltersFragment, "this$0");
        searchFiltersFragment.getViewModel().mo35785e(C10813l.C10824k.f23967a);
    }

    private final void scrollToItem(String str) {
        C10808i iVar = this.searchFiltersAdapter;
        Integer num = null;
        if (iVar != null) {
            C19383o.m32797g(str, "itemId");
            List<T> list = iVar.f7450b.f7220f;
            C19383o.m32796f(list, "currentList");
            Iterator<T> it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C19383o.m32792b(str, ((SearchFiltersUiGroupItem) it.next()).mo35793b())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                num = Integer.valueOf(i);
            }
            if (num != null) {
                int intValue = num.intValue();
                RecyclerView.C3100o layoutManager = getRecycler().getLayoutManager();
                C19383o.m32795e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).mo11307k1(intValue, 0);
                return;
            }
            return;
        }
        C19383o.m32805o("searchFiltersAdapter");
        throw null;
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

    public final BOEActivity getBoeActivity() {
        BOEActivity bOEActivity = this.boeActivity;
        if (bOEActivity != null) {
            return bOEActivity;
        }
        C19383o.m32805o("boeActivity");
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

    public final C11010o getSearchFiltersEligibility() {
        C11010o oVar = this.searchFiltersEligibility;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("searchFiltersEligibility");
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

    public void onCreate(Bundle bundle) {
        StateFlowImpl stateFlowImpl;
        Object obj;
        SearchFiltersRefactorViewModel searchFiltersRefactorViewModel;
        StaticFilters staticFilters;
        FacetCount facetCount;
        Map map;
        boolean z;
        boolean z2;
        Object value;
        Map map2;
        Object obj2;
        StateFlowImpl stateFlowImpl2;
        FacetCount facetCount2;
        super.onCreate(bundle);
        SearchFiltersRefactorViewModel viewModel = getViewModel();
        Bundle arguments = getArguments();
        FilterParams filterParams = arguments != null ? (FilterParams) arguments.getParcelable("FILTER_PARAMS") : null;
        if (filterParams == null) {
            filterParams = new FilterParams((String) null, (List) null, (List) null, (List) null, (StaticFilters) null, (SearchOptions) null, (SearchFiltersRequest) null, 0, 255, (DefaultConstructorMarker) null);
        }
        viewModel.getClass();
        int i = 1;
        int i2 = 0;
        if (((C10855s) viewModel.f23798k.getValue()).f24059b == null) {
            FacetCount facetCount3 = new FacetCount("top-level-facets", viewModel.f23789b.mo38059c(R.string.all_categories, new Object[0]), filterParams.getResultCount(), filterParams.getCategoryFacets());
            StateFlowImpl stateFlowImpl3 = viewModel.f23798k;
            while (true) {
                Object value2 = stateFlowImpl3.getValue();
                if (stateFlowImpl3.mo72337i(value2, C10855s.m18848b((C10855s) value2, (C10856t) null, filterParams, facetCount3, 1))) {
                    break;
                }
                SearchFiltersRefactorViewModel searchFiltersRefactorViewModel2 = viewModel;
            }
            StateFlowImpl stateFlowImpl4 = viewModel.f23798k;
            while (true) {
                Object value3 = stateFlowImpl4.getValue();
                C10855s sVar = (C10855s) value3;
                C10857u uVar = viewModel.f23794g;
                List<AttributeFacet> dynamicFacets = filterParams.getDynamicFacets();
                StaticFilters staticFilters2 = filterParams.getStaticFilters();
                String attributeValuesParam = filterParams.getSearchOptions().getAttributeValuesParam();
                C19383o.m32797g(attributeValuesParam, "attributeValuesParam");
                int i3 = 6;
                if ((attributeValuesParam.length() == 0 ? i : i2) != 0) {
                    map2 = C19294b0.m32559p0();
                    searchFiltersRefactorViewModel = viewModel;
                    obj = value3;
                    stateFlowImpl = stateFlowImpl4;
                    facetCount = facetCount3;
                    staticFilters = staticFilters2;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    List y1 = C19459m.m33056y1(attributeValuesParam, new String[]{","}, i2, 6);
                    ArrayList arrayList = new ArrayList(C19322o.m32624F0(y1));
                    Iterator it = y1.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!C19459m.m33037f1(str, ':')) {
                            map = C19294b0.m32559p0();
                            searchFiltersRefactorViewModel = viewModel;
                            obj = value3;
                            stateFlowImpl = stateFlowImpl4;
                            facetCount = facetCount3;
                            staticFilters = staticFilters2;
                            break;
                        }
                        Iterator it2 = it;
                        List y12 = C19459m.m33056y1(str, new String[]{MessageDraft.IMAGE_DELIMITER}, 0, i3);
                        String str2 = (String) y12.get(0);
                        List y13 = C19459m.m33056y1((String) y12.get(1), new String[]{"|"}, 0, i3);
                        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(y13));
                        Iterator it3 = y13.iterator();
                        while (it3.hasNext()) {
                            String str3 = (String) it3.next();
                            Iterator it4 = it3;
                            char[] cArr = {'{', '}', ','};
                            C19383o.m32797g(str3, "<this>");
                            SearchFiltersRefactorViewModel searchFiltersRefactorViewModel3 = viewModel;
                            StaticFilters staticFilters3 = staticFilters2;
                            int i4 = 0;
                            int length = str3.length() - 1;
                            boolean z3 = false;
                            while (true) {
                                if (i4 > length) {
                                    obj2 = value3;
                                    stateFlowImpl2 = stateFlowImpl4;
                                    facetCount2 = facetCount3;
                                    break;
                                }
                                obj2 = value3;
                                char charAt = str3.charAt(!z3 ? i4 : length);
                                stateFlowImpl2 = stateFlowImpl4;
                                facetCount2 = facetCount3;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= 3) {
                                        i5 = -1;
                                        break;
                                    } else if (charAt == cArr[i5]) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                                boolean z4 = i5 >= 0;
                                if (!z3) {
                                    if (!z4) {
                                        z3 = true;
                                    } else {
                                        i4++;
                                    }
                                } else if (!z4) {
                                    break;
                                } else {
                                    length--;
                                }
                                facetCount3 = facetCount2;
                                value3 = obj2;
                                stateFlowImpl4 = stateFlowImpl2;
                            }
                            arrayList2.add(str3.subSequence(i4, length + 1).toString());
                            it3 = it4;
                            facetCount3 = facetCount2;
                            staticFilters2 = staticFilters3;
                            viewModel = searchFiltersRefactorViewModel3;
                            value3 = obj2;
                            stateFlowImpl4 = stateFlowImpl2;
                        }
                        SearchFiltersRefactorViewModel searchFiltersRefactorViewModel4 = viewModel;
                        Object obj3 = value3;
                        StateFlowImpl stateFlowImpl5 = stateFlowImpl4;
                        FacetCount facetCount4 = facetCount3;
                        StaticFilters staticFilters4 = staticFilters2;
                        linkedHashMap.put(str2, arrayList2);
                        arrayList.add(C19394m.f43287a);
                        i3 = 6;
                        it = it2;
                    }
                    searchFiltersRefactorViewModel = viewModel;
                    obj = value3;
                    stateFlowImpl = stateFlowImpl4;
                    facetCount = facetCount3;
                    staticFilters = staticFilters2;
                    map2 = linkedHashMap;
                }
                map = map2;
                EmptyList emptyList = EmptyList.INSTANCE;
                List<Integer> priceBuckets = filterParams.getPriceBuckets();
                SortOrder sortOrder = filterParams.getSearchOptions().getSortOrder();
                SearchOptions.MarketPlace marketplace = filterParams.getSearchOptions().getMarketplace();
                boolean freeShipping = filterParams.getSearchOptions().getFreeShipping();
                boolean oneDayShipping = filterParams.getSearchOptions().getOneDayShipping();
                boolean threeDayShipping = filterParams.getSearchOptions().getThreeDayShipping();
                boolean onSale = filterParams.getSearchOptions().getOnSale();
                boolean acceptsGiftCards = filterParams.getSearchOptions().getAcceptsGiftCards();
                boolean customizable = filterParams.getSearchOptions().getCustomizable();
                Map map3 = map;
                boolean giftWrap = filterParams.getSearchOptions().getGiftWrap();
                boolean z5 = customizable;
                FilterCountry filterCountry = new FilterCountry(filterParams.getSearchOptions().getShipsToCountryName(), filterParams.getSearchOptions().getShipsToCountryCode());
                String str4 = sVar.f24062e;
                SearchOptions.Location shopLocation = filterParams.getSearchOptions().getShopLocation();
                BigDecimal minPrice = filterParams.getSearchOptions().getMinPrice();
                BigDecimal maxPrice = filterParams.getSearchOptions().getMaxPrice();
                boolean hasPriceBucketSelected = filterParams.getSearchOptions().hasPriceBucketSelected();
                boolean isAnyPriceSelected = filterParams.getSearchOptions().isAnyPriceSelected();
                if (filterParams.getSearchOptions().getUserSpecifiedMin() || filterParams.getSearchOptions().getUserSpecifiedMax()) {
                    z2 = acceptsGiftCards;
                    z = true;
                } else {
                    z2 = acceptsGiftCards;
                    z = false;
                }
                C19383o.m32797g(dynamicFacets, "dynamicFacets");
                C19383o.m32797g(emptyList, "expandedFilters");
                C19383o.m32797g(sortOrder, "sortOrder");
                C19383o.m32797g(marketplace, "itemType");
                C19383o.m32797g(shopLocation, "shopLocation");
                uVar.getClass();
                SearchFiltersUiGroupItem.SortBy m = uVar.mo36058m(sortOrder);
                SearchFiltersUiGroupItem.C10781b c = uVar.mo36048c(facetCount, str4);
                SearchFiltersUiGroupItem.ItemType e = uVar.mo36050e(marketplace);
                boolean z6 = giftWrap;
                C10857u uVar2 = uVar;
                SearchOptions.Location location = shopLocation;
                List<Integer> list = priceBuckets;
                FilterParams filterParams2 = filterParams;
                C10855s sVar2 = sVar;
                boolean z7 = z2;
                BigDecimal bigDecimal = minPrice;
                boolean z8 = z5;
                boolean z9 = onSale;
                StaticFilters staticFilters5 = staticFilters;
                BigDecimal bigDecimal2 = maxPrice;
                boolean z10 = z6;
                List<AttributeFacet> list2 = dynamicFacets;
                boolean z11 = hasPriceBucketSelected;
                C10857u uVar3 = uVar;
                boolean z12 = isAnyPriceSelected;
                boolean z13 = z;
                SearchFiltersUiGroupItem.C10783d g = uVar2.mo36052g(list, bigDecimal, bigDecimal2, z11, z12, z13);
                SearchFiltersUiGroupItem.C10782c h = uVar3.mo36053h(list, bigDecimal, bigDecimal2, z11, z12, z13);
                C10857u uVar4 = uVar3;
                SearchFiltersUiGroupItem.Shipping j = uVar4.mo36055j(freeShipping, oneDayShipping, threeDayShipping);
                SearchFiltersUiGroupItem.C10784e k = uVar4.mo36056k(filterCountry);
                StateFlowImpl stateFlowImpl6 = stateFlowImpl;
                if (stateFlowImpl6.mo72337i(obj, C10855s.m18848b(sVar2, C10856t.m18854a(new C10856t(m, c, e, h, g, j, k, uVar4.mo36057l(location), uVar4.mo36049d(list2, staticFilters5, map3, emptyList), uVar4.mo36051f(z9, z7, z8, z10), (EmptyList) null, 31744), (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, Integer.valueOf(filterParams2.getResultCount()), false, false, 28671), (FilterParams) null, (FacetCount) null, 6))) {
                    break;
                }
                i = 1;
                i2 = 0;
                stateFlowImpl4 = stateFlowImpl6;
                filterParams = filterParams2;
                facetCount3 = facetCount;
                viewModel = searchFiltersRefactorViewModel;
            }
            SearchFiltersRefactorViewModel searchFiltersRefactorViewModel5 = searchFiltersRefactorViewModel;
            C10856t tVar = ((C10855s) searchFiltersRefactorViewModel5.f23798k.getValue()).f24058a;
            FilterParams filterParams3 = ((C10855s) searchFiltersRefactorViewModel5.f23798k.getValue()).f24059b;
            C10856t a = C10856t.m18854a(((C10855s) searchFiltersRefactorViewModel5.f23798k.getValue()).f24058a, (SearchFiltersUiGroupItem.SortBy) null, (SearchFiltersUiGroupItem.C10781b) null, (SearchFiltersUiGroupItem.ItemType) null, (SearchFiltersUiGroupItem.C10782c) null, (SearchFiltersUiGroupItem.C10783d) null, (SearchFiltersUiGroupItem.Shipping) null, (SearchFiltersUiGroupItem.C10784e) null, (SearchFiltersUiGroupItem.C10785f) null, (ArrayList) null, (SearchFiltersUiGroupItem.OtherOptions) null, (ArrayList) null, (Integer) null, false, !C19383o.m32792b((C10841p) searchFiltersRefactorViewModel5.f23797j.getValue(), searchFiltersRefactorViewModel5.mo35783c(tVar, filterParams3 != null ? filterParams3.getSearchOptions() : null)), 16383);
            StateFlowImpl stateFlowImpl7 = searchFiltersRefactorViewModel5.f23798k;
            do {
                value = stateFlowImpl7.getValue();
            } while (!stateFlowImpl7.mo72337i(value, C10855s.m18848b((C10855s) value, a, (FilterParams) null, (FacetCount) null, 6)));
        }
        this.searchFiltersAdapter = new C10808i(new SearchFiltersFragment$onCreate$1(this));
        C19388s.m32894x0(this, "COUNTRY_SELECTED", new SearchFiltersFragment$onCreate$2(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_search_filters_refactor, viewGroup, false);
        C19383o.m32796f(inflate, "inflater.inflate(R.layou…factor, container, false)");
        return inflate;
    }

    public void onDestroyView() {
        this.resetButton = null;
        getBoeActivity().getAppBarHelper().removeCustomTitleView();
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.new_search_filters_screen_badge);
        if (C0326j.m869n(BuildTarget.Companion)) {
            ViewExtensions.m12869m(findViewById);
        } else {
            ViewExtensions.m12860d(findViewById);
        }
        AppBarHelper appBarHelper = getBoeActivity().getAppBarHelper();
        appBarHelper.setNavigationIcon((int) R.drawable.sk_ic_back_tinted);
        appBarHelper.setHomeAsUpEnabled(true);
        View customTitleView = appBarHelper.setCustomTitleView((int) R.layout.collage_filters_header);
        Button button = customTitleView != null ? (Button) customTitleView.findViewById(R.id.reset) : null;
        this.resetButton = button;
        if (button != null) {
            button.setOnClickListener(new C6865e(this, 4));
        }
        ViewExtensions.m12866j(getShowResultsButton(), new SearchFiltersFragment$onViewCreated$4(this));
        RecyclerView recycler = getRecycler();
        requireContext();
        recycler.setLayoutManager(new LinearLayoutManager());
        C10808i iVar = this.searchFiltersAdapter;
        if (iVar != null) {
            recycler.setAdapter(iVar);
            recycler.setItemAnimator(new C11330u());
            C19662p1 p1Var = getViewModel().f23799l;
            Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
            C19383o.m32796f(lifecycle, "viewLifecycleOwner.lifecycle");
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(C2869k.m6799a(p1Var, lifecycle, Lifecycle.State.STARTED), new SearchFiltersFragment$onViewCreated$6(this, (C19340c<? super SearchFiltersFragment$onViewCreated$6>) null));
            C2887s viewLifecycleOwner = getViewLifecycleOwner();
            C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
            C19669s.m33429a(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, C15588c1.m25329i0(viewLifecycleOwner));
            return;
        }
        C19383o.m32805o("searchFiltersAdapter");
        throw null;
    }

    public final void setBoeActivity(BOEActivity bOEActivity) {
        C19383o.m32797g(bOEActivity, "<set-?>");
        this.boeActivity = bOEActivity;
    }

    public final void setNumberFormat(NumberFormat numberFormat2) {
        C19383o.m32797g(numberFormat2, "<set-?>");
        this.numberFormat = numberFormat2;
    }

    public final void setSearchFiltersEligibility(C11010o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.searchFiltersEligibility = oVar;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }

    public C9090a.C9091a.C9094c getActionBarOverrides() {
        return C9090a.C9091a.C9094c.f19992c;
    }

    public C11324t.C11325a.C11327b getBottomTabsOverrides() {
        return C11324t.C11325a.C11327b.f24989c;
    }
}
