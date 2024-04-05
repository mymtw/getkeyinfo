package com.etsy.android.p327ui.shop;

import com.etsy.android.shophome.C9006n;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.ui.shop.g0 */
public final /* synthetic */ class C11147g0 implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ ShopHomeFragment f24646b;

    /* renamed from: c */
    public final /* synthetic */ boolean f24647c;

    public /* synthetic */ C11147g0(ShopHomeFragment shopHomeFragment, boolean z) {
        this.f24646b = shopHomeFragment;
        this.f24647c = z;
    }

    public final void accept(Object obj) {
        this.f24646b.lambda$toggleVacationNotificationSettings$9(this.f24647c, (C9006n) obj);
    }
}
