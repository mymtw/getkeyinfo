package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.vespa.viewholders.C12086e;

/* renamed from: com.etsy.android.ui.cart.viewholders.c */
public abstract class C9370c extends C12086e<CartGroupItem> {
    public C9370c(View view) {
        super(view);
    }

    /* renamed from: h */
    public static void m17739h(View view, int i, boolean z) {
        if (!z) {
            view.setOnTouchListener((View.OnTouchListener) null);
            view.setOnClickListener((View.OnClickListener) null);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (i == 0) {
                    childAt.setAlpha(z ? 1.0f : 0.5f);
                }
                m17739h(childAt, i + 1, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        CartGroupItem cartGroupItem = (CartGroupItem) obj;
        m17739h(this.itemView, 0, cartGroupItem.isEnabled());
        mo31413g(cartGroupItem);
    }

    /* renamed from: g */
    public abstract void mo31413g(CartGroupItem cartGroupItem);
}
