package com.etsy.android.uikit.util;

import com.etsy.android.lib.config.C8592b;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class OnClickDebouncerFactory$debounceThresholdMillis$2 extends Lambda implements C19846a<Long> {
    public final /* synthetic */ OnClickDebouncerFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnClickDebouncerFactory$debounceThresholdMillis$2(OnClickDebouncerFactory onClickDebouncerFactory) {
        super(0);
        this.this$0 = onClickDebouncerFactory;
    }

    public final Long invoke() {
        long e = this.this$0.f26452b.mo21135e(C8592b.f18740J0);
        if (e <= 0) {
            e = 1000;
        }
        return Long.valueOf(e);
    }
}
