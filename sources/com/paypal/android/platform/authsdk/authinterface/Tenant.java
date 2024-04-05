package com.paypal.android.platform.authsdk.authinterface;

import kotlin.jvm.internal.C19383o;

public enum Tenant {
    Venmo("Venmo"),
    Xoom("Xoom"),
    Paypal("Paypal");
    

    /* renamed from: t */
    private String f37448t;

    private Tenant(String str) {
        this.f37448t = str;
    }

    public final String getT() {
        return this.f37448t;
    }

    public final void setT(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.f37448t = str;
    }
}
