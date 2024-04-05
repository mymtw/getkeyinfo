package com.etsy.android.p327ui.conversation.details;

import com.etsy.android.p327ui.conversation.details.models.MessageSource;
import com.etsy.android.p327ui.conversation.models.MessageType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import p354gc.C12766d;
import p354gc.C12767e;
import p354gc.C12778k;
import p354gc.C12783l;
import p354gc.C12784m;
import p568fn.C17782b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.conversation.details.i */
public final class C9527i {

    /* renamed from: com.etsy.android.ui.conversation.details.i$a */
    public static final class C9528a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C18263b.m30880z(Long.valueOf(((C12783l) t).f28249f), Long.valueOf(((C12783l) t2).f28249f));
        }
    }

    /* renamed from: a */
    public static final List<C12778k> m17909a(C12766d dVar, long j) {
        String str;
        Pair pair;
        C12766d dVar2 = dVar;
        List l1 = C19327t.m32656l1(dVar2.f28217b, new C9528a());
        C12783l lVar = (C12783l) C19327t.m32640V0(l1);
        if (lVar == null) {
            return EmptyList.INSTANCE;
        }
        C12778k.C12782d dVar3 = new C12778k.C12782d(lVar.f28252i);
        C12784m mVar = dVar2.f28216a.f28208b;
        String str2 = mVar.f28260b;
        String str3 = mVar.f28259a;
        Pair pair2 = new Pair(C19327t.m32638T0(l1), new C12767e.C12769b((C12783l) C19327t.m32638T0(l1)));
        boolean z = true;
        List subList = l1.subList(1, l1.size());
        List d0 = C17782b.m29864d0(pair2);
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            C12783l lVar2 = (C12783l) it.next();
            Pair pair3 = (Pair) C19327t.m32645a1(d0);
            Pair pair4 = new Pair((C12783l) pair3.component1(), (C12767e) pair3.component2());
            C12783l lVar3 = (C12783l) pair4.component1();
            Object obj = (C12767e) pair4.component2();
            String str4 = str3;
            Iterator it2 = it;
            if (Math.abs(lVar2.f28252i - lVar3.f28252i) <= ((long) 2) * ((long) 1000) * ((long) 60)) {
                if (lVar2.f28247d == lVar3.f28247d) {
                    if (obj instanceof C12767e.C12769b) {
                        obj = new C12767e.C12771d(lVar3);
                    } else if (obj instanceof C12767e.C12768a) {
                        obj = new C12767e.C12770c(lVar3);
                    }
                    pair = new Pair(new Pair(lVar3, obj), new Pair(lVar2, new C12767e.C12768a(lVar2)));
                    d0 = C19327t.m32651g1(C19327t.m32651g1(C19327t.m32635Q0(d0), (Pair) pair.component1()), (Pair) pair.component2());
                    str3 = str4;
                    it = it2;
                    z = true;
                }
            }
            pair = new Pair(pair4, new Pair(lVar2, new C12767e.C12769b(lVar2)));
            d0 = C19327t.m32651g1(C19327t.m32651g1(C19327t.m32635Q0(d0), (Pair) pair.component1()), (Pair) pair.component2());
            str3 = str4;
            it = it2;
            z = true;
        }
        String str5 = str3;
        boolean z2 = z;
        ArrayList v1 = C19327t.m32666v1(d0, z2 ? 1 : 0, z2);
        List d02 = C17782b.m29864d0(dVar3);
        Iterator it3 = v1.iterator();
        while (it3.hasNext()) {
            List list = (List) it3.next();
            if (list.size() == 2) {
                Pair pair5 = (Pair) list.get(0);
                C12783l lVar4 = (C12783l) pair5.component1();
                C12767e eVar = (C12767e) pair5.component2();
                C12783l lVar5 = (C12783l) ((Pair) list.get(1)).getFirst();
                str = str5;
                C12778k kVar = (C12778k) (j == lVar4.f28247d ? C9472xb52b2ff7.INSTANCE : (lVar4.f28257n == MessageSource.ORDER_HELP_REQUEST && lVar4.f28248e == MessageType.USER) ? C9473xb52b2ff8.INSTANCE : C9474xb52b2ff9.INSTANCE).invoke(lVar4, eVar, str2, str);
                d02 = Math.abs(lVar4.f28252i - lVar5.f28252i) >= (((long) 10) * ((long) 1000)) * ((long) 60) ? C19327t.m32651g1(C19327t.m32651g1(d02, kVar), new C12778k.C12782d(lVar5.f28252i)) : C19327t.m32651g1(d02, kVar);
            } else {
                str = str5;
                Pair pair6 = (Pair) list.get(0);
                C12783l lVar6 = (C12783l) pair6.component1();
                d02 = C19327t.m32651g1(d02, (C12778k) (lVar6.f28247d == j ? C9472xb52b2ff7.INSTANCE : (lVar6.f28257n == MessageSource.ORDER_HELP_REQUEST && lVar6.f28248e == MessageType.USER) ? C9473xb52b2ff8.INSTANCE : C9474xb52b2ff9.INSTANCE).invoke(lVar6, (C12767e) pair6.component2(), str2, str));
            }
            str5 = str;
        }
        return C19327t.m32653i1(d02);
    }
}
