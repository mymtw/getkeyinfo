package com.etsy.android.p327ui.shop;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.C3150h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.etsy.android.C6487g;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.elk.uploading.C8683d;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.logger.perf.C8710g;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopSection;
import com.etsy.android.lib.models.apiv3.FAQ;
import com.etsy.android.lib.models.apiv3.FAQs;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.ShopHomePage;
import com.etsy.android.lib.models.apiv3.ShopListingsSearchResult;
import com.etsy.android.lib.models.apiv3.ShopV3;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.datatypes.ShopHomeSortOption;
import com.etsy.android.lib.network.oauth2.C8758h;
import com.etsy.android.lib.util.C8882c;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.C8905i;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.cart.saved.C9342c;
import com.etsy.android.p327ui.cart.viewholders.C9408v;
import com.etsy.android.p327ui.shop.C11172k0;
import com.etsy.android.p327ui.shop.C11184o0;
import com.etsy.android.p327ui.shop.C11188p0;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.p327ui.shop.C11194r;
import com.etsy.android.p327ui.shop.C11197r0;
import com.etsy.android.p327ui.shop.C11244u;
import com.etsy.android.p327ui.shop.viewholder.C11257a;
import com.etsy.android.p327ui.shop.viewholder.C11293p;
import com.etsy.android.stylekit.views.CollageTabLayout;
import com.etsy.android.uikit.BaseActivity;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionViewModel;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.etsy.android.uikit.viewholder.ListingCardUiModel;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.vespa.VespaBaseFragment;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import okhttp3.C19928a0;
import p003a2.C0023f;
import p010a9.C0048b;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8071s;
import p340ea.C12673n;
import p357gf.C12796e;
import p395ma.C13033c;
import p402n9.C13093m;
import p425q9.C13250b;
import p425q9.C13265p;
import p435rb.C13350a;
import p445sf.C13379a;
import p445sf.C13382d;
import p452te.C13394c;
import p456ua.C13461f;
import p460ue.C13497g;
import p486y9.C13888d;
import p487ya.C13895a;
import p628nj.C18263b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.shop.BaseShopHomeFragment */
public abstract class BaseShopHomeFragment extends VespaBaseFragment implements C11192q0.C11193a {
    private static final String DID_INITIAL_PAGE_LOAD = "did_initial_page_load";
    private static final String RECYCLERVIEW_LAYOUT = "recyclerview_layout";
    private static final String SHOP_DATA = "shop_data";
    public BaseShopHomePageRepository baseShopHomePageRepository;
    public String coupon;
    public C13888d currentLocale;
    public boolean didInitialPageLoad;
    private C7091a disposable = new C7091a();
    public C12673n elkLogger;
    public C11175l faqsTranslationRepository;
    public boolean favoriteThisShopOnLoad;
    public C13895a fileSupport;
    public ShopHomeInitialLoadConfiguration initialLoadConfig;
    public ListingCardViewHolderOptions listingCardOptions;
    public String listingId;
    public C12796e listingImagesRepository;
    public C8694h logCat;
    public TabLayout.C15450d mOnTabSelectedListener = new C11111a();
    public C11180n0 mScrollListener;
    public C8710g performanceTrackerAdapter;
    public C11191q privacyPolicyTranslationRepository;
    private ViewTreeObserver.OnGlobalLayoutListener recyclerViewOnGlobalLayoutListener;
    public C11201t reviewsTranslationRepository;
    public C13461f rxSchedulers;
    public C13265p session;
    public C11139d0 shopHomeEligibility;
    public EtsyId shopId;
    public String shopName = "";
    public C11192q0 stateManager;
    public CollageTabLayout tabLayout;
    private TransactionViewModel<C11869a> transactionViewModel;
    public C8923u translationHelper;

    /* renamed from: com.etsy.android.ui.shop.BaseShopHomeFragment$a */
    public class C11111a implements TabLayout.C15450d {
        public C11111a() {
        }

        /* renamed from: a */
        public final void mo36757a(TabLayout.C15453g gVar) {
            if (BaseShopHomeFragment.this.getLifecycle().mo10734b().isAtLeast(Lifecycle.State.STARTED)) {
                BaseShopHomeFragment.this.getShopHomeRouter().mo36770d(gVar, false);
                BaseShopHomeFragment baseShopHomeFragment = BaseShopHomeFragment.this;
                C11180n0 n0Var = baseShopHomeFragment.mScrollListener;
                if (n0Var != null) {
                    n0Var.f24726d = true;
                }
                Object obj = gVar.f34699a;
                baseShopHomeFragment.didSelectTab(!(obj instanceof C11197r0.C11198a) ? null : ((C11197r0.C11198a) obj).f24764c);
                if (C15588c1.m25346s0(BaseShopHomeFragment.this.getContext())) {
                    C15588c1.m25340p0(BaseShopHomeFragment.this.tabLayout);
                }
            }
        }

        /* renamed from: b */
        public final void mo36758b() {
        }

        /* renamed from: c */
        public final void mo36759c(TabLayout.C15453g gVar) {
            BaseShopHomeFragment.this.getShopHomeRouter().mo36770d(gVar, false);
            BaseShopHomeFragment baseShopHomeFragment = BaseShopHomeFragment.this;
            Object obj = gVar.f34699a;
            baseShopHomeFragment.didSelectTab(!(obj instanceof C11197r0.C11198a) ? null : ((C11197r0.C11198a) obj).f24764c);
        }
    }

    /* renamed from: com.etsy.android.ui.shop.BaseShopHomeFragment$b */
    public class C11112b extends C3150h {
        /* renamed from: f */
        public final boolean mo11629f(RecyclerView.C3084b0 b0Var) {
            return b0Var.getItemViewType() != R.id.view_type_shop_home_announcement_content;
        }
    }

    /* renamed from: com.etsy.android.ui.shop.BaseShopHomeFragment$c */
    public class C11113c implements ViewTreeObserver.OnGlobalLayoutListener {
        public C11113c() {
        }

        public final void onGlobalLayout() {
            if (BaseShopHomeFragment.this.recyclerView != null && BaseShopHomeFragment.this.performanceTrackerAdapter.mo21373e()) {
                BaseShopHomeFragment.this.recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    private void fetchPageData() {
        String str;
        C11167i iVar = new C11167i(this.shopId, this.shopName, ((C11127a0) this.adapter).f24614i == null, this.initialLoadConfig, this.listingId, this.coupon, getConfigMap().mo21132b(C8592b.C8595c.f18865i));
        this.performanceTrackerAdapter.mo21369a();
        C7091a aVar = this.disposable;
        BaseShopHomePageRepository baseShopHomePageRepository2 = this.baseShopHomePageRepository;
        baseShopHomePageRepository2.getClass();
        C11169j jVar = baseShopHomePageRepository2.f24594a;
        EtsyId etsyId = iVar.f24694a;
        if (etsyId != null) {
            str = "/etsyapps/v3/bespoke/member/shops/" + etsyId + "/home";
        } else {
            str = C0048b.m163a("/etsyapps/v3/bespoke/member/shops/", iVar.f24695b, "/home-by-name");
        }
        C8071s<C20145v<C19928a0>> b = jVar.mo36838b(str, BaseShopHomePageRepository.m19038b(iVar));
        C8758h hVar = new C8758h(baseShopHomePageRepository2, 6);
        b.getClass();
        aVar.mo19403b(C0391c.m1056b(this.rxSchedulers, C0326j.m860e(this.rxSchedulers, new C19208j(b, hVar))).mo20658g(new C6487g(this, 7), new C8905i(this, 6)));
    }

    private void handleFetchFailure() {
        this.performanceTrackerAdapter.mo21370b();
        stopLoad();
        showErrorView();
        this.performanceTrackerAdapter.mo21371c();
    }

    private void handleFetchSuccess(C11172k0.C11174b bVar) {
        this.performanceTrackerAdapter.mo21370b();
        FragmentActivity activity = getActivity();
        if (((C11127a0) this.adapter) != null && activity != null) {
            ShopHomePage shopHomePage = bVar.f24714a;
            ShopV3 shop = shopHomePage.getShop();
            if (isAdded() && isVisible()) {
                getActivity().setTitle(shop.getName());
            }
            this.shopId = shop.getShopId();
            this.shopName = shop.getShopName();
            List<ShopSection> arrayList = new ArrayList<>();
            if (shopHomePage.getShopSections() != null) {
                arrayList = shopHomePage.getShopSections();
            }
            C11192q0 q0Var = this.stateManager;
            arrayList.add(0, ShopSection.allItemsSection(q0Var.f24742b));
            q0Var.f24747g = arrayList;
            q0Var.f24746f = null;
            q0Var.f24758r = q0Var.f24743c.mo45960e() && shop.getUserId().equals(q0Var.f24743c.mo45958c());
            q0Var.f24757q = shop.isListingRearrangeEnabled();
            List<ShopHomeSortOption> defaultSortOptions = ShopHomeSortOption.defaultSortOptions(q0Var.f24742b, shop);
            q0Var.f24749i = defaultSortOptions;
            q0Var.f24748h = defaultSortOptions.get(0);
            handlePageData(shopHomePage, (C11869a) null);
            activity.invalidateOptionsMenu();
            showListView();
            stopLoad();
            this.didInitialPageLoad = true;
            onPageLoaded(shopHomePage);
            this.performanceTrackerAdapter.mo21371c();
        }
    }

    private void handleSearchFailure(boolean z) {
        stopLoad();
        if (z) {
            RecyclerView recyclerView = this.recyclerView;
            String string = getString(R.string.error_loading_more_listings);
            if (recyclerView != null) {
                Snackbar h = Snackbar.m25028h(recyclerView, string, 0);
                h.f34654c.setBackgroundColor(C13350a.m21013d(recyclerView.getContext(), R.attr.clg_color_bg_error));
                h.mo54762i();
            }
            C11127a0 a0Var = (C11127a0) this.adapter;
            int size = a0Var.mItems.size() - 1;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                } else if (((C11202t0) a0Var.mItems.get(size)).f24767c == R.id.view_type_shop_home_listing) {
                    break;
                } else {
                    size--;
                }
            }
            int i = size + 1;
            if (i != -1 && i < a0Var.mItems.size()) {
                a0Var.mItems.set(i, new C11202t0(R.id.view_type_shop_home_load_button_listings, C11127a0.m19076x(a0Var.f24615j, a0Var.mContext.getResources())));
                a0Var.notifyItemRemoved(i);
                a0Var.notifyItemInserted(i);
            }
        }
    }

