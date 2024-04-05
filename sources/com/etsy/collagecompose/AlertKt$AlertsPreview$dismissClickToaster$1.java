package com.etsy.collagecompose;

import android.content.Context;
import android.widget.Toast;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class AlertKt$AlertsPreview$dismissClickToaster$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertKt$AlertsPreview$dismissClickToaster$1(Context context) {
        super(0);
        this.$context = context;
    }

    public final void invoke() {
        Toast.makeText(this.$context, "Dismiss clicked", 0).show();
    }
}
