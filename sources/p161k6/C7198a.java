package p161k6;

import android.support.p013v4.media.C0072d;
import com.google.android.play.core.appupdate.C15567i;
import java.util.Enumeration;
import p244t5.C7976f0;
import p244t5.C8005o1;
import p244t5.C8012r;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: k6.a */
public final class C7198a extends C8005o1 {

    /* renamed from: b */
    public C7199b f15981b;

    /* renamed from: c */
    public C8012r f15982c;

    public C7198a(C7199b bVar, C8005o1 o1Var) {
        this.f15982c = new C8012r(o1Var);
        this.f15981b = bVar;
    }

    public C7198a(C7199b bVar, byte[] bArr) {
        this.f15982c = new C8012r(bArr);
        this.f15981b = bVar;
    }

    public C7198a(C8021t1 t1Var) {
        if (t1Var.mo20525y() == 2) {
            Enumeration w = t1Var.mo20524w();
            this.f15981b = C7199b.m13865e(w.nextElement());
            this.f15982c = C8012r.m16120v(w.nextElement());
            return;
        }
        StringBuilder h = C0072d.m201h("Bad sequence size: ");
        h.append(t1Var.mo20525y());
        throw new IllegalArgumentException(h.toString());
    }

    /* renamed from: e */
    public static C7198a m13862e(Object obj) {
        if (obj instanceof C7198a) {
            return (C7198a) obj;
        }
        if (obj != null) {
            return new C7198a(C8021t1.m16151s(obj));
        }
        return null;
    }

    /* renamed from: g */
    public final C8018s1 mo19494g() {
        return C8018s1.m16138m(this.f15982c.mo20593q());
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f15981b);
        iVar.mo55343b(this.f15982c);
        return new C7976f0(iVar);
    }
}
