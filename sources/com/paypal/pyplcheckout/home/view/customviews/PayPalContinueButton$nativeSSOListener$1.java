package com.paypal.pyplcheckout.home.view.customviews;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.paypal.pyplcheckout.auth.NativeSSOListener;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.jvm.internal.C19383o;

public final class PayPalContinueButton$nativeSSOListener$1 implements NativeSSOListener {
    public final /* synthetic */ Context $context;
    private String redirectUri;

    public PayPalContinueButton$nativeSSOListener$1(Context context) {
        this.$context = context;
    }

    public void ssoRedirectFetchFailed() {
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
