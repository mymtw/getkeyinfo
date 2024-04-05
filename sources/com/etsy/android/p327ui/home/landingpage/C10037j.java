package com.etsy.android.p327ui.home.landingpage;

import android.content.res.Resources;
import android.net.Uri;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SimilarListingsKey;
import com.etsy.android.p327ui.util.C11786n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p472wb.C13810g;

/* renamed from: com.etsy.android.ui.home.landingpage.j */
public final class C10037j implements C12729e {

    /* renamed from: a */
    public final C12741o f22093a;

    /* renamed from: b */
    public final C11786n f22094b;

    public C10037j(C12741o oVar, C11786n nVar) {
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(nVar, "resourceProvider");
        this.f22093a = oVar;
        this.f22094b = nVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        Uri uri = fVar.f28049b;
        String e = this.f22093a.mo45510e(uri, DeepLinkEntity.LISTINGS_SIMILAR.getEntityName());
        boolean z = true;
        if (e == null || e.length() == 0) {
            e = this.f22093a.mo45510e(uri, DeepLinkEntity.LISTING.getEntityName());
        }
        if (!(e == null || e.length() == 0)) {
            z = false;
        }
        if (z || C19456j.m33017U0(e) == null) {
            return new C12731g.C12732a("Invalid Listing ID " + fVar + ".uri");
        }
        return new C12731g.C12733b(new SimilarListingsKey(fVar.f28050c, C13810g.m21365a(new C13810g(), (Resources) null, this.f22094b, e, 9), fVar.f28051d, (String) null, 8, (DefaultConstructorMarker) null));
    }
}
