package com.etsy.android.p327ui.shop;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0120c;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.feedback.C6473r;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopSection;
import com.etsy.android.lib.models.apiv3.CouponData;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.ListingMemberData;
import com.etsy.android.lib.models.apiv3.ShopHomeMemberData;
import com.etsy.android.lib.models.apiv3.ShopHomePage;
import com.etsy.android.lib.models.apiv3.ShopListingsSearchResult;
import com.etsy.android.lib.models.apiv3.ShopV3;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.datatypes.ShopHomeSortOption;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.lib.network.oauth2.C8758h;
import com.etsy.android.lib.useraction.ActionType;
import com.etsy.android.lib.useraction.SubjectType;
import com.etsy.android.lib.useraction.UserActionBus;
import com.etsy.android.lib.util.C8884d;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.p327ui.C10673m;
import com.etsy.android.p327ui.C10674m0;
import com.etsy.android.p327ui.C11819z;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.cart.C9293d;
import com.etsy.android.p327ui.cart.C9296f;
import com.etsy.android.p327ui.cart.C9315k;
import com.etsy.android.p327ui.cart.C9323l;
import com.etsy.android.p327ui.conversation.compose.ConversationComposeFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10383c;
import com.etsy.android.p327ui.listing.p329ui.pushoptin.ConversationPushOptInBottomSheetKey;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import com.etsy.android.p327ui.shop.C11181o;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.p327ui.shop.C11197r0;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.p327ui.util.C11782j;
import com.etsy.android.qualtrics.BOEQualtricsPromptDisplay$Companion$showPrompt$1;
import com.etsy.android.qualtrics.C8949a;
import com.etsy.android.qualtrics.C8951c;
import com.etsy.android.qualtrics.C8952d;
import com.etsy.android.shophome.C8990d;
import com.etsy.android.shophome.C8991e;
import com.etsy.android.shophome.C9005m;
import com.etsy.android.shophome.C9006n;
import com.etsy.android.stylekit.views.C9059j;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.stylekit.views.CollageTabLayout;
import com.etsy.android.uikit.adapter.C11829a;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.p331ui.favorites.HeartMonitor;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import okhttp3.C19928a0;
import okhttp3.C20002r;
import okhttp3.C20016y;
import p030bo.app.C3653e7;
import p030bo.app.C3673f7;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19206h;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.internal.operators.single.SingleObserveOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p193o.C7494b;
import p193o.C7497e;
import p248tp.C8071s;
import p277w8.C8267e;
import p306z8.C8480g;
import p316be.C8549a;
import p336dc.C12646d;
import p337de.C12647a;
import p337de.C12649c;
import p340ea.C12665f;
import p356ge.C12788a;
import p356ge.C12790b;
import p370ie.C12948h;
import p370ie.C12949i;
import p400mf.C13074b;
import p425q9.C13261l;
import p425q9.C13265p;
import p440s9.C13366a;
import p448ta.C13387c;
import p456ua.C13459d;
import p456ua.C13461f;
import p486y9.C13888d;
import p628nj.C18263b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.shop.ShopHomeFragment */
public class ShopHomeFragment extends BaseShopHomeFragment implements C13366a, C11819z, C9731e0.C9732a, C10674m0.C10675a {
    public C8267e adImpressionRepository;
    public C9293d cartCouponCache;
    public C9323l cartRefreshEventManager;
    public CollageAlert couponBanner;
    public C13888d currentLocale;
    private final C7091a disposables = new C7091a();
    public C11179n homePageMemberDataRepository;
    public boolean isSignedIn;
    public C8990d listingMemberDataRepository;
    public UserActionBus mUserActionBus;
    public C12646d optInEligibility;
    public C8951c qualtricsWrapper;
    public C6473r reviewsEligibility;
    private C11126a router;
    public C13461f rxSchedulers;
    public C13265p session;
    public C11176l0 shopHomePresenter;
    public C9005m shopVacationNotificationRepository;
    private EtsyAction signInAction;
    public C0120c<C12948h> signInForVacationResult = registerForActivityResult(new C12649c(), new C3653e7(this, 1));

    /* renamed from: com.etsy.android.ui.shop.ShopHomeFragment$a */
    public class C11119a extends C11126a {

        /* renamed from: e */
        public int[] f24596e = new int[2];

        /* renamed from: f */
        public int[] f24597f = new int[2];

        public C11119a(Fragment fragment, C11127a0 a0Var, EtsyId etsyId, C8267e eVar) {
            super(fragment, a0Var, etsyId, eVar);
        }

