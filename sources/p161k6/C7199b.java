package p161k6;

import android.support.p013v4.media.C0072d;
import com.google.android.play.core.appupdate.C15567i;
import p244t5.C7959a;
import p244t5.C7976f0;
import p244t5.C7984h1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: k6.b */
public final class C7199b extends C8005o1 {

    /* renamed from: b */
    public C7959a f15983b;

    /* renamed from: c */
    public C7984h1 f15984c;

    public C7199b(C7959a aVar) {
        this.f15983b = aVar;
    }

    public C7199b(C7959a aVar, C7984h1 h1Var) {
        this.f15983b = aVar;
        this.f15984c = h1Var;
    }

    public C7199b(C8021t1 t1Var) {
        if (t1Var.mo20525y() < 1 || t1Var.mo20525y() > 2) {
            StringBuilder h = C0072d.m201h("Bad sequence size: ");
            h.append(t1Var.mo20525y());
            throw new IllegalArgumentException(h.toString());
        }
        this.f15983b = C7959a.m15938q(t1Var.mo20523q(0));
        this.f15984c = t1Var.mo20525y() == 2 ? t1Var.mo20523q(1) : null;
    }

    /* renamed from: e */
    public static C7199b m13865e(Object obj) {
        if (obj instanceof C7199b) {
            return (C7199b) obj;
        }
        if (obj != null) {
            return new C7199b(C8021t1.m16151s(obj));
        }
        return null;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f15983b);
        C7984h1 h1Var = this.f15984c;
        if (h1Var != null) {
            iVar.mo55343b(h1Var);
        }
        return new C7976f0(iVar);
    }
}
