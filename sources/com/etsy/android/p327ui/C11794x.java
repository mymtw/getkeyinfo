package com.etsy.android.p327ui;

import com.etsy.android.p327ui.EtsyWebFragment;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.x */
public final /* synthetic */ class C11794x implements C19846a {

    /* renamed from: b */
    public final /* synthetic */ EtsyWebFragment.CartOverrideWebViewClient f26266b;

    public /* synthetic */ C11794x(EtsyWebFragment.CartOverrideWebViewClient cartOverrideWebViewClient) {
        this.f26266b = cartOverrideWebViewClient;
    }

    public final Object invoke() {
        EtsyWebFragment.CartOverrideWebViewClient cartOverrideWebViewClient = this.f26266b;
        EtsyWebFragment.this.setActivityResultCheckoutCanceled();
        EtsyWebFragment.this.goBack();
        return null;
    }
}
