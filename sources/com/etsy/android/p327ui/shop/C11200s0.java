package com.etsy.android.p327ui.shop;

import com.etsy.android.lib.models.interfaces.ListingLike;
import java.util.ArrayList;
import java.util.List;
import p634np.C18290b;

/* renamed from: com.etsy.android.ui.shop.s0 */
public final class C11200s0 implements C18290b {
    @SafeVarargs
    /* renamed from: a */
    public static ArrayList m19143a(List... listArr) {
        ArrayList arrayList = new ArrayList();
        for (List list : listArr) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((ListingLike) list.get(i)).getListingId().getId());
            }
        }
        return arrayList;
    }
}
