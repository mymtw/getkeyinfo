package p128h6;

import androidx.preference.C3039b;
import java.util.Enumeration;
import kotlin.jvm.internal.C19388s;
import p140i6.C6995a;
import p244t5.C7976f0;
import p244t5.C7980g1;
import p244t5.C7984h1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;
import p244t5.C8027v1;

/* renamed from: h6.c */
public final class C6957c extends C8005o1 implements C7980g1 {

    /* renamed from: f */
    public static C6995a f15436f = C6995a.f15535f;

    /* renamed from: b */
    public boolean f15437b;

    /* renamed from: c */
    public int f15438c;

    /* renamed from: d */
    public C3039b f15439d;

    /* renamed from: e */
    public C6956b[] f15440e;

    public C6957c(C3039b bVar, C8021t1 t1Var) {
        this.f15439d = bVar;
        this.f15440e = new C6956b[t1Var.mo20525y()];
        Enumeration w = t1Var.mo20524w();
        int i = 0;
        while (w.hasMoreElements()) {
            C6956b[] bVarArr = this.f15440e;
            int i2 = i + 1;
            Object nextElement = w.nextElement();
            bVarArr[i] = nextElement instanceof C6956b ? (C6956b) nextElement : nextElement != null ? new C6956b(C8027v1.m16171q(nextElement)) : null;
            i = i2;
        }
    }

    public C6957c(C8021t1 t1Var) {
        this(f15436f, t1Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6957c) && !(obj instanceof C8021t1)) {
            return false;
        }
        if (mo12996i().equals(((C7984h1) obj).mo12996i())) {
            return true;
        }
        try {
            C3039b bVar = this.f15439d;
            C6957c cVar = new C6957c(C8021t1.m16151s(((C7984h1) obj).mo12996i()));
            bVar.getClass();
            return C3039b.m7185t(this, cVar);
        } catch (Exception unused) {
            return false;
        }
    }

    public final int hashCode() {
        if (this.f15437b) {
            return this.f15438c;
        }
        this.f15437b = true;
        this.f15439d.getClass();
        C6956b[] bVarArr = this.f15440e;
        int length = bVarArr.length;
        C6956b[] bVarArr2 = new C6956b[length];
        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
        int i = 0;
        for (int i2 = 0; i2 != length; i2++) {
            if (bVarArr2[i2].mo19115g()) {
                C6955a[] m = bVarArr2[i2].mo19117m();
                for (int i3 = 0; i3 != m.length; i3++) {
                    i = (i ^ m[i3].f15433b.hashCode()) ^ C19388s.m32817E(m[i3].f15434c).hashCode();
                }
            } else {
                i = (i ^ bVarArr2[i2].mo19116l().f15433b.hashCode()) ^ C19388s.m32817E(bVarArr2[i2].mo19116l().f15434c).hashCode();
            }
        }
        this.f15438c = i;
        return i;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        return new C7976f0((C7984h1[]) this.f15440e);
    }

    public final String toString() {
        return this.f15439d.mo11179K(this);
    }
}
