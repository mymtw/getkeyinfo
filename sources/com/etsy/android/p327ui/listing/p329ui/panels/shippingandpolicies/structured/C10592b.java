package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured;

import android.view.View;
import com.etsy.android.R;
import com.etsy.android.uikit.view.ImageAttachmentLayout;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.b */
public final /* synthetic */ class C10592b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f23251b;

    /* renamed from: c */
    public final /* synthetic */ Object f23252c;

    /* renamed from: d */
    public final /* synthetic */ Object f23253d;

    public /* synthetic */ C10592b(int i, Object obj, Object obj2) {
        this.f23251b = i;
        this.f23252c = obj;
        this.f23253d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f23251b) {
            case 0:
                ShippingAndPoliciesPanelViewHolder shippingAndPoliciesPanelViewHolder = (ShippingAndPoliciesPanelViewHolder) this.f23252c;
                C10590a aVar = (C10590a) this.f23253d;
                C19383o.m32797g(shippingAndPoliciesPanelViewHolder, "this$0");
                C19383o.m32797g(aVar, "$uiModel");
                C13573c cVar = shippingAndPoliciesPanelViewHolder.f23197b;
                String string = shippingAndPoliciesPanelViewHolder.itemView.getContext().getString(R.string.seller_details_title);
                C19383o.m32796f(string, "itemView.context.getStri…ing.seller_details_title)");
                cVar.mo38043a(new C13597g.C13693n3(string, aVar.f23224F));
                return;
            default:
                ((ImageAttachmentLayout) this.f23252c).lambda$createuiModel$0((ImageAttachmentLayout.C11918b) this.f23253d, view);
                return;
        }
    }
}
