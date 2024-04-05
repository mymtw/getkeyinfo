package com.etsy.android.p327ui.favorites.createalist;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.FavoritesAdapter$clickEventDispatcher$1 */
public final class FavoritesAdapter$clickEventDispatcher$1 extends Lambda implements C19857l<C9819k, C19394m> {
    public final /* synthetic */ FavoritesAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesAdapter$clickEventDispatcher$1(FavoritesAdapter favoritesAdapter) {
        super(1);
        this.this$0 = favoritesAdapter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9819k) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9819k kVar) {
        C19383o.m32797g(kVar, "event");
        this.this$0.f21674d.onNext(kVar);
    }
}
