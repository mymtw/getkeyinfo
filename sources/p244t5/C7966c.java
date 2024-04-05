package p244t5;

import android.support.p013v4.media.C0072d;
import java.io.IOException;

/* renamed from: t5.c */
public abstract class C7966c extends C8018s1 implements C8032x0 {

    /* renamed from: b */
    public int f17445b;

    /* renamed from: c */
    public boolean f17446c = true;

    /* renamed from: d */
    public C7984h1 f17447d = null;

    public C7966c(boolean z, int i, C7984h1 h1Var) {
        if (h1Var instanceof C7980g1) {
            this.f17446c = true;
        } else {
            this.f17446c = z;
        }
        this.f17445b = i;
        if (!this.f17446c) {
            boolean z2 = h1Var.mo12996i() instanceof C8027v1;
        }
        this.f17447d = h1Var;
    }

    /* renamed from: q */
    public static C7966c m15971q(C7984h1 h1Var) {
        if (h1Var == null || (h1Var instanceof C7966c)) {
            return (C7966c) h1Var;
        }
        if (h1Var instanceof byte[]) {
            try {
                return m15971q(C8018s1.m16138m((byte[]) h1Var));
            } catch (IOException e) {
                StringBuilder h = C0072d.m201h("failed to construct tagged object from byte[]: ");
                h.append(e.getMessage());
                throw new IllegalArgumentException(h.toString());
            }
        } else {
            StringBuilder h2 = C0072d.m201h("unknown object in getInstance: ");
            h2.append(h1Var.getClass().getName());
            throw new IllegalArgumentException(h2.toString());
        }
    }

    /* renamed from: e */
    public final C8018s1 mo20527e() {
        return this;
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C7966c)) {
            return false;
        }
        C7966c cVar = (C7966c) s1Var;
        if (this.f17445b != cVar.f17445b || this.f17446c != cVar.f17446c) {
            return false;
        }
        C7984h1 h1Var = this.f17447d;
        return h1Var == null ? cVar.f17447d == null : h1Var.mo12996i().equals(cVar.f17447d.mo12996i());
    }

    public final int hashCode() {
        int i = this.f17445b;
        C7984h1 h1Var = this.f17447d;
        return h1Var != null ? i ^ h1Var.hashCode() : i;
    }

    /* renamed from: o */
    public final C8018s1 mo20521o() {
        return new C7992k0(this.f17446c, this.f17445b, this.f17447d);
    }

    /* renamed from: p */
    public final C8018s1 mo20522p() {
        return new C8026v0(this.f17446c, this.f17445b, this.f17447d);
    }

    /* renamed from: s */
    public final C8018s1 mo20528s() {
        C7984h1 h1Var = this.f17447d;
        if (h1Var != null) {
            return h1Var.mo12996i();
        }
        return null;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("[");
        h.append(this.f17445b);
        h.append("]");
        h.append(this.f17447d);
        return h.toString();
    }
}
