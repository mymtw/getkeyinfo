package com.paypal.pyplcheckout.utils;

import android.app.Activity;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;

/* renamed from: com.paypal.pyplcheckout.utils.d */
public final /* synthetic */ class C17284d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ PYPLCheckoutUtils f37812b;

    /* renamed from: c */
    public final /* synthetic */ Activity f37813c;

    /* renamed from: d */
    public final /* synthetic */ PEnums.EventCode f37814d;

    /* renamed from: e */
    public final /* synthetic */ String f37815e;

    public /* synthetic */ C17284d(PYPLCheckoutUtils pYPLCheckoutUtils, Activity activity, PEnums.EventCode eventCode, String str) {
        this.f37812b = pYPLCheckoutUtils;
        this.f37813c = activity;
        this.f37814d = eventCode;
        this.f37815e = str;
    }

    public final void run() {
        PYPLCheckoutUtils.m35472showErrorDialogOnUiThread$lambda20(this.f37812b, this.f37813c, this.f37814d, this.f37815e);
    }
}
