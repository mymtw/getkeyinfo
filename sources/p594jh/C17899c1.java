package p594jh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p595ji.C18001m;

/* renamed from: jh.c1 */
public final class C17899c1 extends C17882a {

    /* renamed from: f */
    public final int f38870f;

    /* renamed from: g */
    public final int f38871g;

    /* renamed from: h */
    public final int[] f38872h;

    /* renamed from: i */
    public final int[] f38873i;

    /* renamed from: j */
    public final C17939k1[] f38874j;

    /* renamed from: k */
    public final Object[] f38875k;

    /* renamed from: l */
    public final HashMap<Object, Integer> f38876l = new HashMap<>();

    public C17899c1(List list, C18001m mVar) {
        super(mVar);
        int size = list.size();
        this.f38872h = new int[size];
        this.f38873i = new int[size];
        this.f38874j = new C17939k1[size];
        this.f38875k = new Object[size];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C17974u0 u0Var = (C17974u0) it.next();
            this.f38874j[i3] = u0Var.mo69395b();
            this.f38873i[i3] = i;
            this.f38872h[i3] = i2;
            i += this.f38874j[i3].mo47701o();
            i2 += this.f38874j[i3].mo47700h();
            this.f38875k[i3] = u0Var.mo69394a();
            this.f38876l.put(this.f38875k[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f38870f = i;
        this.f38871g = i2;
    }

    /* renamed from: h */
    public final int mo47700h() {
        return this.f38871g;
    }

    /* renamed from: o */
    public final int mo47701o() {
        return this.f38870f;
    }
}
