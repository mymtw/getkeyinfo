package com.etsy.android.p327ui.cart.clicklisteners;

import android.view.View;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19459m;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.AddShopCouponWorkflow$start$1$2 */
final class AddShopCouponWorkflow$start$1$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CollageTextInput $textInput;
    public final /* synthetic */ C9274e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddShopCouponWorkflow$start$1$2(C9274e eVar, CollageTextInput collageTextInput) {
        super(1);
        this.this$0 = eVar;
        this.$textInput = collageTextInput;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.mo31608c(C19459m.m33035H1(this.$textInput.getText()).toString());
    }
}
