package p040c9;

import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.deeplinking.bitly.BitlyActivity;
import com.etsy.android.demo.VespaArbitraryEndpointFragment;
import com.etsy.android.device.LocaleReceiver;
import com.etsy.android.feedback.FeedbackFragment;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.core.posts.EtsyPostWorker;
import com.etsy.android.lib.dagger.C8653l;
import com.etsy.android.lib.dagger.C8654m;
import com.etsy.android.lib.dagger.C8655n;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.analytics.AnalyticsUploadWorker;
import com.etsy.android.lib.logger.elk.uploading.ElkLogUploadWorker;
import com.etsy.android.lib.network.oauth2.signin.SignInContainerActivity;
import com.etsy.android.lib.push.handler.BrazeReceiver;
import com.etsy.android.lib.push.handler.FirebasePushService;
import com.etsy.android.p072ad.AdImpressionsUploadWorker;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.EtsyPreferenceActivity;
import com.etsy.android.p327ui.EtsyWebFragment;
import com.etsy.android.p327ui.VespaDemoFragment;
import com.etsy.android.p327ui.cart.CartShortcutActivity;
import com.etsy.android.p327ui.cart.CartWithSavedFragment;
import com.etsy.android.p327ui.cart.MultiShopCartFragment;
import com.etsy.android.p327ui.cart.SavedCartItemsFragment;
import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.ApplyCouponBottomSheetFragment;
import com.etsy.android.p327ui.cart.saved.StandaloneSavedCartItemsFragment;
import com.etsy.android.p327ui.cart.saveforlater.SaveForLaterFragment;
import com.etsy.android.p327ui.conversation.compose.ConversationComposeFragment;
import com.etsy.android.p327ui.conversation.details.ccm.ConversationDetailsFragment;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationDetailsFragment;
import com.etsy.android.p327ui.conversation.list.ccm.ConversationListFragment;
import com.etsy.android.p327ui.core.CollectionFragment;
import com.etsy.android.p327ui.core.listinggallery.ListingImageGalleryFragment;
import com.etsy.android.p327ui.core.review.ListingReviewPagerFragment;
import com.etsy.android.p327ui.core.review.ListingVideoReviewFragment;
import com.etsy.android.p327ui.core.review.bottomsheet.ListingReviewPagerBottomSheetFragment;
import com.etsy.android.p327ui.core.review.bottomsheet.ListingVideoReviewBottomSheetFragment;
import com.etsy.android.p327ui.dialog.SingleListingCheckoutSADialog;
import com.etsy.android.p327ui.dialog.SingleListingCheckoutStandalonePayPalSADialog;
import com.etsy.android.p327ui.discover.DiscoverFragment;
import com.etsy.android.p327ui.favorites.FavoritesShortcutActivity;
import com.etsy.android.p327ui.favorites.FavoritesTabFragment;
import com.etsy.android.p327ui.favorites.FavoritesTabsContainerFragment;
import com.etsy.android.p327ui.favorites.add.AddToListContainerFragment;
import com.etsy.android.p327ui.favorites.add.AddToListFragment;
import com.etsy.android.p327ui.favorites.createalist.CreateAListContainerFragment;
import com.etsy.android.p327ui.favorites.createalist.CreateAListFragment;
import com.etsy.android.p327ui.favorites.createalist.NameAListFragment;
import com.etsy.android.p327ui.favorites.editlist.EditCollectionBottomSheetFragment;
import com.etsy.android.p327ui.favorites.recommendations.CollectionContainerFragment;
import com.etsy.android.p327ui.favorites.recommendations.ListRecommendationsFragment;
import com.etsy.android.p327ui.feedback.AppFeedbackFragment;
import com.etsy.android.p327ui.giftcards.GiftCardCreateFragment;
import com.etsy.android.p327ui.home.editorspicks.EditorsPicksFragment;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.explore.ExploreFragment;
import com.etsy.android.p327ui.home.home.HomeFragment;
import com.etsy.android.p327ui.home.landingpage.LandingPageFragment;
import com.etsy.android.p327ui.home.recentlyviewedpage.RecentlyViewedPageFragment;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.homescreen.HomescreenTabsActivity;
import com.etsy.android.p327ui.listing.ListingFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.NativeBuyItNowCheckoutContainerFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.paymentmethod.ChangePaymentMethodFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.shippingaddress.ChangeShippingAddressFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.shippingmethod.ChangeShippingMethodFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.summary.SummaryFragment;
import com.etsy.android.p327ui.nav.NotificationActivity;
import com.etsy.android.p327ui.navigation.bottom.C10679a;
import com.etsy.android.p327ui.navigation.bottom.C10683e;
import com.etsy.android.p327ui.sdl.SdlModalFragment;
import com.etsy.android.p327ui.search.container.SearchContainerFragment;
import com.etsy.android.p327ui.search.countryselector.SearchCountrySelectorFragment;
import com.etsy.android.p327ui.search.filters.SearchFiltersV2Fragment;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersFragment;
import com.etsy.android.p327ui.search.interstitial.SearchInterstitialFragment;
import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsFragment;
import com.etsy.android.p327ui.search.p330v2.impressions.SearchImpressionsUploadWorker;
import com.etsy.android.p327ui.search.p330v2.interstitial.SearchInterstitialActivity;
import com.etsy.android.p327ui.search.p330v2.taxonomy.SearchTaxonomyCategoryPageFragment;
import com.etsy.android.p327ui.search.redirect.SearchRedirectFragment;
import com.etsy.android.p327ui.search.savedsearch.SavedSearchEmailPromptFragment;
import com.etsy.android.p327ui.search.shopresults.SearchResultsShopsFragment;
import com.etsy.android.p327ui.search.toplevelcategories.TopLevelCategoriesFragment;
import com.etsy.android.p327ui.shop.ShopHomeFragment;
import com.etsy.android.p327ui.shop.ShopSectionListingsFragment;
import com.etsy.android.p327ui.shop.tabs.ShopFragment;
import com.etsy.android.p327ui.singleactivity.C11320d;
import com.etsy.android.p327ui.user.CurrencySelectFragment;
import com.etsy.android.p327ui.user.DarkModeFragment;
import com.etsy.android.p327ui.user.PhabletsFragment;
import com.etsy.android.p327ui.user.ReceiptFragment;
import com.etsy.android.p327ui.user.SettingsFragment;
import com.etsy.android.p327ui.user.addresses.AddressCountrySelectorFragment;
import com.etsy.android.p327ui.user.addresses.AddressDetailFragment;
import com.etsy.android.p327ui.user.addresses.AddressListFragment;
import com.etsy.android.p327ui.user.auth.SignInActivity;
import com.etsy.android.p327ui.user.circles.CirclesFragment;
import com.etsy.android.p327ui.user.circles.CirclesTabContainerFragment;
import com.etsy.android.p327ui.user.help.HelpFragment;
import com.etsy.android.p327ui.user.help.HelpPhoneNumbersFragment;
import com.etsy.android.p327ui.user.inappnotifications.InAppNotificationsFragment;
import com.etsy.android.p327ui.user.language.LanguageSelectFragment;
import com.etsy.android.p327ui.user.privacy.PrivacyFragment;
import com.etsy.android.p327ui.user.profile.UserProfileFragment;
import com.etsy.android.p327ui.user.purchases.PurchasesFragment;
import com.etsy.android.p327ui.user.purchases.PurchasesShortcutActivity;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.etsy.android.p327ui.you.YouFragment;
import com.etsy.android.push.BOENotificationSettingsFragment;
import com.etsy.android.push.onboarding.C8945a;
import com.etsy.android.push.onboarding.C8946b;
import com.etsy.android.push.onboarding.PushOptInOnboardingDialogFragment;
import com.etsy.android.share.SocialShareBroadcastReceiver;
import com.google.android.gms.measurement.internal.C15099u;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.C17553b;
import dagger.internal.C17556e;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p346fa.C12703a;
import p389lc.C13010a;
import p425q9.C13265p;
import p448ta.C13386b;
import p456ua.C13461f;
import p491ye.C13921e;
import p514bk.C14088a;
import p568fn.C17782b;
import p772tq.C20203a;

