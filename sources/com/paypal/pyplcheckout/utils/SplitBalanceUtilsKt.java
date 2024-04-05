package com.paypal.pyplcheckout.utils;

import android.text.TextUtils;
import com.paypal.pyplcheckout.pojo.Plan;

public final class SplitBalanceUtilsKt {
    /* access modifiers changed from: private */
    public static final Plan orNull(Plan plan) {
        if (plan == null) {
            return null;
        }
        if (TextUtils.isEmpty(plan.getId())) {
            plan = null;
        }
        return plan;
    }
}