    private void handleSearchSuccess(C11184o0.C11186b bVar, boolean z) {
        CollageTabLayout collageTabLayout;
        C11184o0.C11186b bVar2 = bVar;
        C11127a0 a0Var = (C11127a0) this.adapter;
        if (a0Var != null && (collageTabLayout = this.tabLayout) != null) {
            ShopListingsSearchResult shopListingsSearchResult = bVar2.f24733a;
            boolean z2 = !z;
            int i = bVar2.f24734b;
            if (z2) {
                Resources resources = a0Var.mContext.getResources();
                int w = a0Var.mo36822w(R.id.view_type_shop_home_items_search_redesign) + 1;
                int w2 = a0Var.mo36822w(R.id.view_type_shop_home_items_section_end);
                if (w == -1 || w2 == -1 || w2 <= w) {
                    C8694h.f19097a.mo21306a("Something is terribly wrong, this adapter is notconfigured properly to handle shop listings");
                } else {
                    int i2 = w2 - w;
                    List<ListingCard> listings = shopListingsSearchResult.getListings();
                    int size = listings.size();
                    C11192q0 q0Var = a0Var.f24615j;
                    q0Var.f24753m = size;
                    q0Var.f24752l = i;
                    ArrayList arrayList = new ArrayList();
                    a0Var.mItems.subList(w, w + i2).clear();
                    a0Var.notifyItemRangeRemoved(w, i2);
                    if (i > 0) {
                        ShopSection shopSection = new ShopSection(resources.getString(R.string.shop_home_all_items_section_title), "");
                        shopSection.setListings(listings);
                        shopSection.setListingActiveCount(i);
                        arrayList.add(new C11202t0(R.id.view_type_shop_home_section_header_all_items, shopSection));
                        for (ListingCard listingCardUiModel : listings) {
                            arrayList.add(new C11202t0(R.id.view_type_shop_home_listing, new ListingCardUiModel(listingCardUiModel, true, false, false)));
                        }
                    } else {
                        arrayList.add(new C11202t0(R.id.view_type_shop_home_empty_layout, new C11257a.C11258a(R.drawable.shop_home_empty_items, resources.getString(R.string.shop_home_no_listings))));
                    }
                    arrayList.add(new C11202t0(R.id.view_type_shop_home_load_button_listings, C11127a0.m19076x(a0Var.f24615j, resources)));
                    a0Var.mItems.addAll(w, arrayList);
                    a0Var.notifyItemRangeInserted(w, arrayList.size());
                    C11197r0.m19140b(collageTabLayout, C11197r0.m19141c(collageTabLayout, ResponseConstants.ITEMS), arrayList.size() + w);
                }
            } else {
                Resources resources2 = a0Var.mContext.getResources();
                int w3 = a0Var.mo36822w(R.id.view_type_shop_home_items_section_end) - 1;
                a0Var.mItems.remove(w3);
                a0Var.notifyItemRemoved(w3);
                if (w3 == -1) {
                    C8694h.f19097a.mo21306a("Something is terribly wrong, this adapter is notconfigured properly to handle shop listings");
                } else {
                    List<ListingCard> listings2 = shopListingsSearchResult.getListings();
                    int size2 = listings2.size();
                    C11192q0 q0Var2 = a0Var.f24615j;
                    q0Var2.f24753m += size2;
                    q0Var2.f24752l = i;
                    ArrayList arrayList2 = new ArrayList();
                    for (ListingCard listingCardUiModel2 : listings2) {
                        arrayList2.add(new C11202t0(R.id.view_type_shop_home_listing, new ListingCardUiModel(listingCardUiModel2, true, false, false)));
                    }
                    arrayList2.add(new C11202t0(R.id.view_type_shop_home_load_button_listings, C11127a0.m19076x(a0Var.f24615j, resources2)));
                    a0Var.mItems.addAll(w3, arrayList2);
                    a0Var.notifyItemRangeInserted(w3, arrayList2.size());
                    C11197r0.m19140b(collageTabLayout, C11197r0.m19141c(collageTabLayout, ResponseConstants.ITEMS), arrayList2.size() + w3);
                }
            }
            stopLoad();
            this.recyclerView.postDelayed(new C11141e(0, this, bVar2), 400);
        }
    }

