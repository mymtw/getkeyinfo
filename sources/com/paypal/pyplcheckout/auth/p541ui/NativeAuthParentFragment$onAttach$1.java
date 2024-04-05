package com.paypal.pyplcheckout.auth.p541ui;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.paypal.pyplcheckout.auth.ui.NativeAuthParentFragment$onAttach$1 */
public final class NativeAuthParentFragment$onAttach$1 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ NativeAuthParentFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeAuthParentFragment$onAttach$1(NativeAuthParentFragment nativeAuthParentFragment) {
        super(1);
        this.this$0 = nativeAuthParentFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(boolean z) {
        this.this$0.toggleLoadingView(z);
    }
}
