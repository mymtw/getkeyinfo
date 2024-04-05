package com.etsy.android.lib.network.oauth2;

import p248tp.C8071s;
import p771sr.C20180c;
import p771sr.C20182e;
import p771sr.C20192o;
import p771sr.C20197t;

/* renamed from: com.etsy.android.lib.network.oauth2.b0 */
public interface C8747b0 {
    @C20192o("/etsyapps/v3/public/oauth/token")
    @C20182e
    /* renamed from: a */
    C8071s<OAuth2AccessTokenPayload> mo30071a(@C20197t("features") String str, @C20180c("grant_type") String str2, @C20180c("client_id") String str3, @C20180c("legacy_token") String str4, @C20180c("redirect_uri") String str5, @C20180c("scope") String str6);
}
