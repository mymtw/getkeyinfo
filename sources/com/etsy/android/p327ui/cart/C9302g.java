package com.etsy.android.p327ui.cart;

import android.net.Uri;
import com.appboy.Constants;
import com.etsy.android.p327ui.cart.C9315k;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CartWithSavedKey;
import kotlin.jvm.internal.C19383o;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;

/* renamed from: com.etsy.android.ui.cart.g */
public final class C9302g implements C12729e {

    /* renamed from: a */
    public final C9323l f20521a;

    /* renamed from: b */
    public final C9330p f20522b;

    public C9302g(C9323l lVar, C9330p pVar) {
        C19383o.m32797g(lVar, "cartRefreshEventManager");
        C19383o.m32797g(pVar, "routeInspector");
        this.f20521a = lVar;
        this.f20522b = pVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C9330p pVar = this.f20522b;
        Uri uri = fVar.f28049b;
        pVar.getClass();
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        C12741o oVar = pVar.f20601a;
        String str = CartWithSavedKey.SAVED_TAB;
        if (oVar.mo45509b(uri, str)) {
            this.f20521a.f20595a.onNext(C9315k.C9322g.f20594a);
        } else {
            str = null;
        }
        return new C12731g.C12733b(new CartWithSavedKey(fVar.f28050c, str, fVar.f28051d));
    }
}
