package com.etsy.collagecompose;

import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class DialogKt$DialogsPreview$1$1$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C1338j0<Boolean> $openDialog;
    public final /* synthetic */ C1338j0<Boolean> $showConfirmButton;
    public final /* synthetic */ C1338j0<Boolean> $showDismissButton;
    public final /* synthetic */ C1338j0<Boolean> $useLongText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogKt$DialogsPreview$1$1$1$1(C1338j0<Boolean> j0Var, C1338j0<Boolean> j0Var2, C1338j0<Boolean> j0Var3, C1338j0<Boolean> j0Var4) {
        super(0);
        this.$openDialog = j0Var;
        this.$showConfirmButton = j0Var2;
        this.$showDismissButton = j0Var3;
        this.$useLongText = j0Var4;
    }

    public final void invoke() {
        C1338j0<Boolean> j0Var = this.$openDialog;
        Boolean bool = Boolean.TRUE;
        j0Var.setValue(bool);
        this.$showConfirmButton.setValue(bool);
        C1338j0<Boolean> j0Var2 = this.$showDismissButton;
        Boolean bool2 = Boolean.FALSE;
        j0Var2.setValue(bool2);
        this.$useLongText.setValue(bool2);
    }
}
