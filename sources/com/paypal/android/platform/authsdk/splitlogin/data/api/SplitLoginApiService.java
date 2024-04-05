package com.paypal.android.platform.authsdk.splitlogin.data.api;

import com.paypal.android.platform.authsdk.splitlogin.data.SplitLoginResponse;
import java.util.Map;
import kotlin.coroutines.C19340c;
import p771sr.C20178a;
import p771sr.C20187j;
import p771sr.C20188k;
import p771sr.C20192o;
import retrofit2.C20145v;

public interface SplitLoginApiService {
    @C20188k({"Content-Type: application/json"})
    @C20192o("/v1/mfsauth/user/verify-credential")
    Object verifyCredential(@C20187j Map<String, String> map, @C20178a SplitLoginApiRequest splitLoginApiRequest, C19340c<? super C20145v<SplitLoginResponse>> cVar);
}
