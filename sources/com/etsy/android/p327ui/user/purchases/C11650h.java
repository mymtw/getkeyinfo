package com.etsy.android.p327ui.user.purchases;

import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.config.bucketing.C8617e;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.homescreen.C10074a;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.OrderTrackingKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.PurchasesKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ReceiptKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p428qc.C13294e;

/* renamed from: com.etsy.android.ui.user.purchases.h */
public final class C11650h implements C12729e {

    /* renamed from: a */
    public final C12741o f25776a;

    /* renamed from: b */
    public final C13294e f25777b;

    public C11650h(C12741o oVar, C13294e eVar) {
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(eVar, "homescreenEventManager");
        this.f25776a = oVar;
        this.f25777b = eVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        Uri uri = fVar.f28049b;
        String str = fVar.f28050c;
        Bundle bundle = fVar.f28051d;
        this.f25776a.getClass();
        String d = C12741o.m20404d(uri, ResponseConstants.SHOW_SHIPPING);
        String e = this.f25776a.mo45510e(uri, DeepLinkEntity.PURCHASES.getEntityName());
        Long l = null;
        if ((d != null ? C19456j.m33017U0(d) : null) != null) {
            C8672b bVar = fVar.f28048a;
            if (e != null) {
                l = C19456j.m33017U0(e);
            }
            if (l == null) {
                return new C12731g.C12732a(C0073e.m206f("Missing receipt id for tracking ", uri));
            }
            if (!bVar.mo21331a(C8617e.f18935d).f18927b) {
                return new C12731g.C12733b(new OrderTrackingKey(str, (String) null, new EtsyId(e), new EtsyId(d), bundle, 2, (DefaultConstructorMarker) null));
            }
            this.f25777b.mo45971a(new C10074a(Long.valueOf(Long.parseLong(d)), Long.parseLong(e)));
            return new C12731g.C12733b(new HomePagerKey(str, bundle, true));
        }
        if ((e != null ? C19456j.m33017U0(e) : null) == null) {
            return new C12731g.C12733b(new PurchasesKey(str, bundle, false, 4, (DefaultConstructorMarker) null));
        }
        if (!fVar.f28048a.mo21331a(C8617e.f18935d).f18927b) {
            return new C12731g.C12733b(new ReceiptKey(str, C19456j.m33017U0(e), (Long) null, false, bundle, 12, (DefaultConstructorMarker) null));
        }
        this.f25777b.mo45971a(new C10074a((Long) null, Long.parseLong(e)));
        return new C12731g.C12733b(new HomePagerKey(str, bundle, true));
    }
}
