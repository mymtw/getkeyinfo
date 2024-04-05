package com.etsy.android.lib.models;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class DismissAction extends BaseFieldModel {
    public static final int $stable = 8;
    private ServerDrivenAction action = new ServerDrivenAction();
    private String analyticsName = "";

    public final ServerDrivenAction getAction() {
        return this.action;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "parser", str, "fieldName", str, "link_action")) {
            Object parseObject = BaseModel.Companion.parseObject(jsonParser, ServerDrivenAction.class);
            C19383o.m32794d(parseObject);
            this.action = (ServerDrivenAction) parseObject;
            return true;
        } else if (!C19383o.m32792b(str, ResponseConstants.ANALYTICS_NAME)) {
            return false;
        } else {
            this.analyticsName = BaseModel.Companion.parseString(jsonParser);
            return true;
        }
    }
}
