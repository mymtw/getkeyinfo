package com.etsy.android.lib.logger.referrers;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class Referrer$Companion$schema$2 extends Lambda implements C19846a<String> {
    public static final Referrer$Companion$schema$2 INSTANCE = new Referrer$Companion$schema$2();

    public Referrer$Companion$schema$2() {
        super(0);
    }

    public final String invoke() {
        return C0326j.m869n(BuildTarget.Companion) ? "etsybeta" : "etsy";
    }
}
