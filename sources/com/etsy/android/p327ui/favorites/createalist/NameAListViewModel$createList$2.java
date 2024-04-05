package com.etsy.android.p327ui.favorites.createalist;

import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.p327ui.favorites.add.C9749a0;
import com.etsy.android.p327ui.favorites.createalist.C9827p;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.NameAListViewModel$createList$2 */
final class NameAListViewModel$createList$2 extends Lambda implements C19857l<C9749a0, C19394m> {
    public final /* synthetic */ C9831q this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameAListViewModel$createList$2(C9831q qVar) {
        super(1);
        this.this$0 = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9749a0) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9749a0 a0Var) {
        if (a0Var instanceof C9749a0.C9751b) {
            this.this$0.f21730e.onNext(new C9827p.C9829b(new Collection(((C9749a0.C9751b) a0Var).f21579a)));
            return;
        }
        C19383o.m32795e(a0Var, "null cannot be cast to non-null type com.etsy.android.ui.favorites.add.NameAListResult.Failure");
        this.this$0.f21730e.onNext(new C9827p.C9828a(((C9749a0.C9750a) a0Var).f21578a));
    }
}
