package com.etsy.android.p327ui.home.tabs;

import androidx.lifecycle.C2895z;
import com.etsy.android.marketing.sweepstakes.SweepstakesBanner;
import com.etsy.android.util.C12059p;
import com.etsy.android.util.C12060q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.tabs.HomePagerViewModel$initSweepstakesAlertIfNeeded$2 */
public final class HomePagerViewModel$initSweepstakesAlertIfNeeded$2 extends Lambda implements C19857l<SweepstakesBanner, C19394m> {
    public final /* synthetic */ HomePagerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePagerViewModel$initSweepstakesAlertIfNeeded$2(HomePagerViewModel homePagerViewModel) {
        super(1);
        this.this$0 = homePagerViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SweepstakesBanner) obj);
        return C19394m.f43287a;
    }

    public final void invoke(SweepstakesBanner sweepstakesBanner) {
        C2895z<C12059p<SweepstakesBanner>> zVar = this.this$0.f22132r;
        C19383o.m32796f(sweepstakesBanner, "it");
        C12060q.m19870a(zVar, sweepstakesBanner);
        this.this$0.f22123i.f27883a.mo46761a().edit().putBoolean("reengageSweepsV1Shown", true).apply();
    }
}