/* renamed from: c9.r4 */
public final class C4690r4 implements C17550a {

    /* renamed from: A */
    public C4765x1 f10520A;

    /* renamed from: A1 */
    public C4715t3 f10521A1;

    /* renamed from: B */
    public C4778y1 f10522B;

    /* renamed from: B1 */
    public C4728u3 f10523B1;

    /* renamed from: C */
    public C4454a2 f10524C;

    /* renamed from: C1 */
    public C4741v3 f10525C1;

    /* renamed from: D */
    public C4468b2 f10526D;

    /* renamed from: D1 */
    public C4754w3 f10527D1;

    /* renamed from: E */
    public C4482c2 f10528E;

    /* renamed from: E1 */
    public C4767x3 f10529E1;

    /* renamed from: F */
    public C4496d2 f10530F;

    /* renamed from: F1 */
    public C4780y3 f10531F1;

    /* renamed from: G */
    public C4510e2 f10532G;

    /* renamed from: G1 */
    public C4793z3 f10533G1;

    /* renamed from: H */
    public C4524f2 f10534H;

    /* renamed from: H1 */
    public C4456a4 f10535H1;

    /* renamed from: I */
    public C4538g2 f10536I;

    /* renamed from: I1 */
    public C4470b4 f10537I1;

    /* renamed from: J */
    public C4552h2 f10538J;

