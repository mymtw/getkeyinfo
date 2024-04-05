package com.braze.configuration;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeConfig$Builder$e extends Lambda implements C19846a<String> {

    /* renamed from: b */
    public final /* synthetic */ int f11533b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeConfig$Builder$e(int i) {
        super(0);
        this.f11533b = i;
    }

    /* renamed from: a */
    public final String invoke() {
        return C19383o.m32802l(Integer.valueOf(this.f11533b), "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs called with negative value. Not setting timeout to: ");
    }
}
