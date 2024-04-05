package p125h3;

import java.util.ArrayList;
import java.util.List;
import p214q3.C7718a;
import p214q3.C7720c;
import p772tq.C20203a;

/* renamed from: h3.a */
public abstract class C6928a<K, A> {

    /* renamed from: a */
    public final ArrayList f15349a = new ArrayList(1);

    /* renamed from: b */
    public boolean f15350b = false;

    /* renamed from: c */
    public final List<? extends C7718a<K>> f15351c;

    /* renamed from: d */
    public float f15352d = 0.0f;

    /* renamed from: e */
    public C7720c<A> f15353e;

    /* renamed from: f */
    public C7718a<K> f15354f;

    /* renamed from: g */
    public C7718a<K> f15355g;

    /* renamed from: h */
    public float f15356h = -1.0f;

    /* renamed from: i */
    public A f15357i = null;

    /* renamed from: j */
    public float f15358j = -1.0f;

    /* renamed from: k */
    public float f15359k = -1.0f;

    /* renamed from: h3.a$a */
    public interface C6929a {
        /* renamed from: a */
        void mo14602a();
    }

    public C6928a(List<? extends C7718a<K>> list) {
        this.f15351c = list;
    }

    /* renamed from: a */
    public final void mo19077a(C6929a aVar) {
        this.f15349a.add(aVar);
    }

    /* renamed from: b */
    public final C7718a<K> mo19078b() {
        boolean z;
        C7718a<K> aVar = this.f15354f;
        if (aVar != null) {
            float f = this.f15352d;
            if (f >= aVar.mo20190b() && f < aVar.mo20189a()) {
                C20203a.m34518A();
                return this.f15354f;
            }
        }
        List<? extends C7718a<K>> list = this.f15351c;
        C7718a<K> aVar2 = (C7718a) list.get(list.size() - 1);
        if (this.f15352d < aVar2.mo20190b()) {
            int size = this.f15351c.size();
            do {
                size--;
                if (size < 0) {
                    break;
                }
                aVar2 = (C7718a) this.f15351c.get(size);
                float f2 = this.f15352d;
                if (f2 < aVar2.mo20190b() || f2 >= aVar2.mo20189a()) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
            } while (!z);
        }
        this.f15354f = aVar2;
        C20203a.m34518A();
        return aVar2;
    }

    /* renamed from: c */
    public float mo19079c() {
        float f;
        if (this.f15359k == -1.0f) {
            if (this.f15351c.isEmpty()) {
                f = 1.0f;
            } else {
                List<? extends C7718a<K>> list = this.f15351c;
                f = ((C7718a) list.get(list.size() - 1)).mo20189a();
            }
            this.f15359k = f;
        }
        return this.f15359k;
    }

    /* renamed from: d */
    public final float mo19080d() {
        C7718a b = mo19078b();
        if (b.mo20191c()) {
            return 0.0f;
        }
        return b.f17116d.getInterpolation(mo19081e());
    }

    /* renamed from: e */
    public final float mo19081e() {
        if (this.f15350b) {
            return 0.0f;
        }
        C7718a b = mo19078b();
        if (b.mo20191c()) {
            return 0.0f;
        }
        return (this.f15352d - b.mo20190b()) / (b.mo20189a() - b.mo20190b());
    }

    /* renamed from: f */
    public final float mo19082f() {
        if (this.f15358j == -1.0f) {
            this.f15358j = this.f15351c.isEmpty() ? 0.0f : ((C7718a) this.f15351c.get(0)).mo20190b();
        }
        return this.f15358j;
    }

    /* renamed from: g */
    public A mo19083g() {
        C7718a<K> b = mo19078b();
        float d = mo19080d();
        if (this.f15353e == null && b == this.f15355g && this.f15356h == d) {
            return this.f15357i;
        }
        this.f15355g = b;
        this.f15356h = d;
        A h = mo19084h(b, d);
        this.f15357i = h;
        return h;
    }

    /* renamed from: h */
    public abstract A mo19084h(C7718a<K> aVar, float f);

    /* renamed from: i */
    public void mo19085i() {
        for (int i = 0; i < this.f15349a.size(); i++) {
            ((C6929a) this.f15349a.get(i)).mo14602a();
        }
    }

    /* renamed from: j */
    public void mo19086j(float f) {
        if (!this.f15351c.isEmpty()) {
            C7718a b = mo19078b();
            if (f < mo19082f()) {
                f = mo19082f();
            } else if (f > mo19079c()) {
                f = mo19079c();
            }
            if (f != this.f15352d) {
                this.f15352d = f;
                C7718a b2 = mo19078b();
                if (b != b2 || !b2.mo20191c()) {
                    mo19085i();
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo19087k(C7720c<A> cVar) {
        C7720c<A> cVar2 = this.f15353e;
        if (cVar2 != null) {
            cVar2.getClass();
        }
        this.f15353e = cVar;
    }
}
