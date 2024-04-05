package com.etsy.collagecompose;

import android.content.Context;
import android.widget.Toast;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SwitchKt$SwitchPreview$1$1$3 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ Context $toastContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchPreview$1$1$3(Context context) {
        super(1);
        this.$toastContext = context;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(boolean z) {
        Context context = this.$toastContext;
        Toast.makeText(context, "Receive notifications is now " + z, 0).show();
    }
}
