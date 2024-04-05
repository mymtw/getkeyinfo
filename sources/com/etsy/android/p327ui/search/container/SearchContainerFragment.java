package com.etsy.android.p327ui.search.container;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.compose.animation.C0472h;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C2870k0;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.C10674m0;
import com.etsy.android.p327ui.C11324t;
import com.etsy.android.p327ui.C9090a;
import com.etsy.android.p327ui.C9113c0;
import com.etsy.android.p327ui.conversation.list.ccm.C9581e;
import com.etsy.android.p327ui.navigation.FragmentAnimationMode;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerDestinationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchFiltersKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchFiltersRefactorKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchInterstitialKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchResultsListingsKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchResultsShopsKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchTaxonomyCategoryKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchTopLevelCategoriesKey;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.C10866i;
import com.etsy.android.p327ui.search.interstitial.SearchInterstitialFragment;
import com.etsy.android.p327ui.search.p330v2.C10974e;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterParams;
import com.etsy.android.stylekit.views.C9053d;
import com.etsy.android.stylekit.views.ratings.C9072a;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.util.C11906j;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p145io.reactivex.subjects.PublishSubject;
import p356ge.C12790b;
import p357gf.C12794c;
import p428qc.C13286d;
import p428qc.C13294e;
import p430qe.C13301b;
import p440s9.C13366a;
import p456ua.C13461f;
import p733ar.C18974a;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.container.SearchContainerFragment */
public final class SearchContainerFragment extends TrackingBaseFragment implements SearchView.C0283l, View.OnFocusChangeListener, C10866i.C10868b, C13366a, C10741a, C9090a.C9096b, C11324t.C11329b, C9113c0.C9115b, C10674m0.C10675a {
    public static final int $stable = 8;
    public static final C10736a Companion = new C10736a();
    public static final String KEY_HAS_PARSED_ARGUMENTS = "has_parsed_arguments";

    /* renamed from: SEARCH_CONTAINER_LAYOUT_ID */
    public static final int search_container = 2131429566;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private FragmentManager.C2725m backstackChangedListener;
    private int childCount;
    private final C7091a disposable = new C7091a();
    private final View.OnFocusChangeListener focusChangeListenerDelegate = new C10742b(this);
    private boolean hasParsedArguments;
    public C13294e homeEventManager;
    private boolean isRecentSearch;
    public C8694h logCat;
    private int navigationIconRes = R.drawable.ic_search_animated_back_arrow_to_magnifying_glass;
    private SearchNavigationViewModel navigationViewModel;
    private Long savedSearchId;
    public C13461f schedulers;
    /* access modifiers changed from: private */
    public C10866i searchHelper;
    /* access modifiers changed from: private */
    public boolean showingUpArrow;

    /* renamed from: com.etsy.android.ui.search.container.SearchContainerFragment$a */
    public static final class C10736a {
    }

    /* renamed from: com.etsy.android.ui.search.container.SearchContainerFragment$b */
    public static final class C10737b implements C18974a {

        /* renamed from: a */
        public final C8703p f23669a;

        public C10737b(C8703p pVar) {
            this.f23669a = pVar;
        }

