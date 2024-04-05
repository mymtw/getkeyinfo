package com.etsy.android.p327ui.cart.clicklisteners;

import androidx.fragment.app.Fragment;
import com.etsy.android.BOEApplication;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.cart.CartReceipt;
import com.etsy.android.lib.session.C8855a;
import com.etsy.android.p327ui.util.C11780h;
import p040c9.C4579j1;
import p415of.C13171a;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.j */
public final class C9285j extends C13171a<CartReceipt> {

    /* renamed from: d */
    public C8855a f20500d;

    /* renamed from: e */
    public C13461f f20501e = new C13461f();

    /* renamed from: f */
    public C11780h f20502f;

    public C9285j(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
        C4579j1 j1Var = (C4579j1) BOEApplication.getAppComponent();
        this.f20500d = j1Var.f10196Y0.get();
        this.f20502f = j1Var.mo14405n();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo31328c(Object obj) {
        CartReceipt cartReceipt = (CartReceipt) obj;
    }
}
