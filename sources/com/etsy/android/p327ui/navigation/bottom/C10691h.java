package com.etsy.android.p327ui.navigation.bottom;

import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C19318k;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import p287xp.C8339g;

/* renamed from: com.etsy.android.ui.navigation.bottom.h */
public final class C10691h<T, R> implements C8339g<Object[], R> {

    /* renamed from: b */
    public final /* synthetic */ BottomNavStateRepo f23576b;

    public C10691h(BottomNavStateRepo bottomNavStateRepo) {
        this.f23576b = bottomNavStateRepo;
    }

    public final Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        C19383o.m32798h(objArr, "it");
        List Q0 = C19318k.m32599Q0(objArr);
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(Q0));
        for (Object next : Q0) {
            if (next != null) {
                arrayList.add(next);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
        }
        int intValue = ((Number) arrayList.get(1)).intValue() + ((Number) arrayList.get(0)).intValue();
        this.f23576b.getClass();
        return BottomNavStateRepo.m18605b(intValue, 0);
    }
}
