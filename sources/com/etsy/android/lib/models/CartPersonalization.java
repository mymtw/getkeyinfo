package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CartPersonalization extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;
    private EtsyId personalizationId = new EtsyId((String) null, 1, (DefaultConstructorMarker) null);
    private String personalizationTitle;
    private String personalizationValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final EtsyId getPersonalizationId() {
        return this.personalizationId;
    }

    public final String getPersonalizationTitle() {
        return this.personalizationTitle;
    }

    public final String getPersonalizationValue() {
        return this.personalizationValue;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        int c = C0072d.m197c(jsonParser, "jp", str, "fieldName");
        if (c != 110371416) {
            if (c != 111972721) {
                if (c != 1357596613 || !str.equals("property_id")) {
                    return false;
                }
                this.personalizationId.setIdKt(BaseModel.Companion.parseStringIdOrNumericValue(jsonParser));
                return true;
            } else if (!str.equals("value")) {
                return false;
            } else {
                this.personalizationValue = BaseModel.Companion.parseString(jsonParser);
                return true;
            }
        } else if (!str.equals("title")) {
            return false;
        } else {
            this.personalizationTitle = BaseModel.Companion.parseString(jsonParser);
            return true;
        }
    }

    public final void setPersonalizationId(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "<set-?>");
        this.personalizationId = etsyId;
    }

    public final void setPersonalizationTitle(String str) {
        this.personalizationTitle = str;
    }

    public final void setPersonalizationValue(String str) {
        this.personalizationValue = str;
    }
}
