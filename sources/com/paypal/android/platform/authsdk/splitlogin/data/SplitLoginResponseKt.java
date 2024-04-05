package com.paypal.android.platform.authsdk.splitlogin.data;

import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginData;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;

public final class SplitLoginResponseKt {
    private static final String CHALLENGE = "challenge";
    private static final String OBJECT_TYPE = "objectType";

    public static final String getChallengeType(SplitLoginResponse splitLoginResponse, String str) {
        C19383o.m32797g(splitLoginResponse, "<this>");
        C19383o.m32797g(str, "jsonData");
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("challenge")) {
            jSONObject = jSONObject.getJSONObject("challenge");
            C19383o.m32796f(jSONObject, "jsonObject.getJSONObject(CHALLENGE)");
        }
        return jSONObject.get(OBJECT_TYPE).toString();
    }

    public static final String toJsonData(SplitLoginResponse splitLoginResponse) {
        C19383o.m32797g(splitLoginResponse, "<this>");
        String j = new C16708i().mo59463j(splitLoginResponse.getResult());
        C19383o.m32796f(j, "gson.toJson(this.result)");
        return j;
    }

    public static final SplitLoginData toSplitLoginData(SplitLoginResponse splitLoginResponse) {
        C19383o.m32797g(splitLoginResponse, "<this>");
        C16708i iVar = new C16708i();
        Object e = iVar.mo59458e(SplitLoginData.class, iVar.mo59463j(splitLoginResponse.getResult()));
        C19383o.m32796f(e, "gson.fromJson(gson.toJso…litLoginData::class.java)");
        return (SplitLoginData) e;
    }
}