    /* renamed from: J1 */
    public C4498d4 f10539J1;

    /* renamed from: K */
    public C4566i2 f10540K;

    /* renamed from: K1 */
    public C4512e4 f10541K1;

    /* renamed from: L */
    public C4580j2 f10542L;

    /* renamed from: L1 */
    public C4526f4 f10543L1;

    /* renamed from: M */
    public C4608l2 f10544M;

    /* renamed from: M1 */
    public C4540g4 f10545M1;

    /* renamed from: N */
    public C4622m2 f10546N;

    /* renamed from: N1 */
    public C4554h4 f10547N1;

    /* renamed from: O */
    public C4636n2 f10548O;

    /* renamed from: O1 */
    public C4568i4 f10549O1;

    /* renamed from: P */
    public C4649o2 f10550P;

    /* renamed from: P1 */
    public C4582j4 f10551P1;

    /* renamed from: Q */
    public C4662p2 f10552Q;

    /* renamed from: Q1 */
    public C4596k4 f10553Q1;

    /* renamed from: R */
    public C4675q2 f10554R;

    /* renamed from: R1 */
    public C4610l4 f10555R1;

    /* renamed from: S */
    public C4688r2 f10556S;

    /* renamed from: S1 */
    public C4624m4 f10557S1;

    /* renamed from: T */
    public C4701s2 f10558T;

    /* renamed from: T1 */
    public C4651o4 f10559T1;

    /* renamed from: U1 */
    public C4672q f10560U1;

    /* renamed from: V */
    public C4714t2 f10561V;

    /* renamed from: V1 */
    public C4763x f10562V1;

    /* renamed from: W */
    public C4727u2 f10563W;

    /* renamed from: W1 */
    public C17556e f10564W1;

    /* renamed from: X */
    public C4753w2 f10565X;

    /* renamed from: X1 */
    public C8654m f10566X1;

    /* renamed from: Y */
    public C4766x2 f10567Y;

    /* renamed from: Y1 */
    public C8655n f10568Y1;

    /* renamed from: Z */
    public C4779y2 f10569Z;

    /* renamed from: Z1 */
    public C8653l f10570Z1;

    /* renamed from: b */
    public final C15099u f10571b;

    /* renamed from: c */
    public final C1993m f10572c;

    /* renamed from: d */
    public final BOEActivity f10573d;

    /* renamed from: e */
    public final C17782b f10574e;

    /* renamed from: f */
    public final C17782b f10575f;

    /* renamed from: g */
    public final C14088a f10576g;

    /* renamed from: h */
    public final C4579j1 f10577h;

    /* renamed from: i */
    public final C4690r4 f10578i = this;

    /* renamed from: j */
    public C4791z1 f10579j;

    /* renamed from: j1 */
    public C4455a3 f10580j1;

    /* renamed from: k */
    public C4594k2 f10581k;

    /* renamed from: k0 */
    public C4792z2 f10582k0;

    /* renamed from: k1 */
    public C4469b3 f10583k1;

    /* renamed from: l */
    public C4740v2 f10584l;

    /* renamed from: l1 */
    public C4483c3 f10585l1;

    /* renamed from: m */
    public C4539g3 f10586m;

    /* renamed from: m1 */
    public C4497d3 f10587m1;

    /* renamed from: n */
    public C4689r3 f10588n;

    /* renamed from: n1 */
    public C4511e3 f10589n1;

    /* renamed from: o */
    public C4484c4 f10590o;

    /* renamed from: o1 */
    public C4525f3 f10591o1;