        /* renamed from: d */
        public final void mo36770d(TabLayout.C15453g gVar, boolean z) {
            RecyclerView access$100;
            if (ShopHomeFragment.this.recyclerView != null) {
                Object obj = gVar != null ? gVar.f34699a : null;
                int i = obj != null ? ((C11197r0.C11198a) obj).f24762a : 0;
                if (i >= 0 && (access$100 = ShopHomeFragment.this.recyclerView) != null) {
                    access$100.removeOnScrollListener(ShopHomeFragment.this.mScrollListener);
                    if (z) {
                        access$100.smoothScrollToPosition(i);
                    } else {
                        ((LinearLayoutManager) access$100.getLayoutManager()).mo11307k1(i, 0);
                    }
                    access$100.addOnScrollListener(ShopHomeFragment.this.mScrollListener);
                }
                Object obj2 = gVar != null ? gVar.f34699a : null;
                if (ResponseConstants.ITEMS.equals(obj2 != null ? ((C11197r0.C11198a) obj2).f24764c : null)) {
                    ShopHomeFragment.this.updateSectionSelectorValue((ShopSection) null);
                }
            }
        }

        /* renamed from: g */
        public final void mo36771g() {
            if (ShopHomeFragment.this.recyclerView != null) {
                mo36774o(((GridLayoutManager) ShopHomeFragment.this.recyclerView.getLayoutManager()).mo11282S0());
            }
        }

        /* renamed from: h */
        public final void mo36772h(String str, boolean z) {
            TabLayout.C15453g c;
            CollageTabLayout collageTabLayout = ShopHomeFragment.this.tabLayout;
            if (collageTabLayout != null && (c = C11197r0.m19141c(collageTabLayout, str)) != null) {
                mo36770d(c, z);
            }
        }

