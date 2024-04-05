package com.etsy.android.p327ui.user.inappnotifications;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.IANViewModel$favoriteShop$1 */
final class IANViewModel$favoriteShop$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public static final IANViewModel$favoriteShop$1 INSTANCE = new IANViewModel$favoriteShop$1();

    public IANViewModel$favoriteShop$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "e");
        C8694h a = LogCatKt.m17045a();
        a.mo21306a("err " + th);
    }
}
