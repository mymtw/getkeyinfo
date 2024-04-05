package com.paypal.pyplcheckout.common.instrumentation.amplitude.logger;

import org.json.JSONObject;

public interface AmplitudeLogger {
    void clearSession();

    void initialize(String str);

    void logEvent(String str, JSONObject jSONObject);
}
