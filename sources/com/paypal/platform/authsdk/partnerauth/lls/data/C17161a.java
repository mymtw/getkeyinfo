package com.paypal.platform.authsdk.partnerauth.lls.data;

import com.paypal.platform.authsdk.partnerauth.lls.domain.TokenResponse;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.C19340c;
import p771sr.C20181d;
import p771sr.C20182e;
import p771sr.C20187j;
import p771sr.C20188k;
import p771sr.C20192o;
import retrofit2.C20145v;

/* renamed from: com.paypal.platform.authsdk.partnerauth.lls.data.a */
public interface C17161a {
    @C20188k({"Content-Type: application/x-www-form-urlencoded"})
    @C20182e
    @C20192o("/v1/oauth2/token")
    /* renamed from: a */
    Object mo62573a(@C20181d HashMap<String, String> hashMap, @C20187j Map<String, String> map, C19340c<? super C20145v<TokenResponse>> cVar);
}
