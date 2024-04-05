package com.paypal.pyplcheckout.services;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$1;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$2;
import com.paypal.pyplcheckout.pojo.AddShippingAddressResponse;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import com.paypal.pyplcheckout.services.api.BaseApiKt;
import com.paypal.pyplcheckout.services.mutations.AddShippingAddressMutation;
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

@C19060c(mo70540c = "com.paypal.pyplcheckout.services.AddShippingApi$addShipping$2", mo70541f = "AddShippingApi.kt", mo70542l = {92}, mo70543m = "invokeSuspend")
public final class AddShippingApi$addShipping$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super AddShippingAddressResponse>, Object> {
    public final /* synthetic */ PortableShippingAddressRequest $portableShippingAddressRequest;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AddShippingApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddShippingApi$addShipping$2(AddShippingApi addShippingApi, PortableShippingAddressRequest portableShippingAddressRequest, C19340c<? super AddShippingApi$addShipping$2> cVar) {
        super(2, cVar);
        this.this$0 = addShippingApi;
        this.$portableShippingAddressRequest = portableShippingAddressRequest;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AddShippingApi$addShipping$2(this.this$0, this.$portableShippingAddressRequest, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super AddShippingAddressResponse> cVar) {
        return ((AddShippingApi$addShipping$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            String str = AddShippingAddressMutation.INSTANCE.get(this.this$0.debugConfigManager.isShippingCallbackEnabled());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, this.this$0.debugConfigManager.getCheckoutToken());
            jSONObject.put("givenName", this.$portableShippingAddressRequest.getGivenName());
            jSONObject.put("familyName", this.$portableShippingAddressRequest.getFamilyName());
            jSONObject.put("countryCode", this.$portableShippingAddressRequest.getCountryCode());
            Boolean normalize = this.$portableShippingAddressRequest.getNormalize();
            if (normalize != null) {
                jSONObject.put("normalize", normalize.booleanValue());
            }
            String addressLine1 = this.$portableShippingAddressRequest.getAddressLine1();
            if (addressLine1 != null) {
                jSONObject.put("addressLine1", addressLine1);
            }
            String addressLine2 = this.$portableShippingAddressRequest.getAddressLine2();
            if (addressLine2 != null) {
                jSONObject.put("addressLine2", addressLine2);
            }
            String addressLine3 = this.$portableShippingAddressRequest.getAddressLine3();
            if (addressLine3 != null) {
                jSONObject.put("addressLine3", addressLine3);
            }
            jSONObject.put("adminArea4", this.$portableShippingAddressRequest.getAdminArea4());
            String adminArea3 = this.$portableShippingAddressRequest.getAdminArea3();
            if (adminArea3 != null) {
                jSONObject.put("adminArea3", adminArea3);
            }
            String adminArea2 = this.$portableShippingAddressRequest.getAdminArea2();
            if (adminArea2 != null) {
                jSONObject.put("adminArea2", adminArea2);
            }
            String adminArea1 = this.$portableShippingAddressRequest.getAdminArea1();
            if (adminArea1 != null) {
                jSONObject.put("adminArea1", adminArea1);
            }
            String postalCode = this.$portableShippingAddressRequest.getPostalCode();
            if (postalCode != null) {
                jSONObject.put("postalCode", postalCode);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("query", str);
            jSONObject2.put("variables", jSONObject);
            C20011u.C20012a access$getRequestBuilder$p = this.this$0.requestBuilder;
            AddShippingApi addShippingApi = this.this$0;
            BaseApiKt.setGraphQlUrl(access$getRequestBuilder$p);
            BaseApiKt.addBaseHeadersWithAuthToken(access$getRequestBuilder$p, addShippingApi.accessToken);
            String jSONObject3 = jSONObject2.toString();
            C19383o.m32796f(jSONObject3, "body.toString()");
            BaseApiKt.addPostBody(access$getRequestBuilder$p, jSONObject3);
            C19944e a = this.this$0.okHttpClient.mo20743a(access$getRequestBuilder$p.mo72999b());
            Class<AddShippingAddressResponse> cls = AddShippingAddressResponse.class;
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