        /* renamed from: l */
        public final void mo36773l() {
            if (ShopHomeFragment.this.recyclerView != null) {
                ShopHomeFragment shopHomeFragment = ShopHomeFragment.this;
                if (shopHomeFragment.tabLayout != null) {
                    int S0 = ((GridLayoutManager) shopHomeFragment.recyclerView.getLayoutManager()).mo11282S0();
                    ShopHomeFragment shopHomeFragment2 = ShopHomeFragment.this;
                    CollageTabLayout collageTabLayout = shopHomeFragment2.tabLayout;
                    if (collageTabLayout != null) {
                        collageTabLayout.removeOnTabSelectedListener(shopHomeFragment2.mOnTabSelectedListener);
                        int tabCount = collageTabLayout.getTabCount();
                        int i = 0;
                        while (true) {
                            if (i >= tabCount) {
                                break;
                            }
                            TabLayout.C15453g tabAt = collageTabLayout.getTabAt(i);
                            String str = null;
                            Object obj = tabAt != null ? tabAt.f34699a : null;
                            int i2 = obj != null ? ((C11197r0.C11198a) obj).f24762a : 0;
                            Object obj2 = tabAt != null ? tabAt.f34699a : null;
                            int i3 = obj2 != null ? ((C11197r0.C11198a) obj2).f24763b : 0;
                            if (i2 <= S0 && ((i3 < 0 || S0 <= i3) && tabAt != null)) {
                                TabLayout tabLayout = tabAt.f34706h;
                                if (tabLayout != null) {
                                    int selectedTabPosition = tabLayout.getSelectedTabPosition();
                                    if (!(selectedTabPosition != -1 && selectedTabPosition == tabAt.f34703e)) {
                                        TabLayout tabLayout2 = tabAt.f34706h;
                                        if (tabLayout2 != null) {
                                            tabLayout2.selectTab(tabAt);
                                            ShopHomeFragment shopHomeFragment3 = ShopHomeFragment.this;
                                            Object obj3 = tabAt.f34699a;
                                            if (obj3 instanceof C11197r0.C11198a) {
                                                str = ((C11197r0.C11198a) obj3).f24764c;
                                            }
                                            shopHomeFragment3.didChangeTabSelectionOnScroll(str);
                                        } else {
                                            throw new IllegalArgumentException("Tab not attached to a TabLayout");
                                        }
                                    }
                                } else {
                                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                                }
                            }
                            i++;
                        }
                        collageTabLayout.addOnTabSelectedListener(ShopHomeFragment.this.mOnTabSelectedListener);
                    }
                    mo36774o(S0);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.etsy.android.lib.models.ShopSection} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo36774o(int r8) {
            /*
                r7 = this;
                com.etsy.android.ui.shop.ShopHomeFragment r0 = com.etsy.android.p327ui.shop.ShopHomeFragment.this
                of.c r0 = r0.getAdapter()
                com.etsy.android.ui.shop.a0 r0 = (com.etsy.android.p327ui.shop.C11127a0) r0
                com.etsy.android.ui.shop.ShopHomeFragment r1 = com.etsy.android.p327ui.shop.ShopHomeFragment.this
                androidx.recyclerview.widget.RecyclerView r1 = r1.recyclerView
                androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
                com.etsy.android.uikit.recyclerview.StickyHeadersGridLayoutManager r1 = (com.etsy.android.uikit.recyclerview.StickyHeadersGridLayoutManager) r1
                r2 = 2131430597(0x7f0b0cc5, float:1.84829E38)
                int r2 = r0.mo36822w(r2)
                r3 = -1
                if (r2 == r3) goto L_0x0073
                com.etsy.android.ui.shop.ShopHomeFragment r4 = com.etsy.android.p327ui.shop.ShopHomeFragment.this
                androidx.recyclerview.widget.RecyclerView r4 = r4.recyclerView
                androidx.recyclerview.widget.RecyclerView$b0 r4 = r4.findViewHolderForAdapterPosition(r2)
                if (r4 == 0) goto L_0x0073
                int r1 = r1.mo11279P0()
                if (r1 == r3) goto L_0x0073
                if (r1 <= r2) goto L_0x0073
                com.etsy.android.ui.shop.ShopHomeFragment r8 = com.etsy.android.p327ui.shop.ShopHomeFragment.this
                androidx.recyclerview.widget.RecyclerView r8 = r8.recyclerView
                androidx.recyclerview.widget.RecyclerView$b0 r8 = r8.findViewHolderForAdapterPosition(r1)
            L_0x003c:
                if (r8 == 0) goto L_0x0072
                android.view.View r2 = r4.itemView
                android.view.View r8 = r8.itemView
                r3 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0063
                if (r8 != 0) goto L_0x0049
                goto L_0x0063
            L_0x0049:
                int[] r6 = r7.f24596e
                r2.getLocationOnScreen(r6)
                int[] r6 = r7.f24597f
                r8.getLocationOnScreen(r6)
                int[] r8 = r7.f24596e
                r8 = r8[r5]
                int r2 = r2.getMeasuredHeight()
                int r2 = r2 + r8
                int[] r8 = r7.f24597f
                r8 = r8[r5]
                if (r2 < r8) goto L_0x0063
                r3 = r5
            L_0x0063:
                if (r3 == 0) goto L_0x0072
                int r1 = r1 + 1
                com.etsy.android.ui.shop.ShopHomeFragment r8 = com.etsy.android.p327ui.shop.ShopHomeFragment.this
                androidx.recyclerview.widget.RecyclerView r8 = r8.recyclerView
                androidx.recyclerview.widget.RecyclerView$b0 r8 = r8.findViewHolderForAdapterPosition(r1)
                goto L_0x003c
            L_0x0072:
                r8 = r1
            L_0x0073:
                com.etsy.android.ui.shop.ShopHomeFragment r1 = com.etsy.android.p327ui.shop.ShopHomeFragment.this
                com.etsy.android.ui.shop.l0 r1 = r1.shopHomePresenter
                r1.getClass()
                r1 = 0
                if (r8 < 0) goto L_0x00bd
                int r2 = r0.getItemCount()
                if (r8 < r2) goto L_0x0084
                goto L_0x00bd
            L_0x0084:
                if (r8 < 0) goto L_0x00bd
                int r2 = r0.getItemViewType(r8)
                r3 = 2131430594(0x7f0b0cc2, float:1.8482893E38)
                if (r2 != r3) goto L_0x00a5
                java.lang.Object r8 = r0.getItem(r8)
                java.lang.String r0 = "null cannot be cast to non-null type com.etsy.android.ui.shop.ShopHomeVespaElement"
                kotlin.jvm.internal.C19383o.m32795e(r8, r0)
                com.etsy.android.ui.shop.t0 r8 = (com.etsy.android.p327ui.shop.C11202t0) r8
                java.lang.Object r8 = r8.f24766b
                java.lang.String r0 = "null cannot be cast to non-null type com.etsy.android.lib.models.ShopSection"
                kotlin.jvm.internal.C19383o.m32795e(r8, r0)
                r1 = r8
                com.etsy.android.lib.models.ShopSection r1 = (com.etsy.android.lib.models.ShopSection) r1
                goto L_0x00bd
            L_0x00a5:
                r3 = 2131430593(0x7f0b0cc1, float:1.8482891E38)
                if (r2 == r3) goto L_0x00ba
                r3 = 2131430577(0x7f0b0cb1, float:1.8482859E38)
                if (r2 == r3) goto L_0x00ba
                r3 = 2131430574(0x7f0b0cae, float:1.8482853E38)
                if (r2 == r3) goto L_0x00ba
                r3 = 2131430591(0x7f0b0cbf, float:1.8482887E38)
                if (r2 == r3) goto L_0x00ba
                goto L_0x00bd
            L_0x00ba:
                int r8 = r8 + -1
                goto L_0x0084
            L_0x00bd:
                com.etsy.android.ui.shop.ShopHomeFragment r8 = com.etsy.android.p327ui.shop.ShopHomeFragment.this
                r8.updateSectionSelectorValue(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.shop.ShopHomeFragment.C11119a.mo36774o(int):void");
        }
    }

    private void getMemberData(ShopHomePage shopHomePage, boolean z) {
        List arrayList = new ArrayList();
        if (shopHomePage.getFeaturedListings() != null) {
            arrayList = shopHomePage.getFeaturedListings();
        }
        List arrayList2 = new ArrayList();
        if (shopHomePage.getShopListings() != null) {
            arrayList2 = shopHomePage.getShopListings();
        }
        ShopV3 shop = shopHomePage.getShop();
        C19383o.m32797g(shop, ResponseConstants.SHOP);
        C19383o.m32797g(arrayList, "featuredListings");
        C19383o.m32797g(arrayList2, "shopListings");
        C11179n nVar = this.homePageMemberDataRepository;
        nVar.getClass();
        StringBuilder sb = new StringBuilder();
        Iterator it = C11200s0.m19143a(arrayList, arrayList2).iterator();
        while (it.hasNext()) {
            sb.append("listing_ids[]=" + ((String) it.next()) + '&');
        }
        C11177m mVar = nVar.f24722a;
        EtsyId shopId = shop.getShopId();
        C19383o.m32796f(shopId, "specs.shop.shopId");
        C20016y.C20017a aVar = C20016y.f44360a;
        C20002r.f44260f.getClass();
        C20002r b = C20002r.C20003a.m34244b("application/x-www-form-urlencoded; charset=UTF-8");
        String str = sb + "vacation_subscription_status_required=" + shop.isVacation();
        aVar.getClass();
        C19383o.m32797g(str, ResponseConstants.CONTENT);
        C8071s<C20145v<C19928a0>> a = mVar.mo36847a(shopId, C20016y.C20017a.m34281b(str, b));
        C13459d dVar = new C13459d(nVar, 5);
        a.getClass();
        this.disposables.mo19403b(C0391c.m1056b(this.rxSchedulers, C0472h.m1243e(this.rxSchedulers, new C19211l(new C19208j(a, dVar), new C3673f7(nVar, 3)))).mo20658g(new C11145f0(this, z), new C8884d(3)));
    }

    private void handleCoupon(CouponData couponData) {
        if ((this.coupon == null || this.couponBanner == null || couponData == null || !couponData.isValid() || couponData.getMessage() == null || this.shopId == null) ? false : true) {
            C9296f.C9300d dVar = new C9296f.C9300d(this.shopId.getIdAsLong(), couponData.getCouponCode());
            C9293d dVar2 = this.cartCouponCache;
            dVar2.getClass();
            dVar2.f20508a.add(dVar);
            this.cartRefreshEventManager.f20595a.onNext(C9315k.C9321f.f20593a);
            this.couponBanner.setBodyText(Html.fromHtml(couponData.getMessage().toString(), 63), (Drawable) null);
            this.couponBanner.setDismissButtonClickListener(new C9059j(this, 2));
            this.couponBanner.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void lambda$getMemberData$4(boolean z, C11181o oVar) throws Exception {
        if (oVar instanceof C11181o.C11183b) {
            handleMemberDataResponse(((C11181o.C11183b) oVar).f24730a, z);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getMemberData$5(Throwable th) throws Exception {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$handleCoupon$3(View view) {
        CollageAlert collageAlert = this.couponBanner;
        if (collageAlert != null) {
            collageAlert.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public void lambda$new$8(C12647a aVar) {
        if (aVar.f27895a == 311) {
            toggleVacationNotificationSettings(true);
        } else {
            ((C11127a0) this.adapter).mo36824z(false);
        }
    }

    /* access modifiers changed from: private */
    public C19394m lambda$onCreateView$0(String str) {
        FragmentActivity requireActivity = requireActivity();
        C8949a aVar = new C8949a();
        C19383o.m32797g(str, "url");
        C19383o.m32797g(requireActivity, "fragmentActivity");
        requireActivity.getLifecycle().mo10733a(new BOEQualtricsPromptDisplay$Companion$showPrompt$1(requireActivity, aVar, str));
        return null;
    }

    /* access modifiers changed from: private */
    public void lambda$onNewListingsResponse$6(List list) throws Exception {
        List list2 = list;
        if (this.adapter != null && !list.isEmpty()) {
            C11127a0 a0Var = (C11127a0) this.adapter;
            C11192q0 q0Var = a0Var.f24615j;
            C7494b<EtsyId, ListingMemberData> bVar = q0Var.f24750j;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ListingMemberData listingMemberData = (ListingMemberData) list2.get(i);
                bVar.put(listingMemberData.getListingId(), listingMemberData);
            }
            int size2 = a0Var.mItems.size();
            int size3 = list.size();
            for (int i2 = 0; i2 < size3; i2++) {
                ListingMemberData listingMemberData2 = (ListingMemberData) list2.get(i2);
                C7497e orDefault = q0Var.f24751k.getOrDefault(listingMemberData2.getListingId(), null);
                if (orDefault != null) {
                    int i3 = orDefault.f16718b & 0;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (i4 >= 0) {
                            int i5 = orDefault.f16718b;
                            if (i4 < (i5 & 0)) {
                                int i6 = orDefault.f16717a[i5 & (i4 + 0)];
                                if (i6 < size2) {
                                    Object obj = ((C11202t0) a0Var.mItems.get(i6)).f24766b;
                                    if (obj instanceof ListingLike) {
                                        ListingLike listingLike = (ListingLike) obj;
                                        boolean hasCollections = listingMemberData2.hasCollections();
                                        boolean isFavorite = listingMemberData2.isFavorite();
                                        boolean z = (listingLike.hasCollections() ^ hasCollections) || (listingLike.isFavorite() ^ isFavorite);
                                        listingLike.setHasCollections(hasCollections);
                                        listingLike.setIsFavorite(isFavorite);
                                        if (z) {
                                            a0Var.notifyItemChanged(i6);
                                        }
                                    }
                                }
                                i4++;
                            }
                        }
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    continue;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onNewListingsResponse$7(Throwable th) throws Exception {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$1(String str, Bundle bundle) {
        if (this.optInEligibility.mo45425a()) {
            this.optInEligibility.mo45426b();
            C12790b.m20430b(this, new ConversationPushOptInBottomSheetKey(C12790b.m20432d(this), "shop_home"));
        }
    }

    /* access modifiers changed from: private */
    public void lambda$onViewCreated$2(C13074b bVar) {
        C11829a<T> aVar = this.adapter;
        if (aVar != null) {
            C11127a0 a0Var = (C11127a0) aVar;
            if (a0Var.f24614i != null) {
                if (bVar instanceof C13074b.C13076b) {
                    C19206h hVar = new C19206h(new C11304w(a0Var, bVar));
                    C18263b.f40055S.getClass();
                    C0391c.m1056b(C18263b.f40055S, hVar.mo20660i(C13461f.m21234a())).mo20658g(new C11306x(0, a0Var, bVar), Functions.f28541e);
                } else if (bVar instanceof C13074b.C13075a) {
                    C19206h hVar2 = new C19206h(new C11308y(a0Var, bVar));
                    C18263b.f40055S.getClass();
                    SingleObserveOn b = C0391c.m1056b(C18263b.f40055S, hVar2.mo20660i(C13461f.m21234a()));
                    C13387c cVar = new C13387c(a0Var, 5);
                    C8694h hVar3 = C8694h.f19097a;
                    Objects.requireNonNull(hVar3);
                    b.mo20658g(cVar, new C10673m(hVar3, 7));
                } else if (bVar instanceof C13074b.C13077c) {
                    boolean z = ((C13074b.C13077c) bVar).f28753b;
                    a0Var.f24615j.f24755o = z;
                    a0Var.mo36823y(z);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$toggleVacationNotificationSettings$10(Throwable th) throws Exception {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleVacationNotificationSettings$9(boolean z, C9006n nVar) throws Exception {
        if (nVar instanceof C9006n.C9008b) {
            ((C11127a0) this.adapter).mo36824z(z);
        }
    }

    private void refreshSignInDataAndLoadContent(boolean z) {
        boolean z2 = this.isSignedIn;
        boolean e = this.session.mo45960e();
        this.isSignedIn = e;
        if (z2 != e) {
            C11127a0 a0Var = (C11127a0) this.adapter;
            ShopHomePage shopHomePage = a0Var.f24614i;
            if (shopHomePage != null && e) {
                getMemberData(shopHomePage, z);
            } else if (shopHomePage == null) {
                loadContent();
            }
            C11192q0 q0Var = a0Var.f24615j;
            if (q0Var != null && shopHomePage != null) {
                q0Var.f24758r = e && shopHomePage.getShop().getUserId().equals(this.session.mo45958c());
            }
        }
    }

    private void shareShop() {
        ShopHomePage shopHomePage = ((C11127a0) this.adapter).f24614i;
        if (shopHomePage != null) {
            ShopV3 shop = shopHomePage.getShop();
            getAnalyticsContext().mo21333d("shop_home_share", new HashMap<AnalyticsProperty, Object>(shop.getShopId()) {
                public final /* synthetic */ EtsyId val$shopId;

                {
                    this.val$shopId = r2;
                    put(PredefinedAnalyticsProperty.SHOP_ID, r2);
                }
            });
            C1993m.m4365Z(getActivity(), shop.getShareable().getShareUrl());
        }
    }

    private void toggleVacationNotificationSettings(boolean z) {
        C9005m mVar = this.shopVacationNotificationRepository;
        String id = this.shopId.getId();
        C19383o.m32797g(id, "shopId");
        mVar.getClass();
        C8071s<C20145v<C19928a0>> a = mVar.f19873a.mo30662a(id, z);
        C13261l lVar = new C13261l(mVar, 3);
        a.getClass();
        this.disposables.mo19403b(C0391c.m1056b(this.rxSchedulers, C0472h.m1243e(this.rxSchedulers, new C19211l(new C19208j(a, lVar), new C8758h(mVar, 2)))).mo20658g(new C11147g0(this, z), new C12665f(2)));
    }

    public void didChangeTabSelectionOnScroll(String str) {
        if (str != null) {
            C8703p analyticsContext = getAnalyticsContext();
            analyticsContext.mo21333d("scrolled_to_shop_tab_section_" + str, (Map<? extends AnalyticsProperty, Object>) null);
        }
    }

    public void didClearSearch() {
        super.didClearSearch();
        getAnalyticsContext().mo21333d("cleared_search", (Map<? extends AnalyticsProperty, Object>) null);
    }

    public void didSelectSection(ShopSection shopSection) {
        getAnalyticsContext().mo21333d("selected_shop_section", new HashMap<AnalyticsProperty, Object>(shopSection) {
            public final /* synthetic */ ShopSection val$section;

            {
                this.val$section = r2;
                put(PredefinedAnalyticsProperty.SHOP_SECTION_ID, r2.getShopSectionId());
            }
        });
    }

    public void didSelectSortOption(ShopHomeSortOption shopHomeSortOption) {
        getAnalyticsContext().mo21333d("selected_shop_items_sort", new HashMap<AnalyticsProperty, Object>(shopHomeSortOption) {
            public final /* synthetic */ ShopHomeSortOption val$option;

            {
                this.val$option = r2;
                put(PredefinedAnalyticsProperty.SORT_OPTION_ID, r2.getOptionId());
            }
        });
    }

    public void didSelectTab(String str) {
        if (str != null) {
            C8703p analyticsContext = getAnalyticsContext();
            analyticsContext.mo21333d("clicked_tab_nav_" + str, (Map<? extends AnalyticsProperty, Object>) null);
        }
    }

    public void didSubmitSearchQuery(String str) {
        getAnalyticsContext().mo21333d("searched", new HashMap<AnalyticsProperty, Object>(str) {
            public final /* synthetic */ String val$query;

            {
                this.val$query = r2;
                put(PredefinedAnalyticsProperty.QUERY, r2);
            }
        });
    }

    public boolean displayTabs() {
        return true;
    }

    public String getFragmentTitleString() {
        return C8885d0.m17322f(this.shopName) ? "" : this.shopName;
    }

    public int getLayoutId() {
        return R.layout.fragment_shop_home_vespa_recyclerview;
    }

    public C11178m0 getShopHomeRouter() {
        C11126a aVar = this.router;
        if (aVar == null) {
            this.router = new C11119a(this, (C11127a0) this.adapter, this.shopId, this.adImpressionRepository);
        } else {
            aVar.f24610c = this.shopId;
        }
        return this.router;
    }

    public String getTrackingName() {
        return "shop_home";
    }

    public void handleMemberDataResponse(ShopHomeMemberData shopHomeMemberData, boolean z) {
        C11127a0 a0Var = (C11127a0) this.adapter;
        C11192q0 q0Var = a0Var.f24615j;
        if (q0Var != null) {
            q0Var.f24754n = true;
            ShopHomePage shopHomePage = a0Var.f24614i;
            if (shopHomePage != null && shopHomePage.getMemberData() == null) {
                a0Var.f24614i.setMemberData(shopHomeMemberData);
            }
            q0Var.f24755o = shopHomeMemberData.isFavorer();
            q0Var.f24756p = shopHomeMemberData.isSubscribedToVacationNotification();
            a0Var.mo36823y(shopHomeMemberData.isFavorer());
        }
        if (z && !shopHomeMemberData.isFavorer()) {
            performShopFavorite(true);
        }
    }

    public void handlePageData(ShopHomePage shopHomePage, C11869a aVar) {
        C11192q0.C11193a aVar2;
        super.handlePageData(shopHomePage, aVar);
        if (!shopHomePage.getShop().isVacation()) {
            handleCoupon(shopHomePage.getCouponData());
        }
        C11192q0 q0Var = this.stateManager;
        if (!q0Var.f24755o && this.favoriteThisShopOnLoad && (aVar2 = q0Var.f24741a) != null) {
            aVar2.performShopFavorite(true);
        }
        C11192q0 q0Var2 = this.stateManager;
        if (!q0Var2.f24754n && !q0Var2.f24758r && this.isSignedIn) {
            getMemberData(shopHomePage, false);
        }
    }

    public void loadMoreListings() {
        super.loadMoreListings();
        getAnalyticsContext().mo21333d("load_more_listings", (Map<? extends AnalyticsProperty, Object>) null);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 300 && this.signInAction == EtsyAction.FAVORITE_SHOP && i2 == 311) {
            refreshSignInDataAndLoadContent(true);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.isSignedIn = this.session.mo45960e();
        String string = getArguments().getString("shop_id");
        EtsyId etsyId = string == null ? null : new EtsyId(string);
        if (etsyId != null && bundle == null) {
            this.mUserActionBus.mo30434c(ActionType.VIEW, SubjectType.SHOP, etsyId.getId());
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.menu_shop_home, menu);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.couponBanner = (CollageAlert) onCreateView.findViewById(R.id.shop_home_coupon_banner);
        this.qualtricsWrapper.mo30561a(new ArrayList(Arrays.asList(new C8952d[]{new C8952d.C8961i(this.currentLocale.mo46719c().toString()), C8952d.C8960h.f19758c})));
        this.qualtricsWrapper.mo30562b(new C11149h0(this));
        return onCreateView;
    }

    public void onDestroyView() {
        this.disposables.mo19405d();
        C11176l0 l0Var = this.shopHomePresenter;
        l0Var.f24719d = null;
        C7091a aVar = l0Var.f24720e;
        if (aVar != null) {
            aVar.mo19405d();
        }
        l0Var.f24720e = null;
        this.couponBanner = null;
        super.onDestroyView();
    }

    public void onNewListingsResponse(ShopListingsSearchResult shopListingsSearchResult) {
        List<ListingCard> listings = shopListingsSearchResult.getListings();
        if (!listings.isEmpty() && this.isSignedIn) {
            this.disposables.mo19403b(C0391c.m1056b(this.rxSchedulers, C0326j.m860e(this.rxSchedulers, this.listingMemberDataRepository.mo30653a(new C8991e(C11200s0.m19143a(listings))))).mo20658g(new C8480g(this, 5), new C10383c(1)));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_share) {
            shareShop();
            return true;
        } else if (menuItem.getItemId() != R.id.menu_contact_shop) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            getAnalyticsContext().mo21333d("shop_home_contact_shop_toolbar_tapped", (Map<? extends AnalyticsProperty, Object>) null);
            this.router.mo36803a();
            return true;
        }
    }

    public void onPageLoaded(ShopHomePage shopHomePage) {
        C8703p analyticsContext = getAnalyticsContext();
        C19383o.m32797g(shopHomePage, "item");
        analyticsContext.mo21333d("shop_home_complementary", C19388s.m32882r0(shopHomePage));
    }

    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        C11127a0 a0Var = (C11127a0) this.adapter;
        boolean z = true;
        boolean z2 = (a0Var == null || a0Var.f24614i == null) ? false : true;
        MenuItem findItem = menu.findItem(R.id.menu_share);
        if (findItem != null) {
            findItem.setVisible(z2);
        }
        MenuItem findItem2 = menu.findItem(R.id.menu_contact_shop);
        if (findItem2 != null) {
            if (!z2 || !this.reviewsEligibility.f14376a.mo21132b(C8592b.f18772Z0)) {
                z = false;
            }
            findItem2.setVisible(z);
        }
    }

    public void onResume() {
        super.onResume();
        C11176l0 l0Var = this.shopHomePresenter;
        C8703p analyticsContext = getAnalyticsContext();
        l0Var.getClass();
        C19383o.m32797g(analyticsContext, "analyticsTracker");
        l0Var.f24719d = this;
        l0Var.f24721f = analyticsContext;
        refreshSignInDataAndLoadContent(false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getParentFragmentManager().mo10375a0(ConversationComposeFragment.LISTING_CONVO_SENT, this, new C8549a(this));
        new HeartMonitor(getLifecycle(), new C11142e0(this));
    }

    public void performShopFavorite(boolean z) {
        ShopV3 shop;
        C11176l0 l0Var = this.shopHomePresenter;
        C11127a0 a0Var = (C11127a0) this.adapter;
        ShopHomeFragment shopHomeFragment = l0Var.f24719d;
        FragmentActivity activity = shopHomeFragment != null ? shopHomeFragment.getActivity() : null;
        if (a0Var == null) {
            throw new IllegalStateException("performFavorite was called while the Adapter was null".toString());
        } else if (activity != null) {
            C7091a aVar = l0Var.f24720e;
            if (aVar != null) {
                aVar.mo19405d();
            }
            l0Var.f24720e = new C7091a();
            if (l0Var.f24716a.mo45960e()) {
                ShopHomePage shopHomePage = a0Var.f24614i;
                if (shopHomePage != null && (shop = shopHomePage.getShop()) != null) {
                    EtsyId userId = shop.getUserId();
                    C19383o.m32796f(userId, "shop.userId");
                    String name = shop.getName();
                    C19383o.m32796f(name, "shop.name");
                    C11782j jVar = new C11782j(userId, name, z);
                    C11780h hVar = l0Var.f24717b;
                    C8672b bVar = l0Var.f24721f;
                    C19383o.m32794d(bVar);
                    ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(l0Var.f24718c, C0072d.m199f(l0Var.f24718c, hVar.mo38047a(jVar, bVar))), new ShopHomePresenter$performFavoriteShop$3$1(LogCatKt.m17045a()), ShopHomePresenter$performFavoriteShop$3$2.INSTANCE);
                    C7091a aVar2 = l0Var.f24720e;
                    C19383o.m32794d(aVar2);
                    aVar2.mo19403b(e);
                    return;
                }
                return;
            }
            ShopHomeFragment shopHomeFragment2 = l0Var.f24719d;
            if (shopHomeFragment2 != null) {
                shopHomeFragment2.setSignInAction(EtsyAction.FAVORITE_SHOP);
            }
            C12788a.m20424c(activity, new C12949i(new C12948h(C19421p.m32935c0(activity), EtsyAction.FAVORITE, (Bundle) null, (String) null, (String) null, (String) null, 60), l0Var.f24719d, 4));
        } else {
            throw new IllegalStateException("performFavorite was called while the Activity was null".toString());
        }
    }

    public void performVacationNotificationSubscription(boolean z) {
        if (!this.session.mo45960e()) {
            EtsyAction.C8658a aVar = EtsyAction.Companion;
            String c0 = C19421p.m32935c0(getActivity());
            EtsyAction etsyAction = EtsyAction.SUBSCRIBE_VACATION_NOTIFICATION;
            C19383o.m32797g(etsyAction, "signInAction");
            this.signInForVacationResult.mo1157b(new C12948h(c0, etsyAction, (Bundle) null, (String) null, (String) null, (String) null, 32));
            return;
        }
        toggleVacationNotificationSettings(z);
    }

    public void setSignInAction(EtsyAction etsyAction) {
        this.signInAction = etsyAction;
    }

    public void showDetailsBottomSheet(String str, String str2) {
        C19421p.m32933W(getContext(), new DetailsBottomSheetNavigationKey(C19421p.m32935c0(getContext()), str, str2));
    }

    public int softInputMode() {
        return 32;
    }
}
