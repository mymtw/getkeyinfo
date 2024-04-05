package com.etsy.android.qualtrics;

import com.etsy.android.lib.config.EtsyConfigKey;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class QualtricsWrapper$willInitialize$2 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ C8950b $initializationLogic;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QualtricsWrapper$willInitialize$2(C8950b bVar) {
        super(0);
        this.$initializationLogic = bVar;
    }

    public final Boolean invoke() {
        C8950b bVar = this.$initializationLogic;
        boolean z = true;
        for (EtsyConfigKey b : bVar.f19748b) {
            z &= bVar.f19747a.mo21132b(b);
        }
        return Boolean.valueOf(z);
    }
}
