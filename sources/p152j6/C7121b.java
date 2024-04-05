package p152j6;

import android.support.p013v4.media.C0072d;
import com.google.android.play.core.appupdate.C15567i;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8012r;
import p244t5.C8018s1;
import p244t5.C8021t1;

/* renamed from: j6.b */
public final class C7121b extends C8005o1 {

    /* renamed from: b */
    public C8012r f15838b;

    /* renamed from: c */
    public C7999m1 f15839c;

    public C7121b(int i, byte[] bArr) {
        if (bArr != null) {
            this.f15838b = new C8012r(bArr);
            this.f15839c = new C7999m1((long) i);
            return;
        }
        throw new IllegalArgumentException("'seed' cannot be null");
    }

    public C7121b(C8021t1 t1Var) {
        if (t1Var.mo20525y() == 2) {
            this.f15838b = C8012r.m16120v(t1Var.mo20523q(0));
            this.f15839c = C7999m1.m16076q(t1Var.mo20523q(1));
            return;
        }
        StringBuilder h = C0072d.m201h("Bad sequence size: ");
        h.append(t1Var.mo20525y());
        throw new IllegalArgumentException(h.toString());
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(this.f15838b);
        iVar.mo55343b(this.f15839c);
        return new C7976f0(iVar);
    }
}
