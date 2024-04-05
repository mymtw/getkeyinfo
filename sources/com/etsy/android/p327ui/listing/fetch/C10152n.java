package com.etsy.android.p327ui.listing.fetch;

import com.etsy.android.lib.util.C8906j;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.listing.ListingViewState;
import java.util.HashMap;
import p466vc.C13574d;

/* renamed from: com.etsy.android.ui.listing.fetch.n */
public final class C10152n {
    /* renamed from: a */
    public static C13574d.C13575a m18274a(ListingViewState.C10092d dVar) {
        if (dVar.f22241i != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("what", "receive_offering_data");
            CrashUtil.m17307a().mo30460e(new C8906j.C8907a("view_listing", hashMap));
        }
        return C13574d.C13575a.f29662a;
    }
}
