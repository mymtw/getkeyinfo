package com.etsy.android.p327ui.cardview.clickhandlers;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.cardview.clickhandlers.C9130m;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.OrderTrackingKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ReceiptKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ge.C12790b;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.n */
public final class C9133n extends C13171a<C9130m> {

    /* renamed from: d */
    public final C8703p f20066d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9133n(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "viewAnalyticsTracker");
        this.f20066d = pVar;
    }

    /* renamed from: d */
    public final void mo31328c(C9130m mVar) {
        C19383o.m32797g(mVar, "data");
        if (mVar instanceof C9130m.C9131a) {
            C9130m.C9131a aVar = (C9130m.C9131a) mVar;
            long j = aVar.f20061a;
            this.f20066d.mo21333d("home_ppmodule_see_receipt", aVar.f20062b);
            Fragment a = mo45889a();
            if (a != null) {
                C12790b.m20430b(a, new ReceiptKey(C12790b.m20432d(a), Long.valueOf(j), (Long) null, false, (Bundle) null, 28, (DefaultConstructorMarker) null));
            }
        } else if (mVar instanceof C9130m.C9132b) {
            C9130m.C9132b bVar = (C9130m.C9132b) mVar;
            long j2 = bVar.f20063a;
            long j3 = bVar.f20064b;
            this.f20066d.mo21333d("home_ppmodule_view_tracking", bVar.f20065c);
            Fragment a2 = mo45889a();
            if (a2 != null) {
                C12790b.m20430b(a2, new OrderTrackingKey(C12790b.m20432d(a2), (String) null, new EtsyId(j2), new EtsyId(j3), (Bundle) null, 18, (DefaultConstructorMarker) null));
            }
        }
    }
}
