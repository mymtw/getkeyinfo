package com.paypal.pyplcheckout.home.view.customviews.availablebalance;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

public final class SplitBalanceInfo {
    private final String amount;
    private final String currency;
    private final Integer errorStringId;

    public SplitBalanceInfo(String str, Integer num, String str2) {
        C19383o.m32797g(str, ResponseConstants.AMOUNT);
        this.amount = str;
        this.errorStringId = num;
        this.currency = str2;
    }

    public static /* synthetic */ SplitBalanceInfo copy$default(SplitBalanceInfo splitBalanceInfo, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = splitBalanceInfo.amount;
        }
        if ((i & 2) != 0) {
            num = splitBalanceInfo.errorStringId;
        }
        if ((i & 4) != 0) {
            str2 = splitBalanceInfo.currency;
        }
        return splitBalanceInfo.copy(str, num, str2);
    }

    public final String component1() {
        return this.amount;
    }

    public final Integer component2() {
        return this.errorStringId;
    }

    public final String component3() {
        return this.currency;
    }

    public final SplitBalanceInfo copy(String str, Integer num, String str2) {
        C19383o.m32797g(str, ResponseConstants.AMOUNT);
        return new SplitBalanceInfo(str, num, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitBalanceInfo)) {
            return false;
        }
        SplitBalanceInfo splitBalanceInfo = (SplitBalanceInfo) obj;
        return C19383o.m32792b(this.amount, splitBalanceInfo.amount) && C19383o.m32792b(this.errorStringId, splitBalanceInfo.errorStringId) && C19383o.m32792b(this.currency, splitBalanceInfo.currency);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Integer getErrorStringId() {
        return this.errorStringId;
    }

    public int hashCode() {
        int hashCode = this.amount.hashCode() * 31;
        Integer num = this.errorStringId;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.currency;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.amount;
        Integer num = this.errorStringId;
        String str2 = this.currency;
        StringBuilder sb = new StringBuilder();
        sb.append("SplitBalanceInfo(amount=");
        sb.append(str);
        sb.append(", errorStringId=");
        sb.append(num);
        sb.append(", currency=");
        return C0023f.m110k(sb, str2, ")");
    }
}
