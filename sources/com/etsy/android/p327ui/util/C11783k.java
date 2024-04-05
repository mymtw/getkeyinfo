package com.etsy.android.p327ui.util;

import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.Shop;
import com.etsy.android.lib.models.User;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.ui.util.k */
public final class C11783k extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ User f26251b;

    /* renamed from: c */
    public final /* synthetic */ Shop f26252c;

    /* renamed from: d */
    public final /* synthetic */ C11785m f26253d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11783k(C11785m mVar, C8698l[] lVarArr, User user, Shop shop) {
        super(lVarArr);
        this.f26253d = mVar;
        this.f26251b = user;
        this.f26252c = shop;
    }

    public final void onViewClick(View view) {
        if (this.f26251b.getUserId().hasId()) {
            C11785m.m19481a(this.f26253d, this.f26252c.getShopId(), this.f26251b.getUserId());
        } else {
            C11785m.m19481a(this.f26253d, this.f26252c.getShopId(), (EtsyId) null);
        }
    }
}
