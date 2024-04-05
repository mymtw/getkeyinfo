package com.etsy.android.lib.models;

import com.etsy.android.lib.util.C8900g;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class BaseModel$Companion$defaultKeyMapper$1 extends C8900g<JsonParser, String> {
    public String exec(JsonParser jsonParser) {
        C19383o.m32797g(jsonParser, "o");
        try {
            String currentName = jsonParser.getCurrentName();
            C19383o.m32796f(currentName, "{\n                      …ame\n                    }");
            return currentName;
        } catch (Exception unused) {
            return "";
        }
    }
}
