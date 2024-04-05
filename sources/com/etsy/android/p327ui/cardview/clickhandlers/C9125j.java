package com.etsy.android.p327ui.cardview.clickhandlers;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.compose.p015ui.text.font.C1948d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.profileinstaller.C3067i;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.vespa.UserAction;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.lib.requests.SearchAdsLogRequest;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.p327ui.cardview.clickhandlers.C9126k;
import com.etsy.android.p327ui.favorites.C9853h;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import com.etsy.android.stylekit.views.FavHeartButton;
import com.etsy.android.vespa.VespaBottomSheetDialog;
import com.google.logging.type.LogSeverity;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p119g9.C6897b;
import p145io.reactivex.internal.operators.completable.C19089c;
import p145io.reactivex.internal.operators.completable.C19092e;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p248tp.C8066r;
import p277w8.C8263a;
import p277w8.C8264b;
import p277w8.C8267e;
import p286x8.C8327a;
import p356ge.C12790b;
import p370ie.C12948h;
import p370ie.C12949i;
import p402n9.C13096p;
import p407nf.C13113a;
import p415of.C13180i;
import p425q9.C13265p;
import p456ua.C13461f;
import p463v9.C13536a;
import p463v9.C13537b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.j */
public class C9125j extends C13113a {

    /* renamed from: d */
    public C13180i f20056d;

    /* renamed from: e */
    public C9126k f20057e = C9126k.C9127a.f20059a;

    /* renamed from: f */
    public final C8267e f20058f;

    public C9125j(Fragment fragment, C13180i iVar, C8703p pVar, C9126k.C9128b bVar, C8267e eVar) {
        super(fragment, pVar);
        this.f20056d = iVar;
        if (bVar != null) {
            this.f20057e = bVar;
        }
        this.f20058f = eVar;
    }

    /* renamed from: g */
    public static void m17531g(HashMap hashMap, ListingLike listingLike) {
        hashMap.put(PredefinedAnalyticsProperty.LISTING_ID, listingLike.getListingId().getId());
        hashMap.put(PredefinedAnalyticsProperty.IS_AD, Boolean.valueOf(listingLike.isAd()));
        if (listingLike instanceof ListingCard) {
            String contentSource = ((ListingCard) listingLike).getContentSource();
            if (!TextUtils.isEmpty(contentSource)) {
                hashMap.put(PredefinedAnalyticsProperty.CONTENT_SOURCE, contentSource);
            }
        }
    }

    /* renamed from: c */
    public final void mo31328c(Object obj) {
        mo31349e((ListingLike) obj, true, (Bundle) null);
    }

    /* renamed from: d */
    public final void mo31348d(ListingCard listingCard, FavHeartButton favHeartButton, int i) {
        Fragment a = mo45889a();
        if (a != null) {
            boolean z = false;
            if (C18263b.f40057V.mo45958c().equals(listingCard.getShopId())) {
                Toast.makeText(a.requireContext(), R.string.favorite_own_item_message, 0).show();
                return;
            }
            EtsyId listingId = listingCard.getListingId();
            if (!C18263b.f40057V.mo45960e()) {
                EtsyAction.C8658a aVar = EtsyAction.Companion;
                String d = C12790b.m20432d(a);
                EtsyAction etsyAction = EtsyAction.FAVORITE;
                C19383o.m32797g(etsyAction, "signInAction");
                C12790b.m20430b(a, new C12949i(new C12948h(d, etsyAction, (Bundle) null, listingId.getId(), (String) null, (String) null, 32), (Fragment) null, (int) LogSeverity.NOTICE_VALUE));
                return;
            }
            FragmentActivity requireActivity = mo45889a().requireActivity();
            if (requireActivity instanceof C6897b) {
                C6897b bVar = (C6897b) requireActivity;
                boolean z2 = !listingCard.hasCollections() && !listingCard.isFavorite();
                if (listingCard.isFavorite() && !listingCard.hasCollections()) {
                    z = true;
                }
                if (z2 || z) {
                    boolean z3 = !listingCard.isFavorite();
                    favHeartButton.setFav(z3, listingCard.getTitle(), true);
                    new C9853h();
                    if (z3) {
                        Context context = favHeartButton.getContext();
                        C19383o.m32796f(context, "favButton.context");
                        C1948d.m4270b(context, 10);
                    }
                    bVar.getFavoriteHandler().mo19010a(listingCard, requireActivity, new C9123h(this, listingCard, this.f28980b.f19116n.mo21132b(C8592b.C8595c.f18862f), i));
                    return;
                }
                bVar.getFavoriteHandler().mo19011b(listingCard, requireActivity);
            }
        }
    }

