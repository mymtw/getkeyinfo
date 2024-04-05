package com.etsy.android.p327ui.core;

import android.net.Uri;
import com.appboy.Constants;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;

/* renamed from: com.etsy.android.ui.core.h */
public final class C9620h implements C12729e {

    /* renamed from: a */
    public final C9622j f21320a;

    public C9620h(C9622j jVar) {
        C19383o.m32797g(jVar, "listingUriParser");
        this.f21320a = jVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C9622j jVar = this.f21320a;
        Uri uri = fVar.f28049b;
        jVar.getClass();
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        String e = jVar.f21321a.mo45510e(uri, DeepLinkEntity.LISTING.getEntityName());
        if (!(e == null || e.length() == 0) && C19456j.m33017U0(e) != null) {
            return new C12731g.C12733b(new ListingKey(fVar.f28050c, new EtsyId(e), false, false, fVar.f28051d, 12, (DefaultConstructorMarker) null));
        }
        return new C12731g.C12732a("Invalid Listing ID " + fVar + ".uri");
    }
}
