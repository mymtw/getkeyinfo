package com.etsy.android.lib.models.apiv3.cart;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Money;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class CartTipper extends BaseFieldModel {
    public static final int $stable = 8;
    public Money currentAmount;
    public String tapDestination;
    public Money threshold;
    public String title;

    public final Money getCurrentAmount() {
        Money money = this.currentAmount;
        if (money != null) {
            return money;
        }
        C19383o.m32805o("currentAmount");
        throw null;
    }

    public final String getTapDestination() {
        String str = this.tapDestination;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("tapDestination");
        throw null;
    }

    public final Money getThreshold() {
        Money money = this.threshold;
        if (money != null) {
            return money;
        }
        C19383o.m32805o(ResponseConstants.THRESHOLD);
        throw null;
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
            case -1959909922:
                if (str.equals(ResponseConstants.CURRENT_AMOUNT)) {
                    Object parseObject = BaseModel.Companion.parseObject(jsonParser, Money.class);
                    C19383o.m32794d(parseObject);
                    setCurrentAmount((Money) parseObject);
                    return true;
                }
                break;
            case -1545477013:
                if (str.equals(ResponseConstants.THRESHOLD)) {
                    Object parseObject2 = BaseModel.Companion.parseObject(jsonParser, Money.class);
                    C19383o.m32794d(parseObject2);
                    setThreshold((Money) parseObject2);
                    return true;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    setTitle(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
                break;
            case 729482610:
                if (str.equals(ResponseConstants.TAP_DESTINATION)) {
                    setTapDestination(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setCurrentAmount(Money money) {
        C19383o.m32797g(money, "<set-?>");
        this.currentAmount = money;
    }

    public final void setTapDestination(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.tapDestination = str;
    }

    public final void setThreshold(Money money) {
        C19383o.m32797g(money, "<set-?>");
        this.threshold = money;
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.title = str;
    }
}
