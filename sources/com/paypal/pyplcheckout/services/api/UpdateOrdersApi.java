package com.paypal.pyplcheckout.services.api;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.BaseServerDrivenActionResult;
import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.checkout.order.PurchaseUnit;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20011u;
import org.json.JSONArray;
import org.json.JSONObject;

public final class UpdateOrdersApi extends BaseApi {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String accessToken;
    private final String checkoutToken;
    private final List<PurchaseUnit> purchaseUnit;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UpdateOrdersApi get(String str, String str2, List<PurchaseUnit> list) {
            C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
            C19383o.m32797g(str2, "checkoutToken");
            C19383o.m32797g(list, "purchaseUnit");
            return new UpdateOrdersApi(str, str2, list);
        }
    }

    public UpdateOrdersApi(String str, String str2, List<PurchaseUnit> list) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        C19383o.m32797g(str2, "checkoutToken");
        C19383o.m32797g(list, "purchaseUnit");
        this.accessToken = str;
        this.checkoutToken = str2;
        this.purchaseUnit = list;
    }

    public static final UpdateOrdersApi get(String str, String str2, List<PurchaseUnit> list) {
        return Companion.get(str, str2, list);
    }

    private final String getRequestBody(List<PurchaseUnit> list) {
        JSONArray jSONArray = new JSONArray();
        for (PurchaseUnit purchaseUnit2 : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("op", BaseServerDrivenActionResult.TYPE_REPLACE);
            String referenceId = purchaseUnit2.getReferenceId();
            jSONObject.put(ResponseConstants.PATH, "/purchase_units/@reference_id=='" + referenceId + "'");
            jSONObject.put("value", new JSONObject(new C16708i().mo59463j(purchaseUnit2)));
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        C19383o.m32796f(jSONArray2, "body.toString()");
        return jSONArray2;
    }

    public C20011u createService() {
        C20011u.C20012a aVar = new C20011u.C20012a();
        BaseApiKt.setUpdateOrdersUrl(aVar, this.checkoutToken);
        BaseApiKt.addMerchantRestHeaders(aVar, this.accessToken);
        BaseApiKt.patch(aVar, getRequestBody(this.purchaseUnit));
        return aVar.mo72999b();
    }
}
