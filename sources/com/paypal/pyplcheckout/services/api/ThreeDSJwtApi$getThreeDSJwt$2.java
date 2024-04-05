package com.paypal.pyplcheckout.services.api;

import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.extensions.JSONObjectExtensionsKt;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$1;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$2;
import com.paypal.pyplcheckout.pojo.ThreeDSInitJWT;
import com.paypal.pyplcheckout.services.queries.ThreeDSJwtQuery;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19753l;
import okhttp3.C19944e;
import okhttp3.C20011u;
import okhttp3.internal.connection.C19971e;
import org.json.JSONObject;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.services.api.ThreeDSJwtApi$getThreeDSJwt$2", mo70541f = "ThreeDSJwtApi.kt", mo70542l = {68}, mo70543m = "invokeSuspend")
public final class ThreeDSJwtApi$getThreeDSJwt$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super ThreeDSInitJWT>, Object> {
    public final /* synthetic */ String $cardBin;
    public final /* synthetic */ String $jwtIssuer;
    public final /* synthetic */ String $jwtOrgUnitId;
    public final /* synthetic */ String $paymentAuthenticationRequest;
    public final /* synthetic */ String $redirectUrl;
    public final /* synthetic */ String $referenceId;
    public final /* synthetic */ String $returnUrl;
    public final /* synthetic */ String $transactionId;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ ThreeDSJwtApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeDSJwtApi$getThreeDSJwt$2(ThreeDSJwtApi threeDSJwtApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C19340c<? super ThreeDSJwtApi$getThreeDSJwt$2> cVar) {
        super(2, cVar);
        this.this$0 = threeDSJwtApi;
        this.$referenceId = str;
        this.$jwtIssuer = str2;
        this.$jwtOrgUnitId = str3;
        this.$cardBin = str4;
        this.$returnUrl = str5;
        this.$redirectUrl = str6;
        this.$transactionId = str7;
        this.$paymentAuthenticationRequest = str8;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ThreeDSJwtApi$getThreeDSJwt$2(this.this$0, this.$referenceId, this.$jwtIssuer, this.$jwtOrgUnitId, this.$cardBin, this.$returnUrl, this.$redirectUrl, this.$transactionId, this.$paymentAuthenticationRequest, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super ThreeDSInitJWT> cVar) {
        return ((ThreeDSJwtApi$getThreeDSJwt$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            JSONObject jSONObject = new JSONObject();
            String str = this.$referenceId;
            String str2 = this.$jwtIssuer;
            String str3 = this.$jwtOrgUnitId;
            String str4 = this.$cardBin;
            String str5 = this.$returnUrl;
            String str6 = this.$redirectUrl;
            String str7 = this.$transactionId;
            String str8 = this.$paymentAuthenticationRequest;
            jSONObject.put("query", ThreeDSJwtQuery.INSTANCE.get());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("referenceId", str);
            jSONObject2.put("jwtIssuer", str2);
            jSONObject2.put("jwtOrgUnitId", str3);
            JSONObjectExtensionsKt.putOrOmit(jSONObject2, "cardBin", str4);
            JSONObjectExtensionsKt.putOrOmit(jSONObject2, "returnUrl", str5);
            JSONObjectExtensionsKt.putOrOmit(jSONObject2, "redirectUrl", str6);
            JSONObjectExtensionsKt.putOrOmit(jSONObject2, "transactionId", str7);
            JSONObjectExtensionsKt.putOrOmit(jSONObject2, "paymentAuthenticationRequest", str8);
            C19394m mVar = C19394m.f43287a;
            jSONObject.put("variables", jSONObject2);
            C20011u.C20012a aVar = new C20011u.C20012a();
            ThreeDSJwtApi threeDSJwtApi = this.this$0;
            BaseApiKt.setGraphQlUrl(aVar);
            BaseApiKt.addBaseHeadersWithAuthToken(aVar, threeDSJwtApi.accessToken);
            String jSONObject3 = jSONObject.toString();
            C19383o.m32796f(jSONObject3, "data.toString()");
            BaseApiKt.addPostBody(aVar, jSONObject3);
            C20011u b = aVar.mo72999b();
            PLog.w$default("jwt", "data: " + jSONObject, 0, 4, (Object) null);
            PLog.w$default("jwt", C0326j.m864i("at: ", this.this$0.accessToken), 0, 4, (Object) null);
            C19944e a = NetworkObject.INSTANCE.getOkHttpClient().mo20743a(b);
            Class<ThreeDSInitJWT> cls = ThreeDSInitJWT.class;
            this.L$0 = a;
            this.L$1 = cls;
            this.label = 1;
            C19753l lVar = new C19753l(1, C19388s.m32873m0(this));
            lVar.mo72548n();
            ((C19971e) a).mo72857S(new NetworkExtensionsKt$await$2$1(cls, lVar));
            lVar.mo72497O(new NetworkExtensionsKt$await$2$2(a));
            obj = lVar.mo72547l();
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            Class cls2 = (Class) this.L$1;
            C19944e eVar = (C19944e) this.L$0;
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
