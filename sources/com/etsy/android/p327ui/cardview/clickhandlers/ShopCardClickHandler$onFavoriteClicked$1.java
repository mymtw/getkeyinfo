package com.etsy.android.p327ui.cardview.clickhandlers;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.ShopCardClickHandler$onFavoriteClicked$1 */
public final class ShopCardClickHandler$onFavoriteClicked$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public static final ShopCardClickHandler$onFavoriteClicked$1 INSTANCE = new ShopCardClickHandler$onFavoriteClicked$1();

    public ShopCardClickHandler$onFavoriteClicked$1() {
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
