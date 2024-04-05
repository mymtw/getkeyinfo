package com.etsy.android.p327ui.cardview.clickhandlers;

import android.text.TextUtils;
import com.etsy.android.lib.models.apiv3.cart.CartPage;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.p327ui.cart.C9315k;
import com.etsy.android.push.CartRefreshDelegate;
import p145io.reactivex.functions.Consumer;
import p367ib.C12921a;
import p367ib.C12924b;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.t */
public final /* synthetic */ class C9139t implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ SavedCartClickHandler f20074b;

    /* renamed from: c */
    public final /* synthetic */ C12924b f20075c;

    /* renamed from: d */
    public final /* synthetic */ int f20076d;

    /* renamed from: e */
    public final /* synthetic */ String f20077e;

    public /* synthetic */ C9139t(SavedCartClickHandler savedCartClickHandler, C12924b bVar, int i, String str) {
        this.f20074b = savedCartClickHandler;
        this.f20075c = bVar;
        this.f20076d = i;
        this.f20077e = str;
    }

    public final void accept(Object obj) {
        SavedCartClickHandler savedCartClickHandler = this.f20074b;
        C12924b bVar = this.f20075c;
        int i = this.f20076d;
        String str = this.f20077e;
        C12921a aVar = (C12921a) obj;
        savedCartClickHandler.getClass();
        if (aVar instanceof C12921a.C12923b) {
            CartPage cartPage = ((C12921a.C12923b) aVar).f28488a;
            bVar.mo45691a().getViewState().setIsLoading(false);
            if (!TextUtils.isEmpty(str)) {
                C8901g0.m17338d(savedCartClickHandler.mo45889a().requireActivity(), str);
            }
            savedCartClickHandler.f20035d.mo31298b(i);
            savedCartClickHandler.f20039h = false;
            if (bVar instanceof C12924b.C12925a) {
                savedCartClickHandler.f20036e.f20595a.onNext(C9315k.C9319d.f20591a);
            }
            if (cartPage != null) {
                CartRefreshDelegate.sendBroadcast(savedCartClickHandler.mo45889a().requireActivity(), cartPage.getCartCount(), cartPage.getSavedCount(), true, 2);
            }
        } else if (aVar instanceof C12921a.C12922a) {
            savedCartClickHandler.mo31334f(bVar, i);
        }
    }
}
