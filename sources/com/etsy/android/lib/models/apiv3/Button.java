package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class Button extends BaseFieldModel {
    public static final int $stable = 8;
    private ServerDrivenAction action;
    private String analyticsName;
    private String link;
    private String styleName;
    private String text;

    public final ServerDrivenAction getAction() {
        return this.action;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getLink() {
        return this.link;
    }

    public final int getStyle() {
        String str = this.styleName;
        if (str == null) {
            return R.style.clg_button_primary;
        }
        switch (str.hashCode()) {
            case -1174796206:
                return !str.equals("tertiary") ? R.style.clg_button_primary : R.style.clg_button_tertiary;
            case -868734114:
                return !str.equals("primary-alt") ? R.style.clg_button_primary : R.style.clg_button_secondary;
            case -314765822:
                boolean equals = str.equals("primary");
                return R.style.clg_button_primary;
            case -153528400:
                return !str.equals("clg_button_secondary_small") ? R.style.clg_button_primary : R.style.clg_button_secondary_small;
            default:
                return R.style.clg_button_primary;
        }
    }

    public final String getStyleName() {
        return this.styleName;
    }

    public final String getText() {
        return this.text;
    }

    public int getViewType() {
        return R.id.view_type_button;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -1624417974:
                if (str.equals(ResponseConstants.LINK_PATH)) {
                    this.link = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case -1422950858:
                if (str.equals(ResponseConstants.ACTION)) {
                    Object parseObject = BaseModel.Companion.parseObject(jsonParser, ServerDrivenAction.class);
                    C19383o.m32794d(parseObject);
                    this.action = (ServerDrivenAction) parseObject;
                    return true;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    this.text = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 1273617316:
                if (str.equals(ResponseConstants.ANALYTICS_NAME)) {
                    this.analyticsName = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case 1292368484:
                if (str.equals(ResponseConstants.BUTTON_STYLE)) {
                    this.styleName = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setAction(ServerDrivenAction serverDrivenAction) {
        this.action = serverDrivenAction;
    }

    public final void setAnalyticsName(String str) {
        this.analyticsName = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setStyleName(String str) {
        this.styleName = str;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
