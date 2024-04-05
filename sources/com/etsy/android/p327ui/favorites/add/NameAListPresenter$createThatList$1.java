package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.stylekit.views.LoadingIndicatorView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.NameAListPresenter$createThatList$1 */
final class NameAListPresenter$createThatList$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ NameAListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NameAListPresenter$createThatList$1(NameAListPresenter nameAListPresenter) {
        super(1);
        this.this$0 = nameAListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.mo32741a(true);
        LogCatKt.m17045a().error(th);
        ViewExtensions.m12860d((LoadingIndicatorView) this.this$0.f21568a._$_findCachedViewById(R.id.name_list_loading));
    }
}
