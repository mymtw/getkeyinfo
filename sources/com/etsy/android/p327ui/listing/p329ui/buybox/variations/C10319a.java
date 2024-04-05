package com.etsy.android.p327ui.listing.p329ui.buybox.variations;

import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10334a;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.C10349a;
import java.util.Iterator;
import p466vc.C13574d;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.a */
public final class C10319a {
    /* renamed from: a */
    public static C13574d m18370a(ListingViewState.C10092d dVar) {
        Iterator it = dVar.mo33485m().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C10423j jVar = (C10423j) it.next();
            if ((jVar instanceof C10349a) || (jVar instanceof C10334a)) {
                break;
            }
            i++;
        }
        int i2 = i - 1;
        if (i2 == -1) {
            return C13574d.C13575a.f29662a;
        }
        if (i2 > 0) {
            i2--;
        }
        return new C13574d.C13576b.C13587k(i2);
    }
}
