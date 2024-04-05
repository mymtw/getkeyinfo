package com.etsy.android.exceptions;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.util.CrashUtil;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p346fa.C12703a;
import p628nj.C18263b;
import p753kq.C19846a;

public final class ThreeArmSweaterException$Companion$logSampled$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeArmSweaterException$Companion$logSampled$1(Context context) {
        super(0);
        this.$context = context;
    }

    public final void invoke() {
        CrashUtil.m17307a().mo30457b(new ThreeArmSweaterException(this.$context));
        C12703a aVar = C18263b.f40051O;
        if (aVar != null) {
            StringBuilder h = C0072d.m201h("errors.3as.");
            BuildTarget.Companion.getClass();
            h.append(BuildTarget.audience.name());
            h.append(".visible");
            aVar.mo45474a(h.toString());
            return;
        }
        C19383o.m32805o("grafana");
        throw null;
    }
}
