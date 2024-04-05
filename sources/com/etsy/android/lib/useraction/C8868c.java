package com.etsy.android.lib.useraction;

import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.addresses.UserAddress;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9647a;
import com.etsy.android.p327ui.navigation.bottom.C10680b;
import com.etsy.android.p327ui.user.addresses.C11463z;
import com.etsy.android.p327ui.you.C11800a;
import kotlin.jvm.internal.C19383o;
import p287xp.C8339g;
import p321cc.C8569c;

/* renamed from: com.etsy.android.lib.useraction.c */
public final /* synthetic */ class C8868c implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f19598b;

    public /* synthetic */ C8868c(int i) {
        this.f19598b = i;
    }

    public final Object apply(Object obj) {
        switch (this.f19598b) {
            case 0:
                C19383o.m32797g((Throwable) obj, "it");
                return UserActionBus.f19585f;
            case 1:
                C8569c.C8576c cVar = (C8569c.C8576c) obj;
                C19383o.m32797g(cVar, "result");
                if (cVar instanceof C8569c.C8576c.C8578b) {
                    return new C9647a.C9648a(((C8569c.C8576c.C8578b) cVar).f18665a);
                }
                Throwable th = ((C8569c.C8576c.C8577a) cVar).f18664a;
                throw new IllegalStateException(th != null ? th.getMessage() : null);
            case 2:
                Integer num = (Integer) obj;
                C19383o.m32797g(num, "it");
                return new C10680b(R.id.menu_bottom_nav_cart, num.intValue() <= 0 ? C11800a.C11804d.f26281a : new C11800a.C11801a(num.intValue()), "menu_bottom_nav_cart");
            default:
                UserAddress userAddress = (UserAddress) obj;
                C19383o.m32797g(userAddress, "it");
                return new C11463z.C11470g(userAddress);
        }
    }
}
