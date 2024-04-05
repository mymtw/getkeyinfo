package com.etsy.android.p327ui.favorites.recommendations;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.logger.referrers.Referrer;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.UserCollection;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.favorites.BuyersInformationHeader;
import com.etsy.android.p327ui.favorites.C9792b;
import com.etsy.android.p327ui.favorites.C9895t;
import com.etsy.android.p327ui.favorites.C9899x;
import com.etsy.android.p327ui.favorites.CollectionTitleView;
import com.etsy.android.stylekit.views.CollageTabLayout;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.BaseActivity;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.view.ToggleableSwipeViewPager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p357gf.C12792a;
import p425q9.C13265p;
import p435rb.C13350a;
import p440s9.C13366a;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.favorites.recommendations.CollectionContainerFragment */
public final class CollectionContainerFragment extends TrackingBaseFragment implements C9731e0.C9732a, C13366a, C9872b {
    public static final int $stable = 8;
    public static final C9867a Companion = new C9867a();
    public static final String SHOW_SUGGESTIONS = "show_suggestions";
    public static final String SHOW_SUGGESTIONS_TAB_FIRST = "show_suggestions_tab_first";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final boolean animateHeader = true;
    /* access modifiers changed from: private */
    public BuyersInformationHeader buyersInformationHeader;
    private final C19285c buyersInformationHeaderIsEnabled$delegate = C19350d.m32677b(new CollectionContainerFragment$buyersInformationHeaderIsEnabled$2(this));
    public C9792b collectionHeaderEligibility;
    private String collectionId;
    private String collectionKey;
    private final C19285c collectionTitleView$delegate = C19350d.m32677b(new CollectionContainerFragment$collectionTitleView$2(this));
    private int count = -1;
    private String deepLink;
    private RecyclerView.C3108s onScrollListener = new C9868b(this);
    public C9871a presenter;
    public C9875e recommendationsOnFavoritesEligibility;
    public C13265p session;
    private boolean showSuggestions;
    private boolean showSuggestionsFirst;
    private String slug;
    private C9874d tabsPagerAdapter;
    public C9899x tabsWithIconsEligibility;
    private UserCollection userCollection;
    private String userId;
    private ToggleableSwipeViewPager viewPager;

    /* renamed from: com.etsy.android.ui.favorites.recommendations.CollectionContainerFragment$a */
    public static final class C9867a {
    }

    /* renamed from: com.etsy.android.ui.favorites.recommendations.CollectionContainerFragment$b */
    public static final class C9868b extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ CollectionContainerFragment f21779b;

