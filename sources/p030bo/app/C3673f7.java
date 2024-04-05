package p030bo.app;

import android.accounts.Account;
import android.content.Context;
import androidx.compose.foundation.layout.C0761x;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.appboy.models.cards.ICardListener;
import com.appboy.p043ui.feed.view.BaseFeedCardView;
import com.braze.Braze;
import com.braze.configuration.C5410a;
import com.braze.support.BrazeLogger;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.etsy.android.config.PrefsFragment;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.currency.C8634f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.network.oauth2.C8767q;
import com.etsy.android.lib.network.oauth2.ExternalIdentityProvider;
import com.etsy.android.lib.network.oauth2.signin.C8772a;
import com.etsy.android.lib.network.oauth2.signin.C8784l;
import com.etsy.android.p327ui.favorites.createalist.C9826o;
import com.etsy.android.p327ui.favorites.createalist.NameAListPresenter;
import com.etsy.android.p327ui.home.landingpage.C10013a;
import com.etsy.android.p327ui.home.landingpage.C10021c;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.ShippingAndPoliciesPanelViewHolder;
import com.etsy.android.p327ui.shop.C11179n;
import com.etsy.android.p327ui.shop.C11181o;
import com.etsy.android.p327ui.user.C11520e;
import com.etsy.android.p327ui.user.review.C11715n;
import com.etsy.android.p327ui.user.review.C11751v;
import com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView;
import com.etsy.android.util.C12043f;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.C14246c;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.perf.config.RemoteConfigManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p143i9.C7000b;
import p145io.reactivex.internal.operators.single.SingleFlatMap;
import p248tp.C8049b;
import p248tp.C8051d;
import p248tp.C8072t;
import p248tp.C8074v;
import p287xp.C8339g;
import p402n9.C13092l;
import p456ua.C13461f;
import p466vc.C13597g;
import p513bj.C14049b0;
import p580hj.C17814a;
import p580hj.C17819e;
import p588ij.C17846e;
import p588ij.C17847f;
import p605kk.C18120d;
import p644ph.C18336a;
import p644ph.C18358o;
import retrofit2.C20145v;
import retrofit2.HttpException;

