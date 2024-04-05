package com.paypal.pyplcheckout.home.view.customviews;

import android.app.Activity;
import android.net.Uri;
import com.paypal.pyplcheckout.extensions.ViewExtensionsKt;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class LinkTextView$toOpenUrlAction$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ String $this_toOpenUrlAction;
    public final /* synthetic */ LinkTextView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkTextView$toOpenUrlAction$1(LinkTextView linkTextView, String str) {
        super(0);
        this.this$0 = linkTextView;
        this.$this_toOpenUrlAction = str;
    }

    public final void invoke() {
        Activity activity = ViewExtensionsKt.getActivity(this.this$0);
        if (activity != null) {
            String str = this.$this_toOpenUrlAction;
            PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
            Uri parse = Uri.parse(str);
            C19383o.m32796f(parse, "parse(this)");
            instance.openChromeCustomTabs(parse, activity);
        }
    }
}
