package com.etsy.android.p327ui.cart.viewholders;

import android.view.ViewGroup;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupDivider;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.viewholders.f */
public final class C9376f extends C12086e<CartGroupDivider> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9376f(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_msco_group_divider, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C19383o.m32797g((CartGroupDivider) obj, "divider");
    }
}
