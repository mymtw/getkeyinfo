package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.lib.models.apiv3.CollectionV3;
import com.etsy.android.lib.models.apiv3.CollectionsUpdateResponse;
import java.util.Map;
import okhttp3.C19928a0;
import p248tp.C8061n;
import p248tp.C8071s;
import p771sr.C20178a;
import p771sr.C20181d;
import p771sr.C20182e;
import p771sr.C20183f;
import p771sr.C20192o;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.favorites.add.k */
public interface C9770k {
    @C20192o("/etsyapps/v3/bespoke/member/collections")
    /* renamed from: a */
    C8071s<C20145v<CollectionV3>> mo32775a(@C20178a AddToListBody addToListBody);

    @C20183f("/etsyapps/v3/member/listings/{listingId}/collections")
    /* renamed from: b */
    C8071s<C20145v<C19928a0>> mo32776b(@C20196s("listingId") String str, @C20197t("show_collections_redesign_BOE") boolean z);

    @C20192o("/etsyapps/v3/bespoke/member/collections/listing/{listingId}")
    @C20182e
    /* renamed from: c */
    C8061n<CollectionsUpdateResponse> mo32777c(@C20196s("listingId") String str, @C20181d Map<String, String> map);
}
