package com.paypal.pyplcheckout.utils;

import java.util.Map;

public interface NativeUsageTrackerListener {
    void onTrack(String str, Map<String, ? extends Object> map);
}
