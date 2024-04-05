package com.paypal.pyplcheckout.services.api;

import androidx.compose.foundation.layout.C0761x;
import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$1;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$2;
import com.paypal.pyplcheckout.pojo.AmountInput;
import com.paypal.pyplcheckout.pojo.ThreeDSAuthenticateResponse;
import com.paypal.pyplcheckout.pojo.ThreeDSLookupPayload;
import com.paypal.pyplcheckout.services.mutations.ThreeDSAuthenticateMutation;
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

@C19060c(mo70540c = "com.paypal.pyplcheckout.services.api.ThreeDSAuthenticateApi$authenticate$2", mo70541f = "ThreeDSAuthenticateApi.kt", mo70542l = {79}, mo70543m = "invokeSuspend")
public final class ThreeDSAuthenticateApi$authenticate$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super ThreeDSAuthenticateResponse>, Object> {
    public final /* synthetic */ AmountInput $amount;
    public final /* synthetic */ String $paymentAuthenticationRequest;
    public final /* synthetic */ ThreeDSLookupPayload $threeDSLookupPayload;
    public final /* synthetic */ String $threeDsServerTransactionId;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ ThreeDSAuthenticateApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeDSAuthenticateApi$authenticate$2(String str, String str2, ThreeDSLookupPayload threeDSLookupPayload, AmountInput amountInput, ThreeDSAuthenticateApi threeDSAuthenticateApi, C19340c<? super ThreeDSAuthenticateApi$authenticate$2> cVar) {
        super(2, cVar);
        this.$threeDsServerTransactionId = str;
        this.$paymentAuthenticationRequest = str2;
        this.$threeDSLookupPayload = threeDSLookupPayload;
        this.$amount = amountInput;
        this.this$0 = threeDSAuthenticateApi;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ThreeDSAuthenticateApi$authenticate$2(this.$threeDsServerTransactionId, this.$paymentAuthenticationRequest, this.$threeDSLookupPayload, this.$amount, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super ThreeDSAuthenticateResponse> cVar) {
        return ((ThreeDSAuthenticateApi$authenticate$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            JSONObject jSONObject = new JSONObject();
            String str = this.$threeDsServerTransactionId;
            String str2 = this.$paymentAuthenticationRequest;
            ThreeDSLookupPayload threeDSLookupPayload = this.$threeDSLookupPayload;
            AmountInput amountInput = this.$amount;
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("threeDSReferenceId", threeDSLookupPayload.getThreeDSReferenceId());
            jSONObject3.put(UriChallengeConstantKt.FLOW_ID, threeDSLookupPayload.getFlowId());
            jSONObject3.put("encryptedCardNumber", threeDSLookupPayload.getEncryptedCardNumber());
            jSONObject3.put("expirationMonth", threeDSLookupPayload.getExpirationMonth());
            jSONObject3.put("expirationYear", threeDSLookupPayload.getExpirationYear());
            C19394m mVar = C19394m.f43287a;
            jSONObject2.put("authenticatePayload", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(AppsFlyerProperties.CURRENCY_CODE, amountInput.getCurrencyCode());
            jSONObject4.put("currencyValue", amountInput.getCurrencyValue());
            jSONObject2.put(ResponseConstants.AMOUNT, jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("productCode", "EXPRESS_CHECKOUT");
            jSONObject2.put("productDetails", jSONObject5);
            jSONObject2.put("threeDsServerTransactionId", str);
            jSONObject2.put("paymentAuthenticationRequest", str2);
            jSONObject.put("variables", jSONObject2);
            jSONObject.put("query", ThreeDSAuthenticateMutation.INSTANCE.get());
            C20011u.C20012a aVar = new C20011u.C20012a();
            ThreeDSAuthenticateApi threeDSAuthenticateApi = this.this$0;
            BaseApiKt.setGraphQlUrl(aVar);
            BaseApiKt.addBaseHeadersWithAuthToken(aVar, threeDSAuthenticateApi.accessToken);
            String jSONObject6 = jSONObject.toString();
            C19383o.m32796f(jSONObject6, "data.toString()");
            BaseApiKt.addPostBody(aVar, jSONObject6);
            C19944e a = NetworkObject.INSTANCE.getOkHttpClient().mo20743a(aVar.mo72999b());
            Class<ThreeDSAuthenticateResponse> cls = ThreeDSAuthenticateResponse.class;
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
