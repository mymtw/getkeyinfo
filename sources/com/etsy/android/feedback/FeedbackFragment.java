package com.etsy.android.feedback;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import androidx.lifecycle.C2895z;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.FeedbackViewModel;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.Shop;
import com.etsy.android.lib.models.apiv3.ShopIcon;
import com.etsy.android.lib.models.apiv3.listing.ReviewImage;
import com.etsy.android.lib.models.apiv3.listing.Reviews;
import com.etsy.android.lib.models.apiv3.listing.ShopHighlight;
import com.etsy.android.lib.models.apiv3.listing.ShopRating;
import com.etsy.android.lib.models.apiv3.listing.Subratings;
import com.etsy.android.lib.models.apiv3.listing.extensions.ListingFetchExtensionsKt;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.toolbar.C8860a;
import com.etsy.android.lib.util.C8915n;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.C10674m0;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.common.listingreview.ShopSubratingsView;
import com.etsy.android.p327ui.common.listingreview.itemview.C9444a;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingReviewNavigationKey;
import com.etsy.android.p327ui.shop.C11132b1;
import com.etsy.android.p327ui.shop.C11139d0;
import com.etsy.android.p327ui.shop.C11201t;
import com.etsy.android.p327ui.shop.C11307x0;
import com.etsy.android.p327ui.shop.C11309y0;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.uikit.EndlessRecyclerViewListFragment;
import com.etsy.android.uikit.adapter.C11829a;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.uikit.nav.transactions.TransactionViewModel;
import com.etsy.android.uikit.viewholder.ItemDividerDecoration;
import com.etsy.android.util.C12059p;
import com.google.android.play.core.appupdate.C15562d;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import okhttp3.C19928a0;
import p001a0.C0005b;
import p003a2.C0015b;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p260v0.C8184a;
import p321cc.C8569c;
import p356ge.C12788a;
import p356ge.C12790b;
import p425q9.C13262m;
import p425q9.C13265p;
import p440s9.C13366a;
import p456ua.C13461f;
import p486y9.C13888d;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19846a;
import retrofit2.C20145v;

public final class FeedbackFragment extends EndlessRecyclerViewListFragment<ReviewUiModel> implements C9444a, C9731e0.C9732a, C10674m0.C10675a, C2843a0<FeedbackViewModel.C6440b>, C13366a {
    public static final int $stable = 8;
    public static final C6436a Companion = new C6436a();
    public static final String EXTRA_FEEDBACK_UI_DATA = "feedback-ui-data";
    private static final String OFFSET = "offset";
    private static final String REVIEW = "review";
    private static final String REVIEW_COUNT = "review_count";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C13888d currentLocale;
    private LiveData<FeedbackViewModel.C6440b> data;
    private final C7091a disposables = new C7091a();
    private FeedbackUiData feedbackData;
    public C8569c listingRepository;
    public NumberFormat numberFormat;
    private C19846a<C19394m> onSeeShopReviewsClicked;
    public C11786n resourceProvider;
    public C6473r reviewsEligibility;
    public C11201t reviewsTranslationRepository;
    public C13461f rxSchedulers;
    public C13265p session;
    private Shop shop;
    public C11139d0 shopHomeEligibility;
    private Long shopId;
    public C11309y0 shopInfoRepository;
    public C11132b1 shopReviewsRepository;
    private TransactionViewModel<C11869a> transactionViewModel;
    public C8923u translationHelper;
    private FeedbackViewModel viewModel;

    /* renamed from: com.etsy.android.feedback.FeedbackFragment$a */
    public static final class C6436a {
    }

    /* renamed from: com.etsy.android.feedback.FeedbackFragment$b */
    public /* synthetic */ class C6437b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14263a;

