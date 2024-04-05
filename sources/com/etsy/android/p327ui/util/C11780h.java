package com.etsy.android.p327ui.util;

import android.content.Context;
import android.content.Intent;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopFollowResponse;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.shop.C11306x;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import okhttp3.C19928a0;
import p145io.reactivex.internal.operators.single.C19198c;
import p145io.reactivex.internal.operators.single.C19202e;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.subjects.PublishSubject;
import p248tp.C8071s;
import p251u1.C8115a;
import p400mf.C13074b;
import p400mf.C13079d;
import p402n9.C13086f;
import p456ua.C13461f;
import p470w9.C13793a;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.util.h */
public final class C11780h {

    /* renamed from: a */
    public final Context f26246a;

    /* renamed from: b */
    public final C11781i f26247b;

    public C11780h(Context context, C11781i iVar, C13461f fVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(iVar, "favoriteRequestEndpoint");
        C19383o.m32797g(fVar, "rxSchedulers");
        this.f26246a = context;
        this.f26247b = iVar;
    }

    /* renamed from: a */
    public final C8071s<ShopFollowResponse> mo38047a(C11782j jVar, C8672b bVar) {
        C19383o.m32797g(bVar, "analyticsTracker");
        HashMap r0 = C19294b0.m32561r0(new Pair(PredefinedAnalyticsProperty.SHOP_USER_ID, Long.valueOf(jVar.f26248a.getIdAsLongDeprecated())));
        PublishSubject<C13074b> publishSubject = C13079d.f28754a;
        long idAsLongDeprecated = jVar.f26248a.getIdAsLongDeprecated();
        String str = jVar.f26249b;
        boolean z = jVar.f26250c;
        C19383o.m32797g(str, "shopName");
        C13079d.f28754a.onNext(new C13074b.C13077c(idAsLongDeprecated, str, z));
        mo38048b(jVar.f26248a, jVar.f26250c);
        if (!jVar.f26250c) {
            bVar.mo21333d("remove_favorite_shop", r0);
            C8071s<C20145v<C19928a0>> d = this.f26247b.mo38052d(jVar.f26248a.getId());
            C13793a aVar = new C13793a(6);
            d.getClass();
            return new C19208j(new C19198c(new C19208j(d, aVar), new C11306x(1, jVar, this)), new C13086f(4));
        }
        bVar.mo21333d("favorite_shop", r0);
        C8071s<ShopFollowResponse> b = this.f26247b.mo38050b(C19421p.m32931U(new Pair("shop_id", jVar.f26248a.getId())));
        C11778f fVar = new C11778f(jVar, this);
        b.getClass();
        return new C19202e(new C19198c(b, fVar), new C11779g());
    }

    /* renamed from: b */
    public final void mo38048b(EtsyId etsyId, boolean z) {
        Intent intent = new Intent();
        intent.setAction(EtsyAction.STATE_CHANGE.getIntentAction());
        intent.putExtra("id", etsyId.toString());
        intent.putExtra(EtsyAction.STATE_FAVORITE, z);
        C8115a.m16322a(this.f26246a).mo20709c(intent);
    }
}
