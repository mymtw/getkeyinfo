package com.etsy.android.p327ui.shop.viewholder;

import android.view.View;
import com.etsy.android.lib.models.StarSellerBadge;
import kotlin.jvm.internal.C19383o;
import p438re.C13357c;
import p438re.C13361d;

/* renamed from: com.etsy.android.ui.shop.viewholder.l */
public final /* synthetic */ class C11286l implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C11288m f24914b;

    /* renamed from: c */
    public final /* synthetic */ StarSellerBadge f24915c;

    public /* synthetic */ C11286l(C11288m mVar, StarSellerBadge starSellerBadge) {
        this.f24914b = mVar;
        this.f24915c = starSellerBadge;
    }

    public final void onClick(View view) {
        C11288m mVar = this.f24914b;
        StarSellerBadge starSellerBadge = this.f24915c;
        C19383o.m32797g(mVar, "this$0");
        C13361d dVar = mVar.f24916c;
        String modalTitle = starSellerBadge.getModalTitle();
        String modalBody = starSellerBadge.getModalBody();
        dVar.mo31328c(new C13357c.C13360c(modalTitle, modalBody, starSellerBadge.getEventName() + "_badge_clicked"));
    }
}
