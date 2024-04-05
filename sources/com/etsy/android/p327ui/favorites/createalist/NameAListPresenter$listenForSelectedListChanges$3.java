package com.etsy.android.p327ui.favorites.createalist;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.createalist.NameAListPresenter$listenForSelectedListChanges$3 */
final class NameAListPresenter$listenForSelectedListChanges$3 extends Lambda implements C19857l<C9826o, C19394m> {
    public final /* synthetic */ NameAListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameAListPresenter$listenForSelectedListChanges$3(NameAListPresenter nameAListPresenter) {
        super(1);
        this.this$0 = nameAListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9826o) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9826o oVar) {
        View view = this.this$0.f21676a.getView();
        C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.ui.favorites.createalist.NameAListView");
        NameAListView nameAListView = (NameAListView) view;
        C19383o.m32796f(oVar, "it");
        nameAListView.setViewState(new C9832r(oVar, oVar.f21723a != null ? 8 : 0));
    }
}
