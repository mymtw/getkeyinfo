package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C14637f3;
import com.google.android.gms.internal.measurement.C14650g3;
import com.google.android.gms.internal.measurement.C14656g9;
import com.google.android.gms.internal.measurement.C14663h3;
import com.google.android.gms.internal.measurement.C14676i3;
import com.google.android.gms.internal.measurement.C14714l2;
import com.google.android.gms.internal.measurement.C14727m2;
import com.google.android.gms.internal.measurement.C14740n2;
import com.google.android.gms.internal.measurement.C14753o2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p193o.C7494b;
import p193o.C7500h;

/* renamed from: com.google.android.gms.measurement.internal.n7 */
public final class C15045n7 {

    /* renamed from: a */
    public String f33710a;

    /* renamed from: b */
    public boolean f33711b;

    /* renamed from: c */
    public C14650g3 f33712c;

    /* renamed from: d */
    public BitSet f33713d;

    /* renamed from: e */
    public BitSet f33714e;

    /* renamed from: f */
    public Map<Integer, Long> f33715f;

    /* renamed from: g */
    public C7494b f33716g;

    /* renamed from: h */
    public final /* synthetic */ C15090s7 f33717h;

    public /* synthetic */ C15045n7(C15090s7 s7Var, String str) {
        this.f33717h = s7Var;
        this.f33710a = str;
        this.f33711b = true;
        this.f33713d = new BitSet();
        this.f33714e = new BitSet();
        this.f33715f = new C7494b();
        this.f33716g = new C7494b();
    }

    /* renamed from: a */
    public final C14727m2 mo52269a(int i) {
        ArrayList arrayList;
        List list;
        C14714l2 s = C14727m2.m23715s();
        if (s.f33059d) {
            s.mo50809j();
            s.f33059d = false;
        }
        C14727m2.m23717w((C14727m2) s.f33058c, i);
        boolean z = this.f33711b;
        if (s.f33059d) {
            s.mo50809j();
            s.f33059d = false;
        }
        C14727m2.m23720z((C14727m2) s.f33058c, z);
        C14650g3 g3Var = this.f33712c;
        if (g3Var != null) {
            if (s.f33059d) {
                s.mo50809j();
                s.f33059d = false;
            }
            C14727m2.m23719y((C14727m2) s.f33058c, g3Var);
        }
        C14637f3 w = C14650g3.m23587w();
        ArrayList E = C14991h7.m24377E(this.f33713d);
        if (w.f33059d) {
            w.mo50809j();
            w.f33059d = false;
        }
        C14650g3.m23581G((C14650g3) w.f33058c, E);
        ArrayList E2 = C14991h7.m24377E(this.f33714e);
        if (w.f33059d) {
            w.mo50809j();
            w.f33059d = false;
        }
        C14650g3.m23579E((C14650g3) w.f33058c, E2);
        Map<Integer, Long> map = this.f33715f;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            for (Integer intValue : this.f33715f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = this.f33715f.get(Integer.valueOf(intValue2));
                if (l != null) {
                    C14740n2 t = C14753o2.m23806t();
                    if (t.f33059d) {
                        t.mo50809j();
                        t.f33059d = false;
                    }
                    C14753o2.m23808v((C14753o2) t.f33058c, intValue2);
                    long longValue = l.longValue();
                    if (t.f33059d) {
                        t.mo50809j();
                        t.f33059d = false;
                    }
                    C14753o2.m23809w((C14753o2) t.f33058c, longValue);
                    arrayList.add((C14753o2) t.mo50807h());
                }
            }
        }
        if (arrayList != null) {
            if (w.f33059d) {
                w.mo50809j();
                w.f33059d = false;
            }
            C14650g3.m23583I((C14650g3) w.f33058c, arrayList);
        }
        C7494b bVar = this.f33716g;
        if (bVar == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(bVar.f16745d);
            Iterator it = ((C7500h.C7503c) this.f33716g.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                C14663h3 u = C14676i3.m23626u();
                int intValue3 = num.intValue();
                if (u.f33059d) {
                    u.mo50809j();
                    u.f33059d = false;
                }
                C14676i3.m23628x((C14676i3) u.f33058c, intValue3);
                List list2 = (List) this.f33716g.getOrDefault(num, null);
                if (list2 != null) {
                    Collections.sort(list2);
                    if (u.f33059d) {
                        u.mo50809j();
                        u.f33059d = false;
                    }
                    C14676i3.m23629y((C14676i3) u.f33058c, list2);
                }
                arrayList2.add((C14676i3) u.mo50807h());
            }
            list = arrayList2;
        }
        if (w.f33059d) {
            w.mo50809j();
            w.f33059d = false;
        }
        C14650g3.m23585K((C14650g3) w.f33058c, list);
        if (s.f33059d) {
            s.mo50809j();
            s.f33059d = false;
        }
        C14727m2.m23718x((C14727m2) s.f33058c, (C14650g3) w.mo50807h());
        return (C14727m2) s.mo50807h();
    }

    /* renamed from: b */
    public final void mo52270b(C15072q7 q7Var) {
        int a = q7Var.mo52287a();
        Boolean bool = q7Var.f33788c;
        if (bool != null) {
            this.f33714e.set(a, bool.booleanValue());
        }
        Boolean bool2 = q7Var.f33789d;
        if (bool2 != null) {
            this.f33713d.set(a, bool2.booleanValue());
        }
        if (q7Var.f33790e != null) {
            Map<Integer, Long> map = this.f33715f;
            Integer valueOf = Integer.valueOf(a);
            Long l = map.get(valueOf);
            long longValue = q7Var.f33790e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f33715f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (q7Var.f33791f != null) {
            C7494b bVar = this.f33716g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) bVar.getOrDefault(valueOf2, null);
            if (list == null) {
                list = new ArrayList();
                this.f33716g.put(valueOf2, list);
            }
            if (q7Var.mo52289c()) {
                list.clear();
            }
            C14656g9.m23603a();
            C14947d dVar = ((C15103u3) this.f33717h.f33681b).f33878h;
            String str = this.f33710a;
            C14950d2<Boolean> d2Var = C14959e2.f33391Y;
            if (dVar.mo51973p(str, d2Var) && q7Var.mo52288b()) {
                list.clear();
            }
            C14656g9.m23603a();
            if (((C15103u3) this.f33717h.f33681b).f33878h.mo51973p(this.f33710a, d2Var)) {
                Long valueOf3 = Long.valueOf(q7Var.f33791f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(q7Var.f33791f.longValue() / 1000));
        }
    }

    public C15045n7(C15090s7 s7Var, String str, C14650g3 g3Var, BitSet bitSet, BitSet bitSet2, C7494b bVar, C7494b bVar2) {
        this.f33717h = s7Var;
        this.f33710a = str;
        this.f33713d = bitSet;
        this.f33714e = bitSet2;
        this.f33715f = bVar;
        this.f33716g = new C7494b();
        Iterator it = ((C7500h.C7503c) bVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) bVar2.getOrDefault(num, null));
            this.f33716g.put(num, arrayList);
        }
        this.f33711b = false;
        this.f33712c = g3Var;
    }
}
