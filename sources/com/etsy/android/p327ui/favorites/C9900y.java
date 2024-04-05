package com.etsy.android.p327ui.favorites;

import java.util.Map;
import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20181d;
import p771sr.C20182e;
import p771sr.C20193p;
import p771sr.C20196s;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.favorites.y */
public interface C9900y {
    @C20193p("/etsyapps/v3/bespoke/member/collections/{collectionKey}")
    @C20182e
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo33001a(@C20196s("collectionKey") String str, @C20181d Map<String, String> map);
}