    /* renamed from: p */
    public C4638n4 f10592p;

    /* renamed from: p1 */
    public C4553h3 f10593p1;

    /* renamed from: q */
    public C4664p4 f10594q;

    /* renamed from: q1 */
    public C4567i3 f10595q1;

    /* renamed from: r */
    public C4677q4 f10596r;

    /* renamed from: r1 */
    public C4581j3 f10597r1;

    /* renamed from: s */
    public C4661p1 f10598s;

    /* renamed from: s1 */
    public C4595k3 f10599s1;

    /* renamed from: t */
    public C4674q1 f10600t;

    /* renamed from: t1 */
    public C4609l3 f10601t1;

    /* renamed from: u */
    public C4687r1 f10602u;

    /* renamed from: u1 */
    public C4623m3 f10603u1;

    /* renamed from: v */
    public C4700s1 f10604v;

    /* renamed from: v1 */
    public C4637n3 f10605v1;

    /* renamed from: w */
    public C4713t1 f10606w;

    /* renamed from: w1 */
    public C4650o3 f10607w1;

    /* renamed from: x */
    public C4726u1 f10608x;

    /* renamed from: x1 */
    public C4663p3 f10609x1;

    /* renamed from: y */
    public C4739v1 f10610y;

    /* renamed from: y1 */
    public C4676q3 f10611y1;

    /* renamed from: z */
    public C4752w1 f10612z;

    /* renamed from: z1 */
    public C4702s3 f10613z1;

    public C4690r4(C4579j1 j1Var, C1993m mVar, C15099u uVar, C0005b bVar, C20203a aVar, C17782b bVar2, C14088a aVar2, C17782b bVar3, BOEActivity bOEActivity) {
        this.f10577h = j1Var;
        this.f10571b = uVar;
        this.f10572c = mVar;
        this.f10573d = bOEActivity;
        this.f10574e = bVar2;
        this.f10575f = bVar3;
        this.f10576g = aVar2;
        this.f10579j = new C4791z1(this);
        this.f10581k = new C4594k2(this);
        this.f10584l = new C4740v2(this);
        this.f10586m = new C4539g3(this);
        this.f10588n = new C4689r3(this);
        this.f10590o = new C4484c4(this);
        this.f10592p = new C4638n4(this);
        this.f10594q = new C4664p4(this);
        this.f10596r = new C4677q4(this);
        this.f10598s = new C4661p1(this);
        this.f10600t = new C4674q1(this);
        this.f10602u = new C4687r1(this);
        this.f10604v = new C4700s1(this);
        this.f10606w = new C4713t1(this);
        this.f10608x = new C4726u1(this);
        this.f10610y = new C4739v1(this);
        this.f10612z = new C4752w1(this);
        this.f10520A = new C4765x1(this);
        this.f10522B = new C4778y1(this);
        this.f10524C = new C4454a2(this);
        this.f10526D = new C4468b2(this);
        this.f10528E = new C4482c2(this);
        this.f10530F = new C4496d2(this);
        this.f10532G = new C4510e2(this);
        this.f10534H = new C4524f2(this);
        this.f10536I = new C4538g2(this);
        this.f10538J = new C4552h2(this);
        this.f10540K = new C4566i2(this);
        this.f10542L = new C4580j2(this);
        this.f10544M = new C4608l2(this);
        this.f10546N = new C4622m2(this);
        this.f10548O = new C4636n2(this);
        this.f10550P = new C4649o2(this);
        this.f10552Q = new C4662p2(this);
        this.f10554R = new C4675q2(this);
        this.f10556S = new C4688r2(this);
        this.f10558T = new C4701s2(this);
        this.f10561V = new C4714t2(this);
        this.f10563W = new C4727u2(this);
        this.f10565X = new C4753w2(this);
        this.f10567Y = new C4766x2(this);
        this.f10569Z = new C4779y2(this);
        this.f10582k0 = new C4792z2(this);
        this.f10580j1 = new C4455a3(this);
        this.f10583k1 = new C4469b3(this);
        this.f10585l1 = new C4483c3(this);
        this.f10587m1 = new C4497d3(this);
        this.f10589n1 = new C4511e3(this);
        this.f10591o1 = new C4525f3(this);
        this.f10593p1 = new C4553h3(this);
        this.f10595q1 = new C4567i3(this);
        this.f10597r1 = new C4581j3(this);
        this.f10599s1 = new C4595k3(this);
        this.f10601t1 = new C4609l3(this);
        this.f10603u1 = new C4623m3(this);
        this.f10605v1 = new C4637n3(this);
        this.f10607w1 = new C4650o3(this);
        this.f10609x1 = new C4663p3(this);
        this.f10611y1 = new C4676q3(this);
        this.f10613z1 = new C4702s3(this);
        this.f10521A1 = new C4715t3(this);
        this.f10523B1 = new C4728u3(this);
        this.f10525C1 = new C4741v3(this);
        this.f10527D1 = new C4754w3(this);
        this.f10529E1 = new C4767x3(this);
        this.f10531F1 = new C4780y3(this);
        this.f10533G1 = new C4793z3(this);
        this.f10535H1 = new C4456a4(this);
        this.f10537I1 = new C4470b4(this);
        this.f10539J1 = new C4498d4(this);
        this.f10541K1 = new C4512e4(this);
        this.f10543L1 = new C4526f4(this);
        this.f10545M1 = new C4540g4(this);
        this.f10547N1 = new C4554h4(this);
        this.f10549O1 = new C4568i4(this);
        this.f10551P1 = new C4582j4(this);
        this.f10553Q1 = new C4596k4(this);
        this.f10555R1 = new C4610l4(this);
        this.f10557S1 = new C4624m4(this);
        this.f10559T1 = new C4651o4(this);
        C17553b bVar4 = j1Var.f10091D0;
        this.f10560U1 = new C4672q(bVar, bVar4, 7);
        this.f10562V1 = new C4763x(bVar, bVar4, 2);
        C17556e a = C17556e.m29429a(bOEActivity);
        this.f10564W1 = a;
        C8654m mVar2 = new C8654m(uVar, new C8653l(mVar, a, 3), 0);
        this.f10566X1 = mVar2;
        this.f10568Y1 = new C8655n(uVar, mVar2, 0);
        this.f10570Z1 = new C8653l(aVar, j1Var.f10091D0, 5);
    }

