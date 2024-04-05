package com.etsy.android.p327ui.favorites.createalist;

import androidx.compose.animation.C0472h;
import com.etsy.android.p327ui.favorites.createalist.C9810f;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListViewModel$getFavorites$2 */
final class CreateAListViewModel$getFavorites$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C9815g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateAListViewModel$getFavorites$2(C9815g gVar) {
        super(1);
        this.this$0 = gVar;
    }

    public final void invoke(Throwable th) {
        C0472h.m1248k(th, "it", th);
        this.this$0.f21709g.onNext(C9810f.C9812b.f21701a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }
}