        public C9868b(CollectionContainerFragment collectionContainerFragment) {
            this.f21779b = collectionContainerFragment;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C19383o.m32797g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            RecyclerView.C3100o layoutManager = recyclerView.getLayoutManager();
            C19383o.m32795e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int P0 = ((GridLayoutManager) layoutManager).mo11279P0();
            BuyersInformationHeader access$getBuyersInformationHeader$p = this.f21779b.buyersInformationHeader;
            if (access$getBuyersInformationHeader$p != null) {
                access$getBuyersInformationHeader$p.scrollInformation(recyclerView.computeVerticalScrollOffset(), P0 == 0);
            }
        }
    }

    private final boolean getBuyersInformationHeaderIsEnabled() {
        return ((Boolean) this.buyersInformationHeaderIsEnabled$delegate.getValue()).booleanValue();
    }

    private final CollectionTitleView getCollectionTitleView() {
        return (CollectionTitleView) this.collectionTitleView$delegate.getValue();
    }

    private final Drawable getDrawable(int i, int i2) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        Object obj = C8184a.f17966a;
        Drawable b = C8184a.C8187c.m16466b(context, i);
        if (b == null) {
            return null;
        }
        b.setTint(C13350a.m21013d(context, i2));
        return b;
    }

    private final StateListDrawable getStateListDrawable(int i, int i2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (getContext() != null) {
            stateListDrawable.addState(new int[]{16842913}, getDrawable(i, R.attr.clg_color_text_primary));
            stateListDrawable.addState(new int[]{-16842913}, getDrawable(i2, R.attr.clg_color_text_tertiary));
        }
        return stateListDrawable;
    }

    private final String getSuggestionTabTitle() {
        String string = getResources().getString(this.showSuggestions ? R.string.picked_for_you : R.string.recs_suggested);
        C19383o.m32796f(string, "resources.getString(\n   …\n            },\n        )");
        return string;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getCollection();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isFavorites() {
        /*
            r2 = this;
            com.etsy.android.lib.models.UserCollection r0 = r2.userCollection
            if (r0 == 0) goto L_0x000f
            com.etsy.android.lib.models.apiv3.Collection r0 = r0.getCollection()
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = r0.getType()
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            java.lang.String r1 = "favorites"
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.recommendations.CollectionContainerFragment.isFavorites():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getCollection();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isYou() {
        /*
            r6 = this;
            com.etsy.android.lib.models.UserCollection r0 = r6.userCollection
            if (r0 == 0) goto L_0x000f
            com.etsy.android.lib.models.apiv3.Collection r0 = r0.getCollection()
            if (r0 == 0) goto L_0x000f
            java.lang.Long r0 = r0.getCreatorId()
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            q9.p r1 = r6.getSession()
            com.etsy.android.lib.models.datatypes.EtsyId r1 = r1.mo45959d()
            r2 = 0
            if (r1 == 0) goto L_0x0021
            long r4 = r1.getIdAsLongDeprecated()
            goto L_0x0022
        L_0x0021:
            r4 = r2
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x0033
        L_0x0025:
            long r0 = r0.longValue()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0033
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.recommendations.CollectionContainerFragment.isYou():boolean");
    }

    private final void setUpCollectionTitleView() {
        CollectionTitleView collectionTitleView = getCollectionTitleView();
        if (collectionTitleView != null && isYou()) {
            collectionTitleView.setOnMenuClickListener(new CollectionContainerFragment$setUpCollectionTitleView$1$1(this));
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            AppBarHelper appBarHelper = ((BaseActivity) activity).getAppBarHelper();
            appBarHelper.setHomeAsUpEnabled(true);
            appBarHelper.removeCustomTitleView();
            appBarHelper.setCustomTitleView((View) getCollectionTitleView());
        }
    }

    private final boolean shouldShowSuggestions() {
        return isFavorites() ? (getConfigMap().mo21132b(C8592b.C8598f.f18873c) && requireArguments().getBoolean(SHOW_SUGGESTIONS, true)) || getRecommendationsOnFavoritesEligibility().f21801a.mo21132b(C8592b.C8593a.f18852b) : requireArguments().getBoolean(SHOW_SUGGESTIONS, true);
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

    public final C9792b getCollectionHeaderEligibility() {
        C9792b bVar = this.collectionHeaderEligibility;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("collectionHeaderEligibility");
        throw null;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getCollectionKey() {
        return this.collectionKey;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public String getFragmentTitleString() {
        Collection collection;
        String str = null;
        if (getBuyersInformationHeaderIsEnabled()) {
            return null;
        }
        UserCollection userCollection2 = this.userCollection;
        if (!(userCollection2 == null || (collection = userCollection2.getCollection()) == null)) {
            str = collection.getName();
        }
        if (str != null) {
            return str;
        }
        String string = getString(R.string.collection_app_bar_title);
        C19383o.m32796f(string, "getString(R.string.collection_app_bar_title)");
        return string;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C9871a getPresenter() {
        C9871a aVar = this.presenter;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public final C9875e getRecommendationsOnFavoritesEligibility() {
        C9875e eVar = this.recommendationsOnFavoritesEligibility;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("recommendationsOnFavoritesEligibility");
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

    public final String getSlug() {
        return this.slug;
    }

    public final C9899x getTabsWithIconsEligibility() {
        C9899x xVar = this.tabsWithIconsEligibility;
        if (xVar != null) {
            return xVar;
        }
        C19383o.m32805o("tabsWithIconsEligibility");
        throw null;
    }

    public String getTrackingName() {
        return "lists_suggestions";
    }

    public final UserCollection getUserCollection() {
        return this.userCollection;
    }

    public final String getUserId() {
        return this.userId;
    }

    public List<C9873c> loadTabData() {
        C9873c cVar = new C9873c(getResources().getString(R.string.recs_saved), getStateListDrawable(R.drawable.clg_icon_core_heart_fill_v1, R.drawable.clg_icon_core_heart_v1), (C9895t) getCollectionTitleView());
        if (!this.showSuggestions) {
            return C17782b.m29864d0(cVar);
        }
        return C17782b.m29865e0(cVar, new C9873c(getSuggestionTabTitle(), getStateListDrawable(R.drawable.clg_icon_core_sparklingheart, R.drawable.clg_icon_core_sparklingheart), 4));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_collection_container, viewGroup, false);
        this.viewPager = (ToggleableSwipeViewPager) inflate.findViewById(R.id.toggleableSwipeViewPager);
        Context context = getContext();
        if (context != null) {
            this.buyersInformationHeader = new BuyersInformationHeader(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }
        Parcelable parcelable = requireArguments().getParcelable(Collection.TYPE_COLLECTION);
        Collection collection = null;
        this.userCollection = parcelable instanceof UserCollection ? (UserCollection) parcelable : null;
        this.showSuggestions = shouldShowSuggestions();
        UserCollection userCollection2 = this.userCollection;
        if (userCollection2 != null) {
            collection = userCollection2.getCollection();
        }
        if (collection == null) {
            this.collectionKey = requireArguments().getString(ListRecommendationsFragment.COLLECTION_KEY);
            this.count = requireArguments().getInt(ResponseConstants.COUNT);
            this.collectionId = requireArguments().getString(ListRecommendationsFragment.COLLECTION_KEY);
        }
        this.showSuggestionsFirst = requireArguments().getBoolean(SHOW_SUGGESTIONS_TAB_FIRST, false);
        this.slug = requireArguments().getString("slug");
        this.userId = requireArguments().getString(ResponseConstants.USERNAME);
        this.deepLink = requireArguments().getString("deepLink");
        return inflate;
    }

    public void onDestroyView() {
        this.viewPager = null;
        this.tabsPagerAdapter = null;
        C9871a presenter2 = getPresenter();
        presenter2.f21785e = null;
        presenter2.f21786f = null;
        presenter2.f21787g.mo19405d();
        super.onDestroyView();
    }

    public void onStart() {
        setUpCollectionHeader();
        setUpTabs();
        super.onStart();
    }

    public void onStop() {
        FragmentActivity activity = getActivity();
        C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.BaseActivity");
        ((BaseActivity) activity).getAppBarHelper().removeViewBelowAppBar(this.buyersInformationHeader, !this.animateHeader);
        FragmentActivity activity2 = getActivity();
        C19383o.m32795e(activity2, "null cannot be cast to non-null type com.etsy.android.uikit.BaseActivity");
        ((BaseActivity) activity2).getAppBarHelper().removeCustomTitleView();
        super.onStop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = (r1 = r1.getCollection()).getCreator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            super.onViewCreated(r7, r8)
            com.etsy.android.ui.favorites.recommendations.a r7 = r6.getPresenter()
            com.etsy.android.uikit.view.ToggleableSwipeViewPager r8 = r6.viewPager
            java.lang.String r0 = "null cannot be cast to non-null type com.etsy.android.uikit.view.ToggleableSwipeViewPager"
            kotlin.jvm.internal.C19383o.m32795e(r8, r0)
            boolean r0 = r6.getBuyersInformationHeaderIsEnabled()
            com.etsy.android.lib.models.UserCollection r1 = r6.userCollection
            r2 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.String r1 = r1.getDisplayName()
            if (r1 != 0) goto L_0x0038
        L_0x0022:
            com.etsy.android.lib.models.UserCollection r1 = r6.userCollection
            if (r1 == 0) goto L_0x0037
            com.etsy.android.lib.models.apiv3.Collection r1 = r1.getCollection()
            if (r1 == 0) goto L_0x0037
            com.etsy.android.lib.models.User r1 = r1.getCreator()
            if (r1 == 0) goto L_0x0037
            java.lang.String r1 = r1.getRealOrLoginName()
            goto L_0x0038
        L_0x0037:
            r1 = r2
        L_0x0038:
            com.etsy.android.lib.models.UserCollection r3 = r6.userCollection
            if (r3 == 0) goto L_0x0042
            java.lang.String r3 = r3.getAvatar()
            if (r3 != 0) goto L_0x0057
        L_0x0042:
            com.etsy.android.lib.models.UserCollection r3 = r6.userCollection
            if (r3 == 0) goto L_0x0056
            com.etsy.android.lib.models.apiv3.Collection r3 = r3.getCollection()
            if (r3 == 0) goto L_0x0056
            com.etsy.android.lib.models.User r3 = r3.getCreator()
            if (r3 == 0) goto L_0x0056
            java.lang.String r2 = r3.getAvatarUrl()
        L_0x0056:
            r3 = r2
        L_0x0057:
            com.etsy.android.lib.models.UserCollection r2 = r6.userCollection
            if (r2 == 0) goto L_0x0073
            com.etsy.android.lib.models.apiv3.Collection r2 = r2.getCollection()
            if (r2 == 0) goto L_0x0073
            com.etsy.android.lib.models.User r2 = r2.getCreator()
            if (r2 == 0) goto L_0x0073
            com.etsy.android.lib.models.datatypes.EtsyId r2 = r2.getUserId()
            if (r2 == 0) goto L_0x0073
            java.lang.String r2 = r2.getId()
            if (r2 != 0) goto L_0x0075
        L_0x0073:
            java.lang.String r2 = r6.userId
        L_0x0075:
            r7.getClass()
            r7.f21785e = r6
            r7.f21786f = r8
            r7.f21788h = r0
            r6.setUpPagerAdapter()
            boolean r8 = r7.f21788h
            if (r8 == 0) goto L_0x00f0
            boolean r8 = p628nj.C18263b.m30839d0(r1)
            if (r8 == 0) goto L_0x0097
            java.lang.String r8 = com.etsy.android.p327ui.favorites.recommendations.C9871a.m18104a(r7, r3, r1)
            com.etsy.android.ui.favorites.recommendations.b r0 = r7.f21785e
            if (r0 == 0) goto L_0x00f0
            r0.setUpBuyersInformation(r8, r3)
            goto L_0x00f0
        L_0x0097:
            com.etsy.android.lib.models.datatypes.EtsyId r8 = new com.etsy.android.lib.models.datatypes.EtsyId
            r8.<init>((java.lang.String) r2)
            ze.b r0 = r7.f21783c
            ze.c r1 = r0.f30703a
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r8
            java.lang.String r8 = "/etsyapps/v3/bespoke/member/users/%s/profile-page"
            java.lang.String r5 = "format(format, *args)"
            java.lang.String r8 = androidx.compose.animation.C0388a.m1049e(r3, r2, r8, r5)
            java.lang.String r2 = java.lang.String.valueOf(r4)
            tp.s r8 = r1.mo46780a(r8, r2)
            com.etsy.android.shophome.i r1 = new com.etsy.android.shophome.i
            r2 = 4
            r1.<init>(r0, r2)
            r8.getClass()
            io.reactivex.internal.operators.single.j r2 = new io.reactivex.internal.operators.single.j
            r2.<init>(r8, r1)
            ba.a r8 = new ba.a
            r1 = 3
            r8.<init>(r0, r1)
            io.reactivex.internal.operators.single.l r0 = new io.reactivex.internal.operators.single.l
            r0.<init>(r2, r8)
            ua.f r8 = r7.f21784d
            io.reactivex.internal.operators.single.SingleSubscribeOn r8 = androidx.compose.animation.C0472h.m1243e(r8, r0)
            ua.f r0 = r7.f21784d
            io.reactivex.internal.operators.single.SingleObserveOn r8 = androidx.compose.animation.C0391c.m1056b(r0, r8)
            com.etsy.android.ui.favorites.recommendations.CollectionContainerPresenter$getBuyersInformation$1 r0 = com.etsy.android.p327ui.favorites.recommendations.CollectionContainerPresenter$getBuyersInformation$1.INSTANCE
            com.etsy.android.ui.favorites.recommendations.CollectionContainerPresenter$getBuyersInformation$2 r1 = new com.etsy.android.ui.favorites.recommendations.CollectionContainerPresenter$getBuyersInformation$2
            r1.<init>(r7)
            io.reactivex.internal.observers.ConsumerSingleObserver r8 = p145io.reactivex.rxkotlin.SubscribersKt.m32500e(r8, r0, r1)
            io.reactivex.disposables.a r0 = r7.f21787g
            java.lang.String r1 = "compositeDisposable"
            kotlin.jvm.internal.C19383o.m32798h(r0, r1)
            r0.mo19403b(r8)
        L_0x00f0:
            com.etsy.android.uikit.view.ToggleableSwipeViewPager r8 = r7.f21786f
            if (r8 == 0) goto L_0x0101
            com.etsy.android.ui.favorites.recommendations.CollectionContainerPresenter$setUpPagerListener$1 r0 = new com.etsy.android.ui.favorites.recommendations.CollectionContainerPresenter$setUpPagerListener$1
            r0.<init>(r7)
            f9.b r7 = new f9.b
            r7.<init>(r0)
            r8.addOnPageChangeListener(r7)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.recommendations.CollectionContainerFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void setCollectionHeaderEligibility(C9792b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.collectionHeaderEligibility = bVar;
    }

    public final void setCollectionId(String str) {
        this.collectionId = str;
    }

    public final void setCollectionKey(String str) {
        this.collectionKey = str;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setDeepLink(String str) {
        this.deepLink = str;
    }

    public final void setPresenter(C9871a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.presenter = aVar;
    }

    public final void setRecommendationsOnFavoritesEligibility(C9875e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.recommendationsOnFavoritesEligibility = eVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setSlug(String str) {
        this.slug = str;
    }

    public final void setTabsWithIconsEligibility(C9899x xVar) {
        C19383o.m32797g(xVar, "<set-?>");
        this.tabsWithIconsEligibility = xVar;
    }

    public void setUpBuyersInformation(String str, String str2) {
        C19383o.m32797g(str, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        BuyersInformationHeader buyersInformationHeader2 = this.buyersInformationHeader;
        if (buyersInformationHeader2 != null) {
            ViewExtensions.m12869m(buyersInformationHeader2);
            buyersInformationHeader2.setInformation(str, str2);
        }
    }

    public void setUpCollectionHeader() {
        FragmentActivity activity = getActivity();
        C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.BaseActivity");
        ((BaseActivity) activity).getAppBarHelper().addViewBelowAppBar((View) this.buyersInformationHeader, this.animateHeader);
        if (getBuyersInformationHeaderIsEnabled()) {
            setUpCollectionTitleView();
        }
    }

    public void setUpPagerAdapter() {
        if (this.tabsPagerAdapter == null) {
            C19285c<String> cVar = Referrer.f19131c;
            String c = Referrer.C8712a.m17143c(getArguments());
            FragmentManager childFragmentManager = getChildFragmentManager();
            C19383o.m32796f(childFragmentManager, "childFragmentManager");
            List<C9873c> loadTabData = loadTabData();
            UserCollection userCollection2 = this.userCollection;
            this.tabsPagerAdapter = new C9874d(c, childFragmentManager, loadTabData, userCollection2 != null ? userCollection2.getCollection() : null, this.collectionKey, this.slug, this.count, this.collectionId, this.onScrollListener, this.userId, this.deepLink);
        }
        ToggleableSwipeViewPager toggleableSwipeViewPager = this.viewPager;
        if (toggleableSwipeViewPager != null) {
            toggleableSwipeViewPager.setAdapter(this.tabsPagerAdapter);
        }
    }

    public void setUpTabs() {
        ToggleableSwipeViewPager toggleableSwipeViewPager;
        ToggleableSwipeViewPager toggleableSwipeViewPager2;
        List<C9873c> list;
        if (this.showSuggestions && (toggleableSwipeViewPager2 = this.viewPager) != null) {
            if (getBuyersInformationHeaderIsEnabled()) {
                BuyersInformationHeader buyersInformationHeader2 = this.buyersInformationHeader;
                if (buyersInformationHeader2 != null) {
                    buyersInformationHeader2.setupWithViewPager(toggleableSwipeViewPager2);
                }
            } else {
                FragmentActivity activity = getActivity();
                C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.AppBarHelperAssistant");
                CollageTabLayout tabLayout = ((C12792a) activity).getTabLayout();
                tabLayout.setTabMode(1);
                tabLayout.setBadgeStyle(CollageTabLayout.BadgeStyle.Icon);
                tabLayout.setupWithViewPager(toggleableSwipeViewPager2);
                if (C19383o.m32792b(getTabsWithIconsEligibility().f21838a.mo21136f(C8592b.C8593a.f18851a), "on")) {
                    C9874d dVar = this.tabsPagerAdapter;
                    if (!(dVar == null || (list = dVar.f21792k) == null)) {
                        int i = 0;
                        for (T next : list) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                tabLayout.setTabBadgeIcon(i, ((C9873c) next).f21790b);
                                i = i2;
                            } else {
                                C17782b.m29877o0();
                                throw null;
                            }
                        }
                    }
                    tabLayout.setSelectedTabIndicatorColor(tabLayout.getContext().getColor(R.color.clg_color_orange));
                }
            }
        }
        if (this.showSuggestionsFirst && (toggleableSwipeViewPager = this.viewPager) != null) {
            toggleableSwipeViewPager.setCurrentItem(1, false);
        }
    }

    public final void setUserCollection(UserCollection userCollection2) {
        this.userCollection = userCollection2;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }
}
