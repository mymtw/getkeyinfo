package p040c9;

import com.etsy.android.config.PrefsFragment;
import com.etsy.android.config.flags.ConfigFlagsFragment;
import com.etsy.android.deeplinking.bitly.BitlyActivity;
import com.etsy.android.device.LocaleReceiver;
import com.etsy.android.lib.core.posts.EtsyPostWorker;
import com.etsy.android.lib.logger.analytics.AnalyticsUploadWorker;
import com.etsy.android.lib.logger.elk.uploading.ElkLogUploadWorker;
import com.etsy.android.lib.network.oauth2.signin.SignInContainerActivity;
import com.etsy.android.lib.push.handler.BrazeReceiver;
import com.etsy.android.lib.push.handler.FirebasePushService;
import com.etsy.android.onboarding.OnboardingCategoryQuizFragment;
import com.etsy.android.p072ad.AdImpressionsUploadWorker;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.EtsyPreferenceActivity;
import com.etsy.android.p327ui.cart.CartShortcutActivity;
import com.etsy.android.p327ui.favorites.FavoritesShortcutActivity;
import com.etsy.android.p327ui.homescreen.HomescreenTabsActivity;
import com.etsy.android.p327ui.nav.NotificationActivity;
import com.etsy.android.p327ui.sdl.SdlModalFragment;
import com.etsy.android.p327ui.search.p330v2.impressions.SearchImpressionsUploadWorker;
import com.etsy.android.p327ui.search.p330v2.interstitial.SearchInterstitialActivity;
import com.etsy.android.p327ui.search.savedsearch.SavedSearchEmailPromptFragment;
import com.etsy.android.p327ui.user.auth.SignInActivity;
import com.etsy.android.p327ui.user.purchases.PurchasesShortcutActivity;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.etsy.android.share.SocialShareBroadcastReceiver;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import dagger.android.DispatchingAndroidInjector;

/* renamed from: c9.t6 */
public final class C4718t6 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10659b;

    /* renamed from: c */
    public final C4718t6 f10660c = this;

    /* renamed from: d */
    public C4679q6 f10661d;

    /* renamed from: e */
    public C4692r6 f10662e;

    /* renamed from: f */
    public C4705s6 f10663f;

    public C4718t6(C4579j1 j1Var) {
        this.f10659b = j1Var;
        this.f10661d = new C4679q6(this);
        this.f10662e = new C4692r6(this);
        this.f10663f = new C4705s6(this);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ((EtsyPreferenceActivity) obj).dispatchingAndroidInjector = new DispatchingAndroidInjector<>(ImmutableMap.builderWithExpectedSize(26).mo56613b(BrazeReceiver.class, this.f10659b.f10095E).mo56613b(SavedSearchEmailPromptFragment.class, this.f10659b.f10100F).mo56613b(SdlModalFragment.class, this.f10659b.f10105G).mo56613b(SignInActivity.class, this.f10659b.f10110H).mo56613b(NotificationActivity.class, this.f10659b.f10115I).mo56613b(FavoritesShortcutActivity.class, this.f10659b.f10120J).mo56613b(PurchasesShortcutActivity.class, this.f10659b.f10125K).mo56613b(CartShortcutActivity.class, this.f10659b.f10130L).mo56613b(SearchInterstitialActivity.class, this.f10659b.f10135M).mo56613b(HomescreenTabsActivity.class, this.f10659b.f10140N).mo56613b(BitlyActivity.class, this.f10659b.f10145O).mo56613b(CreateReviewActivity.class, this.f10659b.f10150P).mo56613b(EtsyPreferenceActivity.class, this.f10659b.f10155Q).mo56613b(BOEActivity.class, this.f10659b.f10160R).mo56613b(LocaleReceiver.class, this.f10659b.f10165S).mo56613b(ElkLogUploadWorker.class, this.f10659b.f10170T).mo56613b(SearchImpressionsUploadWorker.class, this.f10659b.f10175U).mo56613b(AdImpressionsUploadWorker.class, this.f10659b.f10180V).mo56613b(AnalyticsUploadWorker.class, this.f10659b.f10185W).mo56613b(EtsyPostWorker.class, this.f10659b.f10190X).mo56613b(FirebasePushService.class, this.f10659b.f10195Y).mo56613b(SignInContainerActivity.class, this.f10659b.f10200Z).mo56613b(SocialShareBroadcastReceiver.class, this.f10659b.f10206a0).mo56613b(PrefsFragment.class, this.f10661d).mo56613b(ConfigFlagsFragment.class, this.f10662e).mo56613b(OnboardingCategoryQuizFragment.class, this.f10663f).mo56612a(), ImmutableMap.m25853of());
    }
}
