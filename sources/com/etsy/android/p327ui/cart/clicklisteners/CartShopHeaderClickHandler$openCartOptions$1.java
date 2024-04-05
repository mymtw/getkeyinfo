package com.etsy.android.p327ui.cart.clicklisteners;

import com.etsy.android.vespa.VespaBottomSheetDialog;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.CartShopHeaderClickHandler$openCartOptions$1 */
public final class CartShopHeaderClickHandler$openCartOptions$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ VespaBottomSheetDialog $bottomSheetDialog;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CartShopHeaderClickHandler$openCartOptions$1(VespaBottomSheetDialog vespaBottomSheetDialog) {
        super(0);
        this.$bottomSheetDialog = vespaBottomSheetDialog;
    }

    public final void invoke() {
        this.$bottomSheetDialog.dismiss();
    }
}
