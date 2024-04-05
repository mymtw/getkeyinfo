package com.paypal.pyplcheckout.utils;

import android.app.Activity;
import android.widget.Toast;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class PYPLCheckoutUtils$showDebugErrorDialog$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ Activity $_activity;
    public final /* synthetic */ PEnums.EventCode $errorCode;
    public final /* synthetic */ String $errorMessage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PYPLCheckoutUtils$showDebugErrorDialog$1(Activity activity, String str, PEnums.EventCode eventCode) {
        super(0);
        this.$_activity = activity;
        this.$errorMessage = str;
        this.$errorCode = eventCode;
    }

    public final void invoke() {
        Activity activity = this.$_activity;
        String str = this.$errorMessage;
        PEnums.EventCode eventCode = this.$errorCode;
        Toast.makeText(activity, str + " [" + eventCode + "]", 1).show();
    }
}
