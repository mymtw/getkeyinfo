package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.cart.viewholders.f0 */
public final class C9377f0 extends C9370c {

    /* renamed from: c */
    public final TextView f20766c;

    public C9377f0(ViewGroup viewGroup) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_msco_totals_note, viewGroup, false));
        View f = mo38986f(R.id.txt_text);
        C19383o.m32795e(f, "null cannot be cast to non-null type android.widget.TextView");
        this.f20766c = (TextView) f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        r1 = (android.text.style.URLSpan) kotlin.collections.C19318k.m32613e1(r1);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31413g(com.etsy.android.lib.models.apiv3.cart.CartGroupItem r4) {
        /*
            r3 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            com.etsy.android.lib.models.BaseModel r4 = r4.getData()
            com.etsy.android.lib.models.apiv3.cart.TotalsNote r4 = (com.etsy.android.lib.models.apiv3.cart.TotalsNote) r4
            if (r4 == 0) goto L_0x006e
            android.widget.TextView r0 = r3.f20766c
            java.lang.String r1 = r4.getText()
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r3.f20766c
            android.text.style.URLSpan[] r1 = r0.getUrls()
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = kotlin.collections.C19318k.m32613e1(r1)
            android.text.style.URLSpan r1 = (android.text.style.URLSpan) r1
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r1.getURL()
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            if (r1 == 0) goto L_0x003b
            com.etsy.android.ui.cart.viewholders.PaymentTotalsNoteViewHolder$linkifyText$1 r2 = new com.etsy.android.ui.cart.viewholders.PaymentTotalsNoteViewHolder$linkifyText$1
            r2.<init>(r3, r1)
            r1 = 1
            com.etsy.android.uikit.util.EtsyLinkify.m19608b(r0, r1, r1, r2)
        L_0x003b:
            java.lang.String r4 = r4.getStyle()
            java.lang.String r0 = "smallTerms"
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r0, r4)
            r0 = 0
            if (r4 == 0) goto L_0x005b
            android.view.View r4 = r3.itemView
            android.content.res.Resources r4 = r4.getResources()
            r1 = 2131165335(0x7f070097, float:1.7944884E38)
            float r4 = r4.getDimension(r1)
            android.widget.TextView r1 = r3.f20766c
            r1.setTextSize(r0, r4)
            goto L_0x0075
        L_0x005b:
            android.view.View r4 = r3.itemView
            android.content.res.Resources r4 = r4.getResources()
            r1 = 2131165400(0x7f0700d8, float:1.7945016E38)
            float r4 = r4.getDimension(r1)
            android.widget.TextView r1 = r3.f20766c
            r1.setTextSize(r0, r4)
            goto L_0x0075
        L_0x006e:
            android.widget.TextView r4 = r3.f20766c
            java.lang.String r0 = ""
            r4.setText(r0)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cart.viewholders.C9377f0.mo31413g(com.etsy.android.lib.models.apiv3.cart.CartGroupItem):void");
    }
}
