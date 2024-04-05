package com.paypal.android.platform.authsdk.splitlogin.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class SplitLoginResponse {
    @C18417a("result")
    private final Object result;

    public SplitLoginResponse() {
        this((Object) null, 1, (DefaultConstructorMarker) null);
    }

    public SplitLoginResponse(Object obj) {
        this.result = obj;
    }

    public final Object getResult() {
        return this.result;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SplitLoginResponse(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }
}
