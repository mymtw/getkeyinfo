package com.etsy.android.p327ui.home.editorspicks;

import kotlin.coroutines.C19340c;
import okhttp3.C19928a0;
import p771sr.C20183f;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.home.editorspicks.a */
public interface C9924a {
    @C20183f("/etsyapps/v3/bespoke/member/finds-page/{slug}/modules")
    /* renamed from: a */
    Object mo33098a(@C20196s("slug") String str, @C20197t("view_draft_content") Boolean bool, @C20197t("anchor_listing_id") String str2, C19340c<? super C20145v<C19928a0>> cVar);
}
