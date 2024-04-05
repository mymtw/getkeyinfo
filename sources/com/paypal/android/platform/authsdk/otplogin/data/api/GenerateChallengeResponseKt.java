package com.paypal.android.platform.authsdk.otplogin.data.api;

import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.otplogin.domain.GenerateChallengeData;
import kotlin.jvm.internal.C19383o;

public final class GenerateChallengeResponseKt {
    public static final GenerateChallengeData toGenerateChallengeData(GenerateChallengeResponse generateChallengeResponse) {
        C19383o.m32797g(generateChallengeResponse, "<this>");
        C16708i iVar = new C16708i();
        Object e = iVar.mo59458e(GenerateChallengeData.class, iVar.mo59463j(generateChallengeResponse.getResult()));
        C19383o.m32796f(e, "gson.fromJson(gson.toJso…hallengeData::class.java)");
        return (GenerateChallengeData) e;
    }

    public static final String toJsonData(GenerateChallengeResponse generateChallengeResponse) {
        C19383o.m32797g(generateChallengeResponse, "<this>");
        String j = new C16708i().mo59463j(generateChallengeResponse.getResult());
        C19383o.m32796f(j, "gson.toJson(this.result)");
        return j;
    }
}