/* renamed from: bo.app.f7 */
public final /* synthetic */ class C3673f7 implements C18120d, Preference.C3010d, StructuredShopPoliciesView.C11958c, MediaCodecUtil.C14239f, C8339g, ICardListener, Preference.C3012f, C8074v, C8051d, C18336a.C18340d {

    /* renamed from: b */
    public final /* synthetic */ int f8425b;

    /* renamed from: c */
    public final /* synthetic */ Object f8426c;

    public /* synthetic */ C3673f7(Object obj, int i) {
        this.f8425b = i;
        this.f8426c = obj;
    }

    /* renamed from: a */
    public void mo414a(Exception exc) {
        switch (this.f8425b) {
            case 0:
                C3977n1.m9200a((C4243v1) this.f8426c, exc);
                return;
            default:
                ((RemoteConfigManager) this.f8426c).m27422xc904e814(exc);
                return;
        }
    }

    public Object apply(Object obj) {
        int i = 0;
        String str = null;
        switch (this.f8425b) {
            case 0:
                C8767q qVar = (C8767q) this.f8426c;
                C8772a aVar = (C8772a) obj;
                C19383o.m32797g(qVar, "this$0");
                C19383o.m32797g(aVar, "result");
                SingleFlatMap a = qVar.f19283d.mo30079a(ExternalIdentityProvider.GOOGLE, aVar.f19308a, aVar.f19309b);
                qVar.f19285f.getClass();
                return a.mo20660i(C13461f.m21235b());
            case 1:
                Set set = (Set) obj;
                C19383o.m32797g((NameAListPresenter) this.f8426c, "this$0");
                C19383o.m32797g(set, "it");
                ListingCard listingCard = (ListingCard) C19327t.m32639U0(set);
                return listingCard != null ? new C9826o(listingCard.getImg()) : new C9826o((ListingImage) null);
            case 2:
                C10021c cVar = (C10021c) this.f8426c;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(cVar, "this$0");
                C19383o.m32797g(th, "it");
                HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
                if (httpException != null) {
                    str = C0761x.m1690R0(httpException, cVar.f22070b);
                }
                if (httpException != null) {
                    i = httpException.code();
                }
                return new C10013a.C10015b(str, i, httpException);
            case 3:
                C11179n nVar = (C11179n) this.f8426c;
                Throwable th2 = (Throwable) obj;
                C19383o.m32797g(nVar, "this$0");
                C19383o.m32797g(th2, "it");
                HttpException httpException2 = th2 instanceof HttpException ? (HttpException) th2 : null;
                if (httpException2 != null) {
                    i = httpException2.code();
                }
                if (httpException2 != null) {
                    str = C0761x.m1690R0(httpException2, nVar.f24723b);
                }
                return new C11181o.C11182a(str, i, httpException2);
            case 4:
                C11520e eVar = (C11520e) this.f8426c;
                Map map = (Map) obj;
                C19383o.m32797g(eVar, "this$0");
                C19383o.m32797g(map, "currencyMap");
                C8634f fVar = eVar.f25416b;
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(map);
                fVar.getClass();
                fVar.f18980a = concurrentHashMap;
                return C19327t.m32655k1(map.values());
            default:
                C11715n nVar2 = (C11715n) this.f8426c;
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(nVar2, "this$0");
                C19383o.m32797g(vVar, ResponseConstants.RESPONSE);
                return vVar.mo74384a() ? C11751v.C11753b.f26191a : new C11751v.C11752a(C0761x.m1692S0(vVar, nVar2.f26066b), Integer.valueOf(vVar.f44614a.f44365f), 4);
        }
    }

    /* renamed from: b */
    public long mo13304b(long j) {
        C18358o oVar = (C18358o) this.f8426c;
        return C14049b0.m21637j((j * ((long) oVar.f40309e)) / 1000000, 0, oVar.f40314j - 1);
    }

    /* renamed from: c */
    public CharSequence mo11017c(Preference preference) {
        return ConfigPreferencesHelper.m34839setUpFeaturesDateOverridePreference$lambda4((ConfigPreferencesHelper) this.f8426c, (EditTextPreference) preference);
    }

    /* renamed from: d */
    public void mo10586d(C8049b bVar) {
        C12043f fVar = (C12043f) this.f8426c;
        C19383o.m32797g(fVar, "this$0");
        if (C12043f.m19857d().isStopped()) {
            C12043f.m19857d().stop(false, fVar.f26845c);
        }
        C12043f.m19857d().start(fVar.f26845c);
        bVar.onComplete();
    }

    /* renamed from: e */
    public int mo3372e(Object obj) {
        Format format = (Format) this.f8426c;
        C14246c cVar = (C14246c) obj;
        Pattern pattern = MediaCodecUtil.f31669a;
        try {
            return cVar.mo47400c(format) ? 1 : 0;
        } catch (MediaCodecUtil.DecoderQueryException unused) {
            return -1;
        }
    }

    /* renamed from: f */
    public void mo11996f(C8072t tVar) {
        Braze f;
        C8072t tVar2 = tVar;
        switch (this.f8425b) {
            case 2:
                C13092l lVar = (C13092l) this.f8426c;
                C19383o.m32797g(lVar, "this$0");
                String f2 = lVar.f28783d.mo21136f(C8592b.C8596d.f18867b);
                C19383o.m32796f(f2, "config.getStringValue(Et…Braze.BRAZE_FCM_ENDPOINT)");
                boolean b = lVar.f28783d.mo21132b(C8592b.C8596d.f18868c);
                synchronized (C13092l.class) {
                    if (b) {
                        BrazeLogger.m11289k(2);
                    }
                    C5410a.C5411a aVar = new C5410a.C5411a();
                    aVar.mo15902a(lVar.f28786g);
                    aVar.f11674e = f2;
                    aVar.f11689t = Boolean.FALSE;
                    aVar.f11672c = "firebase_default_icon";
                    C5410a aVar2 = new C5410a(aVar);
                    Braze.Companion companion = Braze.f11170m;
                    companion.mo15511a(lVar.f28780a, aVar2);
                    companion.mo15513c(lVar.f28780a);
                    f = companion.mo15515f(lVar.f28780a);
                    f.mo15492e(lVar.f28782c.mo45958c().toString());
                }
                tVar2.onSuccess(f);
                return;
            default:
                C8784l lVar2 = (C8784l) this.f8426c;
                C19383o.m32797g(lVar2, "this$0");
                String f3 = lVar2.f19333c.mo21136f(C8592b.f18735H);
                if (f3 == null) {
                    f3 = "";
                }
                String str = f3;
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
                new HashSet();
                new HashMap();
                Preconditions.checkNotNull(googleSignInOptions);
                HashSet hashSet = new HashSet(googleSignInOptions.zag);
                boolean zab = googleSignInOptions.zaj;
                boolean zac = googleSignInOptions.zak;
                boolean unused = googleSignInOptions.zai;
                String zae = googleSignInOptions.zal;
                Account zaf = googleSignInOptions.zah;
                String zag = googleSignInOptions.zam;
                Map zaa = GoogleSignInOptions.zab((List<GoogleSignInOptionsExtensionParcelable>) googleSignInOptions.zan);
                String zai = googleSignInOptions.zao;
                hashSet.add(GoogleSignInOptions.zab);
                hashSet.add(GoogleSignInOptions.zaa);
                Preconditions.checkNotEmpty(str);
                Preconditions.checkArgument(zae == null || zae.equals(str), "two different server client ids provided");
                if (hashSet.contains(GoogleSignInOptions.zae)) {
                    Scope scope = GoogleSignInOptions.zad;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                if (zaf == null || !hashSet.isEmpty()) {
                    hashSet.add(GoogleSignInOptions.zac);
                }
                C17814a aVar3 = new C17814a(lVar2.f19331a, (GoogleSignInOptions) Preconditions.checkNotNull(new GoogleSignInOptions(3, new ArrayList(hashSet), zaf, true, zab, zac, str, zag, zaa, zai, (C17819e) null)));
                GoogleApiClient asGoogleApiClient = aVar3.asGoogleApiClient();
                Context applicationContext = aVar3.getApplicationContext();
                boolean z = aVar3.mo69050a() == 3;
                C17846e.f38760a.mo49326d("Signing out", new Object[0]);
                C17846e.m29974b(applicationContext);
                PendingResultUtil.toVoidTask(z ? PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, asGoogleApiClient) : asGoogleApiClient.execute(new C17847f(asGoogleApiClient))).mo69656c(new C7000b(lVar2, aVar3, tVar2));
                return;
        }
    }

    /* renamed from: g */
    public boolean mo412g(Preference preference) {
        return PrefsFragment.m34855addPushOptInPrefs$lambda12$lambda11((PrefsFragment) this.f8426c, preference);
    }

    public void onCardUpdate() {
        ((BaseFeedCardView) this.f8426c).lambda$setCard$1();
    }

    public void onExpanded() {
        ShippingAndPoliciesPanelViewHolder shippingAndPoliciesPanelViewHolder = (ShippingAndPoliciesPanelViewHolder) this.f8426c;
        int i = ShippingAndPoliciesPanelViewHolder.f23196x;
        C19383o.m32797g(shippingAndPoliciesPanelViewHolder, "this$0");
        shippingAndPoliciesPanelViewHolder.f23197b.mo38043a(C13597g.C13768y2.f30299a);
    }
}
