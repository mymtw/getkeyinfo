package com.etsy.android.p327ui.user.purchases;

import androidx.lifecycle.C2866i0;
import com.etsy.android.p327ui.user.purchases.C11639e;
import com.etsy.android.p327ui.user.purchases.module.C11666g;
import com.etsy.android.p327ui.user.purchases.module.C11667h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19327t;

/* renamed from: com.etsy.android.ui.user.purchases.u */
public final class C11679u extends C2866i0 {

    /* renamed from: b */
    public final PurchasesRepository f25877b;

    /* renamed from: c */
    public ArrayList f25878c = new ArrayList();

    /* renamed from: d */
    public int f25879d;

    /* renamed from: e */
    public int f25880e;

    public C11679u(PurchasesRepository purchasesRepository) {
        this.f25877b = purchasesRepository;
    }

    /* renamed from: b */
    public static ArrayList m19385b(C11639e.C11641b bVar, long j) {
        C11667h hVar;
        List<C11666g> list;
        if (bVar == null || (hVar = bVar.f25765a) == null || (list = hVar.f25832c) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (j == ((C11666g) next).f25822a) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C11639e.C11641b mo37790c() {
        ArrayList arrayList = this.f25878c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof C11639e.C11641b) {
                arrayList2.add(next);
            }
        }
        return (C11639e.C11641b) C19327t.m32640V0(arrayList2);
    }

    public final void onCleared() {
        this.f25880e = 0;
        super.onCleared();
    }
}
