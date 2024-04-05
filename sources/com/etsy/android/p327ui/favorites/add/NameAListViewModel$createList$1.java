package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.p327ui.favorites.add.C9779q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.NameAListViewModel$createList$1 */
final class NameAListViewModel$createList$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C9753b0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameAListViewModel$createList$1(C9753b0 b0Var) {
        super(1);
        this.this$0 = b0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f21585e.onNext(new C9779q.C9780a((String) null));
        LogCatKt.m17045a().error(th);
    }
}
