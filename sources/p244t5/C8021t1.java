package p244t5;

import android.support.p013v4.media.C0072d;
import com.google.android.play.core.appupdate.C15567i;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import p003a2.C0023f;
import p267v7.C8212a;

/* renamed from: t5.t1 */
public abstract class C8021t1 extends C8018s1 implements Iterable {

    /* renamed from: b */
    public Vector f17505b = new Vector();

    public C8021t1() {
    }

    public C8021t1(C15567i iVar) {
        for (int i = 0; i != iVar.mo55344c(); i++) {
            this.f17505b.addElement(iVar.mo55342a(i));
        }
    }

    public C8021t1(C7984h1[] h1VarArr) {
        for (int i = 0; i != h1VarArr.length; i++) {
            this.f17505b.addElement(h1VarArr[i]);
        }
    }

    /* renamed from: s */
    public static C8021t1 m16151s(Object obj) {
        if (obj == null || (obj instanceof C8021t1)) {
            return (C8021t1) obj;
        }
        if (obj instanceof C8024u1) {
            return m16151s(((C8024u1) obj).mo12996i());
        }
        if (obj instanceof byte[]) {
            try {
                return m16151s(C8018s1.m16138m((byte[]) obj));
            } catch (IOException e) {
                StringBuilder h = C0072d.m201h("failed to construct sequence from byte[]: ");
                h.append(e.getMessage());
                throw new IllegalArgumentException(h.toString());
            }
        } else {
            if (obj instanceof C7984h1) {
                C8018s1 i = ((C7984h1) obj).mo12996i();
                if (i instanceof C8021t1) {
                    return (C8021t1) i;
                }
            }
            throw new IllegalArgumentException(C0023f.m108i(obj, C0072d.m201h("unknown object in getInstance: ")));
        }
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C8021t1)) {
            return false;
        }
        C8021t1 t1Var = (C8021t1) s1Var;
        if (mo20525y() != t1Var.mo20525y()) {
            return false;
        }
        Enumeration w = mo20524w();
        Enumeration w2 = t1Var.mo20524w();
        while (w.hasMoreElements()) {
            C8018s1 i = ((C7984h1) w.nextElement()).mo12996i();
            C8018s1 i2 = ((C7984h1) w2.nextElement()).mo12996i();
            if (i != i2 && !i.equals(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Enumeration w = mo20524w();
        int y = mo20525y();
        while (w.hasMoreElements()) {
            y = (y * 17) ^ ((C7984h1) w.nextElement()).hashCode();
        }
        return y;
    }

    public final Iterator<C7984h1> iterator() {
        return new C8212a.C8213a(mo20574v());
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return true;
    }

    /* renamed from: o */
    public C8018s1 mo20521o() {
        C7976f0 f0Var = new C7976f0();
        f0Var.f17505b = this.f17505b;
        return f0Var;
    }

    /* renamed from: p */
    public C8018s1 mo20522p() {
        C8020t0 t0Var = new C8020t0();
        t0Var.f17505b = this.f17505b;
        return t0Var;
    }

    /* renamed from: q */
    public C7984h1 mo20523q(int i) {
        return (C7984h1) this.f17505b.elementAt(i);
    }

    public final String toString() {
        return this.f17505b.toString();
    }

    /* renamed from: v */
    public final C7984h1[] mo20574v() {
        C7984h1[] h1VarArr = new C7984h1[mo20525y()];
        for (int i = 0; i != mo20525y(); i++) {
            h1VarArr[i] = mo20523q(i);
        }
        return h1VarArr;
    }

    /* renamed from: w */
    public Enumeration mo20524w() {
        return this.f17505b.elements();
    }

    /* renamed from: y */
    public int mo20525y() {
        return this.f17505b.size();
    }
}