        static {
            int[] iArr = new int[ShopHighlight.Icon.values().length];
            iArr[ShopHighlight.Icon.Gift.ordinal()] = 1;
            iArr[ShopHighlight.Icon.RecentReview.ordinal()] = 2;
            iArr[ShopHighlight.Icon.None.ordinal()] = 3;
            f14263a = iArr;
        }
    }

    private final View buildEmptyView(ViewGroup viewGroup, Subratings subratings, ShopHighlight shopHighlight) {
        Integer num;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_reviews_shop_highlight, viewGroup, false);
        ShopSubratingsView shopSubratingsView = (ShopSubratingsView) inflate.findViewById(R.id.review_shop_subratings);
        if (subratings == null || subratings.isEmpty()) {
            ViewExtensions.m12860d(shopSubratingsView);
        } else {
            shopSubratingsView.setSubratings(subratings);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(R.id.review_shop_highlight);
        if (shopHighlight == null) {
            ViewExtensions.m12860d(appCompatTextView);
        } else {
            appCompatTextView.setText(C18263b.m30867s0(shopHighlight.getText()));
            int i = C6437b.f14263a[shopHighlight.getIcon().ordinal()];
            if (i == 1) {
                num = Integer.valueOf(R.drawable.clg_icon_core_gift_v1);
            } else if (i == 2) {
                num = Integer.valueOf(R.drawable.clg_icon_core_recentreview_v1);
            } else if (i == 3) {
                num = null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (num != null) {
                appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(num.intValue(), 0, 0, 0);
            }
        }
        View findViewById = inflate.findViewById(R.id.review_see_shop_reviews);
        C19383o.m32796f(findViewById, "view.findViewById<TextVi….review_see_shop_reviews)");
        ViewExtensions.m12866j(findViewById, new FeedbackFragment$buildEmptyView$2(this));
        return inflate;
    }

    private final Integer findReview(Long l) {
        if (l == null) {
            return null;
        }
        List<T> items = this.adapter.getItems();
        C19383o.m32796f(items, "adapter.items");
        int i = 0;
        for (T next : items) {
            int i2 = i + 1;
            if (i >= 0) {
                ReviewUiModel reviewUiModel = (ReviewUiModel) next;
                if (C19383o.m32792b(l, reviewUiModel != null ? reviewUiModel.getTransactionId() : null)) {
                    return Integer.valueOf(this.adapter.getHeaderCount() + i);
                }
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void handleContactShopVisibilityChanged(Boolean bool) {
        requireActivity().invalidateOptionsMenu();
    }

    /* access modifiers changed from: private */
    public final void handleEvent(C12059p<FeedbackViewModel.C6438a> pVar) {
        FeedbackViewModel.C6438a a;
        if (pVar != null && (a = pVar.mo38935a()) != null && (a instanceof FeedbackViewModel.C6438a.C6439a)) {
            navigateToConvoCompose((FeedbackViewModel.C6438a.C6439a) a);
        }
    }

    private final void navigateToConvoCompose(FeedbackViewModel.C6438a.C6439a aVar) {
        C12790b.m20430b(this, new ConversationComposeNavigationKey(C19421p.m32935c0(requireActivity()), getSession().mo45960e(), aVar.f14286a, aVar.f14287b, aVar.f14288c, aVar.f14289d, aVar.f14290e, false, (Bundle) null, 384, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public final void onReviewCarouselImageClicked(int i) {
        List<ReviewImage> reviewImages;
        FeedbackUiData feedbackUiData = this.feedbackData;
        if (feedbackUiData != null && (reviewImages = feedbackUiData.getReviewImages()) != null) {
            FragmentActivity activity = getActivity();
            ListingReviewNavigationKey.C10703a aVar = ListingReviewNavigationKey.Companion;
            boolean b = getConfigMap().mo21132b(C8592b.f18847y1);
            String c0 = C19421p.m32935c0(getActivity());
            List<com.etsy.android.lib.models.ReviewImage> v2 = ListingFetchExtensionsKt.toV2(reviewImages);
            aVar.getClass();
            C12788a.m20424c(activity, ListingReviewNavigationKey.C10703a.m18610a(b, c0, v2, i));
        }
    }

    private final void setShopInfo(Shop shop2) {
        this.shop = shop2;
        C11829a<T> aVar = this.adapter;
        C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.feedback.FeedbackReviewsAdapter");
        C6459d dVar = (C6459d) aVar;
        String shopName = shop2.getShopName();
        C19383o.m32796f(shopName, "shop.shopName");
        ShopIcon shopIcon = shop2.getShopIcon();
        FeedbackUiData feedbackUiData = this.feedbackData;
        ShopRating shopRating = feedbackUiData != null ? feedbackUiData.getShopRating() : null;
        dVar.f14320i = shopName;
        dVar.f14321j = shopIcon;
        dVar.f14322k = shopRating;
        dVar.mo18485j();
        int i = C8860a.f19556m;
        String shopName2 = shop2.getShopName();
        if (C8860a.C8861a.m17264a()) {
            C8860a aVar2 = C8860a.f19558o;
            C19383o.m32794d(aVar2);
            String d = C8915n.m17352d(ResponseConstants.SHOP, shopName2, ResponseConstants.REVIEWS);
            C19383o.m32796f(d, "createWebLinkForCurrentE…EWS\n                    )");
            aVar2.f19566g = d;
        }
        FeedbackViewModel feedbackViewModel = this.viewModel;
        if (feedbackViewModel != null) {
            feedbackViewModel.f14279q = shop2;
        }
    }

    private final void updateReview(ReviewUiModel reviewUiModel) {
        C11829a<T> aVar = this.adapter;
        C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.feedback.FeedbackReviewsAdapter");
        C6459d dVar = (C6459d) aVar;
        C19383o.m32797g(reviewUiModel, "review");
        List items = dVar.getItems();
        C19383o.m32796f(items, ResponseConstants.ITEMS);
        Iterator it = items.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C19383o.m32792b(((ReviewUiModel) it.next()).getTransactionId(), reviewUiModel.getTransactionId())) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            dVar.getItems().set(i, reviewUiModel);
            dVar.notifyItemChanged(dVar.getHeaderCount() + i);
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

    public String getFragmentTitleString() {
        FeedbackUiData feedbackUiData = this.feedbackData;
        if (feedbackUiData != null) {
            int shopReviewCount = feedbackUiData.getShopReviewCount();
            ShopRating shopRating = feedbackUiData.getShopRating();
            Subratings subratings = shopRating != null ? shopRating.getSubratings() : null;
            if (shopReviewCount == 0) {
                String string = getResources().getString(R.string.reviews);
                C19383o.m32796f(string, "{\n                resour…ng.reviews)\n            }");
                return string;
            }
            String string2 = (!(subratings != null && !subratings.isEmpty()) || !getShopHomeEligibility().f24633a.mo21132b(C8592b.C8607o.f18914a)) ? getResources().getString(R.string.reviews_with_count, new Object[]{NumberFormat.getNumberInstance(Locale.getDefault()).format(Integer.valueOf(shopReviewCount))}) : getResources().getString(R.string.item_reviews);
            C19383o.m32796f(string2, "{\n                val ha…          }\n            }");
            return string2;
        }
        String string3 = getResources().getString(R.string.item_reviews);
        C19383o.m32796f(string3, "resources.getString(R.string.item_reviews)");
        return string3;
    }

    public int getLayoutId() {
        return R.layout.fragment_baserecyclerview;
    }

    public final C8569c getListingRepository() {
        C8569c cVar = this.listingRepository;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("listingRepository");
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

    public final C19846a<C19394m> getOnSeeShopReviewsClicked() {
        return this.onSeeShopReviewsClicked;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C11786n getResourceProvider() {
        C11786n nVar = this.resourceProvider;
        if (nVar != null) {
            return nVar;
        }
        C19383o.m32805o("resourceProvider");
        throw null;
    }

    public final C6473r getReviewsEligibility() {
        C6473r rVar = this.reviewsEligibility;
        if (rVar != null) {
            return rVar;
        }
        C19383o.m32805o("reviewsEligibility");
        throw null;
    }

    public final C11201t getReviewsTranslationRepository() {
        C11201t tVar = this.reviewsTranslationRepository;
        if (tVar != null) {
            return tVar;
        }
        C19383o.m32805o("reviewsTranslationRepository");
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

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public final C11139d0 getShopHomeEligibility() {
        C11139d0 d0Var = this.shopHomeEligibility;
        if (d0Var != null) {
            return d0Var;
        }
        C19383o.m32805o("shopHomeEligibility");
        throw null;
    }

    public final C11309y0 getShopInfoRepository() {
        C11309y0 y0Var = this.shopInfoRepository;
        if (y0Var != null) {
            return y0Var;
        }
        C19383o.m32805o("shopInfoRepository");
        throw null;
    }

    public final C11132b1 getShopReviewsRepository() {
        C11132b1 b1Var = this.shopReviewsRepository;
        if (b1Var != null) {
            return b1Var;
        }
        C19383o.m32805o("shopReviewsRepository");
        throw null;
    }

    public String getTrackingName() {
        return "shop_reviews";
    }

    public final C8923u getTranslationHelper() {
        C8923u uVar = this.translationHelper;
        if (uVar != null) {
            return uVar;
        }
        C19383o.m32805o("translationHelper");
        throw null;
    }

    public void onAppreciationPhotoClicked(ReviewUiModel reviewUiModel) {
        C19383o.m32797g(reviewUiModel, "review");
        com.etsy.android.lib.models.ReviewImage M = C0005b.m19M(reviewUiModel, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(M);
        FragmentActivity activity = getActivity();
        ListingReviewNavigationKey.C10703a aVar = ListingReviewNavigationKey.Companion;
        boolean b = getConfigMap().mo21132b(C8592b.f18847y1);
        String c0 = C19421p.m32935c0(getActivity());
        aVar.getClass();
        C12788a.m20424c(activity, ListingReviewNavigationKey.C10703a.m18610a(b, c0, arrayList, 0));
    }

    public void onCreate(Bundle bundle) {
        Reviews.ReviewType reviewType;
        Bundle arguments;
        int i;
        super.onCreate(bundle);
        if (!(bundle != null || (arguments = getArguments()) == null || (i = arguments.getInt("transaction-data", -1)) == -1)) {
            C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
            FeedbackUiData feedbackUiData = (FeedbackUiData) TransactionDataRepository.C11867a.m19552a().mo38342a(i);
            this.feedbackData = feedbackUiData;
            if (feedbackUiData != null) {
                this.shopId = Long.valueOf(feedbackUiData.getShopId());
            }
        }
        Bundle arguments2 = getArguments();
        TransactionViewModel<C11869a> X = C18263b.m30829X(this, new C11869a());
        this.transactionViewModel = X;
        C11869a aVar = (C11869a) X.f26405b;
        if (aVar.f26406a.containsKey(ResponseConstants.SHOP)) {
            Shop shop2 = (Shop) aVar.mo38345b(ResponseConstants.SHOP);
            this.shop = shop2;
            C19383o.m32794d(shop2);
            this.shopId = Long.valueOf(shop2.getShopId().getIdAsLong());
        } else if (arguments2 != null && arguments2.containsKey("shop_id")) {
            this.shopId = C15562d.m25174L(arguments2);
        } else if (bundle != null && bundle.containsKey("shop_id")) {
            this.shopId = C15562d.m25174L(bundle);
        }
        if (this.shopId == null) {
            this.shopId = 0L;
            LogCatKt.m17045a().mo21313g("Attempted to launch/resume FeedbackFragment with a null shopId");
            C12788a.m20426e(getActivity());
        }
        if (aVar.f26406a.containsKey(EXTRA_FEEDBACK_UI_DATA)) {
            this.feedbackData = (FeedbackUiData) aVar.mo38345b(EXTRA_FEEDBACK_UI_DATA);
        }
        FeedbackUiData feedbackUiData2 = this.feedbackData;
        Integer num = null;
        this.adapter = new C6459d(getActivity(), getTranslationHelper(), feedbackUiData2 != null ? feedbackUiData2.getReviewImages() : null, this, getNumberFormat(), getShopHomeEligibility(), new FeedbackFragment$onCreate$2(this));
        if (aVar.f26406a.containsKey(REVIEW_COUNT)) {
            int d = aVar.mo38347d(REVIEW_COUNT, 0);
            for (int i2 = 0; i2 < d; i2++) {
                this.adapter.addItem((ReviewUiModel) aVar.mo38345b("review" + i2));
            }
            setApiOffset(aVar.mo38347d(OFFSET, 0));
        }
        FeedbackUiData feedbackUiData3 = this.feedbackData;
        if (feedbackUiData3 == null || (reviewType = feedbackUiData3.getReviewType()) == null) {
            reviewType = Reviews.ReviewType.SHOP;
        }
        Reviews.ReviewType reviewType2 = reviewType;
        String valueOf = String.valueOf(this.shopId);
        FeedbackUiData feedbackUiData4 = this.feedbackData;
        Long shopOwnerId = feedbackUiData4 != null ? feedbackUiData4.getShopOwnerId() : null;
        FeedbackUiData feedbackUiData5 = this.feedbackData;
        String shopName = feedbackUiData5 != null ? feedbackUiData5.getShopName() : null;
        FeedbackUiData feedbackUiData6 = this.feedbackData;
        String shopLoginName = feedbackUiData6 != null ? feedbackUiData6.getShopLoginName() : null;
        FeedbackUiData feedbackUiData7 = this.feedbackData;
        String shopDisplayName = feedbackUiData7 != null ? feedbackUiData7.getShopDisplayName() : null;
        FeedbackUiData feedbackUiData8 = this.feedbackData;
        if (feedbackUiData8 != null) {
            num = Integer.valueOf(feedbackUiData8.getShopReviewCount());
        }
        this.viewModel = (FeedbackViewModel) new C2870k0((C2880m0) this, (C2870k0.C2872b) new C6463h(new C6462g(reviewType2, (Long) null, (String) null, (String) null, valueOf, shopOwnerId, shopName, shopLoginName, shopDisplayName, num), getListingRepository(), getShopInfoRepository(), getShopReviewsRepository(), getReviewsTranslationRepository(), getCurrentLocale(), getSession(), getRxSchedulers(), false, getReviewsEligibility(), getResourceProvider())).mo10829a(FeedbackViewModel.class);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C19383o.m32797g(menu, "menu");
        C19383o.m32797g(menuInflater, "inflater");
        menuInflater.inflate(R.menu.menu_shop_home_all_reviews, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0021, code lost:
        r5 = r5.getShopRating();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            android.view.View r3 = super.onCreateView(r3, r4, r5)
            java.lang.String r4 = "super.onCreateView(infla…iner, savedInstanceState)"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            com.etsy.android.uikit.adapter.a<T> r4 = r2.adapter
            java.lang.String r5 = "null cannot be cast to non-null type com.etsy.android.uikit.adapter.EndlessRecyclerViewAdapter<com.etsy.android.feedback.ReviewUiModel?>"
            kotlin.jvm.internal.C19383o.m32795e(r4, r5)
            com.etsy.android.uikit.adapter.c r4 = (com.etsy.android.uikit.adapter.C11832c) r4
            r4.f26308b = r2
            r4 = r3
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            com.etsy.android.feedback.FeedbackFragment$FeedbackUiData r5 = r2.feedbackData
            r0 = 0
            if (r5 == 0) goto L_0x002c
            com.etsy.android.lib.models.apiv3.listing.ShopRating r5 = r5.getShopRating()
            if (r5 == 0) goto L_0x002c
            com.etsy.android.lib.models.apiv3.listing.Subratings r5 = r5.getSubratings()
            goto L_0x002d
        L_0x002c:
            r5 = r0
        L_0x002d:
            com.etsy.android.feedback.FeedbackFragment$FeedbackUiData r1 = r2.feedbackData
            if (r1 == 0) goto L_0x0035
            com.etsy.android.lib.models.apiv3.listing.ShopHighlight r0 = r1.getShopHighlight()
        L_0x0035:
            android.view.View r4 = r2.buildEmptyView(r4, r5, r0)
            r2.setEmptyView(r4)
            r2.showLoadingView()
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = r2.swipeRefreshLayout
            r5 = 1
            int[] r5 = new int[r5]
            r0 = 0
            r1 = 2131099775(0x7f06007f, float:1.7811913E38)
            r5[r0] = r1
            r4.setColorSchemeResources(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.feedback.FeedbackFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroyView() {
        this.disposables.mo19405d();
        super.onDestroyView();
    }

    public void onListingClicked(Long l) {
        if (l != null) {
            C12788a.m20424c(getActivity(), new ListingKey(C19421p.m32935c0(getActivity()), new EtsyId(l.longValue()), false, false, (Bundle) null, 28, (DefaultConstructorMarker) null));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r2 = r2.getUser();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLoadContent() {
        /*
            r5 = this;
            com.etsy.android.feedback.FeedbackViewModel r0 = r5.viewModel
            if (r0 == 0) goto L_0x0033
            int r1 = r5.getApiOffset()
            com.etsy.android.lib.models.Shop r2 = r5.shop
            r3 = 0
            if (r2 == 0) goto L_0x0018
            com.etsy.android.lib.models.User r2 = r2.getUser()
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = r2.getLoginName()
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            com.etsy.android.lib.models.Shop r4 = r5.shop
            if (r4 == 0) goto L_0x002f
            com.etsy.android.lib.models.User r4 = r4.getUser()
            if (r4 == 0) goto L_0x002f
            com.etsy.android.lib.models.UserProfile r4 = r4.getProfile()
            if (r4 == 0) goto L_0x002f
            r3 = 100
            java.lang.String r3 = r4.getAvatarUrl(r3)
        L_0x002f:
            r4 = 0
            r0.mo18346f(r2, r1, r3, r4)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.feedback.FeedbackFragment.onLoadContent():void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        if (menuItem.getItemId() != R.id.menu_contact_shop) {
            return super.onOptionsItemSelected(menuItem);
        }
        getAnalyticsContext().mo21333d("see_all_shop_reviews_contact_shop_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        FeedbackViewModel feedbackViewModel = this.viewModel;
        if (feedbackViewModel != null) {
            feedbackViewModel.mo18344c();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r0.f14285w;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPrepareOptionsMenu(android.view.Menu r2) {
        /*
            r1 = this;
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            super.onPrepareOptionsMenu(r2)
            r0 = 2131428969(0x7f0b0669, float:1.8479597E38)
            android.view.MenuItem r2 = r2.findItem(r0)
            if (r2 != 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            com.etsy.android.feedback.FeedbackViewModel r0 = r1.viewModel
            if (r0 == 0) goto L_0x0021
            androidx.lifecycle.z r0 = r0.f14285w
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 != 0) goto L_0x0026
            r0 = 0
            goto L_0x002a
        L_0x0026:
            boolean r0 = r0.booleanValue()
        L_0x002a:
            r2.setVisible(r0)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.feedback.FeedbackFragment.onPrepareOptionsMenu(android.view.Menu):void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        Long l = this.shopId;
        if (l != null) {
            bundle.putLong("shop_id", l.longValue());
        }
        TransactionViewModel<C11869a> transactionViewModel2 = this.transactionViewModel;
        C19383o.m32794d(transactionViewModel2);
        C11869a aVar = (C11869a) transactionViewModel2.f26405b;
        Shop shop2 = this.shop;
        if (shop2 != null) {
            aVar.mo38349f(ResponseConstants.SHOP, shop2);
        }
        int dataItemCount = this.adapter.getDataItemCount();
        for (int i = 0; i < dataItemCount; i++) {
            aVar.mo38349f(C0015b.m88g("review", i), this.adapter.getItem(i));
        }
        aVar.f26406a.put(REVIEW_COUNT, Integer.valueOf(this.adapter.getDataItemCount()));
        aVar.f26406a.put(OFFSET, Integer.valueOf(getApiOffset()));
        FeedbackUiData feedbackUiData = this.feedbackData;
        if (feedbackUiData != null) {
            aVar.mo38349f(EXTRA_FEEDBACK_UI_DATA, feedbackUiData);
        }
    }

    public void onTranslateReviewClicked(ReviewUiModel reviewUiModel) {
        C19383o.m32797g(reviewUiModel, "review");
        reviewUiModel.getTranslationState().setTranslating();
        Integer findReview = findReview(reviewUiModel.getTransactionId());
        if (findReview != null) {
            this.adapter.notifyItemChanged(findReview.intValue());
            FeedbackViewModel feedbackViewModel = this.viewModel;
            if (feedbackViewModel != null) {
                feedbackViewModel.mo18349i(reviewUiModel);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C2895z zVar;
        C2895z zVar2;
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        if (this.data == null) {
            FeedbackViewModel feedbackViewModel = this.viewModel;
            C2895z zVar3 = feedbackViewModel != null ? feedbackViewModel.f14276n : null;
            this.data = zVar3;
            if (zVar3 != null) {
                zVar3.observe(getViewLifecycleOwner(), this);
            }
        } else {
            showListView();
        }
        FeedbackViewModel feedbackViewModel2 = this.viewModel;
        if (!(feedbackViewModel2 == null || (zVar2 = feedbackViewModel2.f14278p) == null)) {
            zVar2.observe(getViewLifecycleOwner(), new C6456a(this, 0));
        }
        FeedbackViewModel feedbackViewModel3 = this.viewModel;
        if (!(feedbackViewModel3 == null || (zVar = feedbackViewModel3.f14285w) == null)) {
            zVar.observe(getViewLifecycleOwner(), new C6457b(this, 0));
        }
        Shop shop2 = this.shop;
        if (shop2 != null) {
            setShopInfo(shop2);
            loadContent();
        } else {
            FeedbackViewModel feedbackViewModel4 = this.viewModel;
            if (feedbackViewModel4 != null) {
                EtsyId etsyId = new EtsyId(feedbackViewModel4.f14264b.f14333e);
                feedbackViewModel4.f14270h.mo45960e();
                C11309y0 y0Var = feedbackViewModel4.f14266d;
                y0Var.getClass();
                C8071s<C20145v<C19928a0>> a = y0Var.f24961a.mo36984a(etsyId.getId(), C19294b0.m32562s0(new Pair("fields", "shop_id,shop_name,title,total_rating_count,average_rating,icon_url_fullxfull,user"), new Pair("includes", "User(user_id,login_name,display_name)/Profile(image_url_75x75)")));
                C13262m mVar = new C13262m(2);
                a.getClass();
                ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(feedbackViewModel4.f14271i, C0472h.m1243e(feedbackViewModel4.f14271i, new C19211l(new C19208j(a, mVar), new C11307x0(0)))), new FeedbackViewModel$fetchShopInfo$1(feedbackViewModel4), new FeedbackViewModel$fetchShopInfo$2(feedbackViewModel4));
                C7091a aVar = feedbackViewModel4.f14283u;
                C19383o.m32798h(aVar, "compositeDisposable");
                aVar.mo19403b(e);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.clg_space_16);
        Context requireContext = requireContext();
        Object obj = C8184a.f17966a;
        this.recyclerView.addItemDecoration(new ItemDividerDecoration(C8184a.C8187c.m16466b(requireContext, R.drawable.list_divider), dimensionPixelSize));
        setHasOptionsMenu(true);
    }

    public final void setCurrentLocale(C13888d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.currentLocale = dVar;
    }

    public final void setListingRepository(C8569c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.listingRepository = cVar;
    }

    public final void setNumberFormat(NumberFormat numberFormat2) {
        C19383o.m32797g(numberFormat2, "<set-?>");
        this.numberFormat = numberFormat2;
    }

    public final void setOnSeeShopReviewsClicked(C19846a<C19394m> aVar) {
        this.onSeeShopReviewsClicked = aVar;
    }

    public final void setResourceProvider(C11786n nVar) {
        C19383o.m32797g(nVar, "<set-?>");
        this.resourceProvider = nVar;
    }

    public final void setReviewsEligibility(C6473r rVar) {
        C19383o.m32797g(rVar, "<set-?>");
        this.reviewsEligibility = rVar;
    }

    public final void setReviewsTranslationRepository(C11201t tVar) {
        C19383o.m32797g(tVar, "<set-?>");
        this.reviewsTranslationRepository = tVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setShopHomeEligibility(C11139d0 d0Var) {
        C19383o.m32797g(d0Var, "<set-?>");
        this.shopHomeEligibility = d0Var;
    }

    public final void setShopInfoRepository(C11309y0 y0Var) {
        C19383o.m32797g(y0Var, "<set-?>");
        this.shopInfoRepository = y0Var;
    }

    public final void setShopReviewsRepository(C11132b1 b1Var) {
        C19383o.m32797g(b1Var, "<set-?>");
        this.shopReviewsRepository = b1Var;
    }

    public final void setTranslationHelper(C8923u uVar) {
        C19383o.m32797g(uVar, "<set-?>");
        this.translationHelper = uVar;
    }

    public int softInputMode() {
        return 32;
    }

    public void onChanged(FeedbackViewModel.C6440b bVar) {
        if (bVar instanceof FeedbackViewModel.C6440b.C6444d) {
            setShopInfo(((FeedbackViewModel.C6440b.C6444d) bVar).f14297a);
            loadContent();
        } else if (C19383o.m32792b(bVar, FeedbackViewModel.C6440b.C6442b.f14292a)) {
        } else {
            if (bVar instanceof FeedbackViewModel.C6440b.C6446f) {
                updateReview(((FeedbackViewModel.C6440b.C6446f) bVar).f14299a);
            } else if (bVar instanceof FeedbackViewModel.C6440b.C6447g) {
                updateReview(((FeedbackViewModel.C6440b.C6447g) bVar).f14300a);
            } else if (bVar instanceof FeedbackViewModel.C6440b.C6443c) {
                FeedbackViewModel.C6440b.C6443c cVar = (FeedbackViewModel.C6440b.C6443c) bVar;
                onLoadSuccess(cVar.f14293a, cVar.f14294b);
            } else if (C19383o.m32792b(bVar, FeedbackViewModel.C6440b.C6441a.f14291a)) {
                onLoadFailure();
            } else if (bVar == null) {
                onLoadFailure();
            } else {
                C19383o.m32792b(bVar, FeedbackViewModel.C6440b.C6445e.f14298a);
            }
        }
    }

    public static final class FeedbackUiData implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<FeedbackUiData> CREATOR = new Creator();
        private final List<ReviewImage> reviewImages;
        private final Reviews.ReviewType reviewType;
        private final String shopDisplayName;
        private final ShopHighlight shopHighlight;
        private final long shopId;
        private final String shopLoginName;
        private final String shopName;
        private final Long shopOwnerId;
        private final ShopRating shopRating;
        private final int shopReviewCount;

        public static final class Creator implements Parcelable.Creator<FeedbackUiData> {
            public final FeedbackUiData createFromParcel(Parcel parcel) {
                C19383o.m32797g(parcel, "parcel");
                Reviews.ReviewType valueOf = Reviews.ReviewType.valueOf(parcel.readString());
                long readLong = parcel.readLong();
                ArrayList arrayList = null;
                Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                ShopHighlight createFromParcel = parcel.readInt() == 0 ? null : ShopHighlight.CREATOR.createFromParcel(parcel);
                ShopRating createFromParcel2 = parcel.readInt() == 0 ? null : ShopRating.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(ReviewImage.CREATOR.createFromParcel(parcel));
                    }
                }
                return new FeedbackUiData(valueOf, readLong, valueOf2, readString, readString2, readString3, createFromParcel, createFromParcel2, arrayList, parcel.readInt());
            }

            public final FeedbackUiData[] newArray(int i) {
                return new FeedbackUiData[i];
            }
        }

        public FeedbackUiData(Reviews.ReviewType reviewType2, long j, Long l, String str, String str2, String str3, ShopHighlight shopHighlight2, ShopRating shopRating2, List<ReviewImage> list, int i) {
            C19383o.m32797g(reviewType2, "reviewType");
            this.reviewType = reviewType2;
            this.shopId = j;
            this.shopOwnerId = l;
            this.shopName = str;
            this.shopLoginName = str2;
            this.shopDisplayName = str3;
            this.shopHighlight = shopHighlight2;
            this.shopRating = shopRating2;
            this.reviewImages = list;
            this.shopReviewCount = i;
        }

        public static /* synthetic */ FeedbackUiData copy$default(FeedbackUiData feedbackUiData, Reviews.ReviewType reviewType2, long j, Long l, String str, String str2, String str3, ShopHighlight shopHighlight2, ShopRating shopRating2, List list, int i, int i2, Object obj) {
            FeedbackUiData feedbackUiData2 = feedbackUiData;
            int i3 = i2;
            return feedbackUiData.copy((i3 & 1) != 0 ? feedbackUiData2.reviewType : reviewType2, (i3 & 2) != 0 ? feedbackUiData2.shopId : j, (i3 & 4) != 0 ? feedbackUiData2.shopOwnerId : l, (i3 & 8) != 0 ? feedbackUiData2.shopName : str, (i3 & 16) != 0 ? feedbackUiData2.shopLoginName : str2, (i3 & 32) != 0 ? feedbackUiData2.shopDisplayName : str3, (i3 & 64) != 0 ? feedbackUiData2.shopHighlight : shopHighlight2, (i3 & 128) != 0 ? feedbackUiData2.shopRating : shopRating2, (i3 & 256) != 0 ? feedbackUiData2.reviewImages : list, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? feedbackUiData2.shopReviewCount : i);
        }

        public final Reviews.ReviewType component1() {
            return this.reviewType;
        }

        public final int component10() {
            return this.shopReviewCount;
        }

        public final long component2() {
            return this.shopId;
        }

        public final Long component3() {
            return this.shopOwnerId;
        }

        public final String component4() {
            return this.shopName;
        }

        public final String component5() {
            return this.shopLoginName;
        }

        public final String component6() {
            return this.shopDisplayName;
        }

        public final ShopHighlight component7() {
            return this.shopHighlight;
        }

        public final ShopRating component8() {
            return this.shopRating;
        }

        public final List<ReviewImage> component9() {
            return this.reviewImages;
        }

        public final FeedbackUiData copy(Reviews.ReviewType reviewType2, long j, Long l, String str, String str2, String str3, ShopHighlight shopHighlight2, ShopRating shopRating2, List<ReviewImage> list, int i) {
            C19383o.m32797g(reviewType2, "reviewType");
            return new FeedbackUiData(reviewType2, j, l, str, str2, str3, shopHighlight2, shopRating2, list, i);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedbackUiData)) {
                return false;
            }
            FeedbackUiData feedbackUiData = (FeedbackUiData) obj;
            return this.reviewType == feedbackUiData.reviewType && this.shopId == feedbackUiData.shopId && C19383o.m32792b(this.shopOwnerId, feedbackUiData.shopOwnerId) && C19383o.m32792b(this.shopName, feedbackUiData.shopName) && C19383o.m32792b(this.shopLoginName, feedbackUiData.shopLoginName) && C19383o.m32792b(this.shopDisplayName, feedbackUiData.shopDisplayName) && C19383o.m32792b(this.shopHighlight, feedbackUiData.shopHighlight) && C19383o.m32792b(this.shopRating, feedbackUiData.shopRating) && C19383o.m32792b(this.reviewImages, feedbackUiData.reviewImages) && this.shopReviewCount == feedbackUiData.shopReviewCount;
        }

        public final List<ReviewImage> getReviewImages() {
            return this.reviewImages;
        }

        public final Reviews.ReviewType getReviewType() {
            return this.reviewType;
        }

        public final String getShopDisplayName() {
            return this.shopDisplayName;
        }

        public final ShopHighlight getShopHighlight() {
            return this.shopHighlight;
        }

        public final long getShopId() {
            return this.shopId;
        }

        public final String getShopLoginName() {
            return this.shopLoginName;
        }

        public final String getShopName() {
            return this.shopName;
        }

        public final Long getShopOwnerId() {
            return this.shopOwnerId;
        }

        public final ShopRating getShopRating() {
            return this.shopRating;
        }

        public final int getShopReviewCount() {
            return this.shopReviewCount;
        }

        public int hashCode() {
            int b = C0071c.m190b(this.shopId, this.reviewType.hashCode() * 31, 31);
            Long l = this.shopOwnerId;
            int i = 0;
            int hashCode = (b + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.shopName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.shopLoginName;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.shopDisplayName;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ShopHighlight shopHighlight2 = this.shopHighlight;
            int hashCode5 = (hashCode4 + (shopHighlight2 == null ? 0 : shopHighlight2.hashCode())) * 31;
            ShopRating shopRating2 = this.shopRating;
            int hashCode6 = (hashCode5 + (shopRating2 == null ? 0 : shopRating2.hashCode())) * 31;
            List<ReviewImage> list = this.reviewImages;
            if (list != null) {
                i = list.hashCode();
            }
            return Integer.hashCode(this.shopReviewCount) + ((hashCode6 + i) * 31);
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("FeedbackUiData(reviewType=");
            h.append(this.reviewType);
            h.append(", shopId=");
            h.append(this.shopId);
            h.append(", shopOwnerId=");
            h.append(this.shopOwnerId);
            h.append(", shopName=");
            h.append(this.shopName);
            h.append(", shopLoginName=");
            h.append(this.shopLoginName);
            h.append(", shopDisplayName=");
            h.append(this.shopDisplayName);
            h.append(", shopHighlight=");
            h.append(this.shopHighlight);
            h.append(", shopRating=");
            h.append(this.shopRating);
            h.append(", reviewImages=");
            h.append(this.reviewImages);
            h.append(", shopReviewCount=");
            return C0073e.m208h(h, this.shopReviewCount, ')');
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19383o.m32797g(parcel, "out");
            parcel.writeString(this.reviewType.name());
            parcel.writeLong(this.shopId);
            Long l = this.shopOwnerId;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                C0069a.m180k(parcel, 1, l);
            }
            parcel.writeString(this.shopName);
            parcel.writeString(this.shopLoginName);
            parcel.writeString(this.shopDisplayName);
            ShopHighlight shopHighlight2 = this.shopHighlight;
            if (shopHighlight2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                shopHighlight2.writeToParcel(parcel, i);
            }
            ShopRating shopRating2 = this.shopRating;
            if (shopRating2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                shopRating2.writeToParcel(parcel, i);
            }
            List<ReviewImage> list = this.reviewImages;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (ReviewImage writeToParcel : list) {
                    writeToParcel.writeToParcel(parcel, i);
                }
            }
            parcel.writeInt(this.shopReviewCount);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ FeedbackUiData(com.etsy.android.lib.models.apiv3.listing.Reviews.ReviewType r16, long r17, java.lang.Long r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.etsy.android.lib.models.apiv3.listing.ShopHighlight r23, com.etsy.android.lib.models.apiv3.listing.ShopRating r24, java.util.List r25, int r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
            /*
                r15 = this;
                r0 = r27
                r1 = r0 & 64
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r11 = r2
                goto L_0x000b
            L_0x0009:
                r11 = r23
            L_0x000b:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0011
                r12 = r2
                goto L_0x0013
            L_0x0011:
                r12 = r24
            L_0x0013:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0019
                r13 = r2
                goto L_0x001b
            L_0x0019:
                r13 = r25
            L_0x001b:
                r3 = r15
                r4 = r16
                r5 = r17
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r14 = r26
                r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.feedback.FeedbackFragment.FeedbackUiData.<init>(com.etsy.android.lib.models.apiv3.listing.Reviews$ReviewType, long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, com.etsy.android.lib.models.apiv3.listing.ShopHighlight, com.etsy.android.lib.models.apiv3.listing.ShopRating, java.util.List, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
