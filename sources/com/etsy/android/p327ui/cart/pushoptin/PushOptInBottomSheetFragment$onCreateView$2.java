package com.etsy.android.p327ui.cart.pushoptin;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.pushoptin.PushOptInBottomSheetFragment$onCreateView$2 */
public final class PushOptInBottomSheetFragment$onCreateView$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ PushOptInBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushOptInBottomSheetFragment$onCreateView$2(PushOptInBottomSheetFragment pushOptInBottomSheetFragment) {
        super(1);
        this.this$0 = pushOptInBottomSheetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.userDismissed = true;
        this.this$0.dismiss();
    }
}
