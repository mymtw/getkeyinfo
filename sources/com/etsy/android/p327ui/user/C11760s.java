package com.etsy.android.p327ui.user;

import android.net.Uri;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.config.bucketing.C8617e;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.homescreen.C10074a;
import com.etsy.android.p327ui.navigation.deeplinks.DeepLinkHandlerException;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.OrderTrackingKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p428qc.C13294e;

/* renamed from: com.etsy.android.ui.user.s */
public final class C11760s implements C12729e {

    /* renamed from: a */
    public final C12741o f26203a;

    /* renamed from: b */
    public final C13294e f26204b;

    public C11760s(C12741o oVar, C13294e eVar) {
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(eVar, "homescreenEventManager");
        this.f26203a = oVar;
        this.f26204b = eVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C12731g gVar;
        Uri uri = fVar.f28049b;
        C12741o oVar = this.f26203a;
        DeepLinkEntity deepLinkEntity = DeepLinkEntity.RECEIPT;
        if (!oVar.mo45509b(uri, deepLinkEntity.getEntityName())) {
            C12741o oVar2 = this.f26203a;
            deepLinkEntity = DeepLinkEntity.ORDER;
            if (!oVar2.mo45509b(uri, deepLinkEntity.getEntityName())) {
                C12741o oVar3 = this.f26203a;
                deepLinkEntity = DeepLinkEntity.ORDERS;
                if (!oVar3.mo45509b(uri, deepLinkEntity.getEntityName())) {
                    throw new DeepLinkHandlerException(C0073e.m206f("invalid deep link entity ", uri));
                }
            }
        }
        Uri uri2 = fVar.f28049b;
        C12741o oVar4 = this.f26203a;
        DeepLinkEntity deepLinkEntity2 = DeepLinkEntity.TRACK_ORDER;
        if (!oVar4.mo45509b(uri2, deepLinkEntity2.getEntityName())) {
            C12741o oVar5 = this.f26203a;
            deepLinkEntity2 = DeepLinkEntity.ORDER_TRACKING;
            if (!oVar5.mo45509b(uri2, deepLinkEntity2.getEntityName())) {
                throw new DeepLinkHandlerException(C0073e.m206f("invalid deep link entity ", uri2));
            }
        }
        String e = this.f26203a.mo45510e(fVar.f28049b, deepLinkEntity.getEntityName());
        String e2 = this.f26203a.mo45510e(fVar.f28049b, deepLinkEntity2.getEntityName());
        Long l = null;
        boolean z = false;
        if ((e2 != null ? C19456j.m33017U0(e2) : null) != null) {
            if (e != null) {
                l = C19456j.m33017U0(e);
            }
            if (l != null) {
                z = true;
            }
            if (z) {
                if (fVar.f28048a.mo21331a(C8617e.f18935d).f18927b) {
                    C19383o.m32794d(e);
                    long parseLong = Long.parseLong(e);
                    C19383o.m32794d(e2);
                    this.f26204b.mo45971a(new C10074a(Long.valueOf(Long.parseLong(e2)), parseLong));
                    return new C12731g.C12733b(new HomePagerKey(fVar.f28050c, fVar.f28051d, true));
                }
                gVar = new C12731g.C12733b(new OrderTrackingKey(fVar.f28050c, (String) null, new EtsyId(e), new EtsyId(e2), fVar.f28051d, 2, (DefaultConstructorMarker) null));
                return gVar;
            }
        }
        gVar = new C12731g.C12732a("Invalid order tracking " + fVar + ".uri");
        return gVar;
    }
}
