package com.etsy.android.p327ui.favorites.createalist;

import com.etsy.android.lib.logger.LogCatKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.NameAListPresenter$createList$1 */
final class NameAListPresenter$createList$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ NameAListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameAListPresenter$createList$1(NameAListPresenter nameAListPresenter) {
        super(1);
        this.this$0 = nameAListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.mo32836a(true);
        LogCatKt.m17045a().error(th);
    }
}
