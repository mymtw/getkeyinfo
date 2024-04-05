package com.etsy.android.lib.models;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.DynamicAnalyticsProperty;
import com.fasterxml.jackson.core.JsonParser;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

public final class AnalyticsProperties extends BaseFieldModel {
    public static final int $stable = 8;
    private final Map<AnalyticsProperty, Object> analyticsProperties = new LinkedHashMap();

    public final Map<AnalyticsProperty, Object> getAnalyticsProperties() {
        return this.analyticsProperties;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        C19383o.m32797g(jsonParser, "jp");
        C19383o.m32797g(str, "fieldName");
        this.analyticsProperties.put(new DynamicAnalyticsProperty(str), BaseModel.Companion.parseString(jsonParser));
        return true;
    }
}
