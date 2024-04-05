package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FormattedMoney;
import com.etsy.android.lib.models.apiv3.Money;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class TotalsLineItem extends BaseFieldModel {
    public static final int $stable = 8;
    private String description;
    private FormattedMoney formattedMoney;
    private Money money;
    public String title;

    public final String getDescription() {
        return this.description;
    }

    public final FormattedMoney getFormattedMoney() {
        return this.formattedMoney;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("title");
        throw null;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -1724546052:
                if (str.equals("description")) {
                    this.description = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case -761612419:
                if (str.equals(ResponseConstants.FORMATTED_MONEY)) {
                    this.formattedMoney = (FormattedMoney) BaseModel.Companion.parseObject(jsonParser, FormattedMoney.class);
                    return true;
                }
                break;
            case 104079552:
                if (str.equals(ResponseConstants.MONEY)) {
                    this.money = (Money) BaseModel.Companion.parseObject(jsonParser, Money.class);
                    return true;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    setTitle(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setFormattedMoney(FormattedMoney formattedMoney2) {
        this.formattedMoney = formattedMoney2;
    }

    public final void setMoney(Money money2) {
        this.money = money2;
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.title = str;
    }
}
