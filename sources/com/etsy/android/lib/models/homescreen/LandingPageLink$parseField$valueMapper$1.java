package com.etsy.android.lib.models.homescreen;

import com.etsy.android.lib.util.C8900g;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class LandingPageLink$parseField$valueMapper$1 extends C8900g<JsonParser, String> {
    public String exec(JsonParser jsonParser) {
        C19383o.m32797g(jsonParser, "o");
        try {
            String valueAsString = jsonParser.getValueAsString();
            C19383o.m32796f(valueAsString, "{\n                      …                        }");
            return valueAsString;
        } catch (Exception unused) {
            return "";
        }
    }
}