    /* renamed from: e */
    public void mo31349e(ListingLike listingLike, boolean z, Bundle bundle) {
        HashMap hashMap = new HashMap();
        m17531g(hashMap, listingLike);
        C8703p pVar = this.f28980b;
        pVar.mo21333d(this.f28980b.f19060b + "_tapped_listing", hashMap);
        if (listingLike.isAd() && C8885d0.m17324h(listingLike.getProlistLoggingKey())) {
            C8267e eVar = this.f20058f;
            String prolistLoggingKey = listingLike.getProlistLoggingKey();
            eVar.getClass();
            C19383o.m32797g(prolistLoggingKey, "loggingKey");
            eVar.f18108a.mo21308c();
            if (eVar.f18115h.mo21132b(C8592b.f18838v1)) {
                eVar.f18116i.mo45474a("ad_click_logging.workmanager");
                C19089c b = eVar.f18110c.mo20914b(new C8327a(0, prolistLoggingKey));
                eVar.f18113f.getClass();
                C8066r b2 = C13461f.m21235b();
                b.getClass();
                new CompletableSubscribeOn(b, b2).mo20608c(new C8264b(eVar, 0), new C8263a(eVar));
            } else {
                eVar.f18116i.mo45474a("ad_click_logging.estyrequestpost");
                C13265p pVar2 = C18263b.f40057V;
                if (pVar2 != null) {
                    C13537b bVar = pVar2.f29142h;
                    SearchAdsLogRequest logSearchAdsClick = SearchAdsLogRequest.logSearchAdsClick(prolistLoggingKey);
                    bVar.getClass();
                    if (logSearchAdsClick == null) {
                        C8694h.f19097a.mo21306a("add - Won't accept null posts");
                    } else {
                        C19092e eVar2 = new C19092e(new C3067i(1, bVar, logSearchAdsClick));
                        EtsyApplication.get().getRxSchedulers().getClass();
                        new CompletableSubscribeOn(eVar2, C13461f.m21235b()).mo20608c(new C13536a(0), new C13096p(1));
                    }
                } else {
                    C19383o.m32805o("session");
                    throw null;
                }
            }
        } else if (listingLike.isAd() && !C8885d0.m17324h(listingLike.getProlistLoggingKey())) {
            C18263b.f40052P.mo45450b(C9125j.class.getSimpleName(), "Ad click was seen but not logged because getProlistLoggingKey() was null or empty");
        }
        Fragment a = mo45889a();
        String d = C12790b.m20432d(mo45889a());
        EtsyId listingId = listingLike.getListingId();
        C19383o.m32797g(listingId, "listingId");
        C12790b.m20430b(a, new ListingKey(d, listingId, listingLike.shouldShowRelatedListings(), z, bundle));
    }

    /* renamed from: f */
    public final void mo31350f(ListingCard listingCard) {
        Fragment a = mo45889a();
        if (a != null) {
            VespaBottomSheetDialog vespaBottomSheetDialog = new VespaBottomSheetDialog(a, this.f28980b);
            vespaBottomSheetDialog.setOnCancelListener(new C9122g(this, listingCard));
            List<UserAction> a2 = this.f20057e.mo31352a(a.getResources(), C18263b.f40057V.mo45960e() && listingCard.hasCollections());
            vespaBottomSheetDialog.addItems(a2);
            vespaBottomSheetDialog.registerItemClickHandler(a2.get(0).getViewType(), new C9124i(this, a, this.f28980b, listingCard, vespaBottomSheetDialog));
            vespaBottomSheetDialog.show();
        }
    }

    /* renamed from: h */
    public final void mo31351h(ListingLike listingLike, String str) {
        HashMap hashMap = new HashMap();
        m17531g(hashMap, listingLike);
        this.f28980b.mo21333d(str, hashMap);
    }
}
