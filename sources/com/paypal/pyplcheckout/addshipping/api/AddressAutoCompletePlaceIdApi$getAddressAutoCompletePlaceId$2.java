package com.paypal.pyplcheckout.addshipping.api;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompletePlaceIdRequest;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompletePlaceIdResponse;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$1;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$2;
import com.paypal.pyplcheckout.services.api.BaseApiKt;
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

@C19060c(mo70540c = "com.paypal.pyplcheckout.addshipping.api.AddressAutoCompletePlaceIdApi$getAddressAutoCompletePlaceId$2", mo70541f = "AddressAutoCompletePlaceIdApi.kt", mo70542l = {57}, mo70543m = "invokeSuspend")
public final class AddressAutoCompletePlaceIdApi$getAddressAutoCompletePlaceId$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super AddressAutoCompletePlaceIdResponse>, Object> {
    public final /* synthetic */ AddressAutoCompletePlaceIdRequest $addShippingRequest;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AddressAutoCompletePlaceIdApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressAutoCompletePlaceIdApi$getAddressAutoCompletePlaceId$2(AddressAutoCompletePlaceIdApi addressAutoCompletePlaceIdApi, AddressAutoCompletePlaceIdRequest addressAutoCompletePlaceIdRequest, C19340c<? super AddressAutoCompletePlaceIdApi$getAddressAutoCompletePlaceId$2> cVar) {
        super(2, cVar);
        this.this$0 = addressAutoCompletePlaceIdApi;
        this.$addShippingRequest = addressAutoCompletePlaceIdRequest;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AddressAutoCompletePlaceIdApi$getAddressAutoCompletePlaceId$2(this.this$0, this.$addShippingRequest, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super AddressAutoCompletePlaceIdResponse> cVar) {
        return ((AddressAutoCompletePlaceIdApi$getAddressAutoCompletePlaceId$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            JSONObject jSONObject = new JSONObject();
            AddressAutoCompletePlaceIdRequest addressAutoCompletePlaceIdRequest = this.$addShippingRequest;
            AddressAutoCompletePlaceIdApi addressAutoCompletePlaceIdApi = this.this$0;
            jSONObject.put("query", AddressAutoCompletePlaceIdQuery.INSTANCE.get());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("language", addressAutoCompletePlaceIdRequest.getLanguage());
            jSONObject2.put("placeId", addressAutoCompletePlaceIdRequest.getPlaceId());
            jSONObject2.put("region", addressAutoCompletePlaceIdRequest.getRegion());
            jSONObject2.put("sessionId", addressAutoCompletePlaceIdApi.sessionId);
            C19394m mVar = C19394m.f43287a;
            jSONObject.put("variables", jSONObject2);
            C20011u.C20012a access$getRequestBuilder$p = this.this$0.requestBuilder;
            AddressAutoCompletePlaceIdApi addressAutoCompletePlaceIdApi2 = this.this$0;
            BaseApiKt.setGraphQlUrl(access$getRequestBuilder$p);
            BaseApiKt.addBaseHeadersWithAuthToken(access$getRequestBuilder$p, addressAutoCompletePlaceIdApi2.accessToken);
            String jSONObject3 = jSONObject.toString();
            C19383o.m32796f(jSONObject3, "body.toString()");
            BaseApiKt.addPostBody(access$getRequestBuilder$p, jSONObject3);
            C19944e a = this.this$0.okHttpClient.mo20743a(access$getRequestBuilder$p.mo72999b());
            Class<AddressAutoCompletePlaceIdResponse> cls = AddressAutoCompletePlaceIdResponse.class;
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
