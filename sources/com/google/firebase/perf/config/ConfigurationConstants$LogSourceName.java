package com.google.firebase.perf.config;

import com.google.protobuf.C16910l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ConfigurationConstants$LogSourceName extends C16910l {

    /* renamed from: e */
    public static ConfigurationConstants$LogSourceName f36825e;

    /* renamed from: f */
    public static final Map<Long, String> f36826f = Collections.unmodifiableMap(new HashMap<Long, String>() {
        {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    });

    /* renamed from: e */
    public final String mo59236e() {
        return "com.google.firebase.perf.LogSourceName";
    }

    /* renamed from: h */
    public final String mo59237h() {
        return "fpr_log_source";
    }
}
