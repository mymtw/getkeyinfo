package com.paypal.pyplcheckout.home.view.customviews;

import android.view.View;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import p753kq.C19846a;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.g */
public final /* synthetic */ class C17243g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ PEnums.TransitionName f37759b;

    /* renamed from: c */
    public final /* synthetic */ String f37760c;

    /* renamed from: d */
    public final /* synthetic */ C19846a f37761d;

    public /* synthetic */ C17243g(PEnums.TransitionName transitionName, String str, C19846a aVar) {
        this.f37759b = transitionName;
        this.f37760c = str;
        this.f37761d = aVar;
    }

    public final void onClick(View view) {
        PayPalContinueButton.m35298setupOffer$lambda4(this.f37759b, this.f37760c, this.f37761d, view);
    }
}
