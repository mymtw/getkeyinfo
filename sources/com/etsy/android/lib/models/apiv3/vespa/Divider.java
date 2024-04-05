package com.etsy.android.lib.models.apiv3.vespa;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class Divider extends BaseFieldModel {
    public static final int $stable = 0;

    public int getViewType() {
        return R.id.view_type_divider;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        C19383o.m32797g(jsonParser, "jp");
        C19383o.m32797g(str, "fieldName");
        return true;
    }
}
