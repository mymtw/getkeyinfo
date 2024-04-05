package com.paypal.pyplcheckout.p539ab.elmo;

import com.paypal.pyplcheckout.services.api.BaseApiKt;
import com.paypal.pyplcheckout.utils.VersionUtils;
import java.io.IOException;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import okhttp3.C20009t;
import okhttp3.C20011u;
import org.json.JSONObject;

/* renamed from: com.paypal.pyplcheckout.ab.elmo.ElmoApi */
public final class ElmoApi {
    private final C20009t okHttpClient;

    public ElmoApi(C20009t tVar) {
        C19383o.m32797g(tVar, "okHttpClient");
        this.okHttpClient = tVar;
    }

    private final JSONObject getRequestBody(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app", "xobuyernodeserv");
        jSONObject.put("res", str2);
        jSONObject.put("uid", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("query", ElmoAbQuery.INSTANCE.get(str3, VersionUtils.INSTANCE.getSdkVersion()));
        jSONObject2.put("variables", jSONObject);
        return jSONObject2;
    }

    public final Object getExperiments(String str, String str2, String str3, C19340c<? super ElmoResponse> cVar) throws IOException {
        C20011u.C20012a aVar = new C20011u.C20012a();
        BaseApiKt.setGraphQlUrl(aVar);
        BaseApiKt.addBaseHeaders(aVar);
        String jSONObject = getRequestBody(str, str2, str3).toString();
        C19383o.m32796f(jSONObject, "getRequestBody(uid, resource, country).toString()");
        BaseApiKt.addPostBody(aVar, jSONObject);
        return C19697g.m33471i(cVar, C19760n0.f43720b, new ElmoApi$getExperiments$$inlined$executeSuspending$1(this.okHttpClient.mo20743a(aVar.mo72999b()), ElmoResponse.class, (C19340c) null));
    }
}
