package com.paypal.pyplcheckout.home.view.customviews;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.paypal.pyplcheckout.auth.NativeSSOListener;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.jvm.internal.C19383o;

public final class PayPalSnappingRecyclerView$nativeSSOListener$1 implements NativeSSOListener {
    public final /* synthetic */ Context $context;
    private String redirectUri;

    public PayPalSnappingRecyclerView$nativeSSOListener$1(Context context) {
        this.$context = context;
    }

    public void ssoRedirectFetchFailed() {
        PLog.error$default(PEnums.ErrorType.WARNING, PEnums.EventCode.E304, "WebSSO Auth failed in add cart", (String) null, (Throwable) null, PEnums.TransitionName.ADD_CARD_DIALOG, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
        Uri parse = Uri.parse(this.redirectUri);
        C19383o.m32796f(parse, "parse(redirectUri)");
        instance.openChromeCustomTabs(parse, (Activity) this.$context);
    }

    public void ssoRedirectFetchSuccess(String str) {
        C19383o.m32797g(str, "redirectUrl");
        this.redirectUri = str;
        PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
        Uri parse = Uri.parse(str);
        C19383o.m32796f(parse, "parse(redirectUrl)");
        instance.openChromeCustomTabs(parse, (Activity) this.$context);
    }
}
