package com.etsy.android.config.flags.p073ui.switchconfigflag;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.config.flags.ui.switchconfigflag.SwitchConfigComposableKt$SwitchConfig$2$1 */
public final class SwitchConfigComposableKt$SwitchConfig$2$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ boolean $flagChecked;
    public final /* synthetic */ C19857l<Boolean, C19394m> $onLongClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchConfigComposableKt$SwitchConfig$2$1(C19857l<? super Boolean, C19394m> lVar, boolean z) {
        super(0);
        this.$onLongClick = lVar;
        this.$flagChecked = z;
    }

    public final void invoke() {
        this.$onLongClick.invoke(Boolean.valueOf(this.$flagChecked));
    }
}
