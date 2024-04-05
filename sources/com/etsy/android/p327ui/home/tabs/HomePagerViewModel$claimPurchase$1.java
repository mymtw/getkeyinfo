package com.etsy.android.p327ui.home.tabs;

import com.etsy.android.util.C12060q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p428qc.C13286d;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.tabs.HomePagerViewModel$claimPurchase$1 */
public final class HomePagerViewModel$claimPurchase$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ HomePagerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePagerViewModel$claimPurchase$1(HomePagerViewModel homePagerViewModel) {
        super(1);
        this.this$0 = homePagerViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        HomePagerViewModel homePagerViewModel = this.this$0;
        C12060q.m19870a(homePagerViewModel.f22134t, HomePagerViewModel.m18208b(homePagerViewModel, false));
        this.this$0.f22120f.f29197a.onNext(C13286d.C13287a.f29192a);
    }
}
