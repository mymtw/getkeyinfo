package com.etsy.android.uikit.image.glide;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.C8672b;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ProgressiveJpegEligibility$isEnabled$2 extends Lambda implements C19846a<Boolean> {
    public static final ProgressiveJpegEligibility$isEnabled$2 INSTANCE = new ProgressiveJpegEligibility$isEnabled$2();

    public ProgressiveJpegEligibility$isEnabled$2() {
        super(0);
    }

    public final Boolean invoke() {
        C8672b bVar = ProgressiveJpegEligibility.f26352a;
        if (bVar != null) {
            return Boolean.valueOf(bVar.mo21332b().mo21132b(C8592b.C8601i.f18890d));
        }
        C19383o.m32805o("analyticsTracker");
        throw null;
    }
}
