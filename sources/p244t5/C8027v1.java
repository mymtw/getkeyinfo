package p244t5;

import android.support.p013v4.media.C0072d;
import com.google.android.play.core.appupdate.C15567i;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import p003a2.C0023f;
import p267v7.C8212a;

/* renamed from: t5.v1 */
public abstract class C8027v1 extends C8018s1 implements Iterable {

    /* renamed from: b */
    public Vector f17510b;

    /* renamed from: c */
    public boolean f17511c;

    public C8027v1() {
        this.f17510b = new Vector();
        this.f17511c = false;
    }

    public C8027v1(C15567i iVar, boolean z) {
        this.f17510b = new Vector();
        this.f17511c = false;
        for (int i = 0; i != iVar.mo55344c(); i++) {
            this.f17510b.addElement(iVar.mo55342a(i));
        }
        if (z) {
            mo20581w();
        }
    }

    public C8027v1(C8018s1 s1Var) {
        Vector vector = new Vector();
        this.f17510b = vector;
        this.f17511c = false;
        vector.addElement(s1Var);
    }

    public C8027v1(C7984h1[] h1VarArr) {
        this.f17510b = new Vector();
        this.f17511c = false;
        for (int i = 0; i != h1VarArr.length; i++) {
            this.f17510b.addElement(h1VarArr[i]);
        }
    }

