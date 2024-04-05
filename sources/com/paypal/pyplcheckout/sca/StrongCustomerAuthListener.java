package com.paypal.pyplcheckout.sca;

import java.util.Map;

public interface StrongCustomerAuthListener {
    void onFailure(Exception exc, String str, boolean z);

    void onSuccess(String str, Map<String, ? extends Object> map);
}
