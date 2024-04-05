package com.etsy.android.p327ui.favorites.createalist;

import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.p327ui.favorites.createalist.C9827p;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.NameAListViewModel$createList$1 */
final class NameAListViewModel$createList$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C9831q this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameAListViewModel$createList$1(C9831q qVar) {
        super(1);
        this.this$0 = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f21730e.onNext(new C9827p.C9828a((String) null));
        LogCatKt.m17045a().error(th);
    }
}
