package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DeepLink extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private String eventName;
    private String title;
    private String url;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DeepLink fake() {
            return new DeepLink();
        }
    }

    public static final DeepLink fake() {
        return Companion.fake();
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        int c = C0072d.m197c(jsonParser, "jp", str, "fieldName");
        if (c != 116079) {
            if (c != 984174864) {
                if (c == 1186582995 && str.equals(ResponseConstants.LINK_TITLE)) {
                    this.title = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
            } else if (str.equals(ResponseConstants.EVENT_NAME)) {
                this.eventName = BaseModel.Companion.parseString(jsonParser);
                return true;
            }
        } else if (str.equals("url")) {
            this.url = BaseModel.Companion.parseString(jsonParser);
            return true;
        }
        return false;
    }

    public final void setEventName(String str) {
        this.eventName = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
