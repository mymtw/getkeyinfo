package com.braze.enums;

import com.fasterxml.jackson.databind.util.StdDateFormat;

public enum BrazeDateFormat {
    SHORT(StdDateFormat.DATE_FORMAT_STR_PLAIN),
    LONG("yyyy-MM-dd kk:mm:ss"),
    ANDROID_LOGCAT("MM-dd kk:mm:ss.SSS"),
    CLOCK_12_HOUR("h:mm a");
    
    private final String format;

    private BrazeDateFormat(String str) {
        this.format = str;
    }

    public final String getFormat() {
        return this.format;
    }
}
