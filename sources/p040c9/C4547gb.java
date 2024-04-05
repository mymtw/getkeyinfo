package p040c9;

import androidx.activity.result.C0123f;
import com.etsy.android.deeplinking.bitly.BitlyActivity;
import com.etsy.android.device.LocaleReceiver;
import com.etsy.android.lib.core.posts.EtsyPostWorker;
import com.etsy.android.lib.dagger.C8654m;
import com.etsy.android.lib.logger.analytics.AnalyticsUploadWorker;
import com.etsy.android.lib.logger.elk.uploading.ElkLogUploadWorker;
import com.etsy.android.lib.network.oauth2.signin.C8776e;
import com.etsy.android.lib.network.oauth2.signin.C8777f;
import com.etsy.android.lib.network.oauth2.signin.C8781i;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.lib.network.oauth2.signin.C8784l;
import com.etsy.android.lib.network.oauth2.signin.C8785m;
import com.etsy.android.lib.network.oauth2.signin.SignInContainerActivity;
import com.etsy.android.lib.push.handler.BrazeReceiver;
import com.etsy.android.lib.push.handler.FirebasePushService;
import com.etsy.android.p072ad.AdImpressionsUploadWorker;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.EtsyPreferenceActivity;
import com.etsy.android.p327ui.cart.CartShortcutActivity;
import com.etsy.android.p327ui.favorites.FavoritesShortcutActivity;
import com.etsy.android.p327ui.homescreen.HomescreenTabsActivity;
import com.etsy.android.p327ui.login.ThirdPartySignInFragment;
import com.etsy.android.p327ui.nav.NotificationActivity;
import com.etsy.android.p327ui.sdl.SdlModalFragment;
import com.etsy.android.p327ui.search.p330v2.impressions.SearchImpressionsUploadWorker;
import com.etsy.android.p327ui.search.p330v2.interstitial.SearchInterstitialActivity;
import com.etsy.android.p327ui.search.savedsearch.SavedSearchEmailPromptFragment;
import com.etsy.android.p327ui.user.auth.C11478f;
import com.etsy.android.p327ui.user.auth.SignInActivity;
import com.etsy.android.p327ui.user.purchases.PurchasesShortcutActivity;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.etsy.android.share.SocialShareBroadcastReceiver;
import com.google.android.gms.measurement.internal.C15099u;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.C17554c;
import dagger.internal.C17556e;
import p389lc.C13010a;
import p394m9.C13026a;
import p394m9.C13027b;
import p740eq.C19011a;

/* renamed from: c9.gb */
public final class C4547gb implements C17550a {

    /* renamed from: b */
    public final C15099u f10007b;

    /* renamed from: c */
    public final SignInActivity f10008c;

    /* renamed from: d */
    public final C4579j1 f10009d;

    /* renamed from: e */
    public final C4547gb f10010e = this;

    /* renamed from: f */
    public C4533fb f10011f;

    /* renamed from: g */
    public C17556e f10012g;

    /* renamed from: h */
    public C19011a<C8781i> f10013h;

    /* renamed from: i */
    public C19011a<C13026a> f10014i;

    /* renamed from: j */
    public C19011a<C0123f> f10015j;

    /* renamed from: k */
    public C19011a<C8776e> f10016k;

    /* renamed from: l */
    public C19011a<C8784l> f10017l;

    public C4547gb(C4579j1 j1Var, C15099u uVar, SignInActivity signInActivity) {
        this.f10009d = j1Var;
        this.f10007b = uVar;
        this.f10008c = signInActivity;
        this.f10011f = new C4533fb(this);
        C17556e a = C17556e.m29429a(signInActivity);
        this.f10012g = a;
        C19011a<C8781i> b = C17554c.m29427b(new C8782j(a, 0));
        this.f10013h = b;
        this.f10014i = C17554c.m29427b(new C13027b(b, 0));
        C19011a<C0123f> b2 = C17554c.m29427b(new C11478f(this.f10012g));
        this.f10015j = b2;
        this.f10016k = C17554c.m29427b(new C8777f(j1Var.f10085C, b2, 0));
        this.f10017l = C17554c.m29427b(new C8785m(this.f10012g, this.f10015j, j1Var.f10278m0, 0));
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SignInActivity signInActivity = (SignInActivity) obj;
        signInActivity.dispatchingAndroidInjector = new DispatchingAndroidInjector<>(ImmutableMap.builderWithExpectedSize(24).mo56613b(BrazeReceiver.class, this.f10009d.f10095E).mo56613b(SavedSearchEmailPromptFragment.class, this.f10009d.f10100F).mo56613b(SdlModalFragment.class, this.f10009d.f10105G).mo56613b(SignInActivity.class, this.f10009d.f10110H).mo56613b(NotificationActivity.class, this.f10009d.f10115I).mo56613b(FavoritesShortcutActivity.class, this.f10009d.f10120J).mo56613b(PurchasesShortcutActivity.class, this.f10009d.f10125K).mo56613b(CartShortcutActivity.class, this.f10009d.f10130L).mo56613b(SearchInterstitialActivity.class, this.f10009d.f10135M).mo56613b(HomescreenTabsActivity.class, this.f10009d.f10140N).mo56613b(BitlyActivity.class, this.f10009d.f10145O).mo56613b(CreateReviewActivity.class, this.f10009d.f10150P).mo56613b(EtsyPreferenceActivity.class, this.f10009d.f10155Q).mo56613b(BOEActivity.class, this.f10009d.f10160R).mo56613b(LocaleReceiver.class, this.f10009d.f10165S).mo56613b(ElkLogUploadWorker.class, this.f10009d.f10170T).mo56613b(SearchImpressionsUploadWorker.class, this.f10009d.f10175U).mo56613b(AdImpressionsUploadWorker.class, this.f10009d.f10180V).mo56613b(AnalyticsUploadWorker.class, this.f10009d.f10185W).mo56613b(EtsyPostWorker.class, this.f10009d.f10190X).mo56613b(FirebasePushService.class, this.f10009d.f10195Y).mo56613b(SignInContainerActivity.class, this.f10009d.f10200Z).mo56613b(SocialShareBroadcastReceiver.class, this.f10009d.f10206a0).mo56613b(ThirdPartySignInFragment.class, this.f10011f).mo56612a(), ImmutableMap.m25853of());
        signInActivity.mAnalyticsTracker = C8654m.m17038a(this.f10007b, this.f10008c);
        signInActivity.performanceTracker = this.f10009d.mo14412u();
        signInActivity.darkModeController = new C13010a(this.f10009d.f10090D.get());
        signInActivity.darkModeTracker = C4579j1.m10251b(this.f10009d);
        signInActivity.configMap = this.f10009d.mo14404m();
        signInActivity.externalAccountDelegate = this.f10014i.get();
        signInActivity.signInEventManager = this.f10009d.f10132L1.get();
        signInActivity.configMap = this.f10009d.mo14404m();
    }
}
