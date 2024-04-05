package com.paypal.pyplcheckout.addcard;

import java.util.Map;

public interface UpgradeAccessTokenListener {
    void onFailure(Exception exc, String str);

    void onSuccess(String str, Map<String, ? extends Object> map);
}
