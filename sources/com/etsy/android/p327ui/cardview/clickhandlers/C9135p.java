package com.etsy.android.p327ui.cardview.clickhandlers;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.user.review.C11714m;
import com.etsy.android.p327ui.user.review.C11756y;
import com.etsy.android.p327ui.user.review.ReviewTrackingSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p370ie.C12942b;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.p */
public final class C9135p extends C13171a<C11756y> {

    /* renamed from: d */
    public final ReviewTrackingSource f20067d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9135p(Fragment fragment, C8703p pVar, ReviewTrackingSource reviewTrackingSource) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "viewTracker");
        C19383o.m32797g(reviewTrackingSource, "trackingSource");
        this.f20067d = reviewTrackingSource;
    }

    /* renamed from: d */
    public final void mo31328c(C11756y yVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C19383o.m32797g(yVar, "data");
        Fragment a = mo45889a();
        if (a != null) {
            Integer num = null;
            C11714m mVar = a instanceof C11714m ? (C11714m) a : null;
            if (mVar != null) {
                String c0 = C19421p.m32935c0(a.getActivity());
                EtsyId etsyId = new EtsyId(yVar.mo37997a());
                List<Long> b = yVar.mo37998b();
                if (b != null) {
                    long a2 = yVar.mo37997a();
                    if (this.f28980b.f19116n.mo21132b(C8592b.C8595c.f18860d)) {
                        arrayList2 = new ArrayList();
                        Iterator<Long> it = b.iterator();
                        if (it.hasNext()) {
                            it.next().longValue();
                            Iterator<Long> it2 = b.iterator();
                            int i = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                if (it2.next().longValue() == a2) {
                                    break;
                                }
                                i++;
                            }
                            int size = b.size();
                            for (int i2 = i; i2 < size; i2++) {
                                arrayList2.add(new EtsyId(b.get(i2).longValue()));
                            }
                            for (int i3 = 0; i3 < i; i3++) {
                                arrayList2.add(new EtsyId(b.get(i3).longValue()));
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                ReviewTrackingSource reviewTrackingSource = this.f20067d;
                if (yVar instanceof C11756y.C11758b) {
                    num = Integer.valueOf(((C11756y.C11758b) yVar).f26200e);
                }
                mVar.launchReviewFlow(new C12942b(c0, etsyId, arrayList, reviewTrackingSource, num, (Bundle) null, 32));
            }
        }
    }
}
