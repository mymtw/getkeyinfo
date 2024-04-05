package com.paypal.android.platform.authsdk.otplogin.data;

import androidx.appcompat.widget.C0326j;
import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.authcommon.model.ResultStatus;
import com.paypal.android.platform.authsdk.authcommon.network.utils.AuthBodyBuilder;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.otplogin.data.api.GenerateChallengeAPIRequest;
import com.paypal.android.platform.authsdk.otplogin.data.api.OtpLoginApiService;
import com.paypal.android.platform.authsdk.otplogin.domain.GenerateChallengeData;
import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginRepository;
import com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginResultData;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20016y;
import org.json.JSONObject;

public final class OtpLoginRepositoryImpl implements OtpLoginRepository {
    private OTPLoginData data;
    private final CoroutineDispatcher dispatcher;
    /* access modifiers changed from: private */
    public final OtpLoginApiService otpLoginApiService;

    public OtpLoginRepositoryImpl(OtpLoginApiService otpLoginApiService2, OTPLoginData oTPLoginData, CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(otpLoginApiService2, "otpLoginApiService");
        C19383o.m32797g(oTPLoginData, "data");
        C19383o.m32797g(coroutineDispatcher, "dispatcher");
        this.otpLoginApiService = otpLoginApiService2;
        this.data = oTPLoginData;
        this.dispatcher = coroutineDispatcher;
    }

    /* access modifiers changed from: private */
    public final C20016y createOtpLoginRequestBody(OTPLoginData oTPLoginData, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(ConstantsKt.THIRD_PARTY_CLIENT_ID_KEY, String.valueOf(oTPLoginData.getThirdPartyClientID()));
        hashMap.put(ConstantsKt.OTP, String.valueOf(oTPLoginData.getOtp()));
        hashMap.put("nonce", String.valueOf(oTPLoginData.getNonce()));
        hashMap.put(ConstantsKt.CODE_CHALLENGE, String.valueOf(oTPLoginData.getCodeChallenge()));
        hashMap.put(ConstantsKt.CODE_CHALLENGE_METHOD, ConstantsKt.CHALLENGE_METHOD_ES256);
        hashMap.put(ConstantsKt.CODE_VERIFIER, String.valueOf(oTPLoginData.getCodeVerifier()));
        hashMap.put(ConstantsKt.CODE_NONCE, String.valueOf(oTPLoginData.getCodeNonce()));
        hashMap.put(ConstantsKt.PUBLIC_CREDENTIAL, String.valueOf(oTPLoginData.getPublicCredential()));
        hashMap.put(ConstantsKt.GRANT_TYPE, ConstantsKt.OTP);
        if (map != null) {
            hashMap.put(ConstantsKt.PARTIAL_TOKEN, String.valueOf(map.get(ConstantsKt.PARTIAL_TOKEN)));
            hashMap.put(ConstantsKt.GRANT_TYPE, String.valueOf(map.get(ConstantsKt.GRANT_TYPE)));
            hashMap.put("nonce", String.valueOf(map.get("nonce")));
        }
        return new AuthBodyBuilder(oTPLoginData.getClientConfig()).addRedirectUri().addAdsChallengeId().addExtraParam(hashMap).buildEncodedRequestBody();
    }

    /* access modifiers changed from: private */
    public final GenerateChallengeAPIRequest generateChallengeRequestBody(OTPLoginData oTPLoginData) {
        return new GenerateChallengeAPIRequest(oTPLoginData.getNonce(), oTPLoginData.getChallengeId(), oTPLoginData.getPublicCredential(), C0326j.m864i("auth-", oTPLoginData.getClientConfig().getGuid()), new C16708i().mo59463j(oTPLoginData.getClientConfig().getAppInfo()), new C16708i().mo59463j(oTPLoginData.getClientConfig().getDeviceInfo()), oTPLoginData.getClientConfig().getRiskData());
    }

    /* access modifiers changed from: private */
    public final String getChallengeType(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("challenge")) {
            jSONObject = jSONObject.getJSONObject("challenge");
            C19383o.m32796f(jSONObject, "jsonObject.getJSONObject(CHALLENGE)");
        }
        return jSONObject.get("objectType").toString();
    }

    public Object generateChallenge(OTPLoginData oTPLoginData, C19340c<? super ResultStatus<GenerateChallengeData>> cVar) {
        return C19697g.m33471i(cVar, this.dispatcher, new OtpLoginRepositoryImpl$generateChallenge$2(this, oTPLoginData, (C19340c<? super OtpLoginRepositoryImpl$generateChallenge$2>) null));
    }

    public final OTPLoginData getData() {
        return this.data;
    }

    public Object performOtpLogin(OTPLoginData oTPLoginData, Map<String, String> map, C19340c<? super ResultStatus<OtpLoginResultData>> cVar) {
        return C19697g.m33471i(cVar, this.dispatcher, new OtpLoginRepositoryImpl$performOtpLogin$2(this, oTPLoginData, map, (C19340c<? super OtpLoginRepositoryImpl$performOtpLogin$2>) null));
    }

    public final void setData(OTPLoginData oTPLoginData) {
        C19383o.m32797g(oTPLoginData, "<set-?>");
        this.data = oTPLoginData;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OtpLoginRepositoryImpl(OtpLoginApiService otpLoginApiService2, OTPLoginData oTPLoginData, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(otpLoginApiService2, oTPLoginData, (i & 4) != 0 ? C19760n0.f43720b : coroutineDispatcher);
    }
}
