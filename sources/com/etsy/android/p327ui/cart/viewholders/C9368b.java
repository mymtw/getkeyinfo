package com.etsy.android.p327ui.cart.viewholders;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.ApplyCoupon;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p435rb.C13351b;

/* renamed from: com.etsy.android.ui.cart.viewholders.b */
public final class C9368b extends C9370c {

    /* renamed from: c */
    public final C9282g f20753c;

    /* renamed from: d */
    public final C8703p f20754d;

    /* renamed from: e */
    public final Button f20755e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9368b(ViewGroup viewGroup, C9282g gVar, C8703p pVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cart_apply_coupon, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "analyticsTracker");
        this.f20753c = gVar;
        this.f20754d = pVar;
        View findViewById = this.itemView.findViewById(R.id.coupon_button);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.coupon_button)");
        this.f20755e = (Button) findViewById;
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        C19383o.m32797g(cartGroupItem, "item");
        BaseModel data = cartGroupItem.getData();
        C19383o.m32795e(data, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.cart.ApplyCoupon");
        ApplyCoupon applyCoupon = (ApplyCoupon) data;
        Button button = this.f20755e;
        Context context = this.itemView.getContext();
        Object obj = C8184a.f17966a;
        Drawable b = C8184a.C8187c.m16466b(context, R.drawable.clg_icon_core_tag_v1);
        if (b != null) {
            b.setBounds(0, 0, this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller), this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller));
        } else {
            b = null;
        }
        C13351b.m21020d(button, b, (Drawable) null, 14);
        this.f20755e.setText(applyCoupon.getPrompt());
        this.f20755e.setOnClickListener(new C9366a(this, applyCoupon, cartGroupItem));
    }
}
