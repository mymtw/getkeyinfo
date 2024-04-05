package com.paypal.pyplcheckout.services.api;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$1;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$2;
import com.paypal.pyplcheckout.pojo.AddCardUpdateFundingOptionsResponse;
import com.paypal.pyplcheckout.services.queries.AddCardThreeDSQuery;
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

@C19060c(mo70540c = "com.paypal.pyplcheckout.services.api.AddCardThreeDsApi$updateCheckoutSessionFundingOptions$2", mo70541f = "AddCardThreeDsApi.kt", mo70542l = {47}, mo70543m = "invokeSuspend")
public final class AddCardThreeDsApi$updateCheckoutSessionFundingOptions$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super AddCardUpdateFundingOptionsResponse>, Object> {
    public final /* synthetic */ String $fundingOptionId;
    public final /* synthetic */ boolean $threeDSResolved;
    public final /* synthetic */ String $token;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AddCardThreeDsApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCardThreeDsApi$updateCheckoutSessionFundingOptions$2(String str, String str2, boolean z, AddCardThreeDsApi addCardThreeDsApi, C19340c<? super AddCardThreeDsApi$updateCheckoutSessionFundingOptions$2> cVar) {
        super(2, cVar);
        this.$token = str;
        this.$fundingOptionId = str2;
        this.$threeDSResolved = z;
        this.this$0 = addCardThreeDsApi;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AddCardThreeDsApi$updateCheckoutSessionFundingOptions$2(this.$token, this.$fundingOptionId, this.$threeDSResolved, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super AddCardUpdateFundingOptionsResponse> cVar) {
        return ((AddCardThreeDsApi$updateCheckoutSessionFundingOptions$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            JSONObject jSONObject = new JSONObject();
            String str = this.$token;
            String str2 = this.$fundingOptionId;
            boolean z = this.$threeDSResolved;
            jSONObject.put("query", AddCardThreeDSQuery.INSTANCE.get());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, str);
            jSONObject2.put("fundingOptionId", str2);
            jSONObject2.put("threeDSResolved", z);
            C19394m mVar = C19394m.f43287a;
            jSONObject.put("variables", jSONObject2);
            C20011u.C20012a aVar = new C20011u.C20012a();
            AddCardThreeDsApi addCardThreeDsApi = this.this$0;
            BaseApiKt.setGraphQlUrl(aVar);
            BaseApiKt.addBaseHeadersWithAuthToken(aVar, addCardThreeDsApi.getAccessToken());
            String jSONObject3 = jSONObject.toString();
            C19383o.m32796f(jSONObject3, "data.toString()");
            BaseApiKt.addPostBody(aVar, jSONObject3);
            C19944e a = NetworkObject.INSTANCE.getOkHttpClient().mo20743a(aVar.mo72999b());
            Class<AddCardUpdateFundingOptionsResponse> cls = AddCardUpdateFundingOptionsResponse.class;
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
