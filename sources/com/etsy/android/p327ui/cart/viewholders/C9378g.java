package com.etsy.android.p327ui.cart.viewholders;

import android.view.ViewGroup;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.viewholders.g */
public final class C9378g extends C9370c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9378g(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_msco_cart_group_item_divider, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        C19383o.m32797g(cartGroupItem, "item");
    }
}
