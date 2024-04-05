package com.paypal.pyplcheckout.common.instrumentation;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class AmplitudeApi$apiKey$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ AmplitudeApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmplitudeApi$apiKey$2(AmplitudeApi amplitudeApi) {
        super(0);
        this.this$0 = amplitudeApi;
    }

    public final String invoke() {
        return this.this$0.amplitudeUtils.returnKeyByEnv();
    }
}
