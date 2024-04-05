package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.o */
public final class C14750o extends C14685j {

    /* renamed from: d */
    public final ArrayList f33012d;

    /* renamed from: e */
    public final ArrayList f33013e;

    /* renamed from: f */
    public C14598c3 f33014f;

    public C14750o(C14750o oVar) {
        super(oVar.f32890b);
        ArrayList arrayList = new ArrayList(oVar.f33012d.size());
        this.f33012d = arrayList;
        arrayList.addAll(oVar.f33012d);
        ArrayList arrayList2 = new ArrayList(oVar.f33013e.size());
        this.f33013e = arrayList2;
        arrayList2.addAll(oVar.f33013e);
        this.f33014f = oVar.f33014f;
    }

    /* renamed from: b */
    public final C14763p mo50553b(C14598c3 c3Var, List<C14763p> list) {
        C14598c3 b = this.f33014f.mo50399b();
        for (int i = 0; i < this.f33012d.size(); i++) {
            if (i < list.size()) {
                b.mo50403f((String) this.f33012d.get(i), c3Var.mo50400c(list.get(i)));
            } else {
                b.mo50403f((String) this.f33012d.get(i), C14763p.f33033g0);
            }
        }
        Iterator it = this.f33013e.iterator();
        while (it.hasNext()) {
            C14763p pVar = (C14763p) it.next();
            C14763p c = b.mo50400c(pVar);
            if (c instanceof C14776q) {
                c = b.mo50400c(pVar);
            }
            if (c instanceof C14659h) {
                return ((C14659h) c).f32857b;
            }
        }
        return C14763p.f33033g0;
    }

    public final C14763p zzd() {
        return new C14750o(this);
    }

    public C14750o(String str, ArrayList arrayList, List list, C14598c3 c3Var) {
        super(str);
        this.f33012d = new ArrayList();
        this.f33014f = c3Var;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f33012d.add(((C14763p) it.next()).zzi());
            }
        }
        this.f33013e = new ArrayList(list);
    }
}
