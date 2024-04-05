package p244t5;

import com.google.android.play.core.appupdate.C15567i;
import p003a2.C0015b;

/* renamed from: t5.j1 */
public abstract class C7990j1 extends C8018s1 {

    /* renamed from: b */
    public C7959a f17476b;

    /* renamed from: c */
    public C7999m1 f17477c;

    /* renamed from: d */
    public C8018s1 f17478d;

    /* renamed from: e */
    public int f17479e;

    /* renamed from: f */
    public C8018s1 f17480f;

    public C7990j1(C15567i iVar) {
        int i = 0;
        C8018s1 q = m16035q(0, iVar);
        if (q instanceof C7959a) {
            this.f17476b = (C7959a) q;
            q = m16035q(1, iVar);
            i = 1;
        }
        if (q instanceof C7999m1) {
            this.f17477c = (C7999m1) q;
            i++;
            q = m16035q(i, iVar);
        }
        if (!(q instanceof C7966c)) {
            this.f17478d = q;
            i++;
            q = m16035q(i, iVar);
        }
        if (iVar.mo55344c() != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        } else if (q instanceof C7966c) {
            C7966c cVar = (C7966c) q;
            mo20547s(cVar.f17445b);
            this.f17480f = cVar.mo20528s();
        } else {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
    }

    /* renamed from: q */
    public static C8018s1 m16035q(int i, C15567i iVar) {
        if (iVar.mo55344c() > i) {
            return iVar.mo55342a(i).mo12996i();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        C8018s1 s1Var2;
        C7999m1 m1Var;
        C7959a aVar;
        if (!(s1Var instanceof C7990j1)) {
            return false;
        }
        if (this == s1Var) {
            return true;
        }
        C7990j1 j1Var = (C7990j1) s1Var;
        C7959a aVar2 = this.f17476b;
        if (aVar2 != null && ((aVar = j1Var.f17476b) == null || !aVar.equals(aVar2))) {
            return false;
        }
        C7999m1 m1Var2 = this.f17477c;
        if (m1Var2 != null && ((m1Var = j1Var.f17477c) == null || !m1Var.equals(m1Var2))) {
            return false;
        }
        C8018s1 s1Var3 = this.f17478d;
        if (s1Var3 == null || ((s1Var2 = j1Var.f17478d) != null && s1Var2.equals(s1Var3))) {
            return this.f17480f.equals(j1Var.f17480f);
        }
        return false;
    }

    public final int hashCode() {
        C7959a aVar = this.f17476b;
        int hashCode = aVar != null ? aVar.hashCode() : 0;
        C7999m1 m1Var = this.f17477c;
        if (m1Var != null) {
            hashCode ^= m1Var.hashCode();
        }
        C8018s1 s1Var = this.f17478d;
        if (s1Var != null) {
            hashCode ^= s1Var.hashCode();
        }
        return hashCode ^ this.f17480f.hashCode();
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return true;
    }

    /* renamed from: n */
    public int mo20509n() {
        return mo19527c().length;
    }

    /* renamed from: o */
    public final C8018s1 mo20521o() {
        return this instanceof C8016s ? this : new C8016s(this.f17476b, this.f17477c, this.f17478d, this.f17479e, this.f17480f);
    }

    /* renamed from: s */
    public final void mo20547s(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(C0015b.m88g("invalid encoding value: ", i));
        }
        this.f17479e = i;
    }

    public C7990j1(C7959a aVar, C7999m1 m1Var, C8018s1 s1Var, int i, C8018s1 s1Var2) {
        this.f17476b = aVar;
        this.f17477c = m1Var;
        this.f17478d = s1Var;
        mo20547s(i);
        s1Var2.getClass();
        this.f17480f = s1Var2;
    }
}
