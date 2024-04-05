package com.paypal.pyplcheckout.services.api;

import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.services.queries.GetCancelUrlQuery;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20011u;
import org.json.JSONObject;

public final class CancelUrlApi extends BaseApi {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CancelUrlApi get() {
            return new CancelUrlApi();
        }
    }

    public static final CancelUrlApi get() {
        return Companion.get();
    }

    public C20011u createService() {
        String str = GetCancelUrlQuery.INSTANCE.get(SdkComponent.Companion.getInstance().getRepository().getPaymentToken());
        C20011u.C20012a aVar = new C20011u.C20012a();
        BaseApiKt.setGraphQlUrl(aVar);
        BaseApiKt.addBaseHeadersWithPayToken(aVar);
        String jSONObject = new JSONObject(str).toString();
        C19383o.m32796f(jSONObject, "JSONObject(cancelUrlQuery).toString()");
        BaseApiKt.addPostBody(aVar, jSONObject);
        return aVar.mo72999b();
    }
}
