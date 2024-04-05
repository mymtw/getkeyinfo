package p040c9;

import com.etsy.android.deeplinking.bitly.BitlyActivity;
import com.etsy.android.device.LocaleReceiver;
import com.etsy.android.lib.core.posts.EtsyPostWorker;
import com.etsy.android.lib.dagger.C8654m;
import com.etsy.android.lib.logger.analytics.AnalyticsUploadWorker;
import com.etsy.android.lib.logger.elk.uploading.ElkLogUploadWorker;
import com.etsy.android.lib.network.oauth2.signin.OAuth2SignInFragment;
import com.etsy.android.lib.network.oauth2.signin.SignInContainerActivity;
import com.etsy.android.lib.push.handler.BrazeReceiver;
import com.etsy.android.lib.push.handler.FirebasePushService;
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
import com.google.android.gms.measurement.internal.C15099u;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import dagger.android.DispatchingAndroidInjector;
import p389lc.C13010a;

/* renamed from: c9.jb */
public final class C4589jb implements C17550a {

    /* renamed from: b */
    public final C15099u f10361b;

    /* renamed from: c */
    public final SignInContainerActivity f10362c;

    /* renamed from: d */
    public final C4579j1 f10363d;

    /* renamed from: e */
    public final C4589jb f10364e = this;

    /* renamed from: f */
    public C4575ib f10365f;

    public C4589jb(C4579j1 j1Var, C15099u uVar, SignInContainerActivity signInContainerActivity) {
        this.f10363d = j1Var;
        this.f10361b = uVar;
        this.f10362c = signInContainerActivity;
        this.f10365f = new C4575ib(this);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SignInContainerActivity signInContainerActivity = (SignInContainerActivity) obj;
        signInContainerActivity.dispatchingAndroidInjector = new DispatchingAndroidInjector<>(ImmutableMap.builderWithExpectedSize(24).mo56613b(BrazeReceiver.class, this.f10363d.f10095E).mo56613b(SavedSearchEmailPromptFragment.class, this.f10363d.f10100F).mo56613b(SdlModalFragment.class, this.f10363d.f10105G).mo56613b(SignInActivity.class, this.f10363d.f10110H).mo56613b(NotificationActivity.class, this.f10363d.f10115I).mo56613b(FavoritesShortcutActivity.class, this.f10363d.f10120J).mo56613b(PurchasesShortcutActivity.class, this.f10363d.f10125K).mo56613b(CartShortcutActivity.class, this.f10363d.f10130L).mo56613b(SearchInterstitialActivity.class, this.f10363d.f10135M).mo56613b(HomescreenTabsActivity.class, this.f10363d.f10140N).mo56613b(BitlyActivity.class, this.f10363d.f10145O).mo56613b(CreateReviewActivity.class, this.f10363d.f10150P).mo56613b(EtsyPreferenceActivity.class, this.f10363d.f10155Q).mo56613b(BOEActivity.class, this.f10363d.f10160R).mo56613b(LocaleReceiver.class, this.f10363d.f10165S).mo56613b(ElkLogUploadWorker.class, this.f10363d.f10170T).mo56613b(SearchImpressionsUploadWorker.class, this.f10363d.f10175U).mo56613b(AdImpressionsUploadWorker.class, this.f10363d.f10180V).mo56613b(AnalyticsUploadWorker.class, this.f10363d.f10185W).mo56613b(EtsyPostWorker.class, this.f10363d.f10190X).mo56613b(FirebasePushService.class, this.f10363d.f10195Y).mo56613b(SignInContainerActivity.class, this.f10363d.f10200Z).mo56613b(SocialShareBroadcastReceiver.class, this.f10363d.f10206a0).mo56613b(OAuth2SignInFragment.class, this.f10365f).mo56612a(), ImmutableMap.m25853of());
        signInContainerActivity.mAnalyticsTracker = C8654m.m17038a(this.f10361b, this.f10362c);
        signInContainerActivity.performanceTracker = this.f10363d.mo14412u();
        signInContainerActivity.darkModeController = new C13010a(this.f10363d.f10090D.get());
        signInContainerActivity.darkModeTracker = C4579j1.m10251b(this.f10363d);
        signInContainerActivity.configMap = this.f10363d.mo14404m();
    }
}
