package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.annotation.JsonValue;

public enum JsonValueFormat {
    COLOR("color"),
    DATE("date"),
    DATE_TIME("date-time"),
    EMAIL("email"),
    HOST_NAME("host-name"),
    IP_ADDRESS("ip-address"),
    IPV6("ipv6"),
    PHONE(ResponseConstants.PHONE),
    REGEX("regex"),
    STYLE("style"),
    TIME("time"),
    URI(Constants.APPBOY_PUSH_DEEP_LINK_KEY),
    UTC_MILLISEC("utc-millisec"),
    UUID("uuid");
    
    private final String _desc;

    private JsonValueFormat(String str) {
        this._desc = str;
    }

    @JsonValue
    public String toString() {
        return this._desc;
    }
}
