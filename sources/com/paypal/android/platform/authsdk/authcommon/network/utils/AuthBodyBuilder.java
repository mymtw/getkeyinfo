package com.paypal.android.platform.authsdk.authcommon.network.utils;

import com.paypal.android.platform.authsdk.authcommon.model.AccountCredentials;
import com.paypal.android.platform.authsdk.authcommon.model.ClientConfig;
import com.paypal.android.platform.authsdk.authcommon.network.GrantType;
import com.paypal.android.platform.authsdk.authcommon.utils.StringUtilsKt;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20002r;
import okhttp3.C20016y;

public final class AuthBodyBuilder {
    private final HashMap<String, String> body;
    private final ClientConfig clientConfig;

    public AuthBodyBuilder(ClientConfig clientConfig2) {
        C19383o.m32797g(clientConfig2, "clientConfig");
        this.clientConfig = clientConfig2;
        HashMap<String, String> hashMap = new HashMap<>();
        this.body = hashMap;
        hashMap.put("appInfo", clientConfig2.getAppInfo().getParameterValue(clientConfig2.getGuid(), clientConfig2.getDeviceAppId()));
        hashMap.put("deviceInfo", clientConfig2.getDeviceInfo().getParameterValue(clientConfig2.getAppId()));
        hashMap.put("riskData", clientConfig2.getRiskData());
    }

    public final AuthBodyBuilder addAdsChallengeId() {
        HashMap<String, String> hashMap = this.body;
        String guid = this.clientConfig.getGuid();
        hashMap.put("adsChallengeId", "auth-" + guid);
        return this;
    }

    public final AuthBodyBuilder addCheckSum(AccountCredentials accountCredentials) {
        C19383o.m32797g(accountCredentials, "accountCredentials");
        ChecksumUtil.INSTANCE.addAuthApiCheckSumParams(GrantType.PASSWORD, accountCredentials, this.body, new ChecksumData(this.clientConfig.getGuid(), this.clientConfig.getAppInfo().getName(), this.clientConfig.getDeviceInfo().getId()));
        return this;
    }

    public final AuthBodyBuilder addExtraParam(HashMap<String, String> hashMap) {
        C19383o.m32797g(hashMap, "param");
        this.body.putAll(hashMap);
        return this;
    }

    public final AuthBodyBuilder addFirstPartyClientId() {
        this.body.put("firstPartyClientId", this.clientConfig.getClientId());
        return this;
    }

    public final AuthBodyBuilder addRedirectUri() {
        this.body.put("redirectUri", this.clientConfig.getRedirectUri());
        return this;
    }

    public final AuthBodyBuilder addTenantName() {
        this.body.put("tenantName", this.clientConfig.getTenant().name());
        return this;
    }

    public final HashMap<String, String> buildBodyMap() {
        return this.body;
    }

    public final C20016y buildEncodedRequestBody() {
        C20016y.C20017a aVar = C20016y.f44360a;
        String encodeParameters = StringUtilsKt.encodeParameters(this.body);
        aVar.getClass();
        return C20016y.C20017a.m34281b(encodeParameters, (C20002r) null);
    }
}
