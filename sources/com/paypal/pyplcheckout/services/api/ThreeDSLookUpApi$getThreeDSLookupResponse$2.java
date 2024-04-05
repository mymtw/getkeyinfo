package com.paypal.pyplcheckout.services.api;

import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.extensions.JSONObjectExtensionsKt;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$1;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$2;
import com.paypal.pyplcheckout.pojo.AmountInput;
import com.paypal.pyplcheckout.pojo.BillingAddressLookupRequest;
import com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponse;
import com.paypal.pyplcheckout.pojo.ThreeDSLookupPayload;
import com.paypal.pyplcheckout.services.mutations.ThreeDSLookUpMutation;
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

@C19060c(mo70540c = "com.paypal.pyplcheckout.services.api.ThreeDSLookUpApi$getThreeDSLookupResponse$2", mo70541f = "ThreeDSLookUpApi.kt", mo70542l = {99}, mo70543m = "invokeSuspend")
public final class ThreeDSLookUpApi$getThreeDSLookupResponse$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super ThreeDSLookUpResponse>, Object> {
    public final /* synthetic */ AmountInput $amount;
    public final /* synthetic */ String $browserInfo;
    public final /* synthetic */ String $ecToken;
    public final /* synthetic */ ThreeDSLookupPayload $threeDSLookupPayload;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ ThreeDSLookUpApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeDSLookUpApi$getThreeDSLookupResponse$2(ThreeDSLookUpApi threeDSLookUpApi, String str, String str2, ThreeDSLookupPayload threeDSLookupPayload, AmountInput amountInput, C19340c<? super ThreeDSLookUpApi$getThreeDSLookupResponse$2> cVar) {
        super(2, cVar);
        this.this$0 = threeDSLookUpApi;
        this.$browserInfo = str;
        this.$ecToken = str2;
        this.$threeDSLookupPayload = threeDSLookupPayload;
        this.$amount = amountInput;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ThreeDSLookUpApi$getThreeDSLookupResponse$2(this.this$0, this.$browserInfo, this.$ecToken, this.$threeDSLookupPayload, this.$amount, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super ThreeDSLookUpResponse> cVar) {
        return ((ThreeDSLookUpApi$getThreeDSLookupResponse$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            JSONObject jSONObject = new JSONObject();
            String str = this.$browserInfo;
            String str2 = this.$ecToken;
            ThreeDSLookupPayload threeDSLookupPayload = this.$threeDSLookupPayload;
            AmountInput amountInput = this.$amount;
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("threeDSReferenceId", threeDSLookupPayload.getThreeDSReferenceId());
            jSONObject3.put(UriChallengeConstantKt.FLOW_ID, threeDSLookupPayload.getFlowId());
            jSONObject3.put("encryptedCardNumber", threeDSLookupPayload.getEncryptedCardNumber());
            jSONObject3.put("expirationMonth", threeDSLookupPayload.getExpirationMonth());
            jSONObject3.put("expirationYear", threeDSLookupPayload.getExpirationYear());
            jSONObject3.put("threeDSContingencyReason", threeDSLookupPayload.getThreeDSContingencyReason());
            jSONObject3.put("threeDSContingencySource", threeDSLookupPayload.getThreeDSContingencySourceType());
            jSONObject3.put("cardUsage", threeDSLookupPayload.getCardUsage());
            JSONObject jSONObject4 = new JSONObject();
            BillingAddressLookupRequest billingAddress = threeDSLookupPayload.getBillingAddress();
            String givenName = billingAddress == null ? null : billingAddress.getGivenName();
            String str3 = "";
            if (givenName == null) {
                givenName = str3;
            }
            jSONObject4.put("givenName", givenName);
            BillingAddressLookupRequest billingAddress2 = threeDSLookupPayload.getBillingAddress();
            String familyName = billingAddress2 == null ? null : billingAddress2.getFamilyName();
            if (familyName == null) {
                familyName = str3;
            }
            jSONObject4.put("familyName", familyName);
            BillingAddressLookupRequest billingAddress3 = threeDSLookupPayload.getBillingAddress();
            String line1 = billingAddress3 == null ? null : billingAddress3.getLine1();
            if (line1 == null) {
                line1 = str3;
            }
            jSONObject4.put("line1", line1);
            BillingAddressLookupRequest billingAddress4 = threeDSLookupPayload.getBillingAddress();
            String line2 = billingAddress4 == null ? null : billingAddress4.getLine2();
            if (line2 == null) {
                line2 = str3;
            }
            jSONObject4.put("line2", line2);
            BillingAddressLookupRequest billingAddress5 = threeDSLookupPayload.getBillingAddress();
            String city = billingAddress5 == null ? null : billingAddress5.getCity();
            if (city == null) {
                city = str3;
            }
            jSONObject4.put("city", city);
            BillingAddressLookupRequest billingAddress6 = threeDSLookupPayload.getBillingAddress();
            String state = billingAddress6 == null ? null : billingAddress6.getState();
            if (state == null) {
                state = str3;
            }
            jSONObject4.put("state", state);
            BillingAddressLookupRequest billingAddress7 = threeDSLookupPayload.getBillingAddress();
            String postalCode = billingAddress7 == null ? null : billingAddress7.getPostalCode();
            if (postalCode == null) {
                postalCode = str3;
            }
            jSONObject4.put("postalCode", postalCode);
            BillingAddressLookupRequest billingAddress8 = threeDSLookupPayload.getBillingAddress();
            String country = billingAddress8 == null ? null : billingAddress8.getCountry();
            if (country != null) {
                str3 = country;
            }
            jSONObject4.put("country", str3);
            C19394m mVar = C19394m.f43287a;
            jSONObject3.put("billingAddress", jSONObject4);
            jSONObject2.put("threedsLookUpPayload", jSONObject3);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(AppsFlyerProperties.CURRENCY_CODE, amountInput.getCurrencyCode());
            jSONObject5.put("currencyValue", amountInput.getCurrencyValue());
            jSONObject2.put(ResponseConstants.AMOUNT, jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("productCode", "EXPRESS_CHECKOUT");
            jSONObject2.put("productDetails", jSONObject6);
            JSONObjectExtensionsKt.putOrOmit(jSONObject2, "browserInfo", str);
            jSONObject2.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, str2);
            jSONObject2.put("nativeSDK", true);
            jSONObject.put("variables", jSONObject2);
            jSONObject.put("query", ThreeDSLookUpMutation.INSTANCE.get());
            C20011u.C20012a aVar = new C20011u.C20012a();
            ThreeDSLookUpApi threeDSLookUpApi = this.this$0;
            BaseApiKt.setGraphQlUrl(aVar);
            BaseApiKt.addBaseHeadersWithAuthToken(aVar, threeDSLookUpApi.accessToken);
            String jSONObject7 = jSONObject.toString();
            C19383o.m32796f(jSONObject7, "data.toString()");
            BaseApiKt.addPostBody(aVar, jSONObject7);
            C20011u b = aVar.mo72999b();
            PLog.w$default("lookup", "data: " + jSONObject, 0, 4, (Object) null);
            PLog.w$default("lookup", C0326j.m864i("at: ", this.this$0.accessToken), 0, 4, (Object) null);
            C19944e a = NetworkObject.INSTANCE.getOkHttpClient().mo20743a(b);
            Class<ThreeDSLookUpResponse> cls = ThreeDSLookUpResponse.class;
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
