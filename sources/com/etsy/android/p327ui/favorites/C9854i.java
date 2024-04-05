package com.etsy.android.p327ui.favorites;

import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.favorites.i */
public interface C9854i {
    @C20183f("/etsyapps/v3/bespoke/member/favorites-screen")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo32911a(@C20197t("include_saved_searches") String str, @C20197t("include_icons") String str2, @C20197t("include_recs_on_landing") boolean z, @C20197t("owner_id") String str3, @C20197t("include_updates_tab") int i);
}
