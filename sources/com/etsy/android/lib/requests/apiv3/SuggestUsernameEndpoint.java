package com.etsy.android.lib.requests.apiv3;

import com.etsy.android.lib.models.SuggestUsernameResult;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20197t;

public interface SuggestUsernameEndpoint {
    @C20183f("/etsyapps/v3/public/suggest-username")
    C8071s<SuggestUsernameResult> getSuggestedUsername(@C20197t("email") String str, @C20197t("first_name") String str2, @C20197t("last_name") String str3);
}
