package com.paypal.pyplcheckout.services.queries;

import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import org.json.JSONException;
import org.json.JSONObject;

public final class CartParamConverterQuery {
    public static final CartParamConverterQuery INSTANCE = new CartParamConverterQuery();
    public static final String cart = "{\"transactions\":[{\"amount\":{\"total\":\"0.01\",\"currency\":\"USD\"}}],\"intent\":\"sale\",\"redirect_urls\":{\"return_url\":\"https://www.paypal.com/checkoutnow/error\",\"cancel_url\":\"https://www.paypal.com/checkoutnow/error\"},\"payer\":{\"payment_method\":\"paypal\"}}";

    private CartParamConverterQuery() {
    }

    public static final JSONObject get() {
        try {
            return new JSONObject(cart);
        } catch (JSONException e) {
            JSONException jSONException = e;
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E112, "CART PARAM CONVERTER: ERROR IN CONVERTING CART PARAMETERS", jSONException.getMessage(), jSONException, PEnums.TransitionName.CART_PARAM_CONVERTER, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1984, (Object) null);
            return new JSONObject();
        }
    }
}
