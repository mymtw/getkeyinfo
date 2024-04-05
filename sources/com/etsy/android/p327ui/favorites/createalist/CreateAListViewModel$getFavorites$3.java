package com.etsy.android.p327ui.favorites.createalist;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListViewModel$getFavorites$3 */
final class CreateAListViewModel$getFavorites$3 extends Lambda implements C19857l<C9810f, C19394m> {
    public final /* synthetic */ C9815g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateAListViewModel$getFavorites$3(C9815g gVar) {
        super(1);
        this.this$0 = gVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9810f) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9810f fVar) {
        this.this$0.f21709g.onNext(fVar);
    }
}
