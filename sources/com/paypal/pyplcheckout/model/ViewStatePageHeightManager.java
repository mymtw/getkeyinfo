package com.paypal.pyplcheckout.model;

import com.paypal.pyplcheckout.common.instrumentation.PLog;

public class ViewStatePageHeightManager {
    private static final String TAG = "ViewStatePageHeightManager";
    private boolean isBalanceVisible;
    private boolean isPayNow;
    private boolean isShippingHidden;
    private boolean showConversion;

    public ViewStatePageHeightManager(boolean z, boolean z2, boolean z3, boolean z4) {
        this.isPayNow = z;
        this.isBalanceVisible = z2;
        this.isShippingHidden = z3;
        this.showConversion = z4;
    }

    public int getMinPageHeight() {
        int i;
        if (this.isPayNow) {
            i = 1104;
            PLog.m28726d(TAG, "adding 50 for pay now");
        } else {
            i = 970;
        }
        if (!this.isShippingHidden) {
            i += 80;
        }
        String str = TAG;
        PLog.m28726d(str, "adding 120 for shipping");
        if (this.isBalanceVisible) {
            i += 70;
            PLog.m28726d(str, "adding 70 for balance");
        }
        if (this.showConversion) {
            i += 110;
            PLog.m28726d(str, "adding 110 for conversion");
        }
        if (!this.isPayNow && this.isShippingHidden && !this.isBalanceVisible && !this.showConversion) {
            i -= 110;
        }
        PLog.m28726d(str, "Total calculated page height for this FI is " + i);
        return i;
    }
}