    /* renamed from: a */
    public static C8623e m10336a(C4690r4 r4Var) {
        C15099u uVar = r4Var.f10571b;
        C8703p c = r4Var.mo14417c();
        uVar.getClass();
        C8623e eVar = c.f19116n;
        C17782b.m29841G(eVar);
        return eVar;
    }

    /* renamed from: b */
    public final C8946b mo14416b() {
        return new C8946b(new C8945a(this.f10577h.f10114H3.get(), this.f10577h.f10198Y2.get(), this.f10577h.f10090D.get(), this.f10577h.f10248h0.get()), this.f10577h.f10198Y2.get(), this.f10577h.f10248h0.get());
    }

    /* renamed from: c */
    public final C8703p mo14417c() {
        C15099u uVar = this.f10571b;
        C1993m mVar = this.f10572c;
        BOEActivity bOEActivity = this.f10573d;
        mVar.getClass();
        C19383o.m32797g(bOEActivity, "activity");
        return C8654m.m17038a(uVar, bOEActivity);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        BOEActivity bOEActivity = (BOEActivity) obj;
        bOEActivity.dispatchingAndroidInjector = new DispatchingAndroidInjector<>(ImmutableMap.builderWithExpectedSize(103).mo56613b(BrazeReceiver.class, this.f10577h.f10095E).mo56613b(SavedSearchEmailPromptFragment.class, this.f10577h.f10100F).mo56613b(SdlModalFragment.class, this.f10577h.f10105G).mo56613b(SignInActivity.class, this.f10577h.f10110H).mo56613b(NotificationActivity.class, this.f10577h.f10115I).mo56613b(FavoritesShortcutActivity.class, this.f10577h.f10120J).mo56613b(PurchasesShortcutActivity.class, this.f10577h.f10125K).mo56613b(CartShortcutActivity.class, this.f10577h.f10130L).mo56613b(SearchInterstitialActivity.class, this.f10577h.f10135M).mo56613b(HomescreenTabsActivity.class, this.f10577h.f10140N).mo56613b(BitlyActivity.class, this.f10577h.f10145O).mo56613b(CreateReviewActivity.class, this.f10577h.f10150P).mo56613b(EtsyPreferenceActivity.class, this.f10577h.f10155Q).mo56613b(BOEActivity.class, this.f10577h.f10160R).mo56613b(LocaleReceiver.class, this.f10577h.f10165S).mo56613b(ElkLogUploadWorker.class, this.f10577h.f10170T).mo56613b(SearchImpressionsUploadWorker.class, this.f10577h.f10175U).mo56613b(AdImpressionsUploadWorker.class, this.f10577h.f10180V).mo56613b(AnalyticsUploadWorker.class, this.f10577h.f10185W).mo56613b(EtsyPostWorker.class, this.f10577h.f10190X).mo56613b(FirebasePushService.class, this.f10577h.f10195Y).mo56613b(SignInContainerActivity.class, this.f10577h.f10200Z).mo56613b(SocialShareBroadcastReceiver.class, this.f10577h.f10206a0).mo56613b(ShopHomeFragment.class, this.f10579j).mo56613b(SearchInterstitialFragment.class, this.f10581k).mo56613b(SearchContainerFragment.class, this.f10584l).mo56613b(SearchResultsListingsFragment.class, this.f10586m).mo56613b(SearchTaxonomyCategoryPageFragment.class, this.f10588n).mo56613b(SearchResultsShopsFragment.class, this.f10590o).mo56613b(TopLevelCategoriesFragment.class, this.f10592p).mo56613b(ListingImageGalleryFragment.class, this.f10594q).mo56613b(SettingsFragment.class, this.f10596r).mo56613b(RecentlyViewedPageFragment.class, this.f10598s).mo56613b(LandingPageFragment.class, this.f10600t).mo56613b(BOENotificationSettingsFragment.class, this.f10602u).mo56613b(CartWithSavedFragment.class, this.f10604v).mo56613b(StandaloneSavedCartItemsFragment.class, this.f10606w).mo56613b(DarkModeFragment.class, this.f10608x).mo56613b(SavedCartItemsFragment.class, this.f10610y).mo56613b(MultiShopCartFragment.class, this.f10612z).mo56613b(HomeFragment.class, this.f10520A).mo56613b(ListingReviewPagerFragment.class, this.f10522B).mo56613b(ListingVideoReviewFragment.class, this.f10524C).mo56613b(ListingReviewPagerBottomSheetFragment.class, this.f10526D).mo56613b(ListingVideoReviewBottomSheetFragment.class, this.f10528E).mo56613b(YouFragment.class, this.f10530F).mo56613b(UserProfileFragment.class, this.f10532G).mo56613b(PhabletsFragment.class, this.f10534H).mo56613b(HelpFragment.class, this.f10536I).mo56613b(CurrencySelectFragment.class, this.f10538J).mo56613b(LanguageSelectFragment.class, this.f10540K).mo56613b(PrivacyFragment.class, this.f10542L).mo56613b(AddressListFragment.class, this.f10544M).mo56613b(AddressDetailFragment.class, this.f10546N).mo56613b(AddressCountrySelectorFragment.class, this.f10548O).mo56613b(PurchasesFragment.class, this.f10550P).mo56613b(InAppNotificationsFragment.class, this.f10552Q).mo56613b(ReceiptFragment.class, this.f10554R).mo56613b(HelpPhoneNumbersFragment.class, this.f10556S).mo56613b(DiscoverFragment.class, this.f10558T).mo56613b(CirclesTabContainerFragment.class, this.f10561V).mo56613b(ShopSectionListingsFragment.class, this.f10563W).mo56613b(CollectionFragment.class, this.f10565X).mo56613b(ListRecommendationsFragment.class, this.f10567Y).mo56613b(CollectionContainerFragment.class, this.f10569Z).mo56613b(ExploreFragment.class, this.f10582k0).mo56613b(FavoritesTabsContainerFragment.class, this.f10580j1).mo56613b(FavoritesTabFragment.class, this.f10583k1).mo56613b(SearchFiltersV2Fragment.class, this.f10585l1).mo56613b(SearchCountrySelectorFragment.class, this.f10587m1).mo56613b(EtsyWebFragment.class, this.f10589n1).mo56613b(ConversationComposeFragment.class, this.f10591o1).mo56613b(LegacyConversationDetailsFragment.class, this.f10593p1).mo56613b(ConversationListFragment.class, this.f10595q1).mo56613b(ConversationDetailsFragment.class, this.f10597r1).mo56613b(GiftCardCreateFragment.class, this.f10599s1).mo56613b(CreateAListContainerFragment.class, this.f10601t1).mo56613b(CreateAListFragment.class, this.f10603u1).mo56613b(AddToListContainerFragment.class, this.f10605v1).mo56613b(AddToListFragment.class, this.f10607w1).mo56613b(NameAListFragment.class, this.f10609x1).mo56613b(com.etsy.android.p327ui.favorites.add.NameAListFragment.class, this.f10611y1).mo56613b(CirclesFragment.class, this.f10613z1).mo56613b(EditorsPicksFragment.class, this.f10521A1).mo56613b(AppFeedbackFragment.class, this.f10523B1).mo56613b(EditCollectionBottomSheetFragment.class, this.f10525C1).mo56613b(VespaDemoFragment.class, this.f10527D1).mo56613b(VespaArbitraryEndpointFragment.class, this.f10529E1).mo56613b(SingleListingCheckoutStandalonePayPalSADialog.class, this.f10531F1).mo56613b(SingleListingCheckoutSADialog.class, this.f10533G1).mo56613b(ListingFragment.class, this.f10535H1).mo56613b(NativeBuyItNowCheckoutContainerFragment.class, this.f10537I1).mo56613b(SummaryFragment.class, this.f10539J1).mo56613b(ChangeShippingAddressFragment.class, this.f10541K1).mo56613b(ChangeShippingMethodFragment.class, this.f10543L1).mo56613b(ChangePaymentMethodFragment.class, this.f10545M1).mo56613b(ApplyCouponBottomSheetFragment.class, this.f10547N1).mo56613b(PushOptInOnboardingDialogFragment.class, this.f10549O1).mo56613b(SearchRedirectFragment.class, this.f10551P1).mo56613b(SearchFiltersFragment.class, this.f10553Q1).mo56613b(FeedbackFragment.class, this.f10555R1).mo56613b(ShopFragment.class, this.f10557S1).mo56613b(SaveForLaterFragment.class, this.f10559T1).mo56612a(), ImmutableMap.m25853of());
        bOEActivity.mAnalyticsTracker = mo14417c();
        bOEActivity.performanceTracker = this.f10577h.mo14412u();
        bOEActivity.darkModeController = new C13010a(this.f10577h.f10090D.get());
        bOEActivity.darkModeTracker = C4579j1.m10251b(this.f10577h);
        bOEActivity.configMap = this.f10577h.mo14404m();
        bOEActivity.schedulers = new C13461f();
        bOEActivity.bottomNavigationMonitor = this.f10577h.f10119I3.get();
        bOEActivity.session = (C13265p) this.f10577h.f10101F0.get();
        bOEActivity.bottomNavStateRepo = this.f10577h.f10209a3.get();
        C1993m mVar = this.f10572c;
        BOEActivity bOEActivity2 = this.f10573d;
        mVar.getClass();
        C19383o.m32797g(bOEActivity2, "activity");
        bOEActivity.bottomNavBinder = new C10683e(bOEActivity2, this.f10577h.f10209a3.get());
        bOEActivity.badgeBinder = new C10679a(this.f10577h.f10198Y2.get(), this.f10577h.f10203Z2.get());
        bOEActivity.cartBadgeCountRepo = this.f10577h.f10168S2.get();
        bOEActivity.favoriteHandler = this.f10577h.f10134L3.get();
        C4579j1 j1Var = this.f10577h;
        bOEActivity.viewModelFactory = new C8656o(ImmutableMap.m25856of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3));
        bOEActivity.etsyConfigMap = this.f10577h.mo14404m();
        C4579j1 j1Var2 = this.f10577h;
        bOEActivity.appUpdateManager = C13386b.m21075a(j1Var2.f10265k, j1Var2.f10085C.get());
        bOEActivity.rxSchedulers = new C13461f();
        C4579j1 j1Var3 = this.f10577h;
        bOEActivity.tooltipPrefs = new C13921e(j1Var3.f10090D.get(), j1Var3.f10248h0.get());
        bOEActivity.grafana = (C12703a) this.f10577h.f10308s0.get();
        bOEActivity.multistackPrefs = new C11320d(this.f10577h.f10090D.get(), this.f10577h.mo14404m(), this.f10577h.f10248h0.get());
        bOEActivity.updatesEligibility = this.f10577h.f10227d3.get();
        bOEActivity.pushPermissionPrompter = mo14416b();
        bOEActivity.updatesNativeEligibility = this.f10577h.f10203Z2.get();
    }
}
