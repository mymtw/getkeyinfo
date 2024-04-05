package com.etsy.android.p327ui.cart.clicklisteners;

import com.etsy.android.stylekit.views.ProgressButton;
import com.etsy.android.uikit.text.TextWatcherAdapter;
import kotlin.text.C19459m;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.AddShopCouponWorkflow$start$1$textInput$1$1 */
public final class AddShopCouponWorkflow$start$1$textInput$1$1 extends TextWatcherAdapter {
    public final /* synthetic */ ProgressButton $applyButton;

    public AddShopCouponWorkflow$start$1$textInput$1$1(ProgressButton progressButton) {
        this.$applyButton = progressButton;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$applyButton.setEnabled(C18263b.m30839d0(charSequence != null ? C19459m.m33035H1(charSequence) : null));
    }
}
