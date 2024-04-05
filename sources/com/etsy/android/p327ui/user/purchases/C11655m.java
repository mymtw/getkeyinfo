package com.etsy.android.p327ui.user.purchases;

import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ReceiptKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.purchases.m */
public final class C11655m implements C12729e {

    /* renamed from: a */
    public final C12741o f25781a;

    public C11655m(C12741o oVar) {
        C19383o.m32797g(oVar, "routeInspector");
        this.f25781a = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        String e = this.f25781a.mo45510e(fVar.f28049b, DeepLinkEntity.PURCHASES.getEntityName());
        if (C18263b.m30839d0(e)) {
            return new C12731g.C12733b(new ReceiptKey(fVar.f28050c, C19456j.m33017U0(e), (Long) null, true, fVar.f28051d, 4, (DefaultConstructorMarker) null));
        }
        return new C12731g.C12732a("Invalid receipt id " + fVar + ".uri");
    }
}
