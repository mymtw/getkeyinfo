package com.etsy.android.p327ui.cart;

import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.ui.cart.v */
public final /* synthetic */ class C9365v implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ MultiShopCartFragment f20680b;

    /* renamed from: c */
    public final /* synthetic */ int f20681c;

    /* renamed from: d */
    public final /* synthetic */ IServerDrivenAction f20682d;

    /* renamed from: e */
    public final /* synthetic */ int f20683e;

    public /* synthetic */ C9365v(MultiShopCartFragment multiShopCartFragment, int i, IServerDrivenAction iServerDrivenAction, int i2) {
        this.f20680b = multiShopCartFragment;
        this.f20681c = i;
        this.f20682d = iServerDrivenAction;
        this.f20683e = i2;
    }

    public final void accept(Object obj) {
        MultiShopCartFragment.m34919performActionWithToast$lambda19(this.f20680b, this.f20681c, this.f20682d, this.f20683e, (C9326n) obj);
    }
}
