package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.n0 */
public final class C1350n0 {

    /* renamed from: a */
    public final List<C1297b0> f2942a;

    /* renamed from: b */
    public final int f2943b;

    /* renamed from: c */
    public int f2944c;

    /* renamed from: d */
    public final ArrayList f2945d;

    /* renamed from: e */
    public final HashMap<Integer, C1417v> f2946e;

    /* renamed from: f */
    public final C19285c f2947f;

    public C1350n0(int i, ArrayList arrayList) {
        this.f2942a = arrayList;
        this.f2943b = i;
        if (i >= 0) {
            this.f2945d = new ArrayList();
            HashMap<Integer, C1417v> hashMap = new HashMap<>();
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C1297b0 b0Var = this.f2942a.get(i3);
                hashMap.put(Integer.valueOf(b0Var.f2803c), new C1417v(i3, i2, b0Var.f2804d));
                i2 += b0Var.f2804d;
            }
            this.f2946e = hashMap;
            this.f2947f = C19350d.m32677b(new Pending$keyMap$2(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    /* renamed from: a */
    public final int mo5896a(C1297b0 b0Var) {
        C19383o.m32797g(b0Var, "keyInfo");
        C1417v vVar = this.f2946e.get(Integer.valueOf(b0Var.f2803c));
        if (vVar != null) {
            return vVar.f3076b;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean mo5897b(int i, int i2) {
        int i3;
        C1417v vVar = this.f2946e.get(Integer.valueOf(i));
        if (vVar == null) {
            return false;
        }
        int i4 = vVar.f3076b;
        int i5 = i2 - vVar.f3077c;
        vVar.f3077c = i2;
        if (i5 == 0) {
            return true;
        }
        Collection<C1417v> values = this.f2946e.values();
        C19383o.m32796f(values, "groupInfos.values");
        for (C1417v vVar2 : values) {
            if (vVar2.f3076b >= i4 && !C19383o.m32792b(vVar2, vVar) && (i3 = vVar2.f3076b + i5) >= 0) {
                vVar2.f3076b = i3;
            }
        }
        return true;
    }
}
