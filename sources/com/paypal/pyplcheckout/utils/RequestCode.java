package com.paypal.pyplcheckout.utils;

import org.apache.commons.lang3.time.DateUtils;

public enum RequestCode {
    HOME_ACTIVITY(1000),
    THREE_DS_ACTIVITY(DateUtils.SEMI_MONTH);
    
    private final int code;

    private RequestCode(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
