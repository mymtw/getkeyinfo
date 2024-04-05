package com.paypal.pyplcheckout.services.api;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$1;
import com.paypal.pyplcheckout.p539ab.NetworkExtensionsKt$await$2$2;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.pojo.AddCardQueryParams;
import com.paypal.pyplcheckout.pojo.AddCardResponse;
import com.paypal.pyplcheckout.pojo.AddCardUser;
import com.paypal.pyplcheckout.pojo.BillingAddress;
import com.paypal.pyplcheckout.pojo.Card;
import com.paypal.pyplcheckout.services.mutations.AddCardMutation;
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

@C19060c(mo70540c = "com.paypal.pyplcheckout.services.api.AddCardApi$addCard$2", mo70541f = "AddCardApi.kt", mo70542l = {92}, mo70543m = "invokeSuspend")
public final class AddCardApi$addCard$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super AddCardResponse>, Object> {
    public final /* synthetic */ AddCardQueryParams $addCardQueryParams;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AddCardApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCardApi$addCard$2(AddCardQueryParams addCardQueryParams, AddCardApi addCardApi, C19340c<? super AddCardApi$addCard$2> cVar) {
        super(2, cVar);
        this.$addCardQueryParams = addCardQueryParams;
        this.this$0 = addCardApi;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AddCardApi$addCard$2(this.$addCardQueryParams, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super AddCardResponse> cVar) {
        return ((AddCardApi$addCard$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Card card = this.$addCardQueryParams.getCard();
            AddCardUser user = this.$addCardQueryParams.getUser();
            BillingAddress address = this.$addCardQueryParams.getAddress();
            JSONObject jSONObject = new JSONObject();
            AddCardApi addCardApi = this.this$0;
            AddCardQueryParams addCardQueryParams = this.$addCardQueryParams;
            jSONObject.put("query", AddCardMutation.INSTANCE.get(addCardApi.debugConfigManager.isShippingCallbackEnabled()));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, SdkComponent.Companion.getInstance().getRepository().getPaymentToken());
            jSONObject2.put("cardType", addCardQueryParams.getCardType());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", card.getType());
            jSONObject3.put("number", card.getNumber());
            String securityCode = card.getSecurityCode();
            String str = "";
            if (securityCode == null) {
                securityCode = str;
            }
            jSONObject3.put("securityCode", securityCode);
            String expiryMonth = card.getExpiryMonth();
            if (expiryMonth == null) {
                expiryMonth = str;
            }
            jSONObject3.put("expiryMonth", expiryMonth);
            String expiryYear = card.getExpiryYear();
            if (expiryYear == null) {
                expiryYear = str;
            }
            jSONObject3.put("expiryYear", expiryYear);
            String startMonth = card.getStartMonth();
            if (startMonth == null) {
                startMonth = str;
            }
            jSONObject3.put("startMonth", startMonth);
            String startYear = card.getStartYear();
            if (startYear == null) {
                startYear = str;
            }
            jSONObject3.put("startYear", startYear);
            String issueNumber = card.getIssueNumber();
            if (issueNumber == null) {
                issueNumber = str;
            }
            jSONObject3.put("issueNumber", issueNumber);
            C19394m mVar = C19394m.f43287a;
            jSONObject2.put(ResponseConstants.CARD, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(PayPalNewShippingAddressReviewViewKt.FIRST_NAME_FIELD, user.getFirstName());
            jSONObject4.put(PayPalNewShippingAddressReviewViewKt.LAST_NAME_FIELD, user.getLastName());
            String dobDay = user.getDobDay();
            if (dobDay == null) {
                dobDay = str;
            }
            jSONObject4.put("dobDay", dobDay);
            String dobMonth = user.getDobMonth();
            if (dobMonth == null) {
                dobMonth = str;
            }
            jSONObject4.put("dobMonth", dobMonth);
            String dobYear = user.getDobYear();
            if (dobYear == null) {
                dobYear = str;
            }
            jSONObject4.put("dobYear", dobYear);
            jSONObject2.put("user", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            String str2 = null;
            String postalCode = address == null ? null : address.getPostalCode();
            if (postalCode == null) {
                postalCode = str;
            }
            jSONObject5.put("postalCode", postalCode);
            if (address != null) {
                str2 = address.getCountry();
            }
            if (str2 == null) {
                str2 = str;
            }
            jSONObject5.put("country", str2);
            jSONObject2.put("address", jSONObject5);
            String paypalRequestId = addCardQueryParams.getPaypalRequestId();
            if (paypalRequestId != null) {
                str = paypalRequestId;
            }
            jSONObject2.put("paypalRequestId", str);
            jSONObject2.put("isPartialBillingAddress", addCardQueryParams.isPartialBillingAddress());
            jSONObject.put("variables", jSONObject2);
            C20011u.C20012a access$getRequestBuilder$p = this.this$0.requestBuilder;
            AddCardApi addCardApi2 = this.this$0;
            BaseApiKt.setGraphQlUrl(access$getRequestBuilder$p);
            BaseApiKt.addBaseHeadersWithAuthToken(access$getRequestBuilder$p, addCardApi2.accessToken);
            String jSONObject6 = jSONObject.toString();
            C19383o.m32796f(jSONObject6, "data.toString()");
            BaseApiKt.addPostBody(access$getRequestBuilder$p, jSONObject6);
            C19944e a = this.this$0.okHttpClient.mo20743a(access$getRequestBuilder$p.mo72999b());
            Class<AddCardResponse> cls = AddCardResponse.class;
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
