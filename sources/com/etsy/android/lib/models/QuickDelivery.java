package com.etsy.android.lib.models;

import android.support.p013v4.media.C0073e;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class QuickDelivery extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ESTIMATED_DELIVERY_DATE = "estimated_delivery_date";
    public static final String QUICK_DELIVERY_TITLE = "quick_delivery_title";
    public String estimatedDeliveryDate;
    public String quickDeliveryTitle;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getEstimatedDeliveryDate() {
        String str = this.estimatedDeliveryDate;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("estimatedDeliveryDate");
        throw null;
    }

    public final String getQuickDeliveryTitle() {
        String str = this.quickDeliveryTitle;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("quickDeliveryTitle");
        throw null;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, QUICK_DELIVERY_TITLE)) {
            setQuickDeliveryTitle(BaseModel.Companion.parseString(jsonParser));
            return true;
        } else if (!C19383o.m32792b(str, ESTIMATED_DELIVERY_DATE)) {
            return false;
        } else {
            setEstimatedDeliveryDate(BaseModel.Companion.parseString(jsonParser));
            return true;
        }
    }

    public final void setEstimatedDeliveryDate(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.estimatedDeliveryDate = str;
    }

    public final void setQuickDeliveryTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.quickDeliveryTitle = str;
    }
}
