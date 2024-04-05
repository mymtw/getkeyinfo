package com.etsy.android.lib.util;

import com.etsy.android.lib.models.Country;
import com.etsy.android.p327ui.cart.MultiShopCartFragment;
import java.util.ArrayList;
import java.util.HashSet;
import p193o.C7507j;

/* renamed from: com.etsy.android.lib.util.h */
public final class C8902h {

    /* renamed from: a */
    public static final Object f19658a = new Object();

    /* renamed from: b */
    public static C7507j<Country> f19659b = new C7507j<>();

    /* renamed from: com.etsy.android.lib.util.h$a */
    public interface C8903a {
        /* renamed from: a */
        void mo30490a();

        /* renamed from: b */
        void mo30491b(ArrayList<Country> arrayList);
    }

    /* renamed from: com.etsy.android.lib.util.h$b */
    public static class C8904b {

        /* renamed from: a */
        public final C8903a f19660a;

        public C8904b(MultiShopCartFragment.C9236b bVar) {
            this.f19660a = bVar;
        }
    }

    static {
        new HashSet();
    }

    /* renamed from: a */
    public static ArrayList<Country> m17339a() {
        ArrayList<Country> arrayList;
        synchronized (f19658a) {
            arrayList = new ArrayList<>();
            for (int i = 0; i < f19659b.mo19995i(); i++) {
                arrayList.add(f19659b.mo19996j(i));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Country m17340b(Integer num) {
        return (Country) f19659b.mo19993f(num.intValue(), (Integer) null);
    }
}
