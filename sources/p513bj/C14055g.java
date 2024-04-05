package p513bj;

import android.util.SparseBooleanArray;

/* renamed from: bj.g */
public final class C14055g {

    /* renamed from: a */
    public final SparseBooleanArray f30931a;

    /* renamed from: bj.g$a */
    public static final class C14056a {

        /* renamed from: a */
        public final SparseBooleanArray f30932a = new SparseBooleanArray();

        /* renamed from: b */
        public boolean f30933b;

        /* renamed from: a */
        public final void mo46878a(int i) {
            C14075p.m21694f(!this.f30933b);
            this.f30932a.append(i, true);
        }

        /* renamed from: b */
        public final C14055g mo46879b() {
            C14075p.m21694f(!this.f30933b);
            this.f30933b = true;
            return new C14055g(this.f30932a);
        }
    }

    public C14055g(SparseBooleanArray sparseBooleanArray) {
        this.f30931a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final int mo46874a(int i) {
        C14075p.m21693e(i, mo46875b());
        return this.f30931a.keyAt(i);
    }

    /* renamed from: b */
    public final int mo46875b() {
        return this.f30931a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14055g)) {
            return false;
        }
        return this.f30931a.equals(((C14055g) obj).f30931a);
    }

    public final int hashCode() {
        return this.f30931a.hashCode();
    }
}
