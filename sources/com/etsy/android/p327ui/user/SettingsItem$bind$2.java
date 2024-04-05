package com.etsy.android.p327ui.user;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.SettingsItem$bind$2 */
final class SettingsItem$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C19857l<C11489b0, C19394m> $listener;
    public final /* synthetic */ C11489b0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsItem$bind$2(C19857l<? super C11489b0, C19394m> lVar, C11489b0 b0Var) {
        super(1);
        this.$listener = lVar;
        this.this$0 = b0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.$listener.invoke(this.this$0);
    }
}
