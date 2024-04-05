package com.paypal.pyplcheckout.services.api;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$1;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$2;
import com.paypal.pyplcheckout.pojo.AddressValidationResponse;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import com.paypal.pyplcheckout.services.mutations.AddressValidationMutation;
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

@C19060c(mo70540c = "com.paypal.pyplcheckout.services.api.AddressValidationApi$validateAddress$2", mo70541f = "AddressValidationApi.kt", mo70542l = {71}, mo70543m = "invokeSuspend")
public final class AddressValidationApi$validateAddress$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super AddressValidationResponse>, Object> {
    public final /* synthetic */ PortableShippingAddressRequest $portableShippingAddressRequest;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AddressValidationApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressValidationApi$validateAddress$2(PortableShippingAddressRequest portableShippingAddressRequest, AddressValidationApi addressValidationApi, C19340c<? super AddressValidationApi$validateAddress$2> cVar) {
        super(2, cVar);
        this.$portableShippingAddressRequest = portableShippingAddressRequest;
        this.this$0 = addressValidationApi;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AddressValidationApi$validateAddress$2(this.$portableShippingAddressRequest, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super AddressValidationResponse> cVar) {
        return ((AddressValidationApi$validateAddress$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            String str = AddressValidationMutation.INSTANCE.get();
            JSONObject jSONObject = new JSONObject();
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
            jSONObject.put("countryCode", this.$portableShippingAddressRequest.getCountryCode());
            String postalCode = this.$portableShippingAddressRequest.getPostalCode();
            if (postalCode != null) {
                jSONObject.put("postalCode", postalCode);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("query", str);
            jSONObject2.put("variables", jSONObject);
            C20011u.C20012a access$getRequestBuilder$p = this.this$0.requestBuilder;
            AddressValidationApi addressValidationApi = this.this$0;
            BaseApiKt.setGraphQlUrl(access$getRequestBuilder$p);
            BaseApiKt.addBaseHeadersWithAuthToken(access$getRequestBuilder$p, addressValidationApi.accessToken);
            String jSONObject3 = jSONObject2.toString();
            C19383o.m32796f(jSONObject3, "body.toString()");
            BaseApiKt.addPostBody(access$getRequestBuilder$p, jSONObject3);
            C19944e a = this.this$0.okHttpClient.mo20743a(access$getRequestBuilder$p.mo72999b());
            Class<AddressValidationResponse> cls = AddressValidationResponse.class;
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