    /* renamed from: q */
    public static C8027v1 m16171q(Object obj) {
        if (obj == null || (obj instanceof C8027v1)) {
            return (C8027v1) obj;
        }
        if (obj instanceof C8030w1) {
            return m16171q(((C8030w1) obj).mo12996i());
        }
        if (obj instanceof byte[]) {
            try {
                return m16171q(C8018s1.m16138m((byte[]) obj));
            } catch (IOException e) {
                StringBuilder h = C0072d.m201h("failed to construct set from byte[]: ");
                h.append(e.getMessage());
                throw new IllegalArgumentException(h.toString());
            }
        } else {
            if (obj instanceof C7984h1) {
                C8018s1 i = ((C7984h1) obj).mo12996i();
                if (i instanceof C8027v1) {
                    return (C8027v1) i;
                }
            }
            throw new IllegalArgumentException(C0023f.m108i(obj, C0072d.m201h("unknown object in getInstance: ")));
        }
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C8027v1)) {
            return false;
        }
        C8027v1 v1Var = (C8027v1) s1Var;
        if (mo20580v() != v1Var.mo20580v()) {
            return false;
        }
        Enumeration s = mo20578s();
        Enumeration s2 = v1Var.mo20578s();
        while (s.hasMoreElements()) {
            C7984h1 h1Var = (C7984h1) s.nextElement();
            if (h1Var == null) {
                h1Var = C8037z.f17524b;
            }
            C7984h1 h1Var2 = (C7984h1) s2.nextElement();
            if (h1Var2 == null) {
                h1Var2 = C8037z.f17524b;
            }
            C8018s1 i = h1Var.mo12996i();
            C8018s1 i2 = h1Var2.mo12996i();
            if (i != i2 && !i.equals(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Enumeration s = mo20578s();
        int v = mo20580v();
        while (s.hasMoreElements()) {
            Object obj = (C7984h1) s.nextElement();
            if (obj == null) {
                obj = C8037z.f17524b;
            }
            v = (v * 17) ^ obj.hashCode();
        }
        return v;
    }

    public final Iterator<C7984h1> iterator() {
        C7984h1[] h1VarArr = new C7984h1[mo20580v()];
        for (int i = 0; i != mo20580v(); i++) {
            h1VarArr[i] = (C7984h1) this.f17510b.elementAt(i);
        }
        return new C8212a.C8213a(h1VarArr);
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return true;
    }

    /* renamed from: o */
    public final C8018s1 mo20521o() {
        if (this.f17511c) {
            C7983h0 h0Var = new C7983h0();
            h0Var.f17510b = this.f17510b;
            return h0Var;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.f17510b.size(); i++) {
            vector.addElement(this.f17510b.elementAt(i));
        }
        C7983h0 h0Var2 = new C7983h0();
        h0Var2.f17510b = vector;
        h0Var2.mo20581w();
        return h0Var2;
    }

    /* renamed from: p */
    public final C8018s1 mo20522p() {
        C8023u0 u0Var = new C8023u0();
        u0Var.f17510b = this.f17510b;
        return u0Var;
    }

    /* renamed from: s */
    public final Enumeration mo20578s() {
        return this.f17510b.elements();
    }

    public final String toString() {
        return this.f17510b.toString();
    }

    /* renamed from: v */
    public final int mo20580v() {
        return this.f17510b.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if ((r13 & 255) < (r14 & 255)) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r11 == r7.length) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r11 == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        r4 = r15.f17510b.elementAt(r8);
        r6 = r15.f17510b;
        r6.setElementAt(r6.elementAt(r10), r8);
        r15.f17510b.setElementAt(r4, r10);
        r6 = true;
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        r8 = r10;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20581w() {
        /*
            r15 = this;
            java.lang.String r0 = "cannot encode object added to SET"
            java.lang.String r1 = "DER"
            boolean r2 = r15.f17511c
            if (r2 != 0) goto L_0x0090
            r2 = 1
            r15.f17511c = r2
            java.util.Vector r3 = r15.f17510b
            int r3 = r3.size()
            if (r3 <= r2) goto L_0x0090
            java.util.Vector r3 = r15.f17510b
            int r3 = r3.size()
            int r3 = r3 - r2
            r4 = r2
        L_0x001b:
            if (r4 == 0) goto L_0x0090
            java.util.Vector r4 = r15.f17510b
            r5 = 0
            java.lang.Object r4 = r4.elementAt(r5)
            t5.h1 r4 = (p244t5.C7984h1) r4
            t5.s1 r4 = r4.mo12996i()     // Catch:{ IOException -> 0x008a }
            byte[] r4 = r4.mo20561a(r1)     // Catch:{ IOException -> 0x008a }
            r7 = r4
            r4 = r5
            r6 = r4
            r8 = r6
        L_0x0032:
            if (r8 == r3) goto L_0x0087
            java.util.Vector r9 = r15.f17510b
            int r10 = r8 + 1
            java.lang.Object r9 = r9.elementAt(r10)
            t5.h1 r9 = (p244t5.C7984h1) r9
            t5.s1 r9 = r9.mo12996i()     // Catch:{ IOException -> 0x0081 }
            byte[] r9 = r9.mo20561a(r1)     // Catch:{ IOException -> 0x0081 }
            int r11 = r7.length
            int r12 = r9.length
            int r11 = java.lang.Math.min(r11, r12)
            r12 = r5
        L_0x004d:
            if (r12 == r11) goto L_0x005f
            byte r13 = r7[r12]
            byte r14 = r9[r12]
            if (r13 == r14) goto L_0x005c
            r11 = r13 & 255(0xff, float:3.57E-43)
            r12 = r14 & 255(0xff, float:3.57E-43)
            if (r11 >= r12) goto L_0x0064
            goto L_0x0062
        L_0x005c:
            int r12 = r12 + 1
            goto L_0x004d
        L_0x005f:
            int r12 = r7.length
            if (r11 != r12) goto L_0x0064
        L_0x0062:
            r11 = r2
            goto L_0x0065
        L_0x0064:
            r11 = r5
        L_0x0065:
            if (r11 == 0) goto L_0x0069
            r7 = r9
            goto L_0x007f
        L_0x0069:
            java.util.Vector r4 = r15.f17510b
            java.lang.Object r4 = r4.elementAt(r8)
            java.util.Vector r6 = r15.f17510b
            java.lang.Object r9 = r6.elementAt(r10)
            r6.setElementAt(r9, r8)
            java.util.Vector r6 = r15.f17510b
            r6.setElementAt(r4, r10)
            r6 = r2
            r4 = r8
        L_0x007f:
            r8 = r10
            goto L_0x0032
        L_0x0081:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x0087:
            r3 = r4
            r4 = r6
            goto L_0x001b
        L_0x008a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p244t5.C8027v1.mo20581w():void");
    }
}