        /* renamed from: a */
        public final void mo31997a(boolean z) {
            if (!z) {
                this.f23669a.mo21333d("autosuggest_keyboard_dismissed", (Map<? extends AnalyticsProperty, Object>) null);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.search.container.SearchContainerFragment$c */
    public static final class C10738c implements C9113c0.C9114a {

        /* renamed from: a */
        public final /* synthetic */ SearchContainerFragment f23670a;

        public C10738c(SearchContainerFragment searchContainerFragment) {
            this.f23670a = searchContainerFragment;
        }

        /* renamed from: a */
        public final void mo31308a() {
            C10866i access$getSearchHelper$p = this.f23670a.searchHelper;
            if (access$getSearchHelper$p != null) {
                access$getSearchHelper$p.mo36072d();
            }
        }
    }

    /* renamed from: com.etsy.android.ui.search.container.SearchContainerFragment$d */
    public static final class C10739d extends Animatable2Compat.C3306a {

        /* renamed from: b */
        public final /* synthetic */ SearchContainerFragment f23671b;

        public C10739d(SearchContainerFragment searchContainerFragment) {
            this.f23671b = searchContainerFragment;
        }

        /* renamed from: a */
        public final void mo12418a() {
            this.f23671b.showingUpArrow = true;
        }
    }

    private final void addBackstackPopListener(C19846a<C19394m> aVar) {
        C10743c cVar = new C10743c(this, aVar);
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (childFragmentManager.f6143m == null) {
            childFragmentManager.f6143m = new ArrayList<>();
        }
        childFragmentManager.f6143m.add(cVar);
        this.backstackChangedListener = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: addBackstackPopListener$lambda-4  reason: not valid java name */
    public static final void m35028addBackstackPopListener$lambda4(SearchContainerFragment searchContainerFragment, C19846a aVar) {
        C19383o.m32797g(searchContainerFragment, "this$0");
        C19383o.m32797g(aVar, "$callback");
        int E = searchContainerFragment.getChildFragmentManager().mo10355E();
        if (searchContainerFragment.childCount > E) {
            aVar.invoke();
        }
        searchContainerFragment.childCount = E;
    }

    /* access modifiers changed from: private */
    public final void executeNavigation(C13301b bVar) {
        FragmentActivity activity = getActivity();
        C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.ui.BOEActivity");
        ((BOEActivity) activity).extendSearchFAB();
        CharSequence charSequence = null;
        if (C19383o.m32792b(bVar, C13301b.C13306e.f29209a)) {
            C10866i iVar = this.searchHelper;
            if (iVar != null) {
                charSequence = iVar.mo36071c();
            }
            navigateToShopSearchResults(String.valueOf(charSequence));
        } else if (bVar instanceof C13301b.C13304c) {
            navigateToCategoryPageFragment(((C13301b.C13304c) bVar).f29207a.getTaxonomyNodeId().getIdAsLong(), (String) null);
        } else if (C19383o.m32792b(bVar, C13301b.C13303b.f29206a)) {
            navigateToAllCategoriesLanding();
        } else if (bVar instanceof C13301b.C13310i) {
            C13301b.C13310i iVar2 = (C13301b.C13310i) bVar;
            navigateToSuggestedSearch(iVar2.f29213a, iVar2.f29214b, iVar2.f29215c, iVar2.f29216d);
        } else if (bVar instanceof C13301b.C13302a) {
            navigateToSearchAutoSuggest(((C13301b.C13302a) bVar).f29205a);
        } else if (C19383o.m32792b(bVar, C13301b.C13305d.f29208a)) {
            handleClearSearch();
        } else if (bVar instanceof C13301b.C13307f) {
            navigateToSearchResults(((C13301b.C13307f) bVar).f29210a, (SearchOptions) null);
        } else if (bVar instanceof C13301b.C13308g) {
            handlePopulateQuery(((C13301b.C13308g) bVar).f29211a);
        } else if (bVar instanceof C13301b.C13309h) {
            navigateToPageByRedirect(((C13301b.C13309h) bVar).f29212a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: focusChangeListenerDelegate$lambda-0  reason: not valid java name */
    public static final void m35029focusChangeListenerDelegate$lambda0(SearchContainerFragment searchContainerFragment, View view, boolean z) {
        C19383o.m32797g(searchContainerFragment, "this$0");
        C10866i iVar = searchContainerFragment.searchHelper;
        String valueOf = String.valueOf(iVar != null ? iVar.mo36071c() : null);
        SearchNavigationViewModel searchNavigationViewModel = searchContainerFragment.navigationViewModel;
        if (searchNavigationViewModel != null && z) {
            searchNavigationViewModel.f23672b.onNext(new C13301b.C13302a(valueOf));
        }
        if (z) {
            searchContainerFragment.getAnalyticsContext().mo21333d("search_focused", (Map<? extends AnalyticsProperty, Object>) null);
        }
    }

    private final AppBarHelper getAppBarHelper() {
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32795e(requireActivity, "null cannot be cast to non-null type com.etsy.android.ui.BOEActivity");
        AppBarHelper appBarHelper = ((BOEActivity) requireActivity).getAppBarHelper();
        C19383o.m32796f(appBarHelper, "requireActivity() as BOEActivity).appBarHelper");
        return appBarHelper;
    }

    /* access modifiers changed from: private */
    public final C12794c getTopChildFragment() {
        return C11906j.m19625a(getChildFragmentManager());
    }

    private final void handleClearSearch() {
        updateAutoSuggestQuery("");
        C10866i iVar = this.searchHelper;
        if (iVar != null) {
            iVar.mo36074f("");
        }
        C10866i iVar2 = this.searchHelper;
        if (iVar2 != null) {
            iVar2.mo36072d();
        }
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void handleExternalSearch(android.os.Bundle r41) {
        /*
            r40 = this;
            r0 = r41
            com.etsy.android.ui.search.i r1 = r40.getSearchViewHelper()
            java.lang.String r2 = "args"
            r3 = 0
            if (r1 == 0) goto L_0x0037
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            java.lang.String r1 = "intent_extra_data_key"
            java.lang.String r1 = r0.getString(r1)
            boolean r4 = com.etsy.android.lib.util.C8885d0.m17322f(r1)
            if (r4 == 0) goto L_0x0020
            java.lang.String r1 = "query"
            java.lang.String r1 = r0.getString(r1)
        L_0x0020:
            com.etsy.android.lib.logger.h r4 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getSearchQuery - got : "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r4.mo21310e(r5)
            goto L_0x0038
        L_0x0037:
            r1 = r3
        L_0x0038:
            com.etsy.android.ui.search.i r4 = r40.getSearchViewHelper()
            if (r4 == 0) goto L_0x004a
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            java.lang.String r2 = "SEARCH_OPTIONS"
            android.os.Parcelable r2 = r0.getParcelable(r2)
            com.etsy.android.ui.search.v2.SearchOptions r2 = (com.etsy.android.p327ui.search.p330v2.SearchOptions) r2
            goto L_0x004b
        L_0x004a:
            r2 = r3
        L_0x004b:
            java.lang.String r4 = "ANCHOR_LISTING_ID"
            java.lang.String r8 = r0.getString(r4)
            java.lang.String r4 = "SEARCH_MAX_PRICE"
            java.lang.String r4 = r0.getString(r4)
            if (r4 == 0) goto L_0x00a0
            if (r2 != 0) goto L_0x0098
            com.etsy.android.ui.search.v2.SearchOptions r2 = new com.etsy.android.ui.search.v2.SearchOptions
            r9 = r2
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 268435455(0xfffffff, float:2.5243547E-29)
            r39 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
        L_0x0098:
            java.math.BigDecimal r5 = new java.math.BigDecimal
            r5.<init>(r4)
            r2.setMaxPrice(r5)
        L_0x00a0:
            java.lang.String r4 = "SEARCH_MIN_PRICE"
            java.lang.String r4 = r0.getString(r4)
            if (r4 == 0) goto L_0x00ef
            if (r2 != 0) goto L_0x00e7
            com.etsy.android.ui.search.v2.SearchOptions r2 = new com.etsy.android.ui.search.v2.SearchOptions
            r9 = r2
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 268435455(0xfffffff, float:2.5243547E-29)
            r39 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
        L_0x00e7:
            java.math.BigDecimal r5 = new java.math.BigDecimal
            r5.<init>(r4)
            r2.setMinPrice(r5)
        L_0x00ef:
            r7 = r2
            java.lang.String r2 = "search_taxonomy_id"
            java.lang.Long r9 = com.google.android.play.core.appupdate.C15562d.m25175M(r0, r2)
            java.lang.String r2 = "SEARCH_REQUEST_PARAMS"
            android.os.Bundle r10 = r0.getBundle(r2)
            java.lang.String r2 = "SEARCH_CATEGORY_REDIRECT"
            android.os.Parcelable r2 = r0.getParcelable(r2)
            boolean r4 = r2 instanceof com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable
            if (r4 == 0) goto L_0x0109
            r3 = r2
            com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable r3 = (com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable) r3
        L_0x0109:
            r11 = r3
            java.lang.String r2 = "page_link"
            java.lang.String r12 = r0.getString(r2)
            java.lang.String r2 = "SEARCH_FEATURED_CATEGORIES"
            boolean r13 = r0.getBoolean(r2)
            if (r1 != 0) goto L_0x011a
            java.lang.String r1 = ""
        L_0x011a:
            r6 = r1
            r5 = r40
            r5.navigateToSearchResults(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.container.SearchContainerFragment.handleExternalSearch(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f24104h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void handlePopulateQuery(java.lang.String r5) {
        /*
            r4 = this;
            com.etsy.android.ui.search.i r0 = r4.searchHelper
            r1 = 0
            if (r0 == 0) goto L_0x000e
            android.widget.RelativeLayout r0 = r0.f24104h
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.hasFocus()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            com.etsy.android.ui.search.i r2 = r4.searchHelper
            if (r2 == 0) goto L_0x001b
            java.lang.String r3 = "searchQuery"
            kotlin.jvm.internal.C19383o.m32797g(r5, r3)
            r2.mo36073e(r5, r0, r1)
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.container.SearchContainerFragment.handlePopulateQuery(java.lang.String):void");
    }

    private final void navigateToAllCategoriesLanding() {
        C10866i iVar = this.searchHelper;
        if (iVar != null) {
            iVar.mo36070b();
        }
        C12790b.m20433e(this, new SearchTopLevelCategoriesKey(C12790b.m20432d(this)), true);
    }

    private final void navigateToPageByRedirect(SearchContainerDestinationKey searchContainerDestinationKey) {
        C12790b.m20433e(this, searchContainerDestinationKey, true);
    }

    private final void navigateToSearchAutoSuggest(String str) {
        boolean z = getChildFragmentManager().mo10355E() > 0;
        C12794c topChildFragment = getTopChildFragment();
        if (topChildFragment instanceof SearchInterstitialFragment) {
            ((SearchInterstitialFragment) topChildFragment).updateAutoSuggestQuery(str, z);
        } else {
            C12790b.m20433e(this, new SearchInterstitialKey(C12790b.m20432d(this), str, z), true);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void navigateToSearchCategoryRedirect(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 0
            if (r0 == 0) goto L_0x000d
            java.lang.String r2 = "SEARCH_CATEGORY_REDIRECT_TAXONOMY_PATH"
            java.lang.String r2 = r0.getString(r2)
            r4 = r2
            goto L_0x000e
        L_0x000d:
            r4 = r1
        L_0x000e:
            if (r0 == 0) goto L_0x0017
            java.lang.String r2 = "SEARCH_CATEGORY_REDIRECT_QUERY_PARAMS"
            java.io.Serializable r2 = r0.getSerializable(r2)
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            boolean r3 = r2 instanceof java.util.HashMap
            if (r3 == 0) goto L_0x0020
            java.util.HashMap r2 = (java.util.HashMap) r2
            r5 = r2
            goto L_0x0021
        L_0x0020:
            r5 = r1
        L_0x0021:
            boolean r2 = p628nj.C18263b.m30839d0(r4)
            if (r2 == 0) goto L_0x0033
            if (r5 == 0) goto L_0x0033
            com.etsy.android.ui.navigation.specs.SearchRedirectSpec r2 = new com.etsy.android.ui.navigation.specs.SearchRedirectSpec
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0034
        L_0x0033:
            r2 = r1
        L_0x0034:
            if (r0 == 0) goto L_0x003e
            java.lang.String r3 = "ANCHOR_LISTING_ID"
            java.lang.String r3 = r0.getString(r3)
            r9 = r3
            goto L_0x003f
        L_0x003e:
            r9 = r1
        L_0x003f:
            if (r0 == 0) goto L_0x004a
            java.lang.String r1 = "SEARCH_OPTIONS"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r1 = r0
            com.etsy.android.ui.search.v2.SearchOptions r1 = (com.etsy.android.p327ui.search.p330v2.SearchOptions) r1
        L_0x004a:
            r7 = r1
            com.etsy.android.ui.navigation.specs.SearchSpec r0 = new com.etsy.android.ui.navigation.specs.SearchSpec
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 1003(0x3eb, float:1.406E-42)
            r16 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.etsy.android.ui.navigation.keys.fragmentkeys.SearchRedirectKey r1 = new com.etsy.android.ui.navigation.keys.fragmentkeys.SearchRedirectKey
            java.lang.String r3 = p356ge.C12790b.m20432d(r17)
            r1.<init>(r3, r2, r0)
            r0 = 0
            r2 = r17
            p356ge.C12790b.m20433e(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.container.SearchContainerFragment.navigateToSearchCategoryRedirect(android.os.Bundle):void");
    }

    private final void navigateToShopSearchResults(String str) {
        C10866i iVar = this.searchHelper;
        if (iVar != null) {
            iVar.mo36070b();
        }
        C12790b.m20433e(this, new SearchResultsShopsKey(C12790b.m20432d(this), str), true);
    }

    private final void navigateToSuggestedSearch(String str, SearchOptions searchOptions, Long l, boolean z) {
        C10866i iVar = this.searchHelper;
        if (iVar != null) {
            iVar.mo36070b();
        }
        C10866i iVar2 = this.searchHelper;
        String str2 = str;
        if (iVar2 != null) {
            iVar2.mo36074f(str2);
        }
        Bundle arguments = getArguments();
        C12790b.m20433e(this, new SearchResultsListingsKey(C12790b.m20432d(this), new SearchSpec(str, (Long) null, searchOptions, l, (String) null, false, z, false, false, arguments != null ? arguments.getBundle("SEARCH_REQUEST_PARAMS") : null, 434, (DefaultConstructorMarker) null), (SearchCategoryRedirectPageParcelable) null, (String) null, (FragmentAnimationMode) null, 28, (DefaultConstructorMarker) null), true);
    }

    public static /* synthetic */ void navigateToSuggestedSearch$default(SearchContainerFragment searchContainerFragment, String str, SearchOptions searchOptions, Long l, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            searchOptions = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        searchContainerFragment.navigateToSuggestedSearch(str, searchOptions, l, z);
    }

    private final void navigateToTaxonomySearchResults(Long l, String str) {
        navigateToTaxonomySearchResults((SearchOptions) null, l, str);
    }

    private final void onShowResultsClicked(String str, SearchOptions searchOptions, boolean z, boolean z2) {
        C12790b.m20433e(this, new SearchResultsListingsKey(C12790b.m20432d(this), new SearchSpec(str, (Long) null, searchOptions, (Long) null, (String) null, true, false, z, false, (Bundle) null, 858, (DefaultConstructorMarker) null), (SearchCategoryRedirectPageParcelable) null, (String) null, FragmentAnimationMode.NONE, 12, (DefaultConstructorMarker) null), !z2);
    }

    public static /* synthetic */ void onShowResultsClicked$default(SearchContainerFragment searchContainerFragment, String str, SearchOptions searchOptions, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        searchContainerFragment.onShowResultsClicked(str, searchOptions, z, z2);
    }

    private final void parseArguments(Bundle bundle) {
        Long valueOf = bundle != null ? Long.valueOf(bundle.getLong("SAVED_SEARCH_ID", -1)) : null;
        this.savedSearchId = valueOf;
        if (valueOf != null && valueOf.longValue() == -1) {
            this.savedSearchId = null;
        }
        boolean z = false;
        this.isRecentSearch = bundle != null ? bundle.getBoolean("SEARCH_IS_RECENT_SEARCH") : false;
        if (!C19383o.m32792b("android.intent.action.SEARCH", bundle != null ? bundle.getString(ResponseConstants.ACTION) : null)) {
            if (!C19383o.m32792b("com.google.android.gms.actions.SEARCH_ACTION", bundle != null ? bundle.getString(ResponseConstants.ACTION) : null)) {
                if (bundle != null && bundle.containsKey("SEARCH_CATEGORY_REDIRECT_TAXONOMY_PATH")) {
                    navigateToSearchCategoryRedirect(bundle);
                    return;
                }
                if (bundle != null && bundle.containsKey("search_taxonomy_id")) {
                    String string = bundle.getString("ANCHOR_LISTING_ID");
                    Long M = C15562d.m25175M(bundle, "search_taxonomy_id");
                    if (!C19383o.m32792b("SEARCH_TYPE_CATEGORY", bundle.getString("SEARCH_TYPE"))) {
                        navigateToTaxonomySearchResults(M, string);
                        return;
                    } else if (M != null) {
                        navigateToCategoryPageFragment(M.longValue(), string);
                        return;
                    } else {
                        return;
                    }
                } else {
                    if (bundle != null && bundle.containsKey("TOP_LEVEL_CATEGORIES")) {
                        z = true;
                    }
                    if (z) {
                        navigateToAllCategoriesLanding();
                        return;
                    }
                    C10866i iVar = this.searchHelper;
                    if (iVar != null) {
                        iVar.mo36072d();
                    }
                    navigateToSearchAutoSuggest((String) null);
                    return;
                }
            }
        }
        handleExternalSearch(bundle);
    }

    private final void showBackNavigationIcon() {
        if (this.showingUpArrow) {
            getAppBarHelper().setNavigationIcon((int) R.drawable.sk_ic_back_tinted);
            this.navigationIconRes = R.drawable.sk_ic_back_tinted;
            return;
        }
        updateNavigationIcon(R.drawable.ic_search_animated_magnifying_glass_to_back_arrow);
    }

    private final void updateAutoSuggestQuery(String str) {
        boolean z = getChildFragmentManager().mo10355E() > 0;
        if (getTopChildFragment() instanceof SearchInterstitialFragment) {
            C12794c topChildFragment = getTopChildFragment();
            C19383o.m32795e(topChildFragment, "null cannot be cast to non-null type com.etsy.android.ui.search.interstitial.SearchInterstitialFragment");
            ((SearchInterstitialFragment) topChildFragment).updateAutoSuggestQuery(str, z);
        }
    }

    private final void updateNavigationIcon(int i) {
        if (i != this.navigationIconRes) {
            AnimatedVectorDrawableCompat create = AnimatedVectorDrawableCompat.create(requireActivity(), i);
            getAppBarHelper().setNavigationIcon((Drawable) create);
            if (create != null) {
                create.start();
            }
            if (create != null) {
                create.registerAnimationCallback(new C10739d(this));
            }
            this.navigationIconRes = i;
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

    public void clearFocus() {
        C10866i iVar = this.searchHelper;
        if (iVar != null) {
            iVar.mo36070b();
        }
    }

    public C11324t.C11325a getBottomTabsOverrides() {
        return C11324t.C11325a.C11326a.f24988c;
    }

    public final C13294e getHomeEventManager() {
        C13294e eVar = this.homeEventManager;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("homeEventManager");
        throw null;
    }

    public final C8694h getLogCat() {
        C8694h hVar = this.logCat;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("logCat");
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

    public C10866i getSearchViewHelper() {
        return this.searchHelper;
    }

    public boolean handleBackPressed() {
        if (C15588c1.m25346s0(requireContext())) {
            C15588c1.m25340p0(requireView());
        }
        if (getChildFragmentManager().mo10355E() <= 1) {
            return super.handleBackPressed();
        }
        getChildFragmentManager().mo10363P();
        return true;
    }

    public C9113c0.C9114a interceptSearchFABClick() {
        return new C10738c(this);
    }

    public void navigateToCategoryPageFragment(long j, String str) {
        C12790b.m20433e(this, new SearchTaxonomyCategoryKey(C12790b.m20432d(this), str, Long.valueOf(j), (String) null, (String) null, (SearchCategoryRedirectPageParcelable) null, 56, (DefaultConstructorMarker) null), true);
    }

    public void navigateToSearchResults(Long l) {
        C10866i iVar = this.searchHelper;
        if (iVar != null) {
            iVar.mo36070b();
        }
        C12790b.m20433e(this, new SearchResultsListingsKey(C12790b.m20432d(this), new SearchSpec("", l, (SearchOptions) null, (Long) null, (String) null, false, false, false, false, (Bundle) null, 1020, (DefaultConstructorMarker) null), (SearchCategoryRedirectPageParcelable) null, (String) null, (FragmentAnimationMode) null, 28, (DefaultConstructorMarker) null), true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        SearchOptions searchOptions;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 902 && intent != null && (stringExtra = intent.getStringExtra("query")) != null && (searchOptions = (SearchOptions) intent.getParcelableExtra("filters")) != null) {
            onShowResultsClicked$default(this, stringExtra, searchOptions, intent.getBooleanExtra("featured_categories", false), false, 8, (Object) null);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean(KEY_HAS_PARSED_ARGUMENTS, false);
        }
        this.hasParsedArguments = z;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_container, viewGroup, false);
        SearchNavigationViewModel searchNavigationViewModel = (SearchNavigationViewModel) new C2870k0(this).mo10829a(SearchNavigationViewModel.class);
        PublishSubject<C13301b> publishSubject = searchNavigationViewModel.f23672b;
        C19172m c = C0472h.m1242c(publishSubject, publishSubject);
        getSchedulers().getClass();
        ObservableSubscribeOn i = c.mo20639i(C13461f.m21235b());
        getSchedulers().getClass();
        LambdaObserver f = SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), SearchContainerFragment$onCreateView$1$1.INSTANCE, new SearchContainerFragment$onCreateView$1$2(this), 2);
        C7091a aVar = this.disposable;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
        this.navigationViewModel = searchNavigationViewModel;
        return inflate;
    }

    public void onDestroyView() {
        ArrayList<FragmentManager.C2725m> arrayList;
        this.disposable.mo19405d();
        FragmentManager.C2725m mVar = this.backstackChangedListener;
        if (!(mVar == null || (arrayList = getChildFragmentManager().f6143m) == null)) {
            arrayList.remove(mVar);
        }
        this.searchHelper = null;
        this.navigationViewModel = null;
        this.childCount = 0;
        super.onDestroyView();
    }

    public void onFiltersClicked(FilterParams filterParams) {
        C19383o.m32797g(filterParams, "filterParams");
        if (getConfigMap().mo21132b(C8592b.C8594b.f18855a)) {
            C12790b.m20430b(this, new SearchFiltersRefactorKey(C12790b.m20432d(this), filterParams));
        } else {
            C12790b.m20430b(this, new SearchFiltersKey(C12790b.m20432d(this), filterParams));
        }
    }

    public void onFocusChange(View view, boolean z) {
        this.focusChangeListenerDelegate.onFocusChange(view, z);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        return menuItem.getItemId() == 16908332 ? handleBackPressed() : super.onOptionsItemSelected(menuItem);
    }

    public boolean onQueryTextChange(String str) {
        SearchNavigationViewModel searchNavigationViewModel = this.navigationViewModel;
        if (searchNavigationViewModel == null) {
            return true;
        }
        searchNavigationViewModel.f23672b.onNext(new C13301b.C13302a(str));
        return true;
    }

    public boolean onQueryTextSubmit(String str) {
        SearchNavigationViewModel searchNavigationViewModel = this.navigationViewModel;
        if (searchNavigationViewModel == null) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        searchNavigationViewModel.f23672b.onNext(new C13301b.C13307f(str));
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(KEY_HAS_PARSED_ARGUMENTS, this.hasParsedArguments);
    }

    public void onStart() {
        super.onStart();
        setUpAppBar();
    }

    public void onStop() {
        super.onStop();
        getAppBarHelper().removeCustomView();
        getAppBarHelper().setNavigationIcon((int) R.drawable.ic_search_animated_back_arrow_to_magnifying_glass);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        addBackstackPopListener(new SearchContainerFragment$onViewCreated$1(this));
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C8703p analyticsContext = getAnalyticsContext();
        C19383o.m32796f(analyticsContext, "analyticsContext");
        C19382n.m32700B0(requireActivity, new C10737b(analyticsContext));
        C19388s.m32894x0(this, "902", new SearchContainerFragment$onViewCreated$2(this));
        C19254a<C13286d> aVar = getHomeEventManager().f29197a;
        getSchedulers().getClass();
        LambdaObserver f = SubscribersKt.m32501f(aVar.mo20635e(C13461f.m21236c()), SearchContainerFragment$onViewCreated$3.INSTANCE, new SearchContainerFragment$onViewCreated$4(this), 2);
        C7091a aVar2 = this.disposable;
        C19383o.m32798h(aVar2, "compositeDisposable");
        aVar2.mo19403b(f);
    }

    public final void setHomeEventManager(C13294e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.homeEventManager = eVar;
    }

    public final void setLogCat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logCat = hVar;
    }

    public void setQueryQuietly(String str) {
        C10866i iVar = this.searchHelper;
        if (iVar != null) {
            if (str == null) {
                str = "";
            }
            iVar.mo36074f(str);
        }
    }

    public final void setSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.schedulers = fVar;
    }

    public final void setUpAppBar() {
        C10866i iVar;
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C8703p analyticsContext = getAnalyticsContext();
        C19383o.m32796f(analyticsContext, "analyticsContext");
        String string = requireActivity().getString(R.string.search_for_anything_on_etsy_search_field_hint);
        C19383o.m32796f(string, "requireActivity().getStr…n_etsy_search_field_hint)");
        AppBarHelper appBarHelper = getAppBarHelper();
        SearchNavigationViewModel searchNavigationViewModel = this.navigationViewModel;
        C19383o.m32794d(searchNavigationViewModel);
        this.searchHelper = new C10866i(requireActivity, analyticsContext, string, appBarHelper, this, this, (C9581e) null, new C9072a(searchNavigationViewModel, 1), (C9053d) null, 648);
        showBackNavigationIcon();
        if (!this.hasParsedArguments) {
            this.hasParsedArguments = true;
            parseArguments(getArguments());
            return;
        }
        this.childCount = getChildFragmentManager().mo10355E();
        C12794c topChildFragment = getTopChildFragment();
        if ((topChildFragment instanceof C10974e) && (iVar = this.searchHelper) != null) {
            String query = ((C10974e) topChildFragment).getQuery();
            if (query == null) {
                query = "";
            }
            iVar.mo36074f(query);
        }
    }

    public int softInputMode() {
        return 32;
    }

    private final void navigateToTaxonomySearchResults(SearchOptions searchOptions, Long l, String str) {
        navigateToSearchResults("", searchOptions, str, l, (Bundle) null, (SearchCategoryRedirectPageParcelable) null, (String) null, false);
    }

    public C9090a.C9091a.C9094c getActionBarOverrides() {
        return C9090a.C9091a.C9094c.f19992c;
    }

    public void navigateToSearchResults(String str, SearchOptions searchOptions) {
        C10866i iVar = this.searchHelper;
        if (iVar != null) {
            iVar.mo36070b();
        }
        C8703p analyticsContext = getAnalyticsContext();
        C19383o.m32796f(analyticsContext, "analyticsContext");
        String str2 = str;
        analyticsContext.mo21333d("searched", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.QUERY, str2)));
        C12790b.m20433e(this, new SearchResultsListingsKey(C12790b.m20432d(this), new SearchSpec(str2, (Long) null, searchOptions, (Long) null, (String) null, false, false, false, false, (Bundle) null, 1018, (DefaultConstructorMarker) null), (SearchCategoryRedirectPageParcelable) null, (String) null, (FragmentAnimationMode) null, 28, (DefaultConstructorMarker) null), true);
    }

    private final void navigateToSearchResults(String str, SearchOptions searchOptions, String str2, Long l, Bundle bundle, SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable, String str3, boolean z) {
        C10866i iVar = this.searchHelper;
        if (iVar != null) {
            iVar.mo36070b();
        }
        C10866i iVar2 = this.searchHelper;
        String str4 = str;
        if (iVar2 != null) {
            iVar2.mo36074f(str4);
        }
        String str5 = str;
        Long l2 = l;
        SearchOptions searchOptions2 = searchOptions;
        C12790b.m20433e(this, new SearchResultsListingsKey(C12790b.m20432d(this), new SearchSpec(str5, l2, searchOptions2, this.savedSearchId, str2, false, this.isRecentSearch, z, false, bundle, 288, (DefaultConstructorMarker) null), searchCategoryRedirectPageParcelable, str3, (FragmentAnimationMode) null, 16, (DefaultConstructorMarker) null), true);
    }

    public void navigateToSearchResults(String str, SearchOptions searchOptions, String str2, Long l) {
        C12790b.m20433e(this, new SearchResultsListingsKey(C12790b.m20432d(this), new SearchSpec("", l, (SearchOptions) null, (Long) null, (String) null, false, false, false, false, (Bundle) null, 1020, (DefaultConstructorMarker) null), (SearchCategoryRedirectPageParcelable) null, (String) null, (FragmentAnimationMode) null, 28, (DefaultConstructorMarker) null), true);
    }
}
