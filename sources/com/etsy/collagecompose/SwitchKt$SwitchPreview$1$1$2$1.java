package com.etsy.collagecompose;

import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SwitchKt$SwitchPreview$1$1$2$1 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ C1338j0<Boolean> $state2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchPreview$1$1$2$1(C1338j0<Boolean> j0Var) {
        super(1);
        this.$state2 = j0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(boolean z) {
        this.$state2.setValue(Boolean.valueOf(z));
    }
}
