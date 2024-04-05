package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.apiv3.FormattedMoney;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RightAlignedVariation extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String SELECTION_OPTION_MONEY = "selected_option_money";
    public static final String SELECTION_OPTION_NAME = "selected_option_name";
    private FormattedMoney formattedMoney;
    public String selectedOptionName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final FormattedMoney getFormattedMoney() {
        return this.formattedMoney;
    }

    public final String getSelectedOptionName() {
        String str = this.selectedOptionName;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("selectedOptionName");
        throw null;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, SELECTION_OPTION_NAME)) {
            setSelectedOptionName(BaseModel.Companion.parseString(jsonParser));
            return true;
        } else if (!C19383o.m32792b(str, SELECTION_OPTION_MONEY)) {
            return false;
        } else {
            this.formattedMoney = (FormattedMoney) BaseModel.Companion.parseObject(jsonParser, FormattedMoney.class);
            return true;
        }
    }

    public final void setFormattedMoney(FormattedMoney formattedMoney2) {
        this.formattedMoney = formattedMoney2;
    }

    public final void setSelectedOptionName(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.selectedOptionName = str;
    }
}
