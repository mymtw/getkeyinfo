package com.paypal.pyplcheckout.services.api;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.pojo.NewShippingAddressRequest;
import com.paypal.pyplcheckout.services.mutations.AddShippingAddressMutation;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20011u;
import org.json.JSONObject;

public final class AddShippingAddressApi extends BaseApi {
    private final String accessToken;
    private NewShippingAddressRequest shippingAddressRequest;

    public AddShippingAddressApi(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public C20011u createService() {
        String str = AddShippingAddressMutation.INSTANCE.get(DebugConfigManager.getInstance().isShippingCallbackEnabled());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, DebugConfigManager.getInstance().getCheckoutToken());
        NewShippingAddressRequest newShippingAddressRequest = this.shippingAddressRequest;
        if (newShippingAddressRequest != null) {
            jSONObject.put("givenName", newShippingAddressRequest.getGivenName());
            NewShippingAddressRequest newShippingAddressRequest2 = this.shippingAddressRequest;
            if (newShippingAddressRequest2 != null) {
                jSONObject.put("familyName", newShippingAddressRequest2.getFamilyName());
                NewShippingAddressRequest newShippingAddressRequest3 = this.shippingAddressRequest;
                if (newShippingAddressRequest3 != null) {
                    jSONObject.put("line1", newShippingAddressRequest3.getLine1());
                    NewShippingAddressRequest newShippingAddressRequest4 = this.shippingAddressRequest;
                    if (newShippingAddressRequest4 != null) {
                        jSONObject.put("countryCode", newShippingAddressRequest4.getCountryCode());
                        NewShippingAddressRequest newShippingAddressRequest5 = this.shippingAddressRequest;
                        if (newShippingAddressRequest5 != null) {
                            jSONObject.put("line2", newShippingAddressRequest5.getLine2());
                            NewShippingAddressRequest newShippingAddressRequest6 = this.shippingAddressRequest;
                            if (newShippingAddressRequest6 != null) {
                                jSONObject.put("city", newShippingAddressRequest6.getCity());
                                NewShippingAddressRequest newShippingAddressRequest7 = this.shippingAddressRequest;
                                if (newShippingAddressRequest7 != null) {
                                    jSONObject.put("state", newShippingAddressRequest7.getState());
                                    NewShippingAddressRequest newShippingAddressRequest8 = this.shippingAddressRequest;
                                    if (newShippingAddressRequest8 != null) {
                                        jSONObject.put("postalCode", newShippingAddressRequest8.getPostalCode());
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("query", str);
                                        jSONObject2.put("variables", jSONObject);
                                        C20011u.C20012a aVar = new C20011u.C20012a();
                                        BaseApiKt.setGraphQlUrl(aVar);
                                        BaseApiKt.addBaseHeadersWithAuthToken(aVar, this.accessToken);
                                        String jSONObject3 = jSONObject2.toString();
                                        C19383o.m32796f(jSONObject3, "body.toString()");
                                        BaseApiKt.addPostBody(aVar, jSONObject3);
                                        return aVar.mo72999b();
                                    }
                                    C19383o.m32805o("shippingAddressRequest");
                                    throw null;
                                }
                                C19383o.m32805o("shippingAddressRequest");
                                throw null;
                            }
                            C19383o.m32805o("shippingAddressRequest");
                            throw null;
                        }
                        C19383o.m32805o("shippingAddressRequest");
                        throw null;
                    }
                    C19383o.m32805o("shippingAddressRequest");
                    throw null;
                }
                C19383o.m32805o("shippingAddressRequest");
                throw null;
            }
            C19383o.m32805o("shippingAddressRequest");
            throw null;
        }
        C19383o.m32805o("shippingAddressRequest");
        throw null;
    }

    public final void setShippingAddressRequest(NewShippingAddressRequest newShippingAddressRequest) {
        C19383o.m32797g(newShippingAddressRequest, "shippingAddressRequest");
        this.shippingAddressRequest = newShippingAddressRequest;
    }
}
