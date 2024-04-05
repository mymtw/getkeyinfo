package com.etsy.collagecompose;

import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

public final class SwitchKt$TextSwitch$2$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C1338j0<Boolean> $clickableChecked;
    public final /* synthetic */ C19857l<Boolean, C19394m> $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$TextSwitch$2$1(C1338j0<Boolean> j0Var, C19857l<? super Boolean, C19394m> lVar) {
        super(0);
        this.$clickableChecked = j0Var;
        this.$onClick = lVar;
    }

    public final void invoke() {
        C1338j0<Boolean> j0Var = this.$clickableChecked;
        j0Var.setValue(Boolean.valueOf(!j0Var.getValue().booleanValue()));
        C19857l<Boolean, C19394m> lVar = this.$onClick;
        if (lVar != null) {
            lVar.invoke(this.$clickableChecked.getValue());
        }
    }
}