    /* access modifiers changed from: private */
    public void lambda$fetchPageData$0(C11172k0 k0Var) throws Exception {
        if (k0Var instanceof C11172k0.C11174b) {
            handleFetchSuccess((C11172k0.C11174b) k0Var);
        } else if (k0Var instanceof C11172k0.C11173a) {
            C11172k0.C11173a aVar = (C11172k0.C11173a) k0Var;
            String str = null;
            Throwable th = aVar.f24712a;
            if (th != null) {
                str = th.getMessage();
            }
            StringBuilder l = C0023f.m111l("Shop home page failed with error: ", str, " and message: ");
            l.append(aVar.f24713b);
            String sb = l.toString();
            this.logCat.mo21306a(sb);
            this.elkLogger.mo45449a(sb);
            handleFetchFailure();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchPageData$1(Throwable th) throws Exception {
        this.logCat.error(th);
        handleFetchFailure();
    }

    /* access modifiers changed from: private */
    public void lambda$handleSearchSuccess$4(C11184o0.C11186b bVar) {
        onNewListingsResponse(bVar.f24733a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$searchListings$2(boolean z, C11184o0 o0Var) throws Exception {
        if (o0Var instanceof C11184o0.C11186b) {
            handleSearchSuccess((C11184o0.C11186b) o0Var, z);
        } else {
            handleSearchFailure(z);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$searchListings$3(boolean z, Throwable th) throws Exception {
        handleSearchFailure(z);
    }

    /* access modifiers changed from: private */
    public void lambda$translateFAQs$10(FAQs fAQs, Throwable th) throws Exception {
        fAQs.getTranslationState().setTranslationFailed();
        ((C11127a0) this.adapter).mo36813A(R.id.view_type_shop_home_structured_policies_privacy, fAQs, (Object) null);
    }

    /* access modifiers changed from: private */
    public void lambda$translateFAQs$9(MachineTranslationViewState machineTranslationViewState, FAQs fAQs, List list) throws Exception {
        if (list != null && !list.isEmpty() && this.adapter != null) {
            machineTranslationViewState.setTranslated();
            ((C11127a0) this.adapter).mo36813A(R.id.view_type_shop_home_faq_subsection_heading, fAQs, (Object) null);
            fAQs.updateTranslatedFAQs(list);
            Iterator it = fAQs.iterator();
            while (it.hasNext()) {
                ((C11127a0) this.adapter).mo36813A(R.id.view_type_shop_home_faq_content, (FAQ) it.next(), (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public void lambda$translatePrivacyOther$7(C13497g gVar, C11194r rVar) throws Exception {
        if ((rVar instanceof C11194r.C11196b) && this.adapter != null) {
            String translatedOtherPolicy = ((C11194r.C11196b) rVar).f24761a.getTranslatedOtherPolicy();
            if (gVar.f29532e.getPrivacy() != null) {
                gVar.f29532e.getPrivacy().setOtherTranslation(translatedOtherPolicy);
                gVar.f29532e.getPrivacy().getTranslationState().setTranslated();
            }
            ((C11127a0) this.adapter).mo36813A(R.id.view_type_shop_home_structured_policies_privacy, gVar, (Object) null);
        } else if (rVar instanceof C11194r.C11195a) {
            onTranslatedPrivacyPolicyError(gVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$translatePrivacyOther$8(C13497g gVar, Throwable th) throws Exception {
        onTranslatedPrivacyPolicyError(gVar);
    }

    /* access modifiers changed from: private */
    public void lambda$translateReviewMessage$5(C13394c cVar, C11244u uVar) throws Exception {
        if (!(uVar instanceof C11244u.C11246b)) {
            onTranslatedReviewError(cVar);
        } else if (this.adapter != null) {
            cVar.f29331a.setTranslatedReview(((C11244u.C11246b) uVar).f24826a.getTranslatedReview());
            ((C11127a0) this.adapter).mo36813A(R.id.view_type_shop_home_review_message, cVar, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$translateReviewMessage$6(C13394c cVar, Throwable th) throws Exception {
        onTranslatedReviewError(cVar);
    }

    private void onTranslatedPrivacyPolicyError(C13497g gVar) {
        gVar.mo46160c().setTranslationFailed();
        ((C11127a0) this.adapter).mo36813A(R.id.view_type_shop_home_structured_policies_privacy, gVar, (Object) null);
    }

    private void onTranslatedReviewError(C13394c cVar) {
        cVar.f29334d.setTranslationFailed();
        ((C11127a0) this.adapter).mo36813A(R.id.view_type_shop_home_review_message, cVar, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:173:0x0633  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0644  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x06e3  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0703  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0724  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0727  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populateAdapter(com.etsy.android.lib.models.apiv3.ShopHomePage r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.etsy.android.uikit.adapter.a<T> r2 = r0.adapter
            com.etsy.android.ui.shop.a0 r2 = (com.etsy.android.p327ui.shop.C11127a0) r2
            com.etsy.android.stylekit.views.CollageTabLayout r3 = r0.tabLayout
            if (r3 == 0) goto L_0x074d
            com.etsy.android.ui.shop.q0 r4 = r0.stateManager
            com.etsy.android.ui.shop.m0 r5 = r17.getShopHomeRouter()
            com.etsy.android.ui.shop.d0 r6 = r0.shopHomeEligibility
            java.util.ArrayList<T> r7 = r2.mItems
            r7.clear()
            r2.f24614i = r1
            r2.f24615j = r4
            o.b<com.etsy.android.lib.models.datatypes.EtsyId, o.e> r7 = r4.f24751k
            r7.clear()
            r3.removeAllTabs()
            of.b r7 = r2.f28991c
            com.etsy.android.ui.shop.v0 r7 = (com.etsy.android.p327ui.shop.C11249v0) r7
            r7.f24830j = r5
            r7.f24831k = r4
            r7.mo32273h()
            com.etsy.android.ui.shop.q0$a r5 = r2.f24616k
            r7.f24835o = r5
            java.util.ArrayList<T> r5 = r2.mItems
            int r5 = r5.size()
            com.etsy.android.lib.models.apiv3.ShopV3 r7 = r18.getShop()
            com.etsy.android.lib.models.apiv3.ShopV3 r8 = r18.getShop()
            boolean r8 = r8.isVacation()
            if (r8 == 0) goto L_0x0061
            androidx.fragment.app.FragmentActivity r8 = r2.mContext
            android.content.res.Resources r8 = r8.getResources()
            java.util.ArrayList<T> r10 = r2.mItems
            com.etsy.android.ui.shop.t0 r11 = new com.etsy.android.ui.shop.t0
            r12 = 2131430606(0x7f0b0cce, float:1.8482918E38)
            te.f r13 = new te.f
            r13.<init>(r7, r4, r8)
            r11.<init>(r12, r13)
            r10.add(r11)
            goto L_0x0085
        L_0x0061:
            com.etsy.android.lib.models.apiv3.ShopHomeMemberData r7 = r18.getMemberData()
            if (r7 == 0) goto L_0x006c
            boolean r7 = r7.isFavorer()
            goto L_0x006d
        L_0x006c:
            r7 = 0
        L_0x006d:
            com.etsy.android.ui.shop.viewholder.k r8 = new com.etsy.android.ui.shop.viewholder.k
            com.etsy.android.lib.models.apiv3.ShopV3 r10 = r18.getShop()
            r8.<init>(r10, r7)
            r2.f24617l = r8
            java.util.ArrayList<T> r7 = r2.mItems
            com.etsy.android.ui.shop.t0 r10 = new com.etsy.android.ui.shop.t0
            r11 = 2131430571(0x7f0b0cab, float:1.8482847E38)
            r10.<init>(r11, r8)
            r7.add(r10)
        L_0x0085:
            java.lang.String r7 = "shop"
            com.etsy.android.p327ui.shop.C11197r0.m19139a(r3, r7, r5)
            java.util.ArrayList<T> r5 = r2.mItems
            int r5 = r5.size()
            com.etsy.android.lib.models.apiv3.ShopV3 r7 = r18.getShop()
            boolean r7 = r7.isVacation()
            r8 = 0
            r10 = 1
            if (r7 == 0) goto L_0x009d
            goto L_0x00a3
        L_0x009d:
            java.util.List r7 = r18.getShopSections()
            if (r7 != 0) goto L_0x00a5
        L_0x00a3:
            r7 = 0
            goto L_0x00d4
        L_0x00a5:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.etsy.android.ui.shop.t0 r11 = new com.etsy.android.ui.shop.t0
            r12 = 2131430576(0x7f0b0cb0, float:1.8482857E38)
            r11.<init>(r12, r8)
            r7.add(r11)
            com.etsy.android.ui.shop.t0 r11 = new com.etsy.android.ui.shop.t0
            r12 = 2131430574(0x7f0b0cae, float:1.8482853E38)
            r11.<init>(r12, r4)
            r7.add(r11)
            r2.mo36820t(r7, r1, r4)
            com.etsy.android.ui.shop.t0 r11 = new com.etsy.android.ui.shop.t0
            r12 = 2131430575(0x7f0b0caf, float:1.8482855E38)
            r11.<init>(r12, r8)
            r7.add(r11)
            java.util.ArrayList<T> r11 = r2.mItems
            r11.addAll(r7)
            r7 = r10
        L_0x00d4:
            if (r7 == 0) goto L_0x00db
            java.lang.String r7 = "items"
            com.etsy.android.p327ui.shop.C11197r0.m19139a(r3, r7, r5)
        L_0x00db:
            com.etsy.android.lib.models.apiv3.ShopHomeMemberData r5 = r18.getMemberData()
            if (r5 != 0) goto L_0x00e2
            goto L_0x0101
        L_0x00e2:
            r4.f24754n = r10
            boolean r7 = r5.isFavorer()
            r4.f24755o = r7
            r7 = 2131430555(0x7f0b0c9b, float:1.8482814E38)
            r2.mo36813A(r7, r4, r8)
            com.etsy.android.lib.models.apiv3.ShopV3 r7 = r18.getShop()
            boolean r7 = r7.isVacation()
            if (r7 == 0) goto L_0x0101
            boolean r5 = r5.isSubscribedToVacationNotification()
            r2.mo36824z(r5)
        L_0x0101:
            java.util.ArrayList<T> r5 = r2.mItems
            int r5 = r5.size()
            com.etsy.android.lib.models.apiv3.ShopV3 r7 = r18.getShop()
            com.etsy.android.lib.models.apiv3.ShopReviewsResult r11 = r18.getShopReviews()
            com.etsy.android.lib.models.apiv3.ShopV3 r12 = r18.getShop()
            com.etsy.android.lib.models.apiv3.listing.ShopRating r12 = r12.getShopRating()
            if (r11 == 0) goto L_0x0121
            int r13 = r11.getCount()
            if (r13 <= 0) goto L_0x0121
            r13 = r10
            goto L_0x0122
        L_0x0121:
            r13 = 0
        L_0x0122:
            r14 = 2131951693(0x7f13004d, float:1.9539808E38)
            if (r13 == 0) goto L_0x01e2
            if (r12 == 0) goto L_0x01e2
            com.etsy.android.lib.config.e r13 = r6.f24633a
            com.etsy.android.lib.config.EtsyConfigKey r9 = com.etsy.android.lib.config.C8592b.C8607o.f18914a
            boolean r9 = r13.mo21132b(r9)
            if (r9 == 0) goto L_0x01e2
            androidx.fragment.app.FragmentActivity r9 = r2.mContext
            android.content.res.Resources r9 = r9.getResources()
            if (r11 == 0) goto L_0x01a9
            int r13 = r11.getCount()
            if (r13 > 0) goto L_0x0142
            goto L_0x01a9
        L_0x0142:
            te.d r13 = new te.d
            r13.<init>(r12)
            int r12 = r11.getCount()
            r15 = 3
            if (r12 <= r15) goto L_0x0166
            com.etsy.android.lib.config.e r6 = r6.f24633a
            com.etsy.android.lib.config.EtsyConfigKey r12 = com.etsy.android.lib.config.C8592b.C8607o.f18915b
            boolean r6 = r6.mo21132b(r12)
            if (r6 == 0) goto L_0x0166
            java.util.ArrayList<T> r6 = r2.mItems
            com.etsy.android.ui.shop.t0 r12 = new com.etsy.android.ui.shop.t0
            r15 = 2131430589(0x7f0b0cbd, float:1.8482883E38)
            r12.<init>(r15, r13)
            r6.add(r12)
            goto L_0x0173
        L_0x0166:
            java.util.ArrayList<T> r6 = r2.mItems
            com.etsy.android.ui.shop.t0 r12 = new com.etsy.android.ui.shop.t0
            r15 = 2131430588(0x7f0b0cbc, float:1.8482881E38)
            r12.<init>(r15, r13)
            r6.add(r12)
        L_0x0173:
            java.util.List r6 = r11.getReviews()
            int r12 = r6.size()
            java.util.ArrayList<T> r13 = r2.mItems
            java.util.ArrayList r6 = com.etsy.android.p327ui.shop.C11127a0.m19075u(r6, r7, r4)
            r13.addAll(r6)
            int r6 = r11.getCount()
            if (r6 <= r12) goto L_0x018c
            r6 = r10
            goto L_0x018d
        L_0x018c:
            r6 = 0
        L_0x018d:
            if (r6 == 0) goto L_0x025d
            com.etsy.android.uikit.viewholder.k$a r6 = new com.etsy.android.uikit.viewholder.k$a
            java.lang.String r7 = r9.getString(r14)
            r6.<init>(r7, r8)
            r6.f26736c = r10
            java.util.ArrayList<T> r7 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            r11 = 2131430579(0x7f0b0cb3, float:1.8482863E38)
            r9.<init>(r11, r6)
            r7.add(r9)
            goto L_0x025d
        L_0x01a9:
            com.etsy.android.ui.shop.viewholder.k0$a r6 = new com.etsy.android.ui.shop.viewholder.k0$a
            double r11 = r7.getAverageRating()
            float r11 = (float) r11
            int r7 = r7.getTotalRatingCount()
            r6.<init>(r11, r7)
            java.util.ArrayList<T> r7 = r2.mItems
            com.etsy.android.ui.shop.t0 r11 = new com.etsy.android.ui.shop.t0
            r12 = 2131430587(0x7f0b0cbb, float:1.848288E38)
            r11.<init>(r12, r6)
            r7.add(r11)
            java.util.ArrayList<T> r6 = r2.mItems
            com.etsy.android.ui.shop.t0 r7 = new com.etsy.android.ui.shop.t0
            com.etsy.android.ui.shop.viewholder.a$a r11 = new com.etsy.android.ui.shop.viewholder.a$a
            r12 = 2131953492(0x7f130754, float:1.9543457E38)
            java.lang.String r9 = r9.getString(r12)
            r12 = 2131232239(0x7f0805ef, float:1.8080582E38)
            r11.<init>(r12, r9)
            r9 = 2131430560(0x7f0b0ca0, float:1.8482824E38)
            r7.<init>(r9, r11)
            r6.add(r7)
            goto L_0x025d
        L_0x01e2:
            androidx.fragment.app.FragmentActivity r6 = r2.mContext
            com.etsy.android.ui.shop.viewholder.k0$a r9 = new com.etsy.android.ui.shop.viewholder.k0$a
            double r12 = r7.getAverageRating()
            float r12 = (float) r12
            int r13 = r7.getTotalRatingCount()
            r9.<init>(r12, r13)
            java.util.ArrayList<T> r12 = r2.mItems
            com.etsy.android.ui.shop.t0 r13 = new com.etsy.android.ui.shop.t0
            r15 = 2131430587(0x7f0b0cbb, float:1.848288E38)
            r13.<init>(r15, r9)
            r12.add(r13)
            android.content.res.Resources r6 = r6.getResources()
            if (r11 == 0) goto L_0x0241
            int r9 = r11.getCount()
            if (r9 > 0) goto L_0x020c
            goto L_0x0241
        L_0x020c:
            java.util.List r9 = r11.getReviews()
            int r12 = r9.size()
            java.util.ArrayList<T> r13 = r2.mItems
            java.util.ArrayList r7 = com.etsy.android.p327ui.shop.C11127a0.m19075u(r9, r7, r4)
            r13.addAll(r7)
            int r7 = r11.getCount()
            if (r7 <= r12) goto L_0x0225
            r7 = r10
            goto L_0x0226
        L_0x0225:
            r7 = 0
        L_0x0226:
            if (r7 == 0) goto L_0x025d
            com.etsy.android.uikit.viewholder.k$a r7 = new com.etsy.android.uikit.viewholder.k$a
            java.lang.String r6 = r6.getString(r14)
            r7.<init>(r6, r8)
            r7.f26736c = r10
            java.util.ArrayList<T> r6 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            r11 = 2131430579(0x7f0b0cb3, float:1.8482863E38)
            r9.<init>(r11, r7)
            r6.add(r9)
            goto L_0x025d
        L_0x0241:
            java.util.ArrayList<T> r7 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            com.etsy.android.ui.shop.viewholder.a$a r11 = new com.etsy.android.ui.shop.viewholder.a$a
            r12 = 2131953492(0x7f130754, float:1.9543457E38)
            java.lang.String r6 = r6.getString(r12)
            r12 = 2131232239(0x7f0805ef, float:1.8080582E38)
            r11.<init>(r12, r6)
            r6 = 2131430560(0x7f0b0ca0, float:1.8482824E38)
            r9.<init>(r6, r11)
            r7.add(r9)
        L_0x025d:
            java.lang.String r6 = "reviews"
            com.etsy.android.p327ui.shop.C11197r0.m19139a(r3, r6, r5)
            java.util.ArrayList<T> r5 = r2.mItems
            int r5 = r5.size()
            com.etsy.android.lib.models.ShopAbout r6 = r18.getShopAbout()
            r7 = 2131430604(0x7f0b0ccc, float:1.8482914E38)
            r13 = 2131430596(0x7f0b0cc4, float:1.8482897E38)
            if (r6 == 0) goto L_0x03a8
            boolean r6 = r18.hasAboutSection()
            if (r6 == 0) goto L_0x03a8
            com.etsy.android.lib.models.ShopAbout r6 = r18.getShopAbout()
            androidx.fragment.app.FragmentActivity r14 = r2.mContext
            android.content.res.Resources r14 = r14.getResources()
            com.etsy.android.lib.models.apiv3.ShopV3 r15 = r18.getShop()
            ue.a r8 = new ue.a
            java.lang.String r15 = r15.getName()
            com.etsy.android.ui.shop.q0 r10 = r2.f24615j
            r8.<init>(r15, r6, r10)
            java.util.ArrayList<T> r10 = r2.mItems
            com.etsy.android.ui.shop.t0 r15 = new com.etsy.android.ui.shop.t0
            r15.<init>(r13, r8)
            r10.add(r15)
            java.util.List r10 = r6.getImages()
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x02b4
            java.util.ArrayList<T> r10 = r2.mItems
            com.etsy.android.ui.shop.t0 r15 = new com.etsy.android.ui.shop.t0
            r13 = 2131430554(0x7f0b0c9a, float:1.8482812E38)
            r15.<init>(r13, r8)
            r10.add(r15)
        L_0x02b4:
            java.lang.String r10 = r6.getStory()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            r13 = 2131430590(0x7f0b0cbe, float:1.8482885E38)
            if (r10 != 0) goto L_0x02cb
            java.util.ArrayList<T> r10 = r2.mItems
            com.etsy.android.ui.shop.t0 r15 = new com.etsy.android.ui.shop.t0
            r15.<init>(r13, r8)
            r10.add(r15)
        L_0x02cb:
            java.util.List r8 = r6.getLinks()
            java.util.List r10 = r6.getLinks()
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x030c
            java.util.ArrayList<T> r10 = r2.mItems
            com.etsy.android.ui.shop.t0 r15 = new com.etsy.android.ui.shop.t0
            com.etsy.android.ui.shop.z r13 = new com.etsy.android.ui.shop.z
            r13.<init>()
            r15.<init>(r7, r13)
            r10.add(r15)
            int r10 = r8.size()
            r13 = 0
        L_0x02ed:
            if (r13 >= r10) goto L_0x030c
            java.lang.Object r15 = r8.get(r13)
            com.etsy.android.lib.models.ShopRelatedLink r15 = (com.etsy.android.lib.models.ShopRelatedLink) r15
            boolean r16 = com.etsy.android.lib.models.ShopRelatedLinkExtensionsKt.isValid(r15)
            if (r16 != 0) goto L_0x02fc
            goto L_0x0309
        L_0x02fc:
            java.util.ArrayList<T> r9 = r2.mItems
            com.etsy.android.ui.shop.t0 r12 = new com.etsy.android.ui.shop.t0
            r11 = 2131430582(0x7f0b0cb6, float:1.848287E38)
            r12.<init>(r11, r15)
            r9.add(r12)
        L_0x0309:
            int r13 = r13 + 1
            goto L_0x02ed
        L_0x030c:
            java.util.List r6 = r6.getMembers()
            int r8 = r6.size()
            if (r8 <= 0) goto L_0x0366
            java.util.ArrayList<T> r8 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            r10 = 2131953485(0x7f13074d, float:1.9543442E38)
            com.etsy.android.ui.shop.b0 r11 = new com.etsy.android.ui.shop.b0
            r11.<init>(r10)
            r9.<init>(r7, r11)
            r8.add(r9)
            int r8 = r6.size()
            r9 = 0
        L_0x032d:
            if (r9 >= r8) goto L_0x034c
            te.a r10 = new te.a
            java.lang.Object r11 = r6.get(r9)
            com.etsy.android.lib.models.ShopAboutMember r11 = (com.etsy.android.lib.models.ShopAboutMember) r11
            com.etsy.android.ui.shop.q0 r12 = r2.f24615j
            r10.<init>(r11, r12)
            java.util.ArrayList<T> r11 = r2.mItems
            com.etsy.android.ui.shop.t0 r12 = new com.etsy.android.ui.shop.t0
            r13 = 2131430564(0x7f0b0ca4, float:1.8482833E38)
            r12.<init>(r13, r10)
            r11.add(r12)
            int r9 = r9 + 1
            goto L_0x032d
        L_0x034c:
            java.util.ArrayList<T> r6 = r2.mItems
            com.etsy.android.ui.shop.t0 r8 = new com.etsy.android.ui.shop.t0
            com.etsy.android.uikit.viewholder.y$a r9 = new com.etsy.android.uikit.viewholder.y$a
            r10 = 2131165633(0x7f0701c1, float:1.7945489E38)
            int r11 = r14.getDimensionPixelOffset(r10)
            r10 = -1
            r12 = 2131430592(0x7f0b0cc0, float:1.848289E38)
            r9.<init>(r10, r11, r12)
            r8.<init>(r12, r9)
            r6.add(r8)
        L_0x0366:
            java.util.List r6 = r18.getManufacturers()
            if (r6 == 0) goto L_0x03a6
            int r8 = r6.size()
            if (r8 <= 0) goto L_0x03a6
            java.util.ArrayList<T> r8 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            r10 = 2131953495(0x7f130757, float:1.9543463E38)
            com.etsy.android.ui.shop.b0 r11 = new com.etsy.android.ui.shop.b0
            r11.<init>(r10)
            r9.<init>(r7, r11)
            r8.add(r9)
            int r8 = r6.size()
            r9 = 0
        L_0x0389:
            if (r9 >= r8) goto L_0x03a6
            java.util.ArrayList<T> r10 = r2.mItems
            com.etsy.android.ui.shop.t0 r11 = new com.etsy.android.ui.shop.t0
            ue.d r12 = new ue.d
            java.lang.Object r13 = r6.get(r9)
            com.etsy.android.lib.models.Manufacturer r13 = (com.etsy.android.lib.models.Manufacturer) r13
            r12.<init>(r13)
            r13 = 2131430590(0x7f0b0cbe, float:1.8482885E38)
            r11.<init>(r13, r12)
            r10.add(r11)
            int r9 = r9 + 1
            goto L_0x0389
        L_0x03a6:
            r6 = 1
            goto L_0x03a9
        L_0x03a8:
            r6 = 0
        L_0x03a9:
            if (r6 == 0) goto L_0x03b0
            java.lang.String r6 = "about"
            com.etsy.android.p327ui.shop.C11197r0.m19139a(r3, r6, r5)
        L_0x03b0:
            java.util.ArrayList<T> r5 = r2.mItems
            int r5 = r5.size()
            com.etsy.android.lib.models.apiv3.ShopV3 r6 = r18.getShop()
            java.util.List<java.lang.String> r8 = com.etsy.android.lib.config.C8591a.f18700r
            com.etsy.android.lib.config.a r8 = p628nj.C18263b.f40056T
            com.etsy.android.lib.config.e r8 = r8.f18706f
            com.etsy.android.lib.config.EtsyConfigKey r9 = com.etsy.android.lib.config.C8592b.f18839w
            boolean r8 = r8.mo21132b(r9)
            r9 = 1
            r8 = r8 ^ r9
            java.lang.Boolean r10 = r18.getUseListingLevelReturnPolicies()
            if (r10 == 0) goto L_0x03d7
            java.lang.Boolean r10 = r18.getUseListingLevelReturnPolicies()
            boolean r10 = r10.booleanValue()
            goto L_0x03d8
        L_0x03d7:
            r10 = 0
        L_0x03d8:
            boolean r11 = r6.getHasPublishedStructuredRefundsPolicy()
            r12 = 2131953470(0x7f13073e, float:1.9543412E38)
            r13 = 2131952756(0x7f130474, float:1.9541964E38)
            r9 = 2131951669(0x7f130035, float:1.953976E38)
            r14 = 2131953604(0x7f1307c4, float:1.9543684E38)
            if (r11 == 0) goto L_0x0475
            if (r8 == 0) goto L_0x0475
            com.etsy.android.lib.models.apiv3.ShopPolicy r6 = r18.getShopPolicy()
            com.etsy.android.lib.models.apiv3.StructuredShopPolicies r8 = r18.getStructuredShopPolicies()
            if (r6 == 0) goto L_0x0630
            boolean r11 = r6.isEmpty()
            if (r11 != 0) goto L_0x0630
            if (r8 == 0) goto L_0x0630
            r18.getShop()
            com.etsy.android.lib.models.apiv3.ShopListingLevelReturnPolicies r11 = r18.getReturnPolicies()
            ue.g r15 = new ue.g
            r15.<init>(r8, r4, r6, r10)
            r2.mo36819s(r6)
            if (r10 == 0) goto L_0x0412
            r2.mo36817q(r11)
        L_0x0412:
            com.etsy.android.lib.models.apiv3.StructuredShopRefunds r4 = r8.getRefunds()
            if (r4 == 0) goto L_0x0447
            com.etsy.android.lib.models.apiv3.StructuredShopRefunds r4 = r8.getRefunds()
            java.lang.Boolean r4 = r4.getAcceptsCancellations()
            if (r4 == 0) goto L_0x0447
            if (r10 == 0) goto L_0x0428
            r4 = 2131953517(0x7f13076d, float:1.9543507E38)
            goto L_0x042b
        L_0x0428:
            r4 = 2131953616(0x7f1307d0, float:1.9543708E38)
        L_0x042b:
            java.util.ArrayList<T> r8 = r2.mItems
            com.etsy.android.ui.shop.t0 r10 = new com.etsy.android.ui.shop.t0
            com.etsy.android.ui.shop.b0 r11 = new com.etsy.android.ui.shop.b0
            r11.<init>(r4)
            r10.<init>(r7, r11)
            r8.add(r10)
            java.util.ArrayList<T> r4 = r2.mItems
            com.etsy.android.ui.shop.t0 r8 = new com.etsy.android.ui.shop.t0
            r10 = 2131430568(0x7f0b0ca8, float:1.848284E38)
            r8.<init>(r10, r15)
            r4.add(r8)
        L_0x0447:
            java.lang.String r4 = r6.getPaymentPolicy()
            java.lang.String r8 = r6.getPaymentPolicyTranslated()
            r2.mo36818r(r13, r4, r8)
            java.lang.String r4 = r6.getShippingPolicy()
            java.lang.String r8 = r6.getShippingPolicyTranslated()
            r2.mo36818r(r12, r4, r8)
            java.lang.String r4 = r6.getPrivacyPolicy()
            java.lang.String r8 = r6.getPrivacyPolicyTranslated()
            r2.mo36818r(r14, r4, r8)
            java.lang.String r4 = r6.getAdditionalInformationMessage()
            java.lang.String r6 = r6.getAdditionalInformationMessageTranslated()
            r2.mo36818r(r9, r4, r6)
            goto L_0x062e
        L_0x0475:
            boolean r6 = r6.isUsingStructuredPolicies()
            if (r6 == 0) goto L_0x05ca
            com.etsy.android.lib.models.apiv3.StructuredShopPolicies r6 = r18.getStructuredShopPolicies()
            if (r6 == 0) goto L_0x0630
            com.etsy.android.lib.models.apiv3.ShopV3 r8 = r18.getShop()
            com.etsy.android.lib.models.apiv3.ShopListingLevelReturnPolicies r9 = r18.getReturnPolicies()
            ue.g r11 = new ue.g
            r12 = 0
            r11.<init>(r6, r4, r12, r10)
            java.util.ArrayList<T> r4 = r2.mItems
            com.etsy.android.ui.shop.t0 r12 = new com.etsy.android.ui.shop.t0
            r13 = 2131430596(0x7f0b0cc4, float:1.8482897E38)
            r12.<init>(r13, r11)
            r4.add(r12)
            boolean r4 = r6.includeResolutionLink()
            if (r4 == 0) goto L_0x04b7
            java.util.ArrayList<T> r4 = r2.mItems
            com.etsy.android.ui.shop.t0 r12 = new com.etsy.android.ui.shop.t0
            r13 = 2131430559(0x7f0b0c9f, float:1.8482822E38)
            r15 = 2131952101(0x7f1301e5, float:1.9540635E38)
            com.etsy.android.ui.shop.b0 r14 = new com.etsy.android.ui.shop.b0
            r14.<init>(r15)
            r12.<init>(r13, r14)
            r4.add(r12)
        L_0x04b7:
            boolean r4 = r8.hasOnlyDigitalListings()
            if (r4 != 0) goto L_0x04e2
            com.etsy.android.lib.models.apiv3.StructuredShopShipping r4 = r6.getShipping()
            if (r4 == 0) goto L_0x04e2
            java.util.ArrayList<T> r4 = r2.mItems
            com.etsy.android.ui.shop.t0 r12 = new com.etsy.android.ui.shop.t0
            r13 = 2131953617(0x7f1307d1, float:1.954371E38)
            com.etsy.android.ui.shop.b0 r14 = new com.etsy.android.ui.shop.b0
            r14.<init>(r13)
            r12.<init>(r7, r14)
            r4.add(r12)
            java.util.ArrayList<T> r4 = r2.mItems
            com.etsy.android.ui.shop.t0 r12 = new com.etsy.android.ui.shop.t0
            r13 = 2131430603(0x7f0b0ccb, float:1.8482912E38)
            r12.<init>(r13, r11)
            r4.add(r12)
        L_0x04e2:
            int r4 = r8.getDigitalListingCount()
            if (r4 <= 0) goto L_0x0507
            java.util.ArrayList<T> r4 = r2.mItems
            com.etsy.android.ui.shop.t0 r12 = new com.etsy.android.ui.shop.t0
            r13 = 2131953623(0x7f1307d7, float:1.9543722E38)
            com.etsy.android.ui.shop.b0 r14 = new com.etsy.android.ui.shop.b0
            r14.<init>(r13)
            r12.<init>(r7, r14)
            r4.add(r12)
            java.util.ArrayList<T> r4 = r2.mItems
            com.etsy.android.ui.shop.t0 r12 = new com.etsy.android.ui.shop.t0
            r13 = 2131430600(0x7f0b0cc8, float:1.8482906E38)
            r12.<init>(r13, r11)
            r4.add(r12)
        L_0x0507:
            com.etsy.android.lib.models.apiv3.StructuredShopPayments r4 = r6.getPayments()
            if (r4 == 0) goto L_0x0532
            boolean r4 = r4.hasPaymentMethods()
            if (r4 == 0) goto L_0x0532
            java.util.ArrayList<T> r4 = r2.mItems
            com.etsy.android.ui.shop.t0 r12 = new com.etsy.android.ui.shop.t0
            r13 = 2131953595(0x7f1307bb, float:1.9543665E38)
            com.etsy.android.ui.shop.b0 r14 = new com.etsy.android.ui.shop.b0
            r14.<init>(r13)
            r12.<init>(r7, r14)
            r4.add(r12)
            java.util.ArrayList<T> r4 = r2.mItems
            com.etsy.android.ui.shop.t0 r12 = new com.etsy.android.ui.shop.t0
            r13 = 2131430601(0x7f0b0cc9, float:1.8482908E38)
            r12.<init>(r13, r11)
            r4.add(r12)
        L_0x0532:
            if (r10 == 0) goto L_0x0537
            r2.mo36817q(r9)
        L_0x0537:
            com.etsy.android.lib.models.apiv3.StructuredShopRefunds r4 = r6.getRefunds()
            if (r4 == 0) goto L_0x056c
            com.etsy.android.lib.models.apiv3.StructuredShopRefunds r4 = r6.getRefunds()
            java.lang.Boolean r4 = r4.getAcceptsCancellations()
            if (r4 == 0) goto L_0x056c
            if (r10 == 0) goto L_0x054d
            r14 = 2131953517(0x7f13076d, float:1.9543507E38)
            goto L_0x0550
        L_0x054d:
            r14 = 2131953616(0x7f1307d0, float:1.9543708E38)
        L_0x0550:
            java.util.ArrayList<T> r4 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            com.etsy.android.ui.shop.b0 r10 = new com.etsy.android.ui.shop.b0
            r10.<init>(r14)
            r9.<init>(r7, r10)
            r4.add(r9)
            java.util.ArrayList<T> r4 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            r10 = 2131430581(0x7f0b0cb5, float:1.8482867E38)
            r9.<init>(r10, r11)
            r4.add(r9)
        L_0x056c:
            com.etsy.android.lib.models.apiv3.StructuredShopPrivacy r4 = r6.getPrivacy()
            if (r4 == 0) goto L_0x0597
            boolean r4 = r4.hasAnyEnabledFlags()
            if (r4 == 0) goto L_0x0597
            java.util.ArrayList<T> r4 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            com.etsy.android.ui.shop.b0 r10 = new com.etsy.android.ui.shop.b0
            r12 = 2131953604(0x7f1307c4, float:1.9543684E38)
            r10.<init>(r12)
            r9.<init>(r7, r10)
            r4.add(r9)
            java.util.ArrayList<T> r4 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            r10 = 2131430602(0x7f0b0cca, float:1.848291E38)
            r9.<init>(r10, r11)
            r4.add(r9)
        L_0x0597:
            java.lang.String r4 = r6.getTermsAndConditions()
            boolean r6 = com.etsy.android.lib.util.C8885d0.m17323g(r4)
            if (r6 == 0) goto L_0x062e
            java.util.ArrayList<T> r6 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            r10 = 2131953645(0x7f1307ed, float:1.9543767E38)
            com.etsy.android.ui.shop.b0 r11 = new com.etsy.android.ui.shop.b0
            r11.<init>(r10)
            r9.<init>(r7, r11)
            r6.add(r9)
            java.util.ArrayList<T> r6 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            r10 = 2131430605(0x7f0b0ccd, float:1.8482916E38)
            ue.i r11 = new ue.i
            java.lang.String r8 = r8.getShopName()
            r11.<init>(r4, r8)
            r9.<init>(r10, r11)
            r6.add(r9)
            goto L_0x062e
        L_0x05ca:
            com.etsy.android.lib.models.apiv3.ShopPolicy r4 = r18.getShopPolicy()
            if (r4 == 0) goto L_0x0621
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x0621
            r2.mo36819s(r4)
            com.etsy.android.lib.models.apiv3.ShopListingLevelReturnPolicies r6 = r18.getReturnPolicies()
            java.lang.String r8 = r4.getPaymentPolicy()
            java.lang.String r11 = r4.getPaymentPolicyTranslated()
            r2.mo36818r(r13, r8, r11)
            java.lang.String r8 = r4.getShippingPolicy()
            java.lang.String r11 = r4.getShippingPolicyTranslated()
            r2.mo36818r(r12, r8, r11)
            if (r10 == 0) goto L_0x05f9
            r2.mo36817q(r6)
            goto L_0x0607
        L_0x05f9:
            r6 = 2131953320(0x7f1306a8, float:1.9543108E38)
            java.lang.String r8 = r4.getRefundPolicy()
            java.lang.String r10 = r4.getRefundPolicyTranslated()
            r2.mo36818r(r6, r8, r10)
        L_0x0607:
            java.lang.String r6 = r4.getPrivacyPolicy()
            java.lang.String r8 = r4.getPrivacyPolicyTranslated()
            r10 = 2131953604(0x7f1307c4, float:1.9543684E38)
            r2.mo36818r(r10, r6, r8)
            java.lang.String r6 = r4.getAdditionalInformationMessage()
            java.lang.String r4 = r4.getAdditionalInformationMessageTranslated()
            r2.mo36818r(r9, r6, r4)
            goto L_0x062e
        L_0x0621:
            if (r10 == 0) goto L_0x0630
            r4 = 0
            r2.mo36819s(r4)
            com.etsy.android.lib.models.apiv3.ShopListingLevelReturnPolicies r4 = r18.getReturnPolicies()
            r2.mo36817q(r4)
        L_0x062e:
            r4 = 1
            goto L_0x0631
        L_0x0630:
            r4 = 0
        L_0x0631:
            if (r4 == 0) goto L_0x0638
            java.lang.String r4 = "policies"
            com.etsy.android.p327ui.shop.C11197r0.m19139a(r3, r4, r5)
        L_0x0638:
            java.util.ArrayList<T> r4 = r2.mItems
            int r4 = r4.size()
            boolean r5 = r18.hasMoreSection()
            if (r5 == 0) goto L_0x06e3
            com.etsy.android.lib.models.apiv3.SellerDetails r5 = r18.getSellerDetails()
            com.etsy.android.lib.models.apiv3.FAQs r6 = r18.getFAQs()
            r18.getShop()
            ue.e r8 = new ue.e
            r8.<init>(r5)
            java.util.ArrayList<T> r5 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            r10 = 2131430596(0x7f0b0cc4, float:1.8482897E38)
            r9.<init>(r10, r8)
            r5.add(r9)
            if (r6 == 0) goto L_0x06b3
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L_0x06b3
            com.etsy.android.lib.logger.p r5 = r2.f28995g
            com.etsy.android.lib.config.e r5 = r5.f19116n
            com.etsy.android.lib.config.EtsyConfigKey r9 = com.etsy.android.lib.config.C8592b.C8595c.f18865i
            boolean r5 = r5.mo21132b(r9)
            if (r5 == 0) goto L_0x0688
            java.util.ArrayList<T> r5 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            r10 = 2131952249(0x7f130279, float:1.9540935E38)
            com.etsy.android.ui.shop.b0 r11 = new com.etsy.android.ui.shop.b0
            r11.<init>(r10)
            r9.<init>(r7, r11)
            r5.add(r9)
            goto L_0x0695
        L_0x0688:
            java.util.ArrayList<T> r5 = r2.mItems
            com.etsy.android.ui.shop.t0 r9 = new com.etsy.android.ui.shop.t0
            r10 = 2131430562(0x7f0b0ca2, float:1.8482828E38)
            r9.<init>(r10, r6)
            r5.add(r9)
        L_0x0695:
            java.util.Iterator r5 = r6.iterator()
        L_0x0699:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x06b3
            java.lang.Object r6 = r5.next()
            com.etsy.android.lib.models.apiv3.FAQ r6 = (com.etsy.android.lib.models.apiv3.FAQ) r6
            java.util.ArrayList<T> r9 = r2.mItems
            com.etsy.android.ui.shop.t0 r10 = new com.etsy.android.ui.shop.t0
            r11 = 2131430561(0x7f0b0ca1, float:1.8482826E38)
            r10.<init>(r11, r6)
            r9.add(r10)
            goto L_0x0699
        L_0x06b3:
            com.etsy.android.lib.models.apiv3.SellerDetails r5 = r8.f29526b
            if (r5 == 0) goto L_0x06bf
            boolean r5 = r5.hasDetails()
            if (r5 == 0) goto L_0x06bf
            r5 = 1
            goto L_0x06c0
        L_0x06bf:
            r5 = 0
        L_0x06c0:
            if (r5 == 0) goto L_0x06e1
            java.util.ArrayList<T> r5 = r2.mItems
            com.etsy.android.ui.shop.t0 r6 = new com.etsy.android.ui.shop.t0
            r9 = 2131953506(0x7f130762, float:1.9543485E38)
            com.etsy.android.ui.shop.b0 r10 = new com.etsy.android.ui.shop.b0
            r10.<init>(r9)
            r6.<init>(r7, r10)
            r5.add(r6)
            java.util.ArrayList<T> r5 = r2.mItems
            com.etsy.android.ui.shop.t0 r6 = new com.etsy.android.ui.shop.t0
            r7 = 2131430598(0x7f0b0cc6, float:1.8482901E38)
            r6.<init>(r7, r8)
            r5.add(r6)
        L_0x06e1:
            r5 = 1
            goto L_0x06e4
        L_0x06e3:
            r5 = 0
        L_0x06e4:
            if (r5 == 0) goto L_0x06eb
            java.lang.String r5 = "more"
            com.etsy.android.p327ui.shop.C11197r0.m19139a(r3, r5, r4)
        L_0x06eb:
            java.util.ArrayList<T> r4 = r2.mItems
            int r4 = r4.size()
            boolean r1 = r18.getIncludesTranslations()
            if (r1 == 0) goto L_0x0724
            com.etsy.android.lib.logger.p r1 = r2.f28995g
            com.etsy.android.lib.config.e r1 = r1.f19116n
            com.etsy.android.lib.config.EtsyConfigKey r5 = com.etsy.android.lib.config.C8592b.C8595c.f18865i
            boolean r1 = r1.mo21132b(r5)
            if (r1 == 0) goto L_0x0724
            ue.h r1 = new ue.h
            r1.<init>()
            java.util.ArrayList<T> r5 = r2.mItems
            com.etsy.android.ui.shop.t0 r6 = new com.etsy.android.ui.shop.t0
            r7 = 2131430596(0x7f0b0cc4, float:1.8482897E38)
            r6.<init>(r7, r1)
            r5.add(r6)
            java.util.ArrayList<T> r5 = r2.mItems
            com.etsy.android.ui.shop.t0 r6 = new com.etsy.android.ui.shop.t0
            r7 = 2131430609(0x7f0b0cd1, float:1.8482924E38)
            r6.<init>(r7, r1)
            r5.add(r6)
            r9 = 1
            goto L_0x0725
        L_0x0724:
            r9 = 0
        L_0x0725:
            if (r9 == 0) goto L_0x072c
            java.lang.String r1 = "translations"
            com.etsy.android.p327ui.shop.C11197r0.m19139a(r3, r1, r4)
        L_0x072c:
            java.util.ArrayList<T> r1 = r2.mItems
            com.etsy.android.ui.shop.t0 r4 = new com.etsy.android.ui.shop.t0
            android.content.res.Resources r3 = r3.getResources()
            com.etsy.android.uikit.viewholder.y$a r5 = new com.etsy.android.uikit.viewholder.y$a
            r6 = 2131165633(0x7f0701c1, float:1.7945489E38)
            int r3 = r3.getDimensionPixelOffset(r6)
            r6 = -1
            r7 = 2131430592(0x7f0b0cc0, float:1.848289E38)
            r5.<init>(r6, r3, r7)
            r4.<init>(r7, r5)
            r1.add(r4)
            r2.notifyDataSetChanged()
        L_0x074d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.shop.BaseShopHomeFragment.populateAdapter(com.etsy.android.lib.models.apiv3.ShopHomePage):void");
    }

    private void saveState() {
        C11869a aVar = (C11869a) this.transactionViewModel.f26405b;
        ShopHomePage shopHomePage = ((C11127a0) this.adapter).f24614i;
        if (shopHomePage != null) {
            aVar.mo38349f(SHOP_DATA, shopHomePage);
        }
        RecyclerView recyclerView = this.recyclerView;
        if (!(recyclerView == null || recyclerView.getLayoutManager() == null)) {
            aVar.mo38349f(RECYCLERVIEW_LAYOUT, this.recyclerView.getLayoutManager().mo11306k0());
        }
        aVar.mo38349f("shop_id", this.shopId);
        aVar.mo38349f(ResponseConstants.SHOP_NAME, this.shopName);
        aVar.mo38349f(DID_INITIAL_PAGE_LOAD, Boolean.valueOf(this.didInitialPageLoad));
        String str = this.listingId;
        if (str != null) {
            aVar.mo38349f("referring_listing_id", str);
        }
    }

    private void searchListings(boolean z) {
        C7091a aVar = this.disposable;
        BaseShopHomePageRepository baseShopHomePageRepository2 = this.baseShopHomePageRepository;
        EtsyId etsyId = this.shopId;
        C11192q0 q0Var = this.stateManager;
        String str = q0Var.f24745e;
        ShopSection shopSection = q0Var.f24746f;
        ShopHomeSortOption shopHomeSortOption = q0Var.f24748h;
        int i = q0Var.f24753m;
        C19383o.m32797g(str, "searchedQuery");
        baseShopHomePageRepository2.getClass();
        C11169j jVar = baseShopHomePageRepository2.f24594a;
        String id = etsyId != null ? etsyId.getId() : null;
        String obj = C19459m.m33035H1(str).toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("limit", "24");
        boolean z2 = false;
        if (!z) {
            i = 0;
        }
        linkedHashMap.put("offset", String.valueOf(i));
        if (shopHomeSortOption != null) {
            String optionId = shopHomeSortOption.getOptionId();
            C19383o.m32796f(optionId, "it.optionId");
            String str2 = (String) linkedHashMap.put(ResponseConstants.SORT_ORDER, optionId);
        }
        if (obj.length() > 0) {
            linkedHashMap.put("search_query", obj);
        } else {
            if (shopSection != null && !shopSection.isAllItemsSection()) {
                z2 = true;
            }
            if (z2) {
                linkedHashMap.put("section_id", shopSection.getShopSectionId().toString());
            }
        }
        linkedHashMap.put("include_additional_listing_images", String.valueOf(1));
        C8071s<C20145v<C19928a0>> a = jVar.mo36837a(id, C19294b0.m32568y0(linkedHashMap));
        C13033c cVar = new C13033c(baseShopHomePageRepository2, 3);
        a.getClass();
        aVar.mo19403b(C0391c.m1056b(this.rxSchedulers, C0326j.m860e(this.rxSchedulers, new C19208j(a, cVar))).mo20658g(new C11130b(this, z), new C11133c(this, z)));
    }

    public abstract void didChangeTabSelectionOnScroll(String str);

    public void didClearSearch() {
        C11127a0 a0Var = (C11127a0) this.adapter;
        if (a0Var != null) {
            CollageTabLayout collageTabLayout = this.tabLayout;
            ShopHomePage shopHomePage = a0Var.f24614i;
            if (shopHomePage != null && shopHomePage.getShopSections() != null && a0Var.f24615j != null) {
                int w = a0Var.mo36822w(R.id.view_type_shop_home_items_search_redesign) + 1;
                int w2 = a0Var.mo36822w(R.id.view_type_shop_home_items_section_end);
                if (w == -1 || w2 == -1 || w2 <= w) {
                    C8694h.f19097a.mo21306a("Something is terribly wrong, this adapter is notconfigured properly to handle shop listings");
                    return;
                }
                int i = w2 - w;
                a0Var.mItems.subList(w, w + i).clear();
                a0Var.notifyItemRangeRemoved(w, i);
                ArrayList arrayList = new ArrayList();
                a0Var.mo36820t(arrayList, a0Var.f24614i, a0Var.f24615j);
                a0Var.mItems.addAll(w, arrayList);
                a0Var.notifyItemRangeInserted(w, arrayList.size());
                C11197r0.m19140b(collageTabLayout, C11197r0.m19141c(collageTabLayout, ResponseConstants.ITEMS), arrayList.size() + w);
            }
        }
    }

    public abstract /* synthetic */ void didSelectSection(ShopSection shopSection);

    public abstract /* synthetic */ void didSelectSortOption(ShopHomeSortOption shopHomeSortOption);

    public abstract void didSelectTab(String str);

    public abstract /* synthetic */ void didSubmitSearchQuery(String str);

    public String getApiUrl() {
        return "";
    }

    public C13379a getPagination() {
        return new C13382d();
    }

    public C8709f getPerformanceTracker() {
        return this.performanceTrackerAdapter.getPerformanceTracker();
    }

    public abstract C11178m0 getShopHomeRouter();

    public void handlePageData(ShopHomePage shopHomePage, C11869a aVar) {
        List<ShopHomeSortOption> list;
        C11192q0 q0Var;
        ShopHomeSortOption shopHomeSortOption;
        ShopSection shopSection;
        ShopHomeLayoutManager shopHomeLayoutManager;
        if (this.recyclerView != null) {
            C11170j0 j0Var = new C11170j0(shopHomePage, getActivity());
            RecyclerView recyclerView = this.recyclerView;
            RecyclerView.C3100o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ShopHomeLayoutManager) {
                shopHomeLayoutManager = (ShopHomeLayoutManager) layoutManager;
                shopHomeLayoutManager.mo11259w1(j0Var.f24704a);
            } else {
                shopHomeLayoutManager = new ShopHomeLayoutManager(recyclerView.getContext(), j0Var.f24704a);
            }
            shopHomeLayoutManager.f7008K = new C11168i0(j0Var, recyclerView);
            recyclerView.setLayoutManager(shopHomeLayoutManager);
        }
        ShopHomeInitialLoadConfiguration shopHomeInitialLoadConfiguration = this.initialLoadConfig;
        boolean z = !this.didInitialPageLoad && shopHomeInitialLoadConfiguration != null;
        if (z) {
            C11192q0 q0Var2 = this.stateManager;
            q0Var2.getClass();
            Map<String, String> payloads = shopHomeInitialLoadConfiguration.getPayloads();
            if (payloads != null) {
                if (payloads.containsKey("section_id")) {
                    String str = payloads.get("section_id");
                    int size = q0Var2.f24747g.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        ShopSection shopSection2 = q0Var2.f24747g.get(i);
                        if (shopSection2.getShopSectionId().getId().equals(str)) {
                            q0Var2.f24746f = shopSection2;
                            q0Var2.f24752l = shopSection2.getListingActiveCount();
                            break;
                        }
                        i++;
                    }
                    if (q0Var2.f24749i.size() > 1 && q0Var2.f24748h.getOptionId().equals(ShopHomeSortOption.SORT_CUSTOM)) {
                        q0Var2.f24748h = q0Var2.f24749i.get(1);
                    }
                } else if (payloads.containsKey("search_query")) {
                    String str2 = payloads.get("search_query");
                    q0Var2.f24745e = str2;
                    q0Var2.f24744d = str2;
                }
                if (payloads.containsKey(ResponseConstants.ORDER)) {
                    String str3 = payloads.get(ResponseConstants.ORDER);
                    int size2 = q0Var2.f24749i.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            break;
                        }
                        ShopHomeSortOption shopHomeSortOption2 = q0Var2.f24749i.get(i2);
                        if (shopHomeSortOption2.getOptionId().equals(str3)) {
                            q0Var2.f24748h = shopHomeSortOption2;
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        populateAdapter(shopHomePage);
        if (z) {
            C11178m0 shopHomeRouter = getShopHomeRouter();
            int configType = shopHomeInitialLoadConfiguration.getConfigType();
            shopHomeRouter.mo36772h(configType != 1 ? configType != 2 ? configType != 3 ? configType != 4 ? ResponseConstants.SHOP : ResponseConstants.REVIEWS : ResponseConstants.POLICIES : "about" : ResponseConstants.ITEMS, false);
        } else if (aVar != null) {
            RecyclerView recyclerView2 = this.recyclerView;
            if (recyclerView2 != null) {
                RecyclerView.C3100o layoutManager2 = recyclerView2.getLayoutManager();
                Parcelable parcelable = (Parcelable) aVar.mo38345b(RECYCLERVIEW_LAYOUT);
                if (parcelable != null) {
                    layoutManager2.mo11303j0(parcelable);
                }
            }
            getShopHomeRouter().mo36773l();
        }
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(this.mScrollListener);
        }
        CollageTabLayout collageTabLayout = this.tabLayout;
        if (collageTabLayout != null) {
            collageTabLayout.addOnTabSelectedListener(this.mOnTabSelectedListener);
        }
        if (shopHomePage.getShopListingSortOrder() != null) {
            C11192q0 q0Var3 = this.stateManager;
            if (!q0Var3.f24757q || (shopSection = q0Var3.f24746f) == null || shopSection.isAllItemsSection()) {
                list = q0Var3.f24749i;
            } else {
                List<ShopHomeSortOption> list2 = q0Var3.f24749i;
                list = list2.subList(1, list2.size());
            }
            for (ShopHomeSortOption next : list) {
                if (next.getOptionId().equals(shopHomePage.getShopListingSortOrder()) && ((shopHomeSortOption = q0Var.f24748h) == null || !shopHomeSortOption.equals(next))) {
                    (q0Var = this.stateManager).f24748h = next;
                    C11192q0.C11193a aVar2 = q0Var.f24741a;
                }
            }
        }
    }

    public void loadMoreListings() {
        C11127a0 a0Var = (C11127a0) this.adapter;
        int size = a0Var.mItems.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((C11202t0) a0Var.mItems.get(size)).f24767c == R.id.view_type_shop_home_listing) {
                break;
            } else {
                size--;
            }
        }
        int i = size + 1;
        if (i != -1 && i < a0Var.mItems.size()) {
            a0Var.mItems.set(i, new C11202t0(R.id.view_type_shop_home_loading_with_description, new C11131b0(R.string.loading)));
            a0Var.notifyItemRemoved(i);
            a0Var.notifyItemInserted(i);
        }
        searchListings(true);
    }

    public void navigateToAllReviews() {
        ShopHomePage shopHomePage = ((C11127a0) this.adapter).f24614i;
        getShopHomeRouter().mo36808i(shopHomePage != null ? shopHomePage.getShop().getShopRating() : null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.performanceTrackerAdapter.mo21372d(bundle == null);
        TransactionViewModel<C11869a> Y = C18263b.m30830Y(this, "baseshophome", new C11869a());
        this.transactionViewModel = Y;
        C11869a aVar = (C11869a) Y.f26405b;
        Bundle arguments = getArguments();
        if (aVar.f26406a.containsKey("shop_id")) {
            this.shopId = (EtsyId) aVar.mo38345b("shop_id");
        } else if (arguments != null && arguments.containsKey("shop_id")) {
            String string = arguments.getString("shop_id", (String) null);
            this.shopId = string == null ? null : new EtsyId(string);
        }
        if (aVar.f26406a.containsKey("referring_listing_id")) {
            this.listingId = aVar.mo38348e("referring_listing_id", (String) null);
        } else if (arguments != null && arguments.containsKey("referring_listing_id")) {
            this.listingId = arguments.getString("referring_listing_id");
        }
        if (aVar.f26406a.containsKey(ResponseConstants.SHOP_NAME)) {
            this.shopName = aVar.mo38348e(ResponseConstants.SHOP_NAME, "");
        } else if (arguments != null) {
            this.shopName = arguments.getString(ResponseConstants.SHOP_NAME, "");
        }
        if (arguments != null) {
            this.favoriteThisShopOnLoad = arguments.getBoolean("favorite_shop");
            this.coupon = arguments.getString("coupon");
        }
        boolean c = aVar.mo38346c(DID_INITIAL_PAGE_LOAD, false);
        this.didInitialPageLoad = c;
        if (!c && arguments != null && arguments.containsKey("shop_home_load_configuration")) {
            this.initialLoadConfig = (ShopHomeInitialLoadConfiguration) arguments.getParcelable("shop_home_load_configuration");
        }
        this.stateManager = new C11192q0(this, getResources(), this.session, getConfigMap());
        this.adapter = new C11127a0(this, getAnalyticsContext(), this.fileSupport, this.translationHelper, this.listingImagesRepository, this);
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.swipeRefreshLayout.setColorSchemeResources(R.color.clg_color_black);
        this.mScrollListener = new C11180n0(getShopHomeRouter());
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.setDescendantFocusability(131072);
        recyclerView.setHasFixedSize(true);
        int dimensionPixelOffset = onCreateView.getResources().getDimensionPixelOffset(R.dimen.shop2_home_side_margin);
        recyclerView.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        recyclerView.setItemAnimator(new C11112b());
        recyclerView.addItemDecoration(new C11293p(onCreateView.getContext()));
        if (this.listingCardOptions == null) {
            this.listingCardOptions = new ListingCardViewHolderOptions.ShopHome("shop_home_all_items", getConfigMap());
        }
        recyclerView.addItemDecoration(new C11188p0.C11189a(getResources()));
        recyclerView.setScrollBarStyle(33554432);
        return onCreateView;
    }

    public void onDestroy() {
        C11192q0 q0Var = this.stateManager;
        if (q0Var != null) {
            q0Var.f24741a = null;
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        this.disposable.mo19405d();
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.mScrollListener);
        }
        this.mScrollListener = null;
        RecyclerView recyclerView2 = this.recyclerView;
        if (!(recyclerView2 == null || this.recyclerViewOnGlobalLayoutListener == null)) {
            recyclerView2.getViewTreeObserver().removeOnGlobalLayoutListener(this.recyclerViewOnGlobalLayoutListener);
            this.recyclerViewOnGlobalLayoutListener = null;
        }
        saveState();
        super.onDestroyView();
    }

    public void onLoadContent() {
        fetchPageData();
    }

    public abstract void onNewListingsResponse(ShopListingsSearchResult shopListingsSearchResult);

    public abstract void onPageLoaded(ShopHomePage shopHomePage);

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        saveState();
    }

    public void onStart() {
        super.onStart();
        CollageTabLayout tabLayout2 = ((BaseActivity) getActivity()).getTabLayout();
        tabLayout2.setTabMode(0);
        tabLayout2.setTabGravity(1);
        this.tabLayout = tabLayout2;
        C11869a aVar = (C11869a) this.transactionViewModel.f26405b;
        if (!this.didInitialPageLoad || !aVar.f26406a.containsKey(SHOP_DATA)) {
            setLoading(false);
            loadContent();
            return;
        }
        if (!C8885d0.m17322f(this.shopName)) {
            getActivity().setTitle(this.shopName);
        }
        handlePageData((ShopHomePage) aVar.f26406a.get(SHOP_DATA), aVar);
    }

    public void onStop() {
        super.onStop();
        CollageTabLayout collageTabLayout = this.tabLayout;
        if (collageTabLayout != null) {
            collageTabLayout.removeOnTabSelectedListener(this.mOnTabSelectedListener);
        }
        this.tabLayout = null;
    }

    public void onTranslateShopButtonClicked(boolean z) {
        if (z) {
            getAnalyticsContext().mo21333d("translate_shop_button_clicked", (Map<? extends AnalyticsProperty, Object>) null);
        } else {
            getAnalyticsContext().mo21333d("untranslate_shop_button_clicked", (Map<? extends AnalyticsProperty, Object>) null);
        }
        C11127a0 a0Var = (C11127a0) this.adapter;
        a0Var.f24615j.f24759s = z;
        a0Var.notifyDataSetChanged();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.recyclerViewOnGlobalLayoutListener = new C11113c();
        this.recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this.recyclerViewOnGlobalLayoutListener);
    }

    public void performScrollToSection(ShopSection shopSection) {
        C11127a0 a0Var = (C11127a0) this.adapter;
        if (a0Var != null) {
            int v = a0Var.mo36821v(R.id.view_type_shop_home_section_header, shopSection);
            RecyclerView.C3094l itemAnimator = this.recyclerView.getItemAnimator();
            this.recyclerView.setItemAnimator((RecyclerView.C3094l) null);
            this.recyclerView.scrollToPosition(v);
            this.recyclerView.setItemAnimator(itemAnimator);
        }
    }

    public void performSearch() {
        searchListings(false);
    }

    public abstract /* synthetic */ void performShopFavorite(boolean z);

    public abstract /* synthetic */ void performVacationNotificationSubscription(boolean z);

    public void refreshFilterSpinners() {
        C11127a0 a0Var = (C11127a0) this.adapter;
        if (a0Var != null) {
            a0Var.mo36813A(R.id.view_type_shop_home_items_filter, a0Var.f24615j, C11127a0.f24612m);
        }
    }

    public abstract /* synthetic */ void showDetailsBottomSheet(String str, String str2);

    public void stopLoad() {
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        setLoading(false);
        setRefreshing(false);
    }

    public void translateFAQs(FAQs fAQs) {
        MachineTranslationViewState translationState = fAQs.getTranslationState();
        if (translationState.isTranslated()) {
            translationState.setShouldShowTranslation(true);
            Iterator it = fAQs.iterator();
            while (it.hasNext()) {
                FAQ faq = (FAQ) it.next();
                faq.setShowTranslatedFAQ(translationState.getShouldShowTranslation());
                ((C11127a0) this.adapter).mo36813A(R.id.view_type_shop_home_faq_content, faq, (Object) null);
            }
            ((C11127a0) this.adapter).mo36813A(R.id.view_type_shop_home_faq_subsection_heading, fAQs, (Object) null);
            return;
        }
        EtsyId etsyId = this.shopId;
        String a = this.currentLocale.mo46717a();
        C19383o.m32797g(etsyId, "shopId");
        C7091a aVar = this.disposable;
        C11175l lVar = this.faqsTranslationRepository;
        lVar.getClass();
        C8071s<C20145v<C19928a0>> a2 = lVar.f24715a.mo36840a(etsyId, a);
        C9342c cVar = new C9342c(3);
        a2.getClass();
        aVar.mo19403b(C0391c.m1056b(this.rxSchedulers, C0326j.m860e(this.rxSchedulers, new C19208j(a2, cVar))).mo20658g(new C11144f(this, translationState, fAQs), new C9408v(this, fAQs, 1)));
    }

    public void translatePrivacyOther(C13497g gVar) {
        String id = this.shopId.getId();
        String a = this.currentLocale.mo46717a();
        C19383o.m32797g(id, "shopId");
        C11191q qVar = this.privacyPolicyTranslationRepository;
        qVar.getClass();
        C8071s<C20145v<C19928a0>> a2 = qVar.f24740a.mo36860a(id, a);
        C13093m mVar = new C13093m(3);
        a2.getClass();
        this.disposable.mo19403b(C0391c.m1056b(this.rxSchedulers, C0326j.m860e(this.rxSchedulers, new C19208j(a2, mVar))).mo20658g(new C11146g(this, gVar), new C11148h(this, gVar, 0)));
    }

    public void translateReviewMessage(C13394c cVar) {
        if (this.shopId == null) {
            return;
        }
        if (cVar.f29331a.getTranslatedReview() == null) {
            C11201t tVar = this.reviewsTranslationRepository;
            EtsyId transactionId = cVar.f29331a.getTransactionId();
            EtsyId etsyId = this.shopId;
            String a = this.currentLocale.mo46717a();
            C19383o.m32797g(transactionId, "reviewId");
            C19383o.m32797g(etsyId, "shopId");
            C8071s<C20145v<C19928a0>> a2 = tVar.f24765a.mo36865a(etsyId, transactionId, a);
            C13250b bVar = new C13250b(5);
            a2.getClass();
            this.disposable.mo19403b(C0391c.m1056b(this.rxSchedulers, C0472h.m1243e(this.rxSchedulers, new C19211l(new C19208j(a2, bVar), new C8683d(4)))).mo20658g(new C11138d(this, cVar), new C8882c(2, this, cVar)));
        } else if (this.adapter != null) {
            cVar.f29331a.setTranslatedReview(cVar.f29331a.getTranslatedReview());
            ((C11127a0) this.adapter).mo36813A(R.id.view_type_shop_home_review_message, cVar, (Object) null);
        }
    }

    public void updateSectionSelectorValue(ShopSection shopSection) {
        C11127a0 a0Var = (C11127a0) this.adapter;
        if (a0Var != null && a0Var.mo36822w(R.id.view_type_shop_home_section_selector) != -1) {
            C11192q0 q0Var = this.stateManager;
            if (shopSection == null || !q0Var.f24747g.contains(shopSection)) {
                q0Var.f24746f = null;
            } else {
                q0Var.f24746f = shopSection;
            }
        }
    }
}
