package com.paypal.android.platform.authsdk.otplogin.data.api;

import java.util.Map;
import kotlin.coroutines.C19340c;
import okhttp3.C20016y;
import p771sr.C20178a;
import p771sr.C20187j;
import p771sr.C20188k;
import p771sr.C20192o;
import retrofit2.C20145v;

public interface OtpLoginApiService {
    @C20188k({"Content-Type: application/json"})
    @C20192o("/v1/mfsauth/user/generate-challenge")
    Object generateChallenge(@C20187j Map<String, String> map, @C20178a GenerateChallengeAPIRequest generateChallengeAPIRequest, C19340c<? super C20145v<GenerateChallengeResponse>> cVar);

    @C20188k({"Accept:application/json", "Content-Type:application/x-www-form-urlencoded"})
    @C20192o("v1/mfsauth/proxy-auth/token")
    Object performOtpLogin(@C20187j Map<String, String> map, @C20178a C20016y yVar, C19340c<? super C20145v<OtpLoginAPIResponse>> cVar);
}
