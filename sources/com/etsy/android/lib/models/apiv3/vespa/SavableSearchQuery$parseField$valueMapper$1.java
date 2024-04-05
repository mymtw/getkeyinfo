package com.etsy.android.lib.models.apiv3.vespa;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.util.C8900g;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class SavableSearchQuery$parseField$valueMapper$1 extends C8900g<JsonParser, String> {
    public String exec(JsonParser jsonParser) {
        C19383o.m32797g(jsonParser, "jp");
        try {
            return BaseModel.Companion.parseString(jsonParser);
        } catch (Exception unused) {
            return "";
        }
    }
}
