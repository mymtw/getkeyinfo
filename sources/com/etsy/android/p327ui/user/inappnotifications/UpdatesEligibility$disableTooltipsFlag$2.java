package com.etsy.android.p327ui.user.inappnotifications;

import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.UpdatesEligibility$disableTooltipsFlag$2 */
public final class UpdatesEligibility$disableTooltipsFlag$2 extends Lambda implements C19846a<Boolean> {
    public static final UpdatesEligibility$disableTooltipsFlag$2 INSTANCE = new UpdatesEligibility$disableTooltipsFlag$2();

    public UpdatesEligibility$disableTooltipsFlag$2() {
        super(0);
    }

    public final Boolean invoke() {
        C8591a aVar = C18263b.f40056T;
        if (aVar != null) {
            return Boolean.valueOf(aVar.f18706f.mo21132b(C8592b.f18804k0));
        }
        C19383o.m32805o("etsyConfig");
        throw null;
    }
}
