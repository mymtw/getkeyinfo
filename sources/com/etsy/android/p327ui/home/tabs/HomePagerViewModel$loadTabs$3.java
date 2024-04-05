package com.etsy.android.p327ui.home.tabs;

import com.etsy.android.lib.config.bucketing.C8617e;
import com.etsy.android.p327ui.home.etsylens.C9973d;
import com.etsy.android.p327ui.home.tabs.C10062k;
import com.etsy.android.p327ui.home.tabs.C10070p;
import com.etsy.android.util.C12060q;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.tabs.HomePagerViewModel$loadTabs$3 */
public final class HomePagerViewModel$loadTabs$3 extends Lambda implements C19857l<C10062k, C19394m> {
    public final /* synthetic */ HomePagerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePagerViewModel$loadTabs$3(HomePagerViewModel homePagerViewModel) {
        super(1);
        this.this$0 = homePagerViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10062k) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10062k kVar) {
        if (kVar instanceof C10062k.C10064b) {
            C10062k.C10064b bVar = (C10062k.C10064b) kVar;
            boolean z = true;
            if (!bVar.f22181a.isEmpty()) {
                this.this$0.f22128n.setValue(new C10070p.C10073c(bVar.f22181a));
                HomePagerViewModel homePagerViewModel = this.this$0;
                if (homePagerViewModel.f22139y) {
                    C9973d dVar = homePagerViewModel.f22127m;
                    if (!dVar.f21958a.getAnalyticsTracker().mo21331a(C8617e.f18938g).f18927b || !dVar.f21958a.getAnalyticsTracker().mo21331a(C8617e.f18939h).f18927b || !dVar.f21959b.mo46761a().getBoolean("etsy_lens_onboarding_alert_pref_key", true)) {
                        z = false;
                    }
                    if (z) {
                        homePagerViewModel.f22139y = false;
                        C12060q.m19870a(homePagerViewModel.f22136v, C19394m.f43287a);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.this$0.f22128n.setValue(C10070p.C10071a.f22200a);
    }
}
