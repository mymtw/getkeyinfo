package p152j6;

import android.support.p013v4.media.C0072d;
import p244t5.C7959a;
import p244t5.C7980g1;
import p244t5.C7984h1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8037z;

/* renamed from: j6.d */
public final class C7146d extends C8005o1 implements C7980g1 {

    /* renamed from: b */
    public C8018s1 f15866b;

    public C7146d(C7148f fVar) {
        this.f15866b = null;
        this.f15866b = fVar.mo12996i();
    }

    public C7146d(C7959a aVar) {
        this.f15866b = aVar;
    }

    public C7146d(C8018s1 s1Var) {
        this.f15866b = s1Var;
    }

    public C7146d(C8037z zVar) {
        this.f15866b = zVar;
    }

    /* renamed from: e */
    public static C7146d m13814e(C7984h1 h1Var) {
        if (h1Var == null || (h1Var instanceof C7146d)) {
            return (C7146d) h1Var;
        }
        if (h1Var instanceof C8018s1) {
            return new C7146d((C8018s1) h1Var);
        }
        if (h1Var instanceof byte[]) {
            try {
                return new C7146d(C8018s1.m16138m((byte[]) h1Var));
            } catch (Exception e) {
                StringBuilder h = C0072d.m201h("unable to parse encoded data: ");
                h.append(e.getMessage());
                throw new IllegalArgumentException(h.toString());
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        return this.f15866b;
    }
}
